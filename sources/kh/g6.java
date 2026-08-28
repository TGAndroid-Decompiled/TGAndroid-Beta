package kh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wu0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
public abstract class g6 extends yu0 implements yf.q1, yf.h, yf.m1, wu0, sb {
    public final DispatchQueue A0;
    public final Paint A1;
    public final MediaController.CropState B0;
    public final int B1;
    public boolean C0;
    public final u5 C1;
    public qu0 D0;
    public org.telegram.ui.ActionBar.o1 D1;
    public boolean E0;
    public e6 E1;
    public yf.j F0;
    public Rect F1;
    public boolean G0;
    public Runnable G1;
    public int H0;
    public Runnable H1;
    public boolean I0;
    public final vb I1;
    public final boolean J0;
    public AnimatorSet J1;
    public final w5 K0;
    public final j5 K1;
    public final y5 L0;
    public a8 L1;
    public final b6 M0;
    public ArrayList M1;
    public final a6 N0;
    public int N1;
    public final FrameLayout O0;
    public int O1;
    public final c6 P0;
    public xf.x P1;
    public final g5 Q0;
    public final boolean Q1;
    public final FrameLayout R0;
    public final File R1;
    public n5 S0;
    public final boolean S1;
    public final View T0;
    public final boolean T1;
    public int U0;
    public boolean U1;
    public int V0;
    public uj0 V1;
    public float W0;
    public yf.a2 W1;
    public ValueAnimator X0;
    public float X1;
    public boolean Y0;
    public boolean Y1;
    public final yf.w1 Z0;
    public boolean Z1;
    public final k5.i f15268a1;
    public org.telegram.ui.Components.ba a2;
    public final int f15269b1;
    public final q6 f15270b2;
    public BigInteger f15271c1;
    public final r6 f15272c2;
    public TextView f15273d1;
    public boolean f15274d2;
    public TextView f15275e1;
    public ObjectAnimator f15276e2;
    public TextView f15277f1;
    public final float[] f15278f2;
    public final yf.r1 f15279g1;
    public p5 f15280g2;
    public final yf.o1 f15281h1;
    public boolean f15282h2;
    public final yf.t1 f15283i1;
    public boolean f15284i2;
    public final ImageView f15285j1;
    public boolean f15286j2;
    public final TextView f15287k1;
    public final int[] f15288k2;
    public final TextView l1;
    public wy f15289l2;
    public final TextView f15290m1;
    public boolean f15291m2;
    public final Paint f15292n1;
    public boolean f15293n2;
    public final Paint f15294o1;
    public boolean f15295o2;
    public float f15296p1;
    public int f15297p2;
    public boolean f15298q1;
    public boolean f15299q2;
    public o1.j f15300r1;
    public int f15301r2;
    public final h5 f15302s1;
    public int f15303s2;
    public final Paint f15304t1;
    public int f15305t2;
    public final Paint f15306u1;
    public boolean f15307u2;
    public final Paint f15308v1;
    public final yf.f1 f15309w0;
    public final xf.q1 f15310w1;
    public final yf.j1 f15311x0;
    public boolean f15312x1;
    public final Bitmap f15313y0;
    public o1.j f15314y1;
    public final xf.t1 f15315z0;
    public float f15316z1;

    public g6(Context context, boolean z10, File file, boolean z11, boolean z12, vb vbVar, Activity activity, final int i9, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, a8 a8Var, int i11, int i12, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar, org.telegram.ui.ActionBar.b6 b6Var, q6 q6Var, r6 r6Var) {
        super(context, activity);
        xf.q1 q1Var;
        org.telegram.ui.Components.ba baVar2;
        this.U0 = 0;
        this.V0 = -1;
        final ya yaVar = (ya) this;
        k5.i iVar = new k5.i(yaVar, 23);
        this.f15268a1 = iVar;
        Paint paint = new Paint(1);
        this.f15292n1 = paint;
        Paint paint2 = new Paint(1);
        this.f15294o1 = paint2;
        this.f15304t1 = new Paint(1);
        this.f15306u1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f15308v1 = paint3;
        xf.q1 q1Var2 = new xf.q1(1.0f, 0.016773745f, -1);
        this.f15310w1 = q1Var2;
        this.A1 = new Paint(1);
        this.f15278f2 = new float[2];
        this.f15284i2 = false;
        this.f15288k2 = new int[2];
        new androidx.activity.i(yaVar, 28);
        setDelegate(this);
        this.a2 = baVar;
        this.f15270b2 = q6Var;
        this.Q1 = z10;
        this.R1 = file;
        this.S1 = z11;
        this.T1 = z12;
        this.I1 = vbVar;
        this.N1 = i11;
        this.O1 = i12;
        this.f15272c2 = r6Var;
        this.B1 = i9;
        u5 u5Var = new u5(b6Var);
        this.C1 = u5Var;
        this.B0 = cropState;
        this.J0 = context instanceof BubbleActivity;
        xf.s0 e10 = xf.s0.e(i9);
        e10.i(0, true);
        q1Var2.f49333a = e10.c();
        q1Var2.f49335c = e10.f49364i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.A0 = dispatchQueue;
        this.f15313y0 = bitmap;
        this.f15269b1 = i10;
        xf.t1 t1Var = new xf.t1();
        this.f15315z0 = t1Var;
        t1Var.f49381a = new p(yaVar, 4);
        View view = new View(context);
        this.T0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        xf.q0 q0Var = new xf.q0(getPaintingSize(), null, i10, baVar);
        if (a8Var == null || !a8Var.f14943u) {
            q1Var = q1Var2;
            baVar2 = baVar;
        } else {
            q1Var = q1Var2;
            baVar2 = null;
        }
        w5 w5Var = new w5(yaVar, context, q0Var, bitmap, bitmap2, baVar2);
        this.K0 = w5Var;
        w5Var.setDelegate(new x5(yaVar));
        w5Var.setUndoStore(t1Var);
        w5Var.setQueue(dispatchQueue);
        w5Var.setVisibility(4);
        y5 y5Var = new y5(yaVar, context);
        this.L0 = y5Var;
        y5Var.setVisibility(4);
        a6 a6Var = new a6(yaVar, context, new z5(yaVar));
        this.N0 = a6Var;
        this.L1 = a8Var;
        this.M1 = arrayList;
        if (this.N1 > 0 && this.O1 > 0) {
            H0();
        }
        a6Var.setVisibility(4);
        this.M0 = new b6(yaVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, g7.e6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f15285j1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ya yaVar2 = yaVar;
                        w5 w5Var2 = yaVar2.K0;
                        if (w5Var2 != null && (w5Var2.getCurrentBrush() instanceof xf.l)) {
                            w5Var2.b();
                            yaVar2.f15279g1.setSelectedIndex(1);
                            yaVar2.n((xf.m) xf.m.f49272a.get(0));
                            return;
                        }
                        yaVar2.f15315z0.c();
                        return;
                    case 1:
                        ya yaVar3 = yaVar;
                        w5 w5Var3 = yaVar3.K0;
                        xf.t1 t1Var2 = yaVar3.f15315z0;
                        if (t1Var2.a()) {
                            if (w5Var3 != null && (w5Var3.getCurrentBrush() instanceof xf.l)) {
                                w5Var3.b();
                                yaVar3.f15279g1.setSelectedIndex(1);
                                yaVar3.n((xf.m) xf.m.f49272a.get(0));
                            }
                            if (w5Var3 != null) {
                                w5Var3.a();
                            }
                            t1Var2.f49383c.clear();
                            t1Var2.f49382b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            yaVar3.N0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ya yaVar4 = yaVar;
                        yf.j jVar = yaVar4.F0;
                        if (jVar instanceof yf.v2) {
                            AndroidUtilities.hideKeyboard(((yf.v2) jVar).getFocusedView());
                        }
                        if (yaVar4.f15291m2) {
                            yaVar4.v0(false);
                        }
                        yaVar4.C0(yaVar4.F0);
                        yaVar4.D0(null, true);
                        return;
                    case 3:
                        yaVar.D0(null, true);
                        return;
                    default:
                        ya yaVar5 = yaVar;
                        if (yaVar5.f15312x1) {
                            yaVar5.I0(false);
                            return;
                        } else if (yaVar5.f15291m2) {
                            yaVar5.v0(true);
                            return;
                        } else if (yaVar5.G0) {
                            yaVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = yaVar5.H1;
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
        frameLayout.addView(imageView, g7.e6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.f6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        ll.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, g7.e6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, g7.e6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new fh.n(7));
        frameLayout.addView(linearLayout, g7.e6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f15287k1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.f6.f0(822083583, 7, -1));
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
                        ya yaVar2 = yaVar;
                        w5 w5Var2 = yaVar2.K0;
                        if (w5Var2 != null && (w5Var2.getCurrentBrush() instanceof xf.l)) {
                            w5Var2.b();
                            yaVar2.f15279g1.setSelectedIndex(1);
                            yaVar2.n((xf.m) xf.m.f49272a.get(0));
                            return;
                        }
                        yaVar2.f15315z0.c();
                        return;
                    case 1:
                        ya yaVar3 = yaVar;
                        w5 w5Var3 = yaVar3.K0;
                        xf.t1 t1Var2 = yaVar3.f15315z0;
                        if (t1Var2.a()) {
                            if (w5Var3 != null && (w5Var3.getCurrentBrush() instanceof xf.l)) {
                                w5Var3.b();
                                yaVar3.f15279g1.setSelectedIndex(1);
                                yaVar3.n((xf.m) xf.m.f49272a.get(0));
                            }
                            if (w5Var3 != null) {
                                w5Var3.a();
                            }
                            t1Var2.f49383c.clear();
                            t1Var2.f49382b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            yaVar3.N0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ya yaVar4 = yaVar;
                        yf.j jVar = yaVar4.F0;
                        if (jVar instanceof yf.v2) {
                            AndroidUtilities.hideKeyboard(((yf.v2) jVar).getFocusedView());
                        }
                        if (yaVar4.f15291m2) {
                            yaVar4.v0(false);
                        }
                        yaVar4.C0(yaVar4.F0);
                        yaVar4.D0(null, true);
                        return;
                    case 3:
                        yaVar.D0(null, true);
                        return;
                    default:
                        ya yaVar5 = yaVar;
                        if (yaVar5.f15312x1) {
                            yaVar5.I0(false);
                            return;
                        } else if (yaVar5.f15291m2) {
                            yaVar5.v0(true);
                            return;
                        } else if (yaVar5.G0) {
                            yaVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = yaVar5.H1;
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
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView2, g7.e6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.l1 = g10;
        g10.setBackground(org.telegram.ui.ActionBar.f6.f0(822083583, 7, -1));
        g10.setPadding(org.telegram.ui.Cells.j2.c(8.0f, R.string.Clear, g10), 0, AndroidUtilities.dp(8.0f), 0);
        g10.setGravity(16);
        g10.setTextColor(-1);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextSize(1, 16.0f);
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ya yaVar2 = yaVar;
                        w5 w5Var2 = yaVar2.K0;
                        if (w5Var2 != null && (w5Var2.getCurrentBrush() instanceof xf.l)) {
                            w5Var2.b();
                            yaVar2.f15279g1.setSelectedIndex(1);
                            yaVar2.n((xf.m) xf.m.f49272a.get(0));
                            return;
                        }
                        yaVar2.f15315z0.c();
                        return;
                    case 1:
                        ya yaVar3 = yaVar;
                        w5 w5Var3 = yaVar3.K0;
                        xf.t1 t1Var2 = yaVar3.f15315z0;
                        if (t1Var2.a()) {
                            if (w5Var3 != null && (w5Var3.getCurrentBrush() instanceof xf.l)) {
                                w5Var3.b();
                                yaVar3.f15279g1.setSelectedIndex(1);
                                yaVar3.n((xf.m) xf.m.f49272a.get(0));
                            }
                            if (w5Var3 != null) {
                                w5Var3.a();
                            }
                            t1Var2.f49383c.clear();
                            t1Var2.f49382b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            yaVar3.N0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ya yaVar4 = yaVar;
                        yf.j jVar = yaVar4.F0;
                        if (jVar instanceof yf.v2) {
                            AndroidUtilities.hideKeyboard(((yf.v2) jVar).getFocusedView());
                        }
                        if (yaVar4.f15291m2) {
                            yaVar4.v0(false);
                        }
                        yaVar4.C0(yaVar4.F0);
                        yaVar4.D0(null, true);
                        return;
                    case 3:
                        yaVar.D0(null, true);
                        return;
                    default:
                        ya yaVar5 = yaVar;
                        if (yaVar5.f15312x1) {
                            yaVar5.I0(false);
                            return;
                        } else if (yaVar5.f15291m2) {
                            yaVar5.v0(true);
                            return;
                        } else if (yaVar5.G0) {
                            yaVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = yaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        g10.setAlpha(0.0f);
        g10.setVisibility(8);
        TextView g11 = org.telegram.ui.Cells.j2.g(frameLayout, g10, g7.e6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f15290m1 = g11;
        g11.setBackground(org.telegram.ui.ActionBar.f6.f0(822083583, 7, -1));
        g11.setPadding(org.telegram.ui.Cells.j2.c(8.0f, R.string.Done, g11), 0, AndroidUtilities.dp(8.0f), 0);
        g11.setGravity(16);
        g11.setTextColor(-1);
        g11.setTypeface(AndroidUtilities.bold());
        g11.setTextSize(1, 16.0f);
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ya yaVar2 = yaVar;
                        w5 w5Var2 = yaVar2.K0;
                        if (w5Var2 != null && (w5Var2.getCurrentBrush() instanceof xf.l)) {
                            w5Var2.b();
                            yaVar2.f15279g1.setSelectedIndex(1);
                            yaVar2.n((xf.m) xf.m.f49272a.get(0));
                            return;
                        }
                        yaVar2.f15315z0.c();
                        return;
                    case 1:
                        ya yaVar3 = yaVar;
                        w5 w5Var3 = yaVar3.K0;
                        xf.t1 t1Var2 = yaVar3.f15315z0;
                        if (t1Var2.a()) {
                            if (w5Var3 != null && (w5Var3.getCurrentBrush() instanceof xf.l)) {
                                w5Var3.b();
                                yaVar3.f15279g1.setSelectedIndex(1);
                                yaVar3.n((xf.m) xf.m.f49272a.get(0));
                            }
                            if (w5Var3 != null) {
                                w5Var3.a();
                            }
                            t1Var2.f49383c.clear();
                            t1Var2.f49382b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            yaVar3.N0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ya yaVar4 = yaVar;
                        yf.j jVar = yaVar4.F0;
                        if (jVar instanceof yf.v2) {
                            AndroidUtilities.hideKeyboard(((yf.v2) jVar).getFocusedView());
                        }
                        if (yaVar4.f15291m2) {
                            yaVar4.v0(false);
                        }
                        yaVar4.C0(yaVar4.F0);
                        yaVar4.D0(null, true);
                        return;
                    case 3:
                        yaVar.D0(null, true);
                        return;
                    default:
                        ya yaVar5 = yaVar;
                        if (yaVar5.f15312x1) {
                            yaVar5.I0(false);
                            return;
                        } else if (yaVar5.f15291m2) {
                            yaVar5.v0(true);
                            return;
                        } else if (yaVar5.G0) {
                            yaVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = yaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        g11.setAlpha(0.0f);
        g11.setVisibility(8);
        frameLayout.addView(g11, g7.e6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        c6 c6Var = new c6(yaVar, context, e10);
        this.P0 = c6Var;
        c6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        c6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(c6Var, g7.e6.e(-1, 104, 80));
        yf.r1 r1Var = new yf.r1(context, (a8Var == null || a8Var.v() || a8Var.f14943u || baVar == null) ? false : true);
        this.f15279g1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        c6Var.addView(r1Var, g7.e6.c(48.0f, -1));
        yf.o1 o1Var = new yf.o1(context);
        this.f15281h1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ya yaVar2 = yaVar;
                        xf.q1 q1Var3 = yaVar2.f15310w1;
                        yaVar2.F0(q1Var3);
                        xf.s0.e(i9).j(q1Var3.f49335c);
                        return;
                    default:
                        yaVar.f15281h1.setTypeface(xf.s0.e(i9).f49365j);
                        return;
                }
            }
        });
        o1Var.setAlignment(xf.s0.e(i9).f49363g);
        c6Var.addView(o1Var, g7.e6.c(48.0f, -1));
        g5 g5Var = new g5(yaVar, context);
        this.Q0 = g5Var;
        addView(g5Var, g7.e6.c(-1.0f, -1));
        yf.t1 t1Var2 = new yf.t1(context);
        this.f15283i1 = t1Var2;
        t1Var2.setVisibility(8);
        t1Var2.setOnItemClickListener(new eh.j(yaVar, 12));
        o1Var.setTypefaceListView(t1Var2);
        g5Var.addView(t1Var2, g7.e6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(u5Var.N0(org.telegram.ui.ActionBar.f6.G8));
        h5 h5Var = new h5(yaVar, context);
        this.f15302s1 = h5Var;
        h5Var.setVisibility(8);
        h5Var.setColorPalette(xf.s0.e(i9));
        h5Var.setColorListener(new fh.k6(yaVar, 2));
        c6Var.addView(h5Var, g7.e6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        yf.f1 f1Var = new yf.f1(context);
        this.f15309w0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
        c6Var.addView(f1Var, g7.e6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        f1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ya yaVar2 = yaVar;
                        w5 w5Var2 = yaVar2.K0;
                        if (w5Var2 != null && (w5Var2.getCurrentBrush() instanceof xf.l)) {
                            w5Var2.b();
                            yaVar2.f15279g1.setSelectedIndex(1);
                            yaVar2.n((xf.m) xf.m.f49272a.get(0));
                            return;
                        }
                        yaVar2.f15315z0.c();
                        return;
                    case 1:
                        ya yaVar3 = yaVar;
                        w5 w5Var3 = yaVar3.K0;
                        xf.t1 t1Var22 = yaVar3.f15315z0;
                        if (t1Var22.a()) {
                            if (w5Var3 != null && (w5Var3.getCurrentBrush() instanceof xf.l)) {
                                w5Var3.b();
                                yaVar3.f15279g1.setSelectedIndex(1);
                                yaVar3.n((xf.m) xf.m.f49272a.get(0));
                            }
                            if (w5Var3 != null) {
                                w5Var3.a();
                            }
                            t1Var22.f49383c.clear();
                            t1Var22.f49382b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var22, 14));
                            yaVar3.N0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ya yaVar4 = yaVar;
                        yf.j jVar = yaVar4.F0;
                        if (jVar instanceof yf.v2) {
                            AndroidUtilities.hideKeyboard(((yf.v2) jVar).getFocusedView());
                        }
                        if (yaVar4.f15291m2) {
                            yaVar4.v0(false);
                        }
                        yaVar4.C0(yaVar4.F0);
                        yaVar4.D0(null, true);
                        return;
                    case 3:
                        yaVar.D0(null, true);
                        return;
                    default:
                        ya yaVar5 = yaVar;
                        if (yaVar5.f15312x1) {
                            yaVar5.I0(false);
                            return;
                        } else if (yaVar5.f15291m2) {
                            yaVar5.v0(true);
                            return;
                        } else if (yaVar5.G0) {
                            yaVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = yaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        yf.j1 j1Var = new yf.j1(context);
        this.f15311x0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new fg.f(yaVar, context, e10, 15));
        c6Var.addView(j1Var, g7.e6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        yf.w1 w1Var = new yf.w1(context);
        this.Z0 = w1Var;
        xf.q1 q1Var3 = q1Var;
        w1Var.setColorSwatch(q1Var3);
        w1Var.setRenderView(w5Var);
        w1Var.setValueOverride(iVar);
        q1Var3.f49335c = iVar.get();
        w1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ya yaVar2 = yaVar;
                        xf.q1 q1Var32 = yaVar2.f15310w1;
                        yaVar2.F0(q1Var32);
                        xf.s0.e(i9).j(q1Var32.f49335c);
                        return;
                    default:
                        yaVar.f15281h1.setTypeface(xf.s0.e(i9).f49365j);
                        return;
                }
            }
        });
        addView(w1Var, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R0 = frameLayout2;
        addView(frameLayout2, g7.e6.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(q1Var3, null, false);
        n((xf.m) xf.m.f49272a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
        this.K1 = new j5(yaVar, vbVar, new fh.f1(10, yaVar, vbVar));
        n2.C = 1;
    }

    public static void G0(yf.v2 v2Var, int i9) {
        int i10;
        v2Var.setAlign(i9);
        int i11 = 2;
        if (i9 != 1) {
            if (i9 != 2) {
                i10 = 19;
            } else {
                i10 = 21;
            }
        } else {
            i10 = 17;
        }
        v2Var.getEditText().setGravity(i10);
        if (i9 != 1) {
            if (i9 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        v2Var.getEditText().setTextAlignment(i11);
    }

    public static void Z(ya yaVar, xf.s0 s0Var, Integer num) {
        s0Var.h(num.intValue(), true);
        s0Var.g();
        yaVar.setNewColor(num.intValue());
        yaVar.f15302s1.setSelectedColorIndex(s0Var.d());
        yaVar.P1 = null;
    }

    public static void a0(ya yaVar, Integer num) {
        yaVar.setNewColor(num.intValue());
        yaVar.I0(false);
    }

    public ViewGroup getBarView() {
        if (this.U0 == 2) {
            return this.f15281h1;
        }
        return this.f15279g1;
    }

    private int getFrameRotation() {
        int i9 = this.f15269b1;
        if (i9 != 90) {
            if (i9 != 180) {
                if (i9 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private qu0 getPaintingSize() {
        qu0 qu0Var = this.D0;
        if (qu0Var != null) {
            return qu0Var;
        }
        qu0 qu0Var2 = new qu0(1080.0f, 1920.0f);
        this.D0 = qu0Var2;
        return qu0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i9 = 0;
        while (true) {
            a6 a6Var = this.N0;
            if (i9 < a6Var.getChildCount()) {
                View childAt = a6Var.getChildAt(i9);
                if (childAt instanceof yf.n2) {
                    ImageReceiver imageReceiver = ((yf.n2) childAt).f50040t0;
                    mi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    org.telegram.ui.Components.x5 animation = imageReceiver.getAnimation();
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
                        animation.f34539y = z10;
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
                i9++;
            } else {
                return;
            }
        }
    }

    public void setNewColor(int i9) {
        xf.q1 q1Var = this.f15310w1;
        int i10 = q1Var.f49333a;
        q1Var.f49333a = i9;
        E0(q1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new v4(this, i10, i9, 0));
        duration.start();
    }

    private void setTextType(int i9) {
        this.H0 = i9;
        yf.j jVar = this.F0;
        if (jVar instanceof yf.v2) {
            ((yf.v2) jVar).setType(i9);
        }
        xf.s0 e10 = xf.s0.e(this.B1);
        e10.h = i9;
        e10.f49358a.edit().putInt("text_type", i9).apply();
        this.f15281h1.e(i9, true);
    }

    private void setupTabsLayout(Context context) {
        n5 n5Var = new n5(this, context);
        this.S0 = n5Var;
        n5Var.setClipToPadding(false);
        this.S0.setOrientation(0);
        this.P0.addView(this.S0, g7.e6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f15273d1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f15273d1;
        int i9 = org.telegram.ui.ActionBar.f6.f23092i6;
        u5 u5Var = this.C1;
        textView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i9, u5Var), 7, -1));
        this.f15273d1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f15273d1.setTextColor(-1);
        this.f15273d1.setTextSize(1, 14.0f);
        this.f15273d1.setGravity(1);
        this.f15273d1.setTypeface(AndroidUtilities.bold());
        this.f15273d1.setSingleLine();
        this.f15273d1.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f15792b;

            {
                this.f15792b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g6 g6Var = this.f15792b;
                        if (g6Var.G0) {
                            g6Var.D0(null, true);
                            return;
                        } else {
                            g6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f15792b.A0();
                        return;
                    default:
                        g6 g6Var2 = this.f15792b;
                        g6Var2.R0(2);
                        if (!(g6Var2.F0 instanceof yf.v2)) {
                            g6Var2.f15282h2 = true;
                            g6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.S0.addView(this.f15273d1, g7.e6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f15275e1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f15275e1.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i9, u5Var), 7, -1));
        this.f15275e1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f15275e1.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f15792b;

            {
                this.f15792b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g6 g6Var = this.f15792b;
                        if (g6Var.G0) {
                            g6Var.D0(null, true);
                            return;
                        } else {
                            g6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f15792b.A0();
                        return;
                    default:
                        g6 g6Var2 = this.f15792b;
                        g6Var2.R0(2);
                        if (!(g6Var2.F0 instanceof yf.v2)) {
                            g6Var2.f15282h2 = true;
                            g6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f15275e1.setTextColor(-1);
        this.f15275e1.setTextSize(1, 14.0f);
        this.f15275e1.setGravity(1);
        this.f15275e1.setTypeface(AndroidUtilities.bold());
        this.f15275e1.setAlpha(0.6f);
        this.f15275e1.setSingleLine();
        this.S0.addView(this.f15275e1, g7.e6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f15277f1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f15277f1.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i9, u5Var), 7, -1));
        this.f15277f1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f15277f1.setTextColor(-1);
        this.f15277f1.setTextSize(1, 14.0f);
        this.f15277f1.setGravity(1);
        this.f15277f1.setTypeface(AndroidUtilities.bold());
        this.f15277f1.setAlpha(0.6f);
        this.f15277f1.setSingleLine();
        this.f15277f1.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f15792b;

            {
                this.f15792b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g6 g6Var = this.f15792b;
                        if (g6Var.G0) {
                            g6Var.D0(null, true);
                            return;
                        } else {
                            g6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f15792b.A0();
                        return;
                    default:
                        g6 g6Var2 = this.f15792b;
                        g6Var2.R0(2);
                        if (!(g6Var2.F0 instanceof yf.v2)) {
                            g6Var2.f15282h2 = true;
                            g6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.S0.addView(this.f15277f1, g7.e6.l(1.0f, 0, -2));
    }

    public static boolean x0(TLRPC.Document document) {
        if (document != null) {
            for (int i9 = 0; i9 < document.attributes.size(); i9++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
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
        N0(new x4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0() {
        final int i9 = this.U0;
        R0(1);
        postDelayed(new bg.d2(this, 16), 350L);
        p5 p5Var = new p5(this, getContext(), this.C1, i9);
        this.f15280g2 = p5Var;
        vb vbVar = this.I1;
        Objects.requireNonNull(vbVar);
        p5Var.f15740w = new yf.w0(1, vbVar);
        final boolean[] zArr = {true};
        p5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                g6 g6Var = g6.this;
                g6Var.f15280g2 = null;
                if (zArr[0]) {
                    g6Var.z0(false);
                }
                g6Var.R0(i9);
            }
        });
        p5Var.f15742y = new z4(this);
        p5Var.p0(new f5(this, zArr, p5Var, 0));
        p5Var.show();
        z0(true);
    }

    public final void B0(yf.j jVar) {
        this.f15315z0.b(jVar.getUUID(), new w4(this, jVar, 0));
    }

    public final void C0(yf.j jVar) {
        yf.j jVar2 = this.F0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f49863i0, false);
            D0(null, true);
            if (jVar instanceof yf.v2) {
                ValueAnimator valueAnimator = this.X0;
                if (valueAnimator != null && this.V0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.N0.removeView(jVar);
        g0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            xf.t1 t1Var = this.f15315z0;
            t1Var.f49382b.remove(uuid);
            t1Var.f49383c.remove(uuid);
            AndroidUtilities.runOnUIThread(new pf.o1(t1Var, 14));
        }
        yf.w1 w1Var = this.Z0;
        k5.i iVar = this.f15268a1;
        w1Var.setValueOverride(iVar);
        w1Var.setShowPreview(true);
        float f10 = iVar.get();
        xf.q1 q1Var = this.f15310w1;
        q1Var.f49335c = f10;
        E0(q1Var, null, false);
        if (!this.f15286j2 && (jVar instanceof yf.b2)) {
            wb wbVar = ((ya) this).f16412w2;
            kb kbVar = wbVar.T0;
            if (kbVar != null) {
                kbVar.s(null, null, true);
            }
            ya yaVar = wbVar.f16302r1;
            if (yaVar != null) {
                yaVar.q0();
            }
            mb mbVar = wbVar.Y0;
            if (mbVar != null) {
                mbVar.setHasRoundVideo(false);
            }
            a8 a8Var = wbVar.G1;
            if (a8Var != null) {
                File file = a8Var.f14932o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    wbVar.G1.f14932o0 = null;
                }
                if (wbVar.G1.f14934p0 != null) {
                    try {
                        new File(wbVar.G1.f14934p0).delete();
                    } catch (Exception unused2) {
                    }
                    wbVar.G1.f14934p0 = null;
                }
            }
        }
    }

    @Override
    public final void D() {
        P0(true);
    }

    public final boolean D0(yf.j jVar, boolean z10) {
        boolean z11;
        gc gcVar;
        gc gcVar2;
        uj0 uj0Var;
        int i9;
        boolean z12 = jVar instanceof yf.v2;
        int i10 = 2;
        int i11 = 0;
        if (z12 && (((i9 = this.V0) == -1 && this.U0 != 2) || (i9 != -1 && i9 != 2))) {
            ValueAnimator valueAnimator = this.X0;
            if (valueAnimator != null && i9 != 2) {
                valueAnimator.cancel();
            }
            if (this.f15312x1) {
                I0(false);
            }
            R0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            yf.v2 v2Var = (yf.v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            yf.o1 o1Var = this.f15281h1;
            o1Var.setAlignment(i10);
            xf.i0 typeface = v2Var.getTypeface();
            if (typeface != null) {
                o1Var.setTypeface(typeface.f49240a);
            }
            o1Var.e(v2Var.getType(), true);
            this.Q0.invalidate();
        }
        yf.j jVar2 = this.F0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.W) {
                    if (jVar instanceof yf.s0) {
                        yf.s0 s0Var = (yf.s0) jVar;
                        s0Var.setType((s0Var.getType() + 1) % s0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof yf.w2) {
                        yf.w2 w2Var = (yf.w2) jVar;
                        w2Var.setType((w2Var.getType() + 1) % w2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof yf.p0) {
                        yf.p0 p0Var = (yf.p0) jVar;
                        yf.n0 n0Var = p0Var.m0;
                        if (n0Var.e()) {
                            if (n0Var.getPreviewType() == 0) {
                                i11 = 1;
                            }
                            n0Var.setPreviewType(i11);
                            return true;
                        }
                        p0Var.setType(p0Var.getNextType());
                        return true;
                    } else if (!this.G0) {
                        if (jVar instanceof yf.v2) {
                            this.I0 = true;
                            r0();
                            return true;
                        } else if (jVar instanceof yf.a2) {
                            yf.a2 a2Var = (yf.a2) jVar;
                            if (this.Y1 && this.W1 == jVar) {
                                a2Var.q(true);
                                return true;
                            }
                            yf.a2 a2Var2 = this.W1;
                            if (a2Var2 != null && a2Var2 != a2Var && (uj0Var = this.V1) != null) {
                                uj0Var.animate().alpha(0.0f).setListener(new l5(uj0Var, 0));
                                this.V1 = null;
                                this.Y1 = false;
                                this.X1 = 0.0f;
                            }
                            if (this.V1 == null) {
                                uj0 uj0Var2 = new uj0(2, this.B1, getContext(), LaunchActivity.R(), new ih.n2(6, new ih.b()));
                                this.V1 = uj0Var2;
                                org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(this.a2, uj0Var2, 0, false);
                                this.V1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.I1.addView(this.V1, g7.e6.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                uj0 uj0Var3 = this.V1;
                                ?? obj = new Object();
                                obj.f1416e = this;
                                obj.f1415c = faVar;
                                obj.d = paint;
                                obj.f1414b = new Path();
                                uj0Var3.setDelegate(obj);
                                this.V1.p(null, null, true);
                            }
                            this.V1.setFragment(LaunchActivity.R());
                            this.W1 = a2Var;
                            O0(true);
                            return true;
                        } else {
                            M0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof yf.v2) {
                        AndroidUtilities.showKeyboard(((yf.v2) jVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.f49863i0, false);
            yf.j jVar3 = this.F0;
            if (jVar3 instanceof yf.v2) {
                yf.v2 v2Var2 = (yf.v2) jVar3;
                yf.u2 u2Var = v2Var2.m0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    this.G0 = false;
                    AndroidUtilities.hideKeyboard(((yf.v2) this.F0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar3 instanceof yf.b2) && (gcVar2 = ((ya) this).f16412w2.V0) != null) {
                gcVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        yf.j jVar4 = this.F0;
        this.F0 = jVar;
        if ((jVar4 instanceof yf.v2) && TextUtils.isEmpty(((yf.v2) jVar4).getText())) {
            C0(jVar4);
        }
        yf.j jVar5 = this.F0;
        if (jVar4 != jVar5 && (jVar5 instanceof yf.b2) && (gcVar = ((ya) this).f16412w2.V0) != null) {
            gcVar.l(true);
        }
        yf.j jVar6 = this.F0;
        k5.i iVar = this.f15268a1;
        xf.q1 q1Var = this.f15310w1;
        yf.w1 w1Var = this.Z0;
        if (jVar6 != null) {
            b6 b6Var = this.M0;
            jVar6.f49863i0 = b6Var;
            jVar6.l(b6Var, true);
            yf.j jVar7 = this.F0;
            if (jVar7 instanceof yf.v2) {
                yf.v2 v2Var3 = (yf.v2) jVar7;
                v2Var3.getSwatch().f49335c = q1Var.f49335c;
                v2Var3.f50147v0 = false;
                F0(v2Var3.getSwatch());
                w1Var.setValueOverride(new k5(v2Var3, (int) (this.D0.f32026a / 9.0f), 0));
                w1Var.setShowPreview(false);
            } else {
                w1Var.setValueOverride(iVar);
                w1Var.setShowPreview(true);
                q1Var.f49335c = iVar.get();
                E0(q1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.X0;
            if (valueAnimator2 != null && this.V0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.f15312x1) {
                I0(false);
            }
            R0(0);
            w1Var.setValueOverride(iVar);
            w1Var.setShowPreview(true);
            q1Var.f49335c = iVar.get();
            E0(q1Var, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(xf.q1 q1Var, Integer num, boolean z10) {
        xf.q1 q1Var2 = this.f15310w1;
        if (q1Var2 != q1Var) {
            q1Var2.f49333a = q1Var.f49333a;
            q1Var2.f49334b = q1Var.f49334b;
            q1Var2.f49335c = q1Var.f49335c;
            int i9 = this.B1;
            xf.s0.e(i9).h(q1Var.f49333a, true);
            xf.s0.e(i9).j(q1Var.f49335c);
        }
        int i10 = q1Var.f49333a;
        w5 w5Var = this.K0;
        w5Var.setColor(i10);
        w5Var.setBrushSize(q1Var.f49335c);
        int i11 = q1Var2.f49333a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new p4(this, num, i11, 0));
            duration.start();
        } else {
            c6 c6Var = this.P0;
            if (c6Var != null) {
                c6Var.invalidate();
            }
        }
        yf.j jVar = this.F0;
        if (jVar instanceof yf.v2) {
            ((yf.v2) jVar).setSwatch(new xf.q1(q1Var.f49334b, q1Var.f49335c, q1Var.f49333a));
        } else if (z10 && (jVar instanceof yf.s0)) {
            ((yf.s0) jVar).setColor(q1Var.f49333a);
            ((yf.s0) this.F0).setType(3);
        } else if (z10 && (jVar instanceof yf.w2)) {
            ((yf.w2) jVar).setColor(q1Var.f49333a);
            ((yf.w2) this.F0).setType(3);
        } else if (z10 && (jVar instanceof yf.p0)) {
            ((yf.p0) jVar).setColor(q1Var.f49333a);
            ((yf.p0) this.F0).setType(0);
        }
    }

    public final void F0(xf.q1 q1Var) {
        E0(q1Var, null, false);
    }

    @Override
    public final void G(int i9, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        if (i9 > AndroidUtilities.dp(50.0f) && this.f15293n2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f15303s2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f15303s2).commit();
            } else {
                this.f15301r2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f15301r2).commit();
            }
        }
        boolean z13 = this.f15291m2;
        j5 j5Var = this.K1;
        if (z13) {
            if (z10) {
                i10 = this.f15303s2;
            } else {
                i10 = this.f15301r2;
            }
            int paddingUnderContainer = this.I1.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f15289l2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = AndroidUtilities.displaySize.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.f15289l2.setLayoutParams(layoutParams);
                this.f15297p2 = layoutParams.height;
                j5Var.a();
                requestLayout();
            }
        }
        if (this.f15305t2 == i9 && this.f15307u2 == z10) {
            return;
        }
        this.f15305t2 = i9;
        this.f15307u2 = z10;
        boolean z14 = this.f15293n2;
        yf.j jVar = this.F0;
        if (jVar instanceof yf.v2) {
            if (((yf.v2) jVar).getEditText().isFocused() && j5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f15293n2 = z12;
        } else {
            this.f15293n2 = false;
        }
        if (this.f15293n2 && this.f15291m2) {
            J0(0);
        }
        if (this.f15297p2 != 0 && !(z11 = this.f15293n2) && z11 != z14 && !this.f15291m2) {
            this.f15297p2 = 0;
            j5Var.a();
            requestLayout();
        }
        U0();
        if (z14 && !this.f15293n2 && this.f15297p2 > 0 && this.f15299q2) {
            this.f15299q2 = false;
        }
        S0();
    }

    public final void H0() {
        int i9;
        Emoji.EmojiSpan[] emojiSpanArr;
        yf.j jVar;
        ArrayList arrayList = this.M1;
        if (arrayList != null) {
            a8 a8Var = this.L1;
            this.L1 = null;
            this.M1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                a6 a6Var = this.N0;
                if (i10 < size) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i10);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        t5 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            n02.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = n02.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i9 = i10;
                        jVar = n02;
                    } else if (b10 == 1) {
                        yf.v2 o02 = o0(z10);
                        o02.setType(mediaEntity.subType);
                        o02.setTypeface(mediaEntity.textTypeface);
                        o02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i11);
                            i11++;
                            VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                            org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(emojiEntity2.document_id, 1.0f, o02.getFontMetricsInt());
                            int i12 = emojiEntity2.offset;
                            spannableString.setSpan(t5Var, i12, emojiEntity2.length + i12, 33);
                            i10 = i10;
                        }
                        i9 = i10;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, o02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        o02.setText(replaceEmoji);
                        G0(o02, mediaEntity.textAlign);
                        xf.q1 swatch = o02.getSwatch();
                        swatch.f49333a = mediaEntity.color;
                        o02.setSwatch(swatch);
                        jVar = o02;
                    } else {
                        i9 = i10;
                        if (b10 == 2) {
                            yf.x1 k02 = k0(mediaEntity.text, false);
                            k02.C0 = mediaEntity.crop;
                            k02.f50178x0 = false;
                            if ((2 & mediaEntity.subType) != 0) {
                                k02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                k02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = k02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            jVar = k02;
                        } else if (b10 == 6) {
                            ArrayList arrayList3 = a8Var.v;
                            boolean z11 = a8Var.K;
                            this.f15282h2 = true;
                            yf.j s5Var = new s5(this, getContext(), e0(), arrayList3, this.a2, z11, this.f15270b2);
                            s5Var.setDelegate(this);
                            a6Var.addView(s5Var);
                            g0();
                            jVar = s5Var;
                            if (mediaEntity.viewWidth > 0) {
                                jVar = s5Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = s5Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    jVar = s5Var;
                                }
                            }
                        } else if (b10 == 3) {
                            yf.s0 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                            int i13 = mediaEntity.color;
                            if (i13 != 0) {
                                j02.setColor(i13);
                            }
                            j02.setType(mediaEntity.subType);
                            jVar = j02;
                        } else if (b10 == 8) {
                            tc tcVar = mediaEntity.weather;
                            if (tcVar != null) {
                                yf.w2 p02 = p0(tcVar);
                                int i14 = mediaEntity.color;
                                if (i14 != 0) {
                                    p02.setColor(i14);
                                }
                                p02.setType(mediaEntity.subType);
                                jVar = p02;
                            } else {
                                i10 = i9 + 1;
                                z10 = false;
                            }
                        } else if (b10 == 7) {
                            yf.p0 i02 = i0(mediaEntity.linkSettings);
                            yf.n0 n0Var = i02.m0;
                            int i15 = mediaEntity.color;
                            if (i15 != 0) {
                                i02.setColor(i15);
                            }
                            boolean e10 = n0Var.e();
                            int i16 = n0Var.h;
                            int i17 = n0Var.f50016f;
                            if (e10) {
                                n0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                i02.setType(3);
                                n0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(n0Var.T)) + i17 + i17;
                                mediaEntity.viewHeight = ((int) Math.ceil(n0Var.U)) + i16 + i16;
                                PointF position = i02.getPosition();
                                position.y = (this.O1 * 0.3f) + position.y;
                                i02.setPosition(position);
                                i10 = i9 + 1;
                                z10 = false;
                            } else {
                                i02.setType(b11);
                                jVar = i02;
                            }
                        } else if (b10 == 4) {
                            yf.a2 l02 = l0(false);
                            l02.s(hg.r0.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                l02.r(false);
                            }
                            jVar = l02;
                            if (mediaEntity.mediaArea.dark) {
                                l02.q(false);
                                jVar = l02;
                            }
                        } else {
                            if (b10 == 5 && a8Var.f14932o0 != null) {
                                yf.b2 m0 = m0(a8Var.f14934p0, false);
                                wb wbVar = ((ya) this).f16412w2;
                                kb kbVar = wbVar.T0;
                                if (kbVar != null) {
                                    kbVar.f15958w = m0;
                                    k61 k61Var = kbVar.f15960x;
                                    if (k61Var != null) {
                                        k61Var.W(m0.f49763q0);
                                    }
                                }
                                mb mbVar = wbVar.Y0;
                                if (mbVar != null) {
                                    mbVar.setHasRoundVideo(true);
                                }
                                jVar = m0;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !m0.f49760n0;
                                    m0.f49760n0 = z12;
                                    m0.f49761o0.f(z12, true);
                                    m0.invalidate();
                                    jVar = m0;
                                }
                            }
                            i10 = i9 + 1;
                            z10 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f19673x * this.N1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f19674y * this.O1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                    jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
                    jVar.setScale(mediaEntity.scale);
                    jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                    i10 = i9 + 1;
                    z10 = false;
                } else {
                    a6Var.setVisibility(0);
                    return;
                }
            }
        }
    }

    public final void I0(final boolean z10) {
        float f10;
        boolean z11;
        if (this.f15312x1 != z10) {
            this.f15312x1 = z10;
            o1.j jVar = this.f15314y1;
            if (jVar != null) {
                jVar.c();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new gb.a(f10));
            this.f15314y1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f11 = 0.0f;
            }
            kVar.f18807i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f18800u = kVar;
            if (!this.K1.c() && this.f15297p2 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.P0.getTranslationY();
            final float alpha = this.f15311x0.getAlpha();
            final ViewGroup barView = getBarView();
            this.f15314y1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    float f14;
                    int i9;
                    g6 g6Var = g6.this;
                    c6 c6Var = g6Var.P0;
                    float f15 = f12 / 1000.0f;
                    g6Var.f15316z1 = f15;
                    float f16 = 1.0f;
                    float f17 = ((1.0f - f15) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f17);
                    view.setScaleY(f17);
                    view.setTranslationY((Math.min(g6Var.f15316z1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(g6Var.f15316z1, 0.25f) / 0.25f));
                    h5 h5Var = g6Var.f15302s1;
                    float f18 = g6Var.f15316z1;
                    boolean z12 = z10;
                    h5Var.y1(f18, z12);
                    yf.j1 j1Var = g6Var.f15311x0;
                    j1Var.setProgress(g6Var.f15316z1);
                    yf.f1 f1Var = g6Var.f15309w0;
                    f1Var.setProgress(g6Var.f15316z1);
                    g6Var.S0.setTranslationY(AndroidUtilities.dp(32.0f) * g6Var.f15316z1);
                    AnimatorSet animatorSet = g6Var.J1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f19 = g6Var.f15316z1;
                        if (!z12) {
                            f19 = 1.0f - f19;
                        }
                        if (z12) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        float f20 = alpha;
                        j1Var.setAlpha(AndroidUtilities.lerp(f20, f14, f19));
                        if (!z12) {
                            f16 = 0.0f;
                        }
                        f1Var.setAlpha(AndroidUtilities.lerp(f20, f16, f19));
                        float dp = AndroidUtilities.dp(39.0f) * f19;
                        if (z12) {
                            i9 = 1;
                        } else {
                            i9 = -1;
                        }
                        c6Var.setTranslationY(translationY - (dp * i9));
                    }
                    c6Var.invalidate();
                    if (view == g6Var.f15281h1) {
                        g6Var.Q0.invalidate();
                    }
                }
            });
            this.f15314y1.a(new r4(this, z10, 0));
            this.f15314y1.f();
            if (z10) {
                h5 h5Var = this.f15302s1;
                h5Var.setVisibility(0);
                h5Var.setSelectedColorIndex(xf.s0.e(this.B1).d());
            }
        }
    }

    public final void J0(int i9) {
        boolean z10;
        int i10;
        yf.o1 o1Var = this.f15281h1;
        j5 j5Var = this.K1;
        if (i9 == 1) {
            wy wyVar = this.f15289l2;
            if (wyVar != null && wyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            wy wyVar2 = this.f15289l2;
            vb vbVar = this.I1;
            if (wyVar2 != null && wyVar2.Y0 != UserConfig.selectedAccount) {
                vbVar.removeView(wyVar2);
                this.f15289l2 = null;
            }
            if (this.f15289l2 == null) {
                wy wyVar3 = new wy(null, true, false, false, getContext(), false, null, null, true, this.C1, false, false);
                this.f15289l2 = wyVar3;
                wyVar3.f34447t2 = false;
                wyVar3.Q0 = true;
                wyVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f15289l2.setForseMultiwindowLayout(true);
                }
                this.f15289l2.setDelegate(new v5(this));
                vbVar.addView(this.f15289l2);
            }
            this.f15289l2.setVisibility(0);
            this.f15291m2 = true;
            wy wyVar4 = this.f15289l2;
            if (this.f15301r2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f15301r2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f15301r2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f15303s2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f15303s2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f15303s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f15303s2;
            } else {
                i10 = this.f15301r2;
            }
            int paddingUnderContainer = vbVar.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            wyVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                yf.j jVar = this.F0;
                if (jVar instanceof yf.v2) {
                    AndroidUtilities.hideKeyboard(((yf.v2) jVar).getEditText());
                }
            }
            this.f15297p2 = paddingUnderContainer;
            j5Var.a();
            requestLayout();
            qg emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(og.d, true);
            }
            if (!z10) {
                if (this.f15293n2) {
                    this.f15299q2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f15297p2, 0.0f);
                    ofFloat.addUpdateListener(new s4(this, 1));
                    ofFloat.addListener(new m5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                    ofFloat.start();
                }
            }
        } else {
            qg emojiButton2 = o1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(og.f31383e, true);
            }
            wy wyVar5 = this.f15289l2;
            if (wyVar5 != null) {
                this.f15291m2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    wyVar5.setVisibility(8);
                }
            }
            if (i9 == 0) {
                this.f15297p2 = 0;
                j5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(yf.p0 p0Var) {
        k8 k8Var = new k8(getContext(), this.C1, this.f15272c2, new fh.f1(12, this, p0Var));
        if (p0Var != null) {
            yf.m0 m0Var = p0Var.f50063q0;
            k8Var.Y = true;
            org.telegram.ui.Cells.j3 j3Var = k8Var.V;
            org.telegram.ui.Cells.j3 j3Var2 = k8Var.U;
            if (m0Var != null) {
                k8Var.f15541c0 = m0Var.d;
                k8Var.f15542d0 = false;
                j3Var2.setText(m0Var.f49977c);
                j3Var.setText(m0Var.f49976b);
                k8Var.f15547i0 = !TextUtils.isEmpty(m0Var.f49976b);
                k8Var.f15548j0 = m0Var.f49979f;
                k8Var.f15549k0 = m0Var.f49978e;
            } else {
                j3Var2.setText("");
                j3Var.setText("");
                k8Var.f15548j0 = true;
                k8Var.f15549k0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = k8Var.X;
            dVar.g(string, false, true);
            g8 g8Var = k8Var.T;
            if (g8Var != null) {
                g8Var.N(false);
            }
            dVar.setEnabled(k8Var.U(j3Var2.getText().toString()));
            k8Var.Y = false;
        }
        k8Var.setOnDismissListener(new c5(this, 1));
        k8Var.show();
        z0(true);
    }

    public final void L0(yf.s0 s0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ki kiVar = new ki(getContext(), new q5(this, callback2), false, true, false, this.C1);
        kiVar.V1 = new Object();
        mh mhVar = kiVar.f30158t1;
        if (s0Var != null && (messageMedia = s0Var.f50103q0) != null && (geoPoint = messageMedia.geo) != null) {
            kiVar.f30159t2 = new double[]{geoPoint.lat, geoPoint._long};
            kiVar.K = true;
            mhVar.setVisibility(8);
        } else if (this.Q1) {
            kiVar.f30152r2 = this.S1;
            kiVar.f30156s2 = this.R1;
            kiVar.K = true;
            mhVar.setVisibility(8);
        } else {
            kiVar.K = true;
            mhVar.setVisibility(8);
        }
        kiVar.setOnDismissListener(new c5(this, 0));
        kiVar.r1();
        kiVar.show();
    }

    public final void M0(yf.j jVar) {
        if (jVar instanceof yf.e1) {
            org.telegram.ui.ActionBar.o1 o1Var = this.D1;
            if (o1Var != null && o1Var.isShowing()) {
                this.D1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f15288k2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        a6 a6Var = this.N0;
        float scaleX2 = a6Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = a6Var.getScaleY() * scaleY * jVar.getHeight();
        int i9 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i9;
        int i10 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i10;
        N0(new w4(this, jVar, 1), this, 51, i9, i10 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, g6 g6Var, int i9, int i10, int i11, boolean z10) {
        org.telegram.ui.ActionBar.o1 o1Var = this.D1;
        if (o1Var != null && o1Var.isShowing()) {
            this.D1.d(true);
            return;
        }
        if (this.E1 == null) {
            this.F1 = new Rect();
            e6 e6Var = new e6(this, getContext());
            this.E1 = e6Var;
            e6Var.setAnimationEnabled(true);
            this.E1.setOnTouchListener(new y4(this, 0));
            this.E1.setDispatchKeyEventListener(new z4(this));
            this.E1.setShownFromBottom(true);
        }
        e6 e6Var2 = this.E1;
        e6Var2.S = z10;
        e6Var2.d();
        runnable.run();
        if (this.D1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.E1, -2, -2);
            this.D1 = o1Var2;
            o1Var2.f23688b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.D1.setOutsideTouchable(true);
            this.D1.setClippingEnabled(true);
            this.D1.setInputMethodMode(2);
            this.D1.setSoftInputMode(0);
            this.D1.getContentView().setFocusableInTouchMode(true);
            this.D1.setOnDismissListener(new a5(this, 0));
        }
        this.E1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.D1.setFocusable(true);
        int measuredWidth = i10 - (this.E1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.E1.getMeasuredHeight();
        this.D1.showAtLocation(g6Var, i9, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.o1.i(this.E1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            e6 e6Var3 = this.E1;
            e6Var3.setBackgroundDrawable(new org.telegram.ui.Components.ea(new org.telegram.ui.Components.fa(this.a2, e6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
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
                float f10 = 0.0f;
                if (z10) {
                    this.Z1 = true;
                    this.I1.invalidate();
                    float f11 = this.X1;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.V1.setTransitionProgress(this.X1);
                    ofFloat.addUpdateListener(new s4(this, 2));
                    ofFloat.addListener(new hg.b0(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(gr.f28845g);
                    ofFloat.start();
                    return;
                }
                if (this.V1.getReactionsWindow() != null) {
                    this.V1.getReactionsWindow().e();
                }
                this.V1.animate().alpha(0.0f).setDuration(150L).setListener(new m5(this, 0)).start();
            }
        }
    }

    public final void P0(boolean z10) {
        float f10;
        if (this.f15298q1 != z10) {
            this.f15298q1 = z10;
            o1.j jVar = this.f15300r1;
            if (jVar != null) {
                jVar.c();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new gb.a(f10));
            this.f15300r1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f11 = 0.0f;
            }
            kVar.f18807i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f18800u = kVar;
            if (z10) {
                yf.t1 t1Var = this.f15283i1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.f15300r1.b(new ih.x7(1, this));
            this.f15300r1.a(new r4(this, z10, 1));
            this.f15300r1.f();
        }
    }

    public final PointF Q0(yf.j jVar) {
        float f10;
        float f11 = 200.0f;
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            f11 = 200.0f / cropState.cropScale;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f12 = 100.0f;
        if (cropState != null) {
            f12 = 100.0f / cropState.cropScale;
        }
        PointF e02 = e0();
        int i9 = 0;
        while (i9 < 10) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                a6 a6Var = this.N0;
                if (i10 >= a6Var.getChildCount()) {
                    break;
                }
                View childAt = a6Var.getChildAt(i10);
                if (!(childAt instanceof yf.j) || (childAt instanceof yf.e1)) {
                    f10 = f12;
                } else {
                    PointF position2 = ((yf.j) childAt).getPosition();
                    f10 = f12;
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f10) {
                        f11 = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z10 = true;
                    }
                }
                i10++;
                f12 = f10;
            }
            float f13 = f12;
            if (!z10) {
                break;
            }
            i9++;
            e02 = new PointF(e02.x + f11, e02.y + f11);
            f12 = f13;
        }
        return e02;
    }

    @Override
    public final int R() {
        return this.K1.f14999l - this.I1.getBottomPadding2();
    }

    public final void R0(int i9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.U0 != i9 && this.V0 != i9) {
            ValueAnimator valueAnimator = this.X0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.U0;
            ViewGroup viewGroup3 = this.f15281h1;
            ViewGroup viewGroup4 = this.f15279g1;
            if (i10 == 0) {
                viewGroup = viewGroup4;
            } else if (i10 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.V0 = i9;
            if (i9 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i9 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i11 = this.B1;
            xf.s0 e10 = xf.s0.e(i11);
            if (i9 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f49367l != z10) {
                e10.f49367l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f49358a.getInt("brush", 0), false);
                }
            }
            int c10 = xf.s0.e(i11).c();
            xf.q1 q1Var = this.f15310w1;
            q1Var.f49333a = c10;
            E0(q1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.X0 = duration;
            duration.setInterpolator(gr.f28844f);
            this.X0.addUpdateListener(new ih.i3(this, viewGroup, viewGroup2, 1));
            this.X0.addListener(new o5(this, viewGroup, viewGroup2, i9, 0));
            this.X0.start();
        }
    }

    public final void S0() {
        boolean z10;
        j5 j5Var = this.K1;
        yf.o1 o1Var = this.f15281h1;
        if (o1Var != null) {
            if (j5Var.c()) {
                o1Var.a(R.drawable.input_smile);
            } else if (this.f15291m2) {
                o1Var.a(R.drawable.input_keyboard);
            } else {
                o1Var.a(R.drawable.msg_add);
            }
        }
        if (!j5Var.c() && !this.f15291m2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.f15287k1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f15285j1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f15290m1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.l1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        float f10;
        yf.j jVar;
        ObjectAnimator objectAnimator = this.f15276e2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.K0.getParent();
        if (view == null) {
            return;
        }
        j5 j5Var = this.K1;
        if (((j5Var.c() && !j5Var.d) || this.f15297p2 > 0) && (jVar = this.F0) != null) {
            f10 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f10);
        this.f15276e2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f15276e2.setInterpolator(gr.h);
        this.f15276e2.start();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: kh.g6.U0():void");
    }

    @Override
    public final void a() {
        I0(true);
    }

    @Override
    public final int[] b(yf.j jVar) {
        int[] iArr = this.f15288k2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    @Override
    public final void d() {
        this.A1.setColor(-15132391);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new ih.j7(15, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f15284i2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i9 = 0;
        if ((view == this.K0 || view == this.L0 || view == this.N0 || view == this.M0) && (cropState = this.B0) != null) {
            canvas.save();
            if (!this.J0) {
                i9 = AndroidUtilities.statusBarHeight;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i9;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = cropState.transformRotation;
            if (i10 != 90 && i10 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i9 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i9 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i9 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public final void e() {
        setTextType((this.H0 + 1) % 4);
    }

    public final PointF e0() {
        a6 a6Var = this.N0;
        int measuredWidth = a6Var.getMeasuredWidth();
        int measuredHeight = a6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.N1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.O1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override
    public final void f(int i9) {
        yf.j jVar = this.F0;
        if (jVar instanceof yf.v2) {
            G0((yf.v2) jVar, i9);
            xf.s0 e10 = xf.s0.e(this.B1);
            e10.f49363g = i9;
            e10.f49358a.edit().putInt("text_alignment", i9).apply();
        }
    }

    public abstract boolean f0(bg.c2 c2Var);

    public final void g0() {
        org.telegram.ui.Components.t5[] t5VarArr;
        boolean z10 = this.S1;
        a6 a6Var = this.N0;
        boolean z11 = true;
        if (!z10 && !this.U1) {
            int i9 = 0;
            loop0: while (true) {
                if (i9 < a6Var.getChildCount()) {
                    View childAt = a6Var.getChildAt(i9);
                    boolean z12 = childAt instanceof yf.v2;
                    int i10 = this.B1;
                    if (z12) {
                        CharSequence text = ((yf.v2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.t5.class)) {
                                TLRPC.Document document = t5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.k5.f(i10, t5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.k5.h(i10).e(document);
                                }
                                if (a8.u(document, FileLoader.getInstance(i10).getPathToAttach(document, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i9++;
                    } else if (childAt instanceof yf.n2) {
                        TLRPC.Document sticker = ((yf.n2) childAt).getSticker();
                        if (a8.u(sticker, FileLoader.getInstance(i10).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i9++;
                    } else if (childAt instanceof yf.b2) {
                        break;
                    } else {
                        i9++;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
        }
        for (int i11 = 0; i11 < a6Var.getChildCount(); i11++) {
            View childAt2 = a6Var.getChildAt(i11);
            if (childAt2 instanceof yf.j) {
                ((yf.j) childAt2).setIsVideo(z11);
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
        return this.f15309w0;
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
        return this.f15311x0;
    }

    public View getEntitiesView() {
        return this.N0;
    }

    public long getLcm() {
        return this.f15271c1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.t5[] t5VarArr;
        a6 a6Var = this.N0;
        int childCount = a6Var.getChildCount();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = a6Var.getChildAt(i9);
            if (childAt instanceof yf.n2) {
                TLRPC.Document sticker = ((yf.n2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f22392id = sticker.f22386id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof yf.v2) {
                CharSequence text = ((yf.v2) childAt).getText();
                if ((text instanceof Spanned) && (t5VarArr = (org.telegram.ui.Components.t5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.t5.class)) != null) {
                    for (org.telegram.ui.Components.t5 t5Var : t5VarArr) {
                        if (t5Var != null) {
                            TLRPC.Document document = t5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.k5.f(this.B1, t5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f22392id = document.f22386id;
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

    public xf.c1 getRenderView() {
        return this.K0;
    }

    public yf.j getSelectedEntity() {
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

    public final TextView h0(int i9, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, this.C1));
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i9));
        textView.setText(str);
        return textView;
    }

    public final yf.p0 i0(yf.m0 m0Var) {
        int measuredWidth;
        int i9;
        this.f15282h2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        a6 a6Var = this.N0;
        if (a6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.N1;
        } else {
            measuredWidth = a6Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int dp = ((int) f10) - AndroidUtilities.dp(58.0f);
        yf.p0 p0Var = new yf.p0(getContext(), Q0, this.B1, m0Var, f10 / 360.0f, dp);
        if (Q0.x == a6Var.getMeasuredWidth() / 2.0f) {
            p0Var.setStickyX(2);
        }
        if (Q0.y == a6Var.getMeasuredHeight() / 2.0f) {
            p0Var.setStickyY(2);
        }
        xf.q1 q1Var = this.f15310w1;
        if (q1Var != null && (i9 = q1Var.f49333a) != -47814) {
            p0Var.setColor(i9);
        }
        p0Var.setDelegate(this);
        p0Var.setMaxWidth(dp);
        a6Var.addView(p0Var, g7.e6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            p0Var.j(1.0f / cropState.cropScale);
            p0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return p0Var;
    }

    public final yf.s0 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i9;
        this.f15282h2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        a6 a6Var = this.N0;
        if (a6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.N1;
        } else {
            measuredWidth = a6Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int dp = ((int) f10) - AndroidUtilities.dp(58.0f);
        yf.s0 s0Var = new yf.s0(getContext(), Q0, this.B1, messageMedia, mediaArea, f10 / 240.0f, dp);
        if (Q0.x == a6Var.getMeasuredWidth() / 2.0f) {
            s0Var.setStickyX(2);
        }
        if (Q0.y == a6Var.getMeasuredHeight() / 2.0f) {
            s0Var.setStickyY(2);
        }
        xf.q1 q1Var = this.f15310w1;
        if (q1Var != null && (i9 = q1Var.f49333a) != -47814) {
            s0Var.setColor(i9);
        }
        s0Var.setDelegate(this);
        s0Var.setMaxWidth(dp);
        a6Var.addView(s0Var, g7.e6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            s0Var.j(1.0f / cropState.cropScale);
            s0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return s0Var;
    }

    @Override
    public final boolean k(yf.j jVar) {
        return D0(jVar, true);
    }

    public final yf.x1 k0(String str, boolean z10) {
        float f10;
        qu0 qu0Var;
        this.f15282h2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            FileLog.e(e10);
            f10 = 1.0f;
        }
        a6 a6Var = this.N0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.N1, a6Var.getMeasuredWidth()) * 0.5d);
            qu0Var = new qu0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.O1, a6Var.getMeasuredHeight()) * 0.5d);
            qu0Var = new qu0(f10 * floor2, floor2);
        }
        qu0 qu0Var2 = qu0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = qu0Var2.f32026a;
            qu0Var2.f32026a = qu0Var2.f32027b;
            qu0Var2.f32027b = f11;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        yf.x1 x1Var = new yf.x1(context, e02, qu0Var2, str, intValue);
        x1Var.setDelegate(this);
        a6Var.addView(x1Var);
        g0();
        return x1Var;
    }

    public final yf.a2 l0(boolean z10) {
        String str;
        qu0 qu0Var = new qu0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        a6 a6Var = this.N0;
        if (a6Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i9 = 0; i9 < a6Var.getChildCount(); i9++) {
                    View childAt = a6Var.getChildAt(i9);
                    if (g7.w.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (a6Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (a6Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, a6Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, a6Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new yf.j(getContext(), e02);
        jVar.f49741n0 = new ih.s8(jVar);
        jVar.f49742o0 = new ih.s8(jVar);
        jVar.f49743p0 = new hg.i0(jVar);
        jVar.f49744q0 = new hg.i0(jVar);
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5((View) jVar);
        jVar.f49746s0 = y5Var;
        org.telegram.ui.Components.y5 y5Var2 = new org.telegram.ui.Components.y5((View) jVar);
        jVar.f49747t0 = y5Var2;
        jVar.f49749v0 = 1.0f;
        jVar.m0 = qu0Var;
        y5Var2.d(1.0f, true);
        y5Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        hg.i0 i0Var = jVar.f49743p0;
        int i10 = 0;
        while (true) {
            if (i10 < reactionsList.size()) {
                if (reactionsList.get(i10).title.equals("Red Heart")) {
                    str = reactionsList.get(i10).reaction;
                    break;
                }
                i10++;
            } else {
                str = reactionsList.get(0).reaction;
                break;
            }
        }
        hg.r0 b10 = hg.r0.b(str);
        jVar.f49745r0 = b10;
        i0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        a6Var.addView(jVar);
        g0();
        if (z10) {
            B0(jVar);
            D0(jVar, true);
        }
        return jVar;
    }

    @Override
    public final boolean m(MotionEvent motionEvent) {
        if (this.f15284i2) {
            return false;
        }
        if (this.F0 != null) {
            D0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.K0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final yf.b2 m0(String str, boolean z10) {
        float f10;
        this.f15282h2 = true;
        this.f15286j2 = true;
        q0();
        a6 a6Var = this.N0;
        int measuredWidth = a6Var.getMeasuredWidth();
        a6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.N1;
        }
        float floor = (float) Math.floor(0.43f * f10);
        qu0 qu0Var = new qu0(floor, floor);
        yf.b2 b2Var = new yf.b2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (qu0Var.f32027b / 2.0f) + AndroidUtilities.dp(72.0f)), qu0Var, str);
        b2Var.setDelegate(this);
        a6Var.addView(b2Var);
        g0();
        if (z10) {
            B0(b2Var);
            post(new n4(this, b2Var, 0));
        }
        this.f15286j2 = false;
        return b2Var;
    }

    @Override
    public final void n(xf.m mVar) {
        boolean z10 = mVar instanceof xf.b;
        yf.w1 w1Var = this.Z0;
        if (!z10 && !(mVar instanceof xf.d)) {
            w1Var.b(0.05f, 1.0f);
        } else {
            w1Var.b(0.4f, 1.75f);
        }
        w1Var.setDrawCenter(!(mVar instanceof xf.l));
        w5 w5Var = this.K0;
        if (w5Var.getCurrentBrush() instanceof xf.l) {
            this.Y0 = true;
        }
        w5Var.setBrush(mVar);
        xf.q1 q1Var = this.f15310w1;
        int i9 = q1Var.f49333a;
        q1Var.f49333a = xf.s0.e(this.B1).c();
        q1Var.f49335c = this.f15268a1.get();
        E0(q1Var, Integer.valueOf(i9), false);
        this.L0.invalidate();
    }

    public final t5 n0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i9 = 0; i9 < document.attributes.size() && !(document.attributes.get(i9) instanceof TLRPC.TL_documentAttributeSticker); i9++) {
        }
        float f11 = 0.75f;
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            f10 = -(cropState.transformRotation + cropState.cropRotate);
            f11 = 0.75f / cropState.cropScale;
        } else {
            f10 = 0.0f;
        }
        f6 f6Var = new f6(e0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f32026a * 0.5d);
        t5 t5Var = new t5(this, context, f6Var.f15233a, f6Var.f15235c, f6Var.f15234b, new qu0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = t5Var.f50040t0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        t5Var.setDelegate(this);
        this.N0.addView(t5Var);
        g0();
        return t5Var;
    }

    public final yf.v2 o0(boolean z10) {
        qu0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        yf.v2 v2Var = new yf.v2(getContext(), Q0, (int) (paintingSize.f32026a / 9.0f), "", this.f15310w1, this.H0);
        float f10 = paintingSize.f32026a / 9.0f;
        x4 x4Var = new x4(this, 0);
        v2Var.f50144s0 = (int) (0.5f * f10);
        v2Var.f50145t0 = (int) (f10 * 2.0f);
        v2Var.f50146u0 = x4Var;
        float f11 = Q0.x;
        a6 a6Var = this.N0;
        if (f11 == a6Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (Q0.y == a6Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth(this.N1 - AndroidUtilities.dp(32.0f));
        int i9 = this.B1;
        v2Var.setTypeface(xf.s0.e(i9).f49365j);
        v2Var.setType(xf.s0.e(i9).h);
        a6Var.addView(v2Var, g7.e6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            v2Var.j(1.0f / cropState.cropScale);
            v2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            B0(v2Var);
            v2Var.q();
            D0(v2Var, false);
            v2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(v2Var.getFocusedView());
            this.G0 = true;
            int i10 = xf.s0.e(i9).f49363g;
            yf.o1 o1Var = this.f15281h1;
            o1Var.d(i10, true);
            o1Var.setOutlineType(xf.s0.e(i9).h);
        }
        return v2Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        uj0 uj0Var = this.V1;
        if (uj0Var != null) {
            AndroidUtilities.removeFromParent(uj0Var);
            this.V1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float currentActionBarHeight;
        float f10;
        float f11;
        this.C0 = true;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.f15313y0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f10 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f10)) > currentActionBarHeight2) {
            Math.floor((f11 * f10) / currentActionBarHeight);
        }
        float f12 = this.D0.f32026a;
        yf.j jVar = this.F0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.P0, i9, i10);
        measureChild(this.Z0, i9, i10);
        measureChild(this.R0, i9, i10);
        measureChild(this.Q0, i9, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f15297p2 - this.I1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.O0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i9, i10);
        this.C0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f15291m2 && !this.f15295o2) {
            this.C0 = true;
            w0();
            this.C0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    public final yf.w2 p0(tc tcVar) {
        int measuredWidth;
        int i9;
        this.f15282h2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        a6 a6Var = this.N0;
        if (a6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.N1;
        } else {
            measuredWidth = a6Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int dp = ((int) f10) - AndroidUtilities.dp(58.0f);
        yf.w2 w2Var = new yf.w2(getContext(), Q0, this.B1, tcVar, f10 / 240.0f, dp);
        if (Q0.x == a6Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (Q0.y == a6Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        xf.q1 q1Var = this.f15310w1;
        if (q1Var != null && (i9 = q1Var.f49333a) != -47814) {
            w2Var.setColor(i9);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth(dp);
        a6Var.addView(w2Var, g7.e6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            w2Var.j(1.0f / cropState.cropScale);
            w2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return w2Var;
    }

    public final void q0() {
        int i9 = 0;
        while (true) {
            a6 a6Var = this.N0;
            if (i9 < a6Var.getChildCount()) {
                View childAt = a6Var.getChildAt(i9);
                if (childAt instanceof yf.b2) {
                    if (this.F0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(gr.h).withEndAction(new n4(this, (yf.b2) childAt, 1)).start();
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean r() {
        return !(this.F0 instanceof yf.e1);
    }

    public abstract void r0();

    @Override
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        return !this.G0;
    }

    public final yf.e1 s0() {
        int i9 = 0;
        while (true) {
            a6 a6Var = this.N0;
            if (i9 < a6Var.getChildCount()) {
                View childAt = a6Var.getChildAt(i9);
                if (childAt instanceof yf.e1) {
                    return (yf.e1) childAt;
                }
                i9++;
            } else {
                return null;
            }
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ba baVar) {
        this.a2 = baVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f15284i2 != z10) {
            this.f15284i2 = z10;
            if (z10) {
                D0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i9 = 0;
        while (true) {
            a6 a6Var = this.N0;
            if (i9 < a6Var.getChildCount()) {
                View childAt = a6Var.getChildAt(i9);
                if (childAt instanceof yf.n2) {
                    ImageReceiver imageReceiver = ((yf.n2) childAt).f50040t0;
                    mi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    imageReceiver.getAnimation();
                    if (lottieAnimation != null) {
                        lottieAnimation.L(Math.round(((((float) j10) % ((float) lottieAnimation.p())) / ((float) lottieAnimation.p())) * lottieAnimation.f30847e[0]), true, false);
                    }
                }
                i9++;
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

    public final android.graphics.Bitmap t0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, kh.a8 r46) {
        throw new UnsupportedOperationException("Method not decompiled: kh.g6.t0(java.util.ArrayList, boolean, boolean, boolean, boolean, kh.a8):android.graphics.Bitmap");
    }

    @Override
    public final void u() {
        if (!this.f15293n2 && !this.f15291m2) {
            this.f15282h2 = true;
            o0(true);
            return;
        }
        if (this.f15291m2) {
            yf.j jVar = this.F0;
            if (jVar instanceof yf.v2) {
                this.K1.f14993e = true;
                AndroidUtilities.showKeyboard(((yf.v2) jVar).getEditText());
            }
        }
        J0(!this.f15291m2 ? 1 : 0);
    }

    public final boolean u0() {
        if (!this.f15315z0.a() && !this.f15282h2) {
            return false;
        }
        return true;
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.K0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f10 - view2.getX()) - view.getLeft();
        float y10 = (f11 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y10 - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    public final void v0(boolean z10) {
        if (this.f15291m2) {
            J0(0);
        }
        if (z10) {
            wy wyVar = this.f15289l2;
            if (wyVar != null && wyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f15289l2.getMeasuredHeight());
                ofFloat.addUpdateListener(new s4(this, 0));
                this.f15295o2 = true;
                ofFloat.addListener(new m5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                ofFloat.start();
                return;
            }
            w0();
        }
    }

    @Override
    public final void w(yf.j jVar) {
        O0(false);
        M0(jVar);
    }

    public final void w0() {
        wy wyVar;
        if (!this.f15291m2 && (wyVar = this.f15289l2) != null && wyVar.getVisibility() != 8) {
            this.f15289l2.setVisibility(8);
        }
        int i9 = this.f15297p2;
        this.f15297p2 = 0;
        if (i9 != 0) {
            this.K1.a();
        }
    }

    @Override
    public final xf.s0 x() {
        return xf.s0.e(this.B1);
    }

    public final boolean y0() {
        if (this.Y1) {
            if (this.V1.getReactionsWindow() != null && !this.V1.getReactionsWindow().f10588q) {
                this.V1.e();
                return true;
            }
            O0(false);
            return true;
        } else if (this.f15312x1) {
            I0(false);
            return true;
        } else if (this.f15291m2) {
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

    public void setOffsetTranslationX(float f10) {
    }
}
