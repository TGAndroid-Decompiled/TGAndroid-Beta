package ci;

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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.yg;
import org.telegram.ui.LaunchActivity;
public abstract class r6 extends dw0 implements qg.r1, qg.h, qg.n1, bw0, kc {
    public final qg.g1 A0;
    public final pg.t1 A1;
    public final qg.k1 B0;
    public boolean B1;
    public final Bitmap C0;
    public o1.k C1;
    public final pg.w1 D0;
    public float D1;
    public final DispatchQueue E0;
    public final Paint E1;
    public final MediaController.CropState F0;
    public final int F1;
    public boolean G0;
    public final e6 G1;
    public wv0 H0;
    public org.telegram.ui.ActionBar.n1 H1;
    public boolean I0;
    public p6 I1;
    public qg.j J0;
    public Rect J1;
    public boolean K0;
    public Runnable K1;
    public int L0;
    public Runnable L1;
    public boolean M0;
    public final nc M1;
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
    public pg.x T1;
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
    public sk0 Z1;
    public float f5408a1;
    public qg.b2 a2;
    public ValueAnimator f5409b1;
    public float f5410b2;
    public boolean f5411c1;
    public boolean f5412c2;
    public final qg.x1 f5413d1;
    public boolean f5414d2;
    public final xa.c f5415e1;
    public org.telegram.ui.Components.ia f5416e2;
    public final int f5417f1;
    public final c7 f5418f2;
    public BigInteger f5419g1;
    public final d7 f5420g2;
    public TextView f5421h1;
    public boolean f5422h2;
    public TextView f5423i1;
    public ObjectAnimator f5424i2;
    public TextView f5425j1;
    public final float[] f5426j2;
    public final qg.s1 f5427k1;
    public z5 f5428k2;
    public final qg.p1 l1;
    public boolean f5429l2;
    public final qg.u1 f5430m1;
    public boolean f5431m2;
    public final ImageView f5432n1;
    public boolean f5433n2;
    public final TextView f5434o1;
    public final int[] f5435o2;
    public final TextView f5436p1;
    public kz f5437p2;
    public final TextView f5438q1;
    public boolean f5439q2;
    public final Paint f5440r1;
    public boolean f5441r2;
    public final Paint f5442s1;
    public boolean f5443s2;
    public float f5444t1;
    public int f5445t2;
    public boolean f5446u1;
    public boolean f5447u2;
    public o1.k f5448v1;
    public int f5449v2;
    public final r5 f5450w1;
    public int f5451w2;
    public final Paint f5452x1;
    public int f5453x2;
    public final Paint f5454y1;
    public boolean f5455y2;
    public final Paint f5456z1;

    public r6(Context context, boolean z10, File file, boolean z11, boolean z12, nc ncVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, o8 o8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ia iaVar, org.telegram.ui.ActionBar.f6 f6Var, c7 c7Var, d7 d7Var) {
        super(context, activity);
        g6 g6Var;
        pg.t1 t1Var;
        org.telegram.ui.Components.ia iaVar2;
        pg.u0 u0Var;
        DispatchQueue dispatchQueue;
        Bitmap bitmap3;
        Paint paint;
        Paint paint2;
        g6 g6Var2;
        int i14;
        this.Y0 = 0;
        this.Z0 = -1;
        final qb qbVar = (qb) this;
        xa.c cVar = new xa.c(qbVar, 11);
        this.f5415e1 = cVar;
        Paint paint3 = new Paint(1);
        this.f5440r1 = paint3;
        Paint paint4 = new Paint(1);
        this.f5442s1 = paint4;
        this.f5452x1 = new Paint(1);
        this.f5454y1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f5456z1 = paint5;
        pg.t1 t1Var2 = new pg.t1(1.0f, 0.016773745f, -1);
        this.A1 = t1Var2;
        this.E1 = new Paint(1);
        this.f5426j2 = new float[2];
        this.f5431m2 = false;
        this.f5435o2 = new int[2];
        new ai.q4(qbVar, 12);
        setDelegate(this);
        this.f5416e2 = iaVar;
        this.f5418f2 = c7Var;
        this.U1 = z10;
        this.V1 = file;
        this.W1 = z11;
        this.X1 = z12;
        this.M1 = ncVar;
        this.R1 = i12;
        this.S1 = i13;
        this.f5420g2 = d7Var;
        this.F1 = i10;
        e6 e6Var = new e6(f6Var);
        this.G1 = e6Var;
        this.F0 = cropState;
        this.N0 = context instanceof BubbleActivity;
        pg.u0 e = pg.u0.e(i10);
        e.i(0, true);
        t1Var2.f41314a = e.c();
        t1Var2.f41316c = e.f41328i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.E0 = dispatchQueue2;
        this.C0 = bitmap;
        this.f5417f1 = i11;
        pg.w1 w1Var = new pg.w1();
        this.D0 = w1Var;
        w1Var.f41350a = new a1.c(qbVar, 18);
        View view = new View(context);
        this.X0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        pg.s0 s0Var = new pg.s0(getPaintingSize(), null, i11, iaVar);
        if (o8Var == null || !o8Var.f5182u) {
            t1Var = t1Var2;
            iaVar2 = iaVar;
            u0Var = e;
            dispatchQueue = dispatchQueue2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            g6Var2 = g6Var;
        } else {
            t1Var = t1Var2;
            iaVar2 = null;
            u0Var = e;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            g6Var2 = g6Var;
            dispatchQueue = dispatchQueue2;
        }
        g6Var2 = new g6(qbVar, context, s0Var, bitmap3, bitmap2, iaVar2);
        this.O0 = g6Var2;
        g6Var2.setDelegate(new h6(qbVar));
        g6Var2.setUndoStore(w1Var);
        g6Var2.setQueue(dispatchQueue);
        g6Var2.setVisibility(4);
        i6 i6Var = new i6(qbVar, context);
        this.P0 = i6Var;
        i6Var.setVisibility(4);
        k6 k6Var = new k6(qbVar, context, new j6(qbVar));
        this.R0 = k6Var;
        this.P1 = o8Var;
        this.Q1 = arrayList;
        if (this.R1 > 0 && this.S1 > 0) {
            H0();
        }
        k6Var.setVisibility(4);
        this.Q0 = new l6(qbVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, w7.y5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f5432n1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        qb qbVar2 = qbVar;
                        g6 g6Var3 = qbVar2.O0;
                        if (g6Var3 != null && (g6Var3.getCurrentBrush() instanceof pg.l)) {
                            g6Var3.b();
                            qbVar2.f5427k1.setSelectedIndex(1);
                            qbVar2.b((pg.m) pg.m.f41218a.get(0));
                            return;
                        }
                        qbVar2.D0.c();
                        return;
                    case 1:
                        qb qbVar3 = qbVar;
                        g6 g6Var4 = qbVar3.O0;
                        pg.w1 w1Var2 = qbVar3.D0;
                        if (w1Var2.a()) {
                            if (g6Var4 != null && (g6Var4.getCurrentBrush() instanceof pg.l)) {
                                g6Var4.b();
                                qbVar3.f5427k1.setSelectedIndex(1);
                                qbVar3.b((pg.m) pg.m.f41218a.get(0));
                            }
                            if (g6Var4 != null) {
                                g6Var4.a();
                            }
                            w1Var2.f41352c.clear();
                            w1Var2.f41351b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r0(w1Var2, 13));
                            qbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        qb qbVar4 = qbVar;
                        qg.j jVar = qbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (qbVar4.f5439q2) {
                            qbVar4.v0(false);
                        }
                        qbVar4.C0(qbVar4.J0);
                        qbVar4.D0(null, true);
                        return;
                    case 3:
                        qbVar.D0(null, true);
                        return;
                    default:
                        qb qbVar5 = qbVar;
                        if (qbVar5.B1) {
                            qbVar5.I0(false);
                            return;
                        } else if (qbVar5.f5439q2) {
                            qbVar5.v0(true);
                            return;
                        } else if (qbVar5.K0) {
                            qbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = qbVar5.L1;
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
        frameLayout.addView(imageView, w7.y5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        rk.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, w7.y5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.y5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ai.e2(2));
        frameLayout.addView(linearLayout, w7.y5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f5434o1 = textView2;
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
                        qb qbVar2 = qbVar;
                        g6 g6Var3 = qbVar2.O0;
                        if (g6Var3 != null && (g6Var3.getCurrentBrush() instanceof pg.l)) {
                            g6Var3.b();
                            qbVar2.f5427k1.setSelectedIndex(1);
                            qbVar2.b((pg.m) pg.m.f41218a.get(0));
                            return;
                        }
                        qbVar2.D0.c();
                        return;
                    case 1:
                        qb qbVar3 = qbVar;
                        g6 g6Var4 = qbVar3.O0;
                        pg.w1 w1Var2 = qbVar3.D0;
                        if (w1Var2.a()) {
                            if (g6Var4 != null && (g6Var4.getCurrentBrush() instanceof pg.l)) {
                                g6Var4.b();
                                qbVar3.f5427k1.setSelectedIndex(1);
                                qbVar3.b((pg.m) pg.m.f41218a.get(0));
                            }
                            if (g6Var4 != null) {
                                g6Var4.a();
                            }
                            w1Var2.f41352c.clear();
                            w1Var2.f41351b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r0(w1Var2, 13));
                            qbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        qb qbVar4 = qbVar;
                        qg.j jVar = qbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (qbVar4.f5439q2) {
                            qbVar4.v0(false);
                        }
                        qbVar4.C0(qbVar4.J0);
                        qbVar4.D0(null, true);
                        return;
                    case 3:
                        qbVar.D0(null, true);
                        return;
                    default:
                        qb qbVar5 = qbVar;
                        if (qbVar5.B1) {
                            qbVar5.I0(false);
                            return;
                        } else if (qbVar5.f5439q2) {
                            qbVar5.v0(true);
                            return;
                        } else if (qbVar5.K0) {
                            qbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = qbVar5.L1;
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
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout, textView2, w7.y5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f5436p1 = h;
        h.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        h.setPadding(org.telegram.ui.Cells.c1.c(8.0f, R.string.Clear, h), 0, AndroidUtilities.dp(8.0f), 0);
        h.setGravity(16);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 16.0f);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        qb qbVar2 = qbVar;
                        g6 g6Var3 = qbVar2.O0;
                        if (g6Var3 != null && (g6Var3.getCurrentBrush() instanceof pg.l)) {
                            g6Var3.b();
                            qbVar2.f5427k1.setSelectedIndex(1);
                            qbVar2.b((pg.m) pg.m.f41218a.get(0));
                            return;
                        }
                        qbVar2.D0.c();
                        return;
                    case 1:
                        qb qbVar3 = qbVar;
                        g6 g6Var4 = qbVar3.O0;
                        pg.w1 w1Var2 = qbVar3.D0;
                        if (w1Var2.a()) {
                            if (g6Var4 != null && (g6Var4.getCurrentBrush() instanceof pg.l)) {
                                g6Var4.b();
                                qbVar3.f5427k1.setSelectedIndex(1);
                                qbVar3.b((pg.m) pg.m.f41218a.get(0));
                            }
                            if (g6Var4 != null) {
                                g6Var4.a();
                            }
                            w1Var2.f41352c.clear();
                            w1Var2.f41351b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r0(w1Var2, 13));
                            qbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        qb qbVar4 = qbVar;
                        qg.j jVar = qbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (qbVar4.f5439q2) {
                            qbVar4.v0(false);
                        }
                        qbVar4.C0(qbVar4.J0);
                        qbVar4.D0(null, true);
                        return;
                    case 3:
                        qbVar.D0(null, true);
                        return;
                    default:
                        qb qbVar5 = qbVar;
                        if (qbVar5.B1) {
                            qbVar5.I0(false);
                            return;
                        } else if (qbVar5.f5439q2) {
                            qbVar5.v0(true);
                            return;
                        } else if (qbVar5.K0) {
                            qbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = qbVar5.L1;
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
        TextView h10 = org.telegram.ui.Cells.c1.h(frameLayout, h, w7.y5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f5438q1 = h10;
        h10.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        h10.setPadding(org.telegram.ui.Cells.c1.c(8.0f, R.string.Done, h10), 0, AndroidUtilities.dp(8.0f), 0);
        h10.setGravity(16);
        h10.setTextColor(-1);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setTextSize(1, 16.0f);
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        qb qbVar2 = qbVar;
                        g6 g6Var3 = qbVar2.O0;
                        if (g6Var3 != null && (g6Var3.getCurrentBrush() instanceof pg.l)) {
                            g6Var3.b();
                            qbVar2.f5427k1.setSelectedIndex(1);
                            qbVar2.b((pg.m) pg.m.f41218a.get(0));
                            return;
                        }
                        qbVar2.D0.c();
                        return;
                    case 1:
                        qb qbVar3 = qbVar;
                        g6 g6Var4 = qbVar3.O0;
                        pg.w1 w1Var2 = qbVar3.D0;
                        if (w1Var2.a()) {
                            if (g6Var4 != null && (g6Var4.getCurrentBrush() instanceof pg.l)) {
                                g6Var4.b();
                                qbVar3.f5427k1.setSelectedIndex(1);
                                qbVar3.b((pg.m) pg.m.f41218a.get(0));
                            }
                            if (g6Var4 != null) {
                                g6Var4.a();
                            }
                            w1Var2.f41352c.clear();
                            w1Var2.f41351b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r0(w1Var2, 13));
                            qbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        qb qbVar4 = qbVar;
                        qg.j jVar = qbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (qbVar4.f5439q2) {
                            qbVar4.v0(false);
                        }
                        qbVar4.C0(qbVar4.J0);
                        qbVar4.D0(null, true);
                        return;
                    case 3:
                        qbVar.D0(null, true);
                        return;
                    default:
                        qb qbVar5 = qbVar;
                        if (qbVar5.B1) {
                            qbVar5.I0(false);
                            return;
                        } else if (qbVar5.f5439q2) {
                            qbVar5.v0(true);
                            return;
                        } else if (qbVar5.K0) {
                            qbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = qbVar5.L1;
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
        frameLayout.addView(h10, w7.y5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        pg.u0 u0Var2 = u0Var;
        m6 m6Var = new m6(qbVar, context, u0Var2);
        this.T0 = m6Var;
        m6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        m6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(m6Var, w7.y5.e(-1, 104, 80));
        qg.s1 s1Var = new qg.s1(context, (o8Var == null || o8Var.v() || o8Var.f5182u || iaVar == null) ? false : true);
        this.f5427k1 = s1Var;
        s1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        s1Var.setDelegate(this);
        s1Var.setSelectedIndex(1);
        m6Var.addView(s1Var, w7.y5.c(48.0f, -1));
        qg.p1 p1Var = new qg.p1(context);
        this.l1 = p1Var;
        p1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        p1Var.setVisibility(8);
        p1Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        qb qbVar2 = qbVar;
                        pg.t1 t1Var3 = qbVar2.A1;
                        qbVar2.F0(t1Var3);
                        pg.u0.e(i10).j(t1Var3.f41316c);
                        return;
                    default:
                        qbVar.l1.setTypeface(pg.u0.e(i10).f41329j);
                        return;
                }
            }
        });
        p1Var.setAlignment(pg.u0.e(i10).f41327g);
        m6Var.addView(p1Var, w7.y5.c(48.0f, -1));
        q5 q5Var = new q5(qbVar, context);
        this.U0 = q5Var;
        addView(q5Var, w7.y5.c(-1.0f, -1));
        qg.u1 u1Var = new qg.u1(context);
        this.f5430m1 = u1Var;
        u1Var.setVisibility(8);
        u1Var.setOnItemClickListener(new ai.g(qbVar, 5));
        p1Var.setTypefaceListView(u1Var);
        q5Var.addView(u1Var, w7.y5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint2.setColor(e6Var.F0(org.telegram.ui.ActionBar.j6.G8));
        r5 r5Var = new r5(qbVar, context);
        this.f5450w1 = r5Var;
        r5Var.setVisibility(8);
        r5Var.setColorPalette(pg.u0.e(i10));
        r5Var.setColorListener(new e5(qbVar, 0));
        m6Var.addView(r5Var, w7.y5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        qg.g1 g1Var = new qg.g1(context);
        this.A0 = g1Var;
        g1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        g1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        m6Var.addView(g1Var, w7.y5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        g1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        qb qbVar2 = qbVar;
                        g6 g6Var3 = qbVar2.O0;
                        if (g6Var3 != null && (g6Var3.getCurrentBrush() instanceof pg.l)) {
                            g6Var3.b();
                            qbVar2.f5427k1.setSelectedIndex(1);
                            qbVar2.b((pg.m) pg.m.f41218a.get(0));
                            return;
                        }
                        qbVar2.D0.c();
                        return;
                    case 1:
                        qb qbVar3 = qbVar;
                        g6 g6Var4 = qbVar3.O0;
                        pg.w1 w1Var2 = qbVar3.D0;
                        if (w1Var2.a()) {
                            if (g6Var4 != null && (g6Var4.getCurrentBrush() instanceof pg.l)) {
                                g6Var4.b();
                                qbVar3.f5427k1.setSelectedIndex(1);
                                qbVar3.b((pg.m) pg.m.f41218a.get(0));
                            }
                            if (g6Var4 != null) {
                                g6Var4.a();
                            }
                            w1Var2.f41352c.clear();
                            w1Var2.f41351b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r0(w1Var2, 13));
                            qbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        qb qbVar4 = qbVar;
                        qg.j jVar = qbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (qbVar4.f5439q2) {
                            qbVar4.v0(false);
                        }
                        qbVar4.C0(qbVar4.J0);
                        qbVar4.D0(null, true);
                        return;
                    case 3:
                        qbVar.D0(null, true);
                        return;
                    default:
                        qb qbVar5 = qbVar;
                        if (qbVar5.B1) {
                            qbVar5.I0(false);
                            return;
                        } else if (qbVar5.f5439q2) {
                            qbVar5.v0(true);
                            return;
                        } else if (qbVar5.K0) {
                            qbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = qbVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        qg.k1 k1Var = new qg.k1(context);
        this.B0 = k1Var;
        k1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        k1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        k1Var.setOnClickListener(new ai.d0(qbVar, context, u0Var2, 6));
        m6Var.addView(k1Var, w7.y5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        qg.x1 x1Var = new qg.x1(context);
        this.f5413d1 = x1Var;
        pg.t1 t1Var3 = t1Var;
        x1Var.setColorSwatch(t1Var3);
        x1Var.setRenderView(g6Var2);
        x1Var.setValueOverride(cVar);
        t1Var3.f41316c = cVar.get();
        x1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        qb qbVar2 = qbVar;
                        pg.t1 t1Var32 = qbVar2.A1;
                        qbVar2.F0(t1Var32);
                        pg.u0.e(i10).j(t1Var32.f41316c);
                        return;
                    default:
                        qbVar.l1.setTypeface(pg.u0.e(i10).f41329j);
                        return;
                }
            }
        });
        addView(x1Var, w7.y5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V0 = frameLayout2;
        addView(frameLayout2, w7.y5.c(-1.0f, -1));
        Paint paint6 = paint;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(t1Var3, null, false);
        b((pg.m) pg.m.f41218a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.O1 = new t5(qbVar, ncVar, new m2(i14, qbVar, ncVar));
        t2.G = i14;
    }

    public static void G0(qg.v2 v2Var, int i10) {
        int i11;
        v2Var.setAlign(i10);
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
        v2Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        v2Var.getEditText().setTextAlignment(i12);
    }

    public static void Z(qb qbVar, pg.u0 u0Var, Integer num) {
        u0Var.h(num.intValue(), true);
        u0Var.g();
        qbVar.setNewColor(num.intValue());
        qbVar.f5450w1.setSelectedColorIndex(u0Var.d());
        qbVar.T1 = null;
    }

    public static void a0(qb qbVar, Integer num) {
        qbVar.setNewColor(num.intValue());
        qbVar.I0(false);
    }

    public ViewGroup getBarView() {
        if (this.Y0 == 2) {
            return this.l1;
        }
        return this.f5427k1;
    }

    private int getFrameRotation() {
        int i10 = this.f5417f1;
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

    private wv0 getPaintingSize() {
        wv0 wv0Var = this.H0;
        if (wv0Var != null) {
            return wv0Var;
        }
        wv0 wv0Var2 = new wv0(1080.0f, 1920.0f);
        this.H0 = wv0Var2;
        return wv0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 < k6Var.getChildCount()) {
                View childAt = k6Var.getChildAt(i10);
                if (childAt instanceof qg.o2) {
                    ImageReceiver imageReceiver = ((qg.o2) childAt).f41887x0;
                    kj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
                        animation.f23218y = z10;
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
        pg.t1 t1Var = this.A1;
        int i11 = t1Var.f41314a;
        t1Var.f41314a = i10;
        E0(t1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new d5(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            ((qg.v2) jVar).setType(i10);
        }
        pg.u0 e = pg.u0.e(this.F1);
        e.h = i10;
        e.f41323a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        x5 x5Var = new x5(this, context);
        this.W0 = x5Var;
        x5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.y5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f5421h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f5421h1;
        int i10 = org.telegram.ui.ActionBar.j6.f19199i6;
        e6 e6Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), 7, -1));
        this.f5421h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5421h1.setTextColor(-1);
        this.f5421h1.setTextSize(1, 14.0f);
        this.f5421h1.setGravity(1);
        this.f5421h1.setTypeface(AndroidUtilities.bold());
        this.f5421h1.setSingleLine();
        this.f5421h1.setOnClickListener(new View.OnClickListener(this) {
            public final r6 f5693b;

            {
                this.f5693b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r6 r6Var = this.f5693b;
                        if (r6Var.K0) {
                            r6Var.D0(null, true);
                            return;
                        } else {
                            r6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f5693b.A0();
                        return;
                    default:
                        r6 r6Var2 = this.f5693b;
                        r6Var2.R0(2);
                        if (!(r6Var2.J0 instanceof qg.v2)) {
                            r6Var2.f5429l2 = true;
                            r6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f5421h1, w7.y5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f5423i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f5423i1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), 7, -1));
        this.f5423i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5423i1.setOnClickListener(new View.OnClickListener(this) {
            public final r6 f5693b;

            {
                this.f5693b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r6 r6Var = this.f5693b;
                        if (r6Var.K0) {
                            r6Var.D0(null, true);
                            return;
                        } else {
                            r6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f5693b.A0();
                        return;
                    default:
                        r6 r6Var2 = this.f5693b;
                        r6Var2.R0(2);
                        if (!(r6Var2.J0 instanceof qg.v2)) {
                            r6Var2.f5429l2 = true;
                            r6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f5423i1.setTextColor(-1);
        this.f5423i1.setTextSize(1, 14.0f);
        this.f5423i1.setGravity(1);
        this.f5423i1.setTypeface(AndroidUtilities.bold());
        this.f5423i1.setAlpha(0.6f);
        this.f5423i1.setSingleLine();
        this.W0.addView(this.f5423i1, w7.y5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f5425j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f5425j1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), 7, -1));
        this.f5425j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5425j1.setTextColor(-1);
        this.f5425j1.setTextSize(1, 14.0f);
        this.f5425j1.setGravity(1);
        this.f5425j1.setTypeface(AndroidUtilities.bold());
        this.f5425j1.setAlpha(0.6f);
        this.f5425j1.setSingleLine();
        this.f5425j1.setOnClickListener(new View.OnClickListener(this) {
            public final r6 f5693b;

            {
                this.f5693b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r6 r6Var = this.f5693b;
                        if (r6Var.K0) {
                            r6Var.D0(null, true);
                            return;
                        } else {
                            r6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f5693b.A0();
                        return;
                    default:
                        r6 r6Var2 = this.f5693b;
                        r6Var2.R0(2);
                        if (!(r6Var2.J0 instanceof qg.v2)) {
                            r6Var2.f5429l2 = true;
                            r6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f5425j1, w7.y5.l(1.0f, 0, -2));
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

    public final void A0() {
        final int i10 = this.Y0;
        R0(1);
        postDelayed(new ai.f(this, 8), 350L);
        z5 z5Var = new z5(this, getContext(), this.G1, i10);
        this.f5428k2 = z5Var;
        nc ncVar = this.M1;
        Objects.requireNonNull(ncVar);
        z5Var.f5552w = new bi.v(ncVar, 6);
        final boolean[] zArr = {true};
        z5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                r6 r6Var = r6.this;
                r6Var.f5428k2 = null;
                if (zArr[0]) {
                    r6Var.z0(false);
                }
                r6Var.R0(i10);
            }
        });
        z5Var.f5554y = new i5(this);
        z5Var.q0(new p5(this, zArr, z5Var, 0));
        z5Var.show();
        z0(true);
    }

    public final void B0(qg.j jVar) {
        this.D0.b(jVar.getUUID(), new f5(this, jVar, 0));
    }

    @Override
    public final int[] C(qg.j jVar) {
        int[] iArr = this.f5435o2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final void C0(qg.j jVar) {
        qg.j jVar2 = this.J0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            D0(null, true);
            if (jVar instanceof qg.v2) {
                ValueAnimator valueAnimator = this.f5409b1;
                if (valueAnimator != null && this.Z0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.R0.removeView(jVar);
        g0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            pg.w1 w1Var = this.D0;
            w1Var.f41351b.remove(uuid);
            w1Var.f41352c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r0(w1Var, 13));
        }
        qg.x1 x1Var = this.f5413d1;
        xa.c cVar = this.f5415e1;
        x1Var.setValueOverride(cVar);
        x1Var.setShowPreview(true);
        float f7 = cVar.get();
        pg.t1 t1Var = this.A1;
        t1Var.f41316c = f7;
        E0(t1Var, null, false);
        if (!this.f5433n2 && (jVar instanceof qg.c2)) {
            oc ocVar = ((qb) this).A2;
            cc ccVar = ocVar.X0;
            if (ccVar != null) {
                ccVar.s(null, null, true);
            }
            qb qbVar = ocVar.f5271v1;
            if (qbVar != null) {
                qbVar.q0();
            }
            ec ecVar = ocVar.f5212c1;
            if (ecVar != null) {
                ecVar.setHasRoundVideo(false);
            }
            o8 o8Var = ocVar.K1;
            if (o8Var != null) {
                File file = o8Var.f5171o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    ocVar.K1.f5171o0 = null;
                }
                if (ocVar.K1.f5173p0 != null) {
                    try {
                        new File(ocVar.K1.f5173p0).delete();
                    } catch (Exception unused2) {
                    }
                    ocVar.K1.f5173p0 = null;
                }
            }
        }
    }

    @Override
    public final void D() {
        P0(true);
    }

    public final boolean D0(qg.j jVar, boolean z10) {
        boolean z11;
        zc zcVar;
        zc zcVar2;
        sk0 sk0Var;
        int i10;
        boolean z12 = jVar instanceof qg.v2;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f5409b1;
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
            qg.v2 v2Var = (qg.v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            qg.p1 p1Var = this.l1;
            p1Var.setAlignment(i11);
            pg.k0 typeface = v2Var.getTypeface();
            if (typeface != null) {
                p1Var.setTypeface(typeface.f41206a);
            }
            p1Var.e(v2Var.getType(), true);
            this.U0.invalidate();
        }
        qg.j jVar2 = this.J0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f41716d0) {
                    if (jVar instanceof qg.u0) {
                        qg.u0 u0Var = (qg.u0) jVar;
                        u0Var.setType((u0Var.getType() + 1) % u0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof qg.w2) {
                        qg.w2 w2Var = (qg.w2) jVar;
                        w2Var.setType((w2Var.getType() + 1) % w2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof qg.r0) {
                        qg.r0 r0Var = (qg.r0) jVar;
                        qg.p0 p0Var = r0Var.f41941q0;
                        if (p0Var.e()) {
                            if (p0Var.getPreviewType() == 0) {
                                i12 = 1;
                            }
                            p0Var.setPreviewType(i12);
                            return true;
                        }
                        r0Var.setType(r0Var.getNextType());
                        return true;
                    } else if (!this.K0) {
                        if (jVar instanceof qg.v2) {
                            this.M0 = true;
                            r0();
                            return true;
                        } else if (jVar instanceof qg.b2) {
                            qg.b2 b2Var = (qg.b2) jVar;
                            if (this.f5412c2 && this.a2 == jVar) {
                                b2Var.q(true);
                                return true;
                            }
                            qg.b2 b2Var2 = this.a2;
                            if (b2Var2 != null && b2Var2 != b2Var && (sk0Var = this.Z1) != null) {
                                sk0Var.animate().alpha(0.0f).setListener(new v5(sk0Var, 0));
                                this.Z1 = null;
                                this.f5412c2 = false;
                                this.f5410b2 = 0.0f;
                            }
                            if (this.Z1 == null) {
                                sk0 sk0Var2 = new sk0(2, this.F1, getContext(), LaunchActivity.R(), new ai.x3(6, new ai.d()));
                                this.Z1 = sk0Var2;
                                org.telegram.ui.Components.ma maVar = new org.telegram.ui.Components.ma(this.f5416e2, sk0Var2, 0, false);
                                this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.M1.addView(this.Z1, w7.y5.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                sk0 sk0Var3 = this.Z1;
                                ?? obj = new Object();
                                obj.e = this;
                                obj.f4261c = maVar;
                                obj.d = paint;
                                obj.f4260b = new Path();
                                sk0Var3.setDelegate(obj);
                                this.Z1.p(null, null, true);
                            }
                            this.Z1.setFragment(LaunchActivity.R());
                            this.a2 = b2Var;
                            O0(true);
                            return true;
                        } else {
                            M0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof qg.v2) {
                        AndroidUtilities.showKeyboard(((qg.v2) jVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            qg.j jVar3 = this.J0;
            if (jVar3 instanceof qg.v2) {
                qg.v2 v2Var2 = (qg.v2) jVar3;
                qg.u2 u2Var = v2Var2.f41998q0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((qg.v2) this.J0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar3 instanceof qg.c2) && (zcVar2 = ((qb) this).A2.Z0) != null) {
                zcVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        qg.j jVar4 = this.J0;
        this.J0 = jVar;
        if ((jVar4 instanceof qg.v2) && TextUtils.isEmpty(((qg.v2) jVar4).getText())) {
            C0(jVar4);
        }
        qg.j jVar5 = this.J0;
        if (jVar4 != jVar5 && (jVar5 instanceof qg.c2) && (zcVar = ((qb) this).A2.Z0) != null) {
            zcVar.l(true);
        }
        qg.j jVar6 = this.J0;
        xa.c cVar = this.f5415e1;
        pg.t1 t1Var = this.A1;
        qg.x1 x1Var = this.f5413d1;
        if (jVar6 != null) {
            l6 l6Var = this.Q0;
            jVar6.m0 = l6Var;
            jVar6.l(l6Var, true);
            qg.j jVar7 = this.J0;
            if (jVar7 instanceof qg.v2) {
                qg.v2 v2Var3 = (qg.v2) jVar7;
                v2Var3.getSwatch().f41316c = t1Var.f41316c;
                v2Var3.f42007z0 = false;
                F0(v2Var3.getSwatch());
                x1Var.setValueOverride(new u5(v2Var3, (int) (this.H0.f30161a / 9.0f), 0));
                x1Var.setShowPreview(false);
            } else {
                x1Var.setValueOverride(cVar);
                x1Var.setShowPreview(true);
                t1Var.f41316c = cVar.get();
                E0(t1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f5409b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                I0(false);
            }
            R0(0);
            x1Var.setValueOverride(cVar);
            x1Var.setShowPreview(true);
            t1Var.f41316c = cVar.get();
            E0(t1Var, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(pg.t1 t1Var, Integer num, boolean z10) {
        pg.t1 t1Var2 = this.A1;
        if (t1Var2 != t1Var) {
            t1Var2.f41314a = t1Var.f41314a;
            t1Var2.f41315b = t1Var.f41315b;
            t1Var2.f41316c = t1Var.f41316c;
            int i10 = this.F1;
            pg.u0.e(i10).h(t1Var.f41314a, true);
            pg.u0.e(i10).j(t1Var.f41316c);
        }
        int i11 = t1Var.f41314a;
        g6 g6Var = this.O0;
        g6Var.setColor(i11);
        g6Var.setBrushSize(t1Var.f41316c);
        int i12 = t1Var2.f41314a;
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
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            ((qg.v2) jVar).setSwatch(new pg.t1(t1Var.f41315b, t1Var.f41316c, t1Var.f41314a));
        } else if (z10 && (jVar instanceof qg.u0)) {
            ((qg.u0) jVar).setColor(t1Var.f41314a);
            ((qg.u0) this.J0).setType(3);
        } else if (z10 && (jVar instanceof qg.w2)) {
            ((qg.w2) jVar).setColor(t1Var.f41314a);
            ((qg.w2) this.J0).setType(3);
        } else if (z10 && (jVar instanceof qg.r0)) {
            ((qg.r0) jVar).setColor(t1Var.f41314a);
            ((qg.r0) this.J0).setType(0);
        }
    }

    public final void F0(pg.t1 t1Var) {
        E0(t1Var, null, false);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f5441r2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f5451w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f5451w2).commit();
            } else {
                this.f5449v2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f5449v2).commit();
            }
        }
        boolean z13 = this.f5439q2;
        t5 t5Var = this.O1;
        if (z13) {
            if (z10) {
                i11 = this.f5451w2;
            } else {
                i11 = this.f5449v2;
            }
            int paddingUnderContainer = this.M1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5437p2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f5437p2.setLayoutParams(layoutParams);
                this.f5445t2 = layoutParams.height;
                t5Var.a();
                requestLayout();
            }
        }
        if (this.f5453x2 == i10 && this.f5455y2 == z10) {
            return;
        }
        this.f5453x2 = i10;
        this.f5455y2 = z10;
        boolean z14 = this.f5441r2;
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            if (((qg.v2) jVar).getEditText().isFocused() && t5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f5441r2 = z12;
        } else {
            this.f5441r2 = false;
        }
        if (this.f5441r2 && this.f5439q2) {
            J0(0);
        }
        if (this.f5445t2 != 0 && !(z11 = this.f5441r2) && z11 != z14 && !this.f5439q2) {
            this.f5445t2 = 0;
            t5Var.a();
            requestLayout();
        }
        U0();
        if (z14 && !this.f5441r2 && this.f5445t2 > 0 && this.f5447u2) {
            this.f5447u2 = false;
        }
        S0();
    }

    public final void H0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        qg.j jVar;
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
                        jVar = n02;
                    } else if (b10 == 1) {
                        qg.v2 o02 = o0(z10);
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
                        pg.t1 swatch = o02.getSwatch();
                        swatch.f41314a = mediaEntity.color;
                        o02.setSwatch(swatch);
                        jVar = o02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            qg.y1 k02 = k0(mediaEntity.text, false);
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
                            jVar = k02;
                        } else if (b10 == 6) {
                            ArrayList arrayList3 = o8Var.v;
                            boolean z11 = o8Var.K;
                            this.f5429l2 = true;
                            qg.j c6Var = new c6(this, getContext(), e0(), arrayList3, this.f5416e2, z11, this.f5418f2);
                            c6Var.setDelegate(this);
                            k6Var.addView(c6Var);
                            g0();
                            jVar = c6Var;
                            if (mediaEntity.viewWidth > 0) {
                                jVar = c6Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = c6Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    jVar = c6Var;
                                }
                            }
                        } else if (b10 == 3) {
                            qg.u0 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                j02.setColor(i14);
                            }
                            j02.setType(mediaEntity.subType);
                            jVar = j02;
                        } else if (b10 == 8) {
                            nd ndVar = mediaEntity.weather;
                            if (ndVar != null) {
                                qg.w2 p02 = p0(ndVar);
                                int i15 = mediaEntity.color;
                                if (i15 != 0) {
                                    p02.setColor(i15);
                                }
                                p02.setType(mediaEntity.subType);
                                jVar = p02;
                            } else {
                                i11 = i10 + 1;
                                z10 = false;
                            }
                        } else if (b10 == 7) {
                            qg.r0 i02 = i0(mediaEntity.linkSettings);
                            qg.p0 p0Var = i02.f41941q0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                i02.setColor(i16);
                            }
                            boolean e = p0Var.e();
                            int i17 = p0Var.h;
                            int i18 = p0Var.f41899f;
                            if (e) {
                                p0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                i02.setType(3);
                                p0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(p0Var.f41892a0)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(p0Var.f41894b0)) + i17 + i17;
                                PointF position = i02.getPosition();
                                position.y = (this.S1 * 0.3f) + position.y;
                                i02.setPosition(position);
                                i11 = i10 + 1;
                                z10 = false;
                            } else {
                                i02.setType(b11);
                                jVar = i02;
                            }
                        } else if (b10 == 4) {
                            qg.b2 l02 = l0(false);
                            l02.s(zg.p0.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                l02.r(false);
                            }
                            jVar = l02;
                            if (mediaEntity.mediaArea.dark) {
                                l02.q(false);
                                jVar = l02;
                            }
                        } else {
                            if (b10 == 5 && o8Var.f5171o0 != null) {
                                qg.c2 m0 = m0(o8Var.f5173p0, false);
                                oc ocVar = ((qb) this).A2;
                                cc ccVar = ocVar.X0;
                                if (ccVar != null) {
                                    ccVar.f4531w = m0;
                                    v71 v71Var = ccVar.f4533x;
                                    if (v71Var != null) {
                                        v71Var.V(m0.f41638u0);
                                    }
                                }
                                ec ecVar = ocVar.f5212c1;
                                if (ecVar != null) {
                                    ecVar.setHasRoundVideo(true);
                                }
                                jVar = m0;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !m0.f41635r0;
                                    m0.f41635r0 = z12;
                                    m0.f41636s0.f(z12, true);
                                    m0.invalidate();
                                    jVar = m0;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f15860x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f15861y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                    jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
                    jVar.setScale(mediaEntity.scale);
                    jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
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
            lVar.f15543i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f15537u = lVar;
            if (!this.O1.c() && this.f5445t2 <= 0) {
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
                    r6 r6Var = r6.this;
                    m6 m6Var = r6Var.T0;
                    float f14 = f11 / 1000.0f;
                    r6Var.D1 = f14;
                    float f15 = 1.0f;
                    float f16 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f16);
                    view.setScaleY(f16);
                    view.setTranslationY((Math.min(r6Var.D1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(r6Var.D1, 0.25f) / 0.25f));
                    r5 r5Var = r6Var.f5450w1;
                    float f17 = r6Var.D1;
                    boolean z12 = z10;
                    r5Var.z1(f17, z12);
                    qg.k1 k1Var = r6Var.B0;
                    k1Var.setProgress(r6Var.D1);
                    qg.g1 g1Var = r6Var.A0;
                    g1Var.setProgress(r6Var.D1);
                    r6Var.W0.setTranslationY(AndroidUtilities.dp(32.0f) * r6Var.D1);
                    AnimatorSet animatorSet = r6Var.N1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f18 = r6Var.D1;
                        if (!z12) {
                            f18 = 1.0f - f18;
                        }
                        if (z12) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        float f19 = alpha;
                        k1Var.setAlpha(AndroidUtilities.lerp(f19, f13, f18));
                        if (!z12) {
                            f15 = 0.0f;
                        }
                        g1Var.setAlpha(AndroidUtilities.lerp(f19, f15, f18));
                        float dp = AndroidUtilities.dp(39.0f) * f18;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        m6Var.setTranslationY(translationY - (dp * i10));
                    }
                    m6Var.invalidate();
                    if (view == r6Var.l1) {
                        r6Var.U0.invalidate();
                    }
                }
            });
            this.C1.a(new z4(this, z10, 0));
            this.C1.f();
            if (z10) {
                r5 r5Var = this.f5450w1;
                r5Var.setVisibility(0);
                r5Var.setSelectedColorIndex(pg.u0.e(this.F1).d());
            }
        }
    }

    public final void J0(int i10) {
        boolean z10;
        int i11;
        qg.p1 p1Var = this.l1;
        t5 t5Var = this.O1;
        if (i10 == 1) {
            kz kzVar = this.f5437p2;
            if (kzVar != null && kzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kz kzVar2 = this.f5437p2;
            nc ncVar = this.M1;
            if (kzVar2 != null && kzVar2.f25858c1 != UserConfig.selectedAccount) {
                ncVar.removeView(kzVar2);
                this.f5437p2 = null;
            }
            if (this.f5437p2 == null) {
                kz kzVar3 = new kz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.f5437p2 = kzVar3;
                kzVar3.f25922w2 = false;
                kzVar3.U0 = true;
                kzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f5437p2.setForseMultiwindowLayout(true);
                }
                this.f5437p2.setDelegate(new f6(this));
                ncVar.addView(this.f5437p2);
            }
            this.f5437p2.setVisibility(0);
            this.f5439q2 = true;
            kz kzVar4 = this.f5437p2;
            if (this.f5449v2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f5449v2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f5449v2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f5451w2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f5451w2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f5451w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f5451w2;
            } else {
                i11 = this.f5449v2;
            }
            int paddingUnderContainer = ncVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            kzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                qg.j jVar = this.J0;
                if (jVar instanceof qg.v2) {
                    AndroidUtilities.hideKeyboard(((qg.v2) jVar).getEditText());
                }
            }
            this.f5445t2 = paddingUnderContainer;
            t5Var.a();
            requestLayout();
            ah emojiButton = p1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            if (!z10) {
                if (this.f5441r2) {
                    this.f5447u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5445t2, 0.0f);
                    ofFloat.addUpdateListener(new a5(this, 1));
                    ofFloat.addListener(new w5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19714w);
                    ofFloat.start();
                }
            }
        } else {
            ah emojiButton2 = p1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(yg.e, true);
            }
            kz kzVar5 = this.f5437p2;
            if (kzVar5 != null) {
                this.f5439q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f5445t2 = 0;
                t5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(qg.r0 r0Var) {
        x8 x8Var = new x8(getContext(), this.G1, this.f5420g2, new m2(3, this, r0Var));
        if (r0Var != null) {
            qg.o0 o0Var = r0Var.f41945u0;
            x8Var.f5764c0 = true;
            org.telegram.ui.Cells.k3 k3Var = x8Var.Z;
            org.telegram.ui.Cells.k3 k3Var2 = x8Var.Y;
            if (o0Var != null) {
                x8Var.f5768g0 = o0Var.d;
                x8Var.f5769h0 = false;
                k3Var2.setText(o0Var.f41875c);
                k3Var.setText(o0Var.f41874b);
                x8Var.m0 = !TextUtils.isEmpty(o0Var.f41874b);
                x8Var.f5774n0 = o0Var.f41876f;
                x8Var.f5775o0 = o0Var.e;
            } else {
                k3Var2.setText("");
                k3Var.setText("");
                x8Var.f5774n0 = true;
                x8Var.f5775o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = x8Var.f5763b0;
            dVar.g(string, false, true);
            t8 t8Var = x8Var.X;
            if (t8Var != null) {
                t8Var.N(false);
            }
            dVar.setEnabled(x8Var.V(k3Var2.getText().toString()));
            x8Var.f5764c0 = false;
        }
        x8Var.setOnDismissListener(new m5(this, 1));
        x8Var.show();
        z0(true);
    }

    public final void L0(qg.u0 u0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        vi viVar = new vi(getContext(), new a6(this, callback2), false, true, false, this.G1);
        viVar.Z1 = new Object();
        xh xhVar = viVar.f29154x1;
        if (u0Var != null && (messageMedia = u0Var.f41990u0) != null && (geoPoint = messageMedia.geo) != null) {
            viVar.f29155x2 = new double[]{geoPoint.lat, geoPoint._long};
            viVar.O = true;
            xhVar.setVisibility(8);
        } else if (this.U1) {
            viVar.f29147v2 = this.W1;
            viVar.f29151w2 = this.V1;
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

    public final void M0(qg.j jVar) {
        if (jVar instanceof qg.f1) {
            org.telegram.ui.ActionBar.n1 n1Var = this.H1;
            if (n1Var != null && n1Var.isShowing()) {
                this.H1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f5435o2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        k6 k6Var = this.R0;
        float scaleX2 = k6Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = k6Var.getScaleY() * scaleY * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        N0(new f5(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, r6 r6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.n1 n1Var = this.H1;
        if (n1Var != null && n1Var.isShowing()) {
            this.H1.d(true);
            return;
        }
        if (this.I1 == null) {
            this.J1 = new Rect();
            p6 p6Var = new p6(this, getContext());
            this.I1 = p6Var;
            p6Var.setAnimationEnabled(true);
            this.I1.setOnTouchListener(new h5(this, 0));
            this.I1.setDispatchKeyEventListener(new i5(this));
            this.I1.setShownFromBottom(true);
        }
        p6 p6Var2 = this.I1;
        p6Var2.W = z10;
        p6Var2.d();
        runnable.run();
        if (this.H1 == null) {
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(this.I1, -2, -2);
            this.H1 = n1Var2;
            n1Var2.f19655b = true;
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
        this.H1.showAtLocation(r6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.n1.i(this.I1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            p6 p6Var3 = this.I1;
            p6Var3.setBackgroundDrawable(new org.telegram.ui.Components.la(new org.telegram.ui.Components.ma(this.f5416e2, p6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.I1.setBackgroundDrawable(mutate);
        this.I1.setBackgroundColor(-14145495);
    }

    public final void O0(boolean z10) {
        if (this.f5412c2 != z10) {
            if (z10 || this.Z1 != null) {
                this.f5412c2 = z10;
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
                    this.f5414d2 = true;
                    this.M1.invalidate();
                    float f10 = this.f5410b2;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.Z1.setTransitionProgress(this.f5410b2);
                    ofFloat.addUpdateListener(new a5(this, 2));
                    ofFloat.addListener(new ai.n(11, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(qr.f27654g);
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
        if (this.f5446u1 != z10) {
            this.f5446u1 = z10;
            o1.k kVar = this.f5448v1;
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
            this.f5448v1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f15543i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f15537u = lVar;
            if (z10) {
                qg.u1 u1Var = this.f5430m1;
                u1Var.setAlpha(0.0f);
                u1Var.setVisibility(0);
            }
            this.f5448v1.b(new ai.qa(1, this));
            this.f5448v1.a(new z4(this, z10, 1));
            this.f5448v1.f();
        }
    }

    public final PointF Q0(qg.j jVar) {
        float f7;
        float f10 = 200.0f;
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            f10 = 200.0f / cropState.cropScale;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
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
                if (!(childAt instanceof qg.j) || (childAt instanceof qg.f1)) {
                    f7 = f11;
                } else {
                    PointF position2 = ((qg.j) childAt).getPosition();
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
        return this.O1.f4847l - this.M1.getBottomPadding2();
    }

    public final void R0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.Y0 != i10 && this.Z0 != i10) {
            ValueAnimator valueAnimator = this.f5409b1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.Y0;
            ViewGroup viewGroup3 = this.l1;
            ViewGroup viewGroup4 = this.f5427k1;
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
            pg.u0 e = pg.u0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f41331l != z10) {
                e.f41331l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f41323a.getInt("brush", 0), false);
                }
            }
            int c10 = pg.u0.e(i12).c();
            pg.t1 t1Var = this.A1;
            t1Var.f41314a = c10;
            E0(t1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f5409b1 = duration;
            duration.setInterpolator(qr.f27653f);
            this.f5409b1.addUpdateListener(new ai.x4(this, viewGroup, viewGroup2, 1));
            this.f5409b1.addListener(new y5(this, viewGroup, viewGroup2, i10, 0));
            this.f5409b1.start();
        }
    }

    public final void S0() {
        boolean z10;
        t5 t5Var = this.O1;
        qg.p1 p1Var = this.l1;
        if (p1Var != null) {
            if (t5Var.c()) {
                p1Var.a(R.drawable.input_smile);
            } else if (this.f5439q2) {
                p1Var.a(R.drawable.input_keyboard);
            } else {
                p1Var.a(R.drawable.msg_add);
            }
        }
        if (!t5Var.c() && !this.f5439q2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.f5434o1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5432n1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5438q1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5436p1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        float f7;
        qg.j jVar;
        ObjectAnimator objectAnimator = this.f5424i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        t5 t5Var = this.O1;
        if (((t5Var.c() && !t5Var.d) || this.f5445t2 > 0) && (jVar = this.J0) != null) {
            f7 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.f5424i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f5424i2.setInterpolator(qr.h);
        this.f5424i2.start();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: ci.r6.U0():void");
    }

    @Override
    public final void a() {
        I0(true);
    }

    @Override
    public final void b(pg.m mVar) {
        boolean z10 = mVar instanceof pg.b;
        qg.x1 x1Var = this.f5413d1;
        if (!z10 && !(mVar instanceof pg.d)) {
            x1Var.b(0.05f, 1.0f);
        } else {
            x1Var.b(0.4f, 1.75f);
        }
        x1Var.setDrawCenter(!(mVar instanceof pg.l));
        g6 g6Var = this.O0;
        if (g6Var.getCurrentBrush() instanceof pg.l) {
            this.f5411c1 = true;
        }
        g6Var.setBrush(mVar);
        pg.t1 t1Var = this.A1;
        int i10 = t1Var.f41314a;
        t1Var.f41314a = pg.u0.e(this.F1).c();
        t1Var.f41316c = this.f5415e1.get();
        E0(t1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    @Override
    public final boolean d(qg.j jVar) {
        return D0(jVar, true);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new ai.ba(17, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f5431m2) {
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
    public final void e() {
        this.E1.setColor(-15132391);
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

    @Override
    public final void f() {
        setTextType((this.L0 + 1) % 4);
    }

    public abstract boolean f0(ai.n8 n8Var);

    @Override
    public final void g(int i10) {
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            G0((qg.v2) jVar, i10);
            pg.u0 e = pg.u0.e(this.F1);
            e.f41327g = i10;
            e.f41323a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void g0() {
        org.telegram.ui.Components.y5[] y5VarArr;
        boolean z10 = this.W1;
        k6 k6Var = this.R0;
        boolean z11 = true;
        if (!z10 && !this.Y1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < k6Var.getChildCount()) {
                    View childAt = k6Var.getChildAt(i10);
                    boolean z12 = childAt instanceof qg.v2;
                    int i11 = this.F1;
                    if (z12) {
                        CharSequence text = ((qg.v2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.y5 y5Var : (org.telegram.ui.Components.y5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.y5.class)) {
                                TLRPC.Document document = y5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.p5.f(i11, y5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.p5.h(i11).e(document);
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
                    } else if (childAt instanceof qg.o2) {
                        TLRPC.Document sticker = ((qg.o2) childAt).getSticker();
                        if (o8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof qg.c2) {
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
            if (childAt2 instanceof qg.j) {
                ((qg.j) childAt2).setIsVideo(z11);
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
        return this.f5419g1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.y5[] y5VarArr;
        k6 k6Var = this.R0;
        int childCount = k6Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = k6Var.getChildAt(i10);
            if (childAt instanceof qg.o2) {
                TLRPC.Document sticker = ((qg.o2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f18355id = sticker.f18349id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof qg.v2) {
                CharSequence text = ((qg.v2) childAt).getText();
                if ((text instanceof Spanned) && (y5VarArr = (org.telegram.ui.Components.y5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.y5.class)) != null) {
                    for (org.telegram.ui.Components.y5 y5Var : y5VarArr) {
                        if (y5Var != null) {
                            TLRPC.Document document = y5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.p5.f(this.F1, y5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f18355id = document.f18349id;
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

    public pg.f1 getRenderView() {
        return this.O0;
    }

    public qg.j getSelectedEntity() {
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
        return this.f5413d1;
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

    public final qg.r0 i0(qg.o0 o0Var) {
        int measuredWidth;
        int i10;
        this.f5429l2 = true;
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
        qg.r0 r0Var = new qg.r0(getContext(), Q0, this.F1, o0Var, f7 / 360.0f, dp);
        if (Q0.x == k6Var.getMeasuredWidth() / 2.0f) {
            r0Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            r0Var.setStickyY(2);
        }
        pg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.f41314a) != -47814) {
            r0Var.setColor(i10);
        }
        r0Var.setDelegate(this);
        r0Var.setMaxWidth(dp);
        k6Var.addView(r0Var, w7.y5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            r0Var.j(1.0f / cropState.cropScale);
            r0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return r0Var;
    }

    public final qg.u0 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f5429l2 = true;
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
        qg.u0 u0Var = new qg.u0(getContext(), Q0, this.F1, messageMedia, mediaArea, f7 / 240.0f, dp);
        if (Q0.x == k6Var.getMeasuredWidth() / 2.0f) {
            u0Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            u0Var.setStickyY(2);
        }
        pg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.f41314a) != -47814) {
            u0Var.setColor(i10);
        }
        u0Var.setDelegate(this);
        u0Var.setMaxWidth(dp);
        k6Var.addView(u0Var, w7.y5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            u0Var.j(1.0f / cropState.cropScale);
            u0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return u0Var;
    }

    public final qg.y1 k0(String str, boolean z10) {
        float f7;
        wv0 wv0Var;
        this.f5429l2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        k6 k6Var = this.R0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.R1, k6Var.getMeasuredWidth()) * 0.5d);
            wv0Var = new wv0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, k6Var.getMeasuredHeight()) * 0.5d);
            wv0Var = new wv0(f7 * floor2, floor2);
        }
        wv0 wv0Var2 = wv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = wv0Var2.f30161a;
            wv0Var2.f30161a = wv0Var2.f30162b;
            wv0Var2.f30162b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        qg.y1 y1Var = new qg.y1(context, e02, wv0Var2, str, intValue);
        y1Var.setDelegate(this);
        k6Var.addView(y1Var);
        g0();
        return y1Var;
    }

    public final qg.b2 l0(boolean z10) {
        String str;
        wv0 wv0Var = new wv0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        k6 k6Var = this.R0;
        if (k6Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < k6Var.getChildCount(); i10++) {
                    View childAt = k6Var.getChildAt(i10);
                    if (v7.a7.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (k6Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (k6Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, k6Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, k6Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new qg.j(getContext(), e02);
        jVar.f41624r0 = new ai.ob(jVar);
        jVar.f41625s0 = new ai.ob(jVar);
        jVar.f41626t0 = new zg.g0(jVar);
        jVar.f41627u0 = new zg.g0(jVar);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6((View) jVar);
        jVar.f41629w0 = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6((View) jVar);
        jVar.f41630x0 = d6Var2;
        jVar.f41632z0 = 1.0f;
        jVar.f41623q0 = wv0Var;
        d6Var2.d(1.0f, true);
        d6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        zg.g0 g0Var = jVar.f41626t0;
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
        zg.p0 b10 = zg.p0.b(str);
        jVar.f41628v0 = b10;
        g0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        k6Var.addView(jVar);
        g0();
        if (z10) {
            B0(jVar);
            D0(jVar, true);
        }
        return jVar;
    }

    @Override
    public final boolean m(MotionEvent motionEvent) {
        if (this.f5431m2) {
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

    public final qg.c2 m0(String str, boolean z10) {
        float f7;
        this.f5429l2 = true;
        this.f5433n2 = true;
        q0();
        k6 k6Var = this.R0;
        int measuredWidth = k6Var.getMeasuredWidth();
        k6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        wv0 wv0Var = new wv0(floor, floor);
        qg.c2 c2Var = new qg.c2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (wv0Var.f30162b / 2.0f) + AndroidUtilities.dp(72.0f)), wv0Var, str);
        c2Var.setDelegate(this);
        k6Var.addView(c2Var);
        g0();
        if (z10) {
            B0(c2Var);
            post(new v4(this, c2Var, 0));
        }
        this.f5433n2 = false;
        return c2Var;
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
        q6 q6Var = new q6(e0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f30161a * 0.5d);
        d6 d6Var = new d6(this, context, q6Var.f5345a, q6Var.f5347c, q6Var.f5346b, new wv0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = d6Var.f41887x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        d6Var.setDelegate(this);
        this.R0.addView(d6Var);
        g0();
        return d6Var;
    }

    public final qg.v2 o0(boolean z10) {
        wv0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        qg.v2 v2Var = new qg.v2(getContext(), Q0, (int) (paintingSize.f30161a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.f30161a / 9.0f;
        g5 g5Var = new g5(this, 0);
        v2Var.f42004w0 = (int) (0.5f * f7);
        v2Var.f42005x0 = (int) (f7 * 2.0f);
        v2Var.f42006y0 = g5Var;
        float f10 = Q0.x;
        k6 k6Var = this.R0;
        if (f10 == k6Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        v2Var.setTypeface(pg.u0.e(i10).f41329j);
        v2Var.setType(pg.u0.e(i10).h);
        k6Var.addView(v2Var, w7.y5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
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
            this.K0 = true;
            int i11 = pg.u0.e(i10).f41327g;
            qg.p1 p1Var = this.l1;
            p1Var.d(i11, true);
            p1Var.setOutlineType(pg.u0.e(i10).h);
        }
        return v2Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        sk0 sk0Var = this.Z1;
        if (sk0Var != null) {
            AndroidUtilities.removeFromParent(sk0Var);
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
        float f11 = this.H0.f30161a;
        qg.j jVar = this.J0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.T0, i10, i11);
        measureChild(this.f5413d1, i10, i11);
        measureChild(this.V0, i10, i11);
        measureChild(this.U0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f5445t2 - this.M1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.S0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.G0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f5439q2 && !this.f5443s2) {
            this.G0 = true;
            w0();
            this.G0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    public final qg.w2 p0(nd ndVar) {
        int measuredWidth;
        int i10;
        this.f5429l2 = true;
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
        qg.w2 w2Var = new qg.w2(getContext(), Q0, this.F1, ndVar, f7 / 240.0f, dp);
        if (Q0.x == k6Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        pg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.f41314a) != -47814) {
            w2Var.setColor(i10);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth(dp);
        k6Var.addView(w2Var, w7.y5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            w2Var.j(1.0f / cropState.cropScale);
            w2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return w2Var;
    }

    @Override
    public final boolean q() {
        return !(this.J0 instanceof qg.f1);
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 < k6Var.getChildCount()) {
                View childAt = k6Var.getChildAt(i10);
                if (childAt instanceof qg.c2) {
                    if (this.J0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(qr.h).withEndAction(new v4(this, (qg.c2) childAt, 1)).start();
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

    public final qg.f1 s0() {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 < k6Var.getChildCount()) {
                View childAt = k6Var.getChildAt(i10);
                if (childAt instanceof qg.f1) {
                    return (qg.f1) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ia iaVar) {
        this.f5416e2 = iaVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f5431m2 != z10) {
            this.f5431m2 = z10;
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
                if (childAt instanceof qg.o2) {
                    ImageReceiver imageReceiver = ((qg.o2) childAt).f41887x0;
                    kj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    imageReceiver.getAnimation();
                    if (lottieAnimation != null) {
                        lottieAnimation.N(Math.round(((((float) j3) % ((float) lottieAnimation.r())) / ((float) lottieAnimation.r())) * lottieAnimation.e[0]), true, false);
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
        if (!this.f5441r2 && !this.f5439q2) {
            this.f5429l2 = true;
            o0(true);
            return;
        }
        if (this.f5439q2) {
            qg.j jVar = this.J0;
            if (jVar instanceof qg.v2) {
                this.O1.e = true;
                AndroidUtilities.showKeyboard(((qg.v2) jVar).getEditText());
            }
        }
        J0(!this.f5439q2 ? 1 : 0);
    }

    public final android.graphics.Bitmap t0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, ci.o8 r46) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r6.t0(java.util.ArrayList, boolean, boolean, boolean, boolean, ci.o8):android.graphics.Bitmap");
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
        if (!this.D0.a() && !this.f5429l2) {
            return false;
        }
        return true;
    }

    @Override
    public final pg.u0 v() {
        return pg.u0.e(this.F1);
    }

    public final void v0(boolean z10) {
        if (this.f5439q2) {
            J0(0);
        }
        if (z10) {
            kz kzVar = this.f5437p2;
            if (kzVar != null && kzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f5437p2.getMeasuredHeight());
                ofFloat.addUpdateListener(new a5(this, 0));
                this.f5443s2 = true;
                ofFloat.addListener(new w5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19714w);
                ofFloat.start();
                return;
            }
            w0();
        }
    }

    public final void w0() {
        kz kzVar;
        if (!this.f5439q2 && (kzVar = this.f5437p2) != null && kzVar.getVisibility() != 8) {
            this.f5437p2.setVisibility(8);
        }
        int i10 = this.f5445t2;
        this.f5445t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    @Override
    public final void y() {
        N0(new g5(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean y0() {
        if (this.f5412c2) {
            if (this.Z1.getReactionsWindow() != null && !this.Z1.getReactionsWindow().f49316q) {
                this.Z1.e();
                return true;
            }
            O0(false);
            return true;
        } else if (this.B1) {
            I0(false);
            return true;
        } else if (this.f5439q2) {
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

    @Override
    public final void z(qg.j jVar) {
        O0(false);
        M0(jVar);
    }

    public abstract void z0(boolean z10);

    public void setOffsetTranslationX(float f7) {
    }

    public View getView() {
        return this;
    }
}
