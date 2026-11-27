package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public abstract class jj {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static id A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747031, null));
        id idVar = alertDialog$Builder.a;
        idVar.U = S2;
        int i = aob.L5;
        alertDialog$Builder.l(2131624120, 72, aob.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.j(ob6.M0(2131747027, null), new oe(activity, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
        return idVar;
    }

    public static id B(Activity activity, boolean z, TLRPC.User user, df7 df7Var, vnb vnbVar) {
        int i;
        int i2;
        int w0;
        boolean z2;
        int[] iArr = new int[1];
        String[] strArr = {ob6.M0(2131745345, null), ob6.M0(2131745344, null), ob6.M0(2131745343, null), ob6.M0(2131745342, null)};
        LinearLayout m = bs2.m(activity, 1);
        m.setPadding(0, 0, 0, hl.L(4.0f));
        TextView textView = new TextView(activity);
        if (z) {
            textView.setText(ob6.M0(2131748598, null));
        } else if (user != null) {
            textView.setText(ob6.a0(null, null, 2131748595, lbc.k(user, true)));
        } else {
            textView.setText(ob6.M0(2131748596, null));
        }
        yob.X(textView, aob.j5, vnbVar);
        textView.setTextSize(1, 16.0f);
        int i3 = 3;
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 48);
        if (ob6.a0) {
            i3 = 5;
        }
        int i4 = i3 | 48;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        m.addView(textView, tre.t(-2, -2, i4, 24, i2, 24, 8));
        for (int i5 = 0; i5 < 4; i5++) {
            j29 j29Var = new j29(activity, vnbVar);
            j29Var.d = (byte) 42;
            j29Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            j29Var.setTag(Integer.valueOf(i5));
            a(j29Var, aob.g7, aob.E5, vnbVar);
            String str = strArr[i5];
            if (iArr[0] == i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            j29Var.b(str, z2);
            m.addView(j29Var);
            j29Var.setOnClickListener(new nf(iArr, m));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        id idVar = alertDialog$Builder.a;
        if (z) {
            idVar.S = ob6.M0(2131748597, null);
        } else {
            int i6 = aob.L5;
            if (vnbVar != null) {
                w0 = vnbVar.f(i6);
            } else {
                w0 = aob.w0(null, i6, false);
            }
            idVar.c0 = new oea(activity, 0);
            idVar.d0 = w0;
            idVar.e0 = -1;
            if (vnbVar == null) {
                alertDialog$Builder.m(i6, null);
            }
        }
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(ob6.M0(2131745187, null), new o(iArr, df7Var, (byte) 7));
        alertDialog$Builder.h(ob6.M0(2131752570, null), null);
        return idVar;
    }

    public static nx0 C(final long j, final long j2, final vnb vnbVar, final e eVar) {
        if (eVar.getParentActivity() == null) {
            return null;
        }
        nx0 i = ik8.i(eVar.getParentActivity(), false, 1, vnbVar);
        i.P = ob6.M0(2131747651, null);
        i.Q = true;
        CharSequence[] charSequenceArr = {ob6.a0("MuteFor", null, 2131748066, ob6.G(1, "Hours", new Object[0])), ob6.a0("MuteFor", null, 2131748066, ob6.G(8, "Hours", new Object[0])), ob6.a0("MuteFor", null, 2131748066, ob6.G(2, "Days", new Object[0])), ob6.M0(2131748067, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3;
                if (i2 == 0) {
                    i3 = 0;
                } else {
                    int i4 = 1;
                    if (i2 != 1) {
                        i4 = 2;
                        if (i2 != 2) {
                            i4 = 3;
                        }
                    }
                    i3 = i4;
                }
                ip7.n(yac.t0).T(j, i3, j2);
                e eVar2 = eVar;
                if (d31.a(eVar2)) {
                    d31.z(eVar2, i3, 0, vnbVar).j();
                }
            }
        };
        i.M = charSequenceArr;
        i.L = onClickListener;
        return i;
    }

    public static void D(Context context, vnb vnbVar, hj hjVar) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (context == null) {
            return;
        }
        int i = aob.j5;
        if (vnbVar != null) {
            w0 = vnbVar.f(i);
            w02 = vnbVar.f(aob.h5);
            vnbVar.f(aob.Aj);
            vnbVar.f(aob.Ej);
            vnbVar.f(aob.E8);
            vnbVar.f(aob.G8);
            vnbVar.f(aob.i6);
            w03 = vnbVar.f(aob.Ji);
            w04 = vnbVar.f(aob.Fi);
            w05 = vnbVar.f(aob.Hi);
        } else {
            w0 = aob.w0(null, i, false);
            w02 = aob.w0(null, aob.h5, false);
            aob.w0(null, aob.Aj, false);
            aob.w0(null, aob.Ej, false);
            aob.w0(null, aob.E8, false);
            aob.w0(null, aob.G8, false);
            aob.w0(null, aob.i6, false);
            w03 = aob.w0(null, aob.Ji, false);
            w04 = aob.w0(null, aob.Fi, false);
            w05 = aob.w0(null, aob.Hi, false);
        }
        int i2 = w04;
        int i3 = w05;
        z8d z8dVar = new z8d(context, vnbVar);
        ((nx0) z8dVar.b).w0 = false;
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        wi wiVar = new wi(context, vnbVar, iArr);
        wiVar.setMinValue(0);
        wiVar.setMaxValue(20);
        wiVar.setTextColor(w0);
        wiVar.setValue(0);
        wiVar.setFormatter(new pg(iArr, (byte) 1));
        ri riVar = new ri(context, wiVar, (byte) 1);
        riVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        riVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131748064, null));
        textView.setTextColor(w0);
        bs2.t(textView, 1, 20.0f);
        frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new q8((byte) 13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        riVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        xb xbVar = new xb(context, (byte) 6);
        linearLayout.addView(wiVar, tre.l(1.0f, 0, 270));
        wiVar.setOnValueChangedListener(new bg((byte) 18));
        xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(w03);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(hl.o());
        int L = hl.L(8.0f);
        xbVar.setBackgroundDrawable(aob.i0(L, L, L, L, i2, i3, i3));
        xbVar.setText(ob6.M0(2131753859, null));
        riVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new cg(iArr, wiVar, hjVar, z8dVar, (byte) 2));
        nx0 nx0Var = (nx0) z8dVar.b;
        nx0Var.O = riVar;
        nx0Var.show();
        nx0Var.s0(w02);
        nx0Var.K(w02);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        HashMap hashMap = new HashMap();
        int i = aob.L5;
        hashMap.put("info1", Integer.valueOf(aob.w0(null, i, false)));
        hashMap.put("info2", Integer.valueOf(aob.w0(null, i, false)));
        alertDialog$Builder.l(2131624108, 52, aob.w0(null, i, false), hashMap);
        alertDialog$Builder.m(i, null);
        idVar.X = true;
        alertDialog$Builder.j(ob6.M0(2131752006, null), null);
        idVar.U = str2;
        return alertDialog$Builder;
    }

    public static id F(Activity activity, long j, final long j2, int i, final Runnable runnable, vnb vnbVar) {
        int i2;
        int i3;
        char c;
        CharSequence[] charSequenceArr;
        boolean z;
        final long j3 = j;
        final int i4 = i;
        final SharedPreferences sharedPreferences = uc7.s1(yac.t0).W3;
        final int[] iArr = new int[1];
        if (j3 != 0) {
            i3 = 0;
            int i5 = sharedPreferences.getInt("priority_" + j3, 3);
            iArr[0] = i5;
            if (i5 == 3) {
                iArr[0] = 0;
            } else if (i5 == 4) {
                iArr[0] = 1;
            } else if (i5 == 5) {
                iArr[0] = 2;
            } else if (i5 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            charSequenceArr = new String[]{ob6.M0(2131747607, null), ob6.M0(2131747609, null), ob6.M0(2131747608, null), ob6.M0(2131747610, null), ob6.M0(2131747606, null)};
            i2 = 1;
        } else {
            i2 = 1;
            i3 = 0;
            if (i4 == 1) {
                iArr[0] = sharedPreferences.getInt("priority_messages", 1);
            } else if (i4 == 0) {
                iArr[0] = sharedPreferences.getInt("priority_group", 1);
            } else if (i4 == 2) {
                iArr[0] = sharedPreferences.getInt("priority_channel", 1);
            } else if (i4 == 3) {
                iArr[0] = sharedPreferences.getInt("priority_stories", 1);
            } else if (i4 == 4 || i4 == 5) {
                iArr[0] = sharedPreferences.getInt("priority_react", 1);
            }
            int i6 = iArr[0];
            if (i6 == 4) {
                iArr[0] = 0;
            } else if (i6 == 5) {
                iArr[0] = 1;
            } else {
                c = 2;
                if (i6 == 0) {
                    iArr[0] = 2;
                } else {
                    iArr[0] = 3;
                }
                CharSequence[] charSequenceArr2 = new String[4];
                charSequenceArr2[0] = ob6.M0(2131747609, null);
                charSequenceArr2[1] = ob6.M0(2131747608, null);
                charSequenceArr2[c] = ob6.M0(2131747610, null);
                charSequenceArr2[3] = ob6.M0(2131747606, null);
                charSequenceArr = charSequenceArr2;
            }
            c = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = ob6.M0(2131747609, null);
            charSequenceArr22[1] = ob6.M0(2131747608, null);
            charSequenceArr22[c] = ob6.M0(2131747610, null);
            charSequenceArr22[3] = ob6.M0(2131747606, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout m = bs2.m(activity, i2);
        int i7 = i3;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i7, vnbVar, activity);
        int i8 = i7;
        while (i8 < charSequenceArr.length) {
            j29 j29Var = new j29(activity, vnbVar);
            j29Var.setPadding(hl.L(4.0f), i7, hl.L(4.0f), i7);
            j29Var.setTag(Integer.valueOf(i8));
            a(j29Var, aob.g7, aob.E5, vnbVar);
            CharSequence charSequence = charSequenceArr[i8];
            if (iArr[i7] == i8) {
                z = 1;
            } else {
                z = i7;
            }
            j29Var.b(charSequence, z);
            m.addView(j29Var);
            j29Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i9;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i10 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = uc7.s1(yac.t0).W3.edit();
                    long j4 = j3;
                    if (j4 != 0) {
                        int i11 = iArr2[0];
                        if (i11 == 0) {
                            i10 = 3;
                        } else if (i11 == 1) {
                            i10 = 4;
                        } else if (i11 == 2) {
                            i10 = 5;
                        } else if (i11 != 3) {
                            i10 = 1;
                        }
                        edit.putInt("priority_" + j4, i10);
                        ip7.n(yac.t0).f(j4, j2);
                    } else {
                        int i12 = iArr2[0];
                        if (i12 == 0) {
                            i9 = 4;
                        } else if (i12 == 1) {
                            i9 = 5;
                        } else if (i12 == 2) {
                            i9 = 0;
                        } else {
                            i9 = 1;
                        }
                        int i13 = i4;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        if (i13 == 1) {
                            edit.putInt("priority_messages", i9);
                            iArr2[0] = sharedPreferences2.getInt("priority_messages", 1);
                        } else if (i13 == 0) {
                            edit.putInt("priority_group", i9);
                            iArr2[0] = sharedPreferences2.getInt("priority_group", 1);
                        } else if (i13 == 2) {
                            edit.putInt("priority_channel", i9);
                            iArr2[0] = sharedPreferences2.getInt("priority_channel", 1);
                        } else if (i13 == 3) {
                            edit.putInt("priority_stories", i9);
                            iArr2[0] = sharedPreferences2.getInt("priority_stories", 1);
                        } else if (i13 == 4 || i13 == 5) {
                            edit.putInt("priority_react", i9);
                            iArr2[0] = sharedPreferences2.getInt("priority_react", 1);
                        }
                        ip7.n(yac.t0).g(i13);
                    }
                    edit.commit();
                    alertDialog$Builder.a.M0.run();
                    runnable.run();
                }
            });
            i8++;
            j3 = j;
            i4 = i;
            i7 = i7;
        }
        String M0 = ob6.M0(2131747633, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(ob6.M0(2131752570, null), null);
        return idVar;
    }

    public static void G(int i, long j, x53 x53Var, Context context, TLRPC.Photo photo) {
        if (context != null) {
            ng ngVar = new ng(i, j, x53Var, context, photo);
            nx0 nx0Var = new nx0(1, (vnb) x53Var, context, true);
            nx0Var.J();
            nx0Var.P = ob6.M0(2131745939, null);
            nx0Var.Q = true;
            og ogVar = new og(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, context, x53Var, ngVar, (byte) 0);
            nx0Var.M = new CharSequence[]{ob6.M0(2131745948, null), ob6.M0(2131745954, null), ob6.M0(2131745947, null), ob6.M0(2131745956, null), ob6.M0(2131745953, null), ob6.M0(2131745951, null), ob6.M0(2131745950, null), ob6.M0(2131745952, null)};
            nx0Var.N = new int[]{2131232100, 2131232340, 2131232343, 2131232073, 2131232339, 2131232342, 2131232344, 2131232341};
            nx0Var.L = ogVar;
            nx0Var.show();
        }
    }

    public static z8d H(final Context context, final long j, long j2, int i, boolean z, final hj hjVar, Runnable runnable, gj gjVar, vnb vnbVar) {
        int i2;
        ViewGroup viewGroup;
        Context context2;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        boolean[] zArr;
        hq7 hq7Var;
        long j3;
        int i3;
        s7 s7Var;
        boolean[] zArr2;
        int[] iArr;
        String[] strArr;
        TextView textView;
        Calendar calendar;
        boolean[] zArr3;
        int i4;
        int i5;
        ViewGroup viewGroup2;
        String[] strArr2;
        int[] iArr2;
        s7 s7Var2;
        TextView textView2;
        TextView textView3;
        o97 o97Var;
        nx0 nx0Var;
        final s7 s7Var3;
        int i6;
        View view;
        TLRPC.User X1;
        TLRPC.UserStatus userStatus;
        int i7;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i};
        long e = yac.h(yac.t0).e();
        final z8d z8dVar = new z8d(context, vnbVar);
        ((nx0) z8dVar.b).w0 = false;
        hq7 hq7Var2 = new hq7(context, vnbVar);
        int i8 = gjVar.a;
        int i9 = gjVar.c;
        int i10 = gjVar.b;
        hq7Var2.setTextColor(i8);
        hq7Var2.setTextOffset(hl.L(10.0f));
        hq7Var2.setItemCount(5);
        final ?? hq7Var3 = new hq7(context, vnbVar);
        hq7Var3.setWrapSelectorWheel(true);
        hq7Var3.setAllItemsCount(24);
        hq7Var3.setItemCount(5);
        hq7Var3.setTextColor(i8);
        hq7Var3.setTextOffset(-hl.L(10.0f));
        final ?? hq7Var4 = new hq7(context, vnbVar);
        hq7Var4.setWrapSelectorWheel(true);
        hq7Var4.setAllItemsCount(60);
        hq7Var4.setItemCount(5);
        hq7Var4.setTextColor(i8);
        hq7Var4.setTextOffset(-hl.L(34.0f));
        ?? frameLayout3 = new FrameLayout(context);
        ?? aiVar = new ai(context, hq7Var2, hq7Var3, hq7Var4, (byte) 1);
        aiVar.setClipToPadding(false);
        aiVar.setClipChildren(false);
        aiVar.setOrientation(1);
        frameLayout3.addView(aiVar, tre.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        aiVar.addView(frameLayout5, tre.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView4 = new TextView(context);
        if (j == e) {
            i2 = 0;
            textView4.setText(ob6.M0(2131745242, null));
        } else {
            i2 = 0;
            textView4.setText(ob6.M0(2131745587, null));
        }
        textView4.setTextColor(i8);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(hl.o());
        frameLayout5.addView(textView4, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView4.setOnTouchListener(new q8((byte) 12));
        boolean[] zArr4 = new boolean[1];
        zArr4[i2] = true;
        if (!wf3.D(j) || j == e || (X1 = uc7.s1(yac.t0).X1(Long.valueOf(j))) == null || X1.bot || (userStatus = X1.status) == null || userStatus.expires <= 0) {
            viewGroup = aiVar;
            context2 = context;
            frameLayout = frameLayout5;
            frameLayout2 = frameLayout4;
            zArr = zArr4;
            hq7Var = hq7Var2;
            j3 = e;
            i3 = -1;
            s7Var = null;
        } else {
            String k = lbc.k(X1, true);
            if (k.length() > 10) {
                i7 = i2;
                k = k.substring(i7, 10).concat("…");
            } else {
                i7 = i2;
            }
            String str = k;
            frameLayout2 = frameLayout4;
            zArr = zArr4;
            viewGroup = aiVar;
            hq7Var = hq7Var2;
            j3 = e;
            i3 = -1;
            s7 s7Var4 = new s7(context, null, 0, gjVar.a, false, vnbVar);
            context2 = context;
            s7Var4.setLongClickEnabled(i7);
            s7Var4.setSubMenuOpenSide(2);
            s7Var4.setIcon(2131231247);
            s7Var4.setBackground(aob.f0(i9, 1, -1));
            frameLayout = frameLayout5;
            frameLayout.addView(s7Var4, tre.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            s7Var4.g(1, ob6.a0(null, null, 2131745578, str));
            s7Var4.setContentDescription(ob6.M0(2131754834, null));
            s7Var = s7Var4;
        }
        if (s7Var != null) {
            s7Var.setOnClickListener(new t(s7Var, gjVar, (byte) 13));
            zArr2 = zArr;
            s7Var.setDelegate(new ie(hjVar, zArr2, z8dVar, (byte) 0));
        } else {
            zArr2 = zArr;
        }
        ?? imageView = new ImageView(context2);
        final b29 b29Var = new b29(2131624109, hl.L(24.0f), hl.L(24.0f), true, null);
        b29Var.E(true);
        b29Var.h = true;
        b29Var.start();
        b29Var.H(40);
        b29Var.K(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(b29Var);
        imageView.setColorFilter(new PorterDuffColorFilter(i8, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(aob.f0(i9, 1, i3));
        frameLayout.addView(imageView, tre.d(40, 40.0f, 53, 0.0f, 8.0f, (s7Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        ViewGroup viewGroup3 = viewGroup;
        viewGroup3.addView((View) linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final xb xbVar = new xb(context2, (byte) 1);
        linearLayout.addView(hq7Var, tre.l(0.5f, 0, 270));
        hq7Var.setMinValue(0);
        hq7Var.setMaxValue(365);
        hq7Var.setWrapSelectorWheel(false);
        hq7Var.setFormatter(new e((byte) 18));
        final hq7 hq7Var5 = hq7Var;
        final long j4 = j3;
        fq7 fq7Var = new fq7() {
            @Override
            public final void i(hq7 hq7Var6, int i11) {
                int i12;
                if (j4 == j) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                jj.g(xb.this, null, 0L, 0L, i12, hq7Var5, hq7Var3, hq7Var4);
            }
        };
        hq7Var5.setOnValueChangedListener(fq7Var);
        hq7Var3.setMinValue(0);
        hq7Var3.setMaxValue(23);
        linearLayout.addView(hq7Var3, tre.l(0.2f, 0, 270));
        hq7Var3.setFormatter(new e((byte) 20));
        hq7Var3.setOnValueChangedListener(fq7Var);
        hq7Var4.setMinValue(0);
        hq7Var4.setMaxValue(59);
        hq7Var4.setValue(0);
        hq7Var4.setFormatter(new e((byte) 21));
        linearLayout.addView(hq7Var4, tre.l(0.3f, 0, 270));
        hq7Var4.setOnValueChangedListener(fq7Var);
        if (j2 > 0 && j2 != 2147483646) {
            long j5 = 1000 * j2;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j5 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j5);
            if (timeInMillis >= 0) {
                hq7Var4.setValue(calendar2.get(12));
                hq7Var3.setValue(calendar2.get(11));
                hq7Var5 = hq7Var5;
                hq7Var5.setValue(timeInMillis);
            } else {
                hq7Var5 = hq7Var5;
            }
        }
        final boolean[] zArr5 = {true};
        g(xbVar, null, 0L, 0L, j4 == j ? 1 : 0, hq7Var5, hq7Var3, hq7Var4);
        if (ConnectionsManager.getInstance(yac.t0).isTestBackend()) {
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
            strArr = new String[]{ob6.M0(2131748254, null), "Every minute", "Every 5 minutes", ob6.M0(2131748256, null), ob6.M0(2131748253, null), ob6.M0(2131748257, null), ob6.M0(2131748255, null), ob6.M0(2131748259, null), ob6.M0(2131748258, null), ob6.M0(2131748252, null)};
            textView = null;
        } else {
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
            textView = null;
            strArr = new String[]{ob6.M0(2131748254, null), ob6.M0(2131748256, null), ob6.M0(2131748253, null), ob6.M0(2131748257, null), ob6.M0(2131748255, null), ob6.M0(2131748259, null), ob6.M0(2131748258, null), ob6.M0(2131748252, null)};
        }
        if (z) {
            calendar = calendar2;
            zArr3 = zArr2;
            i4 = i10;
            i5 = 0;
            viewGroup2 = viewGroup3;
            strArr2 = strArr;
            iArr2 = iArr;
            s7Var2 = s7Var;
            textView2 = textView;
            textView3 = textView2;
            o97Var = textView3;
        } else {
            ?? frameLayout6 = new FrameLayout(context2);
            int v = aob.v(i10, aob.p1(0.075f, i8));
            String[] strArr3 = strArr;
            int p1 = aob.p1(0.1f, i8);
            zArr3 = zArr2;
            textView3 = new TextView(context2);
            int[] iArr4 = iArr;
            calendar = calendar2;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(i8);
            i5 = 0;
            textView3.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
            int L = hl.L(14.0f);
            int v2 = aob.v(v, p1);
            textView3.setBackground(aob.i0(L, L, L, L, v, v2, v2));
            textView3.setGravity(17);
            i4 = i10;
            strArr2 = strArr3;
            o97 o97Var2 = new o97(iArr4, iArr3, strArr2, textView3, (byte) 6);
            iArr2 = iArr4;
            o97Var2.run();
            frameLayout6.addView(textView3, tre.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ViewGroup viewGroup4 = viewGroup3;
            viewGroup4.addView((View) frameLayout6, tre.o(-1, -2));
            s7Var2 = s7Var;
            o97Var = o97Var2;
            textView2 = frameLayout6;
            viewGroup2 = viewGroup4;
        }
        xbVar.setPadding(hl.L(34.0f), i5, hl.L(34.0f), i5);
        xbVar.setGravity(17);
        xbVar.setTextColor(gjVar.g);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(hl.o());
        int i11 = gjVar.h;
        float[] fArr = new float[1];
        fArr[i5] = 24.0f;
        xbVar.setBackground(rnb.e(i11, fArr));
        viewGroup2.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
        int i12 = i4;
        final Calendar calendar3 = calendar;
        final boolean[] zArr6 = zArr3;
        xbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i13;
                zArr5[0] = false;
                if (j4 == j) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                hq7 hq7Var6 = hq7Var5;
                di diVar = hq7Var3;
                ei eiVar = hq7Var4;
                boolean g = jj.g(null, null, 0L, 0L, i13, hq7Var6, diVar, eiVar);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, hq7Var6.getValue());
                calendar4.set(11, diVar.getValue());
                calendar4.set(12, eiVar.getValue());
                if (g) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                boolean z2 = zArr6[0];
                hjVar.y((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], z2);
                ((nx0) z8dVar.b).y0.run();
            }
        });
        nx0 nx0Var2 = (nx0) z8dVar.b;
        nx0Var2.O = frameLayout3;
        nx0Var2.show();
        nx0Var2.setOnDismissListener(new wf(runnable, zArr5));
        nx0Var2.s0(i12);
        nx0Var2.K(i12);
        if (textView3 != null) {
            String[] strArr4 = strArr2;
            s7Var3 = s7Var2;
            i6 = 1;
            view = imageView;
            nx0Var = nx0Var2;
            textView3.setOnClickListener(new yg(frameLayout2, vnbVar, nx0Var, (FrameLayout) textView2, iArr2, strArr4, iArr3, (o97) o97Var));
        } else {
            nx0Var = nx0Var2;
            s7Var3 = s7Var2;
            i6 = 1;
            view = imageView;
        }
        final kg5[] kg5VarArr = new kg5[i6];
        final nx0 nx0Var3 = nx0Var;
        final boolean[] zArr7 = zArr3;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i13;
                String M0;
                int i14;
                int i15;
                int i16;
                int i17;
                boolean[] zArr8 = zArr7;
                boolean z2 = zArr8[0];
                zArr8[0] = !z2;
                b29 b29Var2 = b29Var;
                int i18 = b29Var2.b0;
                if (!z2) {
                    if (i18 >= 40) {
                        b29Var2.H(0);
                    }
                    b29Var2.K(40);
                    b29Var2.start();
                } else {
                    if (i18 < 40) {
                        b29Var2.H(40);
                    }
                    b29Var2.K(80);
                    b29Var2.start();
                }
                kg5[] kg5VarArr2 = kg5VarArr;
                kg5 kg5Var = kg5VarArr2[0];
                if (kg5Var != null) {
                    kg5Var.f(true);
                    kg5VarArr2[0] = null;
                }
                uc7 s1 = uc7.s1(yac.t0);
                long j6 = j;
                TLRPC.User X12 = s1.X1(Long.valueOf(j6));
                TLRPC.Chat M02 = uc7.s1(yac.t0).M0(Long.valueOf(-j6));
                kg5 kg5Var2 = new kg5(context, 3);
                kg5VarArr2[0] = kg5Var2;
                kg5Var2.r();
                kg5Var2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                kg5Var2.q(20.0f);
                kg5Var2.s(hl.L(12.0f), hl.L(4.0f), aob.p1(0.25f, -16777216));
                if (xc2.V(M02)) {
                    if (zArr8[0]) {
                        i17 = 2131745582;
                    } else {
                        i17 = 2131745586;
                    }
                    M0 = ob6.M0(i17, null);
                } else if (M02 == null && X12 != null) {
                    if (j6 == j4) {
                        if (zArr8[0]) {
                            i15 = 2131745579;
                        } else {
                            i15 = 2131745583;
                        }
                        M0 = ob6.M0(i15, null);
                    } else {
                        if (zArr8[0]) {
                            i14 = 2131745581;
                        } else {
                            i14 = 2131745585;
                        }
                        M0 = ob6.a0(null, null, i14, lbc.l(X12));
                    }
                } else {
                    if (zArr8[0]) {
                        i13 = 2131745580;
                    } else {
                        i13 = 2131745584;
                    }
                    M0 = ob6.M0(i13, null);
                }
                kg5Var2.t(M0);
                kg5Var2.d = 5000L;
                if (s7Var3 != null) {
                    i16 = 42;
                } else {
                    i16 = -8;
                }
                kg5Var2.n(1.0f, -(i16 + 20));
                kg5Var2.r0 = new ug(kg5Var2, (byte) 0);
                nx0 nx0Var4 = nx0Var3;
                nx0Var4.b.setClipToPadding(false);
                nx0Var4.b.setClipChildren(false);
                nx0Var4.b.addView(kg5Var2, tre.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                kg5Var2.v();
            }
        });
        return z8dVar;
    }

    public static void I(Context context, long j, hj hjVar) {
        H(context, j, -1L, 0, false, hjVar, null, new gj(null), null);
    }

    public static void J(Context context, long j, hj hjVar, vnb vnbVar) {
        H(context, j, -1L, 0, false, hjVar, null, new gj(vnbVar), vnbVar);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, vnb vnbVar) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        if (str == null) {
            str = ob6.M0(2131689472, null);
        }
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = str2;
        if (str3 == null) {
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(str3, new td(runnable, (byte) 3));
        return alertDialog$Builder;
    }

    public static id M(Context context, vnb vnbVar, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = charSequence;
        alertDialog$Builder.j(str2, new td(runnable, (byte) 4));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        return idVar;
    }

    public static n8 N(e eVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f, float f2) {
        if (view != null) {
            n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            n8Var.e = true;
            n8Var.c = (short) 220;
            n8Var.setOutsideTouchable(true);
            n8Var.setClippingEnabled(true);
            n8Var.setAnimationStyle(2131755192);
            n8Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE));
            n8Var.setInputMethodMode(2);
            n8Var.getContentView().setFocusableInTouchMode(true);
            float f3 = 0.0f;
            View view2 = view;
            float f4 = 0.0f;
            while (view2 != view.getRootView()) {
                f3 += view2.getX();
                f4 += view2.getY();
                view2 = (View) view2.getParent();
                if (view2 == null) {
                    break;
                }
            }
            n8Var.showAtLocation(view.getRootView(), 0, (int) ((f3 + f) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f4 + f2) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            n8Var.b();
            return n8Var;
        }
        return null;
    }

    public static void O(Context context, e eVar, String str, String str2, String str3, String str4, int i, String str5, vnb vnbVar, hf7 hf7Var) {
        View view;
        Activity W = hl.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        id[] idVarArr = new id[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i2 = aob.j5;
        yob.X(editTextBoldCursor, i2, vnbVar);
        yob.D(editTextBoldCursor, aob.Oi, vnbVar);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(hl.L(16.0f), hl.L(11.0f), hl.L(16.0f), hl.L(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(aob.q6, vnbVar);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new af(editTextBoldCursor, i, hf7Var, idVarArr, view, (byte) 0));
        editTextBoldCursor.addTextChangedListener(new gi(i, editTextBoldCursor));
        ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.p1(0.06f, aob.v0(i2, vnbVar)));
        uob K = yob.K(0.06f, i2);
        editTextBoldCursor.setBackground(b0);
        yob.j(editTextBoldCursor, b0, K, null, vnbVar);
        LinearLayout j = uh9.j(context, 1);
        j.addView((View) editTextBoldCursor, tre.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(j);
        idVar.a = Math.min(hl.L(320.0f), (hl.q.x * 85) / 100);
        alertDialog$Builder.j(str5, new bf((Object) editTextBoldCursor, i, hf7Var, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new e((byte) 19));
        idVarArr[0] = idVar;
        if (eVar != null) {
            hl.U2(W, eVar.getClassGuid());
        }
        id idVar2 = idVarArr[0];
        idVar2.k0 = false;
        idVar2.setOnDismissListener(new cf(editTextBoldCursor, eVar, W, (byte) 0));
        idVarArr[0].setOnShowListener(new df(editTextBoldCursor, (byte) 0));
        idVarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void P(Context context, e eVar, vnb vnbVar, hf7 hf7Var) {
        O(context, eVar, ob6.M0(2131744456, null), ob6.M0(2131744463, null), ob6.M0(2131744437, null), null, 12, ob6.M0(2131751718, null), vnbVar, hf7Var);
    }

    public static z8d Q(Context context, long j, final hj hjVar, vnb vnbVar, int i) {
        int i2;
        final int i3;
        int i4;
        int i5;
        int i6;
        int w0 = aob.w0(null, aob.j5, false);
        int w02 = aob.w0(null, aob.h5, false);
        aob.w0(null, aob.Aj, false);
        aob.w0(null, aob.Ej, false);
        aob.w0(null, aob.E8, false);
        aob.w0(null, aob.G8, false);
        int i7 = aob.i6;
        aob.w0(null, i7, false);
        int w03 = aob.w0(null, aob.Ji, false);
        int w04 = aob.w0(null, aob.Fi, false);
        aob.w0(null, aob.Hi, false);
        if (context == null) {
            return null;
        }
        final z8d z8dVar = new z8d(context, vnbVar);
        ((nx0) z8dVar.b).w0 = false;
        final hq7 hq7Var = new hq7(context, vnbVar);
        hq7Var.setTextColor(w0);
        hq7Var.setTextOffset(hl.L(10.0f));
        hq7Var.setItemCount(5);
        final ?? hq7Var2 = new hq7(context, vnbVar);
        hq7Var2.setWrapSelectorWheel(true);
        hq7Var2.setAllItemsCount(24);
        hq7Var2.setItemCount(5);
        hq7Var2.setTextColor(w0);
        hq7Var2.setTextOffset(-hl.L(10.0f));
        final ?? hq7Var3 = new hq7(context, vnbVar);
        hq7Var3.setWrapSelectorWheel(true);
        hq7Var3.setAllItemsCount(60);
        hq7Var3.setItemCount(5);
        hq7Var3.setTextColor(w0);
        hq7Var3.setTextOffset(-hl.L(34.0f));
        ai aiVar = new ai(context, hq7Var, hq7Var2, hq7Var3, (byte) 7);
        aiVar.setOrientation(1);
        LinearLayout j2 = uh9.j(context, 1);
        aiVar.addView(j2, tre.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i == 1) {
            i2 = 2131744027;
        } else {
            i2 = 2131746822;
        }
        textView.setText(ob6.M0(i2, null));
        textView.setTextColor(w0);
        bs2.t(textView, 1, 20.0f);
        j2.addView(textView, tre.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new q8((byte) 2));
        TextView textView2 = new TextView(context);
        yob.X(textView2, aob.z6, vnbVar);
        bs2.r(14.0f, 1, 2131746821, textView2, null);
        j2.addView(textView2, tre.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new q8((byte) 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        aiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i8 = calendar.get(1);
        os2 os2Var = uc7.s1(yac.t0).k4.i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long g = os2Var.g(timeUnit) << 1;
        final long g2 = uc7.s1(yac.t0).k4.j.g(timeUnit) - 86400;
        final xb xbVar = new xb(context, (byte) 8);
        linearLayout.addView(hq7Var, tre.l(0.5f, 0, 270));
        hq7Var.setMinValue(0);
        hq7Var.setMaxValue(365);
        hq7Var.setWrapSelectorWheel(false);
        hq7Var.setFormatter(new yd(i8, (byte) 1));
        if (i == 1) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        fq7 fq7Var = new fq7() {
            @Override
            public final void i(hq7 hq7Var4, int i9) {
                jj.g(xb.this, null, g, g2, i3, hq7Var, hq7Var2, hq7Var3);
            }
        };
        hq7Var.setOnValueChangedListener(fq7Var);
        hq7Var2.setMinValue(0);
        hq7Var2.setMaxValue(23);
        linearLayout.addView((View) hq7Var2, tre.l(0.2f, 0, 270));
        hq7Var2.setFormatter(new e((byte) 23));
        hq7Var2.setOnValueChangedListener(fq7Var);
        hq7Var3.setMinValue(0);
        hq7Var3.setMaxValue(59);
        hq7Var3.setValue(0);
        hq7Var3.setFormatter(new e((byte) 24));
        linearLayout.addView((View) hq7Var3, tre.l(0.3f, 0, 270));
        hq7Var3.setOnValueChangedListener(fq7Var);
        if (j > 0 && j != 2147483646) {
            long j3 = 1000 * j;
            i4 = w02;
            i5 = i7;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j3 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j3);
            if (timeInMillis >= 0) {
                hq7Var3.setValue(calendar.get(12));
                hq7Var2.setValue(calendar.get(11));
                hq7Var.setValue(timeInMillis);
            }
        } else {
            i4 = w02;
            i5 = i7;
        }
        final boolean[] zArr = {true};
        g(xbVar, null, g, g2, i3, hq7Var, hq7Var2, hq7Var3);
        xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(w03);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(hl.o());
        xbVar.setBackground(rnb.e(w04, 8.0f));
        aiVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 4));
        final int i9 = i3;
        xbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                long j4 = g;
                long j5 = g2;
                byte b = i9;
                hq7 hq7Var4 = hq7Var;
                bj bjVar = hq7Var2;
                cj cjVar = hq7Var3;
                boolean g3 = jj.g(null, null, j4, j5, b, hq7Var4, bjVar, cjVar);
                long epochMilli = LocalDate.now().plusDays(hq7Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, bjVar.getValue());
                calendar2.set(12, cjVar.getValue());
                if (g3) {
                    calendar2.set(13, 0);
                }
                hjVar.y((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((nx0) z8dVar.b).y0.run();
            }
        });
        iye.b(xbVar, 0.02f, 1.2f);
        xb xbVar2 = new xb(context, (byte) 9);
        xbVar2.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        xbVar2.setGravity(17);
        if (i == 1) {
            i6 = 2131748225;
        } else {
            i6 = 2131746819;
        }
        xbVar2.setText(ob6.M0(i6, null));
        xbVar2.setTextColor(w04);
        xbVar2.setTextSize(1, 14.0f);
        int L = hl.L(8.0f);
        int i10 = aob.d6;
        int w05 = aob.w0(null, i10, false);
        int w06 = aob.w0(null, i5, false);
        hf0 i0 = aob.i0(L, L, L, L, w05, w06, w06);
        uob M = yob.M(i10);
        uob M2 = yob.M(i5);
        xbVar2.setBackground(i0);
        yob.j(xbVar2, i0, M, M2, null);
        aiVar.addView(xbVar2, tre.t(-1, 48, 83, 16, 0, 16, 16));
        xbVar2.setOnClickListener(new c0(zArr, hjVar, z8dVar, (byte) 3));
        iye.b(xbVar2, 0.02f, 1.2f);
        nx0 nx0Var = (nx0) z8dVar.b;
        nx0Var.O = aiVar;
        nx0Var.show();
        nx0Var.setOnDismissListener(new h5(zArr));
        nx0Var.s0(i4);
        nx0Var.K(i4);
        return z8dVar;
    }

    public static id R(e eVar, vnb vnbVar) {
        URLSpan[] uRLSpanArr;
        if (eVar == null || eVar.getParentActivity() == null) {
            return null;
        }
        p66 p66Var = new p66(eVar.getParentActivity(), eVar.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(ob6.M0(2131753978, null).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new vi(uRLSpan.getURL(), eVar), spanStart, spanEnd, 0);
        }
        p66Var.setText(spannableString);
        p66Var.setTextSize(1, 16.0f);
        yob.G(p66Var, aob.k5, vnbVar);
        yob.C(p66Var, aob.l5, vnbVar);
        p66Var.setPadding(hl.L(23.0f), 0, hl.L(23.0f), 0);
        p66Var.setMovementMethod(new dl((byte) 0));
        yob.X(p66Var, aob.j5, vnbVar);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, eVar.getParentActivity());
        alertDialog$Builder.n(p66Var);
        String M0 = ob6.M0(2131753979, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.j(ob6.M0(2131753977, null), new i6(eVar, (byte) 3));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        return idVar;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, vnb vnbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        alertDialog$Builder.a.S = ob6.M0(2131748341, null);
        hq7 hq7Var = new hq7(context, null);
        hq7Var.setMinValue(0);
        hq7Var.setMaxValue(20);
        int i = encryptedChat.ttl;
        if (i > 0 && i < 16) {
            hq7Var.setValue(i);
        } else if (i == 30) {
            hq7Var.setValue(16);
        } else if (i == 60) {
            hq7Var.setValue(17);
        } else if (i == 3600) {
            hq7Var.setValue(18);
        } else if (i == 86400) {
            hq7Var.setValue(19);
        } else if (i == 604800) {
            hq7Var.setValue(20);
        } else if (i == 0) {
            hq7Var.setValue(0);
        }
        hq7Var.setFormatter(new bg((byte) 8));
        alertDialog$Builder.n(hq7Var);
        alertDialog$Builder.g(ob6.M0(2131751319, null), new o(encryptedChat, hq7Var, (byte) 9));
        return alertDialog$Builder;
    }

    public static void T(e eVar, int i, znb znbVar, ynb ynbVar) {
        ynb ynbVar2;
        int i2;
        String str;
        if (eVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = eVar.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str2 = null;
        editTextBoldCursor.setBackground(null);
        yob.F(editTextBoldCursor, aob.u5, aob.v5, aob.q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.S = ob6.M0(2131748012, null);
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131751718, null), new vr9((byte) 16));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i != 0) {
            textView.setText(hl.S2(ob6.M0(2131751079, null)));
        } else {
            textView.setText(ob6.M0(2131751080, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(hl.L(23.0f), hl.L(12.0f), hl.L(23.0f), hl.L(6.0f));
        int i3 = aob.j5;
        yob.X(textView, i3, null);
        linearLayout.addView(textView, tre.o(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        yob.X(editTextBoldCursor, i3, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.A(aob.G6, null);
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, hl.L(4.0f), 0, 0);
        linearLayout.addView((View) editTextBoldCursor, tre.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new mh((byte) 0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        c00.r(9306112, hashMap, "Berry", 14598550, "Brandy");
        c00.r(8391495, hashMap, "Cherry", 16744272, "Coral");
        c00.r(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        c00.r(14725375, hashMap, "Mauve", 16761035, "Pink");
        c00.r(16711680, hashMap, "Red", 16711807, "Rose");
        c00.r(8406555, hashMap, "Russet", 16720896, "Scarlet");
        c00.r(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        c00.r(16760576, hashMap, "Amber", 15438707, "Apricot");
        c00.r(16508850, hashMap, "Banana", 10601738, "Citrus");
        c00.r(11560192, hashMap, "Ginger", 16766720, "Gold");
        c00.r(16640272, hashMap, "Lemon", 16753920, "Orange");
        c00.r(16770484, hashMap, "Peach", 16739155, "Persimmon");
        c00.r(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        c00.r(16763004, hashMap, "Topaz", 16776960, "Yellow");
        c00.r(3688720, hashMap, "Clover", 8628829, "Cucumber");
        c00.r(5294200, hashMap, "Emerald", 11907932, "Olive");
        c00.r(65280, hashMap, "Green", 43115, "Jade");
        c00.r(2730887, hashMap, "Jungle", 12582656, "Lime");
        c00.r(776785, hashMap, "Malachite", 10026904, "Mint");
        c00.r(11394989, hashMap, "Moss", 3234721, "Azure");
        c00.r(255, hashMap, "Blue", 18347, "Cobalt");
        c00.r(5204422, hashMap, "Indigo", 96647, "Lagoon");
        c00.r(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        c00.r(128, hashMap, "Navy", 3101086, "Sapphire");
        c00.r(7788522, hashMap, "Sky", 32896, "Teal");
        c00.r(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        c00.r(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        c00.r(13148872, hashMap, "Lilac", 11894492, "Lavender");
        c00.r(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        c00.r(6684825, hashMap, "Purple", 14204888, "Thistle");
        c00.r(14315734, hashMap, "Orchid", 2361920, "Violet");
        c00.r(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        c00.r(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        c00.r(7365973, hashMap, "Coffee", 7956873, "Rum");
        c00.r(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        c00.r(12759680, hashMap, "Sand", 8924439, "Sienna");
        c00.r(7864585, hashMap, "Maple", 15787660, "Khaki");
        c00.r(12088115, hashMap, "Copper", 12144200, "Chestnut");
        c00.r(15653316, hashMap, "Almond", 16776656, "Cream");
        c00.r(12186367, hashMap, "Diamond", 11109127, "Honey");
        c00.r(16777200, hashMap, "Ivory", 15392968, "Pearl");
        c00.r(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        c00.r(16777215, hashMap, "White", 8421504, "Gray");
        c00.r(0, hashMap, "Black", 15266260, "Chrome");
        c00.r(3556687, hashMap, "Charcoal", 789277, "Ebony");
        c00.r(12632256, hashMap, "Silver", 16119285, "Smoke");
        c00.r(2499381, hashMap, "Steel", 5220413, "Apple");
        c00.r(8434628, hashMap, "Glacier", 16693933, "Melon");
        c00.r(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (ynbVar == null) {
            ynbVar2 = aob.B0().i(false);
        } else {
            ynbVar2 = ynbVar;
        }
        if (ynbVar2 == null || (i2 = ynbVar2.c) == 0) {
            i2 = hl.q(aob.r0())[0];
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        int i4 = Integer.MAX_VALUE;
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int red2 = Color.red(num.intValue());
            int i5 = (red + red2) / 2;
            int i6 = red - red2;
            int green2 = green - Color.green(num.intValue());
            int blue2 = blue - Color.blue(num.intValue());
            int i7 = ((green2 << 2) * green2) + ((((i5 + 512) * i6) * i6) >> 8) + ((((767 - i5) * blue2) * blue2) >> 8);
            if (i7 < i4) {
                str2 = (String) entry.getValue();
                i4 = i7;
            }
        }
        SecureRandom secureRandom = Utilities.b;
        if (secureRandom.nextInt() % 2 == 0) {
            str = qu6.o((String) asList.get(secureRandom.nextInt(asList.size())), " ", str2, new StringBuilder());
        } else {
            str = str2 + " " + ((String) asList2.get(secureRandom.nextInt(asList2.size())));
        }
        editTextBoldCursor.setText(str);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        df dfVar = new df(editTextBoldCursor, (byte) 2);
        id idVar = alertDialog$Builder.a;
        idVar.setOnShowListener(dfVar);
        eVar.showDialog(idVar);
        editTextBoldCursor.requestFocus();
        idVar.c(-1).setOnClickListener(new nh(eVar, editTextBoldCursor, ynbVar, znbVar, idVar, (byte) 0));
    }

    public static void U(Activity activity, String str, int i, int i2, int i3, pcc pccVar) {
        if (activity == null) {
            return;
        }
        int w0 = aob.w0(null, aob.j5, false);
        int w02 = aob.w0(null, aob.h5, false);
        aob.w0(null, aob.Aj, false);
        aob.w0(null, aob.Ej, false);
        aob.w0(null, aob.E8, false);
        aob.w0(null, aob.G8, false);
        aob.w0(null, aob.i6, false);
        aob.w0(null, aob.Ji, false);
        aob.w0(null, aob.Fi, false);
        aob.w0(null, aob.Hi, false);
        nx0 i4 = ik8.i(activity, false, 1, null);
        i4.w0 = false;
        ?? hq7Var = new hq7(activity, null);
        ai aiVar = new ai(activity, hq7Var);
        aiVar.setOrientation(0);
        aiVar.setWeightSum(1.0f);
        hq7Var.setAllItemsCount(24);
        hq7Var.setItemCount(5);
        hq7Var.setTextColor(w0);
        hq7Var.setGravity(5);
        hq7Var.setTextOffset(-hl.L(12.0f));
        ?? hq7Var2 = new hq7(activity, null);
        hq7Var2.setWrapSelectorWheel(true);
        hq7Var2.setAllItemsCount(60);
        hq7Var2.setItemCount(5);
        hq7Var2.setTextColor(w0);
        hq7Var2.setGravity(3);
        hq7Var2.setTextOffset(hl.L(12.0f));
        final jg jgVar = new jg(i2, i3, (zh) hq7Var, (bi) hq7Var2, i, aiVar);
        aiVar.addView((View) hq7Var, tre.l(0.5f, 0, 270));
        hq7Var.setFormatter(new bg((byte) 9));
        hq7Var.setOnValueChangedListener(new fq7() {
            @Override
            public final void i(hq7 hq7Var3, int i5) {
                byte b = r2;
                jg jgVar2 = jgVar;
                switch (b) {
                    case 0:
                        jgVar2.a(Boolean.TRUE);
                        return;
                    default:
                        jgVar2.a(Boolean.TRUE);
                        return;
                }
            }
        });
        aiVar.addView((View) hq7Var2, tre.l(0.5f, 0, 270));
        hq7Var2.setFormatter(new bg((byte) 10));
        hq7Var2.setOnValueChangedListener(new fq7() {
            @Override
            public final void i(hq7 hq7Var3, int i5) {
                byte b = r2;
                jg jgVar2 = jgVar;
                switch (b) {
                    case 0:
                        jgVar2.a(Boolean.TRUE);
                        return;
                    default:
                        jgVar2.a(Boolean.TRUE);
                        return;
                }
            }
        });
        jgVar.a(Boolean.FALSE);
        ci ciVar = new ci(activity, hq7Var, hq7Var2);
        ciVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new q8((byte) 8));
        ciVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
        ciVar.addView(aiVar, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        c51 c51Var = new c51(null, activity, true);
        c51Var.setRoundRadius(24);
        c51Var.i(ob6.M0(2131745400, null), false, true);
        c51Var.setOnClickListener(new g5(r1, (byte) 1));
        ciVar.addView(c51Var, tre.t(-1, 48, 0, 16, 12, 16, 12));
        i4.O = ciVar;
        i4.show();
        i4.setOnDismissListener(new cf(pccVar, hq7Var, hq7Var2, (byte) 1));
        i4.s0(w02);
        i4.K(w02);
        nx0[] nx0VarArr = {i4};
    }

    public static id V(Activity activity, final long j, final long j2, String str, final Runnable runnable, vnb vnbVar) {
        String[] strArr;
        boolean z;
        final String str2 = str;
        SharedPreferences sharedPreferences = uc7.s1(yac.t0).W3;
        boolean z2 = true;
        final int[] iArr = new int[1];
        if (j != 0) {
            int i = sharedPreferences.getInt(str2, 0);
            iArr[0] = i;
            if (i == 3) {
                iArr[0] = 2;
            } else if (i == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{ob6.M0(2131743268, null), ob6.M0(2131745094, null), ob6.M0(2131748477, null), ob6.M0(2131743267, null)};
        } else {
            int i2 = sharedPreferences.getInt(str2, 0);
            iArr[0] = i2;
            if (i2 == 0) {
                iArr[0] = 1;
            } else if (i2 == 1) {
                iArr[0] = 2;
            } else if (i2 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{ob6.M0(2131743267, null), ob6.M0(2131743268, null), ob6.M0(2131745094, null), ob6.M0(2131748477, null), ob6.M0(2131747548, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout m = bs2.m(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        int i3 = 0;
        while (i3 < strArr2.length) {
            j29 j29Var = new j29(activity, vnbVar);
            j29Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            j29Var.setTag(Integer.valueOf(i3));
            a(j29Var, aob.g7, aob.E5, vnbVar);
            String str3 = strArr2[i3];
            if (iArr[0] == i3) {
                z = z2;
            } else {
                z = false;
            }
            j29Var.b(str3, z);
            m.addView(j29Var);
            j29Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = uc7.s1(yac.t0).W3.edit();
                    long j3 = j;
                    int i4 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    String str4 = str2;
                    if (i4 != 0) {
                        int i5 = iArr2[0];
                        if (i5 == 0) {
                            edit.putInt(str4, 0);
                        } else if (i5 == 1) {
                            edit.putInt(str4, 1);
                        } else if (i5 == 2) {
                            edit.putInt(str4, 3);
                        } else if (i5 == 3) {
                            edit.putInt(str4, 2);
                        }
                        ip7.n(yac.t0).f(j3, j2);
                    } else {
                        int i6 = iArr2[0];
                        if (i6 == 0) {
                            edit.putInt(str4, 2);
                        } else if (i6 == 1) {
                            edit.putInt(str4, 0);
                        } else if (i6 == 2) {
                            edit.putInt(str4, 1);
                        } else if (i6 == 3) {
                            edit.putInt(str4, 3);
                        } else if (i6 == 4) {
                            edit.putInt(str4, 4);
                        }
                        if (str4.equals("vibrate_channel")) {
                            ip7.n(yac.t0).g(2);
                        } else if (str4.equals("vibrate_group")) {
                            ip7.n(yac.t0).g(0);
                        } else {
                            boolean equals = str4.equals("vibrate_react");
                            int i7 = yac.t0;
                            if (equals) {
                                ip7.n(i7).g(4);
                            } else {
                                ip7.n(i7).g(1);
                            }
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.a.M0.run();
                    runnable.run();
                }
            });
            i3++;
            str2 = str;
            z2 = true;
        }
        String M0 = ob6.M0(2131743269, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(ob6.M0(2131752570, null), null);
        return idVar;
    }

    public static id W(Context context, vnb vnbVar, String[] strArr, int i, String str, String str2, pt2 pt2Var) {
        vnb vnbVar2;
        boolean z;
        int i2;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    vnbVar2 = vnbVar;
                    z = true;
                    break;
                }
            }
        }
        vnbVar2 = vnbVar;
        z = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, context);
        int i3 = aob.L5;
        alertDialog$Builder.l(i, 72, aob.w0(null, i3, false), null);
        alertDialog$Builder.m(i3, null);
        if (z) {
            str = str2;
        }
        SpannableStringBuilder S2 = hl.S2(str);
        id idVar = alertDialog$Builder.a;
        idVar.U = S2;
        if (z) {
            i2 = 2131747027;
        } else {
            i2 = 2131752890;
        }
        alertDialog$Builder.j(ob6.M0(i2, null), new ag(z, context, atomicBoolean, pt2Var, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131752885, null), new o(atomicBoolean, pt2Var, (byte) 6));
        idVar.setOnDismissListener(new gf(atomicBoolean, pt2Var, (byte) 1));
        return idVar;
    }

    public static void X(int i, long j, int i2, pcc pccVar) {
        Y(i, j, i2, pccVar, 0L);
    }

    public static boolean Y(final int r24, final long r25, int r27, defpackage.pcc r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.Y(int, long, int, pcc, long):boolean");
    }

    public static boolean Z(int i, ArrayList arrayList, int i2, pcc pccVar) {
        vnb x53Var;
        vnb vnbVar;
        if (arrayList.isEmpty()) {
            pccVar.a(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        long j2 = 0;
        boolean z = true;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Long l = (Long) obj;
            int i5 = i3;
            long longValue = l.longValue();
            long M1 = uc7.s1(i).M1(longValue);
            if (M1 <= j && longValue > j) {
                M1 = wf3.j(uc7.s1(i).P2(longValue));
            }
            hashMap.put(l, Long.valueOf(M1));
            j2 += M1;
            long j3 = j;
            jxa.v(i, false).P.put(l, Integer.valueOf(i2));
            int i6 = (M1 > j3 ? 1 : (M1 == j3 ? 0 : -1));
            if (i6 > 0) {
                i5++;
            }
            if (i6 > 0 && z && uc7.s1(i).X3.getLong(ik8.n(longValue, "ask_paid_message_", "_price"), j3) < M1) {
                z = false;
            }
            i3 = i5;
            j = 0;
        }
        int i7 = i3;
        long max = j2 * Math.max(1, i2);
        if (!z && max > 0) {
            Activity u0 = hl.u0();
            e S = LaunchActivity.S();
            if (!PhotoViewer.q0().V0()) {
                if (S != null) {
                    if (!S.hasShownSheet()) {
                        x53Var = S.getResourceProvider();
                        vnbVar = x53Var;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) hl.S2(ob6.H(',', "MessageLockedStarsConfirmMessageMulti1", i7)));
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) hl.S2(ob6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', ob6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i7) * i2))));
                        f0(u0, ob6.M0(2131748308, null), spannableStringBuilder, ob6.M0(2131748321, null), ob6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new le(i, max, vnbVar, pccVar, u0, arrayList, hashMap), vnbVar, true);
                        return true;
                    }
                } else {
                    vnbVar = null;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) hl.S2(ob6.H(',', "MessageLockedStarsConfirmMessageMulti1", i7)));
                    spannableStringBuilder2.append((CharSequence) " ");
                    spannableStringBuilder2.append((CharSequence) hl.S2(ob6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', ob6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i7) * i2))));
                    f0(u0, ob6.M0(2131748308, null), spannableStringBuilder2, ob6.M0(2131748321, null), ob6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new le(i, max, vnbVar, pccVar, u0, arrayList, hashMap), vnbVar, true);
                    return true;
                }
            }
            x53Var = new x53();
            vnbVar = x53Var;
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
            spannableStringBuilder22.append((CharSequence) hl.S2(ob6.H(',', "MessageLockedStarsConfirmMessageMulti1", i7)));
            spannableStringBuilder22.append((CharSequence) " ");
            spannableStringBuilder22.append((CharSequence) hl.S2(ob6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', ob6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i7) * i2))));
            f0(u0, ob6.M0(2131748308, null), spannableStringBuilder22, ob6.M0(2131748321, null), ob6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new le(i, max, vnbVar, pccVar, u0, arrayList, hashMap), vnbVar, true);
            return true;
        }
        pccVar.a(hashMap);
        return false;
    }

    public static void a(j29 j29Var, int i, int i2, vnb vnbVar) {
        for (int i3 = 0; i3 < j29Var.getChildCount(); i3++) {
            View childAt = j29Var.getChildAt(i3);
            if (childAt instanceof RadioButton) {
                yob.O((RadioButton) childAt, i, i2, vnbVar);
                return;
            }
        }
        j29Var.a(aob.v0(i, vnbVar), aob.v0(i2, vnbVar));
    }

    public static boolean a0(int i, long j) {
        long M1 = uc7.s1(i).M1(j);
        if (M1 <= 0 && j > 0) {
            M1 = wf3.j(uc7.s1(i).P2(j));
        }
        if (M1 > 0 && M1 > uc7.s1(i).X3.getLong(ik8.n(j, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void b(hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3) {
        int i;
        int i2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i3 = 1;
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i7 = calendar.get(1);
        int i8 = calendar.get(2);
        int i9 = calendar.get(5);
        hq7Var3.setMaxValue(i7);
        hq7Var3.setMinValue(i4);
        int value = hq7Var3.getValue();
        if (value == i7) {
            i = i8;
        } else {
            i = 11;
        }
        hq7Var2.setMaxValue(i);
        if (value == i4) {
            i2 = i5;
        } else {
            i2 = 0;
        }
        hq7Var2.setMinValue(i2);
        int value2 = hq7Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i7 && value2 == i8) {
            actualMaximum = Math.min(i9, actualMaximum);
        }
        hq7Var.setMaxValue(actualMaximum);
        if (value == i4 && value2 == i5) {
            i3 = i6;
        }
        hq7Var.setMinValue(i3);
    }

    public static void b0(ij ijVar, id idVar, e eVar) {
        if (eVar.getParentActivity() != null) {
            hl.t1(ijVar);
            String obj = ijVar.getText().toString();
            int i = aob.a;
            znb znbVar = new znb();
            File h = a.h();
            znbVar.b = new File(h, "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
            znbVar.a = obj;
            aob.g0 = aob.Z0(aob.I.j0);
            znbVar.F = yac.t0;
            aob.v1(znbVar, true, true, false);
            jn7.e().k(jn7.r4, new Object[0]);
            new ThemeEditorView().d(eVar.getParentActivity(), znbVar);
            idVar.dismiss();
            SharedPreferences e1 = uc7.e1();
            if (e1.getBoolean("themehint", false)) {
                return;
            }
            e1.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(eVar.getParentActivity(), ob6.M0(2131751675, null), 1).show();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public static long c(c51 c51Var, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3, hq7 hq7Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i = 1;
        int i2 = calendar.get(1);
        int value = ((hq7Var2.getValue() - 120) / 12) + i2;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (hq7Var2.getValue() - 120) % 12);
        hq7Var.setMinValue(1);
        hq7Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = hq7Var.getValue();
        int value3 = hq7Var3.getValue();
        int value4 = hq7Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (c51Var != null) {
            if (value2 == 0) {
                i = 0;
            } else if (i2 != value) {
                i = 2;
            }
            c51Var.setText(ob6.D0().w0(i + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static defpackage.id c0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.e r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.e, org.telegram.tgnet.TLObject, java.lang.Object[]):id");
    }

    public static void d(hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3) {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = 1;
        int i3 = calendar.get(1);
        int i4 = calendar.get(2);
        int i5 = calendar.get(5);
        hq7Var3.setMinValue(i3);
        int value = hq7Var3.getValue();
        if (value == i3) {
            i = i4;
        } else {
            i = 0;
        }
        hq7Var2.setMinValue(i);
        int value2 = hq7Var2.getValue();
        if (value == i3 && value2 == i4) {
            i2 = i5;
        }
        hq7Var.setMinValue(i2);
    }

    public static void d0(Context context, vnb vnbVar, String str, TLRPC.WebPage webPage, final pcc pccVar, e62 e62Var) {
        final View view;
        Activity W = hl.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        final id[] idVarArr = new id[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131746880, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131746881, null);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i = aob.j5;
        yob.X(editTextBoldCursor, i, vnbVar);
        yob.D(editTextBoldCursor, aob.Oi, vnbVar);
        editTextBoldCursor.setHint(ob6.M0(2131746879, null));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(hl.L(16.0f), hl.L(13.0f), hl.L(16.0f), hl.L(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(aob.q6, vnbVar);
        if (str != null) {
            editTextBoldCursor.setText(str);
            editTextBoldCursor.setSelection(str.length());
        }
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                boolean matches;
                if (i2 != 6) {
                    return false;
                }
                ni niVar = ni.this;
                String trim = niVar.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = jj.a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    hl.z3(niVar);
                    return true;
                }
                pccVar.a(trim);
                id idVar2 = idVarArr[0];
                if (idVar2 != null) {
                    idVar2.dismiss();
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.p1(0.06f, aob.v0(i, vnbVar)));
        uob K = yob.K(0.06f, i);
        editTextBoldCursor.setBackground(b0);
        yob.j(editTextBoldCursor, b0, K, null, vnbVar);
        LinearLayout j = uh9.j(context, 1);
        j.addView((View) editTextBoldCursor, tre.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i2 = yxc.f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            yxc yxcVar = new yxc(context, vnbVar);
            yxcVar.setWebPage(webPage);
            j.addView(yxcVar, tre.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.b();
        alertDialog$Builder.n(j);
        idVar.a = Math.min(hl.L(320.0f), (hl.q.x * 85) / 100);
        alertDialog$Builder.j(ob6.M0(2131751319, null), new o(editTextBoldCursor, pccVar, (byte) 8));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new bg((byte) 7));
        if (e62Var != null) {
            alertDialog$Builder.h(ob6.M0(2131751563, null), new m0(e62Var, (byte) 14));
        }
        idVarArr[0] = idVar;
        idVar.k0 = false;
        idVar.setOnDismissListener(new o1(editTextBoldCursor, (byte) 2));
        idVarArr[0].setOnShowListener(new ig(editTextBoldCursor, (byte) 0));
        idVarArr[0].show();
        TextView textView = (TextView) idVarArr[0].c(-3);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
        }
    }

    public static void e(TextView textView, hq7 hq7Var, li liVar, mi miVar) {
        String str;
        String str2;
        int value = hq7Var.getValue();
        int value2 = liVar.getValue();
        int value3 = miVar.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
        int i = timeInMillis / 86400;
        int i2 = (timeInMillis % 86400) / 3600;
        int i3 = (timeInMillis % 3600) / 60;
        String str3 = "";
        if (i <= 0) {
            str = "";
        } else {
            str = ob6.G(i, "Days", new Object[0]);
        }
        if (i2 <= 0) {
            str2 = "";
        } else {
            str2 = ob6.G(i2, "Hours", new Object[0]);
        }
        if (i3 > 0) {
            str3 = ob6.G(i3, "Minutes", new Object[0]);
        }
        textView.setText(ob6.a0(null, null, 2131746901, ob6.a0(null, null, 2131746900, str, str2, str3).trim()));
    }

    public static void e0(TLRPC.TL_error tL_error, e eVar, boolean z, boolean z2, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && eVar != null && eVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getParentActivity());
            String M0 = ob6.M0(2131689472, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            String str = tL_error.text;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -2120721660:
                    if (str.equals("CHANNELS_ADMIN_LOCATED_TOO_MUCH")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2012133105:
                    if (str.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1763467626:
                    if (str.equals("USERS_TOO_FEW")) {
                        c = 2;
                        break;
                    }
                    break;
                case -538116776:
                    if (str.equals("USER_BLOCKED")) {
                        c = 3;
                        break;
                    }
                    break;
                case -512775857:
                    if (str.equals("USER_RESTRICTED")) {
                        c = 4;
                        break;
                    }
                    break;
                case -454039871:
                    if (str.equals("PEER_FLOOD")) {
                        c = 5;
                        break;
                    }
                    break;
                case -420079733:
                    if (str.equals("BOTS_TOO_MUCH")) {
                        c = 6;
                        break;
                    }
                    break;
                case 98635865:
                    if (str.equals("USER_KICKED")) {
                        c = 7;
                        break;
                    }
                    break;
                case 517420851:
                    if (str.equals("USER_BOT")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 845559454:
                    if (str.equals("YOU_BLOCKED_USER")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 916342611:
                    if (str.equals("USER_ADMIN_INVALID")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1047173446:
                    if (str.equals("CHAT_ADMIN_BAN_REQUIRED")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1167301807:
                    if (str.equals("USERS_TOO_MUCH")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1227003815:
                    if (str.equals("USER_ID_INVALID")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1253103379:
                    if (str.equals("ADMINS_TOO_MUCH")) {
                        c = 14;
                        break;
                    }
                    break;
                case 1355367367:
                    if (str.equals("CHANNELS_TOO_MUCH")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1377621075:
                    if (str.equals("USER_CHANNELS_TOO_MUCH")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1623167701:
                    if (str.equals("USER_NOT_MUTUAL_CONTACT")) {
                        c = 17;
                        break;
                    }
                    break;
                case 1754587486:
                    if (str.equals("CHAT_ADMIN_INVITE_REQUIRED")) {
                        c = 18;
                        break;
                    }
                    break;
                case 1916725894:
                    if (str.equals("USER_PRIVACY_RESTRICTED")) {
                        c = 19;
                        break;
                    }
                    break;
                case 1965565720:
                    if (str.equals("USER_ALREADY_PARTICIPANT")) {
                        c = 20;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    idVar.U = ob6.M0(2131748512, null);
                    break;
                case 1:
                    idVar.U = ob6.M0(2131746319, null);
                    break;
                case 2:
                    idVar.U = ob6.M0(2131751713, null);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z) {
                        idVar.U = ob6.M0(2131752236, null);
                        break;
                    } else {
                        idVar.U = ob6.M0(2131749143, null);
                        break;
                    }
                case 4:
                    idVar.U = ob6.M0(2131743383, null);
                    break;
                case 5:
                    idVar.U = ob6.M0(2131747857, null);
                    alertDialog$Builder.g(ob6.M0(2131748085, null), new i6(eVar, (byte) 2));
                    break;
                case 6:
                    if (z) {
                        idVar.U = ob6.M0(2131752234, null);
                        break;
                    } else {
                        idVar.U = ob6.M0(2131749141, null);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        idVar.U = ob6.M0(2131754357, null);
                        break;
                    } else {
                        idVar.U = ob6.M0(2131754470, null);
                        break;
                    }
                case '\t':
                    idVar.U = ob6.M0(2131742473, null);
                    break;
                case '\n':
                    idVar.U = ob6.M0(2131754458, null);
                    break;
                case '\f':
                    if (z) {
                        idVar.U = ob6.M0(2131752237, null);
                        break;
                    } else {
                        idVar.U = ob6.M0(2131749144, null);
                        break;
                    }
                case 14:
                    if (z) {
                        idVar.U = ob6.M0(2131752235, null);
                        break;
                    } else {
                        idVar.U = ob6.M0(2131749142, null);
                        break;
                    }
                case 15:
                    idVar.S = ob6.M0(2131752248, null);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        idVar.U = ob6.M0(2131752250, null);
                        break;
                    } else {
                        idVar.U = ob6.M0(2131752249, null);
                        break;
                    }
                case 16:
                    idVar.S = ob6.M0(2131752248, null);
                    idVar.U = ob6.M0(2131743412, null);
                    break;
                case 17:
                    if (z) {
                        idVar.U = ob6.M0(2131752233, null);
                        break;
                    } else {
                        idVar.U = ob6.M0(2131749140, null);
                        break;
                    }
                case 18:
                    idVar.U = ob6.M0(2131754469, null);
                    break;
                case 19:
                    if (z2) {
                        idVar.U = ob6.M0(2131748865, null);
                        break;
                    } else if (z) {
                        idVar.U = ob6.M0(2131748866, null);
                        break;
                    } else {
                        idVar.U = ob6.M0(2131748863, null);
                        break;
                    }
                case 20:
                    idVar.S = ob6.M0(2131742958, null);
                    idVar.U = ob6.M0(2131743028, null);
                    break;
                default:
                    idVar.U = ob6.M0(2131751070, null) + "\n" + tL_error.text;
                    break;
            }
            c00.u(null, 2131747558, alertDialog$Builder, null);
        }
    }

    public static void f(int i, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        TLRPC.User user;
        if (tL_messages_invitedUsers != null && !tL_messages_invitedUsers.missing_invitees.isEmpty() && chat != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
            int size = arrayList4.size();
            int i2 = 0;
            while (i2 < size) {
                TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i2);
                i2++;
                TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
                if (tL_messages_invitedUsers.updates != null) {
                    for (int i3 = 0; i3 < tL_messages_invitedUsers.updates.users.size(); i3++) {
                        user = tL_messages_invitedUsers.updates.users.get(i3);
                        if (user.id == tL_missingInvitee2.user_id) {
                            break;
                        }
                    }
                }
                user = null;
                if (user == null) {
                    user = uc7.s1(i).X1(Long.valueOf(tL_missingInvitee2.user_id));
                }
                if (user != null) {
                    arrayList.add(user);
                    if (tL_missingInvitee2.premium_required_for_pm) {
                        arrayList2.add(Long.valueOf(user.id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                hl.d3(new l77(i, chat, arrayList, arrayList2, arrayList3, (byte) 1), 200L);
            }
        }
    }

    public static id f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, pcc pccVar, vnb vnbVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int L;
        if (activity == null) {
            pccVar.a(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        sg2[] sg2VarArr = new sg2[1];
        boolean[] zArr = {false};
        xb xbVar = new xb(activity, (byte) 10);
        jn7.i(xbVar);
        yob.X(xbVar, aob.j5, vnbVar);
        xbVar.setTextSize(1, 16.0f);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        xbVar.setGravity(i | 48);
        xbVar.setText(charSequence);
        sh shVar = new sh(activity, sg2VarArr, (byte) 1);
        id idVar = alertDialog$Builder.a;
        idVar.H = (byte) 6;
        alertDialog$Builder.n(shVar);
        TextView textView = new TextView(activity);
        qd4.w(textView, aob.E8, vnbVar, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        shVar.addView(textView, tre.d(-1, -2.0f, i3 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (ob6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        shVar.addView(xbVar, tre.d(-2, -2.0f, i4 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            sg2 sg2Var = new sg2(1, vnbVar, activity);
            sg2VarArr[0] = sg2Var;
            int i7 = aob.i6;
            hf0 f0 = aob.f0(aob.v0(i7, vnbVar), 7, hl.L(12.0f));
            uob M = yob.M(i7);
            sg2Var.setBackground(f0);
            yob.j(sg2Var, f0, null, M, vnbVar);
            sg2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sg2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (ob6.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            layoutParams.gravity = i5 | 16;
            sg2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            sg2VarArr[0].e(charSequence2, "", false, false, false);
            sg2 sg2Var2 = sg2VarArr[0];
            if (ob6.a0) {
                i6 = hl.L(4.0f);
            } else {
                i6 = 0;
            }
            int L2 = hl.L(12.0f);
            if (ob6.a0) {
                L = 0;
            } else {
                L = hl.L(4.0f);
            }
            sg2Var2.setPadding(i6, L2, L, hl.L(12.0f));
            shVar.addView(sg2VarArr[0], tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            sg2VarArr[0].setOnClickListener(new de(zArr, (byte) 0));
        }
        alertDialog$Builder.j(str2, new ee((byte) 0, pccVar, zArr));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        if (z) {
            idVar.Y0 = true;
        }
        idVar.show();
        return idVar;
    }

    public static boolean g(TextView textView, TextView textView2, long j, long j2, int i, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3) {
        long j3;
        int i2;
        long j4;
        int i3;
        int i4;
        int i5;
        long j5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        String G;
        int i8;
        int i9;
        int i10;
        int value = hq7Var.getValue();
        int value2 = hq7Var2.getValue();
        int value3 = hq7Var3.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        int i11 = calendar.get(1);
        calendar.get(6);
        if (j2 > 0) {
            i2 = i11;
            calendar.setTimeInMillis((j2 * 1000) + currentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            j3 = currentTimeMillis;
            i3 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j4 = calendar.getTimeInMillis();
            i4 = 23;
            i5 = 59;
        } else {
            j3 = currentTimeMillis;
            i2 = i11;
            j4 = j2;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i12 = i5;
        if (j > 0) {
            j5 = TimeUnit.SECONDS.toMillis(j);
        } else {
            j5 = 60000;
        }
        long j6 = j5;
        long j7 = j3 + j6;
        calendar.setTimeInMillis(j7);
        int i13 = calendar.get(11);
        int i14 = calendar.get(12);
        long j8 = j4;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        hq7Var.setMinValue(0);
        int i15 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
        if (i15 > 0) {
            hq7Var.setMaxValue(i3);
        }
        int value4 = hq7Var.getValue();
        if (value4 == 0) {
            i6 = i13;
        } else {
            i6 = 0;
        }
        hq7Var2.setMinValue(i6);
        if (i15 > 0) {
            if (value4 == i3) {
                i10 = i4;
            } else {
                i10 = 23;
            }
            hq7Var2.setMaxValue(i10);
        }
        int value5 = hq7Var2.getValue();
        if (value4 == 0 && value5 == i13) {
            i7 = i14;
        } else {
            i7 = 0;
        }
        hq7Var3.setMinValue(i7);
        if (i15 > 0) {
            if (value4 == i3 && value5 == i4) {
                i9 = i12;
            } else {
                i9 = 59;
            }
            hq7Var3.setMaxValue(i9);
        }
        int value6 = hq7Var3.getValue();
        if (timeInMillis <= j7) {
            calendar.setTimeInMillis(j7);
        } else if (i15 > 0 && timeInMillis > j8) {
            calendar.setTimeInMillis(j8);
        }
        int i16 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value4);
        calendar.set(11, value5);
        calendar.set(12, value6);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (textView != null) {
            if (value4 == 0) {
                i8 = 0;
            } else if (i2 == i16) {
                i8 = 1;
            } else {
                i8 = 2;
            }
            textView.setText(ob6.D0().w0((i * 3) + i8).format(timeInMillis2));
        }
        if (textView2 != null) {
            int i17 = (int) ((timeInMillis2 - j3) / 1000);
            if (i17 > 86400) {
                z2 = false;
                G = ob6.G(Math.round(i17 / 86400.0f), "DaysSchedule", new Object[0]);
            } else {
                z2 = false;
                z2 = false;
                z2 = false;
                if (i17 >= 3600) {
                    G = ob6.G(Math.round(i17 / 3600.0f), "HoursSchedule", new Object[0]);
                } else if (i17 >= 60) {
                    G = ob6.G(Math.round(i17 / 60.0f), "MinutesSchedule", new Object[0]);
                } else {
                    G = ob6.G(i17, "SecondsSchedule", new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                z = true;
                Object[] objArr = new Object[1];
                objArr[z2 ? 1 : 0] = G;
                textView2.setText(ob6.a0("VoipChannelScheduleInfo", null, 2131743115, objArr));
            } else {
                z = true;
                Object[] objArr2 = new Object[1];
                objArr2[z2 ? 1 : 0] = G;
                textView2.setText(ob6.a0("VoipGroupScheduleInfo", null, 2131742994, objArr2));
            }
        } else {
            z = true;
            z2 = false;
        }
        if (timeInMillis - j3 > j6) {
            return z;
        }
        return z2;
    }

    public static void g0(org.telegram.ui.ActionBar.e r29, long r30, final org.telegram.tgnet.TLRPC.User r32, final org.telegram.tgnet.TLRPC.Chat r33, final org.telegram.tgnet.TLRPC.EncryptedChat r34, final boolean r35, org.telegram.tgnet.TLRPC.ChatFull r36, final defpackage.df7 r37, defpackage.vnb r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.g0(org.telegram.ui.ActionBar.e, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, df7, vnb):void");
    }

    public static boolean h(Context context, int i, long j, boolean z) {
        TLRPC.Chat M0;
        if (wf3.y(j) && (M0 = uc7.s1(i).M0(Long.valueOf(-j))) != null && M0.slowmode_enabled && !xc2.N(M0)) {
            if (!z) {
                TLRPC.ChatFull N0 = uc7.s1(i).N0(M0.id);
                if (N0 == null) {
                    N0 = jf7.Y(i).C0(M0.id, xc2.T(M0), new CountDownLatch(1), false, false, 0);
                }
                if (N0 != null && N0.slowmode_next_send_date >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                    z = true;
                }
            }
            if (z) {
                K(context, M0.title, ob6.M0(2131745030, null)).o();
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h0(zu1 zu1Var, r47 r47Var, long j, vnb vnbVar, hm1 hm1Var) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int L;
        int L2;
        if (zu1Var.getParentActivity() != null && r47Var != null) {
            k5 accountInstance = zu1Var.getAccountInstance();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                user = uc7.s1(accountInstance.a).X1(Long.valueOf(j));
            } else {
                user = null;
            }
            if (i < 0) {
                chat = uc7.s1(accountInstance.a).M0(Long.valueOf(-j));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, zu1Var.getParentActivity());
                id idVar = alertDialog$Builder.a;
                idVar.Q0 = false;
                idVar.O = new o1(hm1Var, (byte) 3);
                idVar.S = ob6.M0(2131753685, null);
                if (user != null) {
                    idVar.U = hl.S2(ob6.a0("BlockUserReplyAlert", null, 2131753679, lbc.k(user, true)));
                } else {
                    idVar.U = hl.S2(ob6.a0("BlockUserReplyAlert", null, 2131753679, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(zu1Var.getParentActivity());
                linearLayout.setOrientation(1);
                sg2[] sg2VarArr = {new sg2(1, vnbVar, zu1Var.getParentActivity())};
                sg2VarArr[0].setBackgroundDrawable(aob.L0(false));
                sg2VarArr[0].setTag(0);
                sg2VarArr[0].e(ob6.M0(2131751467, null), "", true, false, false);
                sg2 sg2Var = sg2VarArr[0];
                if (ob6.a0) {
                    L = hl.L(16.0f);
                } else {
                    L = hl.L(8.0f);
                }
                if (ob6.a0) {
                    L2 = hl.L(8.0f);
                } else {
                    L2 = hl.L(16.0f);
                }
                sg2Var.setPadding(L, 0, L2, 0);
                linearLayout.addView(sg2VarArr[0], tre.o(-1, -2));
                sg2VarArr[0].setOnClickListener(new je(sg2VarArr, (byte) 1));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.j(ob6.M0(2131753688, null), new kh(user, accountInstance, zu1Var, chat, r47Var, sg2VarArr, vnbVar));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                zu1Var.showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                }
            }
        }
    }

    public static id i(Activity activity, fj fjVar) {
        if (yac.c() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        id idVar = alertDialog$Builder.a;
        uc ucVar = idVar.M0;
        id[] idVarArr = new id[1];
        LinearLayout m = bs2.m(activity, 1);
        for (int i = 0; i < 4; i++) {
            if (yac.h(i).f() != null) {
                l5 l5Var = new l5(activity, false);
                l5Var.f = i;
                TLRPC.User f = yac.h(i).f();
                rb0 rb0Var = l5Var.e;
                rb0Var.q(f);
                l5Var.a.l(lv2.m(0, f.first_name, f.last_name), false);
                de0 de0Var = l5Var.c;
                de0Var.getImageReceiver().d = i;
                de0Var.f(f, rb0Var);
                l5Var.d.setVisibility(4);
                l5Var.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
                l5Var.setBackgroundDrawable(aob.L0(false));
                m.addView(l5Var, tre.o(-1, 50));
                l5Var.setOnClickListener(new c0(idVarArr, ucVar, fjVar, (byte) 4));
            }
        }
        idVar.S = ob6.M0(2131745399, null);
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(ob6.M0(2131752570, null), null);
        idVarArr[0] = idVar;
        return idVar;
    }

    public static void i0(Context context, int i, long j) {
        nx0 h = uh9.h(1, null, context, false);
        LinearLayout j2 = uh9.j(context, 1);
        j2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j2.addView(frameLayout, tre.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232789);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, tre.e(-1, -1, 17));
        int L = hl.L(80.0f);
        int i2 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.w0(null, i2, false));
        uob M = yob.M(i2);
        frameLayout2.setBackground(K);
        yob.j(frameLayout2, K, M, null, null);
        frameLayout.addView(frameLayout2, tre.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i3 = aob.G6;
        qd4.w(textView, i3, null, 1, 20.0f);
        textView.setText(ob6.M0(2131752605, null));
        textView.setGravity(17);
        TextView m = ik8.m(j2, textView, tre.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        yob.X(m, i3, null);
        m.setTextSize(1, 14.0f);
        uh9.r(null, null, 2131752606, new Object[]{wf3.k(i, j)}, m);
        m.setGravity(17);
        j2.addView(m, tre.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        c51 c51Var = new c51(null, context, true);
        c51Var.i(ob6.M0(2131752607, null), false, true);
        j2.addView(c51Var, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        h.O = j2;
        c51Var.setOnClickListener(new jh(i, c51Var, h, j));
        h.J();
        h.show();
    }

    public static id j(Context context, vnb vnbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131754236, null);
        id idVar = alertDialog$Builder.a;
        idVar.U = M0;
        int i = aob.L5;
        alertDialog$Builder.l(2131624116, 72, aob.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.j(ob6.M0(2131747027, null), new qg(context, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131751737, null), null);
        return idVar;
    }

    public static void j0(String str, e eVar) {
        String G;
        if (str != null && str.startsWith("FLOOD_WAIT") && eVar != null && eVar.getParentActivity() != null) {
            int intValue = Utilities.z(str).intValue();
            if (intValue < 60) {
                G = ob6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = ob6.G(intValue / 60, "Minutes", new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getParentActivity());
            String M0 = ob6.M0(2131689472, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.a0("FloodWaitTime", null, 2131750646, G);
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            eVar.showDialog(idVar, true, null);
        }
    }

    public static void k(Context context, vnb vnbVar, hj hjVar) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (context == null) {
            return;
        }
        int i = aob.j5;
        if (vnbVar != null) {
            w0 = vnbVar.f(i);
            w02 = vnbVar.f(aob.h5);
            vnbVar.f(aob.Aj);
            vnbVar.f(aob.Ej);
            vnbVar.f(aob.E8);
            vnbVar.f(aob.G8);
            vnbVar.f(aob.i6);
            w03 = vnbVar.f(aob.Ji);
            w04 = vnbVar.f(aob.Fi);
            w05 = vnbVar.f(aob.Hi);
        } else {
            w0 = aob.w0(null, i, false);
            w02 = aob.w0(null, aob.h5, false);
            aob.w0(null, aob.Aj, false);
            aob.w0(null, aob.Ej, false);
            aob.w0(null, aob.E8, false);
            aob.w0(null, aob.G8, false);
            aob.w0(null, aob.i6, false);
            w03 = aob.w0(null, aob.Ji, false);
            w04 = aob.w0(null, aob.Fi, false);
            w05 = aob.w0(null, aob.Hi, false);
        }
        int i2 = w04;
        int i3 = w05;
        int i4 = w02;
        int i5 = w03;
        z8d z8dVar = new z8d(context, vnbVar);
        ((nx0) z8dVar.b).w0 = false;
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        qi qiVar = new qi(context, vnbVar, iArr);
        qiVar.setMinValue(0);
        qiVar.setMaxValue(16);
        qiVar.setTextColor(w0);
        qiVar.setValue(0);
        qiVar.setFormatter(new pg(iArr, (byte) 0));
        ri riVar = new ri(context, qiVar, (byte) 0);
        riVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        riVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131753870, null));
        textView.setTextColor(w0);
        bs2.t(textView, 1, 20.0f);
        frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new q8((byte) 9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        riVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        si siVar = new si(context, true, true, false, (byte) 0);
        linearLayout.addView(qiVar, tre.l(1.0f, 0, 270));
        siVar.setPadding(0, 0, 0, 0);
        siVar.setGravity(17);
        siVar.setTextColor(i5);
        siVar.setTextSize(hl.L(14.0f));
        siVar.setTypeface(hl.o());
        int L = hl.L(8.0f);
        siVar.setBackgroundDrawable(aob.i0(L, L, L, L, i2, i3, i3));
        riVar.addView(siVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
        siVar.setText(ob6.M0(2131751399, null));
        qiVar.setOnValueChangedListener(new m0(siVar, (byte) 15));
        siVar.setOnClickListener(new cg(iArr, qiVar, hjVar, z8dVar, (byte) 1));
        nx0 nx0Var = (nx0) z8dVar.b;
        nx0Var.O = riVar;
        nx0Var.show();
        nx0Var.s0(i4);
        nx0Var.K(i4);
    }

    public static void k0(Context context, vnb vnbVar, int i, TL_stars.StarGift starGift, long j, Runnable runnable) {
        TLObject b2 = uc7.s1(i).b2(j);
        LinearLayout j2 = uh9.j(context, 1);
        j2.addView(new wta(context, starGift, b2), tre.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        yob.X(textView, aob.j5, vnbVar);
        textView.setTextSize(1, 16.0f);
        uh9.r(null, null, 2131749365, new Object[]{wf3.G(null, null, b2)}, textView);
        j2.addView(textView, tre.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        alertDialog$Builder.n(j2);
        alertDialog$Builder.j(ob6.M0(2131749366, null), new td(runnable, (byte) 1));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.o();
    }

    public static z8d l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, pcc pccVar, Runnable runnable, boolean z, boolean z2, vnb vnbVar) {
        int i;
        int i2;
        if (context == null) {
            return null;
        }
        z8d z8dVar = new z8d(context, vnbVar);
        ((nx0) z8dVar.b).w0 = false;
        hq7 hq7Var = new hq7(context, vnbVar);
        hq7Var.setTextOffset(hl.L(10.0f));
        hq7Var.setItemCount(5);
        hq7 hq7Var2 = new hq7(context, vnbVar);
        hq7Var2.setItemCount(5);
        hq7Var2.setTextOffset(-hl.L(10.0f));
        hq7 hq7Var3 = new hq7(context, vnbVar);
        hq7Var3.setItemCount(5);
        hq7Var3.setTextOffset(-hl.L(24.0f));
        ii iiVar = new ii(context, hq7Var, hq7Var2, hq7Var3);
        iiVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        iiVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        qd4.w(textView, aob.j5, vnbVar, 1, 20.0f);
        frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new q8((byte) 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        iiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i3 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i4 = calendar.get(5);
        int i5 = calendar.get(2);
        int i6 = calendar.get(1);
        int i7 = i6 + 1;
        xd xdVar = new xd(hq7Var3, i7, hq7Var, hq7Var2, i6, i5, i4);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(hq7Var, tre.l(0.25f, 0, 270));
        hq7Var.setMinValue(1);
        hq7Var.setMaxValue(31);
        hq7Var.setWrapSelectorWheel(false);
        hq7Var.setFormatter(new e((byte) 16));
        m0 m0Var = new m0(xdVar, (byte) 9);
        hq7Var.setOnScrollListener(m0Var);
        hq7Var2.setMinValue(0);
        hq7Var2.setMaxValue(11);
        hq7Var2.setWrapSelectorWheel(false);
        linearLayout.addView(hq7Var2, tre.l(0.5f, 0, 270));
        hq7Var2.setFormatter(new e((byte) 17));
        hq7Var2.setOnScrollListener(m0Var);
        hq7Var3.setMinValue(i3);
        hq7Var3.setMaxValue(i7);
        hq7Var3.setWrapSelectorWheel(false);
        hq7Var3.setFormatter(new yd(i7, (byte) 0));
        linearLayout.addView(hq7Var3, tre.l(0.25f, 0, 270));
        hq7Var3.setOnScrollListener(m0Var);
        if (tL_birthday != null) {
            hq7Var.setValue(tL_birthday.day);
            hq7Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                hq7Var3.setValue(tL_birthday.year);
            } else {
                hq7Var3.setValue(i7);
            }
        } else {
            hq7Var.setValue(calendar.get(5));
            hq7Var2.setValue(calendar.get(2));
            hq7Var3.setValue(i7);
        }
        xdVar.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            p66 p66Var = new p66(context, null);
            p66Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
            p66Var.setTextSize(1, 13.0f);
            yob.X(p66Var, aob.q5, vnbVar);
            yob.G(p66Var, aob.Xc, vnbVar);
            p66Var.setGravity(17);
            frameLayout2.addView(p66Var, tre.e(-2, -2, 17));
            iiVar.addView(frameLayout2, tre.o(-1, -2));
            int i8 = yac.t0;
            zd zdVar = new zd(i8, p66Var, (byte) 0);
            zdVar.run();
            jn7.f(i8).h(frameLayout2, jn7.k0, new te2(zdVar, (byte) 3));
            lv2.r(i8).D(false);
        }
        if (z) {
            c51 c51Var = new c51(vnbVar, context, false);
            c51Var.i(ob6.M0(2131751635, null), false, true);
            c51Var.setOnClickListener(new ae(hq7Var3, i7, xdVar, (byte) 0));
            iiVar.addView(c51Var, tre.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        textView2.setGravity(17);
        yob.X(textView2, aob.Ji, vnbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setText(str2);
        int L = hl.L(24.0f);
        int i9 = aob.Fi;
        int v0 = aob.v0(i9, vnbVar);
        int i10 = aob.Hi;
        int v02 = aob.v0(i10, vnbVar);
        hf0 i0 = aob.i0(L, L, L, L, v0, v02, v02);
        uob M = yob.M(i9);
        uob M2 = yob.M(i10);
        textView2.setBackground(i0);
        yob.j(textView2, i0, M, M2, vnbVar);
        iye.b(textView2, 0.02f, 1.2f);
        if (z) {
            i = 0;
        } else {
            i = 15;
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = 16;
        }
        iiVar.addView(textView2, tre.t(-1, 48, 83, 16, i, 16, i2));
        textView2.setOnClickListener(new be(hq7Var, hq7Var2, hq7Var3, i7, z8dVar, pccVar));
        if (z2) {
            c51 c51Var2 = new c51(vnbVar, context, false);
            c51Var2.i(ob6.M0(2131753708, null), false, true);
            c51Var2.f();
            c51Var2.setOnClickListener(new t(z8dVar, pccVar, (byte) 12));
            iiVar.addView(c51Var2, tre.t(-1, 48, 83, 16, 4, 16, 16));
        }
        ((nx0) z8dVar.b).O = iiVar;
        return z8dVar;
    }

    public static void l0(Context context, vnb vnbVar, String str, boolean z, final icc iccVar) {
        int i;
        if (!hl.C1(context)) {
            return;
        }
        final id[] idVarArr = new id[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131747506, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i2 = aob.j5;
        yob.X(textView, i2, vnbVar);
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(hl.L(14.0f), hl.L(12.0f), hl.L(14.0f), hl.L(12.0f));
        ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.p1(0.06f, aob.v0(i2, vnbVar)));
        uob K = yob.K(0.06f, i2);
        textView.setBackground(b0);
        yob.j(textView, b0, K, null, vnbVar);
        final sg2 sg2Var = new sg2(1, vnbVar, context);
        sg2Var.setMultiline(true);
        sg2Var.getTextView().getLayoutParams().width = -1;
        sg2Var.getTextView().setSingleLine(false);
        sg2Var.getTextView().setMaxLines(3);
        sg2Var.getTextView().setTextSize(1, 16.0f);
        if (z) {
            i = 2131752858;
        } else {
            i = 2131752857;
        }
        sg2Var.e(ob6.M0(i, null), "", false, false, false);
        sg2Var.setOnClickListener(new qd(sg2Var, (byte) 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, tre.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(sg2Var, tre.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.n(linearLayout);
        idVar.a = Math.min(hl.L(320.0f), (hl.q.x * 85) / 100);
        alertDialog$Builder.j(ob6.M0(2131747544, null), new fd() {
            @Override
            public final void w(id idVar2, int i3) {
                byte b = r4;
                id[] idVarArr2 = idVarArr;
                sg2 sg2Var2 = sg2Var;
                icc iccVar2 = iccVar;
                switch (b) {
                    case 0:
                        iccVar2.a(Boolean.TRUE, Boolean.valueOf(sg2Var2.b()));
                        id idVar3 = idVarArr2[0];
                        if (idVar3 != null) {
                            idVar3.dismiss();
                            return;
                        }
                        return;
                    default:
                        iccVar2.a(Boolean.FALSE, Boolean.valueOf(sg2Var2.b()));
                        id idVar4 = idVarArr2[0];
                        if (idVar4 != null) {
                            idVar4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.g(ob6.M0(2131752570, null), new fd() {
            @Override
            public final void w(id idVar2, int i3) {
                byte b = r4;
                id[] idVarArr2 = idVarArr;
                sg2 sg2Var2 = sg2Var;
                icc iccVar2 = iccVar;
                switch (b) {
                    case 0:
                        iccVar2.a(Boolean.TRUE, Boolean.valueOf(sg2Var2.b()));
                        id idVar3 = idVarArr2[0];
                        if (idVar3 != null) {
                            idVar3.dismiss();
                            return;
                        }
                        return;
                    default:
                        iccVar2.a(Boolean.FALSE, Boolean.valueOf(sg2Var2.b()));
                        id idVar4 = idVarArr2[0];
                        if (idVar4 != null) {
                            idVar4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        idVarArr[0] = alertDialog$Builder.o();
    }

    public static void m(org.telegram.ui.ActionBar.e r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.m(org.telegram.ui.ActionBar.e, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, l01 l01Var, TLRPC.WebPage webPage, vnb vnbVar) {
        String scheme;
        boolean z5;
        boolean z6;
        if (!hl.C1(context)) {
            return;
        }
        if (str == null) {
            scheme = null;
        } else {
            scheme = Uri.parse(str).getScheme();
        }
        if (!m01.h(str) && z3 && !"mailto".equalsIgnoreCase(scheme)) {
            String d = m01.d(str, z);
            re2 re2Var = new re2(context, str, j, z2, l01Var);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
            String M0 = ob6.M0(2131747506, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            TextView textView = new TextView(context);
            textView.setText(d);
            textView.setTextSize(1, 14.0f);
            int i = aob.j5;
            yob.X(textView, i, vnbVar);
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(hl.L(14.0f), hl.L(12.0f), hl.L(14.0f), hl.L(12.0f));
            ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.p1(0.06f, aob.v0(i, vnbVar)));
            uob K = yob.K(0.06f, i);
            textView.setBackground(b0);
            yob.j(textView, b0, K, null, vnbVar);
            LinearLayout j2 = uh9.j(context, 1);
            j2.addView(textView, tre.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i2 = yxc.f;
            if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                yxc yxcVar = new yxc(context, vnbVar);
                yxcVar.setWebPage(webPage);
                j2.addView(yxcVar, tre.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder.n(j2);
            idVar.a = Math.min(hl.L(320.0f), (hl.q.x * 85) / 100);
            alertDialog$Builder.j(ob6.M0(2131747544, null), new m0(re2Var, (byte) 16));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.o();
            return;
        }
        Uri parse = Uri.parse(str);
        if (j == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$")) {
            z6 = true;
        } else {
            z6 = false;
        }
        m01.t(context, parse, z5, z2, z6, l01Var, null, false, true, false, false);
    }

    public static void n(e eVar, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ?? r5;
        Context context = eVar.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        p66 p66Var = new p66(context, null);
        jn7.i(p66Var);
        yob.X(p66Var, aob.j5, null);
        yob.G(p66Var, aob.Xc, null);
        p66Var.setTextSize(1, 16.0f);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        p66Var.setGravity(i | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        id idVar = alertDialog$Builder.a;
        idVar.H = (byte) 6;
        alertDialog$Builder.n(frameLayout);
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.s(hl.L(18.0f));
        de0 de0Var = new de0(context);
        de0Var.setRoundRadius(hl.L(20.0f));
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        frameLayout.addView(de0Var, tre.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        ema emaVar = new ema(context);
        yob.W(emaVar, aob.E8, null);
        emaVar.setTextSize(20);
        emaVar.setTypeface(hl.o());
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        emaVar.setGravity(i3 | 16);
        emaVar.setEllipsizeByGradient(true);
        emaVar.l(user.first_name, false);
        if (user.scam) {
            emaVar.i(aob.f1);
        } else if (user.fake) {
            emaVar.i(aob.g1);
        } else if (user.verified) {
            Drawable e = c00.e(context, 2131232815);
            int i11 = aob.z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.x(emaVar, e, i11, null, mode);
            Drawable e2 = c00.e(context, 2131232816);
            yob.x(emaVar, e2, aob.A9, null, mode);
            emaVar.i(new zm2(e, e2));
        }
        TextView textView = new TextView(context);
        yob.X(textView, aob.m5, null);
        ik8.w(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (ob6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        textView.setGravity(i4 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new sd(user, eVar, alertDialog$Builder, (byte) 0));
        SpannableString valueOf = SpannableString.valueOf(ob6.M0(2131748089, null).concat("  "));
        wm2 wm2Var = new wm2(2131230875, 0);
        wm2Var.n = 1;
        wm2Var.c(hl.L(10.0f));
        valueOf.setSpan(wm2Var, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z = ob6.a0;
        if (z) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        int i12 = i5 | 48;
        int i13 = 76;
        if (z) {
            i6 = 21;
        } else {
            i6 = 76;
        }
        float f = i6;
        if (z) {
            i7 = 76;
        } else {
            i7 = 21;
        }
        frameLayout.addView(emaVar, tre.d(-1, -2.0f, i12, f, 0.0f, i7, 0.0f));
        boolean z2 = ob6.a0;
        if (z2) {
            i8 = 5;
        } else {
            i8 = 3;
        }
        int i14 = i8 | 48;
        if (z2) {
            i9 = 21;
        } else {
            i9 = 76;
        }
        float f2 = i9;
        if (!z2) {
            i13 = 21;
        }
        frameLayout.addView(textView, tre.d(-1, -2.0f, i14, f2, 24.0f, i13, 0.0f));
        if (ob6.a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(p66Var, tre.d(-2, -2.0f, i10 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (lbc.B(user)) {
            rb0Var.p = 0.8f;
            rb0Var.f(12);
            r5 = 0;
            de0Var.m(null, null, rb0Var, user);
        } else {
            r5 = 0;
            rb0Var.p = 1.0f;
            eVar.getCurrentAccount();
            rb0Var.q(user);
            de0Var.f(user, rb0Var);
        }
        alertDialog$Builder.j(ob6.M0(2131744572, r5), new td(runnable, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131752570, r5), r5);
        eVar.showDialog(idVar, false, new ud(runnable2, (byte) 0));
        p66Var.setText(hl.N2(ob6.M0(2131752877, r5), -1, 0, new vd(idVar, context, (byte) 0), r5));
    }

    public static void n0(e eVar, String str, boolean z, boolean z2) {
        o0(eVar, str, z, true, z2, false, null, null, null);
    }

    public static z8d o(Activity activity, df7 df7Var, vnb vnbVar) {
        if (activity == null) {
            return null;
        }
        z8d z8dVar = new z8d(activity, vnbVar);
        ((nx0) z8dVar.b).w0 = false;
        hq7 hq7Var = new hq7(activity, vnbVar);
        hq7Var.setTextOffset(hl.L(10.0f));
        hq7Var.setItemCount(5);
        hq7 hq7Var2 = new hq7(activity, vnbVar);
        hq7Var2.setItemCount(5);
        hq7Var2.setTextOffset(-hl.L(10.0f));
        hq7 hq7Var3 = new hq7(activity, vnbVar);
        hq7Var3.setItemCount(5);
        hq7Var3.setTextOffset(-hl.L(24.0f));
        ai aiVar = new ai(activity, hq7Var, hq7Var2, hq7Var3, (byte) 6);
        aiVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        aiVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(ob6.M0(2131752097, null));
        qd4.w(textView, aob.j5, vnbVar, 1, 20.0f);
        frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new q8((byte) 10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        aiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        xb xbVar = new xb(activity, (byte) 7);
        linearLayout.addView(hq7Var, tre.l(0.25f, 0, 270));
        hq7Var.setMinValue(1);
        hq7Var.setMaxValue(31);
        hq7Var.setWrapSelectorWheel(false);
        hq7Var.setFormatter(new bg((byte) 11));
        rf rfVar = new rf(hq7Var, hq7Var2, hq7Var3, (byte) 2);
        hq7Var.setOnValueChangedListener(rfVar);
        hq7Var2.setMinValue(0);
        hq7Var2.setMaxValue(11);
        hq7Var2.setWrapSelectorWheel(false);
        linearLayout.addView(hq7Var2, tre.l(0.5f, 0, 270));
        hq7Var2.setFormatter(new bg((byte) 12));
        hq7Var2.setOnValueChangedListener(rfVar);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = calendar.get(1);
        hq7Var3.setMinValue(i);
        hq7Var3.setMaxValue(i2);
        hq7Var3.setWrapSelectorWheel(false);
        hq7Var3.setFormatter(new bg((byte) 13));
        linearLayout.addView(hq7Var3, tre.l(0.25f, 0, 270));
        hq7Var3.setOnValueChangedListener(rfVar);
        hq7Var.setValue(31);
        hq7Var2.setValue(12);
        hq7Var3.setValue(i2);
        b(hq7Var, hq7Var2, hq7Var3);
        xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        xbVar.setGravity(17);
        yob.X(xbVar, aob.Ji, vnbVar);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(hl.o());
        xbVar.setText(ob6.M0(2131748819, null));
        int L = hl.L(8.0f);
        int i3 = aob.Fi;
        int v0 = aob.v0(i3, vnbVar);
        int i4 = aob.Hi;
        int v02 = aob.v0(i4, vnbVar);
        hf0 i0 = aob.i0(L, L, L, L, v0, v02, v02);
        uob M = yob.M(i3);
        uob M2 = yob.M(i4);
        xbVar.setBackground(i0);
        yob.j(xbVar, i0, M, M2, vnbVar);
        aiVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new xf(hq7Var, hq7Var2, hq7Var3, calendar, df7Var, z8dVar, (byte) 2));
        ((nx0) z8dVar.b).O = aiVar;
        return z8dVar;
    }

    public static void o0(e eVar, String str, boolean z, boolean z2, boolean z3, boolean z4, l01 l01Var, TLRPC.WebPage webPage, vnb vnbVar) {
        long j;
        if (eVar != null && eVar.getParentActivity() != null) {
            if (eVar instanceof zu1) {
                j = ((zu1) eVar).x8;
            } else {
                j = 0;
            }
            m0(eVar.getParentActivity(), str, z, z2, z3, z4, j, l01Var, webPage, vnbVar);
        }
    }

    public static void p(e eVar, TLRPC.User user, boolean z) {
        String M0;
        String a0;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (eVar.getParentActivity() != null && user != null && !lbc.z(user) && yac.h(eVar.getCurrentAccount()).e() != user.id) {
            eVar.getCurrentAccount();
            Activity parentActivity = eVar.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z) {
                M0 = ob6.M0(2131743264, null);
                a0 = ob6.a0("VideoCallAlert", null, 2131743265, lbc.r(user));
            } else {
                M0 = ob6.M0(2131752612, null);
                a0 = ob6.a0("CallAlert", null, 2131752613, lbc.r(user));
            }
            TextView textView = new TextView(parentActivity);
            jn7.i(textView);
            yob.X(textView, aob.j5, null);
            textView.setTextSize(1, 16.0f);
            int i6 = 3;
            if (ob6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i | 48);
            textView.setText(hl.S2(a0));
            rb0 rb0Var = new rb0((vnb) null);
            rb0Var.s(hl.L(12.0f));
            rb0Var.p = 1.0f;
            eVar.getCurrentAccount();
            rb0Var.q(user);
            de0 de0Var = new de0(parentActivity);
            de0Var.setRoundRadius(hl.L(20.0f));
            de0Var.f(user, rb0Var);
            if (ob6.a0) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            frameLayout.addView(de0Var, tre.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            qd4.w(textView2, aob.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (ob6.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView2.setGravity(i3 | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(M0);
            boolean z2 = ob6.a0;
            if (z2) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            int i7 = i4 | 48;
            int i8 = 76;
            if (z2) {
                i5 = 21;
            } else {
                i5 = 76;
            }
            float f = i5;
            if (!z2) {
                i8 = 21;
            }
            frameLayout.addView(textView2, tre.d(-1, -2.0f, i7, f, 11.0f, i8, 0.0f));
            if (ob6.a0) {
                i6 = 5;
            }
            frameLayout.addView(textView, tre.d(-2, -2.0f, i6 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.j(ob6.M0(2131752615, null), new bh(eVar, user, z, (byte) 0));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            eVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void p0(Activity activity, int i, Runnable runnable, boolean z, vnb vnbVar) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = uc7.s1(i).g3;
        if ((i2 & 1) != 0) {
            c00.s(null, 2131748440, arrayList, 0, arrayList2);
        }
        if ((i2 & 2) != 0) {
            c00.s(null, 2131748442, arrayList, 1, arrayList2);
        }
        if ((i2 & 4) != 0) {
            c00.s(null, 2131748438, arrayList, 3, arrayList2);
        }
        arrayList.add(ob6.M0(2131748441, null));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        alertDialog$Builder.a.S = ob6.M0(2131748439, null);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            j29 j29Var = new j29(activity, vnbVar);
            j29Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            j29Var.setTag(Integer.valueOf(i3));
            a(j29Var, aob.g7, aob.E5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i3);
            if (xea.l0 == ((Integer) arrayList2.get(i3)).intValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            j29Var.b(charSequence, z2);
            int i4 = aob.i6;
            hf0 f0 = aob.f0(aob.w0(null, i4, false), 2, -1);
            uob M = yob.M(i4);
            j29Var.setBackground(f0);
            yob.j(j29Var, f0, null, M, null);
            linearLayout.addView(j29Var);
            j29Var.setOnClickListener(new c0(arrayList2, runnable, alertDialog$Builder, (byte) 2));
        }
        if (!z) {
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        }
        id o = alertDialog$Builder.o();
        if (z) {
            o.setCanceledOnTouchOutside(false);
        }
    }

    public static void q(org.telegram.ui.ActionBar.e r32, int r33, org.telegram.tgnet.TLRPC.User r34, org.telegram.tgnet.TLRPC.Chat r35, boolean r36, defpackage.bf7 r37, defpackage.vnb r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.q(org.telegram.ui.ActionBar.e, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, bf7, vnb):void");
    }

    public static void q0(int i, vnb vnbVar, e eVar) {
        if (i != 0 && eVar != null && eVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, eVar.getParentActivity());
            String M0 = ob6.M0(2131743571, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            if (i == 1) {
                idVar.U = ob6.M0(2131751052, null);
            } else if (i == 2) {
                idVar.U = ob6.M0(2131751064, null);
            } else if (i == 3) {
                idVar.U = ob6.M0(2131751058, null);
            } else if (i == 4) {
                idVar.U = ob6.M0(2131751051, null);
            } else if (i == 5) {
                idVar.U = ob6.M0(2131751063, null);
            } else if (i == 6) {
                idVar.U = ob6.M0(2131751057, null);
            } else if (i == 7) {
                idVar.U = ob6.M0(2131751055, null);
            } else if (i == 8) {
                idVar.U = ob6.M0(2131751056, null);
            } else if (i == 9) {
                idVar.U = ob6.M0(2131751047, null);
            } else if (i == 10) {
                idVar.U = ob6.M0(2131751059, null);
            } else if (i == 11) {
                idVar.U = ob6.M0(2131751048, null);
            } else if (i == 12) {
                idVar.U = ob6.M0(2131751060, null);
            } else if (i == 13) {
                idVar.U = ob6.M0(2131751045, null);
            } else if (i == 14) {
                idVar.U = ob6.M0(2131751046, null);
            } else if (i == 15) {
                idVar.U = ob6.M0(2131751053, null);
            } else if (i == 16) {
                idVar.U = ob6.M0(2131751054, null);
            } else if (i == 17) {
                idVar.U = ob6.M0(2131751065, null);
            } else if (i == 18) {
                idVar.U = ob6.M0(2131751066, null);
            } else if (i == 19) {
                idVar.U = ob6.M0(2131751061, null);
            } else if (i == 20) {
                idVar.U = ob6.M0(2131751062, null);
            } else if (i == 21) {
                idVar.U = ob6.M0(2131751049, null);
            } else if (i == 22) {
                idVar.U = ob6.M0(2131751050, null);
            }
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            eVar.showDialog(idVar, true, null);
        }
    }

    public static void r(e eVar, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, boolean z4, boolean z5, bf7 bf7Var) {
        vnb vnbVar;
        if (eVar != null) {
            vnbVar = eVar.getResourceProvider();
        } else {
            vnbVar = null;
        }
        s(eVar, z, false, chat, user, z2, z3, z4, z5, bf7Var, vnbVar);
    }

    public static id r0(e eVar, String str, String str2, vnb vnbVar) {
        if (eVar == null) {
            eVar = LaunchActivity.S();
        }
        if (str2 != null && eVar != null && eVar.getParentActivity() != null) {
            id idVar = L(eVar.getParentActivity(), str, str2, null, null, vnbVar).a;
            eVar.showDialog(idVar);
            return idVar;
        }
        return null;
    }

    public static void s(final org.telegram.ui.ActionBar.e r44, final boolean r45, final boolean r46, final org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final defpackage.bf7 r53, final defpackage.vnb r54) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.s(org.telegram.ui.ActionBar.e, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, bf7, vnb):void");
    }

    public static id s0(e eVar, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
        TextView textView;
        id M = M(eVar.getContext(), eVar.getResourceProvider(), str, charSequence, str2, runnable);
        eVar.showDialog(M);
        if (z && (textView = (TextView) M.c(-1)) != null) {
            yob.X(textView, aob.q7, null);
        }
        return M;
    }

    public static id t(Activity activity, final long j, final long j2, final int i, final Runnable runnable, vnb vnbVar) {
        int i2;
        boolean z;
        SharedPreferences sharedPreferences = uc7.s1(yac.t0).W3;
        final String p = ip7.p(j, j2, false);
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 != 0) {
            if (sharedPreferences.contains("color_" + p)) {
                i2 = qu6.g("color_", p, sharedPreferences, -16776961);
            } else if (wf3.y(j)) {
                i2 = sharedPreferences.getInt("GroupLed", -16776961);
            } else {
                i2 = sharedPreferences.getInt("MessagesLed", -16776961);
            }
        } else if (i == 1) {
            i2 = sharedPreferences.getInt("MessagesLed", -16776961);
        } else if (i == 0) {
            i2 = sharedPreferences.getInt("GroupLed", -16776961);
        } else if (i == 3) {
            i2 = sharedPreferences.getInt("StoriesLed", -16776961);
        } else if (i != 5 && i != 4) {
            i2 = sharedPreferences.getInt("ChannelLed", -16776961);
        } else {
            i2 = sharedPreferences.getInt("ReactionsLed", -16776961);
        }
        LinearLayout m = bs2.m(activity, 1);
        String[] strArr = {ob6.M0(2131751977, null), ob6.M0(2131751982, null), ob6.M0(2131751971, null), ob6.M0(2131751983, null), ob6.M0(2131751984, null), ob6.M0(2131751985, null), ob6.M0(2131751973, null), ob6.M0(2131751978, null), ob6.M0(2131751972, null)};
        final int[] iArr = {i2};
        for (int i4 = 0; i4 < 9; i4++) {
            j29 j29Var = new j29(activity, vnbVar);
            j29Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
            j29Var.setTag(Integer.valueOf(i4));
            int i5 = ykb.e[i4];
            j29Var.a(i5, i5);
            String str = strArr[i4];
            if (i2 == ykb.f[i4]) {
                z = true;
            } else {
                z = false;
            }
            j29Var.b(str, z);
            m.addView(j29Var);
            j29Var.setOnClickListener(new nf(m, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        String M0 = ob6.M0(2131748743, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(ob6.M0(2131745278, null), new fd() {
            @Override
            public final void w(id idVar2, int i6) {
                SharedPreferences.Editor edit = uc7.s1(yac.t0).W3.edit();
                long j3 = j;
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i7 != 0) {
                    edit.putInt(c00.i("color_", p), iArr2[0]);
                    ip7.n(yac.t0).f(j3, j2);
                } else {
                    int i8 = i;
                    if (i8 == 1) {
                        edit.putInt("MessagesLed", iArr2[0]);
                    } else if (i8 == 0) {
                        edit.putInt("GroupLed", iArr2[0]);
                    } else if (i8 == 3) {
                        edit.putInt("StoriesLed", iArr2[0]);
                    } else if (i8 != 5 && i8 != 4) {
                        edit.putInt("ChannelLed", iArr2[0]);
                    } else {
                        edit.putInt("ReactionLed", iArr2[0]);
                    }
                    ip7.n(yac.t0).g(i8);
                }
                edit.commit();
                runnable.run();
            }
        });
        alertDialog$Builder.h(ob6.M0(2131748742, null), new lf(j, i, runnable, (byte) 1));
        if (i3 != 0) {
            alertDialog$Builder.g(ob6.M0(2131751565, null), new o(p, runnable, (byte) 5));
        }
        return idVar;
    }

    public static void t0(String str, e eVar) {
        Context context;
        if (str == null) {
            return;
        }
        if (eVar != null && eVar.getParentActivity() != null) {
            context = eVar.getParentActivity();
        } else {
            context = a.b;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static void u(e eVar, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getParentActivity());
        String M0 = ob6.M0(2131751753, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.a0("ContactNotRegistered", null, 2131751754, lv2.m(0, str, str2));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131748928, null), new ze((byte) 0, str3, eVar));
        eVar.showDialog(idVar);
    }

    public static id u0(Context context, String str, boolean z) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = ob6.M0(2131689472, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = str;
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        if (z) {
            alertDialog$Builder.g(ob6.M0(2131743476, null), new qg(context, (byte) 1));
        }
        return alertDialog$Builder.o();
    }

    public static AlertDialog$Builder v(Activity activity, final df7 df7Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i = aob.L5;
        alertDialog$Builder.l(2131624118, 72, aob.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.a.U = hl.S2(ob6.M0(2131751739, null));
        alertDialog$Builder.j(ob6.M0(2131751738, null), new fd() {
            @Override
            public final void w(id idVar, int i2) {
                byte b = r2;
                df7 df7Var2 = df7Var;
                switch (b) {
                    case 0:
                        df7Var2.a(1);
                        return;
                    default:
                        df7Var2.a(0);
                        return;
                }
            }
        });
        alertDialog$Builder.g(ob6.M0(2131751737, null), new fd() {
            @Override
            public final void w(id idVar, int i2) {
                byte b = r2;
                df7 df7Var2 = df7Var;
                switch (b) {
                    case 0:
                        df7Var2.a(1);
                        return;
                    default:
                        df7Var2.a(0);
                        return;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void v0(hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, hq7Var2.getValue());
        calendar.set(1, hq7Var3.getValue());
        hq7Var.setMinValue(1);
        hq7Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static AlertDialog$Builder w(Context context, int i, int i2, int i3, int i4, int i5, int i6, String str, final boolean z, bf bfVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final hq7 hq7Var = new hq7(context, null);
        final hq7 hq7Var2 = new hq7(context, null);
        final hq7 hq7Var3 = new hq7(context, null);
        linearLayout.addView(hq7Var2, tre.l(0.3f, 0, -2));
        hq7Var2.setOnScrollListener(new eq7() {
            @Override
            public final void b(int i7) {
                byte b = r5;
                hq7 hq7Var4 = hq7Var3;
                hq7 hq7Var5 = hq7Var;
                hq7 hq7Var6 = hq7Var2;
                boolean z2 = z;
                switch (b) {
                    case 0:
                        if (z2 && i7 == 0) {
                            jj.d(hq7Var6, hq7Var5, hq7Var4);
                            return;
                        }
                        return;
                    case 1:
                        if (z2 && i7 == 0) {
                            jj.d(hq7Var6, hq7Var5, hq7Var4);
                            return;
                        }
                        return;
                    default:
                        if (z2 && i7 == 0) {
                            jj.d(hq7Var6, hq7Var5, hq7Var4);
                            return;
                        }
                        return;
                }
            }
        });
        hq7Var.setMinValue(0);
        hq7Var.setMaxValue(11);
        linearLayout.addView(hq7Var, tre.l(0.3f, 0, -2));
        hq7Var.setFormatter(new e((byte) 22));
        hq7Var.setOnValueChangedListener(new rf(hq7Var2, hq7Var, hq7Var3, (byte) 0));
        hq7Var.setOnScrollListener(new eq7() {
            @Override
            public final void b(int i7) {
                byte b = r5;
                hq7 hq7Var4 = hq7Var3;
                hq7 hq7Var5 = hq7Var;
                hq7 hq7Var6 = hq7Var2;
                boolean z2 = z;
                switch (b) {
                    case 0:
                        if (z2 && i7 == 0) {
                            jj.d(hq7Var6, hq7Var5, hq7Var4);
                            return;
                        }
                        return;
                    case 1:
                        if (z2 && i7 == 0) {
                            jj.d(hq7Var6, hq7Var5, hq7Var4);
                            return;
                        }
                        return;
                    default:
                        if (z2 && i7 == 0) {
                            jj.d(hq7Var6, hq7Var5, hq7Var4);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i7 = calendar.get(1);
        hq7Var3.setMinValue(i + i7);
        hq7Var3.setMaxValue(i2 + i7);
        hq7Var3.setValue(i7 + i3);
        linearLayout.addView(hq7Var3, tre.l(0.4f, 0, -2));
        hq7Var3.setOnValueChangedListener(new rf(hq7Var2, hq7Var, hq7Var3, (byte) 1));
        hq7Var3.setOnScrollListener(new eq7() {
            @Override
            public final void b(int i72) {
                byte b = r5;
                hq7 hq7Var4 = hq7Var3;
                hq7 hq7Var5 = hq7Var;
                hq7 hq7Var6 = hq7Var2;
                boolean z2 = z;
                switch (b) {
                    case 0:
                        if (z2 && i72 == 0) {
                            jj.d(hq7Var6, hq7Var5, hq7Var4);
                            return;
                        }
                        return;
                    case 1:
                        if (z2 && i72 == 0) {
                            jj.d(hq7Var6, hq7Var5, hq7Var4);
                            return;
                        }
                        return;
                    default:
                        if (z2 && i72 == 0) {
                            jj.d(hq7Var6, hq7Var5, hq7Var4);
                            return;
                        }
                        return;
                }
            }
        });
        v0(hq7Var2, hq7Var, hq7Var3);
        if (z) {
            d(hq7Var2, hq7Var, hq7Var3);
        }
        if (i4 != -1) {
            hq7Var2.setValue(i4);
            hq7Var.setValue(i5);
            hq7Var3.setValue(i6);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.j(ob6.M0(2131745278, null), new sf(z, hq7Var2, hq7Var, hq7Var3, bfVar));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        return alertDialog$Builder;
    }

    public static void x(Context context, String str, String str2, long j, hj hjVar) {
        if (context == null) {
            return;
        }
        int w0 = aob.w0(null, aob.j5, false);
        int w02 = aob.w0(null, aob.h5, false);
        aob.w0(null, aob.Aj, false);
        aob.w0(null, aob.Ej, false);
        aob.w0(null, aob.E8, false);
        aob.w0(null, aob.G8, false);
        aob.w0(null, aob.i6, false);
        int w03 = aob.w0(null, aob.Ji, false);
        int w04 = aob.w0(null, aob.Fi, false);
        int w05 = aob.w0(null, aob.Hi, false);
        z8d z8dVar = new z8d(context, (vnb) null);
        ((nx0) z8dVar.b).w0 = false;
        hq7 hq7Var = new hq7(context, null);
        hq7Var.setTextColor(w0);
        hq7Var.setTextOffset(hl.L(10.0f));
        hq7Var.setItemCount(5);
        hq7 hq7Var2 = new hq7(context, null);
        hq7Var2.setItemCount(5);
        hq7Var2.setTextColor(w0);
        hq7Var2.setTextOffset(-hl.L(10.0f));
        hq7 hq7Var3 = new hq7(context, null);
        hq7Var3.setItemCount(5);
        hq7Var3.setTextColor(w0);
        hq7Var3.setTextOffset(-hl.L(34.0f));
        hq7 hq7Var4 = hq7Var;
        ai aiVar = new ai(context, hq7Var4, hq7Var2, hq7Var3, (byte) 2);
        aiVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        aiVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(w0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new q8((byte) 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        aiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        xb xbVar = new xb(context, (byte) 2);
        linearLayout.addView(hq7Var4, tre.l(0.5f, 0, 270));
        hq7Var4.setMinValue(0);
        hq7Var4.setMaxValue(365);
        hq7Var4.setWrapSelectorWheel(false);
        hq7Var4.setFormatter(new e((byte) 25));
        ie ieVar = new ie(hq7Var4, hq7Var2, hq7Var3, (byte) 1);
        hq7Var4.setOnValueChangedListener(ieVar);
        hq7Var2.setMinValue(0);
        hq7Var2.setMaxValue(23);
        linearLayout.addView(hq7Var2, tre.l(0.2f, 0, 270));
        hq7Var2.setFormatter(new e((byte) 26));
        hq7Var2.setOnValueChangedListener(ieVar);
        hq7Var3.setMinValue(0);
        hq7Var3.setMaxValue(59);
        hq7Var3.setValue(0);
        hq7Var3.setFormatter(new e((byte) 27));
        linearLayout.addView(hq7Var3, tre.l(0.3f, 0, 270));
        hq7Var3.setOnValueChangedListener(ieVar);
        if (j > 0 && j != 2147483646) {
            long j2 = j * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                hq7Var3.setValue(calendar.get(12));
                hq7Var2.setValue(calendar.get(11));
                hq7Var4 = hq7Var4;
                hq7Var4.setValue(timeInMillis);
            } else {
                hq7Var4 = hq7Var4;
            }
        }
        g(null, null, 0L, 0L, 0, hq7Var4, hq7Var2, hq7Var3);
        xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(w03);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(hl.o());
        int L = hl.L(8.0f);
        xbVar.setBackgroundDrawable(aob.i0(L, L, L, L, w04, w05, w05));
        xbVar.setText(str2);
        aiVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
        xbVar.setOnClickListener(new xf(hq7Var4, hq7Var2, hq7Var3, calendar, hjVar, z8dVar, (byte) 0));
        nx0 nx0Var = (nx0) z8dVar.b;
        nx0Var.O = aiVar;
        nx0Var.show();
        nx0Var.s0(w02);
        nx0Var.K(w02);
    }

    public static void y(final org.telegram.ui.ActionBar.e r44, final org.telegram.tgnet.TLRPC.User r45, final org.telegram.tgnet.TLRPC.Chat r46, final org.telegram.tgnet.TLRPC.EncryptedChat r47, final org.telegram.tgnet.TLRPC.ChatFull r48, final long r49, final defpackage.r47 r51, final android.util.SparseArray[] r52, final defpackage.m47 r53, final int r54, final int r55, org.telegram.tgnet.TLRPC.ChannelParticipant[] r56, final java.lang.Runnable r57, final defpackage.hm1 r58, final defpackage.vnb r59) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.y(org.telegram.ui.ActionBar.e, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, r47, android.util.SparseArray[], m47, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, hm1, vnb):void");
    }

    public static id z(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String M0 = ob6.M0(2131748471, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131748472, null);
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131748474, null), new pd(launchActivity, (byte) 2));
        return idVar;
    }
}
