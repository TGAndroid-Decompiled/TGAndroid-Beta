package nh;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;
public abstract class t5 extends iv0 implements bg.q2, bg.i, bg.l2, gv0, cb {
    public final DispatchQueue A0;
    public final Paint A1;
    public final MediaController.CropState B0;
    public final int B1;
    public boolean C0;
    public final h5 C1;
    public bv0 D0;
    public org.telegram.ui.ActionBar.o1 D1;
    public boolean E0;
    public s5 E1;
    public bg.k F0;
    public Rect F1;
    public boolean G0;
    public Runnable G1;
    public int H0;
    public Runnable H1;
    public boolean I0;
    public final fb I1;
    public final boolean J0;
    public AnimatorSet J1;
    public final j5 K0;
    public final z4 K1;
    public final l5 L0;
    public o7 L1;
    public final o5 M0;
    public ArrayList M1;
    public final n5 N0;
    public int N1;
    public final FrameLayout O0;
    public int O1;
    public final p5 P0;
    public ag.f0 P1;
    public final w4 Q0;
    public final boolean Q1;
    public final FrameLayout R0;
    public final File R1;
    public bg.l0 S0;
    public final boolean S1;
    public final View T0;
    public final boolean T1;
    public int U0;
    public boolean U1;
    public int V0;
    public fk0 V1;
    public float W0;
    public bg.e3 W1;
    public ValueAnimator X0;
    public float X1;
    public boolean Y0;
    public boolean Y1;
    public final bg.w2 Z0;
    public boolean Z1;
    public final ag.o1 f18623a1;
    public org.telegram.ui.Components.ga a2;
    public final int f18624b1;
    public final e6 f18625b2;
    public BigInteger f18626c1;
    public final f6 f18627c2;
    public TextView f18628d1;
    public boolean f18629d2;
    public TextView f18630e1;
    public ObjectAnimator f18631e2;
    public TextView f18632f1;
    public final float[] f18633f2;
    public final bg.r2 f18634g1;
    public c5 f18635g2;
    public final bg.n2 f18636h1;
    public boolean f18637h2;
    public final bg.t2 f18638i1;
    public boolean f18639i2;
    public final ImageView f18640j1;
    public boolean f18641j2;
    public final TextView f18642k1;
    public final int[] f18643k2;
    public final TextView l1;
    public fz f18644l2;
    public final TextView f18645m1;
    public boolean f18646m2;
    public final Paint f18647n1;
    public boolean f18648n2;
    public final Paint f18649o1;
    public boolean f18650o2;
    public float f18651p1;
    public int f18652p2;
    public boolean f18653q1;
    public boolean f18654q2;
    public o1.k f18655r1;
    public int f18656r2;
    public final x4 f18657s1;
    public int f18658s2;
    public final Paint f18659t1;
    public int f18660t2;
    public final Paint f18661u1;
    public boolean f18662u2;
    public final Paint f18663v1;
    public final bg.e2 f18664w0;
    public final ag.k2 f18665w1;
    public final bg.i2 f18666x0;
    public boolean f18667x1;
    public final Bitmap f18668y0;
    public o1.k f18669y1;
    public final ag.n2 f18670z0;
    public float f18671z1;

    public t5(Context context, boolean z10, File file, boolean z11, boolean z12, fb fbVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, o7 o7Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ga gaVar, org.telegram.ui.ActionBar.c6 c6Var, e6 e6Var, f6 f6Var) {
        super(context, activity);
        ag.k2 k2Var;
        org.telegram.ui.Components.ga gaVar2;
        this.U0 = 0;
        this.V0 = -1;
        final ja jaVar = (ja) this;
        ag.o1 o1Var = new ag.o1(jaVar, 27);
        this.f18623a1 = o1Var;
        Paint paint = new Paint(1);
        this.f18647n1 = paint;
        Paint paint2 = new Paint(1);
        this.f18649o1 = paint2;
        this.f18659t1 = new Paint(1);
        this.f18661u1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f18663v1 = paint3;
        ag.k2 k2Var2 = new ag.k2(1.0f, 0.016773745f, -1);
        this.f18665w1 = k2Var2;
        this.A1 = new Paint(1);
        this.f18633f2 = new float[2];
        this.f18639i2 = false;
        this.f18643k2 = new int[2];
        new lh.m7(jaVar, 5);
        setDelegate(this);
        this.a2 = gaVar;
        this.f18625b2 = e6Var;
        this.Q1 = z10;
        this.R1 = file;
        this.S1 = z11;
        this.T1 = z12;
        this.I1 = fbVar;
        this.N1 = i12;
        this.O1 = i13;
        this.f18627c2 = f6Var;
        this.B1 = i10;
        h5 h5Var = new h5(c6Var);
        this.C1 = h5Var;
        this.B0 = cropState;
        this.J0 = context instanceof BubbleActivity;
        ag.h1 e10 = ag.h1.e(i10);
        e10.i(0, true);
        k2Var2.f571a = e10.c();
        k2Var2.f573c = e10.f521i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.A0 = dispatchQueue;
        this.f18668y0 = bitmap;
        this.f18624b1 = i11;
        ag.n2 n2Var = new ag.n2();
        this.f18670z0 = n2Var;
        n2Var.f617a = new l4.s0(jaVar, 16);
        View view = new View(context);
        this.T0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        ag.f1 f1Var = new ag.f1(getPaintingSize(), null, i11, gaVar);
        if (o7Var == null || !o7Var.f18296u) {
            k2Var = k2Var2;
            gaVar2 = gaVar;
        } else {
            k2Var = k2Var2;
            gaVar2 = null;
        }
        j5 j5Var = new j5(jaVar, context, f1Var, bitmap, bitmap2, gaVar2);
        this.K0 = j5Var;
        j5Var.setDelegate(new k5(jaVar));
        j5Var.setUndoStore(n2Var);
        j5Var.setQueue(dispatchQueue);
        j5Var.setVisibility(4);
        l5 l5Var = new l5(jaVar, context);
        this.L0 = l5Var;
        l5Var.setVisibility(4);
        n5 n5Var = new n5(jaVar, context, new m5(jaVar));
        this.N0 = n5Var;
        this.L1 = o7Var;
        this.M1 = arrayList;
        if (this.N1 > 0 && this.O1 > 0) {
            H0();
        }
        n5Var.setVisibility(4);
        this.M0 = new o5(jaVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, i7.f6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f18640j1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ja jaVar2 = jaVar;
                        j5 j5Var2 = jaVar2.K0;
                        if (j5Var2 != null && (j5Var2.getCurrentBrush() instanceof ag.l)) {
                            j5Var2.b();
                            jaVar2.f18634g1.setSelectedIndex(1);
                            jaVar2.q((ag.m) ag.m.f584a.get(0));
                            return;
                        }
                        jaVar2.f18670z0.c();
                        return;
                    case 1:
                        ja jaVar3 = jaVar;
                        j5 j5Var3 = jaVar3.K0;
                        ag.n2 n2Var2 = jaVar3.f18670z0;
                        if (n2Var2.a()) {
                            if (j5Var3 != null && (j5Var3.getCurrentBrush() instanceof ag.l)) {
                                j5Var3.b();
                                jaVar3.f18634g1.setSelectedIndex(1);
                                jaVar3.q((ag.m) ag.m.f584a.get(0));
                            }
                            if (j5Var3 != null) {
                                j5Var3.a();
                            }
                            n2Var2.f619c.clear();
                            n2Var2.f618b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            jaVar3.N0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ja jaVar4 = jaVar;
                        bg.k kVar = jaVar4.F0;
                        if (kVar instanceof bg.f4) {
                            AndroidUtilities.hideKeyboard(((bg.f4) kVar).getFocusedView());
                        }
                        if (jaVar4.f18646m2) {
                            jaVar4.v0(false);
                        }
                        jaVar4.C0(jaVar4.F0);
                        jaVar4.D0(null, true);
                        return;
                    case 3:
                        jaVar.D0(null, true);
                        return;
                    default:
                        ja jaVar5 = jaVar;
                        if (jaVar5.f18667x1) {
                            jaVar5.I0(false);
                            return;
                        } else if (jaVar5.f18646m2) {
                            jaVar5.v0(true);
                            return;
                        } else if (jaVar5.G0) {
                            jaVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = jaVar5.H1;
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
        frameLayout.addView(imageView, i7.f6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, i7.f6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, i7.f6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bg.n(9));
        frameLayout.addView(linearLayout, i7.f6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f18642k1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.f0(822083583, 7, -1));
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
                        ja jaVar2 = jaVar;
                        j5 j5Var2 = jaVar2.K0;
                        if (j5Var2 != null && (j5Var2.getCurrentBrush() instanceof ag.l)) {
                            j5Var2.b();
                            jaVar2.f18634g1.setSelectedIndex(1);
                            jaVar2.q((ag.m) ag.m.f584a.get(0));
                            return;
                        }
                        jaVar2.f18670z0.c();
                        return;
                    case 1:
                        ja jaVar3 = jaVar;
                        j5 j5Var3 = jaVar3.K0;
                        ag.n2 n2Var2 = jaVar3.f18670z0;
                        if (n2Var2.a()) {
                            if (j5Var3 != null && (j5Var3.getCurrentBrush() instanceof ag.l)) {
                                j5Var3.b();
                                jaVar3.f18634g1.setSelectedIndex(1);
                                jaVar3.q((ag.m) ag.m.f584a.get(0));
                            }
                            if (j5Var3 != null) {
                                j5Var3.a();
                            }
                            n2Var2.f619c.clear();
                            n2Var2.f618b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            jaVar3.N0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ja jaVar4 = jaVar;
                        bg.k kVar = jaVar4.F0;
                        if (kVar instanceof bg.f4) {
                            AndroidUtilities.hideKeyboard(((bg.f4) kVar).getFocusedView());
                        }
                        if (jaVar4.f18646m2) {
                            jaVar4.v0(false);
                        }
                        jaVar4.C0(jaVar4.F0);
                        jaVar4.D0(null, true);
                        return;
                    case 3:
                        jaVar.D0(null, true);
                        return;
                    default:
                        ja jaVar5 = jaVar;
                        if (jaVar5.f18667x1) {
                            jaVar5.I0(false);
                            return;
                        } else if (jaVar5.f18646m2) {
                            jaVar5.v0(true);
                            return;
                        } else if (jaVar5.G0) {
                            jaVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = jaVar5.H1;
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
        TextView h = th.h(frameLayout, textView2, i7.f6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.l1 = h;
        h.setBackground(org.telegram.ui.ActionBar.g6.f0(822083583, 7, -1));
        h.setPadding(org.telegram.ui.b.e(8.0f, R.string.Clear, h), 0, AndroidUtilities.dp(8.0f), 0);
        h.setGravity(16);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 16.0f);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ja jaVar2 = jaVar;
                        j5 j5Var2 = jaVar2.K0;
                        if (j5Var2 != null && (j5Var2.getCurrentBrush() instanceof ag.l)) {
                            j5Var2.b();
                            jaVar2.f18634g1.setSelectedIndex(1);
                            jaVar2.q((ag.m) ag.m.f584a.get(0));
                            return;
                        }
                        jaVar2.f18670z0.c();
                        return;
                    case 1:
                        ja jaVar3 = jaVar;
                        j5 j5Var3 = jaVar3.K0;
                        ag.n2 n2Var2 = jaVar3.f18670z0;
                        if (n2Var2.a()) {
                            if (j5Var3 != null && (j5Var3.getCurrentBrush() instanceof ag.l)) {
                                j5Var3.b();
                                jaVar3.f18634g1.setSelectedIndex(1);
                                jaVar3.q((ag.m) ag.m.f584a.get(0));
                            }
                            if (j5Var3 != null) {
                                j5Var3.a();
                            }
                            n2Var2.f619c.clear();
                            n2Var2.f618b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            jaVar3.N0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ja jaVar4 = jaVar;
                        bg.k kVar = jaVar4.F0;
                        if (kVar instanceof bg.f4) {
                            AndroidUtilities.hideKeyboard(((bg.f4) kVar).getFocusedView());
                        }
                        if (jaVar4.f18646m2) {
                            jaVar4.v0(false);
                        }
                        jaVar4.C0(jaVar4.F0);
                        jaVar4.D0(null, true);
                        return;
                    case 3:
                        jaVar.D0(null, true);
                        return;
                    default:
                        ja jaVar5 = jaVar;
                        if (jaVar5.f18667x1) {
                            jaVar5.I0(false);
                            return;
                        } else if (jaVar5.f18646m2) {
                            jaVar5.v0(true);
                            return;
                        } else if (jaVar5.G0) {
                            jaVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = jaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        h.setAlpha(0.0f);
        h.setVisibility(8);
        TextView h10 = th.h(frameLayout, h, i7.f6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f18645m1 = h10;
        h10.setBackground(org.telegram.ui.ActionBar.g6.f0(822083583, 7, -1));
        h10.setPadding(org.telegram.ui.b.e(8.0f, R.string.Done, h10), 0, AndroidUtilities.dp(8.0f), 0);
        h10.setGravity(16);
        h10.setTextColor(-1);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setTextSize(1, 16.0f);
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ja jaVar2 = jaVar;
                        j5 j5Var2 = jaVar2.K0;
                        if (j5Var2 != null && (j5Var2.getCurrentBrush() instanceof ag.l)) {
                            j5Var2.b();
                            jaVar2.f18634g1.setSelectedIndex(1);
                            jaVar2.q((ag.m) ag.m.f584a.get(0));
                            return;
                        }
                        jaVar2.f18670z0.c();
                        return;
                    case 1:
                        ja jaVar3 = jaVar;
                        j5 j5Var3 = jaVar3.K0;
                        ag.n2 n2Var2 = jaVar3.f18670z0;
                        if (n2Var2.a()) {
                            if (j5Var3 != null && (j5Var3.getCurrentBrush() instanceof ag.l)) {
                                j5Var3.b();
                                jaVar3.f18634g1.setSelectedIndex(1);
                                jaVar3.q((ag.m) ag.m.f584a.get(0));
                            }
                            if (j5Var3 != null) {
                                j5Var3.a();
                            }
                            n2Var2.f619c.clear();
                            n2Var2.f618b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            jaVar3.N0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ja jaVar4 = jaVar;
                        bg.k kVar = jaVar4.F0;
                        if (kVar instanceof bg.f4) {
                            AndroidUtilities.hideKeyboard(((bg.f4) kVar).getFocusedView());
                        }
                        if (jaVar4.f18646m2) {
                            jaVar4.v0(false);
                        }
                        jaVar4.C0(jaVar4.F0);
                        jaVar4.D0(null, true);
                        return;
                    case 3:
                        jaVar.D0(null, true);
                        return;
                    default:
                        ja jaVar5 = jaVar;
                        if (jaVar5.f18667x1) {
                            jaVar5.I0(false);
                            return;
                        } else if (jaVar5.f18646m2) {
                            jaVar5.v0(true);
                            return;
                        } else if (jaVar5.G0) {
                            jaVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = jaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        h10.setAlpha(0.0f);
        h10.setVisibility(8);
        frameLayout.addView(h10, i7.f6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        p5 p5Var = new p5(jaVar, context, e10);
        this.P0 = p5Var;
        p5Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        p5Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(p5Var, i7.f6.e(-1, 104, 80));
        bg.r2 r2Var = new bg.r2(context, (o7Var == null || o7Var.v() || o7Var.f18296u || gaVar == null) ? false : true);
        this.f18634g1 = r2Var;
        r2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r2Var.setDelegate(this);
        r2Var.setSelectedIndex(1);
        p5Var.addView(r2Var, i7.f6.c(48.0f, -1));
        bg.n2 n2Var2 = new bg.n2(context);
        this.f18636h1 = n2Var2;
        n2Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n2Var2.setVisibility(8);
        n2Var2.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ja jaVar2 = jaVar;
                        ag.k2 k2Var3 = jaVar2.f18665w1;
                        jaVar2.F0(k2Var3);
                        ag.h1.e(i10).j(k2Var3.f573c);
                        return;
                    default:
                        jaVar.f18636h1.setTypeface(ag.h1.e(i10).f522j);
                        return;
                }
            }
        });
        n2Var2.setAlignment(ag.h1.e(i10).f520g);
        p5Var.addView(n2Var2, i7.f6.c(48.0f, -1));
        w4 w4Var = new w4(jaVar, context);
        this.Q0 = w4Var;
        addView(w4Var, i7.f6.c(-1.0f, -1));
        bg.t2 t2Var = new bg.t2(context);
        this.f18638i1 = t2Var;
        t2Var.setVisibility(8);
        t2Var.setOnItemClickListener(new bg.o(jaVar, 16));
        n2Var2.setTypefaceListView(t2Var);
        w4Var.addView(t2Var, i7.f6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(h5Var.C0(org.telegram.ui.ActionBar.g6.G8));
        x4 x4Var = new x4(jaVar, context);
        this.f18657s1 = x4Var;
        x4Var.setVisibility(8);
        x4Var.setColorPalette(ag.h1.e(i10));
        x4Var.setColorListener(new ag.p(jaVar, 3));
        p5Var.addView(x4Var, i7.f6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        bg.e2 e2Var = new bg.e2(context);
        this.f18664w0 = e2Var;
        e2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        e2Var.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        p5Var.addView(e2Var, i7.f6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        e2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ja jaVar2 = jaVar;
                        j5 j5Var2 = jaVar2.K0;
                        if (j5Var2 != null && (j5Var2.getCurrentBrush() instanceof ag.l)) {
                            j5Var2.b();
                            jaVar2.f18634g1.setSelectedIndex(1);
                            jaVar2.q((ag.m) ag.m.f584a.get(0));
                            return;
                        }
                        jaVar2.f18670z0.c();
                        return;
                    case 1:
                        ja jaVar3 = jaVar;
                        j5 j5Var3 = jaVar3.K0;
                        ag.n2 n2Var22 = jaVar3.f18670z0;
                        if (n2Var22.a()) {
                            if (j5Var3 != null && (j5Var3.getCurrentBrush() instanceof ag.l)) {
                                j5Var3.b();
                                jaVar3.f18634g1.setSelectedIndex(1);
                                jaVar3.q((ag.m) ag.m.f584a.get(0));
                            }
                            if (j5Var3 != null) {
                                j5Var3.a();
                            }
                            n2Var22.f619c.clear();
                            n2Var22.f618b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var22, 4));
                            jaVar3.N0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ja jaVar4 = jaVar;
                        bg.k kVar = jaVar4.F0;
                        if (kVar instanceof bg.f4) {
                            AndroidUtilities.hideKeyboard(((bg.f4) kVar).getFocusedView());
                        }
                        if (jaVar4.f18646m2) {
                            jaVar4.v0(false);
                        }
                        jaVar4.C0(jaVar4.F0);
                        jaVar4.D0(null, true);
                        return;
                    case 3:
                        jaVar.D0(null, true);
                        return;
                    default:
                        ja jaVar5 = jaVar;
                        if (jaVar5.f18667x1) {
                            jaVar5.I0(false);
                            return;
                        } else if (jaVar5.f18646m2) {
                            jaVar5.v0(true);
                            return;
                        } else if (jaVar5.G0) {
                            jaVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = jaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        bg.i2 i2Var = new bg.i2(context);
        this.f18666x0 = i2Var;
        i2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        i2Var.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        i2Var.setOnClickListener(new bg.q(jaVar, context, e10, 16));
        p5Var.addView(i2Var, i7.f6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        bg.w2 w2Var = new bg.w2(context);
        this.Z0 = w2Var;
        ag.k2 k2Var3 = k2Var;
        w2Var.setColorSwatch(k2Var3);
        w2Var.setRenderView(j5Var);
        w2Var.setValueOverride(o1Var);
        k2Var3.f573c = o1Var.get();
        w2Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ja jaVar2 = jaVar;
                        ag.k2 k2Var32 = jaVar2.f18665w1;
                        jaVar2.F0(k2Var32);
                        ag.h1.e(i10).j(k2Var32.f573c);
                        return;
                    default:
                        jaVar.f18636h1.setTypeface(ag.h1.e(i10).f522j);
                        return;
                }
            }
        });
        addView(w2Var, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R0 = frameLayout2;
        addView(frameLayout2, i7.f6.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(k2Var3, null, false);
        q((ag.m) ag.m.f584a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
        this.K1 = new z4(jaVar, fbVar, new ih.b1(10, jaVar, fbVar));
        k2.C = 1;
    }

    public static void G0(bg.f4 f4Var, int i10) {
        int i11;
        f4Var.setAlign(i10);
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
        f4Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        f4Var.getEditText().setTextAlignment(i12);
    }

    public static void Z(ja jaVar, ag.h1 h1Var, Integer num) {
        h1Var.h(num.intValue(), true);
        h1Var.g();
        jaVar.setNewColor(num.intValue());
        jaVar.f18657s1.setSelectedColorIndex(h1Var.d());
        jaVar.P1 = null;
    }

    public static void a0(ja jaVar, Integer num) {
        jaVar.setNewColor(num.intValue());
        jaVar.I0(false);
    }

    public ViewGroup getBarView() {
        if (this.U0 == 2) {
            return this.f18636h1;
        }
        return this.f18634g1;
    }

    private int getFrameRotation() {
        int i10 = this.f18624b1;
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

    private bv0 getPaintingSize() {
        bv0 bv0Var = this.D0;
        if (bv0Var != null) {
            return bv0Var;
        }
        bv0 bv0Var2 = new bv0(1080.0f, 1920.0f);
        this.D0 = bv0Var2;
        return bv0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            n5 n5Var = this.N0;
            if (i10 < n5Var.getChildCount()) {
                View childAt = n5Var.getChildAt(i10);
                if (childAt instanceof bg.v3) {
                    ImageReceiver imageReceiver = ((bg.v3) childAt).f2583t0;
                    xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    org.telegram.ui.Components.c6 animation = imageReceiver.getAnimation();
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
                        animation.f27346y = z10;
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
        ag.k2 k2Var = this.f18665w1;
        int i11 = k2Var.f571a;
        k2Var.f571a = i10;
        E0(k2Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new bg.h0(this, i11, i10, 1));
        duration.start();
    }

    private void setTextType(int i10) {
        this.H0 = i10;
        bg.k kVar = this.F0;
        if (kVar instanceof bg.f4) {
            ((bg.f4) kVar).setType(i10);
        }
        ag.h1 e10 = ag.h1.e(this.B1);
        e10.h = i10;
        e10.f515a.edit().putInt("text_type", i10).apply();
        this.f18636h1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        bg.l0 l0Var = new bg.l0(this, context);
        this.S0 = l0Var;
        l0Var.setClipToPadding(false);
        this.S0.setOrientation(0);
        this.P0.addView(this.S0, i7.f6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f18628d1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f18628d1;
        int i10 = org.telegram.ui.ActionBar.g6.f23152i6;
        h5 h5Var = this.C1;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i10, h5Var), 7, -1));
        this.f18628d1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f18628d1.setTextColor(-1);
        this.f18628d1.setTextSize(1, 14.0f);
        this.f18628d1.setGravity(1);
        this.f18628d1.setTypeface(AndroidUtilities.bold());
        this.f18628d1.setSingleLine();
        this.f18628d1.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f17883b;

            {
                this.f17883b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var = this.f17883b;
                        if (t5Var.G0) {
                            t5Var.D0(null, true);
                            return;
                        } else {
                            t5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f17883b.A0();
                        return;
                    default:
                        t5 t5Var2 = this.f17883b;
                        t5Var2.R0(2);
                        if (!(t5Var2.F0 instanceof bg.f4)) {
                            t5Var2.f18637h2 = true;
                            t5Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.S0.addView(this.f18628d1, i7.f6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f18630e1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f18630e1.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i10, h5Var), 7, -1));
        this.f18630e1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f18630e1.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f17883b;

            {
                this.f17883b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var = this.f17883b;
                        if (t5Var.G0) {
                            t5Var.D0(null, true);
                            return;
                        } else {
                            t5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f17883b.A0();
                        return;
                    default:
                        t5 t5Var2 = this.f17883b;
                        t5Var2.R0(2);
                        if (!(t5Var2.F0 instanceof bg.f4)) {
                            t5Var2.f18637h2 = true;
                            t5Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f18630e1.setTextColor(-1);
        this.f18630e1.setTextSize(1, 14.0f);
        this.f18630e1.setGravity(1);
        this.f18630e1.setTypeface(AndroidUtilities.bold());
        this.f18630e1.setAlpha(0.6f);
        this.f18630e1.setSingleLine();
        this.S0.addView(this.f18630e1, i7.f6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f18632f1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f18632f1.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i10, h5Var), 7, -1));
        this.f18632f1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f18632f1.setTextColor(-1);
        this.f18632f1.setTextSize(1, 14.0f);
        this.f18632f1.setGravity(1);
        this.f18632f1.setTypeface(AndroidUtilities.bold());
        this.f18632f1.setAlpha(0.6f);
        this.f18632f1.setSingleLine();
        this.f18632f1.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f17883b;

            {
                this.f17883b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var = this.f17883b;
                        if (t5Var.G0) {
                            t5Var.D0(null, true);
                            return;
                        } else {
                            t5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f17883b.A0();
                        return;
                    default:
                        t5 t5Var2 = this.f17883b;
                        t5Var2.R0(2);
                        if (!(t5Var2.F0 instanceof bg.f4)) {
                            t5Var2.f18637h2 = true;
                            t5Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.S0.addView(this.f18632f1, i7.f6.l(1.0f, 0, -2));
    }

    public static boolean x0(TLRPC.Document document) {
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

    @Override
    public final void A() {
        N0(new p4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0() {
        final int i10 = this.U0;
        R0(1);
        postDelayed(new ag.o0(this, 21), 350L);
        c5 c5Var = new c5(this, getContext(), this.C1, i10);
        this.f18635g2 = c5Var;
        fb fbVar = this.I1;
        Objects.requireNonNull(fbVar);
        c5Var.f17997w = new t4(fbVar, 0);
        final boolean[] zArr = {true};
        c5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                t5 t5Var = t5.this;
                t5Var.f18635g2 = null;
                if (zArr[0]) {
                    t5Var.z0(false);
                }
                t5Var.R0(i10);
            }
        });
        c5Var.f17999y = new q4(this);
        c5Var.q0(new v4(this, zArr, c5Var, 0));
        c5Var.show();
        z0(true);
    }

    public final void B0(bg.k kVar) {
        this.f18670z0.b(kVar.getUUID(), new o4(this, kVar, 0));
    }

    public final void C0(bg.k kVar) {
        bg.k kVar2 = this.F0;
        if (kVar == kVar2 && kVar2 != null) {
            kVar2.l(kVar2.f2356i0, false);
            D0(null, true);
            if (kVar instanceof bg.f4) {
                ValueAnimator valueAnimator = this.X0;
                if (valueAnimator != null && this.V0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.N0.removeView(kVar);
        g0();
        if (kVar != null) {
            UUID uuid = kVar.getUUID();
            ag.n2 n2Var = this.f18670z0;
            n2Var.f618b.remove(uuid);
            n2Var.f619c.remove(uuid);
            AndroidUtilities.runOnUIThread(new a4.g(n2Var, 4));
        }
        bg.w2 w2Var = this.Z0;
        ag.o1 o1Var = this.f18623a1;
        w2Var.setValueOverride(o1Var);
        w2Var.setShowPreview(true);
        float f9 = o1Var.get();
        ag.k2 k2Var = this.f18665w1;
        k2Var.f573c = f9;
        E0(k2Var, null, false);
        if (!this.f18641j2 && (kVar instanceof bg.f3)) {
            gb gbVar = ((ja) this).f17975w2;
            va vaVar = gbVar.T0;
            if (vaVar != null) {
                vaVar.s(null, null, true);
            }
            ja jaVar = gbVar.f17792r1;
            if (jaVar != null) {
                jaVar.q0();
            }
            wa waVar = gbVar.Y0;
            if (waVar != null) {
                waVar.setHasRoundVideo(false);
            }
            o7 o7Var = gbVar.G1;
            if (o7Var != null) {
                File file = o7Var.f18285o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    gbVar.G1.f18285o0 = null;
                }
                if (gbVar.G1.f18287p0 != null) {
                    try {
                        new File(gbVar.G1.f18287p0).delete();
                    } catch (Exception unused2) {
                    }
                    gbVar.G1.f18287p0 = null;
                }
            }
        }
    }

    @Override
    public final void D() {
        P0(true);
    }

    public final boolean D0(bg.k kVar, boolean z10) {
        boolean z11;
        qb qbVar;
        qb qbVar2;
        fk0 fk0Var;
        int i10;
        boolean z12 = kVar instanceof bg.f4;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.V0) == -1 && this.U0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.X0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.f18667x1) {
                I0(false);
            }
            R0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            bg.f4 f4Var = (bg.f4) kVar;
            int gravity = f4Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            bg.n2 n2Var = this.f18636h1;
            n2Var.setAlignment(i11);
            ag.u0 typeface = f4Var.getTypeface();
            if (typeface != null) {
                n2Var.setTypeface(typeface.f674a);
            }
            n2Var.e(f4Var.getType(), true);
            this.Q0.invalidate();
        }
        bg.k kVar2 = this.F0;
        if (kVar2 != null) {
            if (kVar2 == kVar) {
                if (!kVar.W) {
                    if (kVar instanceof bg.o1) {
                        bg.o1 o1Var = (bg.o1) kVar;
                        o1Var.setType((o1Var.getType() + 1) % o1Var.getTypesCount());
                        return true;
                    } else if (kVar instanceof bg.g4) {
                        bg.g4 g4Var = (bg.g4) kVar;
                        g4Var.setType((g4Var.getType() + 1) % g4Var.getTypesCount());
                        return true;
                    } else if (kVar instanceof bg.k1) {
                        bg.k1 k1Var = (bg.k1) kVar;
                        bg.i1 i1Var = k1Var.m0;
                        if (i1Var.e()) {
                            if (i1Var.getPreviewType() == 0) {
                                i12 = 1;
                            }
                            i1Var.setPreviewType(i12);
                            return true;
                        }
                        k1Var.setType(k1Var.getNextType());
                        return true;
                    } else if (!this.G0) {
                        if (kVar instanceof bg.f4) {
                            this.I0 = true;
                            r0();
                            return true;
                        } else if (kVar instanceof bg.e3) {
                            bg.e3 e3Var = (bg.e3) kVar;
                            if (this.Y1 && this.W1 == kVar) {
                                e3Var.q(true);
                                return true;
                            }
                            bg.e3 e3Var2 = this.W1;
                            if (e3Var2 != null && e3Var2 != e3Var && (fk0Var = this.V1) != null) {
                                fk0Var.animate().alpha(0.0f).setListener(new a5(fk0Var, 0));
                                this.V1 = null;
                                this.Y1 = false;
                                this.X1 = 0.0f;
                            }
                            if (this.V1 == null) {
                                fk0 fk0Var2 = new fk0(2, this.B1, getContext(), LaunchActivity.R(), new lh.l2(6, new lh.b()));
                                this.V1 = fk0Var2;
                                org.telegram.ui.Components.ka kaVar = new org.telegram.ui.Components.ka(this.a2, fk0Var2, 0, false);
                                this.V1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.I1.addView(this.V1, i7.f6.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                fk0 fk0Var3 = this.V1;
                                ?? obj = new Object();
                                obj.f214e = this;
                                obj.f213c = kaVar;
                                obj.d = paint;
                                obj.f212b = new Path();
                                fk0Var3.setDelegate(obj);
                                this.V1.p(null, null, true);
                            }
                            this.V1.setFragment(LaunchActivity.R());
                            this.W1 = e3Var;
                            O0(true);
                            return true;
                        } else {
                            M0(kVar2);
                            return true;
                        }
                    } else if (kVar2 instanceof bg.f4) {
                        AndroidUtilities.showKeyboard(((bg.f4) kVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            kVar2.l(kVar2.f2356i0, false);
            bg.k kVar3 = this.F0;
            if (kVar3 instanceof bg.f4) {
                bg.f4 f4Var2 = (bg.f4) kVar3;
                bg.d4 d4Var = f4Var2.m0;
                d4Var.clearFocus();
                d4Var.setEnabled(false);
                d4Var.setClickable(false);
                f4Var2.m();
                if (!z12) {
                    this.G0 = false;
                    AndroidUtilities.hideKeyboard(((bg.f4) this.F0).getFocusedView());
                    v0(false);
                }
            } else if ((kVar3 instanceof bg.f3) && (qbVar2 = ((ja) this).f17975w2.V0) != null) {
                qbVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        bg.k kVar4 = this.F0;
        this.F0 = kVar;
        if ((kVar4 instanceof bg.f4) && TextUtils.isEmpty(((bg.f4) kVar4).getText())) {
            C0(kVar4);
        }
        bg.k kVar5 = this.F0;
        if (kVar4 != kVar5 && (kVar5 instanceof bg.f3) && (qbVar = ((ja) this).f17975w2.V0) != null) {
            qbVar.l(true);
        }
        bg.k kVar6 = this.F0;
        ag.o1 o1Var2 = this.f18623a1;
        ag.k2 k2Var = this.f18665w1;
        bg.w2 w2Var = this.Z0;
        if (kVar6 != null) {
            o5 o5Var = this.M0;
            kVar6.f2356i0 = o5Var;
            kVar6.l(o5Var, true);
            bg.k kVar7 = this.F0;
            if (kVar7 instanceof bg.f4) {
                bg.f4 f4Var3 = (bg.f4) kVar7;
                f4Var3.getSwatch().f573c = k2Var.f573c;
                f4Var3.f2218v0 = false;
                F0(f4Var3.getSwatch());
                w2Var.setValueOverride(new bg.k0(f4Var3, (int) (this.D0.f27238a / 9.0f), 1));
                w2Var.setShowPreview(false);
            } else {
                w2Var.setValueOverride(o1Var2);
                w2Var.setShowPreview(true);
                k2Var.f573c = o1Var2.get();
                E0(k2Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.X0;
            if (valueAnimator2 != null && this.V0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.f18667x1) {
                I0(false);
            }
            R0(0);
            w2Var.setValueOverride(o1Var2);
            w2Var.setShowPreview(true);
            k2Var.f573c = o1Var2.get();
            E0(k2Var, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(ag.k2 k2Var, Integer num, boolean z10) {
        ag.k2 k2Var2 = this.f18665w1;
        if (k2Var2 != k2Var) {
            k2Var2.f571a = k2Var.f571a;
            k2Var2.f572b = k2Var.f572b;
            k2Var2.f573c = k2Var.f573c;
            int i10 = this.B1;
            ag.h1.e(i10).h(k2Var.f571a, true);
            ag.h1.e(i10).j(k2Var.f573c);
        }
        int i11 = k2Var.f571a;
        j5 j5Var = this.K0;
        j5Var.setColor(i11);
        j5Var.setBrushSize(k2Var.f573c);
        int i12 = k2Var2.f571a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new bg.u(this, num, i12, 1));
            duration.start();
        } else {
            p5 p5Var = this.P0;
            if (p5Var != null) {
                p5Var.invalidate();
            }
        }
        bg.k kVar = this.F0;
        if (kVar instanceof bg.f4) {
            ((bg.f4) kVar).setSwatch(new ag.k2(k2Var.f572b, k2Var.f573c, k2Var.f571a));
        } else if (z10 && (kVar instanceof bg.o1)) {
            ((bg.o1) kVar).setColor(k2Var.f571a);
            ((bg.o1) this.F0).setType(3);
        } else if (z10 && (kVar instanceof bg.g4)) {
            ((bg.g4) kVar).setColor(k2Var.f571a);
            ((bg.g4) this.F0).setType(3);
        } else if (z10 && (kVar instanceof bg.k1)) {
            ((bg.k1) kVar).setColor(k2Var.f571a);
            ((bg.k1) this.F0).setType(0);
        }
    }

    public final void F0(ag.k2 k2Var) {
        E0(k2Var, null, false);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f18648n2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f18658s2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f18658s2).commit();
            } else {
                this.f18656r2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f18656r2).commit();
            }
        }
        boolean z13 = this.f18646m2;
        z4 z4Var = this.K1;
        if (z13) {
            if (z10) {
                i11 = this.f18658s2;
            } else {
                i11 = this.f18656r2;
            }
            int paddingUnderContainer = this.I1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f18644l2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f18644l2.setLayoutParams(layoutParams);
                this.f18652p2 = layoutParams.height;
                z4Var.a();
                requestLayout();
            }
        }
        if (this.f18660t2 == i10 && this.f18662u2 == z10) {
            return;
        }
        this.f18660t2 = i10;
        this.f18662u2 = z10;
        boolean z14 = this.f18648n2;
        bg.k kVar = this.F0;
        if (kVar instanceof bg.f4) {
            if (((bg.f4) kVar).getEditText().isFocused() && z4Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f18648n2 = z12;
        } else {
            this.f18648n2 = false;
        }
        if (this.f18648n2 && this.f18646m2) {
            J0(0);
        }
        if (this.f18652p2 != 0 && !(z11 = this.f18648n2) && z11 != z14 && !this.f18646m2) {
            this.f18652p2 = 0;
            z4Var.a();
            requestLayout();
        }
        U0();
        if (z14 && !this.f18648n2 && this.f18652p2 > 0 && this.f18654q2) {
            this.f18654q2 = false;
        }
        S0();
    }

    public final void H0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        bg.k kVar;
        ArrayList arrayList = this.M1;
        if (arrayList != null) {
            o7 o7Var = this.L1;
            this.L1 = null;
            this.M1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                n5 n5Var = this.N0;
                if (i11 < size) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        g5 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            n02.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = n02.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i10 = i11;
                        kVar = n02;
                    } else if (b10 == 1) {
                        bg.f4 o02 = o0(z10);
                        o02.setType(mediaEntity.subType);
                        o02.setTypeface(mediaEntity.textTypeface);
                        o02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i12);
                            i12++;
                            VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                            org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(emojiEntity2.document_id, 1.0f, o02.getFontMetricsInt());
                            int i13 = emojiEntity2.offset;
                            spannableString.setSpan(y5Var, i13, emojiEntity2.length + i13, 33);
                            i11 = i11;
                        }
                        i10 = i11;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, o02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        o02.setText(replaceEmoji);
                        G0(o02, mediaEntity.textAlign);
                        ag.k2 swatch = o02.getSwatch();
                        swatch.f571a = mediaEntity.color;
                        o02.setSwatch(swatch);
                        kVar = o02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            bg.y2 k02 = k0(mediaEntity.text, false);
                            k02.C0 = mediaEntity.crop;
                            k02.f2627x0 = false;
                            if ((2 & mediaEntity.subType) != 0) {
                                k02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                k02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = k02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            kVar = k02;
                        } else if (b10 == 6) {
                            ArrayList arrayList3 = o7Var.v;
                            boolean z11 = o7Var.K;
                            this.f18637h2 = true;
                            bg.k f5Var = new f5(this, getContext(), e0(), arrayList3, this.a2, z11, this.f18625b2);
                            f5Var.setDelegate(this);
                            n5Var.addView(f5Var);
                            g0();
                            kVar = f5Var;
                            if (mediaEntity.viewWidth > 0) {
                                kVar = f5Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = f5Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    kVar = f5Var;
                                }
                            }
                        } else if (b10 == 3) {
                            bg.o1 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                j02.setColor(i14);
                            }
                            j02.setType(mediaEntity.subType);
                            kVar = j02;
                        } else if (b10 == 8) {
                            dc dcVar = mediaEntity.weather;
                            if (dcVar != null) {
                                bg.g4 p02 = p0(dcVar);
                                int i15 = mediaEntity.color;
                                if (i15 != 0) {
                                    p02.setColor(i15);
                                }
                                p02.setType(mediaEntity.subType);
                                kVar = p02;
                            } else {
                                i11 = i10 + 1;
                                z10 = false;
                            }
                        } else if (b10 == 7) {
                            bg.k1 i02 = i0(mediaEntity.linkSettings);
                            bg.i1 i1Var = i02.m0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                i02.setColor(i16);
                            }
                            boolean e10 = i1Var.e();
                            int i17 = i1Var.h;
                            int i18 = i1Var.f2304f;
                            if (e10) {
                                i1Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                i02.setType(3);
                                i1Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(i1Var.T)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(i1Var.U)) + i17 + i17;
                                PointF position = i02.getPosition();
                                position.y = (this.O1 * 0.3f) + position.y;
                                i02.setPosition(position);
                                i11 = i10 + 1;
                                z10 = false;
                            } else {
                                i02.setType(b11);
                                kVar = i02;
                            }
                        } else if (b10 == 4) {
                            bg.e3 l02 = l0(false);
                            l02.s(kg.q0.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                l02.r(false);
                            }
                            kVar = l02;
                            if (mediaEntity.mediaArea.dark) {
                                l02.q(false);
                                kVar = l02;
                            }
                        } else {
                            if (b10 == 5 && o7Var.f18285o0 != null) {
                                bg.f3 m0 = m0(o7Var.f18287p0, false);
                                gb gbVar = ((ja) this).f17975w2;
                                va vaVar = gbVar.T0;
                                if (vaVar != null) {
                                    vaVar.f17673w = m0;
                                    x61 x61Var = vaVar.f17675x;
                                    if (x61Var != null) {
                                        x61Var.W(m0.f2201q0);
                                    }
                                }
                                wa waVar = gbVar.Y0;
                                if (waVar != null) {
                                    waVar.setHasRoundVideo(true);
                                }
                                kVar = m0;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !m0.f2198n0;
                                    m0.f2198n0 = z12;
                                    m0.f2199o0.f(z12, true);
                                    m0.invalidate();
                                    kVar = m0;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    kVar.setX((mediaEntity.f19644x * this.N1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    kVar.setY((mediaEntity.f19645y * this.O1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                    kVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + kVar.getX(), (mediaEntity.viewHeight / 2.0f) + kVar.getY()));
                    kVar.setScale(mediaEntity.scale);
                    kVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                    i11 = i10 + 1;
                    z10 = false;
                } else {
                    n5Var.setVisibility(0);
                    return;
                }
            }
        }
    }

    public final void I0(final boolean z10) {
        float f9;
        boolean z11;
        if (this.f18667x1 != z10) {
            this.f18667x1 = z10;
            o1.k kVar = this.f18669y1;
            if (kVar != null) {
                kVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new ib.a(f9));
            this.f18669y1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f19052i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f19045u = lVar;
            if (!this.K1.c() && this.f18652p2 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.P0.getTranslationY();
            final float alpha = this.f18666x0.getAlpha();
            final ViewGroup barView = getBarView();
            this.f18669y1.b(new o1.h() {
                @Override
                public final void a(o1.i iVar, float f11, float f12) {
                    float f13;
                    int i10;
                    t5 t5Var = t5.this;
                    p5 p5Var = t5Var.P0;
                    float f14 = f11 / 1000.0f;
                    t5Var.f18671z1 = f14;
                    float f15 = 1.0f;
                    float f16 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f16);
                    view.setScaleY(f16);
                    view.setTranslationY((Math.min(t5Var.f18671z1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(t5Var.f18671z1, 0.25f) / 0.25f));
                    x4 x4Var = t5Var.f18657s1;
                    float f17 = t5Var.f18671z1;
                    boolean z12 = z10;
                    x4Var.y1(f17, z12);
                    bg.i2 i2Var = t5Var.f18666x0;
                    i2Var.setProgress(t5Var.f18671z1);
                    bg.e2 e2Var = t5Var.f18664w0;
                    e2Var.setProgress(t5Var.f18671z1);
                    t5Var.S0.setTranslationY(AndroidUtilities.dp(32.0f) * t5Var.f18671z1);
                    AnimatorSet animatorSet = t5Var.J1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f18 = t5Var.f18671z1;
                        if (!z12) {
                            f18 = 1.0f - f18;
                        }
                        if (z12) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        float f19 = alpha;
                        i2Var.setAlpha(AndroidUtilities.lerp(f19, f13, f18));
                        if (!z12) {
                            f15 = 0.0f;
                        }
                        e2Var.setAlpha(AndroidUtilities.lerp(f19, f15, f18));
                        float dp = AndroidUtilities.dp(39.0f) * f18;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        p5Var.setTranslationY(translationY - (dp * i10));
                    }
                    p5Var.invalidate();
                    if (view == t5Var.f18636h1) {
                        t5Var.Q0.invalidate();
                    }
                }
            });
            this.f18669y1.a(new k4(this, z10, 0));
            this.f18669y1.f();
            if (z10) {
                x4 x4Var = this.f18657s1;
                x4Var.setVisibility(0);
                x4Var.setSelectedColorIndex(ag.h1.e(this.B1).d());
            }
        }
    }

    public final void J0(int i10) {
        boolean z10;
        int i11;
        bg.n2 n2Var = this.f18636h1;
        z4 z4Var = this.K1;
        if (i10 == 1) {
            fz fzVar = this.f18644l2;
            if (fzVar != null && fzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fz fzVar2 = this.f18644l2;
            fb fbVar = this.I1;
            if (fzVar2 != null && fzVar2.Y0 != UserConfig.selectedAccount) {
                fbVar.removeView(fzVar2);
                this.f18644l2 = null;
            }
            if (this.f18644l2 == null) {
                fz fzVar3 = new fz(null, true, false, false, getContext(), false, null, null, true, this.C1, false, false);
                this.f18644l2 = fzVar3;
                fzVar3.f28638t2 = false;
                fzVar3.Q0 = true;
                fzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f18644l2.setForseMultiwindowLayout(true);
                }
                this.f18644l2.setDelegate(new i5(this));
                fbVar.addView(this.f18644l2);
            }
            this.f18644l2.setVisibility(0);
            this.f18646m2 = true;
            fz fzVar4 = this.f18644l2;
            if (this.f18656r2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f18656r2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f18656r2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f18658s2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f18658s2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f18658s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f18658s2;
            } else {
                i11 = this.f18656r2;
            }
            int paddingUnderContainer = fbVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            fzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                bg.k kVar = this.F0;
                if (kVar instanceof bg.f4) {
                    AndroidUtilities.hideKeyboard(((bg.f4) kVar).getEditText());
                }
            }
            this.f18652p2 = paddingUnderContainer;
            z4Var.a();
            requestLayout();
            tg emojiButton = n2Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(rg.d, true);
            }
            if (!z10) {
                if (this.f18648n2) {
                    this.f18654q2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f18652p2, 0.0f);
                    ofFloat.addUpdateListener(new l4(this, 1));
                    ofFloat.addListener(new b5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                    ofFloat.start();
                }
            }
        } else {
            tg emojiButton2 = n2Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(rg.f32296e, true);
            }
            fz fzVar5 = this.f18644l2;
            if (fzVar5 != null) {
                this.f18646m2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    fzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f18652p2 = 0;
                z4Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(bg.k1 k1Var) {
        y7 y7Var = new y7(getContext(), this.C1, this.f18627c2, new ih.b1(12, this, k1Var));
        if (k1Var != null) {
            bg.h1 h1Var = k1Var.f2371q0;
            y7Var.Y = true;
            org.telegram.ui.Cells.g3 g3Var = y7Var.V;
            org.telegram.ui.Cells.g3 g3Var2 = y7Var.U;
            if (h1Var != null) {
                y7Var.f18892c0 = h1Var.d;
                y7Var.f18893d0 = false;
                g3Var2.setText(h1Var.f2284c);
                g3Var.setText(h1Var.f2283b);
                y7Var.f18898i0 = !TextUtils.isEmpty(h1Var.f2283b);
                y7Var.f18899j0 = h1Var.f2286f;
                y7Var.f18900k0 = h1Var.f2285e;
            } else {
                g3Var2.setText("");
                g3Var.setText("");
                y7Var.f18899j0 = true;
                y7Var.f18900k0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = y7Var.X;
            dVar.g(string, false, true);
            u7 u7Var = y7Var.T;
            if (u7Var != null) {
                u7Var.N(false);
            }
            dVar.setEnabled(y7Var.V(g3Var2.getText().toString()));
            y7Var.Y = false;
        }
        y7Var.setOnDismissListener(new s4(this, 1));
        y7Var.show();
        z0(true);
    }

    public final void L0(bg.o1 o1Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ni niVar = new ni(getContext(), new d5(this, callback2), false, true, false, this.C1);
        niVar.V1 = new Object();
        ph phVar = niVar.f31049t1;
        if (o1Var != null && (messageMedia = o1Var.f2433q0) != null && (geoPoint = messageMedia.geo) != null) {
            niVar.f31050t2 = new double[]{geoPoint.lat, geoPoint._long};
            niVar.K = true;
            phVar.setVisibility(8);
        } else if (this.Q1) {
            niVar.f31043r2 = this.S1;
            niVar.f31047s2 = this.R1;
            niVar.K = true;
            phVar.setVisibility(8);
        } else {
            niVar.K = true;
            phVar.setVisibility(8);
        }
        niVar.setOnDismissListener(new s4(this, 0));
        niVar.r1();
        niVar.show();
    }

    public final void M0(bg.k kVar) {
        if (kVar instanceof bg.d2) {
            org.telegram.ui.ActionBar.o1 o1Var = this.D1;
            if (o1Var != null && o1Var.isShowing()) {
                this.D1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f18643k2;
        kVar.getLocationInWindow(iArr);
        float scaleX = kVar.getScaleX() * kVar.getWidth();
        n5 n5Var = this.N0;
        float scaleX2 = n5Var.getScaleX() * scaleX;
        float scaleY = kVar.getScaleY();
        float scaleY2 = n5Var.getScaleY() * scaleY * kVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        N0(new o4(this, kVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, t5 t5Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.o1 o1Var = this.D1;
        if (o1Var != null && o1Var.isShowing()) {
            this.D1.d(true);
            return;
        }
        if (this.E1 == null) {
            this.F1 = new Rect();
            s5 s5Var = new s5(this, getContext());
            this.E1 = s5Var;
            s5Var.setAnimationEnabled(true);
            this.E1.setOnTouchListener(new bg.w(this, 1));
            this.E1.setDispatchKeyEventListener(new q4(this));
            this.E1.setShownFromBottom(true);
        }
        s5 s5Var2 = this.E1;
        s5Var2.S = z10;
        s5Var2.d();
        runnable.run();
        if (this.D1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.E1, -2, -2);
            this.D1 = o1Var2;
            o1Var2.f23710b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.D1.setOutsideTouchable(true);
            this.D1.setClippingEnabled(true);
            this.D1.setInputMethodMode(2);
            this.D1.setSoftInputMode(0);
            this.D1.getContentView().setFocusableInTouchMode(true);
            this.D1.setOnDismissListener(new bg.y(this, 1));
        }
        this.E1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.D1.setFocusable(true);
        int measuredWidth = i11 - (this.E1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.E1.getMeasuredHeight();
        this.D1.showAtLocation(t5Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.o1.i(this.E1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            s5 s5Var3 = this.E1;
            s5Var3.setBackgroundDrawable(new org.telegram.ui.Components.ja(new org.telegram.ui.Components.ka(this.a2, s5Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.E1.setBackgroundDrawable(mutate);
        this.E1.setBackgroundColor(-14145495);
    }

    public final void O0(boolean z10) {
        if (this.Y1 != z10) {
            if (z10 || this.V1 != null) {
                this.Y1 = z10;
                if (z10) {
                    this.V1.n();
                    this.V1.setVisibility(0);
                    this.V1.setSelectedReaction(this.W1.getCurrentReaction());
                    this.V1.getParent().bringChildToFront(this.V1);
                } else {
                    this.W1 = null;
                }
                float f9 = 0.0f;
                if (z10) {
                    this.Z1 = true;
                    this.I1.invalidate();
                    float f10 = this.X1;
                    if (z10) {
                        f9 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
                    this.V1.setTransitionProgress(this.X1);
                    ofFloat.addUpdateListener(new l4(this, 2));
                    ofFloat.addListener(new bg.z2(15, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(jr.f29801g);
                    ofFloat.start();
                    return;
                }
                if (this.V1.getReactionsWindow() != null) {
                    this.V1.getReactionsWindow().e();
                }
                this.V1.animate().alpha(0.0f).setDuration(150L).setListener(new b5(this, 0)).start();
            }
        }
    }

    public final void P0(boolean z10) {
        float f9;
        if (this.f18653q1 != z10) {
            this.f18653q1 = z10;
            o1.k kVar = this.f18655r1;
            if (kVar != null) {
                kVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new ib.a(f9));
            this.f18655r1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f19052i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f19045u = lVar;
            if (z10) {
                bg.t2 t2Var = this.f18638i1;
                t2Var.setAlpha(0.0f);
                t2Var.setVisibility(0);
            }
            this.f18655r1.b(new bg.z(2, this));
            this.f18655r1.a(new k4(this, z10, 1));
            this.f18655r1.f();
        }
    }

    public final PointF Q0(bg.k kVar) {
        float f9;
        float f10 = 200.0f;
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            f10 = 200.0f / cropState.cropScale;
        }
        if (kVar != null) {
            PointF position = kVar.getPosition();
            float min = Math.min(kVar.getHeight(), kVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f11 = 100.0f;
        if (cropState != null) {
            f11 = 100.0f / cropState.cropScale;
        }
        PointF e02 = e0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                n5 n5Var = this.N0;
                if (i11 >= n5Var.getChildCount()) {
                    break;
                }
                View childAt = n5Var.getChildAt(i11);
                if (!(childAt instanceof bg.k) || (childAt instanceof bg.d2)) {
                    f9 = f11;
                } else {
                    PointF position2 = ((bg.k) childAt).getPosition();
                    f9 = f11;
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f9) {
                        f10 = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z10 = true;
                    }
                }
                i11++;
                f11 = f9;
            }
            float f12 = f11;
            if (!z10) {
                break;
            }
            i10++;
            e02 = new PointF(e02.x + f10, e02.y + f10);
            f11 = f12;
        }
        return e02;
    }

    @Override
    public final int R() {
        return this.K1.f18786l - this.I1.getBottomPadding2();
    }

    public final void R0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.U0 != i10 && this.V0 != i10) {
            ValueAnimator valueAnimator = this.X0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.U0;
            ViewGroup viewGroup3 = this.f18636h1;
            ViewGroup viewGroup4 = this.f18634g1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.V0 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.B1;
            ag.h1 e10 = ag.h1.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f524l != z10) {
                e10.f524l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f515a.getInt("brush", 0), false);
                }
            }
            int c3 = ag.h1.e(i12).c();
            ag.k2 k2Var = this.f18665w1;
            k2Var.f571a = c3;
            E0(k2Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.X0 = duration;
            duration.setInterpolator(jr.f29800f);
            this.X0.addUpdateListener(new bg.s(this, viewGroup, viewGroup2, 2));
            this.X0.addListener(new bg.m0(this, viewGroup, viewGroup2, i10, 1));
            this.X0.start();
        }
    }

    public final void S0() {
        boolean z10;
        z4 z4Var = this.K1;
        bg.n2 n2Var = this.f18636h1;
        if (n2Var != null) {
            if (z4Var.c()) {
                n2Var.a(R.drawable.input_smile);
            } else if (this.f18646m2) {
                n2Var.a(R.drawable.input_keyboard);
            } else {
                n2Var.a(R.drawable.msg_add);
            }
        }
        if (!z4Var.c() && !this.f18646m2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.f18642k1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f18640j1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f18645m1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.l1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        float f9;
        bg.k kVar;
        ObjectAnimator objectAnimator = this.f18631e2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.K0.getParent();
        if (view == null) {
            return;
        }
        z4 z4Var = this.K1;
        if (((z4Var.c() && !z4Var.d) || this.f18652p2 > 0) && (kVar = this.F0) != null) {
            f9 = view.getScaleY() * (-(kVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f9 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f9);
        this.f18631e2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f18631e2.setInterpolator(jr.h);
        this.f18631e2.start();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: nh.t5.U0():void");
    }

    @Override
    public final void a() {
        I0(true);
    }

    @Override
    public final void b(bg.k kVar) {
        O0(false);
        M0(kVar);
    }

    @Override
    public final void d() {
        setTextType((this.H0 + 1) % 4);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new lh.r3(28, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f18639i2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10 = 0;
        if ((view == this.K0 || view == this.L0 || view == this.N0 || view == this.M0) && (cropState = this.B0) != null) {
            canvas.save();
            if (!this.J0) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
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

    @Override
    public final void e() {
        this.A1.setColor(-15132391);
    }

    public final PointF e0() {
        n5 n5Var = this.N0;
        int measuredWidth = n5Var.getMeasuredWidth();
        int measuredHeight = n5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.N1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.O1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override
    public final void f(int i10) {
        bg.k kVar = this.F0;
        if (kVar instanceof bg.f4) {
            G0((bg.f4) kVar, i10);
            ag.h1 e10 = ag.h1.e(this.B1);
            e10.f520g = i10;
            e10.f515a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public abstract boolean f0(bg.f fVar);

    public final void g0() {
        org.telegram.ui.Components.y5[] y5VarArr;
        boolean z10 = this.S1;
        n5 n5Var = this.N0;
        boolean z11 = true;
        if (!z10 && !this.U1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < n5Var.getChildCount()) {
                    View childAt = n5Var.getChildAt(i10);
                    boolean z12 = childAt instanceof bg.f4;
                    int i11 = this.B1;
                    if (z12) {
                        CharSequence text = ((bg.f4) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.y5 y5Var : (org.telegram.ui.Components.y5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.y5.class)) {
                                TLRPC.Document document = y5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.p5.f(i11, y5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.p5.h(i11).e(document);
                                }
                                if (o7.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i10++;
                    } else if (childAt instanceof bg.v3) {
                        TLRPC.Document sticker = ((bg.v3) childAt).getSticker();
                        if (o7.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof bg.f3) {
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
        for (int i12 = 0; i12 < n5Var.getChildCount(); i12++) {
            View childAt2 = n5Var.getChildAt(i12);
            if (childAt2 instanceof bg.k) {
                ((bg.k) childAt2).setIsVideo(z11);
            }
        }
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.K0.c(true, false);
    }

    public View getBottomLayout() {
        return this.P0;
    }

    public View getCancelView() {
        return this.f18664w0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f18666x0;
    }

    public View getEntitiesView() {
        return this.N0;
    }

    public long getLcm() {
        return this.f18626c1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.y5[] y5VarArr;
        n5 n5Var = this.N0;
        int childCount = n5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = n5Var.getChildAt(i10);
            if (childAt instanceof bg.v3) {
                TLRPC.Document sticker = ((bg.v3) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f22404id = sticker.f22398id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof bg.f4) {
                CharSequence text = ((bg.f4) childAt).getText();
                if ((text instanceof Spanned) && (y5VarArr = (org.telegram.ui.Components.y5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.y5.class)) != null) {
                    for (org.telegram.ui.Components.y5 y5Var : y5VarArr) {
                        if (y5Var != null) {
                            TLRPC.Document document = y5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.p5.f(this.B1, y5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f22404id = document.f22398id;
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
        return Arrays.asList(this.K0, this.L0, this.N0, this.M0);
    }

    public View getRenderInputView() {
        return this.L0;
    }

    public ag.t1 getRenderView() {
        return this.K0;
    }

    public bg.k getSelectedEntity() {
        return this.F0;
    }

    public View getSelectionEntitiesView() {
        return this.M0;
    }

    public View getTextDimView() {
        return this.T0;
    }

    public View getTopLayout() {
        return this.O0;
    }

    public View getWeightChooserView() {
        return this.Z0;
    }

    public final TextView h0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, this.C1));
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

    public final bg.k1 i0(bg.h1 h1Var) {
        int measuredWidth;
        int i10;
        this.f18637h2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        n5 n5Var = this.N0;
        if (n5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.N1;
        } else {
            measuredWidth = n5Var.getMeasuredWidth();
        }
        float f9 = measuredWidth;
        int dp = ((int) f9) - AndroidUtilities.dp(58.0f);
        bg.k1 k1Var = new bg.k1(getContext(), Q0, this.B1, h1Var, f9 / 360.0f, dp);
        if (Q0.x == n5Var.getMeasuredWidth() / 2.0f) {
            k1Var.setStickyX(2);
        }
        if (Q0.y == n5Var.getMeasuredHeight() / 2.0f) {
            k1Var.setStickyY(2);
        }
        ag.k2 k2Var = this.f18665w1;
        if (k2Var != null && (i10 = k2Var.f571a) != -47814) {
            k1Var.setColor(i10);
        }
        k1Var.setDelegate(this);
        k1Var.setMaxWidth(dp);
        n5Var.addView(k1Var, i7.f6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            k1Var.j(1.0f / cropState.cropScale);
            k1Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return k1Var;
    }

    public final bg.o1 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f18637h2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        n5 n5Var = this.N0;
        if (n5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.N1;
        } else {
            measuredWidth = n5Var.getMeasuredWidth();
        }
        float f9 = measuredWidth;
        int dp = ((int) f9) - AndroidUtilities.dp(58.0f);
        bg.o1 o1Var = new bg.o1(getContext(), Q0, this.B1, messageMedia, mediaArea, f9 / 240.0f, dp);
        if (Q0.x == n5Var.getMeasuredWidth() / 2.0f) {
            o1Var.setStickyX(2);
        }
        if (Q0.y == n5Var.getMeasuredHeight() / 2.0f) {
            o1Var.setStickyY(2);
        }
        ag.k2 k2Var = this.f18665w1;
        if (k2Var != null && (i10 = k2Var.f571a) != -47814) {
            o1Var.setColor(i10);
        }
        o1Var.setDelegate(this);
        o1Var.setMaxWidth(dp);
        n5Var.addView(o1Var, i7.f6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            o1Var.j(1.0f / cropState.cropScale);
            o1Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return o1Var;
    }

    public final bg.y2 k0(String str, boolean z10) {
        float f9;
        bv0 bv0Var;
        this.f18637h2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f9 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            FileLog.e(e10);
            f9 = 1.0f;
        }
        n5 n5Var = this.N0;
        if (f9 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.N1, n5Var.getMeasuredWidth()) * 0.5d);
            bv0Var = new bv0(floor, floor / f9);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.O1, n5Var.getMeasuredHeight()) * 0.5d);
            bv0Var = new bv0(f9 * floor2, floor2);
        }
        bv0 bv0Var2 = bv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = bv0Var2.f27238a;
            bv0Var2.f27238a = bv0Var2.f27239b;
            bv0Var2.f27239b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        bg.y2 y2Var = new bg.y2(context, e02, bv0Var2, str, intValue);
        y2Var.setDelegate(this);
        n5Var.addView(y2Var);
        g0();
        return y2Var;
    }

    @Override
    public final boolean l(MotionEvent motionEvent) {
        if (this.f18639i2) {
            return false;
        }
        if (this.F0 != null) {
            D0(null, true);
        }
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x4, y8);
        this.K0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final bg.e3 l0(boolean z10) {
        String str;
        bv0 bv0Var = new bv0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        n5 n5Var = this.N0;
        if (n5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < n5Var.getChildCount(); i10++) {
                    View childAt = n5Var.getChildAt(i10);
                    if (i7.z5.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (n5Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (n5Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, n5Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, n5Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? kVar = new bg.k(getContext(), e02);
        kVar.f2178n0 = new lh.o8(kVar);
        kVar.f2179o0 = new lh.o8(kVar);
        kVar.f2180p0 = new kg.h0(kVar);
        kVar.f2181q0 = new kg.h0(kVar);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6((View) kVar);
        kVar.f2183s0 = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6((View) kVar);
        kVar.f2184t0 = d6Var2;
        kVar.f2186v0 = 1.0f;
        kVar.m0 = bv0Var;
        d6Var2.d(1.0f, true);
        d6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        kg.h0 h0Var = kVar.f2180p0;
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
        kg.q0 b10 = kg.q0.b(str);
        kVar.f2182r0 = b10;
        h0Var.e(b10);
        kVar.k();
        kVar.setDelegate(this);
        n5Var.addView(kVar);
        g0();
        if (z10) {
            B0(kVar);
            D0(kVar, true);
        }
        return kVar;
    }

    public final bg.f3 m0(String str, boolean z10) {
        float f9;
        this.f18637h2 = true;
        this.f18641j2 = true;
        q0();
        n5 n5Var = this.N0;
        int measuredWidth = n5Var.getMeasuredWidth();
        n5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.N1;
        }
        float floor = (float) Math.floor(0.43f * f9);
        bv0 bv0Var = new bv0(floor, floor);
        bg.f3 f3Var = new bg.f3(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (bv0Var.f27239b / 2.0f) + AndroidUtilities.dp(72.0f)), bv0Var, str);
        f3Var.setDelegate(this);
        n5Var.addView(f3Var);
        g0();
        if (z10) {
            B0(f3Var);
            post(new h4(this, f3Var, 0));
        }
        this.f18641j2 = false;
        return f3Var;
    }

    public final g5 n0(Object obj, TLRPC.Document document) {
        float f9;
        for (int i10 = 0; i10 < document.attributes.size() && !(document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker); i10++) {
        }
        float f10 = 0.75f;
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            f9 = -(cropState.transformRotation + cropState.cropRotate);
            f10 = 0.75f / cropState.cropScale;
        } else {
            f9 = 0.0f;
        }
        bg.f1 f1Var = new bg.f1(e0(), f10, f9);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f27238a * 0.5d);
        g5 g5Var = new g5(this, context, f1Var.f2194a, f1Var.f2196c, f1Var.f2195b, new bv0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = g5Var.f2583t0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        g5Var.setDelegate(this);
        this.N0.addView(g5Var);
        g0();
        return g5Var;
    }

    public final bg.f4 o0(boolean z10) {
        bv0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        bg.f4 f4Var = new bg.f4(getContext(), Q0, (int) (paintingSize.f27238a / 9.0f), "", this.f18665w1, this.H0);
        float f9 = paintingSize.f27238a / 9.0f;
        p4 p4Var = new p4(this, 0);
        f4Var.f2215s0 = (int) (0.5f * f9);
        f4Var.f2216t0 = (int) (f9 * 2.0f);
        f4Var.f2217u0 = p4Var;
        float f10 = Q0.x;
        n5 n5Var = this.N0;
        if (f10 == n5Var.getMeasuredWidth() / 2.0f) {
            f4Var.setStickyX(2);
        }
        if (Q0.y == n5Var.getMeasuredHeight() / 2.0f) {
            f4Var.setStickyY(2);
        }
        f4Var.setDelegate(this);
        f4Var.setMaxWidth(this.N1 - AndroidUtilities.dp(32.0f));
        int i10 = this.B1;
        f4Var.setTypeface(ag.h1.e(i10).f522j);
        f4Var.setType(ag.h1.e(i10).h);
        n5Var.addView(f4Var, i7.f6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            f4Var.j(1.0f / cropState.cropScale);
            f4Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            B0(f4Var);
            f4Var.q();
            D0(f4Var, false);
            f4Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(f4Var.getFocusedView());
            this.G0 = true;
            int i11 = ag.h1.e(i10).f520g;
            bg.n2 n2Var = this.f18636h1;
            n2Var.d(i11, true);
            n2Var.setOutlineType(ag.h1.e(i10).h);
        }
        return f4Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        fk0 fk0Var = this.V1;
        if (fk0Var != null) {
            AndroidUtilities.removeFromParent(fk0Var);
            this.V1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f9;
        float f10;
        this.C0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.f18668y0;
        if (bitmap != null) {
            f9 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f9 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f9)) > currentActionBarHeight2) {
            Math.floor((f10 * f9) / currentActionBarHeight);
        }
        float f11 = this.D0.f27238a;
        bg.k kVar = this.F0;
        if (kVar != null) {
            kVar.m();
        }
        measureChild(this.P0, i10, i11);
        measureChild(this.Z0, i10, i11);
        measureChild(this.R0, i10, i11);
        measureChild(this.Q0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f18652p2 - this.I1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.O0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.C0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f18646m2 && !this.f18650o2) {
            this.C0 = true;
            w0();
            this.C0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    @Override
    public final boolean p() {
        return !(this.F0 instanceof bg.d2);
    }

    public final bg.g4 p0(dc dcVar) {
        int measuredWidth;
        int i10;
        this.f18637h2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        n5 n5Var = this.N0;
        if (n5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.N1;
        } else {
            measuredWidth = n5Var.getMeasuredWidth();
        }
        float f9 = measuredWidth;
        int dp = ((int) f9) - AndroidUtilities.dp(58.0f);
        bg.g4 g4Var = new bg.g4(getContext(), Q0, this.B1, dcVar, f9 / 240.0f, dp);
        if (Q0.x == n5Var.getMeasuredWidth() / 2.0f) {
            g4Var.setStickyX(2);
        }
        if (Q0.y == n5Var.getMeasuredHeight() / 2.0f) {
            g4Var.setStickyY(2);
        }
        ag.k2 k2Var = this.f18665w1;
        if (k2Var != null && (i10 = k2Var.f571a) != -47814) {
            g4Var.setColor(i10);
        }
        g4Var.setDelegate(this);
        g4Var.setMaxWidth(dp);
        n5Var.addView(g4Var, i7.f6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            g4Var.j(1.0f / cropState.cropScale);
            g4Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return g4Var;
    }

    @Override
    public final void q(ag.m mVar) {
        boolean z10 = mVar instanceof ag.b;
        bg.w2 w2Var = this.Z0;
        if (!z10 && !(mVar instanceof ag.d)) {
            w2Var.b(0.05f, 1.0f);
        } else {
            w2Var.b(0.4f, 1.75f);
        }
        w2Var.setDrawCenter(!(mVar instanceof ag.l));
        j5 j5Var = this.K0;
        if (j5Var.getCurrentBrush() instanceof ag.l) {
            this.Y0 = true;
        }
        j5Var.setBrush(mVar);
        ag.k2 k2Var = this.f18665w1;
        int i10 = k2Var.f571a;
        k2Var.f571a = ag.h1.e(this.B1).c();
        k2Var.f573c = this.f18623a1.get();
        E0(k2Var, Integer.valueOf(i10), false);
        this.L0.invalidate();
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            n5 n5Var = this.N0;
            if (i10 < n5Var.getChildCount()) {
                View childAt = n5Var.getChildAt(i10);
                if (childAt instanceof bg.f3) {
                    if (this.F0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(jr.h).withEndAction(new h4(this, (bg.f3) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean r() {
        return !this.G0;
    }

    public abstract void r0();

    @Override
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }

    public final bg.d2 s0() {
        int i10 = 0;
        while (true) {
            n5 n5Var = this.N0;
            if (i10 < n5Var.getChildCount()) {
                View childAt = n5Var.getChildAt(i10);
                if (childAt instanceof bg.d2) {
                    return (bg.d2) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ga gaVar) {
        this.a2 = gaVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f18639i2 != z10) {
            this.f18639i2 = z10;
            if (z10) {
                D0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            n5 n5Var = this.N0;
            if (i10 < n5Var.getChildCount()) {
                View childAt = n5Var.getChildAt(i10);
                if (childAt instanceof bg.v3) {
                    ImageReceiver imageReceiver = ((bg.v3) childAt).f2583t0;
                    xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    imageReceiver.getAnimation();
                    if (lottieAnimation != null) {
                        lottieAnimation.L(Math.round(((((float) j10) % ((float) lottieAnimation.p())) / ((float) lottieAnimation.p())) * lottieAnimation.f34737e[0]), true, false);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.U1) {
            this.U1 = z10;
            g0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.H1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.G1 = runnable;
    }

    @Override
    public final int[] t(bg.k kVar) {
        int[] iArr = this.f18643k2;
        iArr[0] = (int) kVar.getPosition().x;
        iArr[1] = (int) kVar.getPosition().y;
        return iArr;
    }

    public final android.graphics.Bitmap t0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, nh.o7 r46) {
        throw new UnsupportedOperationException("Method not decompiled: nh.t5.t0(java.util.ArrayList, boolean, boolean, boolean, boolean, nh.o7):android.graphics.Bitmap");
    }

    @Override
    public final void u() {
        if (!this.f18648n2 && !this.f18646m2) {
            this.f18637h2 = true;
            o0(true);
            return;
        }
        if (this.f18646m2) {
            bg.k kVar = this.F0;
            if (kVar instanceof bg.f4) {
                this.K1.f18780e = true;
                AndroidUtilities.showKeyboard(((bg.f4) kVar).getEditText());
            }
        }
        J0(!this.f18646m2 ? 1 : 0);
    }

    public final boolean u0() {
        if (!this.f18670z0.a() && !this.f18637h2) {
            return false;
        }
        return true;
    }

    @Override
    public final void v(float f9, float f10, float[] fArr) {
        View view;
        View view2 = (View) this.K0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x4 = (f9 - view2.getX()) - view.getLeft();
        float y8 = (f10 - view2.getY()) - view.getTop();
        float pivotX = ((x4 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y8 - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    public final void v0(boolean z10) {
        if (this.f18646m2) {
            J0(0);
        }
        if (z10) {
            fz fzVar = this.f18644l2;
            if (fzVar != null && fzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f18644l2.getMeasuredHeight());
                ofFloat.addUpdateListener(new l4(this, 0));
                this.f18650o2 = true;
                ofFloat.addListener(new b5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                ofFloat.start();
                return;
            }
            w0();
        }
    }

    @Override
    public final ag.h1 w() {
        return ag.h1.e(this.B1);
    }

    public final void w0() {
        fz fzVar;
        if (!this.f18646m2 && (fzVar = this.f18644l2) != null && fzVar.getVisibility() != 8) {
            this.f18644l2.setVisibility(8);
        }
        int i10 = this.f18652p2;
        this.f18652p2 = 0;
        if (i10 != 0) {
            this.K1.a();
        }
    }

    @Override
    public final boolean y(bg.k kVar) {
        return D0(kVar, true);
    }

    public final boolean y0() {
        if (this.Y1) {
            if (this.V1.getReactionsWindow() != null && !this.V1.getReactionsWindow().f13695q) {
                this.V1.e();
                return true;
            }
            O0(false);
            return true;
        } else if (this.f18667x1) {
            I0(false);
            return true;
        } else if (this.f18646m2) {
            v0(true);
            return true;
        } else if (!this.G0) {
            return false;
        } else {
            if (this.I0) {
                this.I0 = false;
                this.K1.b(true);
                return false;
            }
            D0(null, true);
            return true;
        }
    }

    public abstract void z0(boolean z10);

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f9) {
    }
}
