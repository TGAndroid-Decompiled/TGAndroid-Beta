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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public abstract class ik {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static he A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder S2 = gm.S2(jb6.M0(2131747037, null));
        he heVar = alertDialog$Builder.a;
        heVar.U = S2;
        int i = cmb.K5;
        alertDialog$Builder.l(2131624120, 72, cmb.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.j(jb6.M0(2131747033, null), new mi(activity, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131751709, null), null);
        return heVar;
    }

    public static he B(Activity activity, boolean z, TLRPC.User user, we7 we7Var, ylb ylbVar) {
        int i;
        int i2;
        int w0;
        boolean z2;
        int[] iArr = new int[1];
        String[] strArr = {jb6.M0(2131745351, null), jb6.M0(2131745350, null), jb6.M0(2131745349, null), jb6.M0(2131745348, null)};
        LinearLayout l = td4.l(activity, 1);
        l.setPadding(0, 0, 0, gm.L(4.0f));
        TextView textView = new TextView(activity);
        if (z) {
            textView.setText(jb6.M0(2131748601, null));
        } else if (user != null) {
            textView.setText(jb6.a0(null, null, 2131748598, m9c.k(user, true)));
        } else {
            textView.setText(jb6.M0(2131748599, null));
        }
        anb.X(textView, cmb.i5, ylbVar);
        textView.setTextSize(1, 16.0f);
        int i3 = 3;
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 48);
        if (jb6.a0) {
            i3 = 5;
        }
        int i4 = i3 | 48;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        l.addView(textView, qoe.t(-2, -2, i4, 24, i2, 24, 8));
        for (int i5 = 0; i5 < 4; i5++) {
            x09 x09Var = new x09(activity, ylbVar);
            x09Var.d = (byte) 42;
            x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            x09Var.setTag(Integer.valueOf(i5));
            a(x09Var, cmb.f7, cmb.D5, ylbVar);
            String str = strArr[i5];
            if (iArr[0] == i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            x09Var.b(str, z2);
            l.addView(x09Var);
            x09Var.setOnClickListener(new bg(iArr, l));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        he heVar = alertDialog$Builder.a;
        if (z) {
            heVar.S = jb6.M0(2131748600, null);
        } else {
            int i6 = cmb.K5;
            if (ylbVar != null) {
                w0 = ylbVar.f(i6);
            } else {
                w0 = cmb.w0(null, i6, false);
            }
            heVar.c0 = new xca(activity, 0);
            heVar.d0 = w0;
            heVar.e0 = -1;
            if (ylbVar == null) {
                alertDialog$Builder.m(i6, null);
            }
        }
        alertDialog$Builder.n(l);
        alertDialog$Builder.j(jb6.M0(2131745193, null), new o(iArr, we7Var, (byte) 5));
        alertDialog$Builder.h(jb6.M0(2131752542, null), null);
        return heVar;
    }

    public static my0 C(final long j, final long j2, final ylb ylbVar, final d dVar) {
        if (dVar.getParentActivity() == null) {
            return null;
        }
        my0 i = wi8.i(dVar.getParentActivity(), false, 1, ylbVar);
        i.P = jb6.M0(2131747657, null);
        i.Q = true;
        CharSequence[] charSequenceArr = {jb6.a0("MuteFor", null, 2131748069, jb6.G(1, "Hours", new Object[0])), jb6.a0("MuteFor", null, 2131748069, jb6.G(8, "Hours", new Object[0])), jb6.a0("MuteFor", null, 2131748069, jb6.G(2, "Days", new Object[0])), jb6.M0(2131748070, null)};
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
                lo7.n(z8c.t0).T(j, i3, j2);
                d dVar2 = dVar;
                if (c41.a(dVar2)) {
                    c41.z(dVar2, i3, 0, ylbVar).j();
                }
            }
        };
        i.M = charSequenceArr;
        i.L = onClickListener;
        return i;
    }

    public static void D(Context context, ylb ylbVar, gk gkVar) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (context == null) {
            return;
        }
        int i = cmb.i5;
        if (ylbVar != null) {
            w0 = ylbVar.f(i);
            w02 = ylbVar.f(cmb.g5);
            ylbVar.f(cmb.zj);
            ylbVar.f(cmb.Dj);
            ylbVar.f(cmb.D8);
            ylbVar.f(cmb.F8);
            ylbVar.f(cmb.h6);
            w03 = ylbVar.f(cmb.Ii);
            w04 = ylbVar.f(cmb.Ei);
            w05 = ylbVar.f(cmb.Gi);
        } else {
            w0 = cmb.w0(null, i, false);
            w02 = cmb.w0(null, cmb.g5, false);
            cmb.w0(null, cmb.zj, false);
            cmb.w0(null, cmb.Dj, false);
            cmb.w0(null, cmb.D8, false);
            cmb.w0(null, cmb.F8, false);
            cmb.w0(null, cmb.h6, false);
            w03 = cmb.w0(null, cmb.Ii, false);
            w04 = cmb.w0(null, cmb.Ei, false);
            w05 = cmb.w0(null, cmb.Gi, false);
        }
        int i2 = w04;
        int i3 = w05;
        k6d k6dVar = new k6d(context, ylbVar);
        Object obj = k6dVar.b;
        ((my0) obj).w0 = false;
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        vj vjVar = new vj(context, ylbVar, iArr);
        vjVar.setMinValue(0);
        vjVar.setMaxValue(20);
        vjVar.setTextColor(w0);
        vjVar.setValue(0);
        vjVar.setFormatter(new df(iArr, (byte) 0));
        qj qjVar = new qj(context, vjVar, (byte) 1);
        qjVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        qjVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131748067, null));
        textView.setTextColor(w0);
        ts2.s(textView, 1, 20.0f);
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        qjVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        wb wbVar = new wb(context, (byte) 6);
        linearLayout.addView(vjVar, qoe.l(1.0f, 0, 270));
        vjVar.setOnValueChangedListener(new c((byte) 17));
        wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        wbVar.setGravity(17);
        wbVar.setTextColor(w03);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gm.o());
        int L = gm.L(8.0f);
        wbVar.setBackgroundDrawable(cmb.i0(L, L, L, L, i2, i3, i3));
        wbVar.setText(jb6.M0(2131753831, null));
        qjVar.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
        wbVar.setOnClickListener(new ef(iArr, vjVar, gkVar, k6dVar, (byte) 0));
        my0 my0Var = (my0) obj;
        my0Var.O = qjVar;
        my0Var.show();
        my0Var.s0(w02);
        my0Var.K(w02);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        HashMap hashMap = new HashMap();
        int i = cmb.K5;
        hashMap.put("info1", Integer.valueOf(cmb.w0(null, i, false)));
        hashMap.put("info2", Integer.valueOf(cmb.w0(null, i, false)));
        alertDialog$Builder.l(2131624108, 52, cmb.w0(null, i, false), hashMap);
        alertDialog$Builder.m(i, null);
        heVar.X = true;
        alertDialog$Builder.j(jb6.M0(2131751978, null), null);
        heVar.U = str2;
        return alertDialog$Builder;
    }

    public static he F(Activity activity, long j, final long j2, int i, final Runnable runnable, ylb ylbVar) {
        int i2;
        int i3;
        char c;
        CharSequence[] charSequenceArr;
        boolean z;
        final long j3 = j;
        final int i4 = i;
        final SharedPreferences sharedPreferences = oc7.r1(z8c.t0).W3;
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
            charSequenceArr = new String[]{jb6.M0(2131747613, null), jb6.M0(2131747615, null), jb6.M0(2131747614, null), jb6.M0(2131747616, null), jb6.M0(2131747612, null)};
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
                charSequenceArr2[0] = jb6.M0(2131747615, null);
                charSequenceArr2[1] = jb6.M0(2131747614, null);
                charSequenceArr2[c] = jb6.M0(2131747616, null);
                charSequenceArr2[3] = jb6.M0(2131747612, null);
                charSequenceArr = charSequenceArr2;
            }
            c = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = jb6.M0(2131747615, null);
            charSequenceArr22[1] = jb6.M0(2131747614, null);
            charSequenceArr22[c] = jb6.M0(2131747616, null);
            charSequenceArr22[3] = jb6.M0(2131747612, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout l = td4.l(activity, i2);
        int i7 = i3;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i7, ylbVar, activity);
        int i8 = i7;
        while (i8 < charSequenceArr.length) {
            x09 x09Var = new x09(activity, ylbVar);
            x09Var.setPadding(gm.L(4.0f), i7, gm.L(4.0f), i7);
            x09Var.setTag(Integer.valueOf(i8));
            a(x09Var, cmb.f7, cmb.D5, ylbVar);
            CharSequence charSequence = charSequenceArr[i8];
            if (iArr[i7] == i8) {
                z = 1;
            } else {
                z = i7;
            }
            x09Var.b(charSequence, z);
            l.addView(x09Var);
            x09Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i9;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i10 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
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
                        lo7.n(z8c.t0).f(j4, j2);
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
                        lo7.n(z8c.t0).g(i13);
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
        String M0 = jb6.M0(2131747639, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.n(l);
        alertDialog$Builder.j(jb6.M0(2131752542, null), null);
        return heVar;
    }

    public static void G(int i, long j, r63 r63Var, Context context, TLRPC.Photo photo) {
        if (context != null) {
            yh yhVar = new yh(i, j, r63Var, context, photo);
            my0 my0Var = new my0(1, (ylb) r63Var, context, true);
            my0Var.J();
            my0Var.P = jb6.M0(2131745945, null);
            my0Var.Q = true;
            zh zhVar = new zh(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, context, r63Var, yhVar, (byte) 0);
            my0Var.M = new CharSequence[]{jb6.M0(2131745954, null), jb6.M0(2131745960, null), jb6.M0(2131745953, null), jb6.M0(2131745962, null), jb6.M0(2131745959, null), jb6.M0(2131745957, null), jb6.M0(2131745956, null), jb6.M0(2131745958, null)};
            my0Var.N = new int[]{2131232101, 2131232341, 2131232344, 2131232074, 2131232340, 2131232343, 2131232345, 2131232342};
            my0Var.L = zhVar;
            my0Var.show();
        }
    }

    public static k6d H(final Context context, final long j, long j2, int i, boolean z, final gk gkVar, Runnable runnable, fk fkVar, ylb ylbVar) {
        ?? r22;
        Context context2;
        ViewGroup viewGroup;
        Object obj;
        long j3;
        FrameLayout frameLayout;
        char c;
        zi ziVar;
        ViewGroup viewGroup2;
        boolean[] zArr;
        r7 r7Var;
        Calendar calendar;
        int[] iArr;
        String[] strArr;
        l97 l97Var;
        int[] iArr2;
        String[] strArr2;
        p09 p09Var;
        final cj cjVar;
        int i2;
        View view;
        int i3;
        l97 l97Var2;
        ?? r4;
        int i4;
        final my0 my0Var;
        TLRPC.User W1;
        TLRPC.UserStatus userStatus;
        boolean z2;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i};
        long e = z8c.h(z8c.t0).e();
        final k6d k6dVar = new k6d(context, ylbVar);
        Object obj2 = k6dVar.b;
        ((my0) obj2).w0 = false;
        final lp7 lp7Var = new lp7(context, ylbVar);
        int i5 = fkVar.a;
        int i6 = fkVar.c;
        int i7 = fkVar.b;
        lp7Var.setTextColor(i5);
        lp7Var.setTextOffset(gm.L(10.0f));
        lp7Var.setItemCount(5);
        final ?? lp7Var2 = new lp7(context, ylbVar);
        lp7Var2.setWrapSelectorWheel(true);
        lp7Var2.setAllItemsCount(24);
        lp7Var2.setItemCount(5);
        lp7Var2.setTextColor(i5);
        lp7Var2.setTextOffset(-gm.L(10.0f));
        final ?? lp7Var3 = new lp7(context, ylbVar);
        lp7Var3.setWrapSelectorWheel(true);
        lp7Var3.setAllItemsCount(60);
        lp7Var3.setItemCount(5);
        lp7Var3.setTextColor(i5);
        lp7Var3.setTextOffset(-gm.L(34.0f));
        ViewGroup frameLayout2 = new FrameLayout(context);
        zi ziVar2 = new zi(context, lp7Var, lp7Var2, lp7Var3, (byte) 1);
        ziVar2.setClipToPadding(false);
        ziVar2.setClipChildren(false);
        ziVar2.setOrientation(1);
        frameLayout2.addView(ziVar2, qoe.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        ziVar2.addView(frameLayout4, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (j == e) {
            r22 = 0;
            textView.setText(jb6.M0(2131745248, null));
        } else {
            r22 = 0;
            textView.setText(jb6.M0(2131745593, null));
        }
        textView.setTextColor(i5);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        frameLayout4.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 13));
        boolean[] zArr2 = new boolean[1];
        zArr2[r22] = true;
        if (!pg3.D(j) || j == e || (W1 = oc7.r1(z8c.t0).W1(Long.valueOf(j))) == null || W1.bot || (userStatus = W1.status) == null || userStatus.expires <= 0) {
            context2 = context;
            viewGroup = frameLayout2;
            obj = obj2;
            j3 = e;
            frameLayout = frameLayout3;
            c = 2;
            ziVar = ziVar2;
            viewGroup2 = frameLayout4;
            zArr = zArr2;
            r7Var = null;
        } else {
            String k = m9c.k(W1, true);
            if (k.length() > 10) {
                z2 = r22;
                k = k.substring(z2 ? 1 : 0, 10).concat("…");
            } else {
                z2 = r22;
            }
            String str = k;
            viewGroup = frameLayout2;
            obj = obj2;
            frameLayout = frameLayout3;
            ziVar = ziVar2;
            c = 2;
            zArr = zArr2;
            j3 = e;
            ViewGroup viewGroup3 = frameLayout4;
            r7Var = new r7(context, null, 0, fkVar.a, false, ylbVar);
            context2 = context;
            r7Var.setLongClickEnabled(z2);
            r7Var.setSubMenuOpenSide(2);
            r7Var.setIcon(2131231248);
            r7Var.setBackground(cmb.f0(i6, 1, -1));
            viewGroup3.addView(r7Var, qoe.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            r7Var.g(1, jb6.a0(null, null, 2131745584, str));
            r7Var.setContentDescription(jb6.M0(2131754838, null));
            viewGroup2 = viewGroup3;
        }
        if (r7Var != null) {
            r7Var.setOnClickListener(new t(r7Var, fkVar, (byte) 12));
            r7Var.setDelegate(new jf(gkVar, zArr, k6dVar, (byte) 0));
        }
        ?? imageView = new ImageView(context2);
        p09 p09Var2 = new p09(2131624109, gm.L(24.0f), gm.L(24.0f), true, null);
        p09Var2.E(true);
        p09Var2.h = true;
        p09Var2.start();
        p09Var2.H(40);
        p09Var2.K(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(p09Var2);
        imageView.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(cmb.f0(i6, 1, -1));
        viewGroup2.addView(imageView, qoe.d(40, 40.0f, 53, 0.0f, 8.0f, (r7Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        ziVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        char c2 = c;
        final wb wbVar = new wb(context2, (byte) 1);
        linearLayout.addView(lp7Var, qoe.l(0.5f, 0, 270));
        lp7Var.setMinValue(0);
        lp7Var.setMaxValue(365);
        lp7Var.setWrapSelectorWheel(false);
        lp7Var.setFormatter(new c((byte) 18));
        Object obj3 = obj;
        final boolean[] zArr3 = zArr;
        final long j4 = j3;
        jp7 jp7Var = new jp7() {
            @Override
            public final void g(lp7 lp7Var4, int i8) {
                int i9;
                if (j4 == j) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                ik.g(wb.this, null, 0L, 0L, i9, lp7Var, lp7Var2, lp7Var3);
            }
        };
        lp7Var.setOnValueChangedListener(jp7Var);
        lp7Var2.setMinValue(0);
        lp7Var2.setMaxValue(23);
        final r7 r7Var2 = r7Var;
        linearLayout.addView(lp7Var2, qoe.l(0.2f, 0, 270));
        lp7Var2.setFormatter(new c((byte) 19));
        lp7Var2.setOnValueChangedListener(jp7Var);
        lp7Var3.setMinValue(0);
        lp7Var3.setMaxValue(59);
        lp7Var3.setValue(0);
        lp7Var3.setFormatter(new c((byte) 23));
        linearLayout.addView(lp7Var3, qoe.l(0.3f, 0, 270));
        lp7Var3.setOnValueChangedListener(jp7Var);
        if (j2 <= 0 || j2 == 2147483646) {
            calendar = calendar2;
        } else {
            long j5 = 1000 * j2;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j5 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j5);
            if (timeInMillis >= 0) {
                lp7Var3.setValue(calendar.get(12));
                lp7Var2.setValue(calendar.get(11));
                lp7Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(wbVar, null, 0L, 0L, j4 == j ? 1 : 0, lp7Var, lp7Var2, lp7Var3);
        if (ConnectionsManager.getInstance(z8c.t0).isTestBackend()) {
            iArr = new int[10];
            iArr[0] = 0;
            iArr[1] = 60;
            iArr[c2] = 300;
            iArr[3] = 86400;
            iArr[4] = 604800;
            iArr[5] = 1209600;
            iArr[6] = 2592000;
            iArr[7] = 7862400;
            iArr[8] = 15724800;
            iArr[9] = 31536000;
            strArr = new String[10];
            strArr[0] = jb6.M0(2131748257, null);
            strArr[1] = "Every minute";
            strArr[c2] = "Every 5 minutes";
            strArr[3] = jb6.M0(2131748259, null);
            strArr[4] = jb6.M0(2131748256, null);
            strArr[5] = jb6.M0(2131748260, null);
            strArr[6] = jb6.M0(2131748258, null);
            strArr[7] = jb6.M0(2131748262, null);
            strArr[8] = jb6.M0(2131748261, null);
            strArr[9] = jb6.M0(2131748255, null);
            l97Var = null;
        } else {
            iArr = new int[8];
            iArr[0] = 0;
            iArr[1] = 86400;
            iArr[c2] = 604800;
            iArr[3] = 1209600;
            iArr[4] = 2592000;
            iArr[5] = 7862400;
            iArr[6] = 15724800;
            iArr[7] = 31536000;
            strArr = new String[8];
            l97Var = null;
            strArr[0] = jb6.M0(2131748257, null);
            strArr[1] = jb6.M0(2131748259, null);
            strArr[c2] = jb6.M0(2131748256, null);
            strArr[3] = jb6.M0(2131748260, null);
            strArr[4] = jb6.M0(2131748258, null);
            strArr[5] = jb6.M0(2131748262, null);
            strArr[6] = jb6.M0(2131748261, null);
            strArr[7] = jb6.M0(2131748255, null);
        }
        String[] strArr3 = strArr;
        if (z) {
            iArr2 = iArr;
            strArr2 = strArr3;
            p09Var = p09Var2;
            cjVar = lp7Var2;
            i2 = i7;
            view = imageView;
            i3 = 0;
            l97Var2 = l97Var;
            r4 = l97Var2;
        } else {
            ?? frameLayout5 = new FrameLayout(context2);
            i2 = i7;
            int v = cmb.v(i2, cmb.p1(0.075f, i5));
            int[] iArr4 = iArr;
            int p1 = cmb.p1(0.1f, i5);
            ?? textView2 = new TextView(context2);
            strArr2 = strArr3;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i5);
            textView2.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
            int L = gm.L(14.0f);
            int v2 = cmb.v(v, p1);
            textView2.setBackground(cmb.i0(L, L, L, L, v, v2, v2));
            textView2.setGravity(17);
            cjVar = lp7Var2;
            i3 = 0;
            p09Var = p09Var2;
            view = imageView;
            l97Var2 = new l97(iArr4, iArr3, strArr2, textView2, (byte) 7);
            iArr2 = iArr4;
            l97Var2.run();
            frameLayout5.addView(textView2, qoe.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ziVar.addView(frameLayout5, qoe.o(-1, -2));
            l97Var = textView2;
            r4 = frameLayout5;
        }
        wbVar.setPadding(gm.L(34.0f), i3, gm.L(34.0f), i3);
        wbVar.setGravity(17);
        wbVar.setTextColor(fkVar.g);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gm.o());
        int i8 = fkVar.h;
        float[] fArr = new float[1];
        fArr[i3] = 24.0f;
        wbVar.setBackground(ulb.e(i8, fArr));
        ziVar.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        int i9 = i2;
        wbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i10;
                zArr4[0] = false;
                if (j4 == j) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                lp7 lp7Var4 = lp7Var;
                cj cjVar2 = cjVar;
                dj djVar = lp7Var3;
                boolean g = ik.g(null, null, 0L, 0L, i10, lp7Var4, cjVar2, djVar);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, lp7Var4.getValue());
                calendar4.set(11, cjVar2.getValue());
                calendar4.set(12, djVar.getValue());
                if (g) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                boolean z3 = zArr3[0];
                gkVar.y((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], z3);
                ((my0) k6dVar.b).y0.run();
            }
        });
        my0 my0Var2 = (my0) obj3;
        my0Var2.O = viewGroup;
        my0Var2.show();
        my0Var2.setOnDismissListener(new vg(runnable, zArr4));
        my0Var2.s0(i9);
        my0Var2.K(i9);
        if (l97Var != null) {
            i4 = 1;
            my0Var = my0Var2;
            l97Var.setOnClickListener(new li(frameLayout, ylbVar, my0Var2, (FrameLayout) r4, iArr2, strArr2, iArr3, l97Var2));
        } else {
            i4 = 1;
            my0Var = my0Var2;
        }
        final hg5[] hg5VarArr = new hg5[i4];
        final p09 p09Var3 = p09Var;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i10;
                String M0;
                int i11;
                int i12;
                int i13;
                int i14;
                boolean[] zArr5 = zArr3;
                boolean z3 = zArr5[0];
                zArr5[0] = !z3;
                p09 p09Var4 = p09Var3;
                int i15 = p09Var4.b0;
                if (!z3) {
                    if (i15 >= 40) {
                        p09Var4.H(0);
                    }
                    p09Var4.K(40);
                    p09Var4.start();
                } else {
                    if (i15 < 40) {
                        p09Var4.H(40);
                    }
                    p09Var4.K(80);
                    p09Var4.start();
                }
                hg5[] hg5VarArr2 = hg5VarArr;
                hg5 hg5Var = hg5VarArr2[0];
                if (hg5Var != null) {
                    hg5Var.f(true);
                    hg5VarArr2[0] = null;
                }
                oc7 r1 = oc7.r1(z8c.t0);
                long j6 = j;
                TLRPC.User W12 = r1.W1(Long.valueOf(j6));
                TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-j6));
                hg5 hg5Var2 = new hg5(context, 3);
                hg5VarArr2[0] = hg5Var2;
                hg5Var2.r();
                hg5Var2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                hg5Var2.q(20.0f);
                hg5Var2.s(gm.L(12.0f), gm.L(4.0f), cmb.p1(0.25f, -16777216));
                if (sd2.V(L0)) {
                    if (zArr5[0]) {
                        i14 = 2131745588;
                    } else {
                        i14 = 2131745592;
                    }
                    M0 = jb6.M0(i14, null);
                } else if (L0 == null && W12 != null) {
                    if (j6 == j4) {
                        if (zArr5[0]) {
                            i12 = 2131745585;
                        } else {
                            i12 = 2131745589;
                        }
                        M0 = jb6.M0(i12, null);
                    } else {
                        if (zArr5[0]) {
                            i11 = 2131745587;
                        } else {
                            i11 = 2131745591;
                        }
                        M0 = jb6.a0(null, null, i11, m9c.l(W12));
                    }
                } else {
                    if (zArr5[0]) {
                        i10 = 2131745586;
                    } else {
                        i10 = 2131745590;
                    }
                    M0 = jb6.M0(i10, null);
                }
                hg5Var2.t(M0);
                hg5Var2.d = 5000L;
                if (r7Var2 != null) {
                    i13 = 42;
                } else {
                    i13 = -8;
                }
                hg5Var2.n(1.0f, -(i13 + 20));
                hg5Var2.r0 = new hi(hg5Var2, (byte) 0);
                my0 my0Var3 = my0Var;
                my0Var3.b.setClipToPadding(false);
                my0Var3.b.setClipChildren(false);
                my0Var3.b.addView(hg5Var2, qoe.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                hg5Var2.v();
            }
        });
        return k6dVar;
    }

    public static void I(Context context, long j, gk gkVar) {
        H(context, j, -1L, 0, false, gkVar, null, new fk(null), null);
    }

    public static void J(Context context, long j, gk gkVar, ylb ylbVar) {
        H(context, j, -1L, 0, false, gkVar, null, new fk(ylbVar), ylbVar);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, ylb ylbVar) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        if (str == null) {
            str = jb6.M0(2131689472, null);
        }
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = str2;
        if (str3 == null) {
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(str3, new cf(runnable, (byte) 4));
        return alertDialog$Builder;
    }

    public static he M(Context context, ylb ylbVar, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = charSequence;
        alertDialog$Builder.j(str2, new cf(runnable, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        return heVar;
    }

    public static m8 N(d dVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f, float f2) {
        if (view != null) {
            m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            m8Var.e = true;
            m8Var.c = (short) 220;
            m8Var.setOutsideTouchable(true);
            m8Var.setClippingEnabled(true);
            m8Var.setAnimationStyle(2131755192);
            m8Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE));
            m8Var.setInputMethodMode(2);
            m8Var.getContentView().setFocusableInTouchMode(true);
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
            m8Var.showAtLocation(view.getRootView(), 0, (int) ((f3 + f) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f4 + f2) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            m8Var.b();
            return m8Var;
        }
        return null;
    }

    public static void O(Context context, d dVar, String str, String str2, String str3, String str4, int i, String str5, ylb ylbVar, af7 af7Var) {
        View view;
        Activity W = gm.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        he[] heVarArr = new he[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i2 = cmb.i5;
        anb.X(editTextBoldCursor, i2, ylbVar);
        anb.D(editTextBoldCursor, cmb.Ni, ylbVar);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(gm.L(16.0f), gm.L(11.0f), gm.L(16.0f), gm.L(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(cmb.p6, ylbVar);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new xg(editTextBoldCursor, i, af7Var, heVarArr, view, (byte) 0));
        editTextBoldCursor.addTextChangedListener(new fj(i, editTextBoldCursor));
        ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.p1(0.06f, cmb.v0(i2, ylbVar)));
        wmb K = anb.K(0.06f, i2);
        editTextBoldCursor.setBackground(b0);
        anb.j(editTextBoldCursor, b0, K, null, ylbVar);
        LinearLayout i3 = hg9.i(context, 1);
        i3.addView((View) editTextBoldCursor, qoe.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(i3);
        heVar.a = Math.min(gm.L(320.0f), (gm.q.x * 85) / 100);
        alertDialog$Builder.j(str5, new yg((Object) editTextBoldCursor, i, af7Var, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new zg((byte) 0));
        heVarArr[0] = heVar;
        if (dVar != null) {
            gm.U2(W, dVar.getClassGuid());
        }
        he heVar2 = heVarArr[0];
        heVar2.k0 = false;
        heVar2.setOnDismissListener(new ah(editTextBoldCursor, dVar, W, (byte) 0));
        heVarArr[0].setOnShowListener(new bf(editTextBoldCursor, (byte) 1));
        heVarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void P(Context context, d dVar, ylb ylbVar, af7 af7Var) {
        O(context, dVar, jb6.M0(2131744488, null), jb6.M0(2131744495, null), jb6.M0(2131744469, null), null, 12, jb6.M0(2131751690, null), ylbVar, af7Var);
    }

    public static k6d Q(Context context, long j, final gk gkVar, ylb ylbVar, int i) {
        int i2;
        final int i3;
        int i4;
        int i5;
        int i6;
        int w0 = cmb.w0(null, cmb.i5, false);
        int w02 = cmb.w0(null, cmb.g5, false);
        cmb.w0(null, cmb.zj, false);
        cmb.w0(null, cmb.Dj, false);
        cmb.w0(null, cmb.D8, false);
        cmb.w0(null, cmb.F8, false);
        int i7 = cmb.h6;
        cmb.w0(null, i7, false);
        int w03 = cmb.w0(null, cmb.Ii, false);
        int w04 = cmb.w0(null, cmb.Ei, false);
        cmb.w0(null, cmb.Gi, false);
        if (context == null) {
            return null;
        }
        final k6d k6dVar = new k6d(context, ylbVar);
        Object obj = k6dVar.b;
        ((my0) obj).w0 = false;
        final lp7 lp7Var = new lp7(context, ylbVar);
        lp7Var.setTextColor(w0);
        lp7Var.setTextOffset(gm.L(10.0f));
        lp7Var.setItemCount(5);
        final ?? lp7Var2 = new lp7(context, ylbVar);
        lp7Var2.setWrapSelectorWheel(true);
        lp7Var2.setAllItemsCount(24);
        lp7Var2.setItemCount(5);
        lp7Var2.setTextColor(w0);
        lp7Var2.setTextOffset(-gm.L(10.0f));
        final ?? lp7Var3 = new lp7(context, ylbVar);
        lp7Var3.setWrapSelectorWheel(true);
        lp7Var3.setAllItemsCount(60);
        lp7Var3.setItemCount(5);
        lp7Var3.setTextColor(w0);
        lp7Var3.setTextOffset(-gm.L(34.0f));
        zi ziVar = new zi(context, lp7Var, lp7Var2, lp7Var3, (byte) 7);
        ziVar.setOrientation(1);
        LinearLayout i8 = hg9.i(context, 1);
        ziVar.addView(i8, qoe.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i == 1) {
            i2 = 2131744059;
        } else {
            i2 = 2131746828;
        }
        textView.setText(jb6.M0(i2, null));
        textView.setTextColor(w0);
        ts2.s(textView, 1, 20.0f);
        i8.addView(textView, qoe.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new p8((byte) 3));
        TextView textView2 = new TextView(context);
        anb.X(textView2, cmb.y6, ylbVar);
        ts2.q(14.0f, 1, 2131746827, textView2, null);
        i8.addView(textView2, qoe.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new p8((byte) 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        ziVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i9 = calendar.get(1);
        gt2 gt2Var = oc7.r1(z8c.t0).l4.i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long g = gt2Var.g(timeUnit) << 1;
        final long g2 = oc7.r1(z8c.t0).l4.j.g(timeUnit) - 86400;
        final wb wbVar = new wb(context, (byte) 8);
        linearLayout.addView(lp7Var, qoe.l(0.5f, 0, 270));
        lp7Var.setMinValue(0);
        lp7Var.setMaxValue(365);
        lp7Var.setWrapSelectorWheel(false);
        lp7Var.setFormatter(new pg(i9, (byte) 0));
        if (i == 1) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        jp7 jp7Var = new jp7() {
            @Override
            public final void g(lp7 lp7Var4, int i10) {
                ik.g(wb.this, null, g, g2, i3, lp7Var, lp7Var2, lp7Var3);
            }
        };
        lp7Var.setOnValueChangedListener(jp7Var);
        lp7Var2.setMinValue(0);
        lp7Var2.setMaxValue(23);
        linearLayout.addView((View) lp7Var2, qoe.l(0.2f, 0, 270));
        lp7Var2.setFormatter(new c((byte) 25));
        lp7Var2.setOnValueChangedListener(jp7Var);
        lp7Var3.setMinValue(0);
        lp7Var3.setMaxValue(59);
        lp7Var3.setValue(0);
        lp7Var3.setFormatter(new c((byte) 26));
        linearLayout.addView((View) lp7Var3, qoe.l(0.3f, 0, 270));
        lp7Var3.setOnValueChangedListener(jp7Var);
        if (j > 0 && j != 2147483646) {
            long j2 = 1000 * j;
            i4 = w02;
            i5 = i7;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                lp7Var3.setValue(calendar.get(12));
                lp7Var2.setValue(calendar.get(11));
                lp7Var.setValue(timeInMillis);
            }
        } else {
            i4 = w02;
            i5 = i7;
        }
        final boolean[] zArr = {true};
        g(wbVar, null, g, g2, i3, lp7Var, lp7Var2, lp7Var3);
        wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        wbVar.setGravity(17);
        wbVar.setTextColor(w03);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gm.o());
        wbVar.setBackground(ulb.e(w04, 8.0f));
        ziVar.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 4));
        final int i10 = i3;
        wbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                long j3 = g;
                long j4 = g2;
                byte b = i10;
                lp7 lp7Var4 = lp7Var;
                ak akVar = lp7Var2;
                bk bkVar = lp7Var3;
                boolean g3 = ik.g(null, null, j3, j4, b, lp7Var4, akVar, bkVar);
                long epochMilli = LocalDate.now().plusDays(lp7Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, akVar.getValue());
                calendar2.set(12, bkVar.getValue());
                if (g3) {
                    calendar2.set(13, 0);
                }
                gkVar.y((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((my0) k6dVar.b).y0.run();
            }
        });
        rve.b(wbVar, 0.02f, 1.2f);
        wb wbVar2 = new wb(context, (byte) 9);
        wbVar2.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        wbVar2.setGravity(17);
        if (i == 1) {
            i6 = 2131748228;
        } else {
            i6 = 2131746825;
        }
        wbVar2.setText(jb6.M0(i6, null));
        wbVar2.setTextColor(w04);
        wbVar2.setTextSize(1, 14.0f);
        int L = gm.L(8.0f);
        int i11 = cmb.c6;
        int w05 = cmb.w0(null, i11, false);
        int w06 = cmb.w0(null, i5, false);
        fg0 i0 = cmb.i0(L, L, L, L, w05, w06, w06);
        wmb M = anb.M(i11);
        wmb M2 = anb.M(i5);
        wbVar2.setBackground(i0);
        anb.j(wbVar2, i0, M, M2, null);
        ziVar.addView(wbVar2, qoe.t(-1, 48, 83, 16, 0, 16, 16));
        wbVar2.setOnClickListener(new b0(zArr, gkVar, k6dVar, (byte) 2));
        rve.b(wbVar2, 0.02f, 1.2f);
        my0 my0Var = (my0) obj;
        my0Var.O = ziVar;
        my0Var.show();
        my0Var.setOnDismissListener(new g5(zArr));
        my0Var.s0(i4);
        my0Var.K(i4);
        return k6dVar;
    }

    public static he R(d dVar, ylb ylbVar) {
        URLSpan[] uRLSpanArr;
        if (dVar == null || dVar.getParentActivity() == null) {
            return null;
        }
        l66 l66Var = new l66(dVar.getParentActivity(), dVar.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(jb6.M0(2131753950, null).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new uj(uRLSpan.getURL(), dVar), spanStart, spanEnd, 0);
        }
        l66Var.setText(spannableString);
        l66Var.setTextSize(1, 16.0f);
        anb.G(l66Var, cmb.j5, ylbVar);
        anb.C(l66Var, cmb.k5, ylbVar);
        l66Var.setPadding(gm.L(23.0f), 0, gm.L(23.0f), 0);
        l66Var.setMovementMethod(new cm((byte) 0));
        anb.X(l66Var, cmb.i5, ylbVar);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, dVar.getParentActivity());
        alertDialog$Builder.n(l66Var);
        String M0 = jb6.M0(2131753951, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.j(jb6.M0(2131753949, null), new h6(dVar, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        return heVar;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, ylb ylbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        alertDialog$Builder.a.S = jb6.M0(2131748344, null);
        lp7 lp7Var = new lp7(context, null);
        lp7Var.setMinValue(0);
        lp7Var.setMaxValue(20);
        int i = encryptedChat.ttl;
        if (i > 0 && i < 16) {
            lp7Var.setValue(i);
        } else if (i == 30) {
            lp7Var.setValue(16);
        } else if (i == 60) {
            lp7Var.setValue(17);
        } else if (i == 3600) {
            lp7Var.setValue(18);
        } else if (i == 86400) {
            lp7Var.setValue(19);
        } else if (i == 604800) {
            lp7Var.setValue(20);
        } else if (i == 0) {
            lp7Var.setValue(0);
        }
        lp7Var.setFormatter(new zg((byte) 10));
        alertDialog$Builder.n(lp7Var);
        alertDialog$Builder.g(jb6.M0(2131751291, null), new o(encryptedChat, lp7Var, (byte) 8));
        return alertDialog$Builder;
    }

    public static void T(d dVar, int i, bmb bmbVar, amb ambVar) {
        amb ambVar2;
        int i2;
        String str;
        if (dVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = dVar.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str2 = null;
        editTextBoldCursor.setBackground(null);
        anb.F(editTextBoldCursor, cmb.t5, cmb.u5, cmb.p7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.S = jb6.M0(2131748015, null);
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131751690, null), new dq9((byte) 14));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i != 0) {
            textView.setText(gm.S2(jb6.M0(2131751051, null)));
        } else {
            textView.setText(jb6.M0(2131751052, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(gm.L(23.0f), gm.L(12.0f), gm.L(23.0f), gm.L(6.0f));
        int i3 = cmb.i5;
        anb.X(textView, i3, null);
        linearLayout.addView(textView, qoe.o(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        anb.X(editTextBoldCursor, i3, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.A(cmb.F6, null);
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, gm.L(4.0f), 0, 0);
        linearLayout.addView((View) editTextBoldCursor, qoe.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new nh((byte) 0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        b10.q(9306112, hashMap, "Berry", 14598550, "Brandy");
        b10.q(8391495, hashMap, "Cherry", 16744272, "Coral");
        b10.q(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        b10.q(14725375, hashMap, "Mauve", 16761035, "Pink");
        b10.q(16711680, hashMap, "Red", 16711807, "Rose");
        b10.q(8406555, hashMap, "Russet", 16720896, "Scarlet");
        b10.q(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        b10.q(16760576, hashMap, "Amber", 15438707, "Apricot");
        b10.q(16508850, hashMap, "Banana", 10601738, "Citrus");
        b10.q(11560192, hashMap, "Ginger", 16766720, "Gold");
        b10.q(16640272, hashMap, "Lemon", 16753920, "Orange");
        b10.q(16770484, hashMap, "Peach", 16739155, "Persimmon");
        b10.q(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        b10.q(16763004, hashMap, "Topaz", 16776960, "Yellow");
        b10.q(3688720, hashMap, "Clover", 8628829, "Cucumber");
        b10.q(5294200, hashMap, "Emerald", 11907932, "Olive");
        b10.q(65280, hashMap, "Green", 43115, "Jade");
        b10.q(2730887, hashMap, "Jungle", 12582656, "Lime");
        b10.q(776785, hashMap, "Malachite", 10026904, "Mint");
        b10.q(11394989, hashMap, "Moss", 3234721, "Azure");
        b10.q(255, hashMap, "Blue", 18347, "Cobalt");
        b10.q(5204422, hashMap, "Indigo", 96647, "Lagoon");
        b10.q(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        b10.q(128, hashMap, "Navy", 3101086, "Sapphire");
        b10.q(7788522, hashMap, "Sky", 32896, "Teal");
        b10.q(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        b10.q(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        b10.q(13148872, hashMap, "Lilac", 11894492, "Lavender");
        b10.q(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        b10.q(6684825, hashMap, "Purple", 14204888, "Thistle");
        b10.q(14315734, hashMap, "Orchid", 2361920, "Violet");
        b10.q(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        b10.q(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        b10.q(7365973, hashMap, "Coffee", 7956873, "Rum");
        b10.q(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        b10.q(12759680, hashMap, "Sand", 8924439, "Sienna");
        b10.q(7864585, hashMap, "Maple", 15787660, "Khaki");
        b10.q(12088115, hashMap, "Copper", 12144200, "Chestnut");
        b10.q(15653316, hashMap, "Almond", 16776656, "Cream");
        b10.q(12186367, hashMap, "Diamond", 11109127, "Honey");
        b10.q(16777200, hashMap, "Ivory", 15392968, "Pearl");
        b10.q(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        b10.q(16777215, hashMap, "White", 8421504, "Gray");
        b10.q(0, hashMap, "Black", 15266260, "Chrome");
        b10.q(3556687, hashMap, "Charcoal", 789277, "Ebony");
        b10.q(12632256, hashMap, "Silver", 16119285, "Smoke");
        b10.q(2499381, hashMap, "Steel", 5220413, "Apple");
        b10.q(8434628, hashMap, "Glacier", 16693933, "Melon");
        b10.q(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (ambVar == null) {
            ambVar2 = cmb.B0().i(false);
        } else {
            ambVar2 = ambVar;
        }
        if (ambVar2 == null || (i2 = ambVar2.c) == 0) {
            i2 = gm.q(cmb.r0())[0];
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
            str = kt6.p((String) asList.get(secureRandom.nextInt(asList.size())), " ", str2, new StringBuilder());
        } else {
            str = str2 + " " + ((String) asList2.get(secureRandom.nextInt(asList2.size())));
        }
        editTextBoldCursor.setText(str);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        bf bfVar = new bf(editTextBoldCursor, (byte) 2);
        he heVar = alertDialog$Builder.a;
        heVar.setOnShowListener(bfVar);
        dVar.showDialog(heVar);
        editTextBoldCursor.requestFocus();
        heVar.c(-1).setOnClickListener(new oh(dVar, editTextBoldCursor, ambVar, bmbVar, heVar, (byte) 0));
    }

    public static void U(Activity activity, String str, int i, int i2, int i3, qac qacVar) {
        if (activity == null) {
            return;
        }
        int w0 = cmb.w0(null, cmb.i5, false);
        int w02 = cmb.w0(null, cmb.g5, false);
        cmb.w0(null, cmb.zj, false);
        cmb.w0(null, cmb.Dj, false);
        cmb.w0(null, cmb.D8, false);
        cmb.w0(null, cmb.F8, false);
        cmb.w0(null, cmb.h6, false);
        cmb.w0(null, cmb.Ii, false);
        cmb.w0(null, cmb.Ei, false);
        cmb.w0(null, cmb.Gi, false);
        my0 i4 = wi8.i(activity, false, 1, null);
        i4.w0 = false;
        ?? lp7Var = new lp7(activity, null);
        zi ziVar = new zi(activity, lp7Var);
        ziVar.setOrientation(0);
        ziVar.setWeightSum(1.0f);
        lp7Var.setAllItemsCount(24);
        lp7Var.setItemCount(5);
        lp7Var.setTextColor(w0);
        lp7Var.setGravity(5);
        lp7Var.setTextOffset(-gm.L(12.0f));
        ?? lp7Var2 = new lp7(activity, null);
        lp7Var2.setWrapSelectorWheel(true);
        lp7Var2.setAllItemsCount(60);
        lp7Var2.setItemCount(5);
        lp7Var2.setTextColor(w0);
        lp7Var2.setGravity(3);
        lp7Var2.setTextOffset(gm.L(12.0f));
        final kh khVar = new kh(i2, i3, (yi) lp7Var, (aj) lp7Var2, i, ziVar);
        ziVar.addView((View) lp7Var, qoe.l(0.5f, 0, 270));
        lp7Var.setFormatter(new zg((byte) 8));
        lp7Var.setOnValueChangedListener(new jp7() {
            @Override
            public final void g(lp7 lp7Var3, int i5) {
                byte b = r2;
                kh khVar2 = khVar;
                switch (b) {
                    case 0:
                        khVar2.a(Boolean.TRUE);
                        return;
                    default:
                        khVar2.a(Boolean.TRUE);
                        return;
                }
            }
        });
        ziVar.addView((View) lp7Var2, qoe.l(0.5f, 0, 270));
        lp7Var2.setFormatter(new zg((byte) 9));
        lp7Var2.setOnValueChangedListener(new jp7() {
            @Override
            public final void g(lp7 lp7Var3, int i5) {
                byte b = r2;
                kh khVar2 = khVar;
                switch (b) {
                    case 0:
                        khVar2.a(Boolean.TRUE);
                        return;
                    default:
                        khVar2.a(Boolean.TRUE);
                        return;
                }
            }
        });
        khVar.a(Boolean.FALSE);
        bj bjVar = new bj(activity, lp7Var, lp7Var2);
        bjVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 8));
        bjVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        bjVar.addView(ziVar, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        b61 b61Var = new b61(null, activity, true);
        b61Var.setRoundRadius(24);
        b61Var.i(jb6.M0(2131745406, null), false, true);
        b61Var.setOnClickListener(new f5(r1, (byte) 1));
        bjVar.addView(b61Var, qoe.t(-1, 48, 0, 16, 12, 16, 12));
        i4.O = bjVar;
        i4.show();
        i4.setOnDismissListener(new ah(qacVar, lp7Var, lp7Var2, (byte) 1));
        i4.s0(w02);
        i4.K(w02);
        my0[] my0VarArr = {i4};
    }

    public static he V(Activity activity, final long j, final long j2, String str, final Runnable runnable, ylb ylbVar) {
        String[] strArr;
        boolean z;
        final String str2 = str;
        SharedPreferences sharedPreferences = oc7.r1(z8c.t0).W3;
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
            strArr = new String[]{jb6.M0(2131743300, null), jb6.M0(2131745100, null), jb6.M0(2131748480, null), jb6.M0(2131743299, null)};
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
            strArr = new String[]{jb6.M0(2131743299, null), jb6.M0(2131743300, null), jb6.M0(2131745100, null), jb6.M0(2131748480, null), jb6.M0(2131747554, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout l = td4.l(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        int i3 = 0;
        while (i3 < strArr2.length) {
            x09 x09Var = new x09(activity, ylbVar);
            x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            x09Var.setTag(Integer.valueOf(i3));
            a(x09Var, cmb.f7, cmb.D5, ylbVar);
            String str3 = strArr2[i3];
            if (iArr[0] == i3) {
                z = z2;
            } else {
                z = false;
            }
            x09Var.b(str3, z);
            l.addView(x09Var);
            x09Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
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
                        lo7.n(z8c.t0).f(j3, j2);
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
                            lo7.n(z8c.t0).g(2);
                        } else if (str4.equals("vibrate_group")) {
                            lo7.n(z8c.t0).g(0);
                        } else {
                            boolean equals = str4.equals("vibrate_react");
                            int i7 = z8c.t0;
                            if (equals) {
                                lo7.n(i7).g(4);
                            } else {
                                lo7.n(i7).g(1);
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
        String M0 = jb6.M0(2131743301, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.n(l);
        alertDialog$Builder.j(jb6.M0(2131752542, null), null);
        return heVar;
    }

    public static he W(Context context, ylb ylbVar, String[] strArr, int i, String str, String str2, gu2 gu2Var) {
        ylb ylbVar2;
        boolean z;
        int i2;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    ylbVar2 = ylbVar;
                    z = true;
                    break;
                }
            }
        }
        ylbVar2 = ylbVar;
        z = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, context);
        int i3 = cmb.K5;
        alertDialog$Builder.l(i, 72, cmb.w0(null, i3, false), null);
        alertDialog$Builder.m(i3, null);
        if (z) {
            str = str2;
        }
        SpannableStringBuilder S2 = gm.S2(str);
        he heVar = alertDialog$Builder.a;
        heVar.U = S2;
        if (z) {
            i2 = 2131747033;
        } else {
            i2 = 2131752862;
        }
        alertDialog$Builder.j(jb6.M0(i2, null), new wg(z, context, atomicBoolean, gu2Var, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131752857, null), new o(atomicBoolean, gu2Var, (byte) 6));
        heVar.setOnDismissListener(new dg(atomicBoolean, gu2Var, (byte) 1));
        return heVar;
    }

    public static void X(int i, long j, int i2, qac qacVar) {
        Y(i, j, i2, qacVar, 0L);
    }

    public static boolean Y(final int r24, final long r25, int r27, defpackage.qac r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik.Y(int, long, int, qac, long):boolean");
    }

    public static boolean Z(int i, ArrayList arrayList, int i2, qac qacVar) {
        ylb r63Var;
        ylb ylbVar;
        if (arrayList.isEmpty()) {
            qacVar.a(new HashMap());
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
            long L1 = oc7.r1(i).L1(longValue);
            if (L1 <= j && longValue > j) {
                L1 = pg3.j(oc7.r1(i).L2(longValue));
            }
            hashMap.put(l, Long.valueOf(L1));
            j2 += L1;
            long j3 = j;
            jva.v(i, false).P.put(l, Integer.valueOf(i2));
            int i6 = (L1 > j3 ? 1 : (L1 == j3 ? 0 : -1));
            if (i6 > 0) {
                i5++;
            }
            if (i6 > 0 && z && oc7.r1(i).X3.getLong(wi8.n(longValue, "ask_paid_message_", "_price"), j3) < L1) {
                z = false;
            }
            i3 = i5;
            j = 0;
        }
        int i7 = i3;
        long max = j2 * Math.max(1, i2);
        if (!z && max > 0) {
            Activity u0 = gm.u0();
            d S = LaunchActivity.S();
            if (!PhotoViewer.r0().V0()) {
                if (S != null) {
                    if (!S.hasShownSheet()) {
                        r63Var = S.getResourceProvider();
                        ylbVar = r63Var;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) gm.S2(jb6.H(',', "MessageLockedStarsConfirmMessageMulti1", i7)));
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) gm.S2(jb6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', jb6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i7) * i2))));
                        f0(u0, jb6.M0(2131748311, null), spannableStringBuilder, jb6.M0(2131748324, null), jb6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fi(i, max, ylbVar, qacVar, u0, arrayList, hashMap), ylbVar, true);
                        return true;
                    }
                } else {
                    ylbVar = null;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) gm.S2(jb6.H(',', "MessageLockedStarsConfirmMessageMulti1", i7)));
                    spannableStringBuilder2.append((CharSequence) " ");
                    spannableStringBuilder2.append((CharSequence) gm.S2(jb6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', jb6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i7) * i2))));
                    f0(u0, jb6.M0(2131748311, null), spannableStringBuilder2, jb6.M0(2131748324, null), jb6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fi(i, max, ylbVar, qacVar, u0, arrayList, hashMap), ylbVar, true);
                    return true;
                }
            }
            r63Var = new r63();
            ylbVar = r63Var;
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
            spannableStringBuilder22.append((CharSequence) gm.S2(jb6.H(',', "MessageLockedStarsConfirmMessageMulti1", i7)));
            spannableStringBuilder22.append((CharSequence) " ");
            spannableStringBuilder22.append((CharSequence) gm.S2(jb6.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', jb6.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i7) * i2))));
            f0(u0, jb6.M0(2131748311, null), spannableStringBuilder22, jb6.M0(2131748324, null), jb6.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fi(i, max, ylbVar, qacVar, u0, arrayList, hashMap), ylbVar, true);
            return true;
        }
        qacVar.a(hashMap);
        return false;
    }

    public static void a(x09 x09Var, int i, int i2, ylb ylbVar) {
        for (int i3 = 0; i3 < x09Var.getChildCount(); i3++) {
            View childAt = x09Var.getChildAt(i3);
            if (childAt instanceof RadioButton) {
                anb.O((RadioButton) childAt, i, i2, ylbVar);
                return;
            }
        }
        x09Var.a(cmb.v0(i, ylbVar), cmb.v0(i2, ylbVar));
    }

    public static boolean a0(int i, long j) {
        long L1 = oc7.r1(i).L1(j);
        if (L1 <= 0 && j > 0) {
            L1 = pg3.j(oc7.r1(i).L2(j));
        }
        if (L1 > 0 && L1 > oc7.r1(i).X3.getLong(wi8.n(j, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void b(lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3) {
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
        lp7Var3.setMaxValue(i7);
        lp7Var3.setMinValue(i4);
        int value = lp7Var3.getValue();
        if (value == i7) {
            i = i8;
        } else {
            i = 11;
        }
        lp7Var2.setMaxValue(i);
        if (value == i4) {
            i2 = i5;
        } else {
            i2 = 0;
        }
        lp7Var2.setMinValue(i2);
        int value2 = lp7Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i7 && value2 == i8) {
            actualMaximum = Math.min(i9, actualMaximum);
        }
        lp7Var.setMaxValue(actualMaximum);
        if (value == i4 && value2 == i5) {
            i3 = i6;
        }
        lp7Var.setMinValue(i3);
    }

    public static void b0(hk hkVar, he heVar, d dVar) {
        if (dVar.getParentActivity() != null) {
            gm.t1(hkVar);
            String obj = hkVar.getText().toString();
            int i = cmb.a;
            bmb bmbVar = new bmb();
            File h = a.h();
            bmbVar.b = new File(h, "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
            bmbVar.a = obj;
            cmb.g0 = cmb.Z0(cmb.I.j0);
            bmbVar.F = z8c.t0;
            cmb.v1(bmbVar, true, true, false);
            nm7.e().k(nm7.s4, new Object[0]);
            new ThemeEditorView().d(dVar.getParentActivity(), bmbVar);
            heVar.dismiss();
            SharedPreferences d1 = oc7.d1();
            if (d1.getBoolean("themehint", false)) {
                return;
            }
            d1.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(dVar.getParentActivity(), jb6.M0(2131751647, null), 1).show();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public static long c(b61 b61Var, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3, lp7 lp7Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i = 1;
        int i2 = calendar.get(1);
        int value = ((lp7Var2.getValue() - 120) / 12) + i2;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (lp7Var2.getValue() - 120) % 12);
        lp7Var.setMinValue(1);
        lp7Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = lp7Var.getValue();
        int value3 = lp7Var3.getValue();
        int value4 = lp7Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (b61Var != null) {
            if (value2 == 0) {
                i = 0;
            } else if (i2 != value) {
                i = 2;
            }
            b61Var.setText(jb6.D0().w0(i + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static defpackage.he c0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.d r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.d, org.telegram.tgnet.TLObject, java.lang.Object[]):he");
    }

    public static void d(lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3) {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = 1;
        int i3 = calendar.get(1);
        int i4 = calendar.get(2);
        int i5 = calendar.get(5);
        lp7Var3.setMinValue(i3);
        int value = lp7Var3.getValue();
        if (value == i3) {
            i = i4;
        } else {
            i = 0;
        }
        lp7Var2.setMinValue(i);
        int value2 = lp7Var2.getValue();
        if (value == i3 && value2 == i4) {
            i2 = i5;
        }
        lp7Var.setMinValue(i2);
    }

    public static void d0(Context context, ylb ylbVar, String str, TLRPC.WebPage webPage, final qac qacVar, z62 z62Var) {
        final View view;
        Activity W = gm.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        final he[] heVarArr = new he[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131746886, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131746887, null);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i = cmb.i5;
        anb.X(editTextBoldCursor, i, ylbVar);
        anb.D(editTextBoldCursor, cmb.Ni, ylbVar);
        editTextBoldCursor.setHint(jb6.M0(2131746885, null));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(gm.L(16.0f), gm.L(13.0f), gm.L(16.0f), gm.L(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(cmb.p6, ylbVar);
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
                mj mjVar = mj.this;
                String trim = mjVar.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = ik.a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    gm.z3(mjVar);
                    return true;
                }
                qacVar.a(trim);
                he heVar2 = heVarArr[0];
                if (heVar2 != null) {
                    heVar2.dismiss();
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.p1(0.06f, cmb.v0(i, ylbVar)));
        wmb K = anb.K(0.06f, i);
        editTextBoldCursor.setBackground(b0);
        anb.j(editTextBoldCursor, b0, K, null, ylbVar);
        LinearLayout i2 = hg9.i(context, 1);
        i2.addView((View) editTextBoldCursor, qoe.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i3 = kvc.f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            kvc kvcVar = new kvc(context, ylbVar);
            kvcVar.setWebPage(webPage);
            i2.addView(kvcVar, qoe.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.b();
        alertDialog$Builder.n(i2);
        heVar.a = Math.min(gm.L(320.0f), (gm.q.x * 85) / 100);
        alertDialog$Builder.j(jb6.M0(2131751291, null), new o(editTextBoldCursor, qacVar, (byte) 7));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new zg((byte) 7));
        if (z62Var != null) {
            alertDialog$Builder.h(jb6.M0(2131751535, null), new l0(z62Var, (byte) 16));
        }
        heVarArr[0] = heVar;
        heVar.k0 = false;
        heVar.setOnDismissListener(new n1(editTextBoldCursor, (byte) 4));
        heVarArr[0].setOnShowListener(new jh(editTextBoldCursor, (byte) 0));
        heVarArr[0].show();
        TextView textView = (TextView) heVarArr[0].c(-3);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
        }
    }

    public static void e(TextView textView, lp7 lp7Var, kj kjVar, lj ljVar) {
        String str;
        String str2;
        int value = lp7Var.getValue();
        int value2 = kjVar.getValue();
        int value3 = ljVar.getValue();
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
            str = jb6.G(i, "Days", new Object[0]);
        }
        if (i2 <= 0) {
            str2 = "";
        } else {
            str2 = jb6.G(i2, "Hours", new Object[0]);
        }
        if (i3 > 0) {
            str3 = jb6.G(i3, "Minutes", new Object[0]);
        }
        textView.setText(jb6.a0(null, null, 2131746907, jb6.a0(null, null, 2131746906, str, str2, str3).trim()));
    }

    public static void e0(TLRPC.TL_error tL_error, d dVar, boolean z, boolean z2, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && dVar != null && dVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
            String M0 = jb6.M0(2131689472, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
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
                    heVar.U = jb6.M0(2131748515, null);
                    break;
                case 1:
                    heVar.U = jb6.M0(2131746325, null);
                    break;
                case 2:
                    heVar.U = jb6.M0(2131751685, null);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z) {
                        heVar.U = jb6.M0(2131752208, null);
                        break;
                    } else {
                        heVar.U = jb6.M0(2131749146, null);
                        break;
                    }
                case 4:
                    heVar.U = jb6.M0(2131743415, null);
                    break;
                case 5:
                    heVar.U = jb6.M0(2131747860, null);
                    alertDialog$Builder.g(jb6.M0(2131748088, null), new h6(dVar, (byte) 3));
                    break;
                case 6:
                    if (z) {
                        heVar.U = jb6.M0(2131752206, null);
                        break;
                    } else {
                        heVar.U = jb6.M0(2131749144, null);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        heVar.U = jb6.M0(2131754361, null);
                        break;
                    } else {
                        heVar.U = jb6.M0(2131754474, null);
                        break;
                    }
                case '\t':
                    heVar.U = jb6.M0(2131742505, null);
                    break;
                case '\n':
                    heVar.U = jb6.M0(2131754462, null);
                    break;
                case '\f':
                    if (z) {
                        heVar.U = jb6.M0(2131752209, null);
                        break;
                    } else {
                        heVar.U = jb6.M0(2131749147, null);
                        break;
                    }
                case 14:
                    if (z) {
                        heVar.U = jb6.M0(2131752207, null);
                        break;
                    } else {
                        heVar.U = jb6.M0(2131749145, null);
                        break;
                    }
                case 15:
                    heVar.S = jb6.M0(2131752220, null);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        heVar.U = jb6.M0(2131752222, null);
                        break;
                    } else {
                        heVar.U = jb6.M0(2131752221, null);
                        break;
                    }
                case 16:
                    heVar.S = jb6.M0(2131752220, null);
                    heVar.U = jb6.M0(2131743444, null);
                    break;
                case 17:
                    if (z) {
                        heVar.U = jb6.M0(2131752205, null);
                        break;
                    } else {
                        heVar.U = jb6.M0(2131749143, null);
                        break;
                    }
                case 18:
                    heVar.U = jb6.M0(2131754473, null);
                    break;
                case 19:
                    if (z2) {
                        heVar.U = jb6.M0(2131748868, null);
                        break;
                    } else if (z) {
                        heVar.U = jb6.M0(2131748869, null);
                        break;
                    } else {
                        heVar.U = jb6.M0(2131748866, null);
                        break;
                    }
                case 20:
                    heVar.S = jb6.M0(2131742990, null);
                    heVar.U = jb6.M0(2131743060, null);
                    break;
                default:
                    heVar.U = jb6.M0(2131751042, null) + "\n" + tL_error.text;
                    break;
            }
            b10.t(null, 2131747564, alertDialog$Builder, null);
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
                    user = oc7.r1(i).W1(Long.valueOf(tL_missingInvitee2.user_id));
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
                gm.d3(new i77(i, chat, arrayList, arrayList2, arrayList3, (byte) 1), 200L);
            }
        }
    }

    public static he f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, qac qacVar, ylb ylbVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int L;
        if (activity == null) {
            qacVar.a(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        oh2[] oh2VarArr = new oh2[1];
        boolean[] zArr = {false};
        wb wbVar = new wb(activity, (byte) 10);
        nm7.i(wbVar);
        anb.X(wbVar, cmb.i5, ylbVar);
        wbVar.setTextSize(1, 16.0f);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        wbVar.setGravity(i | 48);
        wbVar.setText(charSequence);
        ri riVar = new ri(activity, oh2VarArr, (byte) 1);
        he heVar = alertDialog$Builder.a;
        heVar.H = (byte) 6;
        alertDialog$Builder.n(riVar);
        TextView textView = new TextView(activity);
        td4.x(textView, cmb.D8, ylbVar, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        riVar.addView(textView, qoe.d(-1, -2.0f, i3 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        riVar.addView(wbVar, qoe.d(-2, -2.0f, i4 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            oh2 oh2Var = new oh2(1, ylbVar, activity);
            oh2VarArr[0] = oh2Var;
            int i7 = cmb.h6;
            fg0 f0 = cmb.f0(cmb.v0(i7, ylbVar), 7, gm.L(12.0f));
            wmb M = anb.M(i7);
            oh2Var.setBackground(f0);
            anb.j(oh2Var, f0, null, M, ylbVar);
            oh2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oh2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (jb6.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            layoutParams.gravity = i5 | 16;
            oh2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            oh2VarArr[0].e(charSequence2, "", false, false, false);
            oh2 oh2Var2 = oh2VarArr[0];
            if (jb6.a0) {
                i6 = gm.L(4.0f);
            } else {
                i6 = 0;
            }
            int L2 = gm.L(12.0f);
            if (jb6.a0) {
                L = 0;
            } else {
                L = gm.L(4.0f);
            }
            oh2Var2.setPadding(i6, L2, L, gm.L(12.0f));
            riVar.addView(oh2VarArr[0], qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            oh2VarArr[0].setOnClickListener(new gf(zArr, (byte) 3));
        }
        alertDialog$Builder.j(str2, new ai((byte) 0, qacVar, zArr));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        if (z) {
            heVar.Y0 = true;
        }
        heVar.show();
        return heVar;
    }

    public static boolean g(TextView textView, TextView textView2, long j, long j2, int i, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3) {
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
        int value = lp7Var.getValue();
        int value2 = lp7Var2.getValue();
        int value3 = lp7Var3.getValue();
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
        lp7Var.setMinValue(0);
        int i15 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
        if (i15 > 0) {
            lp7Var.setMaxValue(i3);
        }
        int value4 = lp7Var.getValue();
        if (value4 == 0) {
            i6 = i13;
        } else {
            i6 = 0;
        }
        lp7Var2.setMinValue(i6);
        if (i15 > 0) {
            if (value4 == i3) {
                i10 = i4;
            } else {
                i10 = 23;
            }
            lp7Var2.setMaxValue(i10);
        }
        int value5 = lp7Var2.getValue();
        if (value4 == 0 && value5 == i13) {
            i7 = i14;
        } else {
            i7 = 0;
        }
        lp7Var3.setMinValue(i7);
        if (i15 > 0) {
            if (value4 == i3 && value5 == i4) {
                i9 = i12;
            } else {
                i9 = 59;
            }
            lp7Var3.setMaxValue(i9);
        }
        int value6 = lp7Var3.getValue();
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
            textView.setText(jb6.D0().w0((i * 3) + i8).format(timeInMillis2));
        }
        if (textView2 != null) {
            int i17 = (int) ((timeInMillis2 - j3) / 1000);
            if (i17 > 86400) {
                z2 = false;
                G = jb6.G(Math.round(i17 / 86400.0f), "DaysSchedule", new Object[0]);
            } else {
                z2 = false;
                z2 = false;
                z2 = false;
                if (i17 >= 3600) {
                    G = jb6.G(Math.round(i17 / 3600.0f), "HoursSchedule", new Object[0]);
                } else if (i17 >= 60) {
                    G = jb6.G(Math.round(i17 / 60.0f), "MinutesSchedule", new Object[0]);
                } else {
                    G = jb6.G(i17, "SecondsSchedule", new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                z = true;
                Object[] objArr = new Object[1];
                objArr[z2 ? 1 : 0] = G;
                textView2.setText(jb6.a0("VoipChannelScheduleInfo", null, 2131743147, objArr));
            } else {
                z = true;
                Object[] objArr2 = new Object[1];
                objArr2[z2 ? 1 : 0] = G;
                textView2.setText(jb6.a0("VoipGroupScheduleInfo", null, 2131743026, objArr2));
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

    public static void g0(org.telegram.ui.ActionBar.d r29, long r30, final org.telegram.tgnet.TLRPC.User r32, final org.telegram.tgnet.TLRPC.Chat r33, final org.telegram.tgnet.TLRPC.EncryptedChat r34, final boolean r35, org.telegram.tgnet.TLRPC.ChatFull r36, final defpackage.we7 r37, defpackage.ylb r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik.g0(org.telegram.ui.ActionBar.d, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, we7, ylb):void");
    }

    public static boolean h(Context context, int i, long j, boolean z) {
        TLRPC.Chat L0;
        if (pg3.y(j) && (L0 = oc7.r1(i).L0(Long.valueOf(-j))) != null && L0.slowmode_enabled && !sd2.N(L0)) {
            if (!z) {
                TLRPC.ChatFull M0 = oc7.r1(i).M0(L0.id);
                if (M0 == null) {
                    M0 = cf7.Y(i).C0(L0.id, sd2.T(L0), new CountDownLatch(1), false, false, 0);
                }
                if (M0 != null && M0.slowmode_next_send_date >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                    z = true;
                }
            }
            if (z) {
                K(context, L0.title, jb6.M0(2131745036, null)).o();
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h0(yv1 yv1Var, k47 k47Var, long j, ylb ylbVar, ho1 ho1Var) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int L;
        int L2;
        if (yv1Var.getParentActivity() != null && k47Var != null) {
            j5 accountInstance = yv1Var.getAccountInstance();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                user = oc7.r1(accountInstance.a).W1(Long.valueOf(j));
            } else {
                user = null;
            }
            if (i < 0) {
                chat = oc7.r1(accountInstance.a).L0(Long.valueOf(-j));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, yv1Var.getParentActivity());
                he heVar = alertDialog$Builder.a;
                heVar.Q0 = false;
                heVar.O = new n1(ho1Var, (byte) 2);
                heVar.S = jb6.M0(2131753657, null);
                if (user != null) {
                    heVar.U = gm.S2(jb6.a0("BlockUserReplyAlert", null, 2131753651, m9c.k(user, true)));
                } else {
                    heVar.U = gm.S2(jb6.a0("BlockUserReplyAlert", null, 2131753651, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(yv1Var.getParentActivity());
                linearLayout.setOrientation(1);
                oh2[] oh2VarArr = {new oh2(1, ylbVar, yv1Var.getParentActivity())};
                oh2VarArr[0].setBackgroundDrawable(cmb.L0(false));
                oh2VarArr[0].setTag(0);
                oh2VarArr[0].e(jb6.M0(2131751439, null), "", true, false, false);
                oh2 oh2Var = oh2VarArr[0];
                if (jb6.a0) {
                    L = gm.L(16.0f);
                } else {
                    L = gm.L(8.0f);
                }
                if (jb6.a0) {
                    L2 = gm.L(8.0f);
                } else {
                    L2 = gm.L(16.0f);
                }
                oh2Var.setPadding(L, 0, L2, 0);
                linearLayout.addView(oh2VarArr[0], qoe.o(-1, -2));
                oh2VarArr[0].setOnClickListener(new ye(oh2VarArr, (byte) 0));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.j(jb6.M0(2131753660, null), new ze(user, accountInstance, yv1Var, chat, k47Var, oh2VarArr, ylbVar));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                yv1Var.showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                }
            }
        }
    }

    public static he i(Activity activity, ek ekVar) {
        if (z8c.c() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        he heVar = alertDialog$Builder.a;
        td tdVar = heVar.M0;
        he[] heVarArr = new he[1];
        LinearLayout l = td4.l(activity, 1);
        for (int i = 0; i < 4; i++) {
            if (z8c.h(i).f() != null) {
                k5 k5Var = new k5(activity, false);
                k5Var.f = i;
                TLRPC.User f = z8c.h(i).f();
                pc0 pc0Var = k5Var.e;
                pc0Var.q(f);
                k5Var.a.l(bw2.m(0, f.first_name, f.last_name), false);
                bf0 bf0Var = k5Var.c;
                bf0Var.getImageReceiver().d = i;
                bf0Var.f(f, pc0Var);
                k5Var.d.setVisibility(4);
                k5Var.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
                k5Var.setBackgroundDrawable(cmb.L0(false));
                l.addView(k5Var, qoe.o(-1, 50));
                k5Var.setOnClickListener(new b0(heVarArr, tdVar, ekVar, (byte) 3));
            }
        }
        heVar.S = jb6.M0(2131745405, null);
        alertDialog$Builder.n(l);
        alertDialog$Builder.j(jb6.M0(2131752542, null), null);
        heVarArr[0] = heVar;
        return heVar;
    }

    public static void i0(Context context, int i, long j) {
        my0 h = hg9.h(1, null, context, false);
        LinearLayout i2 = hg9.i(context, 1);
        i2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        i2.addView(frameLayout, qoe.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232783);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, qoe.e(-1, -1, 17));
        int L = gm.L(80.0f);
        int i3 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.w0(null, i3, false));
        wmb M = anb.M(i3);
        frameLayout2.setBackground(K);
        anb.j(frameLayout2, K, M, null, null);
        frameLayout.addView(frameLayout2, qoe.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i4 = cmb.F6;
        td4.x(textView, i4, null, 1, 20.0f);
        textView.setText(jb6.M0(2131752577, null));
        textView.setGravity(17);
        TextView m = wi8.m(i2, textView, qoe.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        anb.X(m, i4, null);
        m.setTextSize(1, 14.0f);
        hg9.q(null, null, 2131752578, new Object[]{pg3.k(i, j)}, m);
        m.setGravity(17);
        i2.addView(m, qoe.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        b61 b61Var = new b61(null, context, true);
        b61Var.i(jb6.M0(2131752579, null), false, true);
        i2.addView(b61Var, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        h.O = i2;
        b61Var.setOnClickListener(new ii(i, b61Var, h, j));
        h.J();
        h.show();
    }

    public static he j(Context context, ylb ylbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131754208, null);
        he heVar = alertDialog$Builder.a;
        heVar.U = M0;
        int i = cmb.K5;
        alertDialog$Builder.l(2131624116, 72, cmb.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.j(jb6.M0(2131747033, null), new oe(context, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131751709, null), null);
        return heVar;
    }

    public static void j0(String str, d dVar) {
        String G;
        if (str != null && str.startsWith("FLOOD_WAIT") && dVar != null && dVar.getParentActivity() != null) {
            int intValue = Utilities.z(str).intValue();
            if (intValue < 60) {
                G = jb6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = jb6.G(intValue / 60, "Minutes", new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
            String M0 = jb6.M0(2131689472, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.a0("FloodWaitTime", null, 2131750618, G);
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            dVar.showDialog(heVar, true, null);
        }
    }

    public static void k(Context context, ylb ylbVar, gk gkVar) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (context == null) {
            return;
        }
        int i = cmb.i5;
        if (ylbVar != null) {
            w0 = ylbVar.f(i);
            w02 = ylbVar.f(cmb.g5);
            ylbVar.f(cmb.zj);
            ylbVar.f(cmb.Dj);
            ylbVar.f(cmb.D8);
            ylbVar.f(cmb.F8);
            ylbVar.f(cmb.h6);
            w03 = ylbVar.f(cmb.Ii);
            w04 = ylbVar.f(cmb.Ei);
            w05 = ylbVar.f(cmb.Gi);
        } else {
            w0 = cmb.w0(null, i, false);
            w02 = cmb.w0(null, cmb.g5, false);
            cmb.w0(null, cmb.zj, false);
            cmb.w0(null, cmb.Dj, false);
            cmb.w0(null, cmb.D8, false);
            cmb.w0(null, cmb.F8, false);
            cmb.w0(null, cmb.h6, false);
            w03 = cmb.w0(null, cmb.Ii, false);
            w04 = cmb.w0(null, cmb.Ei, false);
            w05 = cmb.w0(null, cmb.Gi, false);
        }
        int i2 = w04;
        int i3 = w05;
        int i4 = w02;
        int i5 = w03;
        k6d k6dVar = new k6d(context, ylbVar);
        Object obj = k6dVar.b;
        ((my0) obj).w0 = false;
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        pj pjVar = new pj(context, ylbVar, iArr);
        pjVar.setMinValue(0);
        pjVar.setMaxValue(16);
        pjVar.setTextColor(w0);
        pjVar.setValue(0);
        pjVar.setFormatter(new df(iArr, (byte) 1));
        qj qjVar = new qj(context, pjVar, (byte) 0);
        qjVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        qjVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131753842, null));
        textView.setTextColor(w0);
        ts2.s(textView, 1, 20.0f);
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        qjVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        rj rjVar = new rj(context, true, true, false, (byte) 0);
        linearLayout.addView(pjVar, qoe.l(1.0f, 0, 270));
        rjVar.setPadding(0, 0, 0, 0);
        rjVar.setGravity(17);
        rjVar.setTextColor(i5);
        rjVar.setTextSize(gm.L(14.0f));
        rjVar.setTypeface(gm.o());
        int L = gm.L(8.0f);
        rjVar.setBackgroundDrawable(cmb.i0(L, L, L, L, i2, i3, i3));
        qjVar.addView(rjVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
        rjVar.setText(jb6.M0(2131751371, null));
        pjVar.setOnValueChangedListener(new l0(rjVar, (byte) 19));
        rjVar.setOnClickListener(new ef(iArr, pjVar, gkVar, k6dVar, (byte) 2));
        my0 my0Var = (my0) obj;
        my0Var.O = qjVar;
        my0Var.show();
        my0Var.s0(i4);
        my0Var.K(i4);
    }

    public static void k0(Context context, ylb ylbVar, int i, TL_stars.StarGift starGift, long j, Runnable runnable) {
        TLObject a2 = oc7.r1(i).a2(j);
        LinearLayout i2 = hg9.i(context, 1);
        i2.addView(new vra(context, starGift, a2), qoe.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        anb.X(textView, cmb.i5, ylbVar);
        textView.setTextSize(1, 16.0f);
        hg9.q(null, null, 2131749368, new Object[]{pg3.G(null, null, a2)}, textView);
        i2.addView(textView, qoe.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        alertDialog$Builder.n(i2);
        alertDialog$Builder.j(jb6.M0(2131749369, null), new cf(runnable, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.o();
    }

    public static k6d l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, qac qacVar, Runnable runnable, boolean z, boolean z2, ylb ylbVar) {
        int i;
        int i2;
        if (context == null) {
            return null;
        }
        k6d k6dVar = new k6d(context, ylbVar);
        Object obj = k6dVar.b;
        ((my0) obj).w0 = false;
        lp7 lp7Var = new lp7(context, ylbVar);
        lp7Var.setTextOffset(gm.L(10.0f));
        lp7Var.setItemCount(5);
        lp7 lp7Var2 = new lp7(context, ylbVar);
        lp7Var2.setItemCount(5);
        lp7Var2.setTextOffset(-gm.L(10.0f));
        lp7 lp7Var3 = new lp7(context, ylbVar);
        lp7Var3.setItemCount(5);
        lp7Var3.setTextOffset(-gm.L(24.0f));
        hj hjVar = new hj(context, lp7Var, lp7Var2, lp7Var3);
        hjVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        hjVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        td4.x(textView, cmb.i5, ylbVar, 1, 20.0f);
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        hjVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i3 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i4 = calendar.get(5);
        int i5 = calendar.get(2);
        int i6 = calendar.get(1);
        int i7 = i6 + 1;
        uh uhVar = new uh(lp7Var3, i7, lp7Var, lp7Var2, i6, i5, i4);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(lp7Var, qoe.l(0.25f, 0, 270));
        lp7Var.setMinValue(1);
        lp7Var.setMaxValue(31);
        lp7Var.setWrapSelectorWheel(false);
        lp7Var.setFormatter(new zg((byte) 11));
        l0 l0Var = new l0(uhVar, (byte) 18);
        lp7Var.setOnScrollListener(l0Var);
        lp7Var2.setMinValue(0);
        lp7Var2.setMaxValue(11);
        lp7Var2.setWrapSelectorWheel(false);
        linearLayout.addView(lp7Var2, qoe.l(0.5f, 0, 270));
        lp7Var2.setFormatter(new zg((byte) 12));
        lp7Var2.setOnScrollListener(l0Var);
        lp7Var3.setMinValue(i3);
        lp7Var3.setMaxValue(i7);
        lp7Var3.setWrapSelectorWheel(false);
        lp7Var3.setFormatter(new pg(i7, (byte) 1));
        linearLayout.addView(lp7Var3, qoe.l(0.25f, 0, 270));
        lp7Var3.setOnScrollListener(l0Var);
        if (tL_birthday != null) {
            lp7Var.setValue(tL_birthday.day);
            lp7Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                lp7Var3.setValue(tL_birthday.year);
            } else {
                lp7Var3.setValue(i7);
            }
        } else {
            lp7Var.setValue(calendar.get(5));
            lp7Var2.setValue(calendar.get(2));
            lp7Var3.setValue(i7);
        }
        uhVar.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            l66 l66Var = new l66(context, null);
            l66Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
            l66Var.setTextSize(1, 13.0f);
            anb.X(l66Var, cmb.p5, ylbVar);
            anb.G(l66Var, cmb.Wc, ylbVar);
            l66Var.setGravity(17);
            frameLayout2.addView(l66Var, qoe.e(-2, -2, 17));
            hjVar.addView(frameLayout2, qoe.o(-1, -2));
            int i8 = z8c.t0;
            eh ehVar = new eh(i8, l66Var, (byte) 1);
            ehVar.run();
            nm7.f(i8).h(frameLayout2, nm7.k0, new mf2(ehVar, (byte) 3));
            bw2.r(i8).D(false);
        }
        if (z) {
            b61 b61Var = new b61(ylbVar, context, false);
            b61Var.i(jb6.M0(2131751607, null), false, true);
            b61Var.setOnClickListener(new wh(lp7Var3, i7, uhVar, (byte) 0));
            hjVar.addView(b61Var, qoe.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        textView2.setGravity(17);
        anb.X(textView2, cmb.Ii, ylbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        textView2.setText(str2);
        int L = gm.L(24.0f);
        int i9 = cmb.Ei;
        int v0 = cmb.v0(i9, ylbVar);
        int i10 = cmb.Gi;
        int v02 = cmb.v0(i10, ylbVar);
        fg0 i0 = cmb.i0(L, L, L, L, v0, v02, v02);
        wmb M = anb.M(i9);
        wmb M2 = anb.M(i10);
        textView2.setBackground(i0);
        anb.j(textView2, i0, M, M2, ylbVar);
        rve.b(textView2, 0.02f, 1.2f);
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
        hjVar.addView(textView2, qoe.t(-1, 48, 83, 16, i, 16, i2));
        textView2.setOnClickListener(new xh(lp7Var, lp7Var2, lp7Var3, i7, k6dVar, qacVar));
        if (z2) {
            b61 b61Var2 = new b61(ylbVar, context, false);
            b61Var2.i(jb6.M0(2131753680, null), false, true);
            b61Var2.f();
            b61Var2.setOnClickListener(new t(k6dVar, qacVar, (byte) 15));
            hjVar.addView(b61Var2, qoe.t(-1, 48, 83, 16, 4, 16, 16));
        }
        ((my0) obj).O = hjVar;
        return k6dVar;
    }

    public static void l0(Context context, ylb ylbVar, String str, boolean z, final jac jacVar) {
        int i;
        if (!gm.C1(context)) {
            return;
        }
        final he[] heVarArr = new he[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131747512, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i2 = cmb.i5;
        anb.X(textView, i2, ylbVar);
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(gm.L(14.0f), gm.L(12.0f), gm.L(14.0f), gm.L(12.0f));
        ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.p1(0.06f, cmb.v0(i2, ylbVar)));
        wmb K = anb.K(0.06f, i2);
        textView.setBackground(b0);
        anb.j(textView, b0, K, null, ylbVar);
        final oh2 oh2Var = new oh2(1, ylbVar, context);
        oh2Var.setMultiline(true);
        oh2Var.getTextView().getLayoutParams().width = -1;
        oh2Var.getTextView().setSingleLine(false);
        oh2Var.getTextView().setMaxLines(3);
        oh2Var.getTextView().setTextSize(1, 16.0f);
        if (z) {
            i = 2131752830;
        } else {
            i = 2131752829;
        }
        oh2Var.e(jb6.M0(i, null), "", false, false, false);
        oh2Var.setOnClickListener(new kf(oh2Var, (byte) 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, qoe.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(oh2Var, qoe.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.n(linearLayout);
        heVar.a = Math.min(gm.L(320.0f), (gm.q.x * 85) / 100);
        alertDialog$Builder.j(jb6.M0(2131747550, null), new ee() {
            @Override
            public final void r(he heVar2, int i3) {
                byte b = r4;
                he[] heVarArr2 = heVarArr;
                oh2 oh2Var2 = oh2Var;
                jac jacVar2 = jacVar;
                switch (b) {
                    case 0:
                        jacVar2.a(Boolean.TRUE, Boolean.valueOf(oh2Var2.b()));
                        he heVar3 = heVarArr2[0];
                        if (heVar3 != null) {
                            heVar3.dismiss();
                            return;
                        }
                        return;
                    default:
                        jacVar2.a(Boolean.FALSE, Boolean.valueOf(oh2Var2.b()));
                        he heVar4 = heVarArr2[0];
                        if (heVar4 != null) {
                            heVar4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.g(jb6.M0(2131752542, null), new ee() {
            @Override
            public final void r(he heVar2, int i3) {
                byte b = r4;
                he[] heVarArr2 = heVarArr;
                oh2 oh2Var2 = oh2Var;
                jac jacVar2 = jacVar;
                switch (b) {
                    case 0:
                        jacVar2.a(Boolean.TRUE, Boolean.valueOf(oh2Var2.b()));
                        he heVar3 = heVarArr2[0];
                        if (heVar3 != null) {
                            heVar3.dismiss();
                            return;
                        }
                        return;
                    default:
                        jacVar2.a(Boolean.FALSE, Boolean.valueOf(oh2Var2.b()));
                        he heVar4 = heVarArr2[0];
                        if (heVar4 != null) {
                            heVar4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        heVarArr[0] = alertDialog$Builder.o();
    }

    public static void m(org.telegram.ui.ActionBar.d r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik.m(org.telegram.ui.ActionBar.d, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, k11 k11Var, TLRPC.WebPage webPage, ylb ylbVar) {
        String scheme;
        boolean z5;
        boolean z6;
        if (!gm.C1(context)) {
            return;
        }
        if (str == null) {
            scheme = null;
        } else {
            scheme = Uri.parse(str).getScheme();
        }
        if (!l11.h(str) && z3 && !"mailto".equalsIgnoreCase(scheme)) {
            String d = l11.d(str, z);
            qf2 qf2Var = new qf2(context, str, j, z2, k11Var);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
            String M0 = jb6.M0(2131747512, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            TextView textView = new TextView(context);
            textView.setText(d);
            textView.setTextSize(1, 14.0f);
            int i = cmb.i5;
            anb.X(textView, i, ylbVar);
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(gm.L(14.0f), gm.L(12.0f), gm.L(14.0f), gm.L(12.0f));
            ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.p1(0.06f, cmb.v0(i, ylbVar)));
            wmb K = anb.K(0.06f, i);
            textView.setBackground(b0);
            anb.j(textView, b0, K, null, ylbVar);
            LinearLayout i2 = hg9.i(context, 1);
            i2.addView(textView, qoe.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i3 = kvc.f;
            if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                kvc kvcVar = new kvc(context, ylbVar);
                kvcVar.setWebPage(webPage);
                i2.addView(kvcVar, qoe.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder.n(i2);
            heVar.a = Math.min(gm.L(320.0f), (gm.q.x * 85) / 100);
            alertDialog$Builder.j(jb6.M0(2131747550, null), new l0(qf2Var, (byte) 17));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
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
        l11.t(context, parse, z5, z2, z6, k11Var, null, false, true, false, false);
    }

    public static void n(d dVar, TLRPC.User user, Runnable runnable, Runnable runnable2) {
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
        Context context = dVar.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        l66 l66Var = new l66(context, null);
        nm7.i(l66Var);
        anb.X(l66Var, cmb.i5, null);
        anb.G(l66Var, cmb.Wc, null);
        l66Var.setTextSize(1, 16.0f);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        l66Var.setGravity(i | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        he heVar = alertDialog$Builder.a;
        heVar.H = (byte) 6;
        alertDialog$Builder.n(frameLayout);
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.s(gm.L(18.0f));
        bf0 bf0Var = new bf0(context);
        bf0Var.setRoundRadius(gm.L(20.0f));
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        frameLayout.addView(bf0Var, qoe.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        lka lkaVar = new lka(context);
        anb.W(lkaVar, cmb.D8, null);
        lkaVar.setTextSize(20);
        lkaVar.setTypeface(gm.o());
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        lkaVar.setGravity(i3 | 16);
        lkaVar.setEllipsizeByGradient(true);
        lkaVar.l(user.first_name, false);
        if (user.scam) {
            lkaVar.i(cmb.f1);
        } else if (user.fake) {
            lkaVar.i(cmb.g1);
        } else if (user.verified) {
            Drawable d = b10.d(context, 2131232809);
            int i11 = cmb.y9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.x(lkaVar, d, i11, null, mode);
            Drawable d2 = b10.d(context, 2131232810);
            anb.x(lkaVar, d2, cmb.z9, null, mode);
            lkaVar.i(new sn2(d, d2));
        }
        TextView textView = new TextView(context);
        anb.X(textView, cmb.l5, null);
        wi8.w(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        textView.setGravity(i4 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new mf(user, dVar, alertDialog$Builder, (byte) 0));
        SpannableString valueOf = SpannableString.valueOf(jb6.M0(2131748092, null).concat("  "));
        pn2 pn2Var = new pn2(2131230876, 0);
        pn2Var.n = 1;
        pn2Var.c(gm.L(10.0f));
        valueOf.setSpan(pn2Var, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z = jb6.a0;
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
        frameLayout.addView(lkaVar, qoe.d(-1, -2.0f, i12, f, 0.0f, i7, 0.0f));
        boolean z2 = jb6.a0;
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
        frameLayout.addView(textView, qoe.d(-1, -2.0f, i14, f2, 24.0f, i13, 0.0f));
        if (jb6.a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(l66Var, qoe.d(-2, -2.0f, i10 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (m9c.B(user)) {
            pc0Var.p = 0.8f;
            pc0Var.f(12);
            r5 = 0;
            bf0Var.m(null, null, pc0Var, user);
        } else {
            r5 = 0;
            pc0Var.p = 1.0f;
            dVar.getCurrentAccount();
            pc0Var.q(user);
            bf0Var.f(user, pc0Var);
        }
        alertDialog$Builder.j(jb6.M0(2131744604, r5), new cf(runnable, (byte) 1));
        alertDialog$Builder.g(jb6.M0(2131752542, r5), r5);
        dVar.showDialog(heVar, false, new nf(runnable2, (byte) 0));
        l66Var.setText(gm.N2(jb6.M0(2131752849, r5), -1, 0, new of(heVar, context, (byte) 0), r5));
    }

    public static void n0(d dVar, String str, boolean z, boolean z2) {
        o0(dVar, str, z, true, z2, false, null, null, null);
    }

    public static k6d o(Activity activity, we7 we7Var, ylb ylbVar) {
        if (activity == null) {
            return null;
        }
        k6d k6dVar = new k6d(activity, ylbVar);
        Object obj = k6dVar.b;
        ((my0) obj).w0 = false;
        lp7 lp7Var = new lp7(activity, ylbVar);
        lp7Var.setTextOffset(gm.L(10.0f));
        lp7Var.setItemCount(5);
        lp7 lp7Var2 = new lp7(activity, ylbVar);
        lp7Var2.setItemCount(5);
        lp7Var2.setTextOffset(-gm.L(10.0f));
        lp7 lp7Var3 = new lp7(activity, ylbVar);
        lp7Var3.setItemCount(5);
        lp7Var3.setTextOffset(-gm.L(24.0f));
        zi ziVar = new zi(activity, lp7Var, lp7Var2, lp7Var3, (byte) 6);
        ziVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        ziVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(jb6.M0(2131752069, null));
        td4.x(textView, cmb.i5, ylbVar, 1, 20.0f);
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 11));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        ziVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        wb wbVar = new wb(activity, (byte) 7);
        linearLayout.addView(lp7Var, qoe.l(0.25f, 0, 270));
        lp7Var.setMinValue(1);
        lp7Var.setMaxValue(31);
        lp7Var.setWrapSelectorWheel(false);
        lp7Var.setFormatter(new zg((byte) 13));
        ng ngVar = new ng(lp7Var, lp7Var2, lp7Var3, (byte) 2);
        lp7Var.setOnValueChangedListener(ngVar);
        lp7Var2.setMinValue(0);
        lp7Var2.setMaxValue(11);
        lp7Var2.setWrapSelectorWheel(false);
        linearLayout.addView(lp7Var2, qoe.l(0.5f, 0, 270));
        lp7Var2.setFormatter(new zg((byte) 14));
        lp7Var2.setOnValueChangedListener(ngVar);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = calendar.get(1);
        lp7Var3.setMinValue(i);
        lp7Var3.setMaxValue(i2);
        lp7Var3.setWrapSelectorWheel(false);
        lp7Var3.setFormatter(new zg((byte) 15));
        linearLayout.addView(lp7Var3, qoe.l(0.25f, 0, 270));
        lp7Var3.setOnValueChangedListener(ngVar);
        lp7Var.setValue(31);
        lp7Var2.setValue(12);
        lp7Var3.setValue(i2);
        b(lp7Var, lp7Var2, lp7Var3);
        wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        wbVar.setGravity(17);
        anb.X(wbVar, cmb.Ii, ylbVar);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gm.o());
        wbVar.setText(jb6.M0(2131748822, null));
        int L = gm.L(8.0f);
        int i3 = cmb.Ei;
        int v0 = cmb.v0(i3, ylbVar);
        int i4 = cmb.Gi;
        int v02 = cmb.v0(i4, ylbVar);
        fg0 i0 = cmb.i0(L, L, L, L, v0, v02, v02);
        wmb M = anb.M(i3);
        wmb M2 = anb.M(i4);
        wbVar.setBackground(i0);
        anb.j(wbVar, i0, M, M2, ylbVar);
        ziVar.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
        wbVar.setOnClickListener(new gg(lp7Var, lp7Var2, lp7Var3, calendar, we7Var, k6dVar, (byte) 2));
        ((my0) obj).O = ziVar;
        return k6dVar;
    }

    public static void o0(d dVar, String str, boolean z, boolean z2, boolean z3, boolean z4, k11 k11Var, TLRPC.WebPage webPage, ylb ylbVar) {
        long j;
        if (dVar != null && dVar.getParentActivity() != null) {
            if (dVar instanceof yv1) {
                j = ((yv1) dVar).x8;
            } else {
                j = 0;
            }
            m0(dVar.getParentActivity(), str, z, z2, z3, z4, j, k11Var, webPage, ylbVar);
        }
    }

    public static void p(d dVar, TLRPC.User user, boolean z) {
        String M0;
        String a0;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (dVar.getParentActivity() != null && user != null && !m9c.z(user) && z8c.h(dVar.getCurrentAccount()).e() != user.id) {
            dVar.getCurrentAccount();
            Activity parentActivity = dVar.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z) {
                M0 = jb6.M0(2131743296, null);
                a0 = jb6.a0("VideoCallAlert", null, 2131743297, m9c.r(user));
            } else {
                M0 = jb6.M0(2131752584, null);
                a0 = jb6.a0("CallAlert", null, 2131752585, m9c.r(user));
            }
            TextView textView = new TextView(parentActivity);
            nm7.i(textView);
            anb.X(textView, cmb.i5, null);
            textView.setTextSize(1, 16.0f);
            int i6 = 3;
            if (jb6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i | 48);
            textView.setText(gm.S2(a0));
            pc0 pc0Var = new pc0((ylb) null);
            pc0Var.s(gm.L(12.0f));
            pc0Var.p = 1.0f;
            dVar.getCurrentAccount();
            pc0Var.q(user);
            bf0 bf0Var = new bf0(parentActivity);
            bf0Var.setRoundRadius(gm.L(20.0f));
            bf0Var.f(user, pc0Var);
            if (jb6.a0) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            frameLayout.addView(bf0Var, qoe.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            td4.x(textView2, cmb.D8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (jb6.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView2.setGravity(i3 | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(M0);
            boolean z2 = jb6.a0;
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
            frameLayout.addView(textView2, qoe.d(-1, -2.0f, i7, f, 11.0f, i8, 0.0f));
            if (jb6.a0) {
                i6 = 5;
            }
            frameLayout.addView(textView, qoe.d(-2, -2.0f, i6 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.j(jb6.M0(2131752587, null), new ci(dVar, user, z, (byte) 0));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            dVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void p0(Activity activity, int i, Runnable runnable, boolean z, ylb ylbVar) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = oc7.r1(i).g3;
        if ((i2 & 1) != 0) {
            b10.r(null, 2131748443, arrayList, 0, arrayList2);
        }
        if ((i2 & 2) != 0) {
            b10.r(null, 2131748445, arrayList, 1, arrayList2);
        }
        if ((i2 & 4) != 0) {
            b10.r(null, 2131748441, arrayList, 3, arrayList2);
        }
        arrayList.add(jb6.M0(2131748444, null));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        alertDialog$Builder.a.S = jb6.M0(2131748442, null);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            x09 x09Var = new x09(activity, ylbVar);
            x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            x09Var.setTag(Integer.valueOf(i3));
            a(x09Var, cmb.f7, cmb.D5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i3);
            if (gda.l0 == ((Integer) arrayList2.get(i3)).intValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            x09Var.b(charSequence, z2);
            int i4 = cmb.h6;
            fg0 f0 = cmb.f0(cmb.w0(null, i4, false), 2, -1);
            wmb M = anb.M(i4);
            x09Var.setBackground(f0);
            anb.j(x09Var, f0, null, M, null);
            linearLayout.addView(x09Var);
            x09Var.setOnClickListener(new b0(arrayList2, runnable, alertDialog$Builder, (byte) 4));
        }
        if (!z) {
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        }
        he o = alertDialog$Builder.o();
        if (z) {
            o.setCanceledOnTouchOutside(false);
        }
    }

    public static void q(org.telegram.ui.ActionBar.d r32, int r33, org.telegram.tgnet.TLRPC.User r34, org.telegram.tgnet.TLRPC.Chat r35, boolean r36, defpackage.ue7 r37, defpackage.ylb r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik.q(org.telegram.ui.ActionBar.d, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, ue7, ylb):void");
    }

    public static void q0(int i, ylb ylbVar, d dVar) {
        if (i != 0 && dVar != null && dVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, dVar.getParentActivity());
            String M0 = jb6.M0(2131743603, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            if (i == 1) {
                heVar.U = jb6.M0(2131751024, null);
            } else if (i == 2) {
                heVar.U = jb6.M0(2131751036, null);
            } else if (i == 3) {
                heVar.U = jb6.M0(2131751030, null);
            } else if (i == 4) {
                heVar.U = jb6.M0(2131751023, null);
            } else if (i == 5) {
                heVar.U = jb6.M0(2131751035, null);
            } else if (i == 6) {
                heVar.U = jb6.M0(2131751029, null);
            } else if (i == 7) {
                heVar.U = jb6.M0(2131751027, null);
            } else if (i == 8) {
                heVar.U = jb6.M0(2131751028, null);
            } else if (i == 9) {
                heVar.U = jb6.M0(2131751019, null);
            } else if (i == 10) {
                heVar.U = jb6.M0(2131751031, null);
            } else if (i == 11) {
                heVar.U = jb6.M0(2131751020, null);
            } else if (i == 12) {
                heVar.U = jb6.M0(2131751032, null);
            } else if (i == 13) {
                heVar.U = jb6.M0(2131751017, null);
            } else if (i == 14) {
                heVar.U = jb6.M0(2131751018, null);
            } else if (i == 15) {
                heVar.U = jb6.M0(2131751025, null);
            } else if (i == 16) {
                heVar.U = jb6.M0(2131751026, null);
            } else if (i == 17) {
                heVar.U = jb6.M0(2131751037, null);
            } else if (i == 18) {
                heVar.U = jb6.M0(2131751038, null);
            } else if (i == 19) {
                heVar.U = jb6.M0(2131751033, null);
            } else if (i == 20) {
                heVar.U = jb6.M0(2131751034, null);
            } else if (i == 21) {
                heVar.U = jb6.M0(2131751021, null);
            } else if (i == 22) {
                heVar.U = jb6.M0(2131751022, null);
            }
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            dVar.showDialog(heVar, true, null);
        }
    }

    public static void r(d dVar, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, boolean z4, boolean z5, ue7 ue7Var) {
        ylb ylbVar;
        if (dVar != null) {
            ylbVar = dVar.getResourceProvider();
        } else {
            ylbVar = null;
        }
        s(dVar, z, false, chat, user, z2, z3, z4, z5, ue7Var, ylbVar);
    }

    public static he r0(d dVar, String str, String str2, ylb ylbVar) {
        if (dVar == null) {
            dVar = LaunchActivity.S();
        }
        if (str2 != null && dVar != null && dVar.getParentActivity() != null) {
            he heVar = L(dVar.getParentActivity(), str, str2, null, null, ylbVar).a;
            dVar.showDialog(heVar);
            return heVar;
        }
        return null;
    }

    public static void s(final org.telegram.ui.ActionBar.d r44, final boolean r45, final boolean r46, final org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final defpackage.ue7 r53, final defpackage.ylb r54) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik.s(org.telegram.ui.ActionBar.d, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, ue7, ylb):void");
    }

    public static he s0(d dVar, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
        TextView textView;
        he M = M(dVar.getContext(), dVar.getResourceProvider(), str, charSequence, str2, runnable);
        dVar.showDialog(M);
        if (z && (textView = (TextView) M.c(-1)) != null) {
            anb.X(textView, cmb.p7, null);
        }
        return M;
    }

    public static he t(Activity activity, final long j, final long j2, final int i, final Runnable runnable, ylb ylbVar) {
        int i2;
        boolean z;
        SharedPreferences sharedPreferences = oc7.r1(z8c.t0).W3;
        final String p = lo7.p(j, j2, false);
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 != 0) {
            if (sharedPreferences.contains("color_" + p)) {
                i2 = kt6.g("color_", p, sharedPreferences, -16776961);
            } else if (pg3.y(j)) {
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
        LinearLayout l = td4.l(activity, 1);
        String[] strArr = {jb6.M0(2131751949, null), jb6.M0(2131751954, null), jb6.M0(2131751943, null), jb6.M0(2131751955, null), jb6.M0(2131751956, null), jb6.M0(2131751957, null), jb6.M0(2131751945, null), jb6.M0(2131751950, null), jb6.M0(2131751944, null)};
        final int[] iArr = {i2};
        for (int i4 = 0; i4 < 9; i4++) {
            x09 x09Var = new x09(activity, ylbVar);
            x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
            x09Var.setTag(Integer.valueOf(i4));
            int i5 = djb.e[i4];
            x09Var.a(i5, i5);
            String str = strArr[i4];
            if (i2 == djb.f[i4]) {
                z = true;
            } else {
                z = false;
            }
            x09Var.b(str, z);
            l.addView(x09Var);
            x09Var.setOnClickListener(new bg(l, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        String M0 = jb6.M0(2131748746, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.n(l);
        alertDialog$Builder.j(jb6.M0(2131745284, null), new ee() {
            @Override
            public final void r(he heVar2, int i6) {
                SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
                long j3 = j;
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i7 != 0) {
                    edit.putInt(b10.h("color_", p), iArr2[0]);
                    lo7.n(z8c.t0).f(j3, j2);
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
                    lo7.n(z8c.t0).g(i8);
                }
                edit.commit();
                runnable.run();
            }
        });
        alertDialog$Builder.h(jb6.M0(2131748745, null), new hg(j, i, runnable, (byte) 1));
        if (i3 != 0) {
            alertDialog$Builder.g(jb6.M0(2131751537, null), new o(p, runnable, (byte) 9));
        }
        return heVar;
    }

    public static void t0(String str, d dVar) {
        Context context;
        if (str == null) {
            return;
        }
        if (dVar != null && dVar.getParentActivity() != null) {
            context = dVar.getParentActivity();
        } else {
            context = a.b;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static void u(d dVar, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
        String M0 = jb6.M0(2131751725, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.a0("ContactNotRegistered", null, 2131751726, bw2.m(0, str, str2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131748931, null), new dh((byte) 0, str3, dVar));
        dVar.showDialog(heVar);
    }

    public static he u0(Context context, String str, boolean z) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = jb6.M0(2131689472, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = str;
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        if (z) {
            alertDialog$Builder.g(jb6.M0(2131743508, null), new oe(context, (byte) 1));
        }
        return alertDialog$Builder.o();
    }

    public static AlertDialog$Builder v(Activity activity, final we7 we7Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i = cmb.K5;
        alertDialog$Builder.l(2131624118, 72, cmb.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.a.U = gm.S2(jb6.M0(2131751711, null));
        alertDialog$Builder.j(jb6.M0(2131751710, null), new ee() {
            @Override
            public final void r(he heVar, int i2) {
                byte b = r2;
                we7 we7Var2 = we7Var;
                switch (b) {
                    case 0:
                        we7Var2.a(1);
                        return;
                    default:
                        we7Var2.a(0);
                        return;
                }
            }
        });
        alertDialog$Builder.g(jb6.M0(2131751709, null), new ee() {
            @Override
            public final void r(he heVar, int i2) {
                byte b = r2;
                we7 we7Var2 = we7Var;
                switch (b) {
                    case 0:
                        we7Var2.a(1);
                        return;
                    default:
                        we7Var2.a(0);
                        return;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void v0(lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, lp7Var2.getValue());
        calendar.set(1, lp7Var3.getValue());
        lp7Var.setMinValue(1);
        lp7Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static AlertDialog$Builder w(Context context, int i, int i2, int i3, int i4, int i5, int i6, String str, final boolean z, yg ygVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final lp7 lp7Var = new lp7(context, null);
        final lp7 lp7Var2 = new lp7(context, null);
        final lp7 lp7Var3 = new lp7(context, null);
        linearLayout.addView(lp7Var2, qoe.l(0.3f, 0, -2));
        lp7Var2.setOnScrollListener(new ip7() {
            @Override
            public final void b(int i7) {
                byte b = r5;
                lp7 lp7Var4 = lp7Var3;
                lp7 lp7Var5 = lp7Var;
                lp7 lp7Var6 = lp7Var2;
                boolean z2 = z;
                switch (b) {
                    case 0:
                        if (z2 && i7 == 0) {
                            ik.d(lp7Var6, lp7Var5, lp7Var4);
                            return;
                        }
                        return;
                    case 1:
                        if (z2 && i7 == 0) {
                            ik.d(lp7Var6, lp7Var5, lp7Var4);
                            return;
                        }
                        return;
                    default:
                        if (z2 && i7 == 0) {
                            ik.d(lp7Var6, lp7Var5, lp7Var4);
                            return;
                        }
                        return;
                }
            }
        });
        lp7Var.setMinValue(0);
        lp7Var.setMaxValue(11);
        linearLayout.addView(lp7Var, qoe.l(0.3f, 0, -2));
        lp7Var.setFormatter(new c((byte) 24));
        lp7Var.setOnValueChangedListener(new ng(lp7Var2, lp7Var, lp7Var3, (byte) 0));
        lp7Var.setOnScrollListener(new ip7() {
            @Override
            public final void b(int i7) {
                byte b = r5;
                lp7 lp7Var4 = lp7Var3;
                lp7 lp7Var5 = lp7Var;
                lp7 lp7Var6 = lp7Var2;
                boolean z2 = z;
                switch (b) {
                    case 0:
                        if (z2 && i7 == 0) {
                            ik.d(lp7Var6, lp7Var5, lp7Var4);
                            return;
                        }
                        return;
                    case 1:
                        if (z2 && i7 == 0) {
                            ik.d(lp7Var6, lp7Var5, lp7Var4);
                            return;
                        }
                        return;
                    default:
                        if (z2 && i7 == 0) {
                            ik.d(lp7Var6, lp7Var5, lp7Var4);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i7 = calendar.get(1);
        lp7Var3.setMinValue(i + i7);
        lp7Var3.setMaxValue(i2 + i7);
        lp7Var3.setValue(i7 + i3);
        linearLayout.addView(lp7Var3, qoe.l(0.4f, 0, -2));
        lp7Var3.setOnValueChangedListener(new ng(lp7Var2, lp7Var, lp7Var3, (byte) 1));
        lp7Var3.setOnScrollListener(new ip7() {
            @Override
            public final void b(int i72) {
                byte b = r5;
                lp7 lp7Var4 = lp7Var3;
                lp7 lp7Var5 = lp7Var;
                lp7 lp7Var6 = lp7Var2;
                boolean z2 = z;
                switch (b) {
                    case 0:
                        if (z2 && i72 == 0) {
                            ik.d(lp7Var6, lp7Var5, lp7Var4);
                            return;
                        }
                        return;
                    case 1:
                        if (z2 && i72 == 0) {
                            ik.d(lp7Var6, lp7Var5, lp7Var4);
                            return;
                        }
                        return;
                    default:
                        if (z2 && i72 == 0) {
                            ik.d(lp7Var6, lp7Var5, lp7Var4);
                            return;
                        }
                        return;
                }
            }
        });
        v0(lp7Var2, lp7Var, lp7Var3);
        if (z) {
            d(lp7Var2, lp7Var, lp7Var3);
        }
        if (i4 != -1) {
            lp7Var2.setValue(i4);
            lp7Var.setValue(i5);
            lp7Var3.setValue(i6);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.j(jb6.M0(2131745284, null), new og(z, lp7Var2, lp7Var, lp7Var3, ygVar));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        return alertDialog$Builder;
    }

    public static void x(Context context, String str, String str2, long j, gk gkVar) {
        Object obj;
        wb wbVar;
        if (context == null) {
            return;
        }
        int w0 = cmb.w0(null, cmb.i5, false);
        int w02 = cmb.w0(null, cmb.g5, false);
        cmb.w0(null, cmb.zj, false);
        cmb.w0(null, cmb.Dj, false);
        cmb.w0(null, cmb.D8, false);
        cmb.w0(null, cmb.F8, false);
        cmb.w0(null, cmb.h6, false);
        int w03 = cmb.w0(null, cmb.Ii, false);
        int w04 = cmb.w0(null, cmb.Ei, false);
        int w05 = cmb.w0(null, cmb.Gi, false);
        k6d k6dVar = new k6d(context, (ylb) null);
        Object obj2 = k6dVar.b;
        ((my0) obj2).w0 = false;
        lp7 lp7Var = new lp7(context, null);
        lp7Var.setTextColor(w0);
        lp7Var.setTextOffset(gm.L(10.0f));
        lp7Var.setItemCount(5);
        lp7 lp7Var2 = new lp7(context, null);
        lp7Var2.setItemCount(5);
        lp7Var2.setTextColor(w0);
        lp7Var2.setTextOffset(-gm.L(10.0f));
        lp7 lp7Var3 = new lp7(context, null);
        lp7Var3.setItemCount(5);
        lp7Var3.setTextColor(w0);
        lp7Var3.setTextOffset(-gm.L(34.0f));
        zi ziVar = new zi(context, lp7Var, lp7Var2, lp7Var3, (byte) 2);
        ziVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ziVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(w0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 5));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        ziVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        wb wbVar2 = new wb(context, (byte) 2);
        linearLayout.addView(lp7Var, qoe.l(0.5f, 0, 270));
        lp7Var.setMinValue(0);
        lp7Var.setMaxValue(365);
        lp7Var.setWrapSelectorWheel(false);
        lp7Var.setFormatter(new c((byte) 27));
        jf jfVar = new jf(lp7Var, lp7Var2, lp7Var3, (byte) 2);
        lp7Var.setOnValueChangedListener(jfVar);
        lp7Var2.setMinValue(0);
        lp7Var2.setMaxValue(23);
        linearLayout.addView(lp7Var2, qoe.l(0.2f, 0, 270));
        lp7Var2.setFormatter(new c((byte) 28));
        lp7Var2.setOnValueChangedListener(jfVar);
        lp7Var3.setMinValue(0);
        lp7Var3.setMaxValue(59);
        lp7Var3.setValue(0);
        lp7Var3.setFormatter(new c((byte) 29));
        linearLayout.addView(lp7Var3, qoe.l(0.3f, 0, 270));
        lp7Var3.setOnValueChangedListener(jfVar);
        if (j > 0 && j != 2147483646) {
            long j2 = 1000 * j;
            obj = obj2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            wbVar = wbVar2;
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                lp7Var3.setValue(calendar.get(12));
                lp7Var2.setValue(calendar.get(11));
                lp7Var.setValue(timeInMillis);
            }
        } else {
            obj = obj2;
            wbVar = wbVar2;
        }
        g(null, null, 0L, 0L, 0, lp7Var, lp7Var2, lp7Var3);
        wb wbVar3 = wbVar;
        wbVar3.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        wbVar3.setGravity(17);
        wbVar3.setTextColor(w03);
        wbVar3.setTextSize(1, 14.0f);
        wbVar3.setTypeface(gm.o());
        int L = gm.L(8.0f);
        wbVar3.setBackgroundDrawable(cmb.i0(L, L, L, L, w04, w05, w05));
        wbVar3.setText(str2);
        ziVar.addView(wbVar3, qoe.t(-1, 48, 83, 16, 15, 16, 16));
        wbVar3.setOnClickListener(new gg(lp7Var, lp7Var2, lp7Var3, calendar, gkVar, k6dVar, (byte) 1));
        my0 my0Var = (my0) obj;
        my0Var.O = ziVar;
        my0Var.show();
        my0Var.s0(w02);
        my0Var.K(w02);
    }

    public static void y(final org.telegram.ui.ActionBar.d r46, final org.telegram.tgnet.TLRPC.User r47, final org.telegram.tgnet.TLRPC.Chat r48, final org.telegram.tgnet.TLRPC.EncryptedChat r49, final org.telegram.tgnet.TLRPC.ChatFull r50, final long r51, final defpackage.k47 r53, final android.util.SparseArray[] r54, final defpackage.f47 r55, final int r56, final int r57, org.telegram.tgnet.TLRPC.ChannelParticipant[] r58, final java.lang.Runnable r59, final defpackage.ho1 r60, final defpackage.ylb r61) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik.y(org.telegram.ui.ActionBar.d, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, k47, android.util.SparseArray[], f47, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, ho1, ylb):void");
    }

    public static he z(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String M0 = jb6.M0(2131748474, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131748475, null);
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131748477, null), new hf(launchActivity, (byte) 1));
        return heVar;
    }
}
