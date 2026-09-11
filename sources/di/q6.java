package di;

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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.LaunchActivity;
public abstract class q6 extends pv0 implements rg.s1, rg.i, rg.o1, nv0, lc {
    public final rg.h1 A0;
    public final qg.q1 A1;
    public final rg.l1 B0;
    public boolean B1;
    public final Bitmap C0;
    public o1.k C1;
    public final qg.t1 D0;
    public float D1;
    public final DispatchQueue E0;
    public final Paint E1;
    public final MediaController.CropState F0;
    public final int F1;
    public boolean G0;
    public final e6 G1;
    public iv0 H0;
    public org.telegram.ui.ActionBar.n1 H1;
    public boolean I0;
    public o6 I1;
    public rg.k J0;
    public Rect J1;
    public boolean K0;
    public Runnable K1;
    public int L0;
    public Runnable L1;
    public boolean M0;
    public final oc M1;
    public final boolean N0;
    public AnimatorSet N1;
    public final g6 O0;
    public final t5 O1;
    public final i6 P0;
    public o8 P1;
    public final l6 Q0;
    public ArrayList Q1;
    public final k6 R0;
    public int R1;
    public final FrameLayout S0;
    public int S1;
    public final m6 T0;
    public qg.x T1;
    public final q5 U0;
    public final boolean U1;
    public final FrameLayout V0;
    public final File V1;
    public x5 W0;
    public final boolean W1;
    public final View X0;
    public final boolean X1;
    public int Y0;
    public boolean Y1;
    public int Z0;
    public fk0 Z1;
    public float f7953a1;
    public rg.c2 a2;
    public ValueAnimator f7954b1;
    public float f7955b2;
    public boolean f7956c1;
    public boolean f7957c2;
    public final rg.y1 f7958d1;
    public boolean f7959d2;
    public final xa.c f7960e1;
    public org.telegram.ui.Components.ja f7961e2;
    public final int f7962f1;
    public final c7 f7963f2;
    public BigInteger f7964g1;
    public final d7 f7965g2;
    public TextView f7966h1;
    public boolean f7967h2;
    public TextView f7968i1;
    public ObjectAnimator f7969i2;
    public TextView f7970j1;
    public final float[] f7971j2;
    public final rg.t1 f7972k1;
    public z5 f7973k2;
    public final rg.q1 l1;
    public boolean f7974l2;
    public final rg.v1 f7975m1;
    public boolean f7976m2;
    public final ImageView f7977n1;
    public boolean f7978n2;
    public final TextView f7979o1;
    public final int[] f7980o2;
    public final TextView f7981p1;
    public kz f7982p2;
    public final TextView f7983q1;
    public boolean f7984q2;
    public final Paint f7985r1;
    public boolean f7986r2;
    public final Paint f7987s1;
    public boolean f7988s2;
    public float f7989t1;
    public int f7990t2;
    public boolean f7991u1;
    public boolean f7992u2;
    public o1.k f7993v1;
    public int f7994v2;
    public final r5 f7995w1;
    public int f7996w2;
    public final Paint f7997x1;
    public int f7998x2;
    public final Paint f7999y1;
    public boolean f8000y2;
    public final Paint f8001z1;

    public q6(Context context, boolean z10, File file, boolean z11, boolean z12, oc ocVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, o8 o8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ja jaVar, org.telegram.ui.ActionBar.f6 f6Var, c7 c7Var, d7 d7Var) {
        super(context, activity);
        g6 g6Var;
        Paint paint;
        org.telegram.ui.Components.ja jaVar2;
        DispatchQueue dispatchQueue;
        qg.s0 s0Var;
        Bitmap bitmap3;
        Paint paint2;
        Paint paint3;
        g6 g6Var2;
        int i14;
        this.Y0 = 0;
        this.Z0 = -1;
        final rb rbVar = (rb) this;
        xa.c cVar = new xa.c(rbVar, 16);
        this.f7960e1 = cVar;
        Paint paint4 = new Paint(1);
        this.f7985r1 = paint4;
        Paint paint5 = new Paint(1);
        this.f7987s1 = paint5;
        this.f7997x1 = new Paint(1);
        this.f7999y1 = new Paint(1);
        Paint paint6 = new Paint(1);
        this.f8001z1 = paint6;
        qg.q1 q1Var = new qg.q1(1.0f, 0.016773745f, -1);
        this.A1 = q1Var;
        this.E1 = new Paint(1);
        this.f7971j2 = new float[2];
        this.f7976m2 = false;
        this.f7980o2 = new int[2];
        new androidx.activity.i(rbVar, 18);
        setDelegate(this);
        this.f7961e2 = jaVar;
        this.f7963f2 = c7Var;
        this.U1 = z10;
        this.V1 = file;
        this.W1 = z11;
        this.X1 = z12;
        this.M1 = ocVar;
        this.R1 = i12;
        this.S1 = i13;
        this.f7965g2 = d7Var;
        this.F1 = i10;
        e6 e6Var = new e6(f6Var);
        this.G1 = e6Var;
        this.F0 = cropState;
        this.N0 = context instanceof BubbleActivity;
        qg.s0 e7 = qg.s0.e(i10);
        e7.i(0, true);
        q1Var.f44541a = e7.c();
        q1Var.f44543c = e7.f44572i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.E0 = dispatchQueue2;
        this.C0 = bitmap;
        this.f7962f1 = i11;
        qg.t1 t1Var = new qg.t1();
        this.D0 = t1Var;
        t1Var.f44589a = new a1.c(rbVar, 24);
        View view = new View(context);
        this.X0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        qg.q0 q0Var = new qg.q0(getPaintingSize(), null, i11, jaVar);
        if (o8Var == null || !o8Var.f7782u) {
            paint = paint6;
            jaVar2 = jaVar;
            dispatchQueue = dispatchQueue2;
            s0Var = e7;
            bitmap3 = bitmap;
            paint2 = paint5;
            paint3 = paint4;
            g6Var2 = g6Var;
        } else {
            paint = paint6;
            jaVar2 = null;
            s0Var = e7;
            bitmap3 = bitmap;
            paint2 = paint5;
            paint3 = paint4;
            g6Var2 = g6Var;
            dispatchQueue = dispatchQueue2;
        }
        g6Var2 = new g6(rbVar, context, q0Var, bitmap3, bitmap2, jaVar2);
        this.O0 = g6Var2;
        g6Var2.setDelegate(new h6(rbVar));
        g6Var2.setUndoStore(t1Var);
        g6Var2.setQueue(dispatchQueue);
        g6Var2.setVisibility(4);
        i6 i6Var = new i6(rbVar, context);
        this.P0 = i6Var;
        i6Var.setVisibility(4);
        k6 k6Var = new k6(rbVar, context, new j6(rbVar));
        this.R0 = k6Var;
        this.P1 = o8Var;
        this.Q1 = arrayList;
        if (this.R1 > 0 && this.S1 > 0) {
            H0();
        }
        k6Var.setVisibility(4);
        this.Q0 = new l6(rbVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, w7.x5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f7977n1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        rb rbVar2 = rbVar;
                        g6 g6Var3 = rbVar2.O0;
                        if (g6Var3 != null && (g6Var3.getCurrentBrush() instanceof qg.l)) {
                            g6Var3.b();
                            rbVar2.f7972k1.setSelectedIndex(1);
                            rbVar2.o((qg.m) qg.m.f44480a.get(0));
                            return;
                        }
                        rbVar2.D0.c();
                        return;
                    case 1:
                        rb rbVar3 = rbVar;
                        g6 g6Var4 = rbVar3.O0;
                        qg.t1 t1Var2 = rbVar3.D0;
                        if (t1Var2.a()) {
                            if (g6Var4 != null && (g6Var4.getCurrentBrush() instanceof qg.l)) {
                                g6Var4.b();
                                rbVar3.f7972k1.setSelectedIndex(1);
                                rbVar3.o((qg.m) qg.m.f44480a.get(0));
                            }
                            if (g6Var4 != null) {
                                g6Var4.a();
                            }
                            t1Var2.f44591c.clear();
                            t1Var2.f44590b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(t1Var2, 15));
                            rbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        rb rbVar4 = rbVar;
                        rg.k kVar = rbVar4.J0;
                        if (kVar instanceof rg.x2) {
                            AndroidUtilities.hideKeyboard(((rg.x2) kVar).getFocusedView());
                        }
                        if (rbVar4.f7984q2) {
                            rbVar4.v0(false);
                        }
                        rbVar4.C0(rbVar4.J0);
                        rbVar4.D0(null, true);
                        return;
                    case 3:
                        rbVar.D0(null, true);
                        return;
                    default:
                        rb rbVar5 = rbVar;
                        if (rbVar5.B1) {
                            rbVar5.I0(false);
                            return;
                        } else if (rbVar5.f7984q2) {
                            rbVar5.v0(true);
                            return;
                        } else if (rbVar5.K0) {
                            rbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = rbVar5.L1;
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
        frameLayout.addView(imageView, w7.x5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        vl.j(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, w7.x5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.x5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ah.f(3));
        frameLayout.addView(linearLayout, w7.x5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f7979o1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
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
                        rb rbVar2 = rbVar;
                        g6 g6Var3 = rbVar2.O0;
                        if (g6Var3 != null && (g6Var3.getCurrentBrush() instanceof qg.l)) {
                            g6Var3.b();
                            rbVar2.f7972k1.setSelectedIndex(1);
                            rbVar2.o((qg.m) qg.m.f44480a.get(0));
                            return;
                        }
                        rbVar2.D0.c();
                        return;
                    case 1:
                        rb rbVar3 = rbVar;
                        g6 g6Var4 = rbVar3.O0;
                        qg.t1 t1Var2 = rbVar3.D0;
                        if (t1Var2.a()) {
                            if (g6Var4 != null && (g6Var4.getCurrentBrush() instanceof qg.l)) {
                                g6Var4.b();
                                rbVar3.f7972k1.setSelectedIndex(1);
                                rbVar3.o((qg.m) qg.m.f44480a.get(0));
                            }
                            if (g6Var4 != null) {
                                g6Var4.a();
                            }
                            t1Var2.f44591c.clear();
                            t1Var2.f44590b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(t1Var2, 15));
                            rbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        rb rbVar4 = rbVar;
                        rg.k kVar = rbVar4.J0;
                        if (kVar instanceof rg.x2) {
                            AndroidUtilities.hideKeyboard(((rg.x2) kVar).getFocusedView());
                        }
                        if (rbVar4.f7984q2) {
                            rbVar4.v0(false);
                        }
                        rbVar4.C0(rbVar4.J0);
                        rbVar4.D0(null, true);
                        return;
                    case 3:
                        rbVar.D0(null, true);
                        return;
                    default:
                        rb rbVar5 = rbVar;
                        if (rbVar5.B1) {
                            rbVar5.I0(false);
                            return;
                        } else if (rbVar5.f7984q2) {
                            rbVar5.v0(true);
                            return;
                        } else if (rbVar5.K0) {
                            rbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = rbVar5.L1;
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
        TextView f7 = org.telegram.ui.Cells.p6.f(frameLayout, textView2, w7.x5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f7981p1 = f7;
        f7.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        f7.setPadding(org.telegram.ui.Cells.p6.b(8.0f, R.string.Clear, f7), 0, AndroidUtilities.dp(8.0f), 0);
        f7.setGravity(16);
        f7.setTextColor(-1);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setTextSize(1, 16.0f);
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        rb rbVar2 = rbVar;
                        g6 g6Var3 = rbVar2.O0;
                        if (g6Var3 != null && (g6Var3.getCurrentBrush() instanceof qg.l)) {
                            g6Var3.b();
                            rbVar2.f7972k1.setSelectedIndex(1);
                            rbVar2.o((qg.m) qg.m.f44480a.get(0));
                            return;
                        }
                        rbVar2.D0.c();
                        return;
                    case 1:
                        rb rbVar3 = rbVar;
                        g6 g6Var4 = rbVar3.O0;
                        qg.t1 t1Var2 = rbVar3.D0;
                        if (t1Var2.a()) {
                            if (g6Var4 != null && (g6Var4.getCurrentBrush() instanceof qg.l)) {
                                g6Var4.b();
                                rbVar3.f7972k1.setSelectedIndex(1);
                                rbVar3.o((qg.m) qg.m.f44480a.get(0));
                            }
                            if (g6Var4 != null) {
                                g6Var4.a();
                            }
                            t1Var2.f44591c.clear();
                            t1Var2.f44590b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(t1Var2, 15));
                            rbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        rb rbVar4 = rbVar;
                        rg.k kVar = rbVar4.J0;
                        if (kVar instanceof rg.x2) {
                            AndroidUtilities.hideKeyboard(((rg.x2) kVar).getFocusedView());
                        }
                        if (rbVar4.f7984q2) {
                            rbVar4.v0(false);
                        }
                        rbVar4.C0(rbVar4.J0);
                        rbVar4.D0(null, true);
                        return;
                    case 3:
                        rbVar.D0(null, true);
                        return;
                    default:
                        rb rbVar5 = rbVar;
                        if (rbVar5.B1) {
                            rbVar5.I0(false);
                            return;
                        } else if (rbVar5.f7984q2) {
                            rbVar5.v0(true);
                            return;
                        } else if (rbVar5.K0) {
                            rbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = rbVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        f7.setAlpha(0.0f);
        f7.setVisibility(8);
        TextView f10 = org.telegram.ui.Cells.p6.f(frameLayout, f7, w7.x5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f7983q1 = f10;
        f10.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        f10.setPadding(org.telegram.ui.Cells.p6.b(8.0f, R.string.Done, f10), 0, AndroidUtilities.dp(8.0f), 0);
        f10.setGravity(16);
        f10.setTextColor(-1);
        f10.setTypeface(AndroidUtilities.bold());
        f10.setTextSize(1, 16.0f);
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        rb rbVar2 = rbVar;
                        g6 g6Var3 = rbVar2.O0;
                        if (g6Var3 != null && (g6Var3.getCurrentBrush() instanceof qg.l)) {
                            g6Var3.b();
                            rbVar2.f7972k1.setSelectedIndex(1);
                            rbVar2.o((qg.m) qg.m.f44480a.get(0));
                            return;
                        }
                        rbVar2.D0.c();
                        return;
                    case 1:
                        rb rbVar3 = rbVar;
                        g6 g6Var4 = rbVar3.O0;
                        qg.t1 t1Var2 = rbVar3.D0;
                        if (t1Var2.a()) {
                            if (g6Var4 != null && (g6Var4.getCurrentBrush() instanceof qg.l)) {
                                g6Var4.b();
                                rbVar3.f7972k1.setSelectedIndex(1);
                                rbVar3.o((qg.m) qg.m.f44480a.get(0));
                            }
                            if (g6Var4 != null) {
                                g6Var4.a();
                            }
                            t1Var2.f44591c.clear();
                            t1Var2.f44590b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(t1Var2, 15));
                            rbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        rb rbVar4 = rbVar;
                        rg.k kVar = rbVar4.J0;
                        if (kVar instanceof rg.x2) {
                            AndroidUtilities.hideKeyboard(((rg.x2) kVar).getFocusedView());
                        }
                        if (rbVar4.f7984q2) {
                            rbVar4.v0(false);
                        }
                        rbVar4.C0(rbVar4.J0);
                        rbVar4.D0(null, true);
                        return;
                    case 3:
                        rbVar.D0(null, true);
                        return;
                    default:
                        rb rbVar5 = rbVar;
                        if (rbVar5.B1) {
                            rbVar5.I0(false);
                            return;
                        } else if (rbVar5.f7984q2) {
                            rbVar5.v0(true);
                            return;
                        } else if (rbVar5.K0) {
                            rbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = rbVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        f10.setAlpha(0.0f);
        f10.setVisibility(8);
        frameLayout.addView(f10, w7.x5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        qg.s0 s0Var2 = s0Var;
        m6 m6Var = new m6(rbVar, context, s0Var2);
        this.T0 = m6Var;
        m6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        m6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(m6Var, w7.x5.e(-1, 104, 80));
        rg.t1 t1Var2 = new rg.t1(context, (o8Var == null || o8Var.v() || o8Var.f7782u || jaVar == null) ? false : true);
        this.f7972k1 = t1Var2;
        t1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        t1Var2.setDelegate(this);
        t1Var2.setSelectedIndex(1);
        m6Var.addView(t1Var2, w7.x5.c(48.0f, -1));
        rg.q1 q1Var2 = new rg.q1(context);
        this.l1 = q1Var2;
        q1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        q1Var2.setVisibility(8);
        q1Var2.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        rb rbVar2 = rbVar;
                        qg.q1 q1Var3 = rbVar2.A1;
                        rbVar2.F0(q1Var3);
                        qg.s0.e(i10).j(q1Var3.f44543c);
                        return;
                    default:
                        rbVar.l1.setTypeface(qg.s0.e(i10).f44573j);
                        return;
                }
            }
        });
        q1Var2.setAlignment(qg.s0.e(i10).f44571g);
        m6Var.addView(q1Var2, w7.x5.c(48.0f, -1));
        q5 q5Var = new q5(rbVar, context);
        this.U0 = q5Var;
        addView(q5Var, w7.x5.c(-1.0f, -1));
        rg.v1 v1Var = new rg.v1(context);
        this.f7975m1 = v1Var;
        v1Var.setVisibility(8);
        v1Var.setOnItemClickListener(new bi.d(rbVar, 5));
        q1Var2.setTypefaceListView(v1Var);
        q5Var.addView(v1Var, w7.x5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint7 = paint3;
        paint7.setStyle(Paint.Style.FILL);
        paint7.setColor(352321535);
        paint2.setColor(e6Var.G0(org.telegram.ui.ActionBar.j6.G8));
        r5 r5Var = new r5(rbVar, context);
        this.f7995w1 = r5Var;
        r5Var.setVisibility(8);
        r5Var.setColorPalette(qg.s0.e(i10));
        r5Var.setColorListener(new e5(rbVar, 0));
        m6Var.addView(r5Var, w7.x5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        rg.h1 h1Var = new rg.h1(context);
        this.A0 = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        h1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        m6Var.addView(h1Var, w7.x5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        h1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        rb rbVar2 = rbVar;
                        g6 g6Var3 = rbVar2.O0;
                        if (g6Var3 != null && (g6Var3.getCurrentBrush() instanceof qg.l)) {
                            g6Var3.b();
                            rbVar2.f7972k1.setSelectedIndex(1);
                            rbVar2.o((qg.m) qg.m.f44480a.get(0));
                            return;
                        }
                        rbVar2.D0.c();
                        return;
                    case 1:
                        rb rbVar3 = rbVar;
                        g6 g6Var4 = rbVar3.O0;
                        qg.t1 t1Var22 = rbVar3.D0;
                        if (t1Var22.a()) {
                            if (g6Var4 != null && (g6Var4.getCurrentBrush() instanceof qg.l)) {
                                g6Var4.b();
                                rbVar3.f7972k1.setSelectedIndex(1);
                                rbVar3.o((qg.m) qg.m.f44480a.get(0));
                            }
                            if (g6Var4 != null) {
                                g6Var4.a();
                            }
                            t1Var22.f44591c.clear();
                            t1Var22.f44590b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(t1Var22, 15));
                            rbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        rb rbVar4 = rbVar;
                        rg.k kVar = rbVar4.J0;
                        if (kVar instanceof rg.x2) {
                            AndroidUtilities.hideKeyboard(((rg.x2) kVar).getFocusedView());
                        }
                        if (rbVar4.f7984q2) {
                            rbVar4.v0(false);
                        }
                        rbVar4.C0(rbVar4.J0);
                        rbVar4.D0(null, true);
                        return;
                    case 3:
                        rbVar.D0(null, true);
                        return;
                    default:
                        rb rbVar5 = rbVar;
                        if (rbVar5.B1) {
                            rbVar5.I0(false);
                            return;
                        } else if (rbVar5.f7984q2) {
                            rbVar5.v0(true);
                            return;
                        } else if (rbVar5.K0) {
                            rbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = rbVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        rg.l1 l1Var = new rg.l1(context);
        this.B0 = l1Var;
        l1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        l1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        l1Var.setOnClickListener(new bi.x(rbVar, context, s0Var2, 6));
        m6Var.addView(l1Var, w7.x5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        rg.y1 y1Var = new rg.y1(context);
        this.f7958d1 = y1Var;
        y1Var.setColorSwatch(q1Var);
        y1Var.setRenderView(g6Var2);
        y1Var.setValueOverride(cVar);
        q1Var.f44543c = cVar.get();
        y1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        rb rbVar2 = rbVar;
                        qg.q1 q1Var3 = rbVar2.A1;
                        rbVar2.F0(q1Var3);
                        qg.s0.e(i10).j(q1Var3.f44543c);
                        return;
                    default:
                        rbVar.l1.setTypeface(qg.s0.e(i10).f44573j);
                        return;
                }
            }
        });
        addView(y1Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V0 = frameLayout2;
        addView(frameLayout2, w7.x5.c(-1.0f, -1));
        Paint paint8 = paint;
        paint8.setStyle(Paint.Style.STROKE);
        paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(q1Var, null, false);
        o((qg.m) qg.m.f44480a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.O1 = new t5(rbVar, ocVar, new m2(i14, rbVar, ocVar));
        t2.G = i14;
    }

    public static void G0(rg.x2 x2Var, int i10) {
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

    public static void Z(rb rbVar, qg.s0 s0Var, Integer num) {
        s0Var.h(num.intValue(), true);
        s0Var.g();
        rbVar.setNewColor(num.intValue());
        rbVar.f7995w1.setSelectedColorIndex(s0Var.d());
        rbVar.T1 = null;
    }

    public static void a0(rb rbVar, Integer num) {
        rbVar.setNewColor(num.intValue());
        rbVar.I0(false);
    }

    public ViewGroup getBarView() {
        if (this.Y0 == 2) {
            return this.l1;
        }
        return this.f7972k1;
    }

    private int getFrameRotation() {
        int i10 = this.f7962f1;
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

    private iv0 getPaintingSize() {
        iv0 iv0Var = this.H0;
        if (iv0Var != null) {
            return iv0Var;
        }
        iv0 iv0Var2 = new iv0(1080.0f, 1920.0f);
        this.H0 = iv0Var2;
        return iv0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 < k6Var.getChildCount()) {
                View childAt = k6Var.getChildAt(i10);
                if (childAt instanceof rg.q2) {
                    ImageReceiver imageReceiver = ((rg.q2) childAt).f45465x0;
                    xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
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
                        animation.f25273y = z10;
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
        qg.q1 q1Var = this.A1;
        int i11 = q1Var.f44541a;
        q1Var.f44541a = i10;
        E0(q1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new d5(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        rg.k kVar = this.J0;
        if (kVar instanceof rg.x2) {
            ((rg.x2) kVar).setType(i10);
        }
        qg.s0 e7 = qg.s0.e(this.F1);
        e7.h = i10;
        e7.f44566a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        x5 x5Var = new x5(this, context);
        this.W0 = x5Var;
        x5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.x5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f7966h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f7966h1;
        int i10 = org.telegram.ui.ActionBar.j6.f20753i6;
        e6 e6Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), 7, -1));
        this.f7966h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f7966h1.setTextColor(-1);
        this.f7966h1.setTextSize(1, 14.0f);
        this.f7966h1.setGravity(1);
        this.f7966h1.setTypeface(AndroidUtilities.bold());
        this.f7966h1.setSingleLine();
        this.f7966h1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f8327b;

            {
                this.f8327b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f8327b;
                        if (q6Var.K0) {
                            q6Var.D0(null, true);
                            return;
                        } else {
                            q6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f8327b.A0();
                        return;
                    default:
                        q6 q6Var2 = this.f8327b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof rg.x2)) {
                            q6Var2.f7974l2 = true;
                            q6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f7966h1, w7.x5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f7968i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f7968i1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), 7, -1));
        this.f7968i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f7968i1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f8327b;

            {
                this.f8327b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f8327b;
                        if (q6Var.K0) {
                            q6Var.D0(null, true);
                            return;
                        } else {
                            q6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f8327b.A0();
                        return;
                    default:
                        q6 q6Var2 = this.f8327b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof rg.x2)) {
                            q6Var2.f7974l2 = true;
                            q6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f7968i1.setTextColor(-1);
        this.f7968i1.setTextSize(1, 14.0f);
        this.f7968i1.setGravity(1);
        this.f7968i1.setTypeface(AndroidUtilities.bold());
        this.f7968i1.setAlpha(0.6f);
        this.f7968i1.setSingleLine();
        this.W0.addView(this.f7968i1, w7.x5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f7970j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f7970j1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), 7, -1));
        this.f7970j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f7970j1.setTextColor(-1);
        this.f7970j1.setTextSize(1, 14.0f);
        this.f7970j1.setGravity(1);
        this.f7970j1.setTypeface(AndroidUtilities.bold());
        this.f7970j1.setAlpha(0.6f);
        this.f7970j1.setSingleLine();
        this.f7970j1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f8327b;

            {
                this.f8327b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f8327b;
                        if (q6Var.K0) {
                            q6Var.D0(null, true);
                            return;
                        } else {
                            q6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f8327b.A0();
                        return;
                    default:
                        q6 q6Var2 = this.f8327b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof rg.x2)) {
                            q6Var2.f7974l2 = true;
                            q6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f7970j1, w7.x5.l(1.0f, 0, -2));
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
        N0(new g5(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0() {
        final int i10 = this.Y0;
        R0(1);
        postDelayed(new ah.j(this, 9), 350L);
        z5 z5Var = new z5(this, getContext(), this.G1, i10);
        this.f7973k2 = z5Var;
        oc ocVar = this.M1;
        Objects.requireNonNull(ocVar);
        z5Var.f8174w = new ci.u(ocVar, 6);
        final boolean[] zArr = {true};
        z5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                q6 q6Var = q6.this;
                q6Var.f7973k2 = null;
                if (zArr[0]) {
                    q6Var.z0(false);
                }
                q6Var.R0(i10);
            }
        });
        z5Var.f8176y = new i5(this);
        z5Var.q0(new p5(this, zArr, z5Var, 0));
        z5Var.show();
        z0(true);
    }

    public final void B0(rg.k kVar) {
        this.D0.b(kVar.getUUID(), new f5(this, kVar, 0));
    }

    public final void C0(rg.k kVar) {
        rg.k kVar2 = this.J0;
        if (kVar == kVar2 && kVar2 != null) {
            kVar2.l(kVar2.m0, false);
            D0(null, true);
            if (kVar instanceof rg.x2) {
                ValueAnimator valueAnimator = this.f7954b1;
                if (valueAnimator != null && this.Z0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.R0.removeView(kVar);
        g0();
        if (kVar != null) {
            UUID uuid = kVar.getUUID();
            qg.t1 t1Var = this.D0;
            t1Var.f44590b.remove(uuid);
            t1Var.f44591c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(t1Var, 15));
        }
        rg.y1 y1Var = this.f7958d1;
        xa.c cVar = this.f7960e1;
        y1Var.setValueOverride(cVar);
        y1Var.setShowPreview(true);
        float f7 = cVar.get();
        qg.q1 q1Var = this.A1;
        q1Var.f44543c = f7;
        E0(q1Var, null, false);
        if (!this.f7978n2 && (kVar instanceof rg.d2)) {
            pc pcVar = ((rb) this).A2;
            dc dcVar = pcVar.X0;
            if (dcVar != null) {
                dcVar.s(null, null, true);
            }
            rb rbVar = pcVar.f7910v1;
            if (rbVar != null) {
                rbVar.q0();
            }
            fc fcVar = pcVar.f7850c1;
            if (fcVar != null) {
                fcVar.setHasRoundVideo(false);
            }
            o8 o8Var = pcVar.K1;
            if (o8Var != null) {
                File file = o8Var.f7771o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    pcVar.K1.f7771o0 = null;
                }
                if (pcVar.K1.f7773p0 != null) {
                    try {
                        new File(pcVar.K1.f7773p0).delete();
                    } catch (Exception unused2) {
                    }
                    pcVar.K1.f7773p0 = null;
                }
            }
        }
    }

    @Override
    public final void D() {
        P0(true);
    }

    public final boolean D0(rg.k kVar, boolean z10) {
        boolean z11;
        zc zcVar;
        zc zcVar2;
        fk0 fk0Var;
        int i10;
        boolean z12 = kVar instanceof rg.x2;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f7954b1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.B1) {
                I0(false);
            }
            R0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            rg.x2 x2Var = (rg.x2) kVar;
            int gravity = x2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            rg.q1 q1Var = this.l1;
            q1Var.setAlignment(i11);
            qg.j0 typeface = x2Var.getTypeface();
            if (typeface != null) {
                q1Var.setTypeface(typeface.f44454a);
            }
            q1Var.e(x2Var.getType(), true);
            this.U0.invalidate();
        }
        rg.k kVar2 = this.J0;
        if (kVar2 != null) {
            if (kVar2 == kVar) {
                if (!kVar.f45244d0) {
                    if (kVar instanceof rg.v0) {
                        rg.v0 v0Var = (rg.v0) kVar;
                        v0Var.setType((v0Var.getType() + 1) % v0Var.getTypesCount());
                        return true;
                    } else if (kVar instanceof rg.y2) {
                        rg.y2 y2Var = (rg.y2) kVar;
                        y2Var.setType((y2Var.getType() + 1) % y2Var.getTypesCount());
                        return true;
                    } else if (kVar instanceof rg.s0) {
                        rg.s0 s0Var = (rg.s0) kVar;
                        rg.q0 q0Var = s0Var.f45477q0;
                        if (q0Var.e()) {
                            if (q0Var.getPreviewType() == 0) {
                                i12 = 1;
                            }
                            q0Var.setPreviewType(i12);
                            return true;
                        }
                        s0Var.setType(s0Var.getNextType());
                        return true;
                    } else if (!this.K0) {
                        if (kVar instanceof rg.x2) {
                            this.M0 = true;
                            r0();
                            return true;
                        } else if (kVar instanceof rg.c2) {
                            rg.c2 c2Var = (rg.c2) kVar;
                            if (this.f7957c2 && this.a2 == kVar) {
                                c2Var.q(true);
                                return true;
                            }
                            rg.c2 c2Var2 = this.a2;
                            if (c2Var2 != null && c2Var2 != c2Var && (fk0Var = this.Z1) != null) {
                                fk0Var.animate().alpha(0.0f).setListener(new v5(fk0Var, 0));
                                this.Z1 = null;
                                this.f7957c2 = false;
                                this.f7955b2 = 0.0f;
                            }
                            if (this.Z1 == null) {
                                fk0 fk0Var2 = new fk0(2, this.F1, getContext(), LaunchActivity.R(), new bi.k3(6, new bi.b()));
                                this.Z1 = fk0Var2;
                                org.telegram.ui.Components.na naVar = new org.telegram.ui.Components.na(this.f7961e2, fk0Var2, 0, false);
                                this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.M1.addView(this.Z1, w7.x5.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                fk0 fk0Var3 = this.Z1;
                                ?? obj = new Object();
                                obj.f4799e = this;
                                obj.f4798c = naVar;
                                obj.d = paint;
                                obj.f4797b = new Path();
                                fk0Var3.setDelegate(obj);
                                this.Z1.p(null, null, true);
                            }
                            this.Z1.setFragment(LaunchActivity.R());
                            this.a2 = c2Var;
                            O0(true);
                            return true;
                        } else {
                            M0(kVar2);
                            return true;
                        }
                    } else if (kVar2 instanceof rg.x2) {
                        AndroidUtilities.showKeyboard(((rg.x2) kVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            kVar2.l(kVar2.m0, false);
            rg.k kVar3 = this.J0;
            if (kVar3 instanceof rg.x2) {
                rg.x2 x2Var2 = (rg.x2) kVar3;
                rg.w2 w2Var = x2Var2.f45542q0;
                w2Var.clearFocus();
                w2Var.setEnabled(false);
                w2Var.setClickable(false);
                x2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((rg.x2) this.J0).getFocusedView());
                    v0(false);
                }
            } else if ((kVar3 instanceof rg.d2) && (zcVar2 = ((rb) this).A2.Z0) != null) {
                zcVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        rg.k kVar4 = this.J0;
        this.J0 = kVar;
        if ((kVar4 instanceof rg.x2) && TextUtils.isEmpty(((rg.x2) kVar4).getText())) {
            C0(kVar4);
        }
        rg.k kVar5 = this.J0;
        if (kVar4 != kVar5 && (kVar5 instanceof rg.d2) && (zcVar = ((rb) this).A2.Z0) != null) {
            zcVar.l(true);
        }
        rg.k kVar6 = this.J0;
        xa.c cVar = this.f7960e1;
        qg.q1 q1Var2 = this.A1;
        rg.y1 y1Var = this.f7958d1;
        if (kVar6 != null) {
            l6 l6Var = this.Q0;
            kVar6.m0 = l6Var;
            kVar6.l(l6Var, true);
            rg.k kVar7 = this.J0;
            if (kVar7 instanceof rg.x2) {
                rg.x2 x2Var3 = (rg.x2) kVar7;
                x2Var3.getSwatch().f44543c = q1Var2.f44543c;
                x2Var3.f45551z0 = false;
                F0(x2Var3.getSwatch());
                y1Var.setValueOverride(new u5(x2Var3, (int) (this.H0.f27271a / 9.0f), 0));
                y1Var.setShowPreview(false);
            } else {
                y1Var.setValueOverride(cVar);
                y1Var.setShowPreview(true);
                q1Var2.f44543c = cVar.get();
                E0(q1Var2, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f7954b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                I0(false);
            }
            R0(0);
            y1Var.setValueOverride(cVar);
            y1Var.setShowPreview(true);
            q1Var2.f44543c = cVar.get();
            E0(q1Var2, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(qg.q1 q1Var, Integer num, boolean z10) {
        qg.q1 q1Var2 = this.A1;
        if (q1Var2 != q1Var) {
            q1Var2.f44541a = q1Var.f44541a;
            q1Var2.f44542b = q1Var.f44542b;
            q1Var2.f44543c = q1Var.f44543c;
            int i10 = this.F1;
            qg.s0.e(i10).h(q1Var.f44541a, true);
            qg.s0.e(i10).j(q1Var.f44543c);
        }
        int i11 = q1Var.f44541a;
        g6 g6Var = this.O0;
        g6Var.setColor(i11);
        g6Var.setBrushSize(q1Var.f44543c);
        int i12 = q1Var2.f44541a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new x4(this, num, i12, 0));
            duration.start();
        } else {
            m6 m6Var = this.T0;
            if (m6Var != null) {
                m6Var.invalidate();
            }
        }
        rg.k kVar = this.J0;
        if (kVar instanceof rg.x2) {
            ((rg.x2) kVar).setSwatch(new qg.q1(q1Var.f44542b, q1Var.f44543c, q1Var.f44541a));
        } else if (z10 && (kVar instanceof rg.v0)) {
            ((rg.v0) kVar).setColor(q1Var.f44541a);
            ((rg.v0) this.J0).setType(3);
        } else if (z10 && (kVar instanceof rg.y2)) {
            ((rg.y2) kVar).setColor(q1Var.f44541a);
            ((rg.y2) this.J0).setType(3);
        } else if (z10 && (kVar instanceof rg.s0)) {
            ((rg.s0) kVar).setColor(q1Var.f44541a);
            ((rg.s0) this.J0).setType(0);
        }
    }

    public final void F0(qg.q1 q1Var) {
        E0(q1Var, null, false);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f7986r2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f7996w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f7996w2).commit();
            } else {
                this.f7994v2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f7994v2).commit();
            }
        }
        boolean z13 = this.f7984q2;
        t5 t5Var = this.O1;
        if (z13) {
            if (z10) {
                i11 = this.f7996w2;
            } else {
                i11 = this.f7994v2;
            }
            int paddingUnderContainer = this.M1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7982p2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f7982p2.setLayoutParams(layoutParams);
                this.f7990t2 = layoutParams.height;
                t5Var.a();
                requestLayout();
            }
        }
        if (this.f7998x2 == i10 && this.f8000y2 == z10) {
            return;
        }
        this.f7998x2 = i10;
        this.f8000y2 = z10;
        boolean z14 = this.f7986r2;
        rg.k kVar = this.J0;
        if (kVar instanceof rg.x2) {
            if (((rg.x2) kVar).getEditText().isFocused() && t5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f7986r2 = z12;
        } else {
            this.f7986r2 = false;
        }
        if (this.f7986r2 && this.f7984q2) {
            J0(0);
        }
        if (this.f7990t2 != 0 && !(z11 = this.f7986r2) && z11 != z14 && !this.f7984q2) {
            this.f7990t2 = 0;
            t5Var.a();
            requestLayout();
        }
        U0();
        if (z14 && !this.f7986r2 && this.f7990t2 > 0 && this.f7992u2) {
            this.f7992u2 = false;
        }
        S0();
    }

    public final void H0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        rg.k kVar;
        ArrayList arrayList = this.Q1;
        if (arrayList != null) {
            o8 o8Var = this.P1;
            this.P1 = null;
            this.Q1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                k6 k6Var = this.R0;
                if (i11 < size) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        d6 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            n02.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = n02.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i10 = i11;
                        kVar = n02;
                    } else if (b10 == 1) {
                        rg.x2 o02 = o0(z10);
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
                            org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(emojiEntity2.document_id, 1.0f, o02.getFontMetricsInt());
                            int i13 = emojiEntity2.offset;
                            spannableString.setSpan(z5Var, i13, emojiEntity2.length + i13, 33);
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
                        qg.q1 swatch = o02.getSwatch();
                        swatch.f44541a = mediaEntity.color;
                        o02.setSwatch(swatch);
                        kVar = o02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            rg.z1 k02 = k0(mediaEntity.text, false);
                            k02.G0 = mediaEntity.crop;
                            k02.B0 = false;
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
                            ArrayList arrayList3 = o8Var.v;
                            boolean z11 = o8Var.K;
                            this.f7974l2 = true;
                            rg.k c6Var = new c6(this, getContext(), e0(), arrayList3, this.f7961e2, z11, this.f7963f2);
                            c6Var.setDelegate(this);
                            k6Var.addView(c6Var);
                            g0();
                            kVar = c6Var;
                            if (mediaEntity.viewWidth > 0) {
                                kVar = c6Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = c6Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    kVar = c6Var;
                                }
                            }
                        } else if (b10 == 3) {
                            rg.v0 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                j02.setColor(i14);
                            }
                            j02.setType(mediaEntity.subType);
                            kVar = j02;
                        } else if (b10 == 8) {
                            nd ndVar = mediaEntity.weather;
                            if (ndVar != null) {
                                rg.y2 p02 = p0(ndVar);
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
                            rg.s0 i02 = i0(mediaEntity.linkSettings);
                            rg.q0 q0Var = i02.f45477q0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                i02.setColor(i16);
                            }
                            boolean e7 = q0Var.e();
                            int i17 = q0Var.h;
                            int i18 = q0Var.f45429f;
                            if (e7) {
                                q0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                i02.setType(3);
                                q0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(q0Var.f45421a0)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(q0Var.f45423b0)) + i17 + i17;
                                PointF position = i02.getPosition();
                                position.y = (this.S1 * 0.3f) + position.y;
                                i02.setPosition(position);
                                i11 = i10 + 1;
                                z10 = false;
                            } else {
                                i02.setType(b11);
                                kVar = i02;
                            }
                        } else if (b10 == 4) {
                            rg.c2 l02 = l0(false);
                            l02.s(ah.j1.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                l02.r(false);
                            }
                            kVar = l02;
                            if (mediaEntity.mediaArea.dark) {
                                l02.q(false);
                                kVar = l02;
                            }
                        } else {
                            if (b10 == 5 && o8Var.f7771o0 != null) {
                                rg.d2 m0 = m0(o8Var.f7773p0, false);
                                pc pcVar = ((rb) this).A2;
                                dc dcVar = pcVar.X0;
                                if (dcVar != null) {
                                    dcVar.f7097w = m0;
                                    g71 g71Var = dcVar.f7099x;
                                    if (g71Var != null) {
                                        g71Var.V(m0.f45164u0);
                                    }
                                }
                                fc fcVar = pcVar.f7850c1;
                                if (fcVar != null) {
                                    fcVar.setHasRoundVideo(true);
                                }
                                kVar = m0;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !m0.f45161r0;
                                    m0.f45161r0 = z12;
                                    m0.f45162s0.f(z12, true);
                                    m0.invalidate();
                                    kVar = m0;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    kVar.setX((mediaEntity.f17104x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    kVar.setY((mediaEntity.f17105y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                    kVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + kVar.getX(), (mediaEntity.viewHeight / 2.0f) + kVar.getY()));
                    kVar.setScale(mediaEntity.scale);
                    kVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                    i11 = i10 + 1;
                    z10 = false;
                } else {
                    k6Var.setVisibility(0);
                    return;
                }
            }
        }
    }

    public final void I0(final boolean z10) {
        float f7;
        boolean z11;
        if (this.B1 != z10) {
            this.B1 = z10;
            o1.k kVar = this.C1;
            if (kVar != null) {
                kVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new o1.j(f7));
            this.C1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f16832i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16825u = lVar;
            if (!this.O1.c() && this.f7990t2 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.T0.getTranslationY();
            final float alpha = this.B0.getAlpha();
            final ViewGroup barView = getBarView();
            this.C1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    float f13;
                    int i10;
                    q6 q6Var = q6.this;
                    m6 m6Var = q6Var.T0;
                    float f14 = f11 / 1000.0f;
                    q6Var.D1 = f14;
                    float f15 = 1.0f;
                    float f16 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f16);
                    view.setScaleY(f16);
                    view.setTranslationY((Math.min(q6Var.D1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(q6Var.D1, 0.25f) / 0.25f));
                    r5 r5Var = q6Var.f7995w1;
                    float f17 = q6Var.D1;
                    boolean z12 = z10;
                    r5Var.x1(f17, z12);
                    rg.l1 l1Var = q6Var.B0;
                    l1Var.setProgress(q6Var.D1);
                    rg.h1 h1Var = q6Var.A0;
                    h1Var.setProgress(q6Var.D1);
                    q6Var.W0.setTranslationY(AndroidUtilities.dp(32.0f) * q6Var.D1);
                    AnimatorSet animatorSet = q6Var.N1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f18 = q6Var.D1;
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
                        m6Var.setTranslationY(translationY - (dp * i10));
                    }
                    m6Var.invalidate();
                    if (view == q6Var.l1) {
                        q6Var.U0.invalidate();
                    }
                }
            });
            this.C1.a(new z4(this, z10, 0));
            this.C1.f();
            if (z10) {
                r5 r5Var = this.f7995w1;
                r5Var.setVisibility(0);
                r5Var.setSelectedColorIndex(qg.s0.e(this.F1).d());
            }
        }
    }

    public final void J0(int i10) {
        boolean z10;
        int i11;
        rg.q1 q1Var = this.l1;
        t5 t5Var = this.O1;
        if (i10 == 1) {
            kz kzVar = this.f7982p2;
            if (kzVar != null && kzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kz kzVar2 = this.f7982p2;
            oc ocVar = this.M1;
            if (kzVar2 != null && kzVar2.f27932c1 != UserConfig.selectedAccount) {
                ocVar.removeView(kzVar2);
                this.f7982p2 = null;
            }
            if (this.f7982p2 == null) {
                kz kzVar3 = new kz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.f7982p2 = kzVar3;
                kzVar3.f28001x2 = false;
                kzVar3.U0 = true;
                kzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f7982p2.setForseMultiwindowLayout(true);
                }
                this.f7982p2.setDelegate(new f6(this));
                ocVar.addView(this.f7982p2);
            }
            this.f7982p2.setVisibility(0);
            this.f7984q2 = true;
            kz kzVar4 = this.f7982p2;
            if (this.f7994v2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f7994v2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f7994v2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f7996w2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f7996w2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f7996w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f7996w2;
            } else {
                i11 = this.f7994v2;
            }
            int paddingUnderContainer = ocVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            kzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                rg.k kVar = this.J0;
                if (kVar instanceof rg.x2) {
                    AndroidUtilities.hideKeyboard(((rg.x2) kVar).getEditText());
                }
            }
            this.f7990t2 = paddingUnderContainer;
            t5Var.a();
            requestLayout();
            bh emojiButton = q1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(zg.d, true);
            }
            if (!z10) {
                if (this.f7986r2) {
                    this.f7992u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f7990t2, 0.0f);
                    ofFloat.addUpdateListener(new a5(this, 1));
                    ofFloat.addListener(new w5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21275w);
                    ofFloat.start();
                }
            }
        } else {
            bh emojiButton2 = q1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(zg.f33152e, true);
            }
            kz kzVar5 = this.f7982p2;
            if (kzVar5 != null) {
                this.f7984q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f7990t2 = 0;
                t5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(rg.s0 s0Var) {
        x8 x8Var = new x8(getContext(), this.G1, this.f7965g2, new m2(3, this, s0Var));
        if (s0Var != null) {
            rg.p0 p0Var = s0Var.f45481u0;
            x8Var.f8397c0 = true;
            org.telegram.ui.Cells.i3 i3Var = x8Var.Z;
            org.telegram.ui.Cells.i3 i3Var2 = x8Var.Y;
            if (p0Var != null) {
                x8Var.f8401g0 = p0Var.d;
                x8Var.f8402h0 = false;
                i3Var2.setText(p0Var.f45409c);
                i3Var.setText(p0Var.f45408b);
                x8Var.m0 = !TextUtils.isEmpty(p0Var.f45408b);
                x8Var.f8407n0 = p0Var.f45411f;
                x8Var.f8408o0 = p0Var.f45410e;
            } else {
                i3Var2.setText("");
                i3Var.setText("");
                x8Var.f8407n0 = true;
                x8Var.f8408o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = x8Var.f8396b0;
            dVar.g(string, false, true);
            t8 t8Var = x8Var.X;
            if (t8Var != null) {
                t8Var.N(false);
            }
            dVar.setEnabled(x8Var.V(i3Var2.getText().toString()));
            x8Var.f8397c0 = false;
        }
        x8Var.setOnDismissListener(new m5(this, 1));
        x8Var.show();
        z0(true);
    }

    public final void L0(rg.v0 v0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        vi viVar = new vi(getContext(), new a6(this, callback2), false, true, false, this.G1);
        viVar.Z1 = new Object();
        xh xhVar = viVar.f31337x1;
        if (v0Var != null && (messageMedia = v0Var.f45522u0) != null && (geoPoint = messageMedia.geo) != null) {
            viVar.f31338x2 = new double[]{geoPoint.lat, geoPoint._long};
            viVar.O = true;
            xhVar.setVisibility(8);
        } else if (this.U1) {
            viVar.f31330v2 = this.W1;
            viVar.f31334w2 = this.V1;
            viVar.O = true;
            xhVar.setVisibility(8);
        } else {
            viVar.O = true;
            xhVar.setVisibility(8);
        }
        viVar.setOnDismissListener(new m5(this, 0));
        viVar.r1();
        viVar.show();
    }

    public final void M0(rg.k kVar) {
        if (kVar instanceof rg.g1) {
            org.telegram.ui.ActionBar.n1 n1Var = this.H1;
            if (n1Var != null && n1Var.isShowing()) {
                this.H1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f7980o2;
        kVar.getLocationInWindow(iArr);
        float scaleX = kVar.getScaleX() * kVar.getWidth();
        k6 k6Var = this.R0;
        float scaleX2 = k6Var.getScaleX() * scaleX;
        float scaleY = kVar.getScaleY();
        float scaleY2 = k6Var.getScaleY() * scaleY * kVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        N0(new f5(this, kVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, q6 q6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.n1 n1Var = this.H1;
        if (n1Var != null && n1Var.isShowing()) {
            this.H1.d(true);
            return;
        }
        if (this.I1 == null) {
            this.J1 = new Rect();
            o6 o6Var = new o6(this, getContext());
            this.I1 = o6Var;
            o6Var.setAnimationEnabled(true);
            this.I1.setOnTouchListener(new h5(this, 0));
            this.I1.setDispatchKeyEventListener(new i5(this));
            this.I1.setShownFromBottom(true);
        }
        o6 o6Var2 = this.I1;
        o6Var2.W = z10;
        o6Var2.d();
        runnable.run();
        if (this.H1 == null) {
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(this.I1, -2, -2);
            this.H1 = n1Var2;
            n1Var2.f21209b = true;
            n1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.H1.setOutsideTouchable(true);
            this.H1.setClippingEnabled(true);
            this.H1.setInputMethodMode(2);
            this.H1.setSoftInputMode(0);
            this.H1.getContentView().setFocusableInTouchMode(true);
            this.H1.setOnDismissListener(new j5(this, 0));
        }
        this.I1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.H1.setFocusable(true);
        int measuredWidth = i11 - (this.I1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.I1.getMeasuredHeight();
        this.H1.showAtLocation(q6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.n1.i(this.I1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            o6 o6Var3 = this.I1;
            o6Var3.setBackgroundDrawable(new org.telegram.ui.Components.ma(new org.telegram.ui.Components.na(this.f7961e2, o6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.I1.setBackgroundDrawable(mutate);
        this.I1.setBackgroundColor(-14145495);
    }

    public final void O0(boolean z10) {
        if (this.f7957c2 != z10) {
            if (z10 || this.Z1 != null) {
                this.f7957c2 = z10;
                if (z10) {
                    this.Z1.n();
                    this.Z1.setVisibility(0);
                    this.Z1.setSelectedReaction(this.a2.getCurrentReaction());
                    this.Z1.getParent().bringChildToFront(this.Z1);
                } else {
                    this.a2 = null;
                }
                float f7 = 0.0f;
                if (z10) {
                    this.f7959d2 = true;
                    this.M1.invalidate();
                    float f10 = this.f7955b2;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.Z1.setTransitionProgress(this.f7955b2);
                    ofFloat.addUpdateListener(new a5(this, 2));
                    ofFloat.addListener(new ah.q0(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(pr.f29467g);
                    ofFloat.start();
                    return;
                }
                if (this.Z1.getReactionsWindow() != null) {
                    this.Z1.getReactionsWindow().e();
                }
                this.Z1.animate().alpha(0.0f).setDuration(150L).setListener(new w5(this, 0)).start();
            }
        }
    }

    public final void P0(boolean z10) {
        float f7;
        if (this.f7991u1 != z10) {
            this.f7991u1 = z10;
            o1.k kVar = this.f7993v1;
            if (kVar != null) {
                kVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new o1.j(f7));
            this.f7993v1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f16832i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16825u = lVar;
            if (z10) {
                rg.v1 v1Var = this.f7975m1;
                v1Var.setAlpha(0.0f);
                v1Var.setVisibility(0);
            }
            this.f7993v1.b(new bi.x9(1, this));
            this.f7993v1.a(new z4(this, z10, 1));
            this.f7993v1.f();
        }
    }

    public final PointF Q0(rg.k kVar) {
        float f7;
        float f10 = 200.0f;
        MediaController.CropState cropState = this.F0;
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
                k6 k6Var = this.R0;
                if (i11 >= k6Var.getChildCount()) {
                    break;
                }
                View childAt = k6Var.getChildAt(i11);
                if (!(childAt instanceof rg.k) || (childAt instanceof rg.g1)) {
                    f7 = f11;
                } else {
                    PointF position2 = ((rg.k) childAt).getPosition();
                    f7 = f11;
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f7) {
                        f10 = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z10 = true;
                    }
                }
                i11++;
                f11 = f7;
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
        return this.O1.f7435l - this.M1.getBottomPadding2();
    }

    public final void R0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.Y0 != i10 && this.Z0 != i10) {
            ValueAnimator valueAnimator = this.f7954b1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.Y0;
            ViewGroup viewGroup3 = this.l1;
            ViewGroup viewGroup4 = this.f7972k1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.Z0 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.F1;
            qg.s0 e7 = qg.s0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e7.f44575l != z10) {
                e7.f44575l = z10;
                if (z10) {
                    e7.i(-1, false);
                } else {
                    e7.i(e7.f44566a.getInt("brush", 0), false);
                }
            }
            int c10 = qg.s0.e(i12).c();
            qg.q1 q1Var = this.A1;
            q1Var.f44541a = c10;
            E0(q1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f7954b1 = duration;
            duration.setInterpolator(pr.f29466f);
            this.f7954b1.addUpdateListener(new bi.i4(this, viewGroup, viewGroup2, 1));
            this.f7954b1.addListener(new y5(this, viewGroup, viewGroup2, i10, 0));
            this.f7954b1.start();
        }
    }

    public final void S0() {
        boolean z10;
        t5 t5Var = this.O1;
        rg.q1 q1Var = this.l1;
        if (q1Var != null) {
            if (t5Var.c()) {
                q1Var.a(R.drawable.input_smile);
            } else if (this.f7984q2) {
                q1Var.a(R.drawable.input_keyboard);
            } else {
                q1Var.a(R.drawable.msg_add);
            }
        }
        if (!t5Var.c() && !this.f7984q2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.f7979o1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f7977n1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f7983q1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f7981p1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        float f7;
        rg.k kVar;
        ObjectAnimator objectAnimator = this.f7969i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        t5 t5Var = this.O1;
        if (((t5Var.c() && !t5Var.d) || this.f7990t2 > 0) && (kVar = this.J0) != null) {
            f7 = view.getScaleY() * (-(kVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.f7969i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f7969i2.setInterpolator(pr.h);
        this.f7969i2.start();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: di.q6.U0():void");
    }

    @Override
    public final void a() {
        I0(true);
    }

    @Override
    public final void c() {
        setTextType((this.L0 + 1) % 4);
    }

    @Override
    public final void d() {
        this.E1.setColor(-15132391);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new bi.s8(26, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7976m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        MediaController.CropState cropState;
        int i10 = 0;
        if ((view == this.O0 || view == this.P0 || view == this.R0 || view == this.Q0) && (cropState = this.F0) != null) {
            canvas.save();
            if (!this.N0) {
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
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (i10 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public final void e(int i10) {
        rg.k kVar = this.J0;
        if (kVar instanceof rg.x2) {
            G0((rg.x2) kVar, i10);
            qg.s0 e7 = qg.s0.e(this.F1);
            e7.f44571g = i10;
            e7.f44566a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final PointF e0() {
        k6 k6Var = this.R0;
        int measuredWidth = k6Var.getMeasuredWidth();
        int measuredHeight = k6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.S1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public abstract boolean f0(ah.g gVar);

    public final void g0() {
        org.telegram.ui.Components.z5[] z5VarArr;
        boolean z10 = this.W1;
        k6 k6Var = this.R0;
        boolean z11 = true;
        if (!z10 && !this.Y1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < k6Var.getChildCount()) {
                    View childAt = k6Var.getChildAt(i10);
                    boolean z12 = childAt instanceof rg.x2;
                    int i11 = this.F1;
                    if (z12) {
                        CharSequence text = ((rg.x2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.z5 z5Var : (org.telegram.ui.Components.z5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.z5.class)) {
                                TLRPC.Document document = z5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.q5.f(i11, z5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.q5.h(i11).e(document);
                                }
                                if (o8.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i10++;
                    } else if (childAt instanceof rg.q2) {
                        TLRPC.Document sticker = ((rg.q2) childAt).getSticker();
                        if (o8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof rg.d2) {
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
        for (int i12 = 0; i12 < k6Var.getChildCount(); i12++) {
            View childAt2 = k6Var.getChildAt(i12);
            if (childAt2 instanceof rg.k) {
                ((rg.k) childAt2).setIsVideo(z11);
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
        return this.O0.c(true, false);
    }

    public View getBottomLayout() {
        return this.T0;
    }

    public View getCancelView() {
        return this.A0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.B0;
    }

    public View getEntitiesView() {
        return this.R0;
    }

    public long getLcm() {
        return this.f7964g1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.z5[] z5VarArr;
        k6 k6Var = this.R0;
        int childCount = k6Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = k6Var.getChildAt(i10);
            if (childAt instanceof rg.q2) {
                TLRPC.Document sticker = ((rg.q2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f19881id = sticker.f19875id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof rg.x2) {
                CharSequence text = ((rg.x2) childAt).getText();
                if ((text instanceof Spanned) && (z5VarArr = (org.telegram.ui.Components.z5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.z5.class)) != null) {
                    for (org.telegram.ui.Components.z5 z5Var : z5VarArr) {
                        if (z5Var != null) {
                            TLRPC.Document document = z5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.q5.f(this.F1, z5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f19881id = document.f19875id;
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
        return Arrays.asList(this.O0, this.P0, this.R0, this.Q0);
    }

    public View getRenderInputView() {
        return this.P0;
    }

    public qg.c1 getRenderView() {
        return this.O0;
    }

    public rg.k getSelectedEntity() {
        return this.J0;
    }

    public View getSelectionEntitiesView() {
        return this.Q0;
    }

    public View getTextDimView() {
        return this.X0;
    }

    public View getTopLayout() {
        return this.S0;
    }

    public View getWeightChooserView() {
        return this.f7958d1;
    }

    @Override
    public final void h(rg.k kVar) {
        O0(false);
        M0(kVar);
    }

    public final TextView h0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.G1));
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

    public final rg.s0 i0(rg.p0 p0Var) {
        int measuredWidth;
        int i10;
        this.f7974l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        k6 k6Var = this.R0;
        if (k6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = k6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.s0 s0Var = new rg.s0(getContext(), Q0, this.F1, p0Var, f7 / 360.0f, dp);
        if (Q0.x == k6Var.getMeasuredWidth() / 2.0f) {
            s0Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            s0Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.f44541a) != -47814) {
            s0Var.setColor(i10);
        }
        s0Var.setDelegate(this);
        s0Var.setMaxWidth(dp);
        k6Var.addView(s0Var, w7.x5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            s0Var.j(1.0f / cropState.cropScale);
            s0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return s0Var;
    }

    public final rg.v0 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f7974l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        k6 k6Var = this.R0;
        if (k6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = k6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.v0 v0Var = new rg.v0(getContext(), Q0, this.F1, messageMedia, mediaArea, f7 / 240.0f, dp);
        if (Q0.x == k6Var.getMeasuredWidth() / 2.0f) {
            v0Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            v0Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.f44541a) != -47814) {
            v0Var.setColor(i10);
        }
        v0Var.setDelegate(this);
        v0Var.setMaxWidth(dp);
        k6Var.addView(v0Var, w7.x5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            v0Var.j(1.0f / cropState.cropScale);
            v0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return v0Var;
    }

    public final rg.z1 k0(String str, boolean z10) {
        float f7;
        iv0 iv0Var;
        this.f7974l2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e7) {
            FileLog.e(e7);
            f7 = 1.0f;
        }
        k6 k6Var = this.R0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.R1, k6Var.getMeasuredWidth()) * 0.5d);
            iv0Var = new iv0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, k6Var.getMeasuredHeight()) * 0.5d);
            iv0Var = new iv0(f7 * floor2, floor2);
        }
        iv0 iv0Var2 = iv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = iv0Var2.f27271a;
            iv0Var2.f27271a = iv0Var2.f27272b;
            iv0Var2.f27272b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        rg.z1 z1Var = new rg.z1(context, e02, iv0Var2, str, intValue);
        z1Var.setDelegate(this);
        k6Var.addView(z1Var);
        g0();
        return z1Var;
    }

    @Override
    public final boolean l(MotionEvent motionEvent) {
        if (this.f7976m2) {
            return false;
        }
        if (this.J0 != null) {
            D0(null, true);
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y3);
        this.O0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final rg.c2 l0(boolean z10) {
        String str;
        iv0 iv0Var = new iv0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        k6 k6Var = this.R0;
        if (k6Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < k6Var.getChildCount(); i10++) {
                    View childAt = k6Var.getChildAt(i10);
                    if (v7.z6.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (k6Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (k6Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, k6Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, k6Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? kVar = new rg.k(getContext(), e02);
        kVar.f45145r0 = new bi.va(kVar);
        kVar.f45146s0 = new bi.va(kVar);
        kVar.f45147t0 = new ah.z0(kVar);
        kVar.f45148u0 = new ah.z0(kVar);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6((View) kVar);
        kVar.f45150w0 = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6((View) kVar);
        kVar.f45151x0 = e6Var2;
        kVar.f45153z0 = 1.0f;
        kVar.f45144q0 = iv0Var;
        e6Var2.d(1.0f, true);
        e6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        ah.z0 z0Var = kVar.f45147t0;
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
        ah.j1 b10 = ah.j1.b(str);
        kVar.f45149v0 = b10;
        z0Var.e(b10);
        kVar.k();
        kVar.setDelegate(this);
        k6Var.addView(kVar);
        g0();
        if (z10) {
            B0(kVar);
            D0(kVar, true);
        }
        return kVar;
    }

    public final rg.d2 m0(String str, boolean z10) {
        float f7;
        this.f7974l2 = true;
        this.f7978n2 = true;
        q0();
        k6 k6Var = this.R0;
        int measuredWidth = k6Var.getMeasuredWidth();
        k6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        iv0 iv0Var = new iv0(floor, floor);
        rg.d2 d2Var = new rg.d2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (iv0Var.f27272b / 2.0f) + AndroidUtilities.dp(72.0f)), iv0Var, str);
        d2Var.setDelegate(this);
        k6Var.addView(d2Var);
        g0();
        if (z10) {
            B0(d2Var);
            post(new v4(this, d2Var, 0));
        }
        this.f7978n2 = false;
        return d2Var;
    }

    public final d6 n0(Object obj, TLRPC.Document document) {
        float f7;
        for (int i10 = 0; i10 < document.attributes.size() && !(document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker); i10++) {
        }
        float f10 = 0.75f;
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            f7 = -(cropState.transformRotation + cropState.cropRotate);
            f10 = 0.75f / cropState.cropScale;
        } else {
            f7 = 0.0f;
        }
        p6 p6Var = new p6(e0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f27271a * 0.5d);
        d6 d6Var = new d6(this, context, p6Var.f7828a, p6Var.f7830c, p6Var.f7829b, new iv0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = d6Var.f45465x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        d6Var.setDelegate(this);
        this.R0.addView(d6Var);
        g0();
        return d6Var;
    }

    @Override
    public final void o(qg.m mVar) {
        boolean z10 = mVar instanceof qg.b;
        rg.y1 y1Var = this.f7958d1;
        if (!z10 && !(mVar instanceof qg.d)) {
            y1Var.b(0.05f, 1.0f);
        } else {
            y1Var.b(0.4f, 1.75f);
        }
        y1Var.setDrawCenter(!(mVar instanceof qg.l));
        g6 g6Var = this.O0;
        if (g6Var.getCurrentBrush() instanceof qg.l) {
            this.f7956c1 = true;
        }
        g6Var.setBrush(mVar);
        qg.q1 q1Var = this.A1;
        int i10 = q1Var.f44541a;
        q1Var.f44541a = qg.s0.e(this.F1).c();
        q1Var.f44543c = this.f7960e1.get();
        E0(q1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    public final rg.x2 o0(boolean z10) {
        iv0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        rg.x2 x2Var = new rg.x2(getContext(), Q0, (int) (paintingSize.f27271a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.f27271a / 9.0f;
        g5 g5Var = new g5(this, 0);
        x2Var.f45548w0 = (int) (0.5f * f7);
        x2Var.f45549x0 = (int) (f7 * 2.0f);
        x2Var.f45550y0 = g5Var;
        float f10 = Q0.x;
        k6 k6Var = this.R0;
        if (f10 == k6Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        x2Var.setTypeface(qg.s0.e(i10).f44573j);
        x2Var.setType(qg.s0.e(i10).h);
        k6Var.addView(x2Var, w7.x5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            x2Var.j(1.0f / cropState.cropScale);
            x2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            B0(x2Var);
            x2Var.q();
            D0(x2Var, false);
            x2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(x2Var.getFocusedView());
            this.K0 = true;
            int i11 = qg.s0.e(i10).f44571g;
            rg.q1 q1Var = this.l1;
            q1Var.d(i11, true);
            q1Var.setOutlineType(qg.s0.e(i10).h);
        }
        return x2Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        fk0 fk0Var = this.Z1;
        if (fk0Var != null) {
            AndroidUtilities.removeFromParent(fk0Var);
            this.Z1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        float f10;
        this.G0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.C0;
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
        float f11 = this.H0.f27271a;
        rg.k kVar = this.J0;
        if (kVar != null) {
            kVar.m();
        }
        measureChild(this.T0, i10, i11);
        measureChild(this.f7958d1, i10, i11);
        measureChild(this.V0, i10, i11);
        measureChild(this.U0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f7990t2 - this.M1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.S0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.G0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f7984q2 && !this.f7988s2) {
            this.G0 = true;
            w0();
            this.G0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    public final rg.y2 p0(nd ndVar) {
        int measuredWidth;
        int i10;
        this.f7974l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        k6 k6Var = this.R0;
        if (k6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = k6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.y2 y2Var = new rg.y2(getContext(), Q0, this.F1, ndVar, f7 / 240.0f, dp);
        if (Q0.x == k6Var.getMeasuredWidth() / 2.0f) {
            y2Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            y2Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.f44541a) != -47814) {
            y2Var.setColor(i10);
        }
        y2Var.setDelegate(this);
        y2Var.setMaxWidth(dp);
        k6Var.addView(y2Var, w7.x5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            y2Var.j(1.0f / cropState.cropScale);
            y2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return y2Var;
    }

    @Override
    public final boolean q() {
        return !(this.J0 instanceof rg.g1);
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 < k6Var.getChildCount()) {
                View childAt = k6Var.getChildAt(i10);
                if (childAt instanceof rg.d2) {
                    if (this.J0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(pr.h).withEndAction(new v4(this, (rg.d2) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean r() {
        return !this.K0;
    }

    public abstract void r0();

    @Override
    public final void requestLayout() {
        if (this.G0) {
            return;
        }
        super.requestLayout();
    }

    public final rg.g1 s0() {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 < k6Var.getChildCount()) {
                View childAt = k6Var.getChildAt(i10);
                if (childAt instanceof rg.g1) {
                    return (rg.g1) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ja jaVar) {
        this.f7961e2 = jaVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f7976m2 != z10) {
            this.f7976m2 = z10;
            if (z10) {
                D0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j3) {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 < k6Var.getChildCount()) {
                View childAt = k6Var.getChildAt(i10);
                if (childAt instanceof rg.q2) {
                    ImageReceiver imageReceiver = ((rg.q2) childAt).f45465x0;
                    xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    imageReceiver.getAnimation();
                    if (lottieAnimation != null) {
                        lottieAnimation.L(Math.round(((((float) j3) % ((float) lottieAnimation.p())) / ((float) lottieAnimation.p())) * lottieAnimation.f32557e[0]), true, false);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.Y1) {
            this.Y1 = z10;
            g0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.L1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.K1 = runnable;
    }

    @Override
    public final void t() {
        if (!this.f7986r2 && !this.f7984q2) {
            this.f7974l2 = true;
            o0(true);
            return;
        }
        if (this.f7984q2) {
            rg.k kVar = this.J0;
            if (kVar instanceof rg.x2) {
                this.O1.f7429e = true;
                AndroidUtilities.showKeyboard(((rg.x2) kVar).getEditText());
            }
        }
        J0(!this.f7984q2 ? 1 : 0);
    }

    public final android.graphics.Bitmap t0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, di.o8 r46) {
        throw new UnsupportedOperationException("Method not decompiled: di.q6.t0(java.util.ArrayList, boolean, boolean, boolean, boolean, di.o8):android.graphics.Bitmap");
    }

    @Override
    public final void u(float f7, float f10, float[] fArr) {
        View view;
        View view2 = (View) this.O0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f7 - view2.getX()) - view.getLeft();
        float y3 = (f10 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y3 - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    public final boolean u0() {
        if (!this.D0.a() && !this.f7974l2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean v(rg.k kVar) {
        return D0(kVar, true);
    }

    public final void v0(boolean z10) {
        if (this.f7984q2) {
            J0(0);
        }
        if (z10) {
            kz kzVar = this.f7982p2;
            if (kzVar != null && kzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f7982p2.getMeasuredHeight());
                ofFloat.addUpdateListener(new a5(this, 0));
                this.f7988s2 = true;
                ofFloat.addListener(new w5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21275w);
                ofFloat.start();
                return;
            }
            w0();
        }
    }

    @Override
    public final int[] w(rg.k kVar) {
        int[] iArr = this.f7980o2;
        iArr[0] = (int) kVar.getPosition().x;
        iArr[1] = (int) kVar.getPosition().y;
        return iArr;
    }

    public final void w0() {
        kz kzVar;
        if (!this.f7984q2 && (kzVar = this.f7982p2) != null && kzVar.getVisibility() != 8) {
            this.f7982p2.setVisibility(8);
        }
        int i10 = this.f7990t2;
        this.f7990t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    @Override
    public final qg.s0 x() {
        return qg.s0.e(this.F1);
    }

    public final boolean y0() {
        if (this.f7957c2) {
            if (this.Z1.getReactionsWindow() != null && !this.Z1.getReactionsWindow().f699q) {
                this.Z1.e();
                return true;
            }
            O0(false);
            return true;
        } else if (this.B1) {
            I0(false);
            return true;
        } else if (this.f7984q2) {
            v0(true);
            return true;
        } else if (!this.K0) {
            return false;
        } else {
            if (this.M0) {
                this.M0 = false;
                this.O1.b(true);
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

    public void setOffsetTranslationX(float f7) {
    }
}
