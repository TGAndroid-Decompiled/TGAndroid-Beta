package fi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.yg;
import org.telegram.ui.LaunchActivity;
public abstract class e6 extends ww0 implements sg.s1, sg.h, sg.o1, uw0, ob {
    public int A0;
    public Runnable A1;
    public boolean B0;
    public final rb B1;
    public final boolean C0;
    public AnimatorSet C1;
    public final u5 D0;
    public final h5 D1;
    public final w5 E0;
    public w7 E1;
    public final z5 F0;
    public ArrayList F1;
    public final y5 G0;
    public int G1;
    public final FrameLayout H0;
    public int H1;
    public final a6 I0;
    public rg.y I1;
    public final e5 J0;
    public final boolean J1;
    public final FrameLayout K0;
    public final File K1;
    public l5 L0;
    public final boolean L1;
    public final View M0;
    public final boolean M1;
    public int N0;
    public boolean N1;
    public int O0;
    public fl0 O1;
    public float P0;
    public sg.c2 P1;
    public ValueAnimator Q0;
    public float Q1;
    public boolean R0;
    public boolean R1;
    public final sg.y1 S0;
    public boolean S1;
    public final a4.l T0;
    public org.telegram.ui.Components.la T1;
    public final int U0;
    public final n6 U1;
    public BigInteger V0;
    public final o6 V1;
    public TextView W0;
    public boolean W1;
    public TextView X0;
    public ObjectAnimator X1;
    public TextView Y0;
    public final float[] Y1;
    public final sg.t1 Z0;
    public n5 Z1;
    public final sg.q1 f10779a1;
    public boolean a2;
    public final sg.v1 f10780b1;
    public boolean f10781b2;
    public final ImageView f10782c1;
    public boolean f10783c2;
    public final TextView f10784d1;
    public final int[] f10785d2;
    public final TextView f10786e1;
    public sz f10787e2;
    public final TextView f10788f1;
    public boolean f10789f2;
    public final Paint f10790g1;
    public boolean f10791g2;
    public final Paint f10792h1;
    public boolean f10793h2;
    public float f10794i1;
    public int f10795i2;
    public boolean f10796j1;
    public boolean f10797j2;
    public o1.j f10798k1;
    public int f10799k2;
    public final f5 l1;
    public int f10800l2;
    public final Paint f10801m1;
    public int f10802m2;
    public final Paint f10803n1;
    public boolean f10804n2;
    public final Paint f10805o1;
    public final sg.h1 f10806p0;
    public final rg.q1 f10807p1;
    public final sg.l1 f10808q0;
    public boolean f10809q1;
    public final Bitmap f10810r0;
    public o1.j f10811r1;
    public final rg.t1 f10812s0;
    public float f10813s1;
    public final DispatchQueue f10814t0;
    public final Paint f10815t1;
    public final MediaController.CropState f10816u0;
    public final int f10817u1;
    public boolean f10818v0;
    public final s5 f10819v1;
    public qw0 f10820w0;
    public org.telegram.ui.ActionBar.o1 f10821w1;
    public boolean f10822x0;
    public c6 f10823x1;
    public sg.j f10824y0;
    public Rect f10825y1;
    public boolean f10826z0;
    public Runnable f10827z1;

    public e6(Context context, boolean z10, File file, boolean z11, boolean z12, rb rbVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, w7 w7Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.la laVar, org.telegram.ui.ActionBar.u6 u6Var, n6 n6Var, o6 o6Var) {
        super(context, activity);
        rg.q1 q1Var;
        org.telegram.ui.Components.la laVar2;
        int i14;
        this.N0 = 0;
        this.O0 = -1;
        final ta taVar = (ta) this;
        a4.l lVar = new a4.l(taVar, 19);
        this.T0 = lVar;
        Paint paint = new Paint(1);
        this.f10790g1 = paint;
        Paint paint2 = new Paint(1);
        this.f10792h1 = paint2;
        this.f10801m1 = new Paint(1);
        this.f10803n1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f10805o1 = paint3;
        rg.q1 q1Var2 = new rg.q1(1.0f, 0.016773745f, -1);
        this.f10807p1 = q1Var2;
        this.f10815t1 = new Paint(1);
        this.Y1 = new float[2];
        this.f10781b2 = false;
        this.f10785d2 = new int[2];
        new a5.d(taVar, 22);
        setDelegate(this);
        this.T1 = laVar;
        this.U1 = n6Var;
        this.J1 = z10;
        this.K1 = file;
        this.L1 = z11;
        this.M1 = z12;
        this.B1 = rbVar;
        this.G1 = i12;
        this.H1 = i13;
        this.V1 = o6Var;
        this.f10817u1 = i10;
        s5 s5Var = new s5(u6Var);
        this.f10819v1 = s5Var;
        this.f10816u0 = cropState;
        this.C0 = context instanceof BubbleActivity;
        rg.s0 e = rg.s0.e(i10);
        e.i(0, true);
        q1Var2.f47522a = e.c();
        q1Var2.f47524c = e.f47545i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.f10814t0 = dispatchQueue;
        this.f10810r0 = bitmap;
        this.U0 = i11;
        rg.t1 t1Var = new rg.t1();
        this.f10812s0 = t1Var;
        t1Var.f47559a = new e1.c(taVar, 9);
        View view = new View(context);
        this.M0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        rg.q0 q0Var = new rg.q0(getPaintingSize(), null, i11, laVar);
        if (w7Var == null || !w7Var.f11929u) {
            q1Var = q1Var2;
            laVar2 = laVar;
        } else {
            q1Var = q1Var2;
            laVar2 = null;
        }
        u5 u5Var = new u5(taVar, context, q0Var, bitmap, bitmap2, laVar2);
        this.D0 = u5Var;
        u5Var.setDelegate(new v5(taVar));
        u5Var.setUndoStore(t1Var);
        u5Var.setQueue(dispatchQueue);
        u5Var.setVisibility(4);
        w5 w5Var = new w5(taVar, context);
        this.E0 = w5Var;
        w5Var.setVisibility(4);
        y5 y5Var = new y5(taVar, context, new x5(taVar));
        this.G0 = y5Var;
        this.E1 = w7Var;
        this.F1 = arrayList;
        if (this.G1 > 0 && this.H1 > 0) {
            E0();
        }
        y5Var.setVisibility(4);
        this.F0 = new z5(taVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, gb1.i(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f10782c1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ta taVar2 = taVar;
                        u5 u5Var2 = taVar2.D0;
                        if (u5Var2 != null && (u5Var2.getCurrentBrush() instanceof rg.l)) {
                            u5Var2.b();
                            taVar2.Z0.setSelectedIndex(1);
                            taVar2.i((rg.m) rg.m.f47462a.get(0));
                            return;
                        }
                        taVar2.f10812s0.c();
                        return;
                    case 1:
                        ta taVar3 = taVar;
                        u5 u5Var3 = taVar3.D0;
                        rg.t1 t1Var2 = taVar3.f10812s0;
                        if (t1Var2.a()) {
                            if (u5Var3 != null && (u5Var3.getCurrentBrush() instanceof rg.l)) {
                                u5Var3.b();
                                taVar3.Z0.setSelectedIndex(1);
                                taVar3.i((rg.m) rg.m.f47462a.get(0));
                            }
                            if (u5Var3 != null) {
                                u5Var3.a();
                            }
                            t1Var2.f47561c.clear();
                            t1Var2.f47560b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            taVar3.G0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ta taVar4 = taVar;
                        sg.j jVar = taVar4.f10824y0;
                        if (jVar instanceof sg.x2) {
                            AndroidUtilities.hideKeyboard(((sg.x2) jVar).getFocusedView());
                        }
                        if (taVar4.f10789f2) {
                            taVar4.s0(false);
                        }
                        taVar4.z0(taVar4.f10824y0);
                        taVar4.A0(null, true);
                        return;
                    case 3:
                        taVar.A0(null, true);
                        return;
                    default:
                        ta taVar5 = taVar;
                        if (taVar5.f10809q1) {
                            taVar5.F0(false);
                            return;
                        } else if (taVar5.f10789f2) {
                            taVar5.s0(true);
                            return;
                        } else if (taVar5.f10826z0) {
                            taVar5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = taVar5.A1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, gb1.h(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.y6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        vh.j(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, gb1.x(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, gb1.u(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bh.f(4));
        frameLayout.addView(linearLayout, gb1.i(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f10784d1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.y6.g0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ta taVar2 = taVar;
                        u5 u5Var2 = taVar2.D0;
                        if (u5Var2 != null && (u5Var2.getCurrentBrush() instanceof rg.l)) {
                            u5Var2.b();
                            taVar2.Z0.setSelectedIndex(1);
                            taVar2.i((rg.m) rg.m.f47462a.get(0));
                            return;
                        }
                        taVar2.f10812s0.c();
                        return;
                    case 1:
                        ta taVar3 = taVar;
                        u5 u5Var3 = taVar3.D0;
                        rg.t1 t1Var2 = taVar3.f10812s0;
                        if (t1Var2.a()) {
                            if (u5Var3 != null && (u5Var3.getCurrentBrush() instanceof rg.l)) {
                                u5Var3.b();
                                taVar3.Z0.setSelectedIndex(1);
                                taVar3.i((rg.m) rg.m.f47462a.get(0));
                            }
                            if (u5Var3 != null) {
                                u5Var3.a();
                            }
                            t1Var2.f47561c.clear();
                            t1Var2.f47560b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            taVar3.G0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ta taVar4 = taVar;
                        sg.j jVar = taVar4.f10824y0;
                        if (jVar instanceof sg.x2) {
                            AndroidUtilities.hideKeyboard(((sg.x2) jVar).getFocusedView());
                        }
                        if (taVar4.f10789f2) {
                            taVar4.s0(false);
                        }
                        taVar4.z0(taVar4.f10824y0);
                        taVar4.A0(null, true);
                        return;
                    case 3:
                        taVar.A0(null, true);
                        return;
                    default:
                        ta taVar5 = taVar;
                        if (taVar5.f10809q1) {
                            taVar5.F0(false);
                            return;
                        } else if (taVar5.f10789f2) {
                            taVar5.s0(true);
                            return;
                        } else if (taVar5.f10826z0) {
                            taVar5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = taVar5.A1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView2, gb1.h(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f10786e1 = k10;
        k10.setBackground(org.telegram.ui.ActionBar.y6.g0(822083583, 7, -1));
        k10.setPadding(org.telegram.ui.d3.h(8.0f, R.string.Clear, k10), 0, AndroidUtilities.dp(8.0f), 0);
        k10.setGravity(16);
        k10.setTextColor(-1);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setTextSize(1, 16.0f);
        k10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ta taVar2 = taVar;
                        u5 u5Var2 = taVar2.D0;
                        if (u5Var2 != null && (u5Var2.getCurrentBrush() instanceof rg.l)) {
                            u5Var2.b();
                            taVar2.Z0.setSelectedIndex(1);
                            taVar2.i((rg.m) rg.m.f47462a.get(0));
                            return;
                        }
                        taVar2.f10812s0.c();
                        return;
                    case 1:
                        ta taVar3 = taVar;
                        u5 u5Var3 = taVar3.D0;
                        rg.t1 t1Var2 = taVar3.f10812s0;
                        if (t1Var2.a()) {
                            if (u5Var3 != null && (u5Var3.getCurrentBrush() instanceof rg.l)) {
                                u5Var3.b();
                                taVar3.Z0.setSelectedIndex(1);
                                taVar3.i((rg.m) rg.m.f47462a.get(0));
                            }
                            if (u5Var3 != null) {
                                u5Var3.a();
                            }
                            t1Var2.f47561c.clear();
                            t1Var2.f47560b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            taVar3.G0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ta taVar4 = taVar;
                        sg.j jVar = taVar4.f10824y0;
                        if (jVar instanceof sg.x2) {
                            AndroidUtilities.hideKeyboard(((sg.x2) jVar).getFocusedView());
                        }
                        if (taVar4.f10789f2) {
                            taVar4.s0(false);
                        }
                        taVar4.z0(taVar4.f10824y0);
                        taVar4.A0(null, true);
                        return;
                    case 3:
                        taVar.A0(null, true);
                        return;
                    default:
                        ta taVar5 = taVar;
                        if (taVar5.f10809q1) {
                            taVar5.F0(false);
                            return;
                        } else if (taVar5.f10789f2) {
                            taVar5.s0(true);
                            return;
                        } else if (taVar5.f10826z0) {
                            taVar5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = taVar5.A1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        k10.setAlpha(0.0f);
        k10.setVisibility(8);
        TextView k11 = org.telegram.ui.d3.k(frameLayout, k10, gb1.h(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f10788f1 = k11;
        k11.setBackground(org.telegram.ui.ActionBar.y6.g0(822083583, 7, -1));
        k11.setPadding(org.telegram.ui.d3.h(8.0f, R.string.Done, k11), 0, AndroidUtilities.dp(8.0f), 0);
        k11.setGravity(16);
        k11.setTextColor(-1);
        k11.setTypeface(AndroidUtilities.bold());
        k11.setTextSize(1, 16.0f);
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ta taVar2 = taVar;
                        u5 u5Var2 = taVar2.D0;
                        if (u5Var2 != null && (u5Var2.getCurrentBrush() instanceof rg.l)) {
                            u5Var2.b();
                            taVar2.Z0.setSelectedIndex(1);
                            taVar2.i((rg.m) rg.m.f47462a.get(0));
                            return;
                        }
                        taVar2.f10812s0.c();
                        return;
                    case 1:
                        ta taVar3 = taVar;
                        u5 u5Var3 = taVar3.D0;
                        rg.t1 t1Var2 = taVar3.f10812s0;
                        if (t1Var2.a()) {
                            if (u5Var3 != null && (u5Var3.getCurrentBrush() instanceof rg.l)) {
                                u5Var3.b();
                                taVar3.Z0.setSelectedIndex(1);
                                taVar3.i((rg.m) rg.m.f47462a.get(0));
                            }
                            if (u5Var3 != null) {
                                u5Var3.a();
                            }
                            t1Var2.f47561c.clear();
                            t1Var2.f47560b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            taVar3.G0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ta taVar4 = taVar;
                        sg.j jVar = taVar4.f10824y0;
                        if (jVar instanceof sg.x2) {
                            AndroidUtilities.hideKeyboard(((sg.x2) jVar).getFocusedView());
                        }
                        if (taVar4.f10789f2) {
                            taVar4.s0(false);
                        }
                        taVar4.z0(taVar4.f10824y0);
                        taVar4.A0(null, true);
                        return;
                    case 3:
                        taVar.A0(null, true);
                        return;
                    default:
                        ta taVar5 = taVar;
                        if (taVar5.f10809q1) {
                            taVar5.F0(false);
                            return;
                        } else if (taVar5.f10789f2) {
                            taVar5.s0(true);
                            return;
                        } else if (taVar5.f10826z0) {
                            taVar5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = taVar5.A1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        k11.setAlpha(0.0f);
        k11.setVisibility(8);
        frameLayout.addView(k11, gb1.h(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        a6 a6Var = new a6(taVar, context, e);
        this.I0 = a6Var;
        a6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        a6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(a6Var, gb1.i(-1, 104, 80));
        sg.t1 t1Var2 = new sg.t1(context, (w7Var == null || w7Var.v() || w7Var.f11929u || laVar == null) ? false : true);
        this.Z0 = t1Var2;
        t1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        t1Var2.setDelegate(this);
        t1Var2.setSelectedIndex(1);
        a6Var.addView(t1Var2, gb1.g(48.0f, -1));
        sg.q1 q1Var3 = new sg.q1(context);
        this.f10779a1 = q1Var3;
        q1Var3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        q1Var3.setVisibility(8);
        q1Var3.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ta taVar2 = taVar;
                        rg.q1 q1Var4 = taVar2.f10807p1;
                        taVar2.C0(q1Var4);
                        rg.s0.e(i10).j(q1Var4.f47524c);
                        return;
                    default:
                        taVar.f10779a1.setTypeface(rg.s0.e(i10).f47546j);
                        return;
                }
            }
        });
        q1Var3.setAlignment(rg.s0.e(i10).f47544g);
        a6Var.addView(q1Var3, gb1.g(48.0f, -1));
        e5 e5Var = new e5(taVar, context);
        this.J0 = e5Var;
        addView(e5Var, gb1.g(-1.0f, -1));
        sg.v1 v1Var = new sg.v1(context);
        this.f10780b1 = v1Var;
        v1Var.setVisibility(8);
        v1Var.setOnItemClickListener(new ai.k(taVar, 10));
        q1Var3.setTypefaceListView(v1Var);
        e5Var.addView(v1Var, gb1.h(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(s5Var.g(org.telegram.ui.ActionBar.y6.G8));
        f5 f5Var = new f5(taVar, context);
        this.l1 = f5Var;
        f5Var.setVisibility(8);
        f5Var.setColorPalette(rg.s0.e(i10));
        f5Var.setColorListener(new bi.n7(taVar, 1));
        a6Var.addView(f5Var, gb1.h(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        sg.h1 h1Var = new sg.h1(context);
        this.f10806p0 = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        h1Var.setBackground(org.telegram.ui.ActionBar.y6.g0(1090519039, 1, -1));
        a6Var.addView(h1Var, gb1.h(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        h1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ta taVar2 = taVar;
                        u5 u5Var2 = taVar2.D0;
                        if (u5Var2 != null && (u5Var2.getCurrentBrush() instanceof rg.l)) {
                            u5Var2.b();
                            taVar2.Z0.setSelectedIndex(1);
                            taVar2.i((rg.m) rg.m.f47462a.get(0));
                            return;
                        }
                        taVar2.f10812s0.c();
                        return;
                    case 1:
                        ta taVar3 = taVar;
                        u5 u5Var3 = taVar3.D0;
                        rg.t1 t1Var22 = taVar3.f10812s0;
                        if (t1Var22.a()) {
                            if (u5Var3 != null && (u5Var3.getCurrentBrush() instanceof rg.l)) {
                                u5Var3.b();
                                taVar3.Z0.setSelectedIndex(1);
                                taVar3.i((rg.m) rg.m.f47462a.get(0));
                            }
                            if (u5Var3 != null) {
                                u5Var3.a();
                            }
                            t1Var22.f47561c.clear();
                            t1Var22.f47560b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var22, 12));
                            taVar3.G0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ta taVar4 = taVar;
                        sg.j jVar = taVar4.f10824y0;
                        if (jVar instanceof sg.x2) {
                            AndroidUtilities.hideKeyboard(((sg.x2) jVar).getFocusedView());
                        }
                        if (taVar4.f10789f2) {
                            taVar4.s0(false);
                        }
                        taVar4.z0(taVar4.f10824y0);
                        taVar4.A0(null, true);
                        return;
                    case 3:
                        taVar.A0(null, true);
                        return;
                    default:
                        ta taVar5 = taVar;
                        if (taVar5.f10809q1) {
                            taVar5.F0(false);
                            return;
                        } else if (taVar5.f10789f2) {
                            taVar5.s0(true);
                            return;
                        } else if (taVar5.f10826z0) {
                            taVar5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = taVar5.A1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        sg.l1 l1Var = new sg.l1(context);
        this.f10808q0 = l1Var;
        l1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        l1Var.setBackground(org.telegram.ui.ActionBar.y6.g0(1090519039, 1, -1));
        l1Var.setOnClickListener(new bi.w0(taVar, context, e, 9));
        a6Var.addView(l1Var, gb1.h(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        sg.y1 y1Var = new sg.y1(context);
        this.S0 = y1Var;
        rg.q1 q1Var4 = q1Var;
        y1Var.setColorSwatch(q1Var4);
        y1Var.setRenderView(u5Var);
        y1Var.setValueOverride(lVar);
        q1Var4.f47524c = lVar.get();
        y1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ta taVar2 = taVar;
                        rg.q1 q1Var42 = taVar2.f10807p1;
                        taVar2.C0(q1Var42);
                        rg.s0.e(i10).j(q1Var42.f47524c);
                        return;
                    default:
                        taVar.f10779a1.setTypeface(rg.s0.e(i10).f47546j);
                        return;
                }
            }
        });
        addView(y1Var, gb1.g(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.K0 = frameLayout2;
        addView(frameLayout2, gb1.g(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        B0(q1Var4, null, false);
        i((rg.m) rg.m.f47462a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.D1 = new h5(taVar, rbVar, new ai.n1(9, taVar, rbVar));
        l2.H = i14;
    }

    public static void D0(sg.x2 x2Var, int i10) {
        int i11;
        x2Var.setAlign(i10);
        int i12 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = 19;
            } else {
                i11 = 21;
            }
        } else {
            i11 = 17;
        }
        x2Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        x2Var.getEditText().setTextAlignment(i12);
    }

    public static void X(ta taVar, rg.s0 s0Var, Integer num) {
        s0Var.h(num.intValue(), true);
        s0Var.g();
        taVar.setNewColor(num.intValue());
        taVar.l1.setSelectedColorIndex(s0Var.d());
        taVar.I1 = null;
    }

    public static void Y(ta taVar, Integer num) {
        taVar.setNewColor(num.intValue());
        taVar.F0(false);
    }

    public ViewGroup getBarView() {
        if (this.N0 == 2) {
            return this.f10779a1;
        }
        return this.Z0;
    }

    private int getFrameRotation() {
        int i10 = this.U0;
        if (i10 != 90) {
            if (i10 != 180) {
                if (i10 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private qw0 getPaintingSize() {
        qw0 qw0Var = this.f10820w0;
        if (qw0Var != null) {
            return qw0Var;
        }
        qw0 qw0Var2 = new qw0(1080.0f, 1920.0f);
        this.f10820w0 = qw0Var2;
        return qw0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            y5 y5Var = this.G0;
            if (i10 < y5Var.getChildCount()) {
                View childAt = y5Var.getChildAt(i10);
                if (childAt instanceof sg.q2) {
                    ImageReceiver imageReceiver = ((sg.q2) childAt).f48478x0;
                    xj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    org.telegram.ui.Components.g6 animation = imageReceiver.getAnimation();
                    boolean z11 = !z10;
                    imageReceiver.setAllowStartLottieAnimation(z11);
                    imageReceiver.setAllowStartAnimation(z11);
                    if (lottieAnimation != null) {
                        if (z10) {
                            lottieAnimation.stop();
                        } else {
                            lottieAnimation.start();
                        }
                    } else if (animation != null) {
                        animation.f28464y = z10;
                        if (z10) {
                            animation.x(false);
                        }
                        if (z10) {
                            animation.stop();
                        } else {
                            animation.start();
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setNewColor(int i10) {
        rg.q1 q1Var = this.f10807p1;
        int i11 = q1Var.f47522a;
        q1Var.f47522a = i10;
        B0(q1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new t4(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.A0 = i10;
        sg.j jVar = this.f10824y0;
        if (jVar instanceof sg.x2) {
            ((sg.x2) jVar).setType(i10);
        }
        rg.s0 e = rg.s0.e(this.f10817u1);
        e.h = i10;
        e.f47540a.edit().putInt("text_type", i10).apply();
        this.f10779a1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        l5 l5Var = new l5(this, context);
        this.L0 = l5Var;
        l5Var.setClipToPadding(false);
        this.L0.setOrientation(0);
        this.I0.addView(this.L0, gb1.h(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.W0 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.W0;
        int i10 = org.telegram.ui.ActionBar.y6.f23446i6;
        s5 s5Var = this.f10819v1;
        org.telegram.ui.ActionBar.f7.R(textView2, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i10, s5Var), 7, -1), null, org.telegram.ui.ActionBar.f7.N(i10), s5Var);
        this.W0.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.W0.setTextColor(-1);
        this.W0.setTextSize(1, 14.0f);
        this.W0.setGravity(1);
        this.W0.setTypeface(AndroidUtilities.bold());
        this.W0.setSingleLine();
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final e6 f11250b;

            {
                this.f11250b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f11250b;
                        if (e6Var.f10826z0) {
                            e6Var.A0(null, true);
                            return;
                        } else {
                            e6Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f11250b.x0();
                        return;
                    default:
                        e6 e6Var2 = this.f11250b;
                        e6Var2.O0(2);
                        if (!(e6Var2.f10824y0 instanceof sg.x2)) {
                            e6Var2.a2 = true;
                            e6Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.L0.addView(this.W0, gb1.p(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.X0 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        org.telegram.ui.ActionBar.f7.R(this.X0, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i10, s5Var), 7, -1), null, org.telegram.ui.ActionBar.f7.N(i10), s5Var);
        this.X0.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) {
            public final e6 f11250b;

            {
                this.f11250b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f11250b;
                        if (e6Var.f10826z0) {
                            e6Var.A0(null, true);
                            return;
                        } else {
                            e6Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f11250b.x0();
                        return;
                    default:
                        e6 e6Var2 = this.f11250b;
                        e6Var2.O0(2);
                        if (!(e6Var2.f10824y0 instanceof sg.x2)) {
                            e6Var2.a2 = true;
                            e6Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.X0.setTextColor(-1);
        this.X0.setTextSize(1, 14.0f);
        this.X0.setGravity(1);
        this.X0.setTypeface(AndroidUtilities.bold());
        this.X0.setAlpha(0.6f);
        this.X0.setSingleLine();
        this.L0.addView(this.X0, gb1.p(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.Y0 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        org.telegram.ui.ActionBar.f7.R(this.Y0, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i10, s5Var), 7, -1), null, org.telegram.ui.ActionBar.f7.N(i10), s5Var);
        this.Y0.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.Y0.setTextColor(-1);
        this.Y0.setTextSize(1, 14.0f);
        this.Y0.setGravity(1);
        this.Y0.setTypeface(AndroidUtilities.bold());
        this.Y0.setAlpha(0.6f);
        this.Y0.setSingleLine();
        this.Y0.setOnClickListener(new View.OnClickListener(this) {
            public final e6 f11250b;

            {
                this.f11250b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f11250b;
                        if (e6Var.f10826z0) {
                            e6Var.A0(null, true);
                            return;
                        } else {
                            e6Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f11250b.x0();
                        return;
                    default:
                        e6 e6Var2 = this.f11250b;
                        e6Var2.O0(2);
                        if (!(e6Var2.f10824y0 instanceof sg.x2)) {
                            e6Var2.a2 = true;
                            e6Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.L0.addView(this.Y0, gb1.p(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A0(sg.j jVar, boolean z10) {
        boolean z11;
        cc ccVar;
        cc ccVar2;
        fl0 fl0Var;
        int i10;
        boolean z12 = jVar instanceof sg.x2;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.O0) == -1 && this.N0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.Q0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.f10809q1) {
                F0(false);
            }
            O0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            sg.x2 x2Var = (sg.x2) jVar;
            int gravity = x2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            sg.q1 q1Var = this.f10779a1;
            q1Var.setAlignment(i11);
            rg.j0 typeface = x2Var.getTypeface();
            if (typeface != null) {
                q1Var.setTypeface(typeface.f47437a);
            }
            q1Var.e(x2Var.getType(), true);
            this.J0.invalidate();
        }
        sg.j jVar2 = this.f10824y0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f48246d0) {
                    if (jVar instanceof sg.u0) {
                        sg.u0 u0Var = (sg.u0) jVar;
                        u0Var.setType((u0Var.getType() + 1) % u0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof sg.y2) {
                        sg.y2 y2Var = (sg.y2) jVar;
                        y2Var.setType((y2Var.getType() + 1) % y2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof sg.r0) {
                        sg.r0 r0Var = (sg.r0) jVar;
                        sg.p0 p0Var = r0Var.f48482q0;
                        if (p0Var.e()) {
                            if (p0Var.getPreviewType() == 0) {
                                i12 = 1;
                            }
                            p0Var.setPreviewType(i12);
                            return true;
                        }
                        r0Var.setType(r0Var.getNextType());
                        return true;
                    } else if (!this.f10826z0) {
                        if (jVar instanceof sg.x2) {
                            this.B0 = true;
                            o0();
                            return true;
                        } else if (jVar instanceof sg.c2) {
                            sg.c2 c2Var = (sg.c2) jVar;
                            if (this.R1 && this.P1 == jVar) {
                                c2Var.q(true);
                                return true;
                            }
                            sg.c2 c2Var2 = this.P1;
                            if (c2Var2 != null && c2Var2 != c2Var && (fl0Var = this.O1) != null) {
                                fl0Var.animate().alpha(0.0f).setListener(new j5(fl0Var, 0));
                                this.O1 = null;
                                this.R1 = false;
                                this.Q1 = 0.0f;
                            }
                            if (this.O1 == null) {
                                fl0 fl0Var2 = new fl0(2, this.f10817u1, getContext(), LaunchActivity.R(), new di.s2(6, new di.b()));
                                this.O1 = fl0Var2;
                                org.telegram.ui.Components.pa paVar = new org.telegram.ui.Components.pa(this.T1, fl0Var2, 0, false);
                                this.O1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.B1.addView(this.O1, gb1.h(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.o(-16777216, 120));
                                fl0 fl0Var3 = this.O1;
                                ?? obj = new Object();
                                obj.e = this;
                                obj.f616c = paVar;
                                obj.d = paint;
                                obj.f615b = new Path();
                                fl0Var3.setDelegate(obj);
                                this.O1.p(null, null, true);
                            }
                            this.O1.setFragment(LaunchActivity.R());
                            this.P1 = c2Var;
                            L0(true);
                            return true;
                        } else {
                            J0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof sg.x2) {
                        AndroidUtilities.showKeyboard(((sg.x2) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            sg.j jVar3 = this.f10824y0;
            if (jVar3 instanceof sg.x2) {
                sg.x2 x2Var2 = (sg.x2) jVar3;
                sg.w2 w2Var = x2Var2.f48560q0;
                w2Var.clearFocus();
                w2Var.setEnabled(false);
                w2Var.setClickable(false);
                x2Var2.m();
                if (!z12) {
                    this.f10826z0 = false;
                    AndroidUtilities.hideKeyboard(((sg.x2) this.f10824y0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof sg.d2) && (ccVar2 = ((ta) this).f11725p2.Z0) != null) {
                ccVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        sg.j jVar4 = this.f10824y0;
        this.f10824y0 = jVar;
        if ((jVar4 instanceof sg.x2) && TextUtils.isEmpty(((sg.x2) jVar4).getText())) {
            z0(jVar4);
        }
        sg.j jVar5 = this.f10824y0;
        if (jVar4 != jVar5 && (jVar5 instanceof sg.d2) && (ccVar = ((ta) this).f11725p2.Z0) != null) {
            ccVar.l(true);
        }
        sg.j jVar6 = this.f10824y0;
        a4.l lVar = this.T0;
        rg.q1 q1Var2 = this.f10807p1;
        sg.y1 y1Var = this.S0;
        if (jVar6 != null) {
            z5 z5Var = this.F0;
            jVar6.m0 = z5Var;
            jVar6.l(z5Var, true);
            sg.j jVar7 = this.f10824y0;
            if (jVar7 instanceof sg.x2) {
                sg.x2 x2Var3 = (sg.x2) jVar7;
                x2Var3.getSwatch().f47524c = q1Var2.f47524c;
                x2Var3.f48569z0 = false;
                C0(x2Var3.getSwatch());
                y1Var.setValueOverride(new i5(x2Var3, (int) (this.f10820w0.f32052a / 9.0f), 0));
                y1Var.setShowPreview(false);
            } else {
                y1Var.setValueOverride(lVar);
                y1Var.setShowPreview(true);
                q1Var2.f47524c = lVar.get();
                B0(q1Var2, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.Q0;
            if (valueAnimator2 != null && this.O0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.f10809q1) {
                F0(false);
            }
            O0(0);
            y1Var.setValueOverride(lVar);
            y1Var.setShowPreview(true);
            q1Var2.f47524c = lVar.get();
            B0(q1Var2, null, false);
            z13 = z11;
        }
        R0();
        return z13;
    }

    public final void B0(rg.q1 q1Var, Integer num, boolean z10) {
        rg.q1 q1Var2 = this.f10807p1;
        if (q1Var2 != q1Var) {
            q1Var2.f47522a = q1Var.f47522a;
            q1Var2.f47523b = q1Var.f47523b;
            q1Var2.f47524c = q1Var.f47524c;
            int i10 = this.f10817u1;
            rg.s0.e(i10).h(q1Var.f47522a, true);
            rg.s0.e(i10).j(q1Var.f47524c);
        }
        int i11 = q1Var.f47522a;
        u5 u5Var = this.D0;
        u5Var.setColor(i11);
        u5Var.setBrushSize(q1Var.f47524c);
        int i12 = q1Var2.f47522a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new n4(this, num, i12, 0));
            duration.start();
        } else {
            a6 a6Var = this.I0;
            if (a6Var != null) {
                a6Var.invalidate();
            }
        }
        sg.j jVar = this.f10824y0;
        if (jVar instanceof sg.x2) {
            ((sg.x2) jVar).setSwatch(new rg.q1(q1Var.f47523b, q1Var.f47524c, q1Var.f47522a));
        } else if (z10 && (jVar instanceof sg.u0)) {
            ((sg.u0) jVar).setColor(q1Var.f47522a);
            ((sg.u0) this.f10824y0).setType(3);
        } else if (z10 && (jVar instanceof sg.y2)) {
            ((sg.y2) jVar).setColor(q1Var.f47522a);
            ((sg.y2) this.f10824y0).setType(3);
        } else if (z10 && (jVar instanceof sg.r0)) {
            ((sg.r0) jVar).setColor(q1Var.f47522a);
            ((sg.r0) this.f10824y0).setType(0);
        }
    }

    @Override
    public final void C() {
        M0(true);
    }

    public final void C0(rg.q1 q1Var) {
        B0(q1Var, null, false);
    }

    @Override
    public final boolean D(sg.j jVar) {
        return A0(jVar, true);
    }

    public final void E0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        sg.j jVar;
        ArrayList arrayList = this.F1;
        if (arrayList != null) {
            w7 w7Var = this.E1;
            this.E1 = null;
            this.F1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                ?? r13 = this.G0;
                if (i11 < size) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        r5 k02 = k0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            k02.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i10 = i11;
                        jVar = k02;
                    } else if (b10 == 1) {
                        sg.x2 l02 = l0(z10);
                        l02.setType(mediaEntity.subType);
                        l02.setTypeface(mediaEntity.textTypeface);
                        l02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        for (int i12 = z10; i12 < size2; i12++) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i12);
                            org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(emojiEntity.document_id, 1.0f, l02.getFontMetricsInt());
                            int i13 = emojiEntity.offset;
                            spannableString.setSpan(c6Var, i13, emojiEntity.length + i13, 33);
                            i11 = i11;
                        }
                        i10 = i11;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, l02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        l02.setText(replaceEmoji);
                        D0(l02, mediaEntity.textAlign);
                        rg.q1 swatch = l02.getSwatch();
                        swatch.f47522a = mediaEntity.color;
                        l02.setSwatch(swatch);
                        jVar = l02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            sg.z1 h02 = h0(mediaEntity.text, false);
                            h02.G0 = mediaEntity.crop;
                            h02.B0 = false;
                            if ((2 & mediaEntity.subType) != 0) {
                                h02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            jVar = h02;
                        } else if (b10 == 6) {
                            ArrayList arrayList3 = w7Var.v;
                            boolean z11 = w7Var.K;
                            this.a2 = true;
                            sg.j q5Var = new q5(this, getContext(), c0(), arrayList3, this.T1, z11, this.U1);
                            q5Var.setDelegate(this);
                            r13.addView(q5Var);
                            d0();
                            jVar = q5Var;
                            if (mediaEntity.viewWidth > 0) {
                                jVar = q5Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = q5Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    jVar = q5Var;
                                }
                            }
                        } else if (b10 == 3) {
                            sg.u0 g02 = g0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                g02.setColor(i14);
                            }
                            g02.setType(mediaEntity.subType);
                            jVar = g02;
                        } else if (b10 == 8) {
                            pc pcVar = mediaEntity.weather;
                            if (pcVar != null) {
                                sg.y2 m0 = m0(pcVar);
                                int i15 = mediaEntity.color;
                                if (i15 != 0) {
                                    m0.setColor(i15);
                                }
                                m0.setType(mediaEntity.subType);
                                jVar = m0;
                            } else {
                                i11 = i10 + 1;
                                z10 = false;
                            }
                        } else if (b10 == 7) {
                            sg.r0 f02 = f0(mediaEntity.linkSettings);
                            sg.p0 p0Var = f02.f48482q0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                f02.setColor(i16);
                            }
                            boolean e = p0Var.e();
                            int i17 = p0Var.h;
                            int i18 = p0Var.f48410f;
                            if (e) {
                                p0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                f02.setType(3);
                                p0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(p0Var.f48403a0)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(p0Var.f48405b0)) + i17 + i17;
                                PointF position = f02.getPosition();
                                position.y = (this.H1 * 0.3f) + position.y;
                                f02.setPosition(position);
                                i11 = i10 + 1;
                                z10 = false;
                            } else {
                                f02.setType(b11);
                                jVar = f02;
                            }
                        } else if (b10 == 4) {
                            sg.c2 i02 = i0(false);
                            i02.s(bh.x0.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                i02.r(false);
                            }
                            jVar = i02;
                            if (mediaEntity.mediaArea.dark) {
                                i02.q(false);
                                jVar = i02;
                            }
                        } else {
                            if (b10 == 5 && w7Var.f11918o0 != null) {
                                sg.d2 j02 = j0(w7Var.f11920p0, false);
                                sb sbVar = ((ta) this).f11725p2;
                                gb gbVar = sbVar.X0;
                                if (gbVar != null) {
                                    gbVar.f11389w = j02;
                                    s81 s81Var = gbVar.f11391x;
                                    if (s81Var != null) {
                                        s81Var.V(j02.f48181u0);
                                    }
                                }
                                ib ibVar = sbVar.f11614c1;
                                if (ibVar != null) {
                                    ibVar.setHasRoundVideo(true);
                                }
                                jVar = j02;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !j02.f48178r0;
                                    j02.f48178r0 = z12;
                                    j02.f48179s0.f(z12, true);
                                    j02.invalidate();
                                    jVar = j02;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f19572x * this.G1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f19573y * this.H1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                    jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
                    jVar.setScale(mediaEntity.scale);
                    jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                    i11 = i10 + 1;
                    z10 = false;
                } else {
                    r13.setVisibility(z10 ? 1 : 0);
                    return;
                }
            }
        }
    }

    public final void F0(final boolean z10) {
        float f7;
        boolean z11;
        if (this.f10809q1 != z10) {
            this.f10809q1 = z10;
            o1.j jVar = this.f10811r1;
            if (jVar != null) {
                jVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new ac.a(f7));
            this.f10811r1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.f18975i = f10;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f18969u = kVar;
            if (!this.D1.c() && this.f10795i2 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.I0.getTranslationY();
            final float alpha = this.f10808q0.getAlpha();
            final ViewGroup barView = getBarView();
            this.f10811r1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    float f13;
                    int i10;
                    e6 e6Var = e6.this;
                    a6 a6Var = e6Var.I0;
                    float f14 = f11 / 1000.0f;
                    e6Var.f10813s1 = f14;
                    float f15 = 1.0f;
                    float f16 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f16);
                    view.setScaleY(f16);
                    view.setTranslationY((Math.min(e6Var.f10813s1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(e6Var.f10813s1, 0.25f) / 0.25f));
                    f5 f5Var = e6Var.l1;
                    float f17 = e6Var.f10813s1;
                    boolean z12 = z10;
                    f5Var.E1(f17, z12);
                    sg.l1 l1Var = e6Var.f10808q0;
                    l1Var.setProgress(e6Var.f10813s1);
                    sg.h1 h1Var = e6Var.f10806p0;
                    h1Var.setProgress(e6Var.f10813s1);
                    e6Var.L0.setTranslationY(AndroidUtilities.dp(32.0f) * e6Var.f10813s1);
                    AnimatorSet animatorSet = e6Var.C1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f18 = e6Var.f10813s1;
                        if (!z12) {
                            f18 = 1.0f - f18;
                        }
                        if (z12) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        float f19 = alpha;
                        l1Var.setAlpha(AndroidUtilities.lerp(f19, f13, f18));
                        if (!z12) {
                            f15 = 0.0f;
                        }
                        h1Var.setAlpha(AndroidUtilities.lerp(f19, f15, f18));
                        float dp = AndroidUtilities.dp(39.0f) * f18;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        a6Var.setTranslationY(translationY - (dp * i10));
                    }
                    a6Var.invalidate();
                    if (view == e6Var.f10779a1) {
                        e6Var.J0.invalidate();
                    }
                }
            });
            this.f10811r1.a(new p4(this, z10, 0));
            this.f10811r1.h();
            if (z10) {
                f5 f5Var = this.l1;
                f5Var.setVisibility(0);
                f5Var.setSelectedColorIndex(rg.s0.e(this.f10817u1).d());
            }
        }
    }

    public final void G0(int i10) {
        boolean z10;
        int i11;
        sg.q1 q1Var = this.f10779a1;
        h5 h5Var = this.D1;
        if (i10 == 1) {
            sz szVar = this.f10787e2;
            if (szVar != null && szVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sz szVar2 = this.f10787e2;
            rb rbVar = this.B1;
            if (szVar2 != null && szVar2.f32716c1 != UserConfig.selectedAccount) {
                rbVar.removeView(szVar2);
                this.f10787e2 = null;
            }
            if (this.f10787e2 == null) {
                sz szVar3 = new sz(null, true, false, false, getContext(), false, null, null, true, this.f10819v1, false, false);
                this.f10787e2 = szVar3;
                szVar3.f32784x2 = false;
                szVar3.U0 = true;
                szVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f10787e2.setForseMultiwindowLayout(true);
                }
                this.f10787e2.setDelegate(new t5(this));
                rbVar.addView(this.f10787e2);
            }
            this.f10787e2.setVisibility(0);
            this.f10789f2 = true;
            sz szVar4 = this.f10787e2;
            if (this.f10799k2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f10799k2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f10799k2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f10800l2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f10800l2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f10800l2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f10800l2;
            } else {
                i11 = this.f10799k2;
            }
            int paddingUnderContainer = rbVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) szVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            szVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                sg.j jVar = this.f10824y0;
                if (jVar instanceof sg.x2) {
                    AndroidUtilities.hideKeyboard(((sg.x2) jVar).getEditText());
                }
            }
            this.f10795i2 = paddingUnderContainer;
            h5Var.a();
            requestLayout();
            ah emojiButton = q1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            if (!z10) {
                if (this.f10791g2) {
                    this.f10797j2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f10795i2, 0.0f);
                    ofFloat.addUpdateListener(new q4(this, 1));
                    ofFloat.addListener(new k5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22961w);
                    ofFloat.start();
                }
            }
        } else {
            ah emojiButton2 = q1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(yg.e, true);
            }
            sz szVar5 = this.f10787e2;
            if (szVar5 != null) {
                this.f10789f2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    szVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f10795i2 = 0;
                h5Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(sg.r0 r0Var) {
        f8 f8Var = new f8(getContext(), this.f10819v1, this.V1, new ai.n1(11, this, r0Var));
        if (r0Var != null) {
            sg.o0 o0Var = r0Var.f48486u0;
            f8Var.f10869c0 = true;
            org.telegram.ui.Cells.g3 g3Var = f8Var.Z;
            org.telegram.ui.Cells.g3 g3Var2 = f8Var.Y;
            if (o0Var != null) {
                f8Var.f10873g0 = o0Var.d;
                f8Var.f10874h0 = false;
                g3Var2.setText(o0Var.f48393c);
                g3Var.setText(o0Var.f48392b);
                f8Var.m0 = !TextUtils.isEmpty(o0Var.f48392b);
                f8Var.f10879n0 = o0Var.f48394f;
                f8Var.f10880o0 = o0Var.e;
            } else {
                g3Var2.setText("");
                g3Var.setText("");
                f8Var.f10879n0 = true;
                f8Var.f10880o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = f8Var.f10868b0;
            dVar.i(string, false, true);
            b8 b8Var = f8Var.X;
            if (b8Var != null) {
                b8Var.O(false);
            }
            dVar.setEnabled(f8Var.V(g3Var2.getText().toString()));
            f8Var.f10869c0 = false;
        }
        f8Var.setOnDismissListener(new a5(this, 1));
        f8Var.show();
        w0(true);
    }

    @Override
    public final void I(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f10791g2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f10800l2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f10800l2).commit();
            } else {
                this.f10799k2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f10799k2).commit();
            }
        }
        boolean z13 = this.f10789f2;
        h5 h5Var = this.D1;
        if (z13) {
            if (z10) {
                i11 = this.f10800l2;
            } else {
                i11 = this.f10799k2;
            }
            int paddingUnderContainer = this.B1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10787e2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f10787e2.setLayoutParams(layoutParams);
                this.f10795i2 = layoutParams.height;
                h5Var.a();
                requestLayout();
            }
        }
        if (this.f10802m2 == i10 && this.f10804n2 == z10) {
            return;
        }
        this.f10802m2 = i10;
        this.f10804n2 = z10;
        boolean z14 = this.f10791g2;
        sg.j jVar = this.f10824y0;
        if (jVar instanceof sg.x2) {
            if (((sg.x2) jVar).getEditText().isFocused() && h5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f10791g2 = z12;
        } else {
            this.f10791g2 = false;
        }
        if (this.f10791g2 && this.f10789f2) {
            G0(0);
        }
        if (this.f10795i2 != 0 && !(z11 = this.f10791g2) && z11 != z14 && !this.f10789f2) {
            this.f10795i2 = 0;
            h5Var.a();
            requestLayout();
        }
        R0();
        if (z14 && !this.f10791g2 && this.f10795i2 > 0 && this.f10797j2) {
            this.f10797j2 = false;
        }
        P0();
    }

    public final void I0(sg.u0 u0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ti tiVar = new ti(getContext(), new o5(this, callback2), false, true, false, this.f10819v1);
        tiVar.f33010c2 = new Object();
        th thVar = tiVar.A1;
        if (u0Var != null && (messageMedia = u0Var.f48527u0) != null && (geoPoint = messageMedia.geo) != null) {
            tiVar.D2 = new double[]{geoPoint.lat, geoPoint._long};
            tiVar.O = true;
            thVar.setVisibility(8);
        } else if (this.J1) {
            tiVar.B2 = this.L1;
            tiVar.C2 = this.K1;
            tiVar.O = true;
            thVar.setVisibility(8);
        } else {
            tiVar.O = true;
            thVar.setVisibility(8);
        }
        tiVar.setOnDismissListener(new a5(this, 0));
        tiVar.v1();
        tiVar.show();
    }

    public final void J0(sg.j jVar) {
        if (jVar instanceof sg.g1) {
            org.telegram.ui.ActionBar.o1 o1Var = this.f10821w1;
            if (o1Var != null && o1Var.isShowing()) {
                this.f10821w1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f10785d2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        y5 y5Var = this.G0;
        float scaleX2 = y5Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = y5Var.getScaleY() * scaleY * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        K0(new u4(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void K0(Runnable runnable, e6 e6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.o1 o1Var = this.f10821w1;
        if (o1Var != null && o1Var.isShowing()) {
            this.f10821w1.d(true);
            return;
        }
        if (this.f10823x1 == null) {
            this.f10825y1 = new Rect();
            c6 c6Var = new c6(this, getContext());
            this.f10823x1 = c6Var;
            c6Var.setAnimationEnabled(true);
            this.f10823x1.setOnTouchListener(new w4(this, 0));
            this.f10823x1.setDispatchKeyEventListener(new x4(this));
            this.f10823x1.setShownFromBottom(true);
        }
        c6 c6Var2 = this.f10823x1;
        c6Var2.W = z10;
        c6Var2.d();
        runnable.run();
        if (this.f10821w1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.f10823x1, -2, -2);
            this.f10821w1 = o1Var2;
            o1Var2.f22906b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.f10821w1.setOutsideTouchable(true);
            this.f10821w1.setClippingEnabled(true);
            this.f10821w1.setInputMethodMode(2);
            this.f10821w1.setSoftInputMode(0);
            this.f10821w1.getContentView().setFocusableInTouchMode(true);
            this.f10821w1.setOnDismissListener(new y4(this, 0));
        }
        this.f10823x1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.f10821w1.setFocusable(true);
        int measuredWidth = i11 - (this.f10823x1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.f10823x1.getMeasuredHeight();
        this.f10821w1.showAtLocation(e6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.o1.i(this.f10823x1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            c6 c6Var3 = this.f10823x1;
            c6Var3.setBackgroundDrawable(new org.telegram.ui.Components.oa(new org.telegram.ui.Components.pa(this.T1, c6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.f10823x1.setBackgroundDrawable(mutate);
        this.f10823x1.setBackgroundColor(-14145495);
    }

    public final void L0(boolean z10) {
        if (this.R1 != z10) {
            if (z10 || this.O1 != null) {
                this.R1 = z10;
                if (z10) {
                    this.O1.n();
                    this.O1.setVisibility(0);
                    this.O1.setSelectedReaction(this.P1.getCurrentReaction());
                    this.O1.getParent().bringChildToFront(this.O1);
                } else {
                    this.P1 = null;
                }
                float f7 = 0.0f;
                if (z10) {
                    this.S1 = true;
                    this.B1.invalidate();
                    float f10 = this.Q1;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.O1.setTransitionProgress(this.Q1);
                    ofFloat.addUpdateListener(new q4(this, 2));
                    ofFloat.addListener(new bh.f0(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(ds.f27585g);
                    ofFloat.start();
                    return;
                }
                if (this.O1.getReactionsWindow() != null) {
                    this.O1.getReactionsWindow().e();
                }
                this.O1.animate().alpha(0.0f).setDuration(150L).setListener(new k5(this, 0)).start();
            }
        }
    }

    public final void M0(boolean z10) {
        float f7;
        if (this.f10796j1 != z10) {
            this.f10796j1 = z10;
            o1.j jVar = this.f10798k1;
            if (jVar != null) {
                jVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new ac.a(f7));
            this.f10798k1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.f18975i = f10;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f18969u = kVar;
            if (z10) {
                sg.v1 v1Var = this.f10780b1;
                v1Var.setAlpha(0.0f);
                v1Var.setVisibility(0);
            }
            this.f10798k1.b(new di.i8(1, this));
            this.f10798k1.a(new p4(this, z10, 1));
            this.f10798k1.h();
        }
    }

    public final PointF N0(sg.j jVar) {
        float f7;
        float f10;
        float f11 = 200.0f;
        MediaController.CropState cropState = this.f10816u0;
        if (cropState != null) {
            f11 = 200.0f / cropState.cropScale;
        }
        float f12 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f13 = 100.0f;
        if (cropState != null) {
            f13 = 100.0f / cropState.cropScale;
        }
        PointF c02 = c0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                y5 y5Var = this.G0;
                if (i11 >= y5Var.getChildCount()) {
                    break;
                }
                View childAt = y5Var.getChildAt(i11);
                if (!(childAt instanceof sg.j) || (childAt instanceof sg.g1)) {
                    f7 = f12;
                    f10 = f13;
                } else {
                    PointF position2 = ((sg.j) childAt).getPosition();
                    f7 = f12;
                    f10 = f13;
                    if (((float) Math.sqrt(Math.pow(position2.y - c02.y, 2.0d) + Math.pow(position2.x - c02.x, 2.0d))) < f10) {
                        f11 = Math.min(childAt.getHeight(), childAt.getWidth()) * f7;
                        z10 = true;
                    }
                }
                i11++;
                f13 = f10;
                f12 = f7;
            }
            float f14 = f12;
            float f15 = f13;
            if (!z10) {
                break;
            }
            i10++;
            c02 = new PointF(c02.x + f11, c02.y + f11);
            f12 = f14;
            f13 = f15;
        }
        return c02;
    }

    public final void O0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.N0 != i10 && this.O0 != i10) {
            ValueAnimator valueAnimator = this.Q0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.N0;
            ViewGroup viewGroup3 = this.f10779a1;
            ViewGroup viewGroup4 = this.Z0;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.O0 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.f10817u1;
            rg.s0 e = rg.s0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f47548l != z10) {
                e.f47548l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f47540a.getInt("brush", 0), false);
                }
            }
            int c10 = rg.s0.e(i12).c();
            rg.q1 q1Var = this.f10807p1;
            q1Var.f47522a = c10;
            B0(q1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.Q0 = duration;
            duration.setInterpolator(ds.f27584f);
            this.Q0.addUpdateListener(new di.n3(this, viewGroup, viewGroup2, 1));
            this.Q0.addListener(new m5(this, viewGroup, viewGroup2, i10, 0));
            this.Q0.start();
        }
    }

    public final void P0() {
        boolean z10;
        h5 h5Var = this.D1;
        sg.q1 q1Var = this.f10779a1;
        if (q1Var != null) {
            if (h5Var.c()) {
                q1Var.a(R.drawable.input_smile);
            } else if (this.f10789f2) {
                q1Var.a(R.drawable.input_keyboard);
            } else {
                q1Var.a(R.drawable.msg_add);
            }
        }
        if (!h5Var.c() && !this.f10789f2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        boolean z12 = !z11;
        AndroidUtilities.updateViewShow(this.f10784d1, z12, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f10782c1, z12, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f10788f1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f10786e1, z11, false, 1.0f, true, null);
    }

    @Override
    public final int Q() {
        return this.D1.f12065l - this.B1.getBottomPadding2();
    }

    public final void Q0() {
        float f7;
        sg.j jVar;
        ObjectAnimator objectAnimator = this.X1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.D0.getParent();
        if (view == null) {
            return;
        }
        h5 h5Var = this.D1;
        if (((h5Var.c() && !h5Var.d) || this.f10795i2 > 0) && (jVar = this.f10824y0) != null) {
            f7 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.X1 = ofFloat;
        ofFloat.setDuration(350L);
        this.X1.setInterpolator(ds.h);
        this.X1.start();
    }

    public final void R0() {
        throw new UnsupportedOperationException("Method not decompiled: fi.e6.R0():void");
    }

    @Override
    public final void a() {
        F0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23425h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23462j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23612r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Mh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Eh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23297a7));
    }

    @Override
    public final int[] b(sg.j jVar) {
        int[] iArr = this.f10785d2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new e2.q0(7, this, view)).start();
    }

    @Override
    public final void c() {
        setTextType((this.A0 + 1) % 4);
    }

    public final PointF c0() {
        y5 y5Var = this.G0;
        int measuredWidth = y5Var.getMeasuredWidth();
        int measuredHeight = y5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.G1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.H1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override
    public final void d(int i10) {
        sg.j jVar = this.f10824y0;
        if (jVar instanceof sg.x2) {
            D0((sg.x2) jVar, i10);
            rg.s0 e = rg.s0.e(this.f10817u1);
            e.f47544g = i10;
            e.f47540a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void d0() {
        org.telegram.ui.Components.c6[] c6VarArr;
        boolean z10 = this.L1;
        y5 y5Var = this.G0;
        boolean z11 = true;
        if (!z10 && !this.N1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < y5Var.getChildCount()) {
                    View childAt = y5Var.getChildAt(i10);
                    boolean z12 = childAt instanceof sg.x2;
                    int i11 = this.f10817u1;
                    if (z12) {
                        CharSequence text = ((sg.x2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.c6 c6Var : (org.telegram.ui.Components.c6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.c6.class)) {
                                TLRPC.Document document = c6Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.t5.f(i11, c6Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.t5.h(i11).e(document);
                                }
                                if (w7.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i10++;
                    } else if (childAt instanceof sg.q2) {
                        TLRPC.Document sticker = ((sg.q2) childAt).getSticker();
                        if (w7.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof sg.d2) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
        }
        for (int i12 = 0; i12 < y5Var.getChildCount(); i12++) {
            View childAt2 = y5Var.getChildAt(i12);
            if (childAt2 instanceof sg.j) {
                ((sg.j) childAt2).setIsVideo(z11);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f10781b2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10 = 0;
        if ((view == this.D0 || view == this.E0 || view == this.G0 || view == this.F0) && (cropState = this.f10816u0) != null) {
            canvas.save();
            if (!this.C0) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = cropState.transformRotation;
            if (i11 != 90 && i11 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i10 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i10 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i10 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final TextView e0(int i10, String str) {
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.E8, this.f10819v1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(str);
        return textView;
    }

    public final sg.r0 f0(sg.o0 o0Var) {
        int measuredWidth;
        int i10;
        this.a2 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        y5 y5Var = this.G0;
        if (y5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.G1;
        } else {
            measuredWidth = y5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        sg.r0 r0Var = new sg.r0(getContext(), N0, this.f10817u1, o0Var, f7 / 360.0f, dp);
        if (N0.x == y5Var.getMeasuredWidth() / 2.0f) {
            r0Var.setStickyX(2);
        }
        if (N0.y == y5Var.getMeasuredHeight() / 2.0f) {
            r0Var.setStickyY(2);
        }
        rg.q1 q1Var = this.f10807p1;
        if (q1Var != null && (i10 = q1Var.f47522a) != -47814) {
            r0Var.setColor(i10);
        }
        r0Var.setDelegate(this);
        r0Var.setMaxWidth(dp);
        y5Var.addView(r0Var, gb1.g(-2.0f, -2));
        d0();
        MediaController.CropState cropState = this.f10816u0;
        if (cropState != null) {
            r0Var.j(1.0f / cropState.cropScale);
            r0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return r0Var;
    }

    public final sg.u0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.a2 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        y5 y5Var = this.G0;
        if (y5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.G1;
        } else {
            measuredWidth = y5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        sg.u0 u0Var = new sg.u0(getContext(), N0, this.f10817u1, messageMedia, mediaArea, f7 / 240.0f, dp);
        if (N0.x == y5Var.getMeasuredWidth() / 2.0f) {
            u0Var.setStickyX(2);
        }
        if (N0.y == y5Var.getMeasuredHeight() / 2.0f) {
            u0Var.setStickyY(2);
        }
        rg.q1 q1Var = this.f10807p1;
        if (q1Var != null && (i10 = q1Var.f47522a) != -47814) {
            u0Var.setColor(i10);
        }
        u0Var.setDelegate(this);
        u0Var.setMaxWidth(dp);
        y5Var.addView(u0Var, gb1.g(-2.0f, -2));
        d0();
        MediaController.CropState cropState = this.f10816u0;
        if (cropState != null) {
            u0Var.j(1.0f / cropState.cropScale);
            u0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return u0Var;
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.D0.c(true, false);
    }

    public View getBottomLayout() {
        return this.I0;
    }

    public View getCancelView() {
        return this.f10806p0;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.f10816u0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f10808q0;
    }

    public View getEntitiesView() {
        return this.G0;
    }

    public long getLcm() {
        return this.V0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.c6[] c6VarArr;
        y5 y5Var = this.G0;
        int childCount = y5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = y5Var.getChildAt(i10);
            if (childAt instanceof sg.q2) {
                TLRPC.Document sticker = ((sg.q2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f22039id = sticker.f22033id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof sg.x2) {
                CharSequence text = ((sg.x2) childAt).getText();
                if ((text instanceof Spanned) && (c6VarArr = (org.telegram.ui.Components.c6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.c6.class)) != null) {
                    for (org.telegram.ui.Components.c6 c6Var : c6VarArr) {
                        if (c6Var != null) {
                            TLRPC.Document document = c6Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.t5.f(this.f10817u1, c6Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f22039id = document.f22033id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.D0, this.E0, this.G0, this.F0);
    }

    public View getRenderInputView() {
        return this.E0;
    }

    public rg.c1 getRenderView() {
        return this.D0;
    }

    public sg.j getSelectedEntity() {
        return this.f10824y0;
    }

    public View getSelectionEntitiesView() {
        return this.F0;
    }

    public View getTextDimView() {
        return this.M0;
    }

    public View getTopLayout() {
        return this.H0;
    }

    public View getWeightChooserView() {
        return this.S0;
    }

    public final sg.z1 h0(String str, boolean z10) {
        float f7;
        qw0 qw0Var;
        this.a2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        y5 y5Var = this.G0;
        if (i10 > 0) {
            float floor = (float) Math.floor(Math.max(this.G1, y5Var.getMeasuredWidth()) * 0.5d);
            qw0Var = new qw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.H1, y5Var.getMeasuredHeight()) * 0.5d);
            qw0Var = new qw0(f7 * floor2, floor2);
        }
        qw0 qw0Var2 = qw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = qw0Var2.f32052a;
            qw0Var2.f32052a = qw0Var2.f32053b;
            qw0Var2.f32053b = f10;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        sg.z1 z1Var = new sg.z1(context, c02, qw0Var2, str, intValue);
        z1Var.setDelegate(this);
        y5Var.addView(z1Var);
        d0();
        return z1Var;
    }

    @Override
    public final void i(rg.m mVar) {
        boolean z10 = mVar instanceof rg.b;
        sg.y1 y1Var = this.S0;
        if (!z10 && !(mVar instanceof rg.d)) {
            y1Var.b(0.05f, 1.0f);
        } else {
            y1Var.b(0.4f, 1.75f);
        }
        y1Var.setDrawCenter(!(mVar instanceof rg.l));
        u5 u5Var = this.D0;
        if (u5Var.getCurrentBrush() instanceof rg.l) {
            this.R0 = true;
        }
        u5Var.setBrush(mVar);
        rg.q1 q1Var = this.f10807p1;
        int i10 = q1Var.f47522a;
        q1Var.f47522a = rg.s0.e(this.f10817u1).c();
        q1Var.f47524c = this.T0.get();
        B0(q1Var, Integer.valueOf(i10), false);
        this.E0.invalidate();
    }

    public final sg.c2 i0(boolean z10) {
        String str;
        qw0 qw0Var = new qw0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF c02 = c0();
        y5 y5Var = this.G0;
        if (y5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < y5Var.getChildCount(); i10++) {
                    View childAt = y5Var.getChildAt(i10);
                    if (a8.ic.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                c02.x = (y5Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (y5Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.clamp(c02.x, y5Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.clamp(c02.y, y5Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new sg.j(getContext(), c02);
        jVar.f48163r0 = new di.e9(jVar);
        jVar.f48164s0 = new di.e9(jVar);
        jVar.f48165t0 = new bh.n0(jVar);
        jVar.f48166u0 = new bh.n0(jVar);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6((View) jVar);
        jVar.f48168w0 = h6Var;
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6((View) jVar);
        jVar.f48169x0 = h6Var2;
        jVar.f48171z0 = 1.0f;
        jVar.f48162q0 = qw0Var;
        h6Var2.d(1.0f, true);
        h6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        bh.n0 n0Var = jVar.f48165t0;
        int i11 = 0;
        while (true) {
            if (i11 < reactionsList.size()) {
                if (reactionsList.get(i11).title.equals("Red Heart")) {
                    str = reactionsList.get(i11).reaction;
                    break;
                }
                i11++;
            } else {
                str = reactionsList.get(0).reaction;
                break;
            }
        }
        bh.x0 b10 = bh.x0.b(str);
        jVar.f48167v0 = b10;
        n0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        y5Var.addView(jVar);
        d0();
        if (z10) {
            y0(jVar);
            A0(jVar, true);
        }
        return jVar;
    }

    @Override
    public final boolean j(MotionEvent motionEvent) {
        if (this.f10781b2) {
            return false;
        }
        if (this.f10824y0 != null) {
            A0(null, true);
        }
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x9, y3);
        this.D0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final sg.d2 j0(String str, boolean z10) {
        float f7;
        this.a2 = true;
        this.f10783c2 = true;
        n0();
        y5 y5Var = this.G0;
        int measuredWidth = y5Var.getMeasuredWidth();
        y5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.G1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        qw0 qw0Var = new qw0(floor, floor);
        sg.d2 d2Var = new sg.d2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (qw0Var.f32053b / 2.0f) + AndroidUtilities.dp(72.0f)), qw0Var, str);
        d2Var.setDelegate(this);
        y5Var.addView(d2Var);
        d0();
        if (z10) {
            y0(d2Var);
            post(new l4(this, d2Var, 0));
        }
        this.f10783c2 = false;
        return d2Var;
    }

    @Override
    public final void k(sg.j jVar) {
        L0(false);
        J0(jVar);
    }

    public final r5 k0(Object obj, TLRPC.Document document) {
        float f7;
        for (int i10 = 0; i10 < document.attributes.size() && !(document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker); i10++) {
        }
        float f10 = 0.75f;
        MediaController.CropState cropState = this.f10816u0;
        if (cropState != null) {
            f7 = -(cropState.transformRotation + cropState.cropRotate);
            f10 = 0.75f / cropState.cropScale;
        } else {
            f7 = 0.0f;
        }
        d6 d6Var = new d6(c0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f32052a * 0.5d);
        r5 r5Var = new r5(this, context, d6Var.f10724a, d6Var.f10726c, d6Var.f10725b, new qw0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = r5Var.f48478x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        r5Var.setDelegate(this);
        this.G0.addView(r5Var);
        d0();
        return r5Var;
    }

    public final sg.x2 l0(boolean z10) {
        qw0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        sg.x2 x2Var = new sg.x2(getContext(), N0, (int) (paintingSize.f32052a / 9.0f), "", this.f10807p1, this.A0);
        float f7 = paintingSize.f32052a / 9.0f;
        v4 v4Var = new v4(this, 0);
        x2Var.f48566w0 = (int) (0.5f * f7);
        x2Var.f48567x0 = (int) (f7 * 2.0f);
        x2Var.f48568y0 = v4Var;
        float f10 = N0.x;
        y5 y5Var = this.G0;
        if (f10 == y5Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (N0.y == y5Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth(this.G1 - AndroidUtilities.dp(32.0f));
        int i10 = this.f10817u1;
        x2Var.setTypeface(rg.s0.e(i10).f47546j);
        x2Var.setType(rg.s0.e(i10).h);
        y5Var.addView(x2Var, gb1.g(-2.0f, -2));
        d0();
        MediaController.CropState cropState = this.f10816u0;
        if (cropState != null) {
            x2Var.j(1.0f / cropState.cropScale);
            x2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            y0(x2Var);
            x2Var.q();
            A0(x2Var, false);
            x2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(x2Var.getFocusedView());
            this.f10826z0 = true;
            int i11 = rg.s0.e(i10).f47544g;
            sg.q1 q1Var = this.f10779a1;
            q1Var.d(i11, true);
            q1Var.setOutlineType(rg.s0.e(i10).h);
        }
        return x2Var;
    }

    public final sg.y2 m0(pc pcVar) {
        int measuredWidth;
        int i10;
        this.a2 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        y5 y5Var = this.G0;
        if (y5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.G1;
        } else {
            measuredWidth = y5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        sg.y2 y2Var = new sg.y2(getContext(), N0, this.f10817u1, pcVar, f7 / 240.0f, dp);
        if (N0.x == y5Var.getMeasuredWidth() / 2.0f) {
            y2Var.setStickyX(2);
        }
        if (N0.y == y5Var.getMeasuredHeight() / 2.0f) {
            y2Var.setStickyY(2);
        }
        rg.q1 q1Var = this.f10807p1;
        if (q1Var != null && (i10 = q1Var.f47522a) != -47814) {
            y2Var.setColor(i10);
        }
        y2Var.setDelegate(this);
        y2Var.setMaxWidth(dp);
        y5Var.addView(y2Var, gb1.g(-2.0f, -2));
        d0();
        MediaController.CropState cropState = this.f10816u0;
        if (cropState != null) {
            y2Var.j(1.0f / cropState.cropScale);
            y2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return y2Var;
    }

    public final void n0() {
        int i10 = 0;
        while (true) {
            y5 y5Var = this.G0;
            if (i10 < y5Var.getChildCount()) {
                View childAt = y5Var.getChildAt(i10);
                if (childAt instanceof sg.d2) {
                    if (this.f10824y0 == childAt) {
                        A0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(ds.h).withEndAction(new l4(this, (sg.d2) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public abstract void o0();

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        fl0 fl0Var = this.O1;
        if (fl0Var != null) {
            AndroidUtilities.removeFromParent(fl0Var);
            this.O1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        float f10;
        this.f10818v0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.f10810r0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f7 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f7)) > currentActionBarHeight2) {
            Math.floor((f10 * f7) / currentActionBarHeight);
        }
        float f11 = this.f10820w0.f32052a;
        sg.j jVar = this.f10824y0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.I0, i10, i11);
        measureChild(this.S0, i10, i11);
        measureChild(this.K0, i10, i11);
        measureChild(this.J0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f10795i2 - this.B1.getPaddingUnderContainer(), Q()), 1073741824));
        FrameLayout frameLayout = this.H0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.f10818v0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f10789f2 && !this.f10793h2) {
            this.f10818v0 = true;
            t0();
            this.f10818v0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        t0();
    }

    public final sg.g1 p0() {
        int i10 = 0;
        while (true) {
            y5 y5Var = this.G0;
            if (i10 < y5Var.getChildCount()) {
                View childAt = y5Var.getChildAt(i10);
                if (childAt instanceof sg.g1) {
                    return (sg.g1) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final boolean q() {
        return !(this.f10824y0 instanceof sg.g1);
    }

    public final android.graphics.Bitmap q0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, fi.w7 r46) {
        throw new UnsupportedOperationException("Method not decompiled: fi.e6.q0(java.util.ArrayList, boolean, boolean, boolean, boolean, fi.w7):android.graphics.Bitmap");
    }

    @Override
    public final boolean r() {
        return !this.f10826z0;
    }

    public final boolean r0() {
        if (!this.f10812s0.a() && !this.a2) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f10818v0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(boolean z10) {
        if (this.f10789f2) {
            G0(0);
        }
        if (z10) {
            sz szVar = this.f10787e2;
            if (szVar != null && szVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f10787e2.getMeasuredHeight());
                ofFloat.addUpdateListener(new q4(this, 0));
                this.f10793h2 = true;
                ofFloat.addListener(new k5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22961w);
                ofFloat.start();
                return;
            }
            t0();
        }
    }

    public void setBlurManager(org.telegram.ui.Components.la laVar) {
        this.T1 = laVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f10781b2 != z10) {
            this.f10781b2 = z10;
            if (z10) {
                A0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            y5 y5Var = this.G0;
            if (i10 < y5Var.getChildCount()) {
                View childAt = y5Var.getChildAt(i10);
                if (childAt instanceof sg.q2) {
                    ImageReceiver imageReceiver = ((sg.q2) childAt).f48478x0;
                    xj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    imageReceiver.getAnimation();
                    if (lottieAnimation != null) {
                        lottieAnimation.N(Math.round(((((float) j10) % ((float) lottieAnimation.r())) / ((float) lottieAnimation.r())) * lottieAnimation.e[0]), true, false);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.N1) {
            this.N1 = z10;
            d0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.A1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.f10827z1 = runnable;
    }

    public final void t0() {
        sz szVar;
        if (!this.f10789f2 && (szVar = this.f10787e2) != null && szVar.getVisibility() != 8) {
            this.f10787e2.setVisibility(8);
        }
        int i10 = this.f10795i2;
        this.f10795i2 = 0;
        if (i10 != 0) {
            this.D1.a();
        }
    }

    @Override
    public final void u() {
        if (!this.f10791g2 && !this.f10789f2) {
            this.a2 = true;
            l0(true);
            return;
        }
        if (this.f10789f2) {
            sg.j jVar = this.f10824y0;
            if (jVar instanceof sg.x2) {
                this.D1.e = true;
                AndroidUtilities.showKeyboard(((sg.x2) jVar).getEditText());
            }
        }
        G0(!this.f10789f2 ? 1 : 0);
    }

    @Override
    public final void updateColors() {
        this.f10815t1.setColor(-15132391);
    }

    @Override
    public final void v(float f7, float f10, float[] fArr) {
        View view;
        View view2 = (View) this.D0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x9 = (f7 - view2.getX()) - view.getLeft();
        float y3 = (f10 - view2.getY()) - view.getTop();
        float pivotX = ((x9 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y3 - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    public final boolean v0() {
        if (this.R1) {
            if (this.O1.getReactionsWindow() != null && !this.O1.getReactionsWindow().f4060q) {
                this.O1.e();
                return true;
            }
            L0(false);
            return true;
        } else if (this.f10809q1) {
            F0(false);
            return true;
        } else if (this.f10789f2) {
            s0(true);
            return true;
        } else if (!this.f10826z0) {
            return false;
        } else {
            if (this.B0) {
                this.B0 = false;
                this.D1.b(true);
                return false;
            }
            A0(null, true);
            return true;
        }
    }

    @Override
    public final rg.s0 w() {
        return rg.s0.e(this.f10817u1);
    }

    public abstract void w0(boolean z10);

    public final void x0() {
        final int i10 = this.N0;
        O0(1);
        postDelayed(new ag.c(this, 15), 350L);
        n5 n5Var = new n5(this, getContext(), this.f10819v1, i10);
        this.Z1 = n5Var;
        rb rbVar = this.B1;
        Objects.requireNonNull(rbVar);
        n5Var.f11163x = new ai.e(rbVar, 20);
        final boolean[] zArr = {true};
        n5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                e6 e6Var = e6.this;
                e6Var.Z1 = null;
                if (zArr[0]) {
                    e6Var.w0(false);
                }
                e6Var.O0(i10);
            }
        });
        n5Var.E = new x4(this);
        n5Var.s0(new d5(this, zArr, n5Var, 0));
        n5Var.show();
        w0(true);
    }

    public final void y0(sg.j jVar) {
        this.f10812s0.b(jVar.getUUID(), new u4(this, jVar, 0));
    }

    @Override
    public final void z() {
        K0(new v4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void z0(sg.j jVar) {
        sg.j jVar2 = this.f10824y0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            A0(null, true);
            if (jVar instanceof sg.x2) {
                ValueAnimator valueAnimator = this.Q0;
                if (valueAnimator != null && this.O0 != 0) {
                    valueAnimator.cancel();
                }
                O0(0);
            }
        }
        this.G0.removeView(jVar);
        d0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            rg.t1 t1Var = this.f10812s0;
            t1Var.f47560b.remove(uuid);
            t1Var.f47561c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var, 12));
        }
        sg.y1 y1Var = this.S0;
        a4.l lVar = this.T0;
        y1Var.setValueOverride(lVar);
        y1Var.setShowPreview(true);
        float f7 = lVar.get();
        rg.q1 q1Var = this.f10807p1;
        q1Var.f47524c = f7;
        B0(q1Var, null, false);
        if (!this.f10783c2 && (jVar instanceof sg.d2)) {
            sb sbVar = ((ta) this).f11725p2;
            gb gbVar = sbVar.X0;
            if (gbVar != null) {
                gbVar.s(null, null, true);
            }
            ta taVar = sbVar.f11673v1;
            if (taVar != null) {
                taVar.n0();
            }
            ib ibVar = sbVar.f11614c1;
            if (ibVar != null) {
                ibVar.setHasRoundVideo(false);
            }
            w7 w7Var = sbVar.K1;
            if (w7Var != null) {
                File file = w7Var.f11918o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    sbVar.K1.f11918o0 = null;
                }
                if (sbVar.K1.f11920p0 != null) {
                    try {
                        new File(sbVar.K1.f11920p0).delete();
                    } catch (Exception unused2) {
                    }
                    sbVar.K1.f11920p0 = null;
                }
            }
        }
    }

    public void setOffsetTranslationX(float f7) {
    }

    public View getView() {
        return this;
    }
}
