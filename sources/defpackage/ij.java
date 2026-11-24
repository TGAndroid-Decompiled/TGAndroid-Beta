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
public abstract class ij {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static hd A(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        SpannableStringBuilder S2 = gl.S2(k96.M0(2131747111, null));
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = S2;
        int i = bkb.K5;
        alertDialog$Builder.l(2131624120, 72, bkb.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.j(k96.M0(2131747107, null), new mh(activity, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131751760, null), null);
        return hdVar;
    }

    public static hd B(Activity activity, boolean z, TLRPC.User user, uc7 uc7Var, wjb wjbVar) {
        int i;
        int i2;
        int w0;
        boolean z2;
        int[] iArr = new int[1];
        String[] strArr = {k96.M0(2131745425, null), k96.M0(2131745424, null), k96.M0(2131745423, null), k96.M0(2131745422, null)};
        LinearLayout m = ir2.m(activity, 1);
        m.setPadding(0, 0, 0, gl.L(4.0f));
        TextView textView = new TextView(activity);
        if (z) {
            textView.setText(k96.M0(2131748652, null));
        } else if (user != null) {
            textView.setText(k96.a0(null, null, 2131748649, l7c.k(user, true)));
        } else {
            textView.setText(k96.M0(2131748650, null));
        }
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setTextSize(1, 16.0f);
        int i3 = 3;
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 48);
        if (k96.a0) {
            i3 = 5;
        }
        int i4 = i3 | 48;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        m.addView(textView, nme.t(-2, -2, i4, 24, i2, 24, 8));
        for (int i5 = 0; i5 < 4; i5++) {
            wy8 wy8Var = new wy8(activity, wjbVar);
            wy8Var.d = (byte) 42;
            wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            wy8Var.setTag(Integer.valueOf(i5));
            a(wy8Var, bkb.f7, bkb.D5, wjbVar);
            String str = strArr[i5];
            if (iArr[0] == i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            wy8Var.b(str, z2);
            m.addView(wy8Var);
            wy8Var.setOnClickListener(new af(iArr, m));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        hd hdVar = alertDialog$Builder.a;
        if (z) {
            hdVar.S = k96.M0(2131748651, null);
        } else {
            int i6 = bkb.K5;
            if (wjbVar != null) {
                w0 = wjbVar.f(i6);
            } else {
                w0 = bkb.w0(null, i6, false);
            }
            hdVar.c0 = new xaa(activity, 0);
            hdVar.d0 = w0;
            hdVar.e0 = -1;
            if (wjbVar == null) {
                alertDialog$Builder.m(i6, null);
            }
        }
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(k96.M0(2131745267, null), new o(iArr, uc7Var, (byte) 5));
        alertDialog$Builder.h(k96.M0(2131752577, null), null);
        return hdVar;
    }

    public static fx0 C(final long j, final long j2, final wjb wjbVar, final d dVar) {
        if (dVar.getParentActivity() == null) {
            return null;
        }
        fx0 i = ug8.i(dVar.getParentActivity(), false, 1, wjbVar);
        i.P = k96.M0(2131747731, null);
        i.Q = true;
        CharSequence[] charSequenceArr = {k96.a0("MuteFor", null, 2131748120, k96.G(1, "Hours", new Object[0])), k96.a0("MuteFor", null, 2131748120, k96.G(8, "Hours", new Object[0])), k96.a0("MuteFor", null, 2131748120, k96.G(2, "Days", new Object[0])), k96.M0(2131748121, null)};
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
                im7.n(y6c.t0).T(j, i3, j2);
                d dVar2 = dVar;
                if (u21.a(dVar2)) {
                    u21.z(dVar2, i3, 0, wjbVar).j();
                }
            }
        };
        i.M = charSequenceArr;
        i.L = onClickListener;
        return i;
    }

    public static void D(Context context, wjb wjbVar, gj gjVar) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (context == null) {
            return;
        }
        int i = bkb.i5;
        if (wjbVar != null) {
            w0 = wjbVar.f(i);
            w02 = wjbVar.f(bkb.g5);
            wjbVar.f(bkb.zj);
            wjbVar.f(bkb.Dj);
            wjbVar.f(bkb.D8);
            wjbVar.f(bkb.F8);
            wjbVar.f(bkb.h6);
            w03 = wjbVar.f(bkb.Ii);
            w04 = wjbVar.f(bkb.Ei);
            w05 = wjbVar.f(bkb.Gi);
        } else {
            w0 = bkb.w0(null, i, false);
            w02 = bkb.w0(null, bkb.g5, false);
            bkb.w0(null, bkb.zj, false);
            bkb.w0(null, bkb.Dj, false);
            bkb.w0(null, bkb.D8, false);
            bkb.w0(null, bkb.F8, false);
            bkb.w0(null, bkb.h6, false);
            w03 = bkb.w0(null, bkb.Ii, false);
            w04 = bkb.w0(null, bkb.Ei, false);
            w05 = bkb.w0(null, bkb.Gi, false);
        }
        int i2 = w04;
        int i3 = w05;
        i4d i4dVar = new i4d(context, wjbVar);
        Object obj = i4dVar.a;
        ((fx0) obj).w0 = false;
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        vi viVar = new vi(context, wjbVar, iArr);
        viVar.setMinValue(0);
        viVar.setMaxValue(20);
        viVar.setTextColor(w0);
        viVar.setValue(0);
        viVar.setFormatter(new de(iArr, (byte) 0));
        qi qiVar = new qi(context, viVar, (byte) 1);
        qiVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        qiVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131748118, null));
        textView.setTextColor(w0);
        ir2.t(textView, 1, 20.0f);
        frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        qiVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        wb wbVar = new wb(context, (byte) 6);
        linearLayout.addView(viVar, nme.l(1.0f, 0, 270));
        viVar.setOnValueChangedListener(new c((byte) 17));
        wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        wbVar.setGravity(17);
        wbVar.setTextColor(w03);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gl.o());
        int L = gl.L(8.0f);
        wbVar.setBackgroundDrawable(bkb.i0(L, L, L, L, i2, i3, i3));
        wbVar.setText(k96.M0(2131753863, null));
        qiVar.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
        wbVar.setOnClickListener(new ee(iArr, viVar, gjVar, i4dVar, (byte) 0));
        fx0 fx0Var = (fx0) obj;
        fx0Var.O = qiVar;
        fx0Var.show();
        fx0Var.s0(w02);
        fx0Var.L(w02);
    }

    public static AlertDialog$Builder E(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        HashMap hashMap = new HashMap();
        int i = bkb.K5;
        hashMap.put("info1", Integer.valueOf(bkb.w0(null, i, false)));
        hashMap.put("info2", Integer.valueOf(bkb.w0(null, i, false)));
        alertDialog$Builder.l(2131624108, 52, bkb.w0(null, i, false), hashMap);
        alertDialog$Builder.m(i, null);
        hdVar.X = true;
        alertDialog$Builder.j(k96.M0(2131752029, null), null);
        hdVar.U = str2;
        return alertDialog$Builder;
    }

    public static hd F(Activity activity, long j, final long j2, int i, final Runnable runnable, wjb wjbVar) {
        int i2;
        int i3;
        char c;
        CharSequence[] charSequenceArr;
        boolean z;
        final long j3 = j;
        final int i4 = i;
        final SharedPreferences sharedPreferences = na7.q1(y6c.t0).W3;
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
            charSequenceArr = new String[]{k96.M0(2131747687, null), k96.M0(2131747689, null), k96.M0(2131747688, null), k96.M0(2131747690, null), k96.M0(2131747686, null)};
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
                charSequenceArr2[0] = k96.M0(2131747689, null);
                charSequenceArr2[1] = k96.M0(2131747688, null);
                charSequenceArr2[c] = k96.M0(2131747690, null);
                charSequenceArr2[3] = k96.M0(2131747686, null);
                charSequenceArr = charSequenceArr2;
            }
            c = 2;
            CharSequence[] charSequenceArr22 = new String[4];
            charSequenceArr22[0] = k96.M0(2131747689, null);
            charSequenceArr22[1] = k96.M0(2131747688, null);
            charSequenceArr22[c] = k96.M0(2131747690, null);
            charSequenceArr22[3] = k96.M0(2131747686, null);
            charSequenceArr = charSequenceArr22;
        }
        LinearLayout m = ir2.m(activity, i2);
        int i7 = i3;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i7, wjbVar, activity);
        int i8 = i7;
        while (i8 < charSequenceArr.length) {
            wy8 wy8Var = new wy8(activity, wjbVar);
            wy8Var.setPadding(gl.L(4.0f), i7, gl.L(4.0f), i7);
            wy8Var.setTag(Integer.valueOf(i8));
            a(wy8Var, bkb.f7, bkb.D5, wjbVar);
            CharSequence charSequence = charSequenceArr[i8];
            if (iArr[i7] == i8) {
                z = 1;
            } else {
                z = i7;
            }
            wy8Var.b(charSequence, z);
            m.addView(wy8Var);
            wy8Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i9;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i10 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = na7.q1(y6c.t0).W3.edit();
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
                        im7.n(y6c.t0).f(j4, j2);
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
                        im7.n(y6c.t0).g(i13);
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
        String M0 = k96.M0(2131747713, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(k96.M0(2131752577, null), null);
        return hdVar;
    }

    public static void G(int i, long j, f53 f53Var, Context context, TLRPC.Photo photo) {
        if (context != null) {
            yg ygVar = new yg(i, j, f53Var, context, photo);
            fx0 fx0Var = new fx0(1, (wjb) f53Var, context, true);
            fx0Var.K();
            fx0Var.P = k96.M0(2131746019, null);
            fx0Var.Q = true;
            zg zgVar = new zg(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, context, f53Var, ygVar, (byte) 0);
            fx0Var.M = new CharSequence[]{k96.M0(2131746028, null), k96.M0(2131746034, null), k96.M0(2131746027, null), k96.M0(2131746036, null), k96.M0(2131746033, null), k96.M0(2131746031, null), k96.M0(2131746030, null), k96.M0(2131746032, null)};
            fx0Var.N = new int[]{2131232100, 2131232340, 2131232343, 2131232073, 2131232339, 2131232342, 2131232344, 2131232341};
            fx0Var.L = zgVar;
            fx0Var.show();
        }
    }

    public static i4d H(final Context context, final long j, long j2, int i, boolean z, final gj gjVar, Runnable runnable, fj fjVar, wjb wjbVar) {
        ?? r22;
        Context context2;
        ViewGroup viewGroup;
        Object obj;
        long j3;
        FrameLayout frameLayout;
        char c;
        zh zhVar;
        ViewGroup viewGroup2;
        boolean[] zArr;
        r7 r7Var;
        Calendar calendar;
        int[] iArr;
        String[] strArr;
        s67 s67Var;
        int[] iArr2;
        String[] strArr2;
        oy8 oy8Var;
        final ci ciVar;
        int i2;
        View view;
        int i3;
        s67 s67Var2;
        ?? r4;
        int i4;
        final fx0 fx0Var;
        TLRPC.User V1;
        TLRPC.UserStatus userStatus;
        boolean z2;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i};
        long e = y6c.h(y6c.t0).e();
        final i4d i4dVar = new i4d(context, wjbVar);
        Object obj2 = i4dVar.a;
        ((fx0) obj2).w0 = false;
        final hn7 hn7Var = new hn7(context, wjbVar);
        int i5 = fjVar.a;
        int i6 = fjVar.c;
        int i7 = fjVar.b;
        hn7Var.setTextColor(i5);
        hn7Var.setTextOffset(gl.L(10.0f));
        hn7Var.setItemCount(5);
        final ?? hn7Var2 = new hn7(context, wjbVar);
        hn7Var2.setWrapSelectorWheel(true);
        hn7Var2.setAllItemsCount(24);
        hn7Var2.setItemCount(5);
        hn7Var2.setTextColor(i5);
        hn7Var2.setTextOffset(-gl.L(10.0f));
        final ?? hn7Var3 = new hn7(context, wjbVar);
        hn7Var3.setWrapSelectorWheel(true);
        hn7Var3.setAllItemsCount(60);
        hn7Var3.setItemCount(5);
        hn7Var3.setTextColor(i5);
        hn7Var3.setTextOffset(-gl.L(34.0f));
        ViewGroup frameLayout2 = new FrameLayout(context);
        zh zhVar2 = new zh(context, hn7Var, hn7Var2, hn7Var3, (byte) 1);
        zhVar2.setClipToPadding(false);
        zhVar2.setClipChildren(false);
        zhVar2.setOrientation(1);
        frameLayout2.addView(zhVar2, nme.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        zhVar2.addView(frameLayout4, nme.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (j == e) {
            r22 = 0;
            textView.setText(k96.M0(2131745322, null));
        } else {
            r22 = 0;
            textView.setText(k96.M0(2131745667, null));
        }
        textView.setTextColor(i5);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        frameLayout4.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 13));
        boolean[] zArr2 = new boolean[1];
        zArr2[r22] = true;
        if (!cf3.D(j) || j == e || (V1 = na7.q1(y6c.t0).V1(Long.valueOf(j))) == null || V1.bot || (userStatus = V1.status) == null || userStatus.expires <= 0) {
            context2 = context;
            viewGroup = frameLayout2;
            obj = obj2;
            j3 = e;
            frameLayout = frameLayout3;
            c = 2;
            zhVar = zhVar2;
            viewGroup2 = frameLayout4;
            zArr = zArr2;
            r7Var = null;
        } else {
            String k = l7c.k(V1, true);
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
            zhVar = zhVar2;
            c = 2;
            zArr = zArr2;
            j3 = e;
            ViewGroup viewGroup3 = frameLayout4;
            r7Var = new r7(context, null, 0, fjVar.a, false, wjbVar);
            context2 = context;
            r7Var.setLongClickEnabled(z2);
            r7Var.setSubMenuOpenSide(2);
            r7Var.setIcon(2131231247);
            r7Var.setBackground(bkb.f0(i6, 1, -1));
            viewGroup3.addView(r7Var, nme.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            r7Var.g(1, k96.a0(null, null, 2131745658, str));
            r7Var.setContentDescription(k96.M0(2131754838, null));
            viewGroup2 = viewGroup3;
        }
        if (r7Var != null) {
            r7Var.setOnClickListener(new t(r7Var, fjVar, (byte) 12));
            r7Var.setDelegate(new ie(gjVar, zArr, i4dVar, (byte) 0));
        }
        ?? imageView = new ImageView(context2);
        oy8 oy8Var2 = new oy8(2131624109, gl.L(24.0f), gl.L(24.0f), true, null);
        oy8Var2.E(true);
        oy8Var2.h = true;
        oy8Var2.start();
        oy8Var2.H(40);
        oy8Var2.K(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(oy8Var2);
        imageView.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(bkb.f0(i6, 1, -1));
        viewGroup2.addView(imageView, nme.d(40, 40.0f, 53, 0.0f, 8.0f, (r7Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        zhVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        char c2 = c;
        final wb wbVar = new wb(context2, (byte) 1);
        linearLayout.addView(hn7Var, nme.l(0.5f, 0, 270));
        hn7Var.setMinValue(0);
        hn7Var.setMaxValue(365);
        hn7Var.setWrapSelectorWheel(false);
        hn7Var.setFormatter(new c((byte) 18));
        Object obj3 = obj;
        final boolean[] zArr3 = zArr;
        final long j4 = j3;
        fn7 fn7Var = new fn7() {
            @Override
            public final void i(hn7 hn7Var4, int i8) {
                int i9;
                if (j4 == j) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                ij.g(wb.this, null, 0L, 0L, i9, hn7Var, hn7Var2, hn7Var3);
            }
        };
        hn7Var.setOnValueChangedListener(fn7Var);
        hn7Var2.setMinValue(0);
        hn7Var2.setMaxValue(23);
        final r7 r7Var2 = r7Var;
        linearLayout.addView(hn7Var2, nme.l(0.2f, 0, 270));
        hn7Var2.setFormatter(new c((byte) 19));
        hn7Var2.setOnValueChangedListener(fn7Var);
        hn7Var3.setMinValue(0);
        hn7Var3.setMaxValue(59);
        hn7Var3.setValue(0);
        hn7Var3.setFormatter(new c((byte) 23));
        linearLayout.addView(hn7Var3, nme.l(0.3f, 0, 270));
        hn7Var3.setOnValueChangedListener(fn7Var);
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
                hn7Var3.setValue(calendar.get(12));
                hn7Var2.setValue(calendar.get(11));
                hn7Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(wbVar, null, 0L, 0L, j4 == j ? 1 : 0, hn7Var, hn7Var2, hn7Var3);
        if (ConnectionsManager.getInstance(y6c.t0).isTestBackend()) {
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
            strArr[0] = k96.M0(2131748308, null);
            strArr[1] = "Every minute";
            strArr[c2] = "Every 5 minutes";
            strArr[3] = k96.M0(2131748310, null);
            strArr[4] = k96.M0(2131748307, null);
            strArr[5] = k96.M0(2131748311, null);
            strArr[6] = k96.M0(2131748309, null);
            strArr[7] = k96.M0(2131748313, null);
            strArr[8] = k96.M0(2131748312, null);
            strArr[9] = k96.M0(2131748306, null);
            s67Var = null;
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
            s67Var = null;
            strArr[0] = k96.M0(2131748308, null);
            strArr[1] = k96.M0(2131748310, null);
            strArr[c2] = k96.M0(2131748307, null);
            strArr[3] = k96.M0(2131748311, null);
            strArr[4] = k96.M0(2131748309, null);
            strArr[5] = k96.M0(2131748313, null);
            strArr[6] = k96.M0(2131748312, null);
            strArr[7] = k96.M0(2131748306, null);
        }
        String[] strArr3 = strArr;
        if (z) {
            iArr2 = iArr;
            strArr2 = strArr3;
            oy8Var = oy8Var2;
            ciVar = hn7Var2;
            i2 = i7;
            view = imageView;
            i3 = 0;
            s67Var2 = s67Var;
            r4 = s67Var2;
        } else {
            ?? frameLayout5 = new FrameLayout(context2);
            i2 = i7;
            int v = bkb.v(i2, bkb.p1(0.075f, i5));
            int[] iArr4 = iArr;
            int p1 = bkb.p1(0.1f, i5);
            ?? textView2 = new TextView(context2);
            strArr2 = strArr3;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i5);
            textView2.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
            int L = gl.L(14.0f);
            int v2 = bkb.v(v, p1);
            textView2.setBackground(bkb.i0(L, L, L, L, v, v2, v2));
            textView2.setGravity(17);
            ciVar = hn7Var2;
            i3 = 0;
            oy8Var = oy8Var2;
            view = imageView;
            s67Var2 = new s67(iArr4, iArr3, strArr2, textView2, (byte) 7);
            iArr2 = iArr4;
            s67Var2.run();
            frameLayout5.addView(textView2, nme.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            zhVar.addView(frameLayout5, nme.o(-1, -2));
            s67Var = textView2;
            r4 = frameLayout5;
        }
        wbVar.setPadding(gl.L(34.0f), i3, gl.L(34.0f), i3);
        wbVar.setGravity(17);
        wbVar.setTextColor(fjVar.g);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gl.o());
        int i8 = fjVar.h;
        float[] fArr = new float[1];
        fArr[i3] = 24.0f;
        wbVar.setBackground(sjb.e(i8, fArr));
        zhVar.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
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
                hn7 hn7Var4 = hn7Var;
                ci ciVar2 = ciVar;
                di diVar = hn7Var3;
                boolean g = ij.g(null, null, 0L, 0L, i10, hn7Var4, ciVar2, diVar);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(currentTimeMillis);
                calendar4.add(6, hn7Var4.getValue());
                calendar4.set(11, ciVar2.getValue());
                calendar4.set(12, diVar.getValue());
                if (g) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                boolean z3 = zArr3[0];
                gjVar.s((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], z3);
                ((fx0) i4dVar.a).y0.run();
            }
        });
        fx0 fx0Var2 = (fx0) obj3;
        fx0Var2.O = viewGroup;
        fx0Var2.show();
        fx0Var2.setOnDismissListener(new vf(runnable, zArr4));
        fx0Var2.s0(i9);
        fx0Var2.L(i9);
        if (s67Var != null) {
            i4 = 1;
            fx0Var = fx0Var2;
            s67Var.setOnClickListener(new lh(frameLayout, wjbVar, fx0Var2, (FrameLayout) r4, iArr2, strArr2, iArr3, s67Var2));
        } else {
            i4 = 1;
            fx0Var = fx0Var2;
        }
        final je5[] je5VarArr = new je5[i4];
        final oy8 oy8Var3 = oy8Var;
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
                oy8 oy8Var4 = oy8Var3;
                int i15 = oy8Var4.b0;
                if (!z3) {
                    if (i15 >= 40) {
                        oy8Var4.H(0);
                    }
                    oy8Var4.K(40);
                    oy8Var4.start();
                } else {
                    if (i15 < 40) {
                        oy8Var4.H(40);
                    }
                    oy8Var4.K(80);
                    oy8Var4.start();
                }
                je5[] je5VarArr2 = je5VarArr;
                je5 je5Var = je5VarArr2[0];
                if (je5Var != null) {
                    je5Var.f(true);
                    je5VarArr2[0] = null;
                }
                na7 q1 = na7.q1(y6c.t0);
                long j6 = j;
                TLRPC.User V12 = q1.V1(Long.valueOf(j6));
                TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(-j6));
                je5 je5Var2 = new je5(context, 3);
                je5VarArr2[0] = je5Var2;
                je5Var2.r();
                je5Var2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                je5Var2.q(20.0f);
                je5Var2.s(gl.L(12.0f), gl.L(4.0f), bkb.p1(0.25f, -16777216));
                if (hc2.V(K0)) {
                    if (zArr5[0]) {
                        i14 = 2131745662;
                    } else {
                        i14 = 2131745666;
                    }
                    M0 = k96.M0(i14, null);
                } else if (K0 == null && V12 != null) {
                    if (j6 == j4) {
                        if (zArr5[0]) {
                            i12 = 2131745659;
                        } else {
                            i12 = 2131745663;
                        }
                        M0 = k96.M0(i12, null);
                    } else {
                        if (zArr5[0]) {
                            i11 = 2131745661;
                        } else {
                            i11 = 2131745665;
                        }
                        M0 = k96.a0(null, null, i11, l7c.l(V12));
                    }
                } else {
                    if (zArr5[0]) {
                        i10 = 2131745660;
                    } else {
                        i10 = 2131745664;
                    }
                    M0 = k96.M0(i10, null);
                }
                je5Var2.t(M0);
                je5Var2.d = 5000L;
                if (r7Var2 != null) {
                    i13 = 42;
                } else {
                    i13 = -8;
                }
                je5Var2.n(1.0f, -(i13 + 20));
                je5Var2.r0 = new hh(je5Var2, (byte) 0);
                fx0 fx0Var3 = fx0Var;
                fx0Var3.b.setClipToPadding(false);
                fx0Var3.b.setClipChildren(false);
                fx0Var3.b.addView(je5Var2, nme.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                je5Var2.v();
            }
        });
        return i4dVar;
    }

    public static void I(Context context, long j, gj gjVar) {
        H(context, j, -1L, 0, false, gjVar, null, new fj(null), null);
    }

    public static void J(Context context, long j, gj gjVar, wjb wjbVar) {
        H(context, j, -1L, 0, false, gjVar, null, new fj(wjbVar), wjbVar);
    }

    public static AlertDialog$Builder K(Context context, String str, String str2) {
        return L(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder L(Context context, String str, String str2, String str3, Runnable runnable, wjb wjbVar) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        if (str == null) {
            str = k96.M0(2131689472, null);
        }
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = str2;
        if (str3 == null) {
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(str3, new ce(runnable, (byte) 4));
        return alertDialog$Builder;
    }

    public static hd M(Context context, wjb wjbVar, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = charSequence;
        alertDialog$Builder.j(str2, new ce(runnable, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        return hdVar;
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
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE));
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

    public static void O(Context context, d dVar, String str, String str2, String str3, String str4, int i, String str5, wjb wjbVar, yc7 yc7Var) {
        View view;
        Activity W = gl.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        hd[] hdVarArr = new hd[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i2 = bkb.i5;
        zkb.X(editTextBoldCursor, i2, wjbVar);
        zkb.D(editTextBoldCursor, bkb.Ni, wjbVar);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(gl.L(16.0f), gl.L(11.0f), gl.L(16.0f), gl.L(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(bkb.p6, wjbVar);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new xf(editTextBoldCursor, i, yc7Var, hdVarArr, view, (byte) 0));
        editTextBoldCursor.addTextChangedListener(new fi(i, editTextBoldCursor));
        ShapeDrawable b0 = bkb.b0(gl.L(22.0f), bkb.p1(0.06f, bkb.v0(i2, wjbVar)));
        vkb K = zkb.K(0.06f, i2);
        editTextBoldCursor.setBackground(b0);
        zkb.j(editTextBoldCursor, b0, K, null, wjbVar);
        LinearLayout j = de9.j(context, 1);
        j.addView((View) editTextBoldCursor, nme.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(j);
        hdVar.a = Math.min(gl.L(320.0f), (gl.q.x * 85) / 100);
        alertDialog$Builder.j(str5, new yf((Object) editTextBoldCursor, i, yc7Var, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131752577, null), new zf((byte) 0));
        hdVarArr[0] = hdVar;
        if (dVar != null) {
            gl.U2(W, dVar.getClassGuid());
        }
        hd hdVar2 = hdVarArr[0];
        hdVar2.k0 = false;
        hdVar2.setOnDismissListener(new ag(editTextBoldCursor, dVar, W, (byte) 0));
        hdVarArr[0].setOnShowListener(new be(editTextBoldCursor, (byte) 1));
        hdVarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void P(Context context, d dVar, wjb wjbVar, yc7 yc7Var) {
        O(context, dVar, k96.M0(2131744562, null), k96.M0(2131744569, null), k96.M0(2131744543, null), null, 12, k96.M0(2131751741, null), wjbVar, yc7Var);
    }

    public static i4d Q(Context context, long j, final gj gjVar, wjb wjbVar, int i) {
        int i2;
        final int i3;
        int i4;
        int i5;
        int i6;
        int w0 = bkb.w0(null, bkb.i5, false);
        int w02 = bkb.w0(null, bkb.g5, false);
        bkb.w0(null, bkb.zj, false);
        bkb.w0(null, bkb.Dj, false);
        bkb.w0(null, bkb.D8, false);
        bkb.w0(null, bkb.F8, false);
        int i7 = bkb.h6;
        bkb.w0(null, i7, false);
        int w03 = bkb.w0(null, bkb.Ii, false);
        int w04 = bkb.w0(null, bkb.Ei, false);
        bkb.w0(null, bkb.Gi, false);
        if (context == null) {
            return null;
        }
        final i4d i4dVar = new i4d(context, wjbVar);
        Object obj = i4dVar.a;
        ((fx0) obj).w0 = false;
        final hn7 hn7Var = new hn7(context, wjbVar);
        hn7Var.setTextColor(w0);
        hn7Var.setTextOffset(gl.L(10.0f));
        hn7Var.setItemCount(5);
        final ?? hn7Var2 = new hn7(context, wjbVar);
        hn7Var2.setWrapSelectorWheel(true);
        hn7Var2.setAllItemsCount(24);
        hn7Var2.setItemCount(5);
        hn7Var2.setTextColor(w0);
        hn7Var2.setTextOffset(-gl.L(10.0f));
        final ?? hn7Var3 = new hn7(context, wjbVar);
        hn7Var3.setWrapSelectorWheel(true);
        hn7Var3.setAllItemsCount(60);
        hn7Var3.setItemCount(5);
        hn7Var3.setTextColor(w0);
        hn7Var3.setTextOffset(-gl.L(34.0f));
        zh zhVar = new zh(context, hn7Var, hn7Var2, hn7Var3, (byte) 7);
        zhVar.setOrientation(1);
        LinearLayout j2 = de9.j(context, 1);
        zhVar.addView(j2, nme.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i == 1) {
            i2 = 2131744133;
        } else {
            i2 = 2131746902;
        }
        textView.setText(k96.M0(i2, null));
        textView.setTextColor(w0);
        ir2.t(textView, 1, 20.0f);
        j2.addView(textView, nme.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new p8((byte) 3));
        TextView textView2 = new TextView(context);
        zkb.X(textView2, bkb.y6, wjbVar);
        ir2.r(14.0f, 1, 2131746901, textView2, null);
        j2.addView(textView2, nme.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new p8((byte) 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        zhVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i8 = calendar.get(1);
        vr2 vr2Var = na7.q1(y6c.t0).k4.i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long g = vr2Var.g(timeUnit) << 1;
        final long g2 = na7.q1(y6c.t0).k4.j.g(timeUnit) - 86400;
        final wb wbVar = new wb(context, (byte) 8);
        linearLayout.addView(hn7Var, nme.l(0.5f, 0, 270));
        hn7Var.setMinValue(0);
        hn7Var.setMaxValue(365);
        hn7Var.setWrapSelectorWheel(false);
        hn7Var.setFormatter(new pf(i8, (byte) 0));
        if (i == 1) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        fn7 fn7Var = new fn7() {
            @Override
            public final void i(hn7 hn7Var4, int i9) {
                ij.g(wb.this, null, g, g2, i3, hn7Var, hn7Var2, hn7Var3);
            }
        };
        hn7Var.setOnValueChangedListener(fn7Var);
        hn7Var2.setMinValue(0);
        hn7Var2.setMaxValue(23);
        linearLayout.addView((View) hn7Var2, nme.l(0.2f, 0, 270));
        hn7Var2.setFormatter(new c((byte) 25));
        hn7Var2.setOnValueChangedListener(fn7Var);
        hn7Var3.setMinValue(0);
        hn7Var3.setMaxValue(59);
        hn7Var3.setValue(0);
        hn7Var3.setFormatter(new c((byte) 26));
        linearLayout.addView((View) hn7Var3, nme.l(0.3f, 0, 270));
        hn7Var3.setOnValueChangedListener(fn7Var);
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
                hn7Var3.setValue(calendar.get(12));
                hn7Var2.setValue(calendar.get(11));
                hn7Var.setValue(timeInMillis);
            }
        } else {
            i4 = w02;
            i5 = i7;
        }
        final boolean[] zArr = {true};
        g(wbVar, null, g, g2, i3, hn7Var, hn7Var2, hn7Var3);
        wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        wbVar.setGravity(17);
        wbVar.setTextColor(w03);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gl.o());
        wbVar.setBackground(sjb.e(w04, 8.0f));
        zhVar.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 4));
        final int i9 = i3;
        wbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                long j4 = g;
                long j5 = g2;
                byte b = i9;
                hn7 hn7Var4 = hn7Var;
                aj ajVar = hn7Var2;
                bj bjVar = hn7Var3;
                boolean g3 = ij.g(null, null, j4, j5, b, hn7Var4, ajVar, bjVar);
                long epochMilli = LocalDate.now().plusDays(hn7Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, ajVar.getValue());
                calendar2.set(12, bjVar.getValue());
                if (g3) {
                    calendar2.set(13, 0);
                }
                gjVar.s((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((fx0) i4dVar.a).y0.run();
            }
        });
        ote.b(wbVar, 0.02f, 1.2f);
        wb wbVar2 = new wb(context, (byte) 9);
        wbVar2.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        wbVar2.setGravity(17);
        if (i == 1) {
            i6 = 2131748279;
        } else {
            i6 = 2131746899;
        }
        wbVar2.setText(k96.M0(i6, null));
        wbVar2.setTextColor(w04);
        wbVar2.setTextSize(1, 14.0f);
        int L = gl.L(8.0f);
        int i10 = bkb.c6;
        int w05 = bkb.w0(null, i10, false);
        int w06 = bkb.w0(null, i5, false);
        ff0 i0 = bkb.i0(L, L, L, L, w05, w06, w06);
        vkb M = zkb.M(i10);
        vkb M2 = zkb.M(i5);
        wbVar2.setBackground(i0);
        zkb.j(wbVar2, i0, M, M2, null);
        zhVar.addView(wbVar2, nme.t(-1, 48, 83, 16, 0, 16, 16));
        wbVar2.setOnClickListener(new b0(zArr, gjVar, i4dVar, (byte) 2));
        ote.b(wbVar2, 0.02f, 1.2f);
        fx0 fx0Var = (fx0) obj;
        fx0Var.O = zhVar;
        fx0Var.show();
        fx0Var.setOnDismissListener(new g5(zArr));
        fx0Var.s0(i4);
        fx0Var.L(i4);
        return i4dVar;
    }

    public static hd R(d dVar, wjb wjbVar) {
        URLSpan[] uRLSpanArr;
        if (dVar == null || dVar.getParentActivity() == null) {
            return null;
        }
        l46 l46Var = new l46(dVar.getParentActivity(), dVar.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(k96.M0(2131753982, null).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new ui(uRLSpan.getURL(), dVar), spanStart, spanEnd, 0);
        }
        l46Var.setText(spannableString);
        l46Var.setTextSize(1, 16.0f);
        zkb.G(l46Var, bkb.j5, wjbVar);
        zkb.C(l46Var, bkb.k5, wjbVar);
        l46Var.setPadding(gl.L(23.0f), 0, gl.L(23.0f), 0);
        l46Var.setMovementMethod(new cl((byte) 0));
        zkb.X(l46Var, bkb.i5, wjbVar);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, dVar.getParentActivity());
        alertDialog$Builder.n(l46Var);
        String M0 = k96.M0(2131753983, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.j(k96.M0(2131753981, null), new h6(dVar, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        return hdVar;
    }

    public static AlertDialog$Builder S(Context context, TLRPC.EncryptedChat encryptedChat, wjb wjbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        alertDialog$Builder.a.S = k96.M0(2131748395, null);
        hn7 hn7Var = new hn7(context, null);
        hn7Var.setMinValue(0);
        hn7Var.setMaxValue(20);
        int i = encryptedChat.ttl;
        if (i > 0 && i < 16) {
            hn7Var.setValue(i);
        } else if (i == 30) {
            hn7Var.setValue(16);
        } else if (i == 60) {
            hn7Var.setValue(17);
        } else if (i == 3600) {
            hn7Var.setValue(18);
        } else if (i == 86400) {
            hn7Var.setValue(19);
        } else if (i == 604800) {
            hn7Var.setValue(20);
        } else if (i == 0) {
            hn7Var.setValue(0);
        }
        hn7Var.setFormatter(new zf((byte) 10));
        alertDialog$Builder.n(hn7Var);
        alertDialog$Builder.g(k96.M0(2131751342, null), new o(encryptedChat, hn7Var, (byte) 8));
        return alertDialog$Builder;
    }

    public static void T(d dVar, int i, akb akbVar, zjb zjbVar) {
        zjb zjbVar2;
        int i2;
        String str;
        if (dVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = dVar.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str2 = null;
        editTextBoldCursor.setBackground(null);
        zkb.F(editTextBoldCursor, bkb.t5, bkb.u5, bkb.p7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.S = k96.M0(2131748066, null);
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131751741, null), new ho9((byte) 13));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i != 0) {
            textView.setText(gl.S2(k96.M0(2131751102, null)));
        } else {
            textView.setText(k96.M0(2131751103, null));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(gl.L(23.0f), gl.L(12.0f), gl.L(23.0f), gl.L(6.0f));
        int i3 = bkb.i5;
        zkb.X(textView, i3, null);
        linearLayout.addView(textView, nme.o(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        zkb.X(editTextBoldCursor, i3, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.A(bkb.F6, null);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, gl.L(4.0f), 0, 0);
        linearLayout.addView((View) editTextBoldCursor, nme.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new ng((byte) 0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        b00.q(9306112, hashMap, "Berry", 14598550, "Brandy");
        b00.q(8391495, hashMap, "Cherry", 16744272, "Coral");
        b00.q(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        b00.q(14725375, hashMap, "Mauve", 16761035, "Pink");
        b00.q(16711680, hashMap, "Red", 16711807, "Rose");
        b00.q(8406555, hashMap, "Russet", 16720896, "Scarlet");
        b00.q(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        b00.q(16760576, hashMap, "Amber", 15438707, "Apricot");
        b00.q(16508850, hashMap, "Banana", 10601738, "Citrus");
        b00.q(11560192, hashMap, "Ginger", 16766720, "Gold");
        b00.q(16640272, hashMap, "Lemon", 16753920, "Orange");
        b00.q(16770484, hashMap, "Peach", 16739155, "Persimmon");
        b00.q(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        b00.q(16763004, hashMap, "Topaz", 16776960, "Yellow");
        b00.q(3688720, hashMap, "Clover", 8628829, "Cucumber");
        b00.q(5294200, hashMap, "Emerald", 11907932, "Olive");
        b00.q(65280, hashMap, "Green", 43115, "Jade");
        b00.q(2730887, hashMap, "Jungle", 12582656, "Lime");
        b00.q(776785, hashMap, "Malachite", 10026904, "Mint");
        b00.q(11394989, hashMap, "Moss", 3234721, "Azure");
        b00.q(255, hashMap, "Blue", 18347, "Cobalt");
        b00.q(5204422, hashMap, "Indigo", 96647, "Lagoon");
        b00.q(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        b00.q(128, hashMap, "Navy", 3101086, "Sapphire");
        b00.q(7788522, hashMap, "Sky", 32896, "Teal");
        b00.q(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        b00.q(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        b00.q(13148872, hashMap, "Lilac", 11894492, "Lavender");
        b00.q(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        b00.q(6684825, hashMap, "Purple", 14204888, "Thistle");
        b00.q(14315734, hashMap, "Orchid", 2361920, "Violet");
        b00.q(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        b00.q(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        b00.q(7365973, hashMap, "Coffee", 7956873, "Rum");
        b00.q(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        b00.q(12759680, hashMap, "Sand", 8924439, "Sienna");
        b00.q(7864585, hashMap, "Maple", 15787660, "Khaki");
        b00.q(12088115, hashMap, "Copper", 12144200, "Chestnut");
        b00.q(15653316, hashMap, "Almond", 16776656, "Cream");
        b00.q(12186367, hashMap, "Diamond", 11109127, "Honey");
        b00.q(16777200, hashMap, "Ivory", 15392968, "Pearl");
        b00.q(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        b00.q(16777215, hashMap, "White", 8421504, "Gray");
        b00.q(0, hashMap, "Black", 15266260, "Chrome");
        b00.q(3556687, hashMap, "Charcoal", 789277, "Ebony");
        b00.q(12632256, hashMap, "Silver", 16119285, "Smoke");
        b00.q(2499381, hashMap, "Steel", 5220413, "Apple");
        b00.q(8434628, hashMap, "Glacier", 16693933, "Melon");
        b00.q(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (zjbVar == null) {
            zjbVar2 = bkb.B0().i(false);
        } else {
            zjbVar2 = zjbVar;
        }
        if (zjbVar2 == null || (i2 = zjbVar2.c) == 0) {
            i2 = gl.q(bkb.r0())[0];
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
            str = ls6.o((String) asList.get(secureRandom.nextInt(asList.size())), " ", str2, new StringBuilder());
        } else {
            str = str2 + " " + ((String) asList2.get(secureRandom.nextInt(asList2.size())));
        }
        editTextBoldCursor.setText(str);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        be beVar = new be(editTextBoldCursor, (byte) 2);
        hd hdVar = alertDialog$Builder.a;
        hdVar.setOnShowListener(beVar);
        dVar.showDialog(hdVar);
        editTextBoldCursor.requestFocus();
        hdVar.c(-1).setOnClickListener(new og(dVar, editTextBoldCursor, zjbVar, akbVar, hdVar, (byte) 0));
    }

    public static void U(Activity activity, String str, int i, int i2, int i3, p8c p8cVar) {
        if (activity == null) {
            return;
        }
        int w0 = bkb.w0(null, bkb.i5, false);
        int w02 = bkb.w0(null, bkb.g5, false);
        bkb.w0(null, bkb.zj, false);
        bkb.w0(null, bkb.Dj, false);
        bkb.w0(null, bkb.D8, false);
        bkb.w0(null, bkb.F8, false);
        bkb.w0(null, bkb.h6, false);
        bkb.w0(null, bkb.Ii, false);
        bkb.w0(null, bkb.Ei, false);
        bkb.w0(null, bkb.Gi, false);
        fx0 i4 = ug8.i(activity, false, 1, null);
        i4.w0 = false;
        ?? hn7Var = new hn7(activity, null);
        zh zhVar = new zh(activity, hn7Var);
        zhVar.setOrientation(0);
        zhVar.setWeightSum(1.0f);
        hn7Var.setAllItemsCount(24);
        hn7Var.setItemCount(5);
        hn7Var.setTextColor(w0);
        hn7Var.setGravity(5);
        hn7Var.setTextOffset(-gl.L(12.0f));
        ?? hn7Var2 = new hn7(activity, null);
        hn7Var2.setWrapSelectorWheel(true);
        hn7Var2.setAllItemsCount(60);
        hn7Var2.setItemCount(5);
        hn7Var2.setTextColor(w0);
        hn7Var2.setGravity(3);
        hn7Var2.setTextOffset(gl.L(12.0f));
        final kg kgVar = new kg(i2, i3, (yh) hn7Var, (ai) hn7Var2, i, zhVar);
        zhVar.addView((View) hn7Var, nme.l(0.5f, 0, 270));
        hn7Var.setFormatter(new zf((byte) 8));
        hn7Var.setOnValueChangedListener(new fn7() {
            @Override
            public final void i(hn7 hn7Var3, int i5) {
                byte b = r2;
                kg kgVar2 = kgVar;
                switch (b) {
                    case 0:
                        kgVar2.a(Boolean.TRUE);
                        return;
                    default:
                        kgVar2.a(Boolean.TRUE);
                        return;
                }
            }
        });
        zhVar.addView((View) hn7Var2, nme.l(0.5f, 0, 270));
        hn7Var2.setFormatter(new zf((byte) 9));
        hn7Var2.setOnValueChangedListener(new fn7() {
            @Override
            public final void i(hn7 hn7Var3, int i5) {
                byte b = r2;
                kg kgVar2 = kgVar;
                switch (b) {
                    case 0:
                        kgVar2.a(Boolean.TRUE);
                        return;
                    default:
                        kgVar2.a(Boolean.TRUE);
                        return;
                }
            }
        });
        kgVar.a(Boolean.FALSE);
        bi biVar = new bi(activity, hn7Var, hn7Var2);
        biVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 8));
        biVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
        biVar.addView(zhVar, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        u41 u41Var = new u41(null, activity, true);
        u41Var.setRoundRadius(24);
        u41Var.i(k96.M0(2131745480, null), false, true);
        u41Var.setOnClickListener(new f5(r1, (byte) 1));
        biVar.addView(u41Var, nme.t(-1, 48, 0, 16, 12, 16, 12));
        i4.O = biVar;
        i4.show();
        i4.setOnDismissListener(new ag(p8cVar, hn7Var, hn7Var2, (byte) 1));
        i4.s0(w02);
        i4.L(w02);
        fx0[] fx0VarArr = {i4};
    }

    public static hd V(Activity activity, final long j, final long j2, String str, final Runnable runnable, wjb wjbVar) {
        String[] strArr;
        boolean z;
        final String str2 = str;
        SharedPreferences sharedPreferences = na7.q1(y6c.t0).W3;
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
            strArr = new String[]{k96.M0(2131743374, null), k96.M0(2131745174, null), k96.M0(2131748531, null), k96.M0(2131743373, null)};
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
            strArr = new String[]{k96.M0(2131743373, null), k96.M0(2131743374, null), k96.M0(2131745174, null), k96.M0(2131748531, null), k96.M0(2131747628, null)};
        }
        String[] strArr2 = strArr;
        LinearLayout m = ir2.m(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        int i3 = 0;
        while (i3 < strArr2.length) {
            wy8 wy8Var = new wy8(activity, wjbVar);
            wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            wy8Var.setTag(Integer.valueOf(i3));
            a(wy8Var, bkb.f7, bkb.D5, wjbVar);
            String str3 = strArr2[i3];
            if (iArr[0] == i3) {
                z = z2;
            } else {
                z = false;
            }
            wy8Var.b(str3, z);
            m.addView(wy8Var);
            wy8Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = na7.q1(y6c.t0).W3.edit();
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
                        im7.n(y6c.t0).f(j3, j2);
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
                            im7.n(y6c.t0).g(2);
                        } else if (str4.equals("vibrate_group")) {
                            im7.n(y6c.t0).g(0);
                        } else {
                            boolean equals = str4.equals("vibrate_react");
                            int i7 = y6c.t0;
                            if (equals) {
                                im7.n(i7).g(4);
                            } else {
                                im7.n(i7).g(1);
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
        String M0 = k96.M0(2131743375, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(k96.M0(2131752577, null), null);
        return hdVar;
    }

    public static hd W(Context context, wjb wjbVar, String[] strArr, int i, String str, String str2, vs2 vs2Var) {
        wjb wjbVar2;
        boolean z;
        int i2;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    wjbVar2 = wjbVar;
                    z = true;
                    break;
                }
            }
        }
        wjbVar2 = wjbVar;
        z = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, context);
        int i3 = bkb.K5;
        alertDialog$Builder.l(i, 72, bkb.w0(null, i3, false), null);
        alertDialog$Builder.m(i3, null);
        if (z) {
            str = str2;
        }
        SpannableStringBuilder S2 = gl.S2(str);
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = S2;
        if (z) {
            i2 = 2131747107;
        } else {
            i2 = 2131752897;
        }
        alertDialog$Builder.j(k96.M0(i2, null), new wf(z, context, atomicBoolean, vs2Var, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131752892, null), new o(atomicBoolean, vs2Var, (byte) 6));
        hdVar.setOnDismissListener(new cf(atomicBoolean, vs2Var, (byte) 1));
        return hdVar;
    }

    public static void X(int i, long j, int i2, p8c p8cVar) {
        Y(i, j, i2, p8cVar, 0L);
    }

    public static boolean Y(final int r24, final long r25, int r27, defpackage.p8c r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij.Y(int, long, int, p8c, long):boolean");
    }

    public static boolean Z(int i, ArrayList arrayList, int i2, p8c p8cVar) {
        wjb f53Var;
        wjb wjbVar;
        if (arrayList.isEmpty()) {
            p8cVar.a(new HashMap());
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
            long K1 = na7.q1(i).K1(longValue);
            if (K1 <= j && longValue > j) {
                K1 = cf3.j(na7.q1(i).J2(longValue));
            }
            hashMap.put(l, Long.valueOf(K1));
            j2 += K1;
            long j3 = j;
            gta.v(i, false).P.put(l, Integer.valueOf(i2));
            int i6 = (K1 > j3 ? 1 : (K1 == j3 ? 0 : -1));
            if (i6 > 0) {
                i5++;
            }
            if (i6 > 0 && z && na7.q1(i).X3.getLong(ug8.n(longValue, "ask_paid_message_", "_price"), j3) < K1) {
                z = false;
            }
            i3 = i5;
            j = 0;
        }
        int i7 = i3;
        long max = j2 * Math.max(1, i2);
        if (!z && max > 0) {
            Activity u0 = gl.u0();
            d S = LaunchActivity.S();
            if (!PhotoViewer.r0().V0()) {
                if (S != null) {
                    if (!S.hasShownSheet()) {
                        f53Var = S.getResourceProvider();
                        wjbVar = f53Var;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) gl.S2(k96.H(',', "MessageLockedStarsConfirmMessageMulti1", i7)));
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) gl.S2(k96.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', k96.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i7) * i2))));
                        f0(u0, k96.M0(2131748362, null), spannableStringBuilder, k96.M0(2131748375, null), k96.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fh(i, max, wjbVar, p8cVar, u0, arrayList, hashMap), wjbVar, true);
                        return true;
                    }
                } else {
                    wjbVar = null;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) gl.S2(k96.H(',', "MessageLockedStarsConfirmMessageMulti1", i7)));
                    spannableStringBuilder2.append((CharSequence) " ");
                    spannableStringBuilder2.append((CharSequence) gl.S2(k96.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', k96.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i7) * i2))));
                    f0(u0, k96.M0(2131748362, null), spannableStringBuilder2, k96.M0(2131748375, null), k96.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fh(i, max, wjbVar, p8cVar, u0, arrayList, hashMap), wjbVar, true);
                    return true;
                }
            }
            f53Var = new f53();
            wjbVar = f53Var;
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
            spannableStringBuilder22.append((CharSequence) gl.S2(k96.H(',', "MessageLockedStarsConfirmMessageMulti1", i7)));
            spannableStringBuilder22.append((CharSequence) " ");
            spannableStringBuilder22.append((CharSequence) gl.S2(k96.K("MessageLockedStarsConfirmMessageMulti2", (int) max, ',', k96.H(',', "MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i7) * i2))));
            f0(u0, k96.M0(2131748362, null), spannableStringBuilder22, k96.M0(2131748375, null), k96.H(',', "MessageLockedStarsConfirmMessagePay", i2), new fh(i, max, wjbVar, p8cVar, u0, arrayList, hashMap), wjbVar, true);
            return true;
        }
        p8cVar.a(hashMap);
        return false;
    }

    public static void a(wy8 wy8Var, int i, int i2, wjb wjbVar) {
        for (int i3 = 0; i3 < wy8Var.getChildCount(); i3++) {
            View childAt = wy8Var.getChildAt(i3);
            if (childAt instanceof RadioButton) {
                zkb.O((RadioButton) childAt, i, i2, wjbVar);
                return;
            }
        }
        wy8Var.a(bkb.v0(i, wjbVar), bkb.v0(i2, wjbVar));
    }

    public static boolean a0(int i, long j) {
        long K1 = na7.q1(i).K1(j);
        if (K1 <= 0 && j > 0) {
            K1 = cf3.j(na7.q1(i).J2(j));
        }
        if (K1 > 0 && K1 > na7.q1(i).X3.getLong(ug8.n(j, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void b(hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3) {
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
        hn7Var3.setMaxValue(i7);
        hn7Var3.setMinValue(i4);
        int value = hn7Var3.getValue();
        if (value == i7) {
            i = i8;
        } else {
            i = 11;
        }
        hn7Var2.setMaxValue(i);
        if (value == i4) {
            i2 = i5;
        } else {
            i2 = 0;
        }
        hn7Var2.setMinValue(i2);
        int value2 = hn7Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i7 && value2 == i8) {
            actualMaximum = Math.min(i9, actualMaximum);
        }
        hn7Var.setMaxValue(actualMaximum);
        if (value == i4 && value2 == i5) {
            i3 = i6;
        }
        hn7Var.setMinValue(i3);
    }

    public static void b0(hj hjVar, hd hdVar, d dVar) {
        if (dVar.getParentActivity() != null) {
            gl.t1(hjVar);
            String obj = hjVar.getText().toString();
            int i = bkb.a;
            akb akbVar = new akb();
            File h = a.h();
            akbVar.b = new File(h, "theme" + Utilities.b.nextLong() + ".attheme").getAbsolutePath();
            akbVar.a = obj;
            bkb.g0 = bkb.Z0(bkb.I.j0);
            akbVar.F = y6c.t0;
            bkb.v1(akbVar, true, true, false);
            kk7.e().k(kk7.q4, new Object[0]);
            new ThemeEditorView().d(dVar.getParentActivity(), akbVar);
            hdVar.dismiss();
            SharedPreferences c1 = na7.c1();
            if (c1.getBoolean("themehint", false)) {
                return;
            }
            c1.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(dVar.getParentActivity(), k96.M0(2131751698, null), 1).show();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public static long c(u41 u41Var, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3, hn7 hn7Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i = 1;
        int i2 = calendar.get(1);
        int value = ((hn7Var2.getValue() - 120) / 12) + i2;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (hn7Var2.getValue() - 120) % 12);
        hn7Var.setMinValue(1);
        hn7Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = hn7Var.getValue();
        int value3 = hn7Var3.getValue();
        int value4 = hn7Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (u41Var != null) {
            if (value2 == 0) {
                i = 0;
            } else if (i2 != value) {
                i = 2;
            }
            u41Var.setText(k96.D0().w0(i + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static defpackage.hd c0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.d r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij.c0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.d, org.telegram.tgnet.TLObject, java.lang.Object[]):hd");
    }

    public static void d(hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3) {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = 1;
        int i3 = calendar.get(1);
        int i4 = calendar.get(2);
        int i5 = calendar.get(5);
        hn7Var3.setMinValue(i3);
        int value = hn7Var3.getValue();
        if (value == i3) {
            i = i4;
        } else {
            i = 0;
        }
        hn7Var2.setMinValue(i);
        int value2 = hn7Var2.getValue();
        if (value == i3 && value2 == i4) {
            i2 = i5;
        }
        hn7Var.setMinValue(i2);
    }

    public static void d0(Context context, wjb wjbVar, String str, TLRPC.WebPage webPage, final p8c p8cVar, o52 o52Var) {
        final View view;
        Activity W = gl.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        final hd[] hdVarArr = new hd[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(2131746960, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131746961, null);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i = bkb.i5;
        zkb.X(editTextBoldCursor, i, wjbVar);
        zkb.D(editTextBoldCursor, bkb.Ni, wjbVar);
        editTextBoldCursor.setHint(k96.M0(2131746959, null));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(gl.L(16.0f), gl.L(13.0f), gl.L(16.0f), gl.L(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.A(bkb.p6, wjbVar);
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
                mi miVar = mi.this;
                String trim = miVar.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = ij.a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    gl.z3(miVar);
                    return true;
                }
                p8cVar.a(trim);
                hd hdVar2 = hdVarArr[0];
                if (hdVar2 != null) {
                    hdVar2.dismiss();
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        ShapeDrawable b0 = bkb.b0(gl.L(22.0f), bkb.p1(0.06f, bkb.v0(i, wjbVar)));
        vkb K = zkb.K(0.06f, i);
        editTextBoldCursor.setBackground(b0);
        zkb.j(editTextBoldCursor, b0, K, null, wjbVar);
        LinearLayout j = de9.j(context, 1);
        j.addView((View) editTextBoldCursor, nme.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i2 = jtc.f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            jtc jtcVar = new jtc(context, wjbVar);
            jtcVar.setWebPage(webPage);
            j.addView(jtcVar, nme.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.b();
        alertDialog$Builder.n(j);
        hdVar.a = Math.min(gl.L(320.0f), (gl.q.x * 85) / 100);
        alertDialog$Builder.j(k96.M0(2131751342, null), new o(editTextBoldCursor, p8cVar, (byte) 7));
        alertDialog$Builder.g(k96.M0(2131752577, null), new zf((byte) 7));
        if (o52Var != null) {
            alertDialog$Builder.h(k96.M0(2131751586, null), new l0(o52Var, (byte) 14));
        }
        hdVarArr[0] = hdVar;
        hdVar.k0 = false;
        hdVar.setOnDismissListener(new n1(editTextBoldCursor, (byte) 4));
        hdVarArr[0].setOnShowListener(new jg(editTextBoldCursor, (byte) 0));
        hdVarArr[0].show();
        TextView textView = (TextView) hdVarArr[0].c(-3);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
        }
    }

    public static void e(TextView textView, hn7 hn7Var, ki kiVar, li liVar) {
        String str;
        String str2;
        int value = hn7Var.getValue();
        int value2 = kiVar.getValue();
        int value3 = liVar.getValue();
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
            str = k96.G(i, "Days", new Object[0]);
        }
        if (i2 <= 0) {
            str2 = "";
        } else {
            str2 = k96.G(i2, "Hours", new Object[0]);
        }
        if (i3 > 0) {
            str3 = k96.G(i3, "Minutes", new Object[0]);
        }
        textView.setText(k96.a0(null, null, 2131746981, k96.a0(null, null, 2131746980, str, str2, str3).trim()));
    }

    public static void e0(TLRPC.TL_error tL_error, d dVar, boolean z, boolean z2, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && dVar != null && dVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
            String M0 = k96.M0(2131689472, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
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
                    hdVar.U = k96.M0(2131748566, null);
                    break;
                case 1:
                    hdVar.U = k96.M0(2131746399, null);
                    break;
                case 2:
                    hdVar.U = k96.M0(2131751736, null);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z) {
                        hdVar.U = k96.M0(2131752259, null);
                        break;
                    } else {
                        hdVar.U = k96.M0(2131749197, null);
                        break;
                    }
                case 4:
                    hdVar.U = k96.M0(2131743489, null);
                    break;
                case 5:
                    hdVar.U = k96.M0(2131747934, null);
                    alertDialog$Builder.g(k96.M0(2131748139, null), new h6(dVar, (byte) 3));
                    break;
                case 6:
                    if (z) {
                        hdVar.U = k96.M0(2131752257, null);
                        break;
                    } else {
                        hdVar.U = k96.M0(2131749195, null);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        hdVar.U = k96.M0(2131754361, null);
                        break;
                    } else {
                        hdVar.U = k96.M0(2131754474, null);
                        break;
                    }
                case '\t':
                    hdVar.U = k96.M0(2131742579, null);
                    break;
                case '\n':
                    hdVar.U = k96.M0(2131754462, null);
                    break;
                case '\f':
                    if (z) {
                        hdVar.U = k96.M0(2131752260, null);
                        break;
                    } else {
                        hdVar.U = k96.M0(2131749198, null);
                        break;
                    }
                case 14:
                    if (z) {
                        hdVar.U = k96.M0(2131752258, null);
                        break;
                    } else {
                        hdVar.U = k96.M0(2131749196, null);
                        break;
                    }
                case 15:
                    hdVar.S = k96.M0(2131752270, null);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        hdVar.U = k96.M0(2131752272, null);
                        break;
                    } else {
                        hdVar.U = k96.M0(2131752271, null);
                        break;
                    }
                case 16:
                    hdVar.S = k96.M0(2131752270, null);
                    hdVar.U = k96.M0(2131743518, null);
                    break;
                case 17:
                    if (z) {
                        hdVar.U = k96.M0(2131752256, null);
                        break;
                    } else {
                        hdVar.U = k96.M0(2131749194, null);
                        break;
                    }
                case 18:
                    hdVar.U = k96.M0(2131754473, null);
                    break;
                case 19:
                    if (z2) {
                        hdVar.U = k96.M0(2131748919, null);
                        break;
                    } else if (z) {
                        hdVar.U = k96.M0(2131748920, null);
                        break;
                    } else {
                        hdVar.U = k96.M0(2131748917, null);
                        break;
                    }
                case 20:
                    hdVar.S = k96.M0(2131743064, null);
                    hdVar.U = k96.M0(2131743134, null);
                    break;
                default:
                    hdVar.U = k96.M0(2131751093, null) + "\n" + tL_error.text;
                    break;
            }
            b00.t(null, 2131747638, alertDialog$Builder, null);
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
                    user = na7.q1(i).V1(Long.valueOf(tL_missingInvitee2.user_id));
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
                gl.d3(new i57(i, chat, arrayList, arrayList2, arrayList3, (byte) 1), 200L);
            }
        }
    }

    public static hd f0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, p8c p8cVar, wjb wjbVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int L;
        if (activity == null) {
            p8cVar.a(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        ag2[] ag2VarArr = new ag2[1];
        boolean[] zArr = {false};
        wb wbVar = new wb(activity, (byte) 10);
        kk7.i(wbVar);
        zkb.X(wbVar, bkb.i5, wjbVar);
        wbVar.setTextSize(1, 16.0f);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        wbVar.setGravity(i | 48);
        wbVar.setText(charSequence);
        rh rhVar = new rh(activity, ag2VarArr, (byte) 1);
        hd hdVar = alertDialog$Builder.a;
        hdVar.H = (byte) 6;
        alertDialog$Builder.n(rhVar);
        TextView textView = new TextView(activity);
        tb4.w(textView, bkb.D8, wjbVar, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        rhVar.addView(textView, nme.d(-1, -2.0f, i3 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (k96.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        rhVar.addView(wbVar, nme.d(-2, -2.0f, i4 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            ag2 ag2Var = new ag2(1, wjbVar, activity);
            ag2VarArr[0] = ag2Var;
            int i7 = bkb.h6;
            ff0 f0 = bkb.f0(bkb.v0(i7, wjbVar), 7, gl.L(12.0f));
            vkb M = zkb.M(i7);
            ag2Var.setBackground(f0);
            zkb.j(ag2Var, f0, null, M, wjbVar);
            ag2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ag2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (k96.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            layoutParams.gravity = i5 | 16;
            ag2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            ag2VarArr[0].e(charSequence2, "", false, false, false);
            ag2 ag2Var2 = ag2VarArr[0];
            if (k96.a0) {
                i6 = gl.L(4.0f);
            } else {
                i6 = 0;
            }
            int L2 = gl.L(12.0f);
            if (k96.a0) {
                L = 0;
            } else {
                L = gl.L(4.0f);
            }
            ag2Var2.setPadding(i6, L2, L, gl.L(12.0f));
            rhVar.addView(ag2VarArr[0], nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            ag2VarArr[0].setOnClickListener(new ge(zArr, (byte) 3));
        }
        alertDialog$Builder.j(str2, new ah((byte) 0, p8cVar, zArr));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        if (z) {
            hdVar.Y0 = true;
        }
        hdVar.show();
        return hdVar;
    }

    public static boolean g(TextView textView, TextView textView2, long j, long j2, int i, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3) {
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
        int value = hn7Var.getValue();
        int value2 = hn7Var2.getValue();
        int value3 = hn7Var3.getValue();
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
        hn7Var.setMinValue(0);
        int i15 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
        if (i15 > 0) {
            hn7Var.setMaxValue(i3);
        }
        int value4 = hn7Var.getValue();
        if (value4 == 0) {
            i6 = i13;
        } else {
            i6 = 0;
        }
        hn7Var2.setMinValue(i6);
        if (i15 > 0) {
            if (value4 == i3) {
                i10 = i4;
            } else {
                i10 = 23;
            }
            hn7Var2.setMaxValue(i10);
        }
        int value5 = hn7Var2.getValue();
        if (value4 == 0 && value5 == i13) {
            i7 = i14;
        } else {
            i7 = 0;
        }
        hn7Var3.setMinValue(i7);
        if (i15 > 0) {
            if (value4 == i3 && value5 == i4) {
                i9 = i12;
            } else {
                i9 = 59;
            }
            hn7Var3.setMaxValue(i9);
        }
        int value6 = hn7Var3.getValue();
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
            textView.setText(k96.D0().w0((i * 3) + i8).format(timeInMillis2));
        }
        if (textView2 != null) {
            int i17 = (int) ((timeInMillis2 - j3) / 1000);
            if (i17 > 86400) {
                z2 = false;
                G = k96.G(Math.round(i17 / 86400.0f), "DaysSchedule", new Object[0]);
            } else {
                z2 = false;
                z2 = false;
                z2 = false;
                if (i17 >= 3600) {
                    G = k96.G(Math.round(i17 / 3600.0f), "HoursSchedule", new Object[0]);
                } else if (i17 >= 60) {
                    G = k96.G(Math.round(i17 / 60.0f), "MinutesSchedule", new Object[0]);
                } else {
                    G = k96.G(i17, "SecondsSchedule", new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                z = true;
                Object[] objArr = new Object[1];
                objArr[z2 ? 1 : 0] = G;
                textView2.setText(k96.a0("VoipChannelScheduleInfo", null, 2131743221, objArr));
            } else {
                z = true;
                Object[] objArr2 = new Object[1];
                objArr2[z2 ? 1 : 0] = G;
                textView2.setText(k96.a0("VoipGroupScheduleInfo", null, 2131743100, objArr2));
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

    public static void g0(org.telegram.ui.ActionBar.d r29, long r30, final org.telegram.tgnet.TLRPC.User r32, final org.telegram.tgnet.TLRPC.Chat r33, final org.telegram.tgnet.TLRPC.EncryptedChat r34, final boolean r35, org.telegram.tgnet.TLRPC.ChatFull r36, final defpackage.uc7 r37, defpackage.wjb r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij.g0(org.telegram.ui.ActionBar.d, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, uc7, wjb):void");
    }

    public static boolean h(Context context, int i, long j, boolean z) {
        TLRPC.Chat K0;
        if (cf3.y(j) && (K0 = na7.q1(i).K0(Long.valueOf(-j))) != null && K0.slowmode_enabled && !hc2.N(K0)) {
            if (!z) {
                TLRPC.ChatFull L0 = na7.q1(i).L0(K0.id);
                if (L0 == null) {
                    L0 = ad7.Y(i).C0(K0.id, hc2.T(K0), new CountDownLatch(1), false, false, 0);
                }
                if (L0 != null && L0.slowmode_next_send_date >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                    z = true;
                }
            }
            if (z) {
                K(context, K0.title, k96.M0(2131745110, null)).o();
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h0(mu1 mu1Var, k27 k27Var, long j, wjb wjbVar, vm1 vm1Var) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int L;
        int L2;
        if (mu1Var.getParentActivity() != null && k27Var != null) {
            j5 accountInstance = mu1Var.getAccountInstance();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                user = na7.q1(accountInstance.a).V1(Long.valueOf(j));
            } else {
                user = null;
            }
            if (i < 0) {
                chat = na7.q1(accountInstance.a).K0(Long.valueOf(-j));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, mu1Var.getParentActivity());
                hd hdVar = alertDialog$Builder.a;
                hdVar.Q0 = false;
                hdVar.O = new n1(vm1Var, (byte) 2);
                hdVar.S = k96.M0(2131753689, null);
                if (user != null) {
                    hdVar.U = gl.S2(k96.a0("BlockUserReplyAlert", null, 2131753683, l7c.k(user, true)));
                } else {
                    hdVar.U = gl.S2(k96.a0("BlockUserReplyAlert", null, 2131753683, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(mu1Var.getParentActivity());
                linearLayout.setOrientation(1);
                ag2[] ag2VarArr = {new ag2(1, wjbVar, mu1Var.getParentActivity())};
                ag2VarArr[0].setBackgroundDrawable(bkb.L0(false));
                ag2VarArr[0].setTag(0);
                ag2VarArr[0].e(k96.M0(2131751490, null), "", true, false, false);
                ag2 ag2Var = ag2VarArr[0];
                if (k96.a0) {
                    L = gl.L(16.0f);
                } else {
                    L = gl.L(8.0f);
                }
                if (k96.a0) {
                    L2 = gl.L(8.0f);
                } else {
                    L2 = gl.L(16.0f);
                }
                ag2Var.setPadding(L, 0, L2, 0);
                linearLayout.addView(ag2VarArr[0], nme.o(-1, -2));
                ag2VarArr[0].setOnClickListener(new yd(ag2VarArr, (byte) 0));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.j(k96.M0(2131753692, null), new zd(user, accountInstance, mu1Var, chat, k27Var, ag2VarArr, wjbVar));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                mu1Var.showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                }
            }
        }
    }

    public static hd i(Activity activity, ej ejVar) {
        if (y6c.c() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        hd hdVar = alertDialog$Builder.a;
        tc tcVar = hdVar.M0;
        hd[] hdVarArr = new hd[1];
        LinearLayout m = ir2.m(activity, 1);
        for (int i = 0; i < 4; i++) {
            if (y6c.h(i).f() != null) {
                k5 k5Var = new k5(activity, false);
                k5Var.f = i;
                TLRPC.User f = y6c.h(i).f();
                pb0 pb0Var = k5Var.e;
                pb0Var.q(f);
                k5Var.a.l(qu2.m(0, f.first_name, f.last_name), false);
                be0 be0Var = k5Var.c;
                be0Var.getImageReceiver().d = i;
                be0Var.f(f, pb0Var);
                k5Var.d.setVisibility(4);
                k5Var.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
                k5Var.setBackgroundDrawable(bkb.L0(false));
                m.addView(k5Var, nme.o(-1, 50));
                k5Var.setOnClickListener(new b0(hdVarArr, tcVar, ejVar, (byte) 3));
            }
        }
        hdVar.S = k96.M0(2131745479, null);
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(k96.M0(2131752577, null), null);
        hdVarArr[0] = hdVar;
        return hdVar;
    }

    public static void i0(Context context, int i, long j) {
        fx0 h = de9.h(1, null, context, false);
        LinearLayout j2 = de9.j(context, 1);
        j2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j2.addView(frameLayout, nme.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232771);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, nme.e(-1, -1, 17));
        int L = gl.L(80.0f);
        int i2 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.w0(null, i2, false));
        vkb M = zkb.M(i2);
        frameLayout2.setBackground(K);
        zkb.j(frameLayout2, K, M, null, null);
        frameLayout.addView(frameLayout2, nme.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i3 = bkb.F6;
        tb4.w(textView, i3, null, 1, 20.0f);
        textView.setText(k96.M0(2131752612, null));
        textView.setGravity(17);
        TextView m = ug8.m(j2, textView, nme.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        zkb.X(m, i3, null);
        m.setTextSize(1, 14.0f);
        de9.r(null, null, 2131752613, new Object[]{cf3.k(i, j)}, m);
        m.setGravity(17);
        j2.addView(m, nme.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        u41 u41Var = new u41(null, context, true);
        u41Var.i(k96.M0(2131752614, null), false, true);
        j2.addView(u41Var, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        h.O = j2;
        u41Var.setOnClickListener(new ih(i, u41Var, h, j));
        h.K();
        h.show();
    }

    public static hd j(Context context, wjb wjbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(2131754240, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = M0;
        int i = bkb.K5;
        alertDialog$Builder.l(2131624116, 72, bkb.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.j(k96.M0(2131747107, null), new od(context, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131751760, null), null);
        return hdVar;
    }

    public static void j0(String str, d dVar) {
        String G;
        if (str != null && str.startsWith("FLOOD_WAIT") && dVar != null && dVar.getParentActivity() != null) {
            int intValue = Utilities.z(str).intValue();
            if (intValue < 60) {
                G = k96.G(intValue, "Seconds", new Object[0]);
            } else {
                G = k96.G(intValue / 60, "Minutes", new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
            String M0 = k96.M0(2131689472, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.a0("FloodWaitTime", null, 2131750669, G);
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            dVar.showDialog(hdVar, true, null);
        }
    }

    public static void k(Context context, wjb wjbVar, gj gjVar) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (context == null) {
            return;
        }
        int i = bkb.i5;
        if (wjbVar != null) {
            w0 = wjbVar.f(i);
            w02 = wjbVar.f(bkb.g5);
            wjbVar.f(bkb.zj);
            wjbVar.f(bkb.Dj);
            wjbVar.f(bkb.D8);
            wjbVar.f(bkb.F8);
            wjbVar.f(bkb.h6);
            w03 = wjbVar.f(bkb.Ii);
            w04 = wjbVar.f(bkb.Ei);
            w05 = wjbVar.f(bkb.Gi);
        } else {
            w0 = bkb.w0(null, i, false);
            w02 = bkb.w0(null, bkb.g5, false);
            bkb.w0(null, bkb.zj, false);
            bkb.w0(null, bkb.Dj, false);
            bkb.w0(null, bkb.D8, false);
            bkb.w0(null, bkb.F8, false);
            bkb.w0(null, bkb.h6, false);
            w03 = bkb.w0(null, bkb.Ii, false);
            w04 = bkb.w0(null, bkb.Ei, false);
            w05 = bkb.w0(null, bkb.Gi, false);
        }
        int i2 = w04;
        int i3 = w05;
        int i4 = w02;
        int i5 = w03;
        i4d i4dVar = new i4d(context, wjbVar);
        Object obj = i4dVar.a;
        ((fx0) obj).w0 = false;
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        pi piVar = new pi(context, wjbVar, iArr);
        piVar.setMinValue(0);
        piVar.setMaxValue(16);
        piVar.setTextColor(w0);
        piVar.setValue(0);
        piVar.setFormatter(new de(iArr, (byte) 1));
        qi qiVar = new qi(context, piVar, (byte) 0);
        qiVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        qiVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131753874, null));
        textView.setTextColor(w0);
        ir2.t(textView, 1, 20.0f);
        frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        qiVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ri riVar = new ri(context, true, true, false, (byte) 0);
        linearLayout.addView(piVar, nme.l(1.0f, 0, 270));
        riVar.setPadding(0, 0, 0, 0);
        riVar.setGravity(17);
        riVar.setTextColor(i5);
        riVar.setTextSize(gl.L(14.0f));
        riVar.setTypeface(gl.o());
        int L = gl.L(8.0f);
        riVar.setBackgroundDrawable(bkb.i0(L, L, L, L, i2, i3, i3));
        qiVar.addView(riVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
        riVar.setText(k96.M0(2131751422, null));
        piVar.setOnValueChangedListener(new l0(riVar, (byte) 17));
        riVar.setOnClickListener(new ee(iArr, piVar, gjVar, i4dVar, (byte) 2));
        fx0 fx0Var = (fx0) obj;
        fx0Var.O = qiVar;
        fx0Var.show();
        fx0Var.s0(i4);
        fx0Var.L(i4);
    }

    public static void k0(Context context, wjb wjbVar, int i, TL_stars.StarGift starGift, long j, Runnable runnable) {
        TLObject Z1 = na7.q1(i).Z1(j);
        LinearLayout j2 = de9.j(context, 1);
        j2.addView(new vpa(context, starGift, Z1), nme.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setTextSize(1, 16.0f);
        de9.r(null, null, 2131749419, new Object[]{cf3.G(null, null, Z1)}, textView);
        j2.addView(textView, nme.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        alertDialog$Builder.n(j2);
        alertDialog$Builder.j(k96.M0(2131749420, null), new ce(runnable, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.o();
    }

    public static i4d l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, p8c p8cVar, Runnable runnable, boolean z, boolean z2, wjb wjbVar) {
        int i;
        int i2;
        if (context == null) {
            return null;
        }
        i4d i4dVar = new i4d(context, wjbVar);
        Object obj = i4dVar.a;
        ((fx0) obj).w0 = false;
        hn7 hn7Var = new hn7(context, wjbVar);
        hn7Var.setTextOffset(gl.L(10.0f));
        hn7Var.setItemCount(5);
        hn7 hn7Var2 = new hn7(context, wjbVar);
        hn7Var2.setItemCount(5);
        hn7Var2.setTextOffset(-gl.L(10.0f));
        hn7 hn7Var3 = new hn7(context, wjbVar);
        hn7Var3.setItemCount(5);
        hn7Var3.setTextOffset(-gl.L(24.0f));
        hi hiVar = new hi(context, hn7Var, hn7Var2, hn7Var3);
        hiVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        hiVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        tb4.w(textView, bkb.i5, wjbVar, 1, 20.0f);
        frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        hiVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i3 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i4 = calendar.get(5);
        int i5 = calendar.get(2);
        int i6 = calendar.get(1);
        int i7 = i6 + 1;
        ug ugVar = new ug(hn7Var3, i7, hn7Var, hn7Var2, i6, i5, i4);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(hn7Var, nme.l(0.25f, 0, 270));
        hn7Var.setMinValue(1);
        hn7Var.setMaxValue(31);
        hn7Var.setWrapSelectorWheel(false);
        hn7Var.setFormatter(new zf((byte) 11));
        l0 l0Var = new l0(ugVar, (byte) 16);
        hn7Var.setOnScrollListener(l0Var);
        hn7Var2.setMinValue(0);
        hn7Var2.setMaxValue(11);
        hn7Var2.setWrapSelectorWheel(false);
        linearLayout.addView(hn7Var2, nme.l(0.5f, 0, 270));
        hn7Var2.setFormatter(new zf((byte) 12));
        hn7Var2.setOnScrollListener(l0Var);
        hn7Var3.setMinValue(i3);
        hn7Var3.setMaxValue(i7);
        hn7Var3.setWrapSelectorWheel(false);
        hn7Var3.setFormatter(new pf(i7, (byte) 1));
        linearLayout.addView(hn7Var3, nme.l(0.25f, 0, 270));
        hn7Var3.setOnScrollListener(l0Var);
        if (tL_birthday != null) {
            hn7Var.setValue(tL_birthday.day);
            hn7Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                hn7Var3.setValue(tL_birthday.year);
            } else {
                hn7Var3.setValue(i7);
            }
        } else {
            hn7Var.setValue(calendar.get(5));
            hn7Var2.setValue(calendar.get(2));
            hn7Var3.setValue(i7);
        }
        ugVar.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            l46 l46Var = new l46(context, null);
            l46Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
            l46Var.setTextSize(1, 13.0f);
            zkb.X(l46Var, bkb.p5, wjbVar);
            zkb.G(l46Var, bkb.Wc, wjbVar);
            l46Var.setGravity(17);
            frameLayout2.addView(l46Var, nme.e(-2, -2, 17));
            hiVar.addView(frameLayout2, nme.o(-1, -2));
            int i8 = y6c.t0;
            eg egVar = new eg(i8, l46Var, (byte) 1);
            egVar.run();
            kk7.f(i8).h(frameLayout2, kk7.j0, new be2(egVar, (byte) 3));
            qu2.r(i8).D(false);
        }
        if (z) {
            u41 u41Var = new u41(wjbVar, context, false);
            u41Var.i(k96.M0(2131751658, null), false, true);
            u41Var.setOnClickListener(new wg(hn7Var3, i7, ugVar, (byte) 0));
            hiVar.addView(u41Var, nme.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        textView2.setGravity(17);
        zkb.X(textView2, bkb.Ii, wjbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setText(str2);
        int L = gl.L(24.0f);
        int i9 = bkb.Ei;
        int v0 = bkb.v0(i9, wjbVar);
        int i10 = bkb.Gi;
        int v02 = bkb.v0(i10, wjbVar);
        ff0 i0 = bkb.i0(L, L, L, L, v0, v02, v02);
        vkb M = zkb.M(i9);
        vkb M2 = zkb.M(i10);
        textView2.setBackground(i0);
        zkb.j(textView2, i0, M, M2, wjbVar);
        ote.b(textView2, 0.02f, 1.2f);
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
        hiVar.addView(textView2, nme.t(-1, 48, 83, 16, i, 16, i2));
        textView2.setOnClickListener(new xg(hn7Var, hn7Var2, hn7Var3, i7, i4dVar, p8cVar));
        if (z2) {
            u41 u41Var2 = new u41(wjbVar, context, false);
            u41Var2.i(k96.M0(2131753712, null), false, true);
            u41Var2.f();
            u41Var2.setOnClickListener(new t(i4dVar, p8cVar, (byte) 15));
            hiVar.addView(u41Var2, nme.t(-1, 48, 83, 16, 4, 16, 16));
        }
        ((fx0) obj).O = hiVar;
        return i4dVar;
    }

    public static void l0(Context context, wjb wjbVar, String str, boolean z, final i8c i8cVar) {
        int i;
        if (!gl.C1(context)) {
            return;
        }
        final hd[] hdVarArr = new hd[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(2131747586, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i2 = bkb.i5;
        zkb.X(textView, i2, wjbVar);
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(gl.L(14.0f), gl.L(12.0f), gl.L(14.0f), gl.L(12.0f));
        ShapeDrawable b0 = bkb.b0(gl.L(22.0f), bkb.p1(0.06f, bkb.v0(i2, wjbVar)));
        vkb K = zkb.K(0.06f, i2);
        textView.setBackground(b0);
        zkb.j(textView, b0, K, null, wjbVar);
        final ag2 ag2Var = new ag2(1, wjbVar, context);
        ag2Var.setMultiline(true);
        ag2Var.getTextView().getLayoutParams().width = -1;
        ag2Var.getTextView().setSingleLine(false);
        ag2Var.getTextView().setMaxLines(3);
        ag2Var.getTextView().setTextSize(1, 16.0f);
        if (z) {
            i = 2131752865;
        } else {
            i = 2131752864;
        }
        ag2Var.e(k96.M0(i, null), "", false, false, false);
        ag2Var.setOnClickListener(new je(ag2Var, (byte) 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, nme.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(ag2Var, nme.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.n(linearLayout);
        hdVar.a = Math.min(gl.L(320.0f), (gl.q.x * 85) / 100);
        alertDialog$Builder.j(k96.M0(2131747624, null), new ed() {
            @Override
            public final void u(hd hdVar2, int i3) {
                byte b = r4;
                hd[] hdVarArr2 = hdVarArr;
                ag2 ag2Var2 = ag2Var;
                i8c i8cVar2 = i8cVar;
                switch (b) {
                    case 0:
                        i8cVar2.a(Boolean.TRUE, Boolean.valueOf(ag2Var2.b()));
                        hd hdVar3 = hdVarArr2[0];
                        if (hdVar3 != null) {
                            hdVar3.dismiss();
                            return;
                        }
                        return;
                    default:
                        i8cVar2.a(Boolean.FALSE, Boolean.valueOf(ag2Var2.b()));
                        hd hdVar4 = hdVarArr2[0];
                        if (hdVar4 != null) {
                            hdVar4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.g(k96.M0(2131752577, null), new ed() {
            @Override
            public final void u(hd hdVar2, int i3) {
                byte b = r4;
                hd[] hdVarArr2 = hdVarArr;
                ag2 ag2Var2 = ag2Var;
                i8c i8cVar2 = i8cVar;
                switch (b) {
                    case 0:
                        i8cVar2.a(Boolean.TRUE, Boolean.valueOf(ag2Var2.b()));
                        hd hdVar3 = hdVarArr2[0];
                        if (hdVar3 != null) {
                            hdVar3.dismiss();
                            return;
                        }
                        return;
                    default:
                        i8cVar2.a(Boolean.FALSE, Boolean.valueOf(ag2Var2.b()));
                        hd hdVar4 = hdVarArr2[0];
                        if (hdVar4 != null) {
                            hdVar4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        hdVarArr[0] = alertDialog$Builder.o();
    }

    public static void m(org.telegram.ui.ActionBar.d r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij.m(org.telegram.ui.ActionBar.d, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, c01 c01Var, TLRPC.WebPage webPage, wjb wjbVar) {
        String scheme;
        boolean z5;
        boolean z6;
        if (!gl.C1(context)) {
            return;
        }
        if (str == null) {
            scheme = null;
        } else {
            scheme = Uri.parse(str).getScheme();
        }
        if (!d01.g(Uri.parse(str), false, null) && z3 && !"mailto".equalsIgnoreCase(scheme)) {
            String d = d01.d(str, z);
            fe2 fe2Var = new fe2(context, str, j, z2, c01Var);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
            String M0 = k96.M0(2131747586, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            TextView textView = new TextView(context);
            textView.setText(d);
            textView.setTextSize(1, 14.0f);
            int i = bkb.i5;
            zkb.X(textView, i, wjbVar);
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(gl.L(14.0f), gl.L(12.0f), gl.L(14.0f), gl.L(12.0f));
            ShapeDrawable b0 = bkb.b0(gl.L(22.0f), bkb.p1(0.06f, bkb.v0(i, wjbVar)));
            vkb K = zkb.K(0.06f, i);
            textView.setBackground(b0);
            zkb.j(textView, b0, K, null, wjbVar);
            LinearLayout j2 = de9.j(context, 1);
            j2.addView(textView, nme.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i2 = jtc.f;
            if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                jtc jtcVar = new jtc(context, wjbVar);
                jtcVar.setWebPage(webPage);
                j2.addView(jtcVar, nme.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder.n(j2);
            hdVar.a = Math.min(gl.L(320.0f), (gl.q.x * 85) / 100);
            alertDialog$Builder.j(k96.M0(2131747624, null), new l0(fe2Var, (byte) 15));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
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
        d01.s(context, parse, z5, z2, z6, c01Var, null, false, true, false, false);
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
        l46 l46Var = new l46(context, null);
        kk7.i(l46Var);
        zkb.X(l46Var, bkb.i5, null);
        zkb.G(l46Var, bkb.Wc, null);
        l46Var.setTextSize(1, 16.0f);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        l46Var.setGravity(i | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        hd hdVar = alertDialog$Builder.a;
        hdVar.H = (byte) 6;
        alertDialog$Builder.n(frameLayout);
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.s(gl.L(18.0f));
        be0 be0Var = new be0(context);
        be0Var.setRoundRadius(gl.L(20.0f));
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        frameLayout.addView(be0Var, nme.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        jia jiaVar = new jia(context);
        zkb.W(jiaVar, bkb.D8, null);
        jiaVar.setTextSize(20);
        jiaVar.setTypeface(gl.o());
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        jiaVar.setGravity(i3 | 16);
        jiaVar.setEllipsizeByGradient(true);
        jiaVar.l(user.first_name, false);
        if (user.scam) {
            jiaVar.i(bkb.f1);
        } else if (user.fake) {
            jiaVar.i(bkb.g1);
        } else if (user.verified) {
            Drawable d = b00.d(context, 2131232796);
            int i11 = bkb.y9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.x(jiaVar, d, i11, null, mode);
            Drawable d2 = b00.d(context, 2131232797);
            zkb.x(jiaVar, d2, bkb.z9, null, mode);
            jiaVar.i(new fm2(d, d2));
        }
        TextView textView = new TextView(context);
        zkb.X(textView, bkb.l5, null);
        ug8.w(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (k96.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        textView.setGravity(i4 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new le(user, dVar, alertDialog$Builder, (byte) 0));
        SpannableString valueOf = SpannableString.valueOf(k96.M0(2131748143, null).concat("  "));
        cm2 cm2Var = new cm2(2131230875, 0);
        cm2Var.n = 1;
        cm2Var.c(gl.L(10.0f));
        valueOf.setSpan(cm2Var, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z = k96.a0;
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
        frameLayout.addView(jiaVar, nme.d(-1, -2.0f, i12, f, 0.0f, i7, 0.0f));
        boolean z2 = k96.a0;
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
        frameLayout.addView(textView, nme.d(-1, -2.0f, i14, f2, 24.0f, i13, 0.0f));
        if (k96.a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(l46Var, nme.d(-2, -2.0f, i10 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (l7c.B(user)) {
            pb0Var.p = 0.8f;
            pb0Var.f(12);
            r5 = 0;
            be0Var.m(null, null, pb0Var, user);
        } else {
            r5 = 0;
            pb0Var.p = 1.0f;
            dVar.getCurrentAccount();
            pb0Var.q(user);
            be0Var.f(user, pb0Var);
        }
        alertDialog$Builder.j(k96.M0(2131744678, r5), new ce(runnable, (byte) 1));
        alertDialog$Builder.g(k96.M0(2131752577, r5), r5);
        dVar.showDialog(hdVar, false, new me(runnable2, (byte) 0));
        l46Var.setText(gl.N2(k96.M0(2131752884, r5), -1, 0, new ne(hdVar, context, (byte) 0), r5));
    }

    public static void n0(d dVar, String str, boolean z, boolean z2) {
        o0(dVar, str, z, true, z2, false, null, null, null);
    }

    public static i4d o(Activity activity, uc7 uc7Var, wjb wjbVar) {
        if (activity == null) {
            return null;
        }
        i4d i4dVar = new i4d(activity, wjbVar);
        Object obj = i4dVar.a;
        ((fx0) obj).w0 = false;
        hn7 hn7Var = new hn7(activity, wjbVar);
        hn7Var.setTextOffset(gl.L(10.0f));
        hn7Var.setItemCount(5);
        hn7 hn7Var2 = new hn7(activity, wjbVar);
        hn7Var2.setItemCount(5);
        hn7Var2.setTextOffset(-gl.L(10.0f));
        hn7 hn7Var3 = new hn7(activity, wjbVar);
        hn7Var3.setItemCount(5);
        hn7Var3.setTextOffset(-gl.L(24.0f));
        zh zhVar = new zh(activity, hn7Var, hn7Var2, hn7Var3, (byte) 6);
        zhVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        zhVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(k96.M0(2131752120, null));
        tb4.w(textView, bkb.i5, wjbVar, 1, 20.0f);
        frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 11));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        zhVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        wb wbVar = new wb(activity, (byte) 7);
        linearLayout.addView(hn7Var, nme.l(0.25f, 0, 270));
        hn7Var.setMinValue(1);
        hn7Var.setMaxValue(31);
        hn7Var.setWrapSelectorWheel(false);
        hn7Var.setFormatter(new zf((byte) 13));
        nf nfVar = new nf(hn7Var, hn7Var2, hn7Var3, (byte) 2);
        hn7Var.setOnValueChangedListener(nfVar);
        hn7Var2.setMinValue(0);
        hn7Var2.setMaxValue(11);
        hn7Var2.setWrapSelectorWheel(false);
        linearLayout.addView(hn7Var2, nme.l(0.5f, 0, 270));
        hn7Var2.setFormatter(new zf((byte) 14));
        hn7Var2.setOnValueChangedListener(nfVar);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = calendar.get(1);
        hn7Var3.setMinValue(i);
        hn7Var3.setMaxValue(i2);
        hn7Var3.setWrapSelectorWheel(false);
        hn7Var3.setFormatter(new zf((byte) 15));
        linearLayout.addView(hn7Var3, nme.l(0.25f, 0, 270));
        hn7Var3.setOnValueChangedListener(nfVar);
        hn7Var.setValue(31);
        hn7Var2.setValue(12);
        hn7Var3.setValue(i2);
        b(hn7Var, hn7Var2, hn7Var3);
        wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        wbVar.setGravity(17);
        zkb.X(wbVar, bkb.Ii, wjbVar);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setTypeface(gl.o());
        wbVar.setText(k96.M0(2131748873, null));
        int L = gl.L(8.0f);
        int i3 = bkb.Ei;
        int v0 = bkb.v0(i3, wjbVar);
        int i4 = bkb.Gi;
        int v02 = bkb.v0(i4, wjbVar);
        ff0 i0 = bkb.i0(L, L, L, L, v0, v02, v02);
        vkb M = zkb.M(i3);
        vkb M2 = zkb.M(i4);
        wbVar.setBackground(i0);
        zkb.j(wbVar, i0, M, M2, wjbVar);
        zhVar.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
        wbVar.setOnClickListener(new ff(hn7Var, hn7Var2, hn7Var3, calendar, uc7Var, i4dVar, (byte) 2));
        ((fx0) obj).O = zhVar;
        return i4dVar;
    }

    public static void o0(d dVar, String str, boolean z, boolean z2, boolean z3, boolean z4, c01 c01Var, TLRPC.WebPage webPage, wjb wjbVar) {
        long j;
        if (dVar != null && dVar.getParentActivity() != null) {
            if (dVar instanceof mu1) {
                j = ((mu1) dVar).x8;
            } else {
                j = 0;
            }
            m0(dVar.getParentActivity(), str, z, z2, z3, z4, j, c01Var, webPage, wjbVar);
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
        if (dVar.getParentActivity() != null && user != null && !l7c.z(user) && y6c.h(dVar.getCurrentAccount()).e() != user.id) {
            dVar.getCurrentAccount();
            Activity parentActivity = dVar.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z) {
                M0 = k96.M0(2131743370, null);
                a0 = k96.a0("VideoCallAlert", null, 2131743371, l7c.r(user));
            } else {
                M0 = k96.M0(2131752619, null);
                a0 = k96.a0("CallAlert", null, 2131752620, l7c.r(user));
            }
            TextView textView = new TextView(parentActivity);
            kk7.i(textView);
            zkb.X(textView, bkb.i5, null);
            textView.setTextSize(1, 16.0f);
            int i6 = 3;
            if (k96.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i | 48);
            textView.setText(gl.S2(a0));
            pb0 pb0Var = new pb0((wjb) null);
            pb0Var.s(gl.L(12.0f));
            pb0Var.p = 1.0f;
            dVar.getCurrentAccount();
            pb0Var.q(user);
            be0 be0Var = new be0(parentActivity);
            be0Var.setRoundRadius(gl.L(20.0f));
            be0Var.f(user, pb0Var);
            if (k96.a0) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            frameLayout.addView(be0Var, nme.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            tb4.w(textView2, bkb.D8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (k96.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView2.setGravity(i3 | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(M0);
            boolean z2 = k96.a0;
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
            frameLayout.addView(textView2, nme.d(-1, -2.0f, i7, f, 11.0f, i8, 0.0f));
            if (k96.a0) {
                i6 = 5;
            }
            frameLayout.addView(textView, nme.d(-2, -2.0f, i6 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.j(k96.M0(2131752622, null), new ch(dVar, user, z, (byte) 0));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            dVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void p0(Activity activity, int i, Runnable runnable, boolean z, wjb wjbVar) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = na7.q1(i).g3;
        if ((i2 & 1) != 0) {
            b00.r(null, 2131748494, arrayList, 0, arrayList2);
        }
        if ((i2 & 2) != 0) {
            b00.r(null, 2131748496, arrayList, 1, arrayList2);
        }
        if ((i2 & 4) != 0) {
            b00.r(null, 2131748492, arrayList, 3, arrayList2);
        }
        arrayList.add(k96.M0(2131748495, null));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        alertDialog$Builder.a.S = k96.M0(2131748493, null);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            wy8 wy8Var = new wy8(activity, wjbVar);
            wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            wy8Var.setTag(Integer.valueOf(i3));
            a(wy8Var, bkb.f7, bkb.D5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i3);
            if (gba.l0 == ((Integer) arrayList2.get(i3)).intValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            wy8Var.b(charSequence, z2);
            int i4 = bkb.h6;
            ff0 f0 = bkb.f0(bkb.w0(null, i4, false), 2, -1);
            vkb M = zkb.M(i4);
            wy8Var.setBackground(f0);
            zkb.j(wy8Var, f0, null, M, null);
            linearLayout.addView(wy8Var);
            wy8Var.setOnClickListener(new b0(arrayList2, runnable, alertDialog$Builder, (byte) 4));
        }
        if (!z) {
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
        }
        hd o = alertDialog$Builder.o();
        if (z) {
            o.setCanceledOnTouchOutside(false);
        }
    }

    public static void q(org.telegram.ui.ActionBar.d r32, int r33, org.telegram.tgnet.TLRPC.User r34, org.telegram.tgnet.TLRPC.Chat r35, boolean r36, defpackage.sc7 r37, defpackage.wjb r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij.q(org.telegram.ui.ActionBar.d, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, sc7, wjb):void");
    }

    public static void q0(int i, wjb wjbVar, d dVar) {
        if (i != 0 && dVar != null && dVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, dVar.getParentActivity());
            String M0 = k96.M0(2131743677, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            if (i == 1) {
                hdVar.U = k96.M0(2131751075, null);
            } else if (i == 2) {
                hdVar.U = k96.M0(2131751087, null);
            } else if (i == 3) {
                hdVar.U = k96.M0(2131751081, null);
            } else if (i == 4) {
                hdVar.U = k96.M0(2131751074, null);
            } else if (i == 5) {
                hdVar.U = k96.M0(2131751086, null);
            } else if (i == 6) {
                hdVar.U = k96.M0(2131751080, null);
            } else if (i == 7) {
                hdVar.U = k96.M0(2131751078, null);
            } else if (i == 8) {
                hdVar.U = k96.M0(2131751079, null);
            } else if (i == 9) {
                hdVar.U = k96.M0(2131751070, null);
            } else if (i == 10) {
                hdVar.U = k96.M0(2131751082, null);
            } else if (i == 11) {
                hdVar.U = k96.M0(2131751071, null);
            } else if (i == 12) {
                hdVar.U = k96.M0(2131751083, null);
            } else if (i == 13) {
                hdVar.U = k96.M0(2131751068, null);
            } else if (i == 14) {
                hdVar.U = k96.M0(2131751069, null);
            } else if (i == 15) {
                hdVar.U = k96.M0(2131751076, null);
            } else if (i == 16) {
                hdVar.U = k96.M0(2131751077, null);
            } else if (i == 17) {
                hdVar.U = k96.M0(2131751088, null);
            } else if (i == 18) {
                hdVar.U = k96.M0(2131751089, null);
            } else if (i == 19) {
                hdVar.U = k96.M0(2131751084, null);
            } else if (i == 20) {
                hdVar.U = k96.M0(2131751085, null);
            } else if (i == 21) {
                hdVar.U = k96.M0(2131751072, null);
            } else if (i == 22) {
                hdVar.U = k96.M0(2131751073, null);
            }
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            dVar.showDialog(hdVar, true, null);
        }
    }

    public static void r(d dVar, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, boolean z4, boolean z5, sc7 sc7Var) {
        wjb wjbVar;
        if (dVar != null) {
            wjbVar = dVar.getResourceProvider();
        } else {
            wjbVar = null;
        }
        s(dVar, z, false, chat, user, z2, z3, z4, z5, sc7Var, wjbVar);
    }

    public static hd r0(d dVar, String str, String str2, wjb wjbVar) {
        if (dVar == null) {
            dVar = LaunchActivity.S();
        }
        if (str2 != null && dVar != null && dVar.getParentActivity() != null) {
            hd hdVar = L(dVar.getParentActivity(), str, str2, null, null, wjbVar).a;
            dVar.showDialog(hdVar);
            return hdVar;
        }
        return null;
    }

    public static void s(final org.telegram.ui.ActionBar.d r44, final boolean r45, final boolean r46, final org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final defpackage.sc7 r53, final defpackage.wjb r54) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij.s(org.telegram.ui.ActionBar.d, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, sc7, wjb):void");
    }

    public static hd s0(d dVar, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
        TextView textView;
        hd M = M(dVar.getContext(), dVar.getResourceProvider(), str, charSequence, str2, runnable);
        dVar.showDialog(M);
        if (z && (textView = (TextView) M.c(-1)) != null) {
            zkb.X(textView, bkb.p7, null);
        }
        return M;
    }

    public static hd t(Activity activity, final long j, final long j2, final int i, final Runnable runnable, wjb wjbVar) {
        int i2;
        boolean z;
        SharedPreferences sharedPreferences = na7.q1(y6c.t0).W3;
        final String p = im7.p(j, j2, false);
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 != 0) {
            if (sharedPreferences.contains("color_" + p)) {
                i2 = ls6.g("color_", p, sharedPreferences, -16776961);
            } else if (cf3.y(j)) {
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
        LinearLayout m = ir2.m(activity, 1);
        String[] strArr = {k96.M0(2131752000, null), k96.M0(2131752005, null), k96.M0(2131751994, null), k96.M0(2131752006, null), k96.M0(2131752007, null), k96.M0(2131752008, null), k96.M0(2131751996, null), k96.M0(2131752001, null), k96.M0(2131751995, null)};
        final int[] iArr = {i2};
        for (int i4 = 0; i4 < 9; i4++) {
            wy8 wy8Var = new wy8(activity, wjbVar);
            wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
            wy8Var.setTag(Integer.valueOf(i4));
            int i5 = chb.e[i4];
            wy8Var.a(i5, i5);
            String str = strArr[i4];
            if (i2 == chb.f[i4]) {
                z = true;
            } else {
                z = false;
            }
            wy8Var.b(str, z);
            m.addView(wy8Var);
            wy8Var.setOnClickListener(new af(m, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        String M0 = k96.M0(2131748797, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(k96.M0(2131745358, null), new ed() {
            @Override
            public final void u(hd hdVar2, int i6) {
                SharedPreferences.Editor edit = na7.q1(y6c.t0).W3.edit();
                long j3 = j;
                int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i7 != 0) {
                    edit.putInt(b00.h("color_", p), iArr2[0]);
                    im7.n(y6c.t0).f(j3, j2);
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
                    im7.n(y6c.t0).g(i8);
                }
                edit.commit();
                runnable.run();
            }
        });
        alertDialog$Builder.h(k96.M0(2131748796, null), new gf(j, i, runnable, (byte) 1));
        if (i3 != 0) {
            alertDialog$Builder.g(k96.M0(2131751588, null), new o(p, runnable, (byte) 9));
        }
        return hdVar;
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
        String M0 = k96.M0(2131751776, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.a0("ContactNotRegistered", null, 2131751777, qu2.m(0, str, str2));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131748982, null), new dg((byte) 0, str3, dVar));
        dVar.showDialog(hdVar);
    }

    public static hd u0(Context context, String str, boolean z) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = k96.M0(2131689472, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = str;
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        if (z) {
            alertDialog$Builder.g(k96.M0(2131743582, null), new od(context, (byte) 1));
        }
        return alertDialog$Builder.o();
    }

    public static AlertDialog$Builder v(Activity activity, final uc7 uc7Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i = bkb.K5;
        alertDialog$Builder.l(2131624118, 72, bkb.w0(null, i, false), null);
        alertDialog$Builder.m(i, null);
        alertDialog$Builder.a.U = gl.S2(k96.M0(2131751762, null));
        alertDialog$Builder.j(k96.M0(2131751761, null), new ed() {
            @Override
            public final void u(hd hdVar, int i2) {
                byte b = r2;
                uc7 uc7Var2 = uc7Var;
                switch (b) {
                    case 0:
                        uc7Var2.a(1);
                        return;
                    default:
                        uc7Var2.a(0);
                        return;
                }
            }
        });
        alertDialog$Builder.g(k96.M0(2131751760, null), new ed() {
            @Override
            public final void u(hd hdVar, int i2) {
                byte b = r2;
                uc7 uc7Var2 = uc7Var;
                switch (b) {
                    case 0:
                        uc7Var2.a(1);
                        return;
                    default:
                        uc7Var2.a(0);
                        return;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void v0(hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, hn7Var2.getValue());
        calendar.set(1, hn7Var3.getValue());
        hn7Var.setMinValue(1);
        hn7Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static AlertDialog$Builder w(Context context, int i, int i2, int i3, int i4, int i5, int i6, String str, final boolean z, yf yfVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final hn7 hn7Var = new hn7(context, null);
        final hn7 hn7Var2 = new hn7(context, null);
        final hn7 hn7Var3 = new hn7(context, null);
        linearLayout.addView(hn7Var2, nme.l(0.3f, 0, -2));
        hn7Var2.setOnScrollListener(new en7() {
            @Override
            public final void b(int i7) {
                byte b = r5;
                hn7 hn7Var4 = hn7Var3;
                hn7 hn7Var5 = hn7Var;
                hn7 hn7Var6 = hn7Var2;
                boolean z2 = z;
                switch (b) {
                    case 0:
                        if (z2 && i7 == 0) {
                            ij.d(hn7Var6, hn7Var5, hn7Var4);
                            return;
                        }
                        return;
                    case 1:
                        if (z2 && i7 == 0) {
                            ij.d(hn7Var6, hn7Var5, hn7Var4);
                            return;
                        }
                        return;
                    default:
                        if (z2 && i7 == 0) {
                            ij.d(hn7Var6, hn7Var5, hn7Var4);
                            return;
                        }
                        return;
                }
            }
        });
        hn7Var.setMinValue(0);
        hn7Var.setMaxValue(11);
        linearLayout.addView(hn7Var, nme.l(0.3f, 0, -2));
        hn7Var.setFormatter(new c((byte) 24));
        hn7Var.setOnValueChangedListener(new nf(hn7Var2, hn7Var, hn7Var3, (byte) 0));
        hn7Var.setOnScrollListener(new en7() {
            @Override
            public final void b(int i7) {
                byte b = r5;
                hn7 hn7Var4 = hn7Var3;
                hn7 hn7Var5 = hn7Var;
                hn7 hn7Var6 = hn7Var2;
                boolean z2 = z;
                switch (b) {
                    case 0:
                        if (z2 && i7 == 0) {
                            ij.d(hn7Var6, hn7Var5, hn7Var4);
                            return;
                        }
                        return;
                    case 1:
                        if (z2 && i7 == 0) {
                            ij.d(hn7Var6, hn7Var5, hn7Var4);
                            return;
                        }
                        return;
                    default:
                        if (z2 && i7 == 0) {
                            ij.d(hn7Var6, hn7Var5, hn7Var4);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i7 = calendar.get(1);
        hn7Var3.setMinValue(i + i7);
        hn7Var3.setMaxValue(i2 + i7);
        hn7Var3.setValue(i7 + i3);
        linearLayout.addView(hn7Var3, nme.l(0.4f, 0, -2));
        hn7Var3.setOnValueChangedListener(new nf(hn7Var2, hn7Var, hn7Var3, (byte) 1));
        hn7Var3.setOnScrollListener(new en7() {
            @Override
            public final void b(int i72) {
                byte b = r5;
                hn7 hn7Var4 = hn7Var3;
                hn7 hn7Var5 = hn7Var;
                hn7 hn7Var6 = hn7Var2;
                boolean z2 = z;
                switch (b) {
                    case 0:
                        if (z2 && i72 == 0) {
                            ij.d(hn7Var6, hn7Var5, hn7Var4);
                            return;
                        }
                        return;
                    case 1:
                        if (z2 && i72 == 0) {
                            ij.d(hn7Var6, hn7Var5, hn7Var4);
                            return;
                        }
                        return;
                    default:
                        if (z2 && i72 == 0) {
                            ij.d(hn7Var6, hn7Var5, hn7Var4);
                            return;
                        }
                        return;
                }
            }
        });
        v0(hn7Var2, hn7Var, hn7Var3);
        if (z) {
            d(hn7Var2, hn7Var, hn7Var3);
        }
        if (i4 != -1) {
            hn7Var2.setValue(i4);
            hn7Var.setValue(i5);
            hn7Var3.setValue(i6);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.j(k96.M0(2131745358, null), new of(z, hn7Var2, hn7Var, hn7Var3, yfVar));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        return alertDialog$Builder;
    }

    public static void x(Context context, String str, String str2, long j, gj gjVar) {
        Object obj;
        wb wbVar;
        if (context == null) {
            return;
        }
        int w0 = bkb.w0(null, bkb.i5, false);
        int w02 = bkb.w0(null, bkb.g5, false);
        bkb.w0(null, bkb.zj, false);
        bkb.w0(null, bkb.Dj, false);
        bkb.w0(null, bkb.D8, false);
        bkb.w0(null, bkb.F8, false);
        bkb.w0(null, bkb.h6, false);
        int w03 = bkb.w0(null, bkb.Ii, false);
        int w04 = bkb.w0(null, bkb.Ei, false);
        int w05 = bkb.w0(null, bkb.Gi, false);
        i4d i4dVar = new i4d(context, null);
        Object obj2 = i4dVar.a;
        ((fx0) obj2).w0 = false;
        hn7 hn7Var = new hn7(context, null);
        hn7Var.setTextColor(w0);
        hn7Var.setTextOffset(gl.L(10.0f));
        hn7Var.setItemCount(5);
        hn7 hn7Var2 = new hn7(context, null);
        hn7Var2.setItemCount(5);
        hn7Var2.setTextColor(w0);
        hn7Var2.setTextOffset(-gl.L(10.0f));
        hn7 hn7Var3 = new hn7(context, null);
        hn7Var3.setItemCount(5);
        hn7Var3.setTextColor(w0);
        hn7Var3.setTextOffset(-gl.L(34.0f));
        zh zhVar = new zh(context, hn7Var, hn7Var2, hn7Var3, (byte) 2);
        zhVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        zhVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(w0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 5));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        zhVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        wb wbVar2 = new wb(context, (byte) 2);
        linearLayout.addView(hn7Var, nme.l(0.5f, 0, 270));
        hn7Var.setMinValue(0);
        hn7Var.setMaxValue(365);
        hn7Var.setWrapSelectorWheel(false);
        hn7Var.setFormatter(new c((byte) 27));
        ie ieVar = new ie(hn7Var, hn7Var2, hn7Var3, (byte) 2);
        hn7Var.setOnValueChangedListener(ieVar);
        hn7Var2.setMinValue(0);
        hn7Var2.setMaxValue(23);
        linearLayout.addView(hn7Var2, nme.l(0.2f, 0, 270));
        hn7Var2.setFormatter(new c((byte) 28));
        hn7Var2.setOnValueChangedListener(ieVar);
        hn7Var3.setMinValue(0);
        hn7Var3.setMaxValue(59);
        hn7Var3.setValue(0);
        hn7Var3.setFormatter(new c((byte) 29));
        linearLayout.addView(hn7Var3, nme.l(0.3f, 0, 270));
        hn7Var3.setOnValueChangedListener(ieVar);
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
                hn7Var3.setValue(calendar.get(12));
                hn7Var2.setValue(calendar.get(11));
                hn7Var.setValue(timeInMillis);
            }
        } else {
            obj = obj2;
            wbVar = wbVar2;
        }
        g(null, null, 0L, 0L, 0, hn7Var, hn7Var2, hn7Var3);
        wb wbVar3 = wbVar;
        wbVar3.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        wbVar3.setGravity(17);
        wbVar3.setTextColor(w03);
        wbVar3.setTextSize(1, 14.0f);
        wbVar3.setTypeface(gl.o());
        int L = gl.L(8.0f);
        wbVar3.setBackgroundDrawable(bkb.i0(L, L, L, L, w04, w05, w05));
        wbVar3.setText(str2);
        zhVar.addView(wbVar3, nme.t(-1, 48, 83, 16, 15, 16, 16));
        wbVar3.setOnClickListener(new ff(hn7Var, hn7Var2, hn7Var3, calendar, gjVar, i4dVar, (byte) 1));
        fx0 fx0Var = (fx0) obj;
        fx0Var.O = zhVar;
        fx0Var.show();
        fx0Var.s0(w02);
        fx0Var.L(w02);
    }

    public static void y(final org.telegram.ui.ActionBar.d r46, final org.telegram.tgnet.TLRPC.User r47, final org.telegram.tgnet.TLRPC.Chat r48, final org.telegram.tgnet.TLRPC.EncryptedChat r49, final org.telegram.tgnet.TLRPC.ChatFull r50, final long r51, final defpackage.k27 r53, final android.util.SparseArray[] r54, final defpackage.f27 r55, final int r56, final int r57, org.telegram.tgnet.TLRPC.ChannelParticipant[] r58, final java.lang.Runnable r59, final defpackage.vm1 r60, final defpackage.wjb r61) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij.y(org.telegram.ui.ActionBar.d, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, k27, android.util.SparseArray[], f27, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, vm1, wjb):void");
    }

    public static hd z(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        String M0 = k96.M0(2131748525, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131748526, null);
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131748528, null), new he(launchActivity, (byte) 1));
        return hdVar;
    }
}
