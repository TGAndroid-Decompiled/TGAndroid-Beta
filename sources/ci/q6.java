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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
public abstract class q6 extends vw0 implements qg.q1, qg.h, qg.m1, tw0, hc {
    public final qg.f1 A0;
    public final pg.s1 A1;
    public final qg.j1 B0;
    public boolean B1;
    public final Bitmap C0;
    public o1.k C1;
    public final pg.v1 D0;
    public float D1;
    public final DispatchQueue E0;
    public final Paint E1;
    public final MediaController.CropState F0;
    public final int F1;
    public boolean G0;
    public final d6 G1;
    public ow0 H0;
    public org.telegram.ui.ActionBar.m1 H1;
    public boolean I0;
    public o6 I1;
    public qg.j J0;
    public Rect J1;
    public boolean K0;
    public Runnable K1;
    public int L0;
    public Runnable L1;
    public boolean M0;
    public final kc M1;
    public final boolean N0;
    public AnimatorSet N1;
    public final f6 O0;
    public final r5 O1;
    public final h6 P0;
    public l8 P1;
    public final k6 Q0;
    public ArrayList Q1;
    public final j6 R0;
    public int R1;
    public final FrameLayout S0;
    public int S1;
    public final l6 T0;
    public pg.x T1;
    public final o5 U0;
    public final boolean U1;
    public final FrameLayout V0;
    public final File V1;
    public w5 W0;
    public final boolean W1;
    public final View X0;
    public final boolean X1;
    public int Y0;
    public boolean Y1;
    public int Z0;
    public ml0 Z1;
    public float f5789a1;
    public qg.a2 a2;
    public ValueAnimator f5790b1;
    public float f5791b2;
    public boolean f5792c1;
    public boolean f5793c2;
    public final qg.w1 f5794d1;
    public boolean f5795d2;
    public final a6.i f5796e1;
    public org.telegram.ui.Components.la f5797e2;
    public final int f5798f1;
    public final a7 f5799f2;
    public BigInteger f5800g1;
    public final b7 f5801g2;
    public TextView f5802h1;
    public boolean f5803h2;
    public TextView f5804i1;
    public ObjectAnimator f5805i2;
    public TextView f5806j1;
    public final float[] f5807j2;
    public final qg.r1 f5808k1;
    public y5 f5809k2;
    public final qg.o1 l1;
    public boolean f5810l2;
    public final qg.t1 f5811m1;
    public boolean f5812m2;
    public final ImageView f5813n1;
    public boolean f5814n2;
    public final TextView f5815o1;
    public final int[] f5816o2;
    public final TextView f5817p1;
    public b00 f5818p2;
    public final TextView f5819q1;
    public boolean f5820q2;
    public final Paint f5821r1;
    public boolean f5822r2;
    public final Paint f5823s1;
    public boolean f5824s2;
    public float f5825t1;
    public int f5826t2;
    public boolean f5827u1;
    public boolean f5828u2;
    public o1.k f5829v1;
    public int f5830v2;
    public final p5 f5831w1;
    public int f5832w2;
    public final Paint f5833x1;
    public int f5834x2;
    public final Paint f5835y1;
    public boolean f5836y2;
    public final Paint f5837z1;

    public q6(Context context, boolean z10, File file, boolean z11, boolean z12, kc kcVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, l8 l8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.la laVar, org.telegram.ui.ActionBar.d6 d6Var, a7 a7Var, b7 b7Var) {
        super(context, activity);
        f6 f6Var;
        Paint paint;
        org.telegram.ui.Components.la laVar2;
        pg.u0 u0Var;
        Bitmap bitmap3;
        DispatchQueue dispatchQueue;
        Paint paint2;
        pg.s1 s1Var;
        f6 f6Var2;
        int i14;
        this.Y0 = 0;
        this.Z0 = -1;
        final nb nbVar = (nb) this;
        a6.i iVar = new a6.i(nbVar, 12);
        this.f5796e1 = iVar;
        Paint paint3 = new Paint(1);
        this.f5821r1 = paint3;
        Paint paint4 = new Paint(1);
        this.f5823s1 = paint4;
        this.f5833x1 = new Paint(1);
        this.f5835y1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f5837z1 = paint5;
        pg.s1 s1Var2 = new pg.s1(1.0f, 0.016773745f, -1);
        this.A1 = s1Var2;
        this.E1 = new Paint(1);
        this.f5807j2 = new float[2];
        this.f5812m2 = false;
        this.f5816o2 = new int[2];
        new ai.r4(nbVar, 12);
        setDelegate(this);
        this.f5797e2 = laVar;
        this.f5799f2 = a7Var;
        this.U1 = z10;
        this.V1 = file;
        this.W1 = z11;
        this.X1 = z12;
        this.M1 = kcVar;
        this.R1 = i12;
        this.S1 = i13;
        this.f5801g2 = b7Var;
        this.F1 = i10;
        d6 d6Var2 = new d6(d6Var);
        this.G1 = d6Var2;
        this.F0 = cropState;
        this.N0 = context instanceof BubbleActivity;
        pg.u0 e7 = pg.u0.e(i10);
        e7.i(0, true);
        s1Var2.f45812a = e7.c();
        s1Var2.f45814c = e7.f45840i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.E0 = dispatchQueue2;
        this.C0 = bitmap;
        this.f5798f1 = i11;
        pg.v1 v1Var = new pg.v1();
        this.D0 = v1Var;
        v1Var.f45855a = new a1.c(nbVar, 18);
        View view = new View(context);
        this.X0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        pg.s0 s0Var = new pg.s0(getPaintingSize(), null, i11, laVar);
        if (l8Var == null || !l8Var.f5435u) {
            paint = paint5;
            laVar2 = laVar;
            u0Var = e7;
            bitmap3 = bitmap;
            dispatchQueue = dispatchQueue2;
            paint2 = paint4;
            s1Var = s1Var2;
            f6Var2 = f6Var;
        } else {
            paint = paint5;
            laVar2 = null;
            u0Var = e7;
            bitmap3 = bitmap;
            paint2 = paint4;
            s1Var = s1Var2;
            f6Var2 = f6Var;
            dispatchQueue = dispatchQueue2;
        }
        f6Var2 = new f6(nbVar, context, s0Var, bitmap3, bitmap2, laVar2);
        this.O0 = f6Var2;
        f6Var2.setDelegate(new g6(nbVar));
        f6Var2.setUndoStore(v1Var);
        f6Var2.setQueue(dispatchQueue);
        f6Var2.setVisibility(4);
        h6 h6Var = new h6(nbVar, context);
        this.P0 = h6Var;
        h6Var.setVisibility(4);
        j6 j6Var = new j6(nbVar, context, new i6(nbVar));
        this.R0 = j6Var;
        this.P1 = l8Var;
        this.Q1 = arrayList;
        if (this.R1 > 0 && this.S1 > 0) {
            G0();
        }
        j6Var.setVisibility(4);
        this.Q0 = new k6(nbVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, w7.x5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f5813n1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        nb nbVar2 = nbVar;
                        f6 f6Var3 = nbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            nbVar2.f5808k1.setSelectedIndex(1);
                            nbVar2.b((pg.m) pg.m.f45722a.get(0));
                            return;
                        }
                        nbVar2.D0.c();
                        return;
                    case 1:
                        nb nbVar3 = nbVar;
                        f6 f6Var4 = nbVar3.O0;
                        pg.v1 v1Var2 = nbVar3.D0;
                        if (v1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                nbVar3.f5808k1.setSelectedIndex(1);
                                nbVar3.b((pg.m) pg.m.f45722a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            v1Var2.f45857c.clear();
                            v1Var2.f45856b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(v1Var2, 12));
                            nbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nb nbVar4 = nbVar;
                        qg.j jVar = nbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (nbVar4.f5820q2) {
                            nbVar4.u0(false);
                        }
                        nbVar4.B0(nbVar4.J0);
                        nbVar4.C0(null, true);
                        return;
                    case 3:
                        nbVar.C0(null, true);
                        return;
                    default:
                        nb nbVar5 = nbVar;
                        if (nbVar5.B1) {
                            nbVar5.H0(false);
                            return;
                        } else if (nbVar5.f5820q2) {
                            nbVar5.u0(true);
                            return;
                        } else if (nbVar5.K0) {
                            nbVar5.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = nbVar5.L1;
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
        frameLayout.addView(imageView, w7.x5.a(32.0f, 12.0f, 0.0f, 0.0f, 0.0f, 32, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        ai.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, w7.x5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.x5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ai.e2(2));
        frameLayout.addView(linearLayout, w7.x5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f5815o1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.g0(822083583, 7, -1));
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
                        nb nbVar2 = nbVar;
                        f6 f6Var3 = nbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            nbVar2.f5808k1.setSelectedIndex(1);
                            nbVar2.b((pg.m) pg.m.f45722a.get(0));
                            return;
                        }
                        nbVar2.D0.c();
                        return;
                    case 1:
                        nb nbVar3 = nbVar;
                        f6 f6Var4 = nbVar3.O0;
                        pg.v1 v1Var2 = nbVar3.D0;
                        if (v1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                nbVar3.f5808k1.setSelectedIndex(1);
                                nbVar3.b((pg.m) pg.m.f45722a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            v1Var2.f45857c.clear();
                            v1Var2.f45856b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(v1Var2, 12));
                            nbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nb nbVar4 = nbVar;
                        qg.j jVar = nbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (nbVar4.f5820q2) {
                            nbVar4.u0(false);
                        }
                        nbVar4.B0(nbVar4.J0);
                        nbVar4.C0(null, true);
                        return;
                    case 3:
                        nbVar.C0(null, true);
                        return;
                    default:
                        nb nbVar5 = nbVar;
                        if (nbVar5.B1) {
                            nbVar5.H0(false);
                            return;
                        } else if (nbVar5.f5820q2) {
                            nbVar5.u0(true);
                            return;
                        } else if (nbVar5.K0) {
                            nbVar5.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = nbVar5.L1;
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
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView2, w7.x5.a(32.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5), context);
        this.f5817p1 = g10;
        g10.setBackground(org.telegram.ui.ActionBar.h6.g0(822083583, 7, -1));
        g10.setPadding(org.telegram.ui.Cells.c1.b(8.0f, R.string.Clear, g10), 0, AndroidUtilities.dp(8.0f), 0);
        g10.setGravity(16);
        g10.setTextColor(-1);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextSize(1, 16.0f);
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        nb nbVar2 = nbVar;
                        f6 f6Var3 = nbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            nbVar2.f5808k1.setSelectedIndex(1);
                            nbVar2.b((pg.m) pg.m.f45722a.get(0));
                            return;
                        }
                        nbVar2.D0.c();
                        return;
                    case 1:
                        nb nbVar3 = nbVar;
                        f6 f6Var4 = nbVar3.O0;
                        pg.v1 v1Var2 = nbVar3.D0;
                        if (v1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                nbVar3.f5808k1.setSelectedIndex(1);
                                nbVar3.b((pg.m) pg.m.f45722a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            v1Var2.f45857c.clear();
                            v1Var2.f45856b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(v1Var2, 12));
                            nbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nb nbVar4 = nbVar;
                        qg.j jVar = nbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (nbVar4.f5820q2) {
                            nbVar4.u0(false);
                        }
                        nbVar4.B0(nbVar4.J0);
                        nbVar4.C0(null, true);
                        return;
                    case 3:
                        nbVar.C0(null, true);
                        return;
                    default:
                        nb nbVar5 = nbVar;
                        if (nbVar5.B1) {
                            nbVar5.H0(false);
                            return;
                        } else if (nbVar5.f5820q2) {
                            nbVar5.u0(true);
                            return;
                        } else if (nbVar5.K0) {
                            nbVar5.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = nbVar5.L1;
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
        TextView g11 = org.telegram.ui.Cells.c1.g(frameLayout, g10, w7.x5.a(32.0f, 4.0f, 0.0f, 0.0f, 0.0f, -2, 51), context);
        this.f5819q1 = g11;
        g11.setBackground(org.telegram.ui.ActionBar.h6.g0(822083583, 7, -1));
        g11.setPadding(org.telegram.ui.Cells.c1.b(8.0f, R.string.Done, g11), 0, AndroidUtilities.dp(8.0f), 0);
        g11.setGravity(16);
        g11.setTextColor(-1);
        g11.setTypeface(AndroidUtilities.bold());
        g11.setTextSize(1, 16.0f);
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        nb nbVar2 = nbVar;
                        f6 f6Var3 = nbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            nbVar2.f5808k1.setSelectedIndex(1);
                            nbVar2.b((pg.m) pg.m.f45722a.get(0));
                            return;
                        }
                        nbVar2.D0.c();
                        return;
                    case 1:
                        nb nbVar3 = nbVar;
                        f6 f6Var4 = nbVar3.O0;
                        pg.v1 v1Var2 = nbVar3.D0;
                        if (v1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                nbVar3.f5808k1.setSelectedIndex(1);
                                nbVar3.b((pg.m) pg.m.f45722a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            v1Var2.f45857c.clear();
                            v1Var2.f45856b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(v1Var2, 12));
                            nbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nb nbVar4 = nbVar;
                        qg.j jVar = nbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (nbVar4.f5820q2) {
                            nbVar4.u0(false);
                        }
                        nbVar4.B0(nbVar4.J0);
                        nbVar4.C0(null, true);
                        return;
                    case 3:
                        nbVar.C0(null, true);
                        return;
                    default:
                        nb nbVar5 = nbVar;
                        if (nbVar5.B1) {
                            nbVar5.H0(false);
                            return;
                        } else if (nbVar5.f5820q2) {
                            nbVar5.u0(true);
                            return;
                        } else if (nbVar5.K0) {
                            nbVar5.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = nbVar5.L1;
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
        frameLayout.addView(g11, w7.x5.a(32.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5));
        pg.u0 u0Var2 = u0Var;
        l6 l6Var = new l6(nbVar, context, u0Var2);
        this.T0 = l6Var;
        l6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        l6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(l6Var, w7.x5.e(-1, 104, 80));
        qg.r1 r1Var = new qg.r1(context, (l8Var == null || l8Var.v() || l8Var.f5435u || laVar == null) ? false : true);
        this.f5808k1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        l6Var.addView(r1Var, w7.x5.d(48.0f, -1));
        qg.o1 o1Var = new qg.o1(context);
        this.l1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        nb nbVar2 = nbVar;
                        pg.s1 s1Var3 = nbVar2.A1;
                        nbVar2.E0(s1Var3);
                        pg.u0.e(i10).j(s1Var3.f45814c);
                        return;
                    default:
                        nbVar.l1.setTypeface(pg.u0.e(i10).f45841j);
                        return;
                }
            }
        });
        o1Var.setAlignment(pg.u0.e(i10).f45839g);
        l6Var.addView(o1Var, w7.x5.d(48.0f, -1));
        o5 o5Var = new o5(nbVar, context);
        this.U0 = o5Var;
        addView(o5Var, w7.x5.d(-1.0f, -1));
        qg.t1 t1Var = new qg.t1(context);
        this.f5811m1 = t1Var;
        t1Var.setVisibility(8);
        t1Var.setOnItemClickListener(new ai.g(nbVar, 5));
        o1Var.setTypefaceListView(t1Var);
        o5Var.addView(t1Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 8.0f, 8.0f, -2, 85));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint2.setColor(d6Var2.x0(org.telegram.ui.ActionBar.h6.G8));
        p5 p5Var = new p5(nbVar, context);
        this.f5831w1 = p5Var;
        p5Var.setVisibility(8);
        p5Var.setColorPalette(pg.u0.e(i10));
        p5Var.setColorListener(new c5(nbVar, 0));
        l6Var.addView(p5Var, w7.x5.a(84.0f, 56.0f, 0.0f, 56.0f, 6.0f, -1, 48));
        setupTabsLayout(context);
        qg.f1 f1Var = new qg.f1(context);
        this.A0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 1, -1));
        l6Var.addView(f1Var, w7.x5.a(32.0f, 12.0f, 0.0f, 0.0f, 4.0f, 32, 83));
        f1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        nb nbVar2 = nbVar;
                        f6 f6Var3 = nbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            nbVar2.f5808k1.setSelectedIndex(1);
                            nbVar2.b((pg.m) pg.m.f45722a.get(0));
                            return;
                        }
                        nbVar2.D0.c();
                        return;
                    case 1:
                        nb nbVar3 = nbVar;
                        f6 f6Var4 = nbVar3.O0;
                        pg.v1 v1Var2 = nbVar3.D0;
                        if (v1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                nbVar3.f5808k1.setSelectedIndex(1);
                                nbVar3.b((pg.m) pg.m.f45722a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            v1Var2.f45857c.clear();
                            v1Var2.f45856b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(v1Var2, 12));
                            nbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nb nbVar4 = nbVar;
                        qg.j jVar = nbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (nbVar4.f5820q2) {
                            nbVar4.u0(false);
                        }
                        nbVar4.B0(nbVar4.J0);
                        nbVar4.C0(null, true);
                        return;
                    case 3:
                        nbVar.C0(null, true);
                        return;
                    default:
                        nb nbVar5 = nbVar;
                        if (nbVar5.B1) {
                            nbVar5.H0(false);
                            return;
                        } else if (nbVar5.f5820q2) {
                            nbVar5.u0(true);
                            return;
                        } else if (nbVar5.K0) {
                            nbVar5.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = nbVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        qg.j1 j1Var = new qg.j1(context);
        this.B0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 1, -1));
        j1Var.setOnClickListener(new ai.d0(nbVar, context, u0Var2, 6));
        l6Var.addView(j1Var, w7.x5.a(32.0f, 0.0f, 0.0f, 12.0f, 4.0f, 32, 85));
        qg.w1 w1Var = new qg.w1(context);
        this.f5794d1 = w1Var;
        pg.s1 s1Var3 = s1Var;
        w1Var.setColorSwatch(s1Var3);
        w1Var.setRenderView(f6Var2);
        w1Var.setValueOverride(iVar);
        s1Var3.f45814c = iVar.get();
        w1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        nb nbVar2 = nbVar;
                        pg.s1 s1Var32 = nbVar2.A1;
                        nbVar2.E0(s1Var32);
                        pg.u0.e(i10).j(s1Var32.f45814c);
                        return;
                    default:
                        nbVar.l1.setTypeface(pg.u0.e(i10).f45841j);
                        return;
                }
            }
        });
        addView(w1Var, w7.x5.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V0 = frameLayout2;
        addView(frameLayout2, w7.x5.d(-1.0f, -1));
        Paint paint6 = paint;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(AndroidUtilities.dp(2.0f));
        D0(s1Var3, null, false);
        b((pg.m) pg.m.f45722a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.O1 = new r5(nbVar, kcVar, new ai.h3(2, nbVar, kcVar));
        r2.G = i14;
    }

    public static void F0(qg.v2 v2Var, int i10) {
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

    public static void Z(nb nbVar, pg.u0 u0Var, Integer num) {
        u0Var.h(num.intValue(), true);
        u0Var.g();
        nbVar.setNewColor(num.intValue());
        nbVar.f5831w1.setSelectedColorIndex(u0Var.d());
        nbVar.T1 = null;
    }

    public static void a0(nb nbVar, Integer num) {
        nbVar.setNewColor(num.intValue());
        nbVar.H0(false);
    }

    public ViewGroup getBarView() {
        if (this.Y0 == 2) {
            return this.l1;
        }
        return this.f5808k1;
    }

    private int getFrameRotation() {
        int i10 = this.f5798f1;
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

    private ow0 getPaintingSize() {
        ow0 ow0Var = this.H0;
        if (ow0Var != null) {
            return ow0Var;
        }
        ow0 ow0Var2 = new ow0(1080.0f, 1920.0f);
        this.H0 = ow0Var2;
        return ow0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 < j6Var.getChildCount()) {
                View childAt = j6Var.getChildAt(i10);
                if (childAt instanceof qg.o2) {
                    ImageReceiver imageReceiver = ((qg.o2) childAt).f46583x0;
                    ek0 lottieAnimation = imageReceiver.getLottieAnimation();
                    org.telegram.ui.Components.f6 animation = imageReceiver.getAnimation();
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
                        animation.f26255y = z10;
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
        pg.s1 s1Var = this.A1;
        int i11 = s1Var.f45812a;
        s1Var.f45812a = i10;
        D0(s1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new b5(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            ((qg.v2) jVar).setType(i10);
        }
        pg.u0 e7 = pg.u0.e(this.F1);
        e7.h = i10;
        e7.f45834a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        w5 w5Var = new w5(this, context);
        this.W0 = w5Var;
        w5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.x5.a(40.0f, 52.0f, 0.0f, 52.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        this.f5802h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f5802h1;
        int i10 = org.telegram.ui.ActionBar.h6.f20877i6;
        d6 d6Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), 7, -1));
        this.f5802h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5802h1.setTextColor(-1);
        this.f5802h1.setTextSize(1, 14.0f);
        this.f5802h1.setGravity(1);
        this.f5802h1.setTypeface(AndroidUtilities.bold());
        this.f5802h1.setSingleLine();
        this.f5802h1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f6063b;

            {
                this.f6063b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f6063b;
                        if (q6Var.K0) {
                            q6Var.C0(null, true);
                            return;
                        } else {
                            q6Var.Q0(0);
                            return;
                        }
                    case 1:
                        this.f6063b.z0();
                        return;
                    default:
                        q6 q6Var2 = this.f6063b;
                        q6Var2.Q0(2);
                        if (!(q6Var2.J0 instanceof qg.v2)) {
                            q6Var2.f5810l2 = true;
                            q6Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f5802h1, w7.x5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f5804i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f5804i1.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), 7, -1));
        this.f5804i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5804i1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f6063b;

            {
                this.f6063b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f6063b;
                        if (q6Var.K0) {
                            q6Var.C0(null, true);
                            return;
                        } else {
                            q6Var.Q0(0);
                            return;
                        }
                    case 1:
                        this.f6063b.z0();
                        return;
                    default:
                        q6 q6Var2 = this.f6063b;
                        q6Var2.Q0(2);
                        if (!(q6Var2.J0 instanceof qg.v2)) {
                            q6Var2.f5810l2 = true;
                            q6Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f5804i1.setTextColor(-1);
        this.f5804i1.setTextSize(1, 14.0f);
        this.f5804i1.setGravity(1);
        this.f5804i1.setTypeface(AndroidUtilities.bold());
        this.f5804i1.setAlpha(0.6f);
        this.f5804i1.setSingleLine();
        this.W0.addView(this.f5804i1, w7.x5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f5806j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f5806j1.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), 7, -1));
        this.f5806j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5806j1.setTextColor(-1);
        this.f5806j1.setTextSize(1, 14.0f);
        this.f5806j1.setGravity(1);
        this.f5806j1.setTypeface(AndroidUtilities.bold());
        this.f5806j1.setAlpha(0.6f);
        this.f5806j1.setSingleLine();
        this.f5806j1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f6063b;

            {
                this.f6063b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f6063b;
                        if (q6Var.K0) {
                            q6Var.C0(null, true);
                            return;
                        } else {
                            q6Var.Q0(0);
                            return;
                        }
                    case 1:
                        this.f6063b.z0();
                        return;
                    default:
                        q6 q6Var2 = this.f6063b;
                        q6Var2.Q0(2);
                        if (!(q6Var2.J0 instanceof qg.v2)) {
                            q6Var2.f5810l2 = true;
                            q6Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f5806j1, w7.x5.l(1.0f, 0, -2));
    }

    public static boolean w0(TLRPC.Document document) {
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

    public final void A0(qg.j jVar) {
        this.D0.b(jVar.getUUID(), new d5(this, jVar, 0));
    }

    public final void B0(qg.j jVar) {
        qg.j jVar2 = this.J0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            C0(null, true);
            if (jVar instanceof qg.v2) {
                ValueAnimator valueAnimator = this.f5790b1;
                if (valueAnimator != null && this.Z0 != 0) {
                    valueAnimator.cancel();
                }
                Q0(0);
            }
        }
        this.R0.removeView(jVar);
        f0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            pg.v1 v1Var = this.D0;
            v1Var.f45856b.remove(uuid);
            v1Var.f45857c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(v1Var, 12));
        }
        qg.w1 w1Var = this.f5794d1;
        a6.i iVar = this.f5796e1;
        w1Var.setValueOverride(iVar);
        w1Var.setShowPreview(true);
        float f7 = iVar.get();
        pg.s1 s1Var = this.A1;
        s1Var.f45814c = f7;
        D0(s1Var, null, false);
        if (!this.f5814n2 && (jVar instanceof qg.b2)) {
            lc lcVar = ((nb) this).A2;
            zb zbVar = lcVar.X0;
            if (zbVar != null) {
                zbVar.s(null, null, true);
            }
            nb nbVar = lcVar.f5526v1;
            if (nbVar != null) {
                nbVar.p0();
            }
            bc bcVar = lcVar.f5466c1;
            if (bcVar != null) {
                bcVar.setHasRoundVideo(false);
            }
            l8 l8Var = lcVar.K1;
            if (l8Var != null) {
                File file = l8Var.f5424o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    lcVar.K1.f5424o0 = null;
                }
                if (lcVar.K1.f5426p0 != null) {
                    try {
                        new File(lcVar.K1.f5426p0).delete();
                    } catch (Exception unused2) {
                    }
                    lcVar.K1.f5426p0 = null;
                }
            }
        }
    }

    @Override
    public final int[] C(qg.j jVar) {
        int[] iArr = this.f5816o2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final boolean C0(qg.j jVar, boolean z10) {
        boolean z11;
        wc wcVar;
        wc wcVar2;
        ml0 ml0Var;
        int i10;
        boolean z12 = jVar instanceof qg.v2;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f5790b1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.B1) {
                H0(false);
            }
            Q0(2);
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
            qg.o1 o1Var = this.l1;
            o1Var.setAlignment(i11);
            pg.k0 typeface = v2Var.getTypeface();
            if (typeface != null) {
                o1Var.setTypeface(typeface.f45708a);
            }
            o1Var.e(v2Var.getType(), true);
            this.U0.invalidate();
        }
        qg.j jVar2 = this.J0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f46374d0) {
                    if (jVar instanceof qg.t0) {
                        qg.t0 t0Var = (qg.t0) jVar;
                        t0Var.setType((t0Var.getType() + 1) % t0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof qg.w2) {
                        qg.w2 w2Var = (qg.w2) jVar;
                        w2Var.setType((w2Var.getType() + 1) % w2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof qg.q0) {
                        qg.q0 q0Var = (qg.q0) jVar;
                        qg.o0 o0Var = q0Var.f46595q0;
                        if (o0Var.e()) {
                            if (o0Var.getPreviewType() == 0) {
                                i12 = 1;
                            }
                            o0Var.setPreviewType(i12);
                            return true;
                        }
                        q0Var.setType(q0Var.getNextType());
                        return true;
                    } else if (!this.K0) {
                        if (jVar instanceof qg.v2) {
                            this.M0 = true;
                            q0();
                            return true;
                        } else if (jVar instanceof qg.a2) {
                            qg.a2 a2Var = (qg.a2) jVar;
                            if (this.f5793c2 && this.a2 == jVar) {
                                a2Var.q(true);
                                return true;
                            }
                            qg.a2 a2Var2 = this.a2;
                            if (a2Var2 != null && a2Var2 != a2Var && (ml0Var = this.Z1) != null) {
                                ml0Var.animate().alpha(0.0f).setListener(new t5(ml0Var, 0));
                                this.Z1 = null;
                                this.f5793c2 = false;
                                this.f5791b2 = 0.0f;
                            }
                            if (this.Z1 == null) {
                                ml0 ml0Var2 = new ml0(2, this.F1, getContext(), LaunchActivity.R(), new ai.y3(6, new ai.d()));
                                this.Z1 = ml0Var2;
                                org.telegram.ui.Components.pa paVar = new org.telegram.ui.Components.pa(this.f5797e2, ml0Var2, 0, false);
                                this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.M1.addView(this.Z1, w7.x5.a(96.0f, 0.0f, 0.0f, 12.0f, 64.0f, -2, 53));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                ml0 ml0Var3 = this.Z1;
                                ?? obj = new Object();
                                obj.f6067e = this;
                                obj.f6065b = paVar;
                                obj.d = paint;
                                obj.f6066c = new Path();
                                ml0Var3.setDelegate(obj);
                                this.Z1.p(null, null, true);
                            }
                            this.Z1.setFragment(LaunchActivity.R());
                            this.a2 = a2Var;
                            N0(true);
                            return true;
                        } else {
                            L0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof qg.v2) {
                        AndroidUtilities.showKeyboard(((qg.v2) jVar2).getFocusedView());
                        u0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            qg.j jVar3 = this.J0;
            if (jVar3 instanceof qg.v2) {
                qg.v2 v2Var2 = (qg.v2) jVar3;
                qg.u2 u2Var = v2Var2.f46663q0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((qg.v2) this.J0).getFocusedView());
                    u0(false);
                }
            } else if ((jVar3 instanceof qg.b2) && (wcVar2 = ((nb) this).A2.Z0) != null) {
                wcVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        qg.j jVar4 = this.J0;
        this.J0 = jVar;
        if ((jVar4 instanceof qg.v2) && TextUtils.isEmpty(((qg.v2) jVar4).getText())) {
            B0(jVar4);
        }
        qg.j jVar5 = this.J0;
        if (jVar4 != jVar5 && (jVar5 instanceof qg.b2) && (wcVar = ((nb) this).A2.Z0) != null) {
            wcVar.l(true);
        }
        qg.j jVar6 = this.J0;
        a6.i iVar = this.f5796e1;
        pg.s1 s1Var = this.A1;
        qg.w1 w1Var = this.f5794d1;
        if (jVar6 != null) {
            k6 k6Var = this.Q0;
            jVar6.m0 = k6Var;
            jVar6.l(k6Var, true);
            qg.j jVar7 = this.J0;
            if (jVar7 instanceof qg.v2) {
                qg.v2 v2Var3 = (qg.v2) jVar7;
                v2Var3.getSwatch().f45814c = s1Var.f45814c;
                v2Var3.f46672z0 = false;
                E0(v2Var3.getSwatch());
                w1Var.setValueOverride(new s5(v2Var3, (int) (this.H0.f29541a / 9.0f), 0));
                w1Var.setShowPreview(false);
            } else {
                w1Var.setValueOverride(iVar);
                w1Var.setShowPreview(true);
                s1Var.f45814c = iVar.get();
                D0(s1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f5790b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                H0(false);
            }
            Q0(0);
            w1Var.setValueOverride(iVar);
            w1Var.setShowPreview(true);
            s1Var.f45814c = iVar.get();
            D0(s1Var, null, false);
            z13 = z11;
        }
        T0();
        return z13;
    }

    @Override
    public final void D() {
        O0(true);
    }

    public final void D0(pg.s1 s1Var, Integer num, boolean z10) {
        pg.s1 s1Var2 = this.A1;
        if (s1Var2 != s1Var) {
            s1Var2.f45812a = s1Var.f45812a;
            s1Var2.f45813b = s1Var.f45813b;
            s1Var2.f45814c = s1Var.f45814c;
            int i10 = this.F1;
            pg.u0.e(i10).h(s1Var.f45812a, true);
            pg.u0.e(i10).j(s1Var.f45814c);
        }
        int i11 = s1Var.f45812a;
        f6 f6Var = this.O0;
        f6Var.setColor(i11);
        f6Var.setBrushSize(s1Var.f45814c);
        int i12 = s1Var2.f45812a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new v4(this, num, i12, 0));
            duration.start();
        } else {
            l6 l6Var = this.T0;
            if (l6Var != null) {
                l6Var.invalidate();
            }
        }
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            ((qg.v2) jVar).setSwatch(new pg.s1(s1Var.f45813b, s1Var.f45814c, s1Var.f45812a));
        } else if (z10 && (jVar instanceof qg.t0)) {
            ((qg.t0) jVar).setColor(s1Var.f45812a);
            ((qg.t0) this.J0).setType(3);
        } else if (z10 && (jVar instanceof qg.w2)) {
            ((qg.w2) jVar).setColor(s1Var.f45812a);
            ((qg.w2) this.J0).setType(3);
        } else if (z10 && (jVar instanceof qg.q0)) {
            ((qg.q0) jVar).setColor(s1Var.f45812a);
            ((qg.q0) this.J0).setType(0);
        }
    }

    public final void E0(pg.s1 s1Var) {
        D0(s1Var, null, false);
    }

    public final void G0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        qg.j jVar;
        ArrayList arrayList = this.Q1;
        if (arrayList != null) {
            l8 l8Var = this.P1;
            this.P1 = null;
            this.Q1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                ?? r13 = this.R0;
                if (i11 < size) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        c6 m0 = m0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            m0.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = m0.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i10 = i11;
                        jVar = m0;
                    } else if (b10 == 1) {
                        qg.v2 n02 = n0(z10);
                        n02.setType(mediaEntity.subType);
                        n02.setTypeface(mediaEntity.textTypeface);
                        n02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        for (int i12 = z10; i12 < size2; i12++) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i12);
                            org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(emojiEntity.document_id, 1.0f, n02.getFontMetricsInt());
                            int i13 = emojiEntity.offset;
                            spannableString.setSpan(b6Var, i13, emojiEntity.length + i13, 33);
                            i11 = i11;
                        }
                        i10 = i11;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, n02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        n02.setText(replaceEmoji);
                        F0(n02, mediaEntity.textAlign);
                        pg.s1 swatch = n02.getSwatch();
                        swatch.f45812a = mediaEntity.color;
                        n02.setSwatch(swatch);
                        jVar = n02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            qg.x1 j02 = j0(mediaEntity.text, false);
                            j02.G0 = mediaEntity.crop;
                            j02.B0 = false;
                            if ((2 & mediaEntity.subType) != 0) {
                                j02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                j02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = j02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            jVar = j02;
                        } else if (b10 == 6) {
                            ArrayList arrayList3 = l8Var.v;
                            boolean z11 = l8Var.K;
                            this.f5810l2 = true;
                            qg.j b6Var2 = new b6(this, getContext(), e0(), arrayList3, this.f5797e2, z11, this.f5799f2);
                            b6Var2.setDelegate(this);
                            r13.addView(b6Var2);
                            f0();
                            jVar = b6Var2;
                            if (mediaEntity.viewWidth > 0) {
                                jVar = b6Var2;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = b6Var2.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    jVar = b6Var2;
                                }
                            }
                        } else if (b10 == 3) {
                            qg.t0 i02 = i0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                i02.setColor(i14);
                            }
                            i02.setType(mediaEntity.subType);
                            jVar = i02;
                        } else if (b10 == 8) {
                            kd kdVar = mediaEntity.weather;
                            if (kdVar != null) {
                                qg.w2 o02 = o0(kdVar);
                                int i15 = mediaEntity.color;
                                if (i15 != 0) {
                                    o02.setColor(i15);
                                }
                                o02.setType(mediaEntity.subType);
                                jVar = o02;
                            } else {
                                i11 = i10 + 1;
                                z10 = false;
                            }
                        } else if (b10 == 7) {
                            qg.q0 h02 = h0(mediaEntity.linkSettings);
                            qg.o0 o0Var = h02.f46595q0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                h02.setColor(i16);
                            }
                            boolean e7 = o0Var.e();
                            int i17 = o0Var.h;
                            int i18 = o0Var.f46547f;
                            if (e7) {
                                o0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                h02.setType(3);
                                o0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(o0Var.f46539a0)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(o0Var.f46541b0)) + i17 + i17;
                                PointF position = h02.getPosition();
                                position.y = (this.S1 * 0.3f) + position.y;
                                h02.setPosition(position);
                                i11 = i10 + 1;
                                z10 = false;
                            } else {
                                h02.setType(b11);
                                jVar = h02;
                            }
                        } else if (b10 == 4) {
                            qg.a2 k02 = k0(false);
                            k02.s(zg.n0.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                k02.r(false);
                            }
                            jVar = k02;
                            if (mediaEntity.mediaArea.dark) {
                                k02.q(false);
                                jVar = k02;
                            }
                        } else {
                            if (b10 == 5 && l8Var.f5424o0 != null) {
                                qg.b2 l02 = l0(l8Var.f5426p0, false);
                                lc lcVar = ((nb) this).A2;
                                zb zbVar = lcVar.X0;
                                if (zbVar != null) {
                                    zbVar.f4784w = l02;
                                    m81 m81Var = zbVar.f4786x;
                                    if (m81Var != null) {
                                        m81Var.V(l02.f46282u0);
                                    }
                                }
                                bc bcVar = lcVar.f5466c1;
                                if (bcVar != null) {
                                    bcVar.setHasRoundVideo(true);
                                }
                                jVar = l02;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !l02.f46279r0;
                                    l02.f46279r0 = z12;
                                    l02.f46280s0.f(z12, true);
                                    l02.invalidate();
                                    jVar = l02;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f17274x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f17275y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
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

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f5822r2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f5832w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f5832w2).commit();
            } else {
                this.f5830v2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f5830v2).commit();
            }
        }
        boolean z13 = this.f5820q2;
        r5 r5Var = this.O1;
        if (z13) {
            if (z10) {
                i11 = this.f5832w2;
            } else {
                i11 = this.f5830v2;
            }
            int paddingUnderContainer = this.M1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5818p2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f5818p2.setLayoutParams(layoutParams);
                this.f5826t2 = layoutParams.height;
                r5Var.a();
                requestLayout();
            }
        }
        if (this.f5834x2 == i10 && this.f5836y2 == z10) {
            return;
        }
        this.f5834x2 = i10;
        this.f5836y2 = z10;
        boolean z14 = this.f5822r2;
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            if (((qg.v2) jVar).getEditText().isFocused() && r5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f5822r2 = z12;
        } else {
            this.f5822r2 = false;
        }
        if (this.f5822r2 && this.f5820q2) {
            I0(0);
        }
        if (this.f5826t2 != 0 && !(z11 = this.f5822r2) && z11 != z14 && !this.f5820q2) {
            this.f5826t2 = 0;
            r5Var.a();
            requestLayout();
        }
        T0();
        if (z14 && !this.f5822r2 && this.f5826t2 > 0 && this.f5828u2) {
            this.f5828u2 = false;
        }
        R0();
    }

    public final void H0(final boolean z10) {
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
            lVar.f16995i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16988u = lVar;
            if (!this.O1.c() && this.f5826t2 <= 0) {
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
                    l6 l6Var = q6Var.T0;
                    float f14 = f11 / 1000.0f;
                    q6Var.D1 = f14;
                    float f15 = 1.0f;
                    float f16 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f16);
                    view.setScaleY(f16);
                    view.setTranslationY((Math.min(q6Var.D1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(q6Var.D1, 0.25f) / 0.25f));
                    p5 p5Var = q6Var.f5831w1;
                    float f17 = q6Var.D1;
                    boolean z12 = z10;
                    p5Var.z1(f17, z12);
                    qg.j1 j1Var = q6Var.B0;
                    j1Var.setProgress(q6Var.D1);
                    qg.f1 f1Var = q6Var.A0;
                    f1Var.setProgress(q6Var.D1);
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
                        j1Var.setAlpha(AndroidUtilities.lerp(f19, f13, f18));
                        if (!z12) {
                            f15 = 0.0f;
                        }
                        f1Var.setAlpha(AndroidUtilities.lerp(f19, f15, f18));
                        float dp = AndroidUtilities.dp(39.0f) * f18;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        l6Var.setTranslationY(translationY - (dp * i10));
                    }
                    l6Var.invalidate();
                    if (view == q6Var.l1) {
                        q6Var.U0.invalidate();
                    }
                }
            });
            this.C1.a(new x4(this, z10, 0));
            this.C1.h();
            if (z10) {
                p5 p5Var = this.f5831w1;
                p5Var.setVisibility(0);
                p5Var.setSelectedColorIndex(pg.u0.e(this.F1).d());
            }
        }
    }

    public final void I0(int i10) {
        boolean z10;
        int i11;
        qg.o1 o1Var = this.l1;
        r5 r5Var = this.O1;
        if (i10 == 1) {
            b00 b00Var = this.f5818p2;
            if (b00Var != null && b00Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b00 b00Var2 = this.f5818p2;
            kc kcVar = this.M1;
            if (b00Var2 != null && b00Var2.f24662c1 != UserConfig.selectedAccount) {
                kcVar.removeView(b00Var2);
                this.f5818p2 = null;
            }
            if (this.f5818p2 == null) {
                b00 b00Var3 = new b00(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.f5818p2 = b00Var3;
                b00Var3.f24727w2 = false;
                b00Var3.U0 = true;
                b00Var3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f5818p2.setForseMultiwindowLayout(true);
                }
                this.f5818p2.setDelegate(new e6(this));
                kcVar.addView(this.f5818p2);
            }
            this.f5818p2.setVisibility(0);
            this.f5820q2 = true;
            b00 b00Var4 = this.f5818p2;
            if (this.f5830v2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f5830v2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f5830v2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f5832w2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f5832w2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f5832w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f5832w2;
            } else {
                i11 = this.f5830v2;
            }
            int paddingUnderContainer = kcVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b00Var4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            b00Var4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                qg.j jVar = this.J0;
                if (jVar instanceof qg.v2) {
                    AndroidUtilities.hideKeyboard(((qg.v2) jVar).getEditText());
                }
            }
            this.f5826t2 = paddingUnderContainer;
            r5Var.a();
            requestLayout();
            dh emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(bh.d, true);
            }
            if (!z10) {
                if (this.f5822r2) {
                    this.f5828u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5826t2, 0.0f);
                    ofFloat.addUpdateListener(new y4(this, 1));
                    ofFloat.addListener(new v5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21407w);
                    ofFloat.start();
                }
            }
        } else {
            dh emojiButton2 = o1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(bh.f24958e, true);
            }
            b00 b00Var5 = this.f5818p2;
            if (b00Var5 != null) {
                this.f5820q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    b00Var5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f5826t2 = 0;
                r5Var.a();
            }
            requestLayout();
        }
        R0();
    }

    public final void J0(qg.q0 q0Var) {
        u8 u8Var = new u8(getContext(), this.G1, this.f5801g2, new ai.h3(4, this, q0Var));
        if (q0Var != null) {
            qg.n0 n0Var = q0Var.f46599u0;
            u8Var.f6080c0 = true;
            org.telegram.ui.Cells.j3 j3Var = u8Var.Z;
            org.telegram.ui.Cells.j3 j3Var2 = u8Var.Y;
            if (n0Var != null) {
                u8Var.f6084g0 = n0Var.d;
                u8Var.f6085h0 = false;
                j3Var2.setText(n0Var.f46502c);
                j3Var.setText(n0Var.f46501b);
                u8Var.m0 = !TextUtils.isEmpty(n0Var.f46501b);
                u8Var.f6090n0 = n0Var.f46504f;
                u8Var.f6091o0 = n0Var.f46503e;
            } else {
                j3Var2.setText("");
                j3Var.setText("");
                u8Var.f6090n0 = true;
                u8Var.f6091o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = u8Var.f6079b0;
            dVar.g(string, false, true);
            q8 q8Var = u8Var.X;
            if (q8Var != null) {
                q8Var.N(false);
            }
            dVar.setEnabled(u8Var.W(j3Var2.getText().toString()));
            u8Var.f6080c0 = false;
        }
        u8Var.setOnDismissListener(new k5(this, 1));
        u8Var.show();
        y0(true);
    }

    public final void K0(qg.t0 t0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        yi yiVar = new yi(getContext(), new z5(this, callback2), false, true, false, this.G1);
        yiVar.f33207c2 = new Object();
        org.telegram.ui.Components.ai aiVar = yiVar.A1;
        if (t0Var != null && (messageMedia = t0Var.f46639u0) != null && (geoPoint = messageMedia.geo) != null) {
            yiVar.A2 = new double[]{geoPoint.lat, geoPoint._long};
            yiVar.O = true;
            aiVar.setVisibility(8);
        } else if (this.U1) {
            yiVar.f33279y2 = this.W1;
            yiVar.f33282z2 = this.V1;
            yiVar.O = true;
            aiVar.setVisibility(8);
        } else {
            yiVar.O = true;
            aiVar.setVisibility(8);
        }
        yiVar.setOnDismissListener(new k5(this, 0));
        yiVar.t1();
        yiVar.show();
    }

    public final void L0(qg.j jVar) {
        if (jVar instanceof qg.e1) {
            org.telegram.ui.ActionBar.m1 m1Var = this.H1;
            if (m1Var != null && m1Var.isShowing()) {
                this.H1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f5816o2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        j6 j6Var = this.R0;
        float scaleX2 = j6Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = j6Var.getScaleY() * scaleY * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        M0(new d5(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void M0(Runnable runnable, q6 q6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.m1 m1Var = this.H1;
        if (m1Var != null && m1Var.isShowing()) {
            this.H1.d(true);
            return;
        }
        if (this.I1 == null) {
            this.J1 = new Rect();
            o6 o6Var = new o6(this, getContext());
            this.I1 = o6Var;
            o6Var.setAnimationEnabled(true);
            this.I1.setOnTouchListener(new f5(this, 0));
            this.I1.setDispatchKeyEventListener(new g5(this));
            this.I1.setShownFromBottom(true);
        }
        o6 o6Var2 = this.I1;
        o6Var2.W = z10;
        o6Var2.d();
        runnable.run();
        if (this.H1 == null) {
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(this.I1, -2, -2);
            this.H1 = m1Var2;
            m1Var2.f21370b = true;
            m1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.H1.setOutsideTouchable(true);
            this.H1.setClippingEnabled(true);
            this.H1.setInputMethodMode(2);
            this.H1.setSoftInputMode(0);
            this.H1.getContentView().setFocusableInTouchMode(true);
            this.H1.setOnDismissListener(new h5(this, 0));
        }
        this.I1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.H1.setFocusable(true);
        int measuredWidth = i11 - (this.I1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.I1.getMeasuredHeight();
        this.H1.showAtLocation(q6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.m1.i(this.I1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            o6 o6Var3 = this.I1;
            o6Var3.setBackgroundDrawable(new org.telegram.ui.Components.oa(new org.telegram.ui.Components.pa(this.f5797e2, o6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.I1.setBackgroundDrawable(mutate);
        this.I1.setBackgroundColor(-14145495);
    }

    public final void N0(boolean z10) {
        if (this.f5793c2 != z10) {
            if (z10 || this.Z1 != null) {
                this.f5793c2 = z10;
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
                    this.f5795d2 = true;
                    this.M1.invalidate();
                    float f10 = this.f5791b2;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.Z1.setTransitionProgress(this.f5791b2);
                    ofFloat.addUpdateListener(new y4(this, 2));
                    ofFloat.addListener(new ai.n(11, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(is.f27452g);
                    ofFloat.start();
                    return;
                }
                if (this.Z1.getReactionsWindow() != null) {
                    this.Z1.getReactionsWindow().e();
                }
                this.Z1.animate().alpha(0.0f).setDuration(150L).setListener(new v5(this, 0)).start();
            }
        }
    }

    public final void O0(boolean z10) {
        float f7;
        if (this.f5827u1 != z10) {
            this.f5827u1 = z10;
            o1.k kVar = this.f5829v1;
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
            this.f5829v1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f16995i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16988u = lVar;
            if (z10) {
                qg.t1 t1Var = this.f5811m1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.f5829v1.b(new ai.ra(1, this));
            this.f5829v1.a(new x4(this, z10, 1));
            this.f5829v1.h();
        }
    }

    public final PointF P0(qg.j jVar) {
        float f7;
        float f10;
        float f11 = 200.0f;
        MediaController.CropState cropState = this.F0;
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
        PointF e02 = e0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                j6 j6Var = this.R0;
                if (i11 >= j6Var.getChildCount()) {
                    break;
                }
                View childAt = j6Var.getChildAt(i11);
                if (!(childAt instanceof qg.j) || (childAt instanceof qg.e1)) {
                    f7 = f12;
                    f10 = f13;
                } else {
                    PointF position2 = ((qg.j) childAt).getPosition();
                    f7 = f12;
                    f10 = f13;
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f10) {
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
            e02 = new PointF(e02.x + f11, e02.y + f11);
            f12 = f14;
            f13 = f15;
        }
        return e02;
    }

    public final void Q0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.Y0 != i10 && this.Z0 != i10) {
            ValueAnimator valueAnimator = this.f5790b1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.Y0;
            ViewGroup viewGroup3 = this.l1;
            ViewGroup viewGroup4 = this.f5808k1;
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
            pg.u0 e7 = pg.u0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e7.f45843l != z10) {
                e7.f45843l = z10;
                if (z10) {
                    e7.i(-1, false);
                } else {
                    e7.i(e7.f45834a.getInt("brush", 0), false);
                }
            }
            int c10 = pg.u0.e(i12).c();
            pg.s1 s1Var = this.A1;
            s1Var.f45812a = c10;
            D0(s1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f5790b1 = duration;
            duration.setInterpolator(is.f27451f);
            this.f5790b1.addUpdateListener(new ai.y4(this, viewGroup, viewGroup2, 1));
            this.f5790b1.addListener(new x5(this, viewGroup, viewGroup2, i10, 0));
            this.f5790b1.start();
        }
    }

    @Override
    public final int R() {
        return this.O1.f5166l - this.M1.getBottomPadding2();
    }

    public final void R0() {
        boolean z10;
        r5 r5Var = this.O1;
        qg.o1 o1Var = this.l1;
        if (o1Var != null) {
            if (r5Var.c()) {
                o1Var.a(R.drawable.input_smile);
            } else if (this.f5820q2) {
                o1Var.a(R.drawable.input_keyboard);
            } else {
                o1Var.a(R.drawable.msg_add);
            }
        }
        if (!r5Var.c() && !this.f5820q2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        boolean z12 = !z11;
        AndroidUtilities.updateViewShow(this.f5815o1, z12, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5813n1, z12, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5819q1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5817p1, z11, false, 1.0f, true, null);
    }

    public final void S0() {
        float f7;
        qg.j jVar;
        ObjectAnimator objectAnimator = this.f5805i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        r5 r5Var = this.O1;
        if (((r5Var.c() && !r5Var.d) || this.f5826t2 > 0) && (jVar = this.J0) != null) {
            f7 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.f5805i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f5805i2.setInterpolator(is.h);
        this.f5805i2.start();
    }

    public final void T0() {
        throw new UnsupportedOperationException("Method not decompiled: ci.q6.T0():void");
    }

    @Override
    public final void a() {
        H0(true);
    }

    @Override
    public final void b(pg.m mVar) {
        boolean z10 = mVar instanceof pg.b;
        qg.w1 w1Var = this.f5794d1;
        if (!z10 && !(mVar instanceof pg.d)) {
            w1Var.b(0.05f, 1.0f);
        } else {
            w1Var.b(0.4f, 1.75f);
        }
        w1Var.setDrawCenter(!(mVar instanceof pg.l));
        f6 f6Var = this.O0;
        if (f6Var.getCurrentBrush() instanceof pg.l) {
            this.f5792c1 = true;
        }
        f6Var.setBrush(mVar);
        pg.s1 s1Var = this.A1;
        int i10 = s1Var.f45812a;
        s1Var.f45812a = pg.u0.e(this.F1).c();
        s1Var.f45814c = this.f5796e1.get();
        D0(s1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    @Override
    public final boolean d(qg.j jVar) {
        return C0(jVar, true);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new ai.ca(17, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f5812m2) {
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
        j6 j6Var = this.R0;
        int measuredWidth = j6Var.getMeasuredWidth();
        int measuredHeight = j6Var.getMeasuredHeight();
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

    public final void f0() {
        org.telegram.ui.Components.b6[] b6VarArr;
        boolean z10 = this.W1;
        j6 j6Var = this.R0;
        boolean z11 = true;
        if (!z10 && !this.Y1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < j6Var.getChildCount()) {
                    View childAt = j6Var.getChildAt(i10);
                    boolean z12 = childAt instanceof qg.v2;
                    int i11 = this.F1;
                    if (z12) {
                        CharSequence text = ((qg.v2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.b6 b6Var : (org.telegram.ui.Components.b6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.b6.class)) {
                                TLRPC.Document document = b6Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.s5.f(i11, b6Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.s5.h(i11).e(document);
                                }
                                if (l8.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
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
                        if (l8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof qg.b2) {
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
        for (int i12 = 0; i12 < j6Var.getChildCount(); i12++) {
            View childAt2 = j6Var.getChildAt(i12);
            if (childAt2 instanceof qg.j) {
                ((qg.j) childAt2).setIsVideo(z11);
            }
        }
    }

    @Override
    public final void g(int i10) {
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            F0((qg.v2) jVar, i10);
            pg.u0 e7 = pg.u0.e(this.F1);
            e7.f45839g = i10;
            e7.f45834a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final TextView g0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.G1));
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
        return this.f5800g1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.b6[] b6VarArr;
        j6 j6Var = this.R0;
        int childCount = j6Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = j6Var.getChildAt(i10);
            if (childAt instanceof qg.o2) {
                TLRPC.Document sticker = ((qg.o2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f20044id = sticker.f20038id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof qg.v2) {
                CharSequence text = ((qg.v2) childAt).getText();
                if ((text instanceof Spanned) && (b6VarArr = (org.telegram.ui.Components.b6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.b6.class)) != null) {
                    for (org.telegram.ui.Components.b6 b6Var : b6VarArr) {
                        if (b6Var != null) {
                            TLRPC.Document document = b6Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.s5.f(this.F1, b6Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f20044id = document.f20038id;
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

    public pg.e1 getRenderView() {
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
        return this.f5794d1;
    }

    public final qg.q0 h0(qg.n0 n0Var) {
        int measuredWidth;
        int i10;
        this.f5810l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        j6 j6Var = this.R0;
        if (j6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = j6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        qg.q0 q0Var = new qg.q0(getContext(), P0, this.F1, n0Var, f7 / 360.0f, dp);
        if (P0.x == j6Var.getMeasuredWidth() / 2.0f) {
            q0Var.setStickyX(2);
        }
        if (P0.y == j6Var.getMeasuredHeight() / 2.0f) {
            q0Var.setStickyY(2);
        }
        pg.s1 s1Var = this.A1;
        if (s1Var != null && (i10 = s1Var.f45812a) != -47814) {
            q0Var.setColor(i10);
        }
        q0Var.setDelegate(this);
        q0Var.setMaxWidth(dp);
        j6Var.addView(q0Var, w7.x5.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            q0Var.j(1.0f / cropState.cropScale);
            q0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return q0Var;
    }

    public final qg.t0 i0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f5810l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        j6 j6Var = this.R0;
        if (j6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = j6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        qg.t0 t0Var = new qg.t0(getContext(), P0, this.F1, messageMedia, mediaArea, f7 / 240.0f, dp);
        if (P0.x == j6Var.getMeasuredWidth() / 2.0f) {
            t0Var.setStickyX(2);
        }
        if (P0.y == j6Var.getMeasuredHeight() / 2.0f) {
            t0Var.setStickyY(2);
        }
        pg.s1 s1Var = this.A1;
        if (s1Var != null && (i10 = s1Var.f45812a) != -47814) {
            t0Var.setColor(i10);
        }
        t0Var.setDelegate(this);
        t0Var.setMaxWidth(dp);
        j6Var.addView(t0Var, w7.x5.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            t0Var.j(1.0f / cropState.cropScale);
            t0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return t0Var;
    }

    public final qg.x1 j0(String str, boolean z10) {
        float f7;
        ow0 ow0Var;
        this.f5810l2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e7) {
            FileLog.e(e7);
            f7 = 1.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        j6 j6Var = this.R0;
        if (i10 > 0) {
            float floor = (float) Math.floor(Math.max(this.R1, j6Var.getMeasuredWidth()) * 0.5d);
            ow0Var = new ow0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, j6Var.getMeasuredHeight()) * 0.5d);
            ow0Var = new ow0(f7 * floor2, floor2);
        }
        ow0 ow0Var2 = ow0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = ow0Var2.f29541a;
            ow0Var2.f29541a = ow0Var2.f29542b;
            ow0Var2.f29542b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        qg.x1 x1Var = new qg.x1(context, e02, ow0Var2, str, intValue);
        x1Var.setDelegate(this);
        j6Var.addView(x1Var);
        f0();
        return x1Var;
    }

    public final qg.a2 k0(boolean z10) {
        String str;
        ow0 ow0Var = new ow0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        j6 j6Var = this.R0;
        if (j6Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < j6Var.getChildCount(); i10++) {
                    View childAt = j6Var.getChildAt(i10);
                    if (v7.z6.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (j6Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (j6Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, j6Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, j6Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new qg.j(getContext(), e02);
        jVar.f46258r0 = new ai.pb(jVar);
        jVar.f46259s0 = new ai.pb(jVar);
        jVar.f46260t0 = new zg.e0(jVar);
        jVar.f46261u0 = new zg.e0(jVar);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6((View) jVar);
        jVar.f46263w0 = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6((View) jVar);
        jVar.f46264x0 = g6Var2;
        jVar.f46266z0 = 1.0f;
        jVar.f46257q0 = ow0Var;
        g6Var2.d(1.0f, true);
        g6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        zg.e0 e0Var = jVar.f46260t0;
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
        zg.n0 b10 = zg.n0.b(str);
        jVar.f46262v0 = b10;
        e0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        j6Var.addView(jVar);
        f0();
        if (z10) {
            A0(jVar);
            C0(jVar, true);
        }
        return jVar;
    }

    public final qg.b2 l0(String str, boolean z10) {
        float f7;
        this.f5810l2 = true;
        this.f5814n2 = true;
        p0();
        j6 j6Var = this.R0;
        int measuredWidth = j6Var.getMeasuredWidth();
        j6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        ow0 ow0Var = new ow0(floor, floor);
        qg.b2 b2Var = new qg.b2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (ow0Var.f29542b / 2.0f) + AndroidUtilities.dp(72.0f)), ow0Var, str);
        b2Var.setDelegate(this);
        j6Var.addView(b2Var);
        f0();
        if (z10) {
            A0(b2Var);
            post(new t4(this, b2Var, 0));
        }
        this.f5814n2 = false;
        return b2Var;
    }

    @Override
    public final boolean m(MotionEvent motionEvent) {
        if (this.f5812m2) {
            return false;
        }
        if (this.J0 != null) {
            C0(null, true);
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y3);
        this.O0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final c6 m0(Object obj, TLRPC.Document document) {
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
        float floor = (float) Math.floor(getPaintingSize().f29541a * 0.5d);
        c6 c6Var = new c6(this, context, p6Var.f5727a, p6Var.f5729c, p6Var.f5728b, new ow0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = c6Var.f46583x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        c6Var.setDelegate(this);
        this.R0.addView(c6Var);
        f0();
        return c6Var;
    }

    public final qg.v2 n0(boolean z10) {
        ow0 paintingSize = getPaintingSize();
        PointF P0 = P0(null);
        qg.v2 v2Var = new qg.v2(getContext(), P0, (int) (paintingSize.f29541a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.f29541a / 9.0f;
        e5 e5Var = new e5(this, 0);
        v2Var.f46669w0 = (int) (0.5f * f7);
        v2Var.f46670x0 = (int) (f7 * 2.0f);
        v2Var.f46671y0 = e5Var;
        float f10 = P0.x;
        j6 j6Var = this.R0;
        if (f10 == j6Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (P0.y == j6Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        v2Var.setTypeface(pg.u0.e(i10).f45841j);
        v2Var.setType(pg.u0.e(i10).h);
        j6Var.addView(v2Var, w7.x5.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            v2Var.j(1.0f / cropState.cropScale);
            v2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            A0(v2Var);
            v2Var.q();
            C0(v2Var, false);
            v2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(v2Var.getFocusedView());
            this.K0 = true;
            int i11 = pg.u0.e(i10).f45839g;
            qg.o1 o1Var = this.l1;
            o1Var.d(i11, true);
            o1Var.setOutlineType(pg.u0.e(i10).h);
        }
        return v2Var;
    }

    public final qg.w2 o0(kd kdVar) {
        int measuredWidth;
        int i10;
        this.f5810l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        j6 j6Var = this.R0;
        if (j6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = j6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        qg.w2 w2Var = new qg.w2(getContext(), P0, this.F1, kdVar, f7 / 240.0f, dp);
        if (P0.x == j6Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (P0.y == j6Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        pg.s1 s1Var = this.A1;
        if (s1Var != null && (i10 = s1Var.f45812a) != -47814) {
            w2Var.setColor(i10);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth(dp);
        j6Var.addView(w2Var, w7.x5.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            w2Var.j(1.0f / cropState.cropScale);
            w2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return w2Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        ml0 ml0Var = this.Z1;
        if (ml0Var != null) {
            AndroidUtilities.removeFromParent(ml0Var);
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
        float f11 = this.H0.f29541a;
        qg.j jVar = this.J0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.T0, i10, i11);
        measureChild(this.f5794d1, i10, i11);
        measureChild(this.V0, i10, i11);
        measureChild(this.U0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f5826t2 - this.M1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.S0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.G0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f5820q2 && !this.f5824s2) {
            this.G0 = true;
            v0();
            this.G0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        v0();
    }

    public final void p0() {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 < j6Var.getChildCount()) {
                View childAt = j6Var.getChildAt(i10);
                if (childAt instanceof qg.b2) {
                    if (this.J0 == childAt) {
                        C0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(is.h).withEndAction(new t4(this, (qg.b2) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean q() {
        return !(this.J0 instanceof qg.e1);
    }

    public abstract void q0();

    @Override
    public final boolean r() {
        return !this.K0;
    }

    public final qg.e1 r0() {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 < j6Var.getChildCount()) {
                View childAt = j6Var.getChildAt(i10);
                if (childAt instanceof qg.e1) {
                    return (qg.e1) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.G0) {
            return;
        }
        super.requestLayout();
    }

    public final android.graphics.Bitmap s0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, ci.l8 r46) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q6.s0(java.util.ArrayList, boolean, boolean, boolean, boolean, ci.l8):android.graphics.Bitmap");
    }

    public void setBlurManager(org.telegram.ui.Components.la laVar) {
        this.f5797e2 = laVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f5812m2 != z10) {
            this.f5812m2 = z10;
            if (z10) {
                C0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j3) {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 < j6Var.getChildCount()) {
                View childAt = j6Var.getChildAt(i10);
                if (childAt instanceof qg.o2) {
                    ImageReceiver imageReceiver = ((qg.o2) childAt).f46583x0;
                    ek0 lottieAnimation = imageReceiver.getLottieAnimation();
                    imageReceiver.getAnimation();
                    if (lottieAnimation != null) {
                        lottieAnimation.N(Math.round(((((float) j3) % ((float) lottieAnimation.r())) / ((float) lottieAnimation.r())) * lottieAnimation.f26043e[0]), true, false);
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
            f0();
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
        if (!this.f5822r2 && !this.f5820q2) {
            this.f5810l2 = true;
            n0(true);
            return;
        }
        if (this.f5820q2) {
            qg.j jVar = this.J0;
            if (jVar instanceof qg.v2) {
                this.O1.f5160e = true;
                AndroidUtilities.showKeyboard(((qg.v2) jVar).getEditText());
            }
        }
        I0(!this.f5820q2 ? 1 : 0);
    }

    public final boolean t0() {
        if (!this.D0.a() && !this.f5810l2) {
            return false;
        }
        return true;
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

    public final void u0(boolean z10) {
        if (this.f5820q2) {
            I0(0);
        }
        if (z10) {
            b00 b00Var = this.f5818p2;
            if (b00Var != null && b00Var.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f5818p2.getMeasuredHeight());
                ofFloat.addUpdateListener(new y4(this, 0));
                this.f5824s2 = true;
                ofFloat.addListener(new v5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21407w);
                ofFloat.start();
                return;
            }
            v0();
        }
    }

    @Override
    public final pg.u0 v() {
        return pg.u0.e(this.F1);
    }

    public final void v0() {
        b00 b00Var;
        if (!this.f5820q2 && (b00Var = this.f5818p2) != null && b00Var.getVisibility() != 8) {
            this.f5818p2.setVisibility(8);
        }
        int i10 = this.f5826t2;
        this.f5826t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    public final boolean x0() {
        if (this.f5793c2) {
            if (this.Z1.getReactionsWindow() != null && !this.Z1.getReactionsWindow().f54550q) {
                this.Z1.e();
                return true;
            }
            N0(false);
            return true;
        } else if (this.B1) {
            H0(false);
            return true;
        } else if (this.f5820q2) {
            u0(true);
            return true;
        } else if (!this.K0) {
            return false;
        } else {
            if (this.M0) {
                this.M0 = false;
                this.O1.b(true);
                return false;
            }
            C0(null, true);
            return true;
        }
    }

    @Override
    public final void y() {
        M0(new e5(this, 3), this, 53, 0, getHeight(), false);
    }

    public abstract void y0(boolean z10);

    @Override
    public final void z(qg.j jVar) {
        N0(false);
        L0(jVar);
    }

    public final void z0() {
        final int i10 = this.Y0;
        Q0(1);
        postDelayed(new ai.f(this, 8), 350L);
        y5 y5Var = new y5(this, getContext(), this.G1, i10);
        this.f5809k2 = y5Var;
        kc kcVar = this.M1;
        Objects.requireNonNull(kcVar);
        y5Var.f5888w = new bi.v(kcVar, 6);
        final boolean[] zArr = {true};
        y5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                q6 q6Var = q6.this;
                q6Var.f5809k2 = null;
                if (zArr[0]) {
                    q6Var.y0(false);
                }
                q6Var.Q0(i10);
            }
        });
        y5Var.f5890y = new g5(this);
        y5Var.r0(new n5(this, zArr, y5Var, 0));
        y5Var.show();
        y0(true);
    }

    public void setOffsetTranslationX(float f7) {
    }

    public View getView() {
        return this;
    }
}
