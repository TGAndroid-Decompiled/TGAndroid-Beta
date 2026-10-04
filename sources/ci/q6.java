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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wh;
import org.telegram.ui.Components.xi;
import org.telegram.ui.LaunchActivity;
public abstract class q6 extends mw0 implements qg.q1, qg.h, qg.m1, kw0, gc {
    public final qg.f1 A0;
    public final pg.t1 A1;
    public final qg.j1 B0;
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
    public final d6 G1;
    public fw0 H0;
    public org.telegram.ui.ActionBar.n1 H1;
    public boolean I0;
    public o6 I1;
    public qg.j J0;
    public Rect J1;
    public boolean K0;
    public Runnable K1;
    public int L0;
    public Runnable L1;
    public boolean M0;
    public final jc M1;
    public final boolean N0;
    public AnimatorSet N1;
    public final f6 O0;
    public final s5 O1;
    public final h6 P0;
    public k8 P1;
    public final k6 Q0;
    public ArrayList Q1;
    public final j6 R0;
    public int R1;
    public final FrameLayout S0;
    public int S1;
    public final l6 T0;
    public pg.x T1;
    public final p5 U0;
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
    public sk0 Z1;
    public float f5746a1;
    public qg.a2 a2;
    public ValueAnimator f5747b1;
    public float f5748b2;
    public boolean f5749c1;
    public boolean f5750c2;
    public final qg.w1 f5751d1;
    public boolean f5752d2;
    public final xa.c f5753e1;
    public org.telegram.ui.Components.ka f5754e2;
    public final int f5755f1;
    public final a7 f5756f2;
    public BigInteger f5757g1;
    public final b7 f5758g2;
    public TextView f5759h1;
    public boolean f5760h2;
    public TextView f5761i1;
    public ObjectAnimator f5762i2;
    public TextView f5763j1;
    public final float[] f5764j2;
    public final qg.r1 f5765k1;
    public y5 f5766k2;
    public final qg.o1 l1;
    public boolean f5767l2;
    public final qg.t1 f5768m1;
    public boolean f5769m2;
    public final ImageView f5770n1;
    public boolean f5771n2;
    public final TextView f5772o1;
    public final int[] f5773o2;
    public final TextView f5774p1;
    public nz f5775p2;
    public final TextView f5776q1;
    public boolean f5777q2;
    public final Paint f5778r1;
    public boolean f5779r2;
    public final Paint f5780s1;
    public boolean f5781s2;
    public float f5782t1;
    public int f5783t2;
    public boolean f5784u1;
    public boolean f5785u2;
    public o1.k f5786v1;
    public int f5787v2;
    public final q5 f5788w1;
    public int f5789w2;
    public final Paint f5790x1;
    public int f5791x2;
    public final Paint f5792y1;
    public boolean f5793y2;
    public final Paint f5794z1;

    public q6(Context context, boolean z10, File file, boolean z11, boolean z12, jc jcVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, k8 k8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ka kaVar, org.telegram.ui.ActionBar.d6 d6Var, a7 a7Var, b7 b7Var) {
        super(context, activity);
        f6 f6Var;
        pg.t1 t1Var;
        org.telegram.ui.Components.ka kaVar2;
        pg.u0 u0Var;
        DispatchQueue dispatchQueue;
        Bitmap bitmap3;
        Paint paint;
        Paint paint2;
        f6 f6Var2;
        int i14;
        this.Y0 = 0;
        this.Z0 = -1;
        final mb mbVar = (mb) this;
        xa.c cVar = new xa.c(mbVar, 10);
        this.f5753e1 = cVar;
        Paint paint3 = new Paint(1);
        this.f5778r1 = paint3;
        Paint paint4 = new Paint(1);
        this.f5780s1 = paint4;
        this.f5790x1 = new Paint(1);
        this.f5792y1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f5794z1 = paint5;
        pg.t1 t1Var2 = new pg.t1(1.0f, 0.016773745f, -1);
        this.A1 = t1Var2;
        this.E1 = new Paint(1);
        this.f5764j2 = new float[2];
        this.f5769m2 = false;
        this.f5773o2 = new int[2];
        new ai.q4(mbVar, 12);
        setDelegate(this);
        this.f5754e2 = kaVar;
        this.f5756f2 = a7Var;
        this.U1 = z10;
        this.V1 = file;
        this.W1 = z11;
        this.X1 = z12;
        this.M1 = jcVar;
        this.R1 = i12;
        this.S1 = i13;
        this.f5758g2 = b7Var;
        this.F1 = i10;
        d6 d6Var2 = new d6(d6Var);
        this.G1 = d6Var2;
        this.F0 = cropState;
        this.N0 = context instanceof BubbleActivity;
        pg.u0 e7 = pg.u0.e(i10);
        e7.i(0, true);
        t1Var2.f44638a = e7.c();
        t1Var2.f44640c = e7.f44653i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.E0 = dispatchQueue2;
        this.C0 = bitmap;
        this.f5755f1 = i11;
        pg.w1 w1Var = new pg.w1();
        this.D0 = w1Var;
        w1Var.f44678a = new a1.c(mbVar, 18);
        View view = new View(context);
        this.X0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        pg.s0 s0Var = new pg.s0(getPaintingSize(), null, i11, kaVar);
        if (k8Var == null || !k8Var.f5352u) {
            t1Var = t1Var2;
            kaVar2 = kaVar;
            u0Var = e7;
            dispatchQueue = dispatchQueue2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            f6Var2 = f6Var;
        } else {
            t1Var = t1Var2;
            kaVar2 = null;
            u0Var = e7;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            f6Var2 = f6Var;
            dispatchQueue = dispatchQueue2;
        }
        f6Var2 = new f6(mbVar, context, s0Var, bitmap3, bitmap2, kaVar2);
        this.O0 = f6Var2;
        f6Var2.setDelegate(new g6(mbVar));
        f6Var2.setUndoStore(w1Var);
        f6Var2.setQueue(dispatchQueue);
        f6Var2.setVisibility(4);
        h6 h6Var = new h6(mbVar, context);
        this.P0 = h6Var;
        h6Var.setVisibility(4);
        j6 j6Var = new j6(mbVar, context, new i6(mbVar));
        this.R0 = j6Var;
        this.P1 = k8Var;
        this.Q1 = arrayList;
        if (this.R1 > 0 && this.S1 > 0) {
            H0();
        }
        j6Var.setVisibility(4);
        this.Q0 = new k6(mbVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, w7.z5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f5770n1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        mb mbVar2 = mbVar;
                        f6 f6Var3 = mbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            mbVar2.f5765k1.setSelectedIndex(1);
                            mbVar2.b((pg.m) pg.m.f44534a.get(0));
                            return;
                        }
                        mbVar2.D0.c();
                        return;
                    case 1:
                        mb mbVar3 = mbVar;
                        f6 f6Var4 = mbVar3.O0;
                        pg.w1 w1Var2 = mbVar3.D0;
                        if (w1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                mbVar3.f5765k1.setSelectedIndex(1);
                                mbVar3.b((pg.m) pg.m.f44534a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            w1Var2.f44680c.clear();
                            w1Var2.f44679b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(w1Var2, 12));
                            mbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        mb mbVar4 = mbVar;
                        qg.j jVar = mbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (mbVar4.f5777q2) {
                            mbVar4.v0(false);
                        }
                        mbVar4.C0(mbVar4.J0);
                        mbVar4.D0(null, true);
                        return;
                    case 3:
                        mbVar.D0(null, true);
                        return;
                    default:
                        mb mbVar5 = mbVar;
                        if (mbVar5.B1) {
                            mbVar5.I0(false);
                            return;
                        } else if (mbVar5.f5777q2) {
                            mbVar5.v0(true);
                            return;
                        } else if (mbVar5.K0) {
                            mbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = mbVar5.L1;
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
        frameLayout.addView(imageView, w7.z5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.i6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        bi.j(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, w7.z5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ai.e2(2));
        frameLayout.addView(linearLayout, w7.z5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f5772o1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.i6.f0(822083583, 7, -1));
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
                        mb mbVar2 = mbVar;
                        f6 f6Var3 = mbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            mbVar2.f5765k1.setSelectedIndex(1);
                            mbVar2.b((pg.m) pg.m.f44534a.get(0));
                            return;
                        }
                        mbVar2.D0.c();
                        return;
                    case 1:
                        mb mbVar3 = mbVar;
                        f6 f6Var4 = mbVar3.O0;
                        pg.w1 w1Var2 = mbVar3.D0;
                        if (w1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                mbVar3.f5765k1.setSelectedIndex(1);
                                mbVar3.b((pg.m) pg.m.f44534a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            w1Var2.f44680c.clear();
                            w1Var2.f44679b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(w1Var2, 12));
                            mbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        mb mbVar4 = mbVar;
                        qg.j jVar = mbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (mbVar4.f5777q2) {
                            mbVar4.v0(false);
                        }
                        mbVar4.C0(mbVar4.J0);
                        mbVar4.D0(null, true);
                        return;
                    case 3:
                        mbVar.D0(null, true);
                        return;
                    default:
                        mb mbVar5 = mbVar;
                        if (mbVar5.B1) {
                            mbVar5.I0(false);
                            return;
                        } else if (mbVar5.f5777q2) {
                            mbVar5.v0(true);
                            return;
                        } else if (mbVar5.K0) {
                            mbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = mbVar5.L1;
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
        TextView i15 = org.telegram.ui.Cells.c1.i(frameLayout, textView2, w7.z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f5774p1 = i15;
        i15.setBackground(org.telegram.ui.ActionBar.i6.f0(822083583, 7, -1));
        i15.setPadding(org.telegram.ui.Cells.c1.d(8.0f, R.string.Clear, i15), 0, AndroidUtilities.dp(8.0f), 0);
        i15.setGravity(16);
        i15.setTextColor(-1);
        i15.setTypeface(AndroidUtilities.bold());
        i15.setTextSize(1, 16.0f);
        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        mb mbVar2 = mbVar;
                        f6 f6Var3 = mbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            mbVar2.f5765k1.setSelectedIndex(1);
                            mbVar2.b((pg.m) pg.m.f44534a.get(0));
                            return;
                        }
                        mbVar2.D0.c();
                        return;
                    case 1:
                        mb mbVar3 = mbVar;
                        f6 f6Var4 = mbVar3.O0;
                        pg.w1 w1Var2 = mbVar3.D0;
                        if (w1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                mbVar3.f5765k1.setSelectedIndex(1);
                                mbVar3.b((pg.m) pg.m.f44534a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            w1Var2.f44680c.clear();
                            w1Var2.f44679b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(w1Var2, 12));
                            mbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        mb mbVar4 = mbVar;
                        qg.j jVar = mbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (mbVar4.f5777q2) {
                            mbVar4.v0(false);
                        }
                        mbVar4.C0(mbVar4.J0);
                        mbVar4.D0(null, true);
                        return;
                    case 3:
                        mbVar.D0(null, true);
                        return;
                    default:
                        mb mbVar5 = mbVar;
                        if (mbVar5.B1) {
                            mbVar5.I0(false);
                            return;
                        } else if (mbVar5.f5777q2) {
                            mbVar5.v0(true);
                            return;
                        } else if (mbVar5.K0) {
                            mbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = mbVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        i15.setAlpha(0.0f);
        i15.setVisibility(8);
        TextView i16 = org.telegram.ui.Cells.c1.i(frameLayout, i15, w7.z5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f5776q1 = i16;
        i16.setBackground(org.telegram.ui.ActionBar.i6.f0(822083583, 7, -1));
        i16.setPadding(org.telegram.ui.Cells.c1.d(8.0f, R.string.Done, i16), 0, AndroidUtilities.dp(8.0f), 0);
        i16.setGravity(16);
        i16.setTextColor(-1);
        i16.setTypeface(AndroidUtilities.bold());
        i16.setTextSize(1, 16.0f);
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        mb mbVar2 = mbVar;
                        f6 f6Var3 = mbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            mbVar2.f5765k1.setSelectedIndex(1);
                            mbVar2.b((pg.m) pg.m.f44534a.get(0));
                            return;
                        }
                        mbVar2.D0.c();
                        return;
                    case 1:
                        mb mbVar3 = mbVar;
                        f6 f6Var4 = mbVar3.O0;
                        pg.w1 w1Var2 = mbVar3.D0;
                        if (w1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                mbVar3.f5765k1.setSelectedIndex(1);
                                mbVar3.b((pg.m) pg.m.f44534a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            w1Var2.f44680c.clear();
                            w1Var2.f44679b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(w1Var2, 12));
                            mbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        mb mbVar4 = mbVar;
                        qg.j jVar = mbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (mbVar4.f5777q2) {
                            mbVar4.v0(false);
                        }
                        mbVar4.C0(mbVar4.J0);
                        mbVar4.D0(null, true);
                        return;
                    case 3:
                        mbVar.D0(null, true);
                        return;
                    default:
                        mb mbVar5 = mbVar;
                        if (mbVar5.B1) {
                            mbVar5.I0(false);
                            return;
                        } else if (mbVar5.f5777q2) {
                            mbVar5.v0(true);
                            return;
                        } else if (mbVar5.K0) {
                            mbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = mbVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        i16.setAlpha(0.0f);
        i16.setVisibility(8);
        frameLayout.addView(i16, w7.z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        pg.u0 u0Var2 = u0Var;
        l6 l6Var = new l6(mbVar, context, u0Var2);
        this.T0 = l6Var;
        l6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        l6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(l6Var, w7.z5.e(-1, 104, 80));
        qg.r1 r1Var = new qg.r1(context, (k8Var == null || k8Var.v() || k8Var.f5352u || kaVar == null) ? false : true);
        this.f5765k1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        l6Var.addView(r1Var, w7.z5.c(48.0f, -1));
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
                        mb mbVar2 = mbVar;
                        pg.t1 t1Var3 = mbVar2.A1;
                        mbVar2.F0(t1Var3);
                        pg.u0.e(i10).j(t1Var3.f44640c);
                        return;
                    default:
                        mbVar.l1.setTypeface(pg.u0.e(i10).f44654j);
                        return;
                }
            }
        });
        o1Var.setAlignment(pg.u0.e(i10).f44652g);
        l6Var.addView(o1Var, w7.z5.c(48.0f, -1));
        p5 p5Var = new p5(mbVar, context);
        this.U0 = p5Var;
        addView(p5Var, w7.z5.c(-1.0f, -1));
        qg.t1 t1Var3 = new qg.t1(context);
        this.f5768m1 = t1Var3;
        t1Var3.setVisibility(8);
        t1Var3.setOnItemClickListener(new ai.g(mbVar, 5));
        o1Var.setTypefaceListView(t1Var3);
        p5Var.addView(t1Var3, w7.z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint2.setColor(d6Var2.H0(org.telegram.ui.ActionBar.i6.G8));
        q5 q5Var = new q5(mbVar, context);
        this.f5788w1 = q5Var;
        q5Var.setVisibility(8);
        q5Var.setColorPalette(pg.u0.e(i10));
        q5Var.setColorListener(new d5(mbVar, 0));
        l6Var.addView(q5Var, w7.z5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        qg.f1 f1Var = new qg.f1(context);
        this.A0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(org.telegram.ui.ActionBar.i6.f0(1090519039, 1, -1));
        l6Var.addView(f1Var, w7.z5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        f1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        mb mbVar2 = mbVar;
                        f6 f6Var3 = mbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            mbVar2.f5765k1.setSelectedIndex(1);
                            mbVar2.b((pg.m) pg.m.f44534a.get(0));
                            return;
                        }
                        mbVar2.D0.c();
                        return;
                    case 1:
                        mb mbVar3 = mbVar;
                        f6 f6Var4 = mbVar3.O0;
                        pg.w1 w1Var2 = mbVar3.D0;
                        if (w1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                mbVar3.f5765k1.setSelectedIndex(1);
                                mbVar3.b((pg.m) pg.m.f44534a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            w1Var2.f44680c.clear();
                            w1Var2.f44679b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(w1Var2, 12));
                            mbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        mb mbVar4 = mbVar;
                        qg.j jVar = mbVar4.J0;
                        if (jVar instanceof qg.v2) {
                            AndroidUtilities.hideKeyboard(((qg.v2) jVar).getFocusedView());
                        }
                        if (mbVar4.f5777q2) {
                            mbVar4.v0(false);
                        }
                        mbVar4.C0(mbVar4.J0);
                        mbVar4.D0(null, true);
                        return;
                    case 3:
                        mbVar.D0(null, true);
                        return;
                    default:
                        mb mbVar5 = mbVar;
                        if (mbVar5.B1) {
                            mbVar5.I0(false);
                            return;
                        } else if (mbVar5.f5777q2) {
                            mbVar5.v0(true);
                            return;
                        } else if (mbVar5.K0) {
                            mbVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = mbVar5.L1;
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
        j1Var.setBackground(org.telegram.ui.ActionBar.i6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new ai.d0(mbVar, context, u0Var2, 6));
        l6Var.addView(j1Var, w7.z5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        qg.w1 w1Var2 = new qg.w1(context);
        this.f5751d1 = w1Var2;
        pg.t1 t1Var4 = t1Var;
        w1Var2.setColorSwatch(t1Var4);
        w1Var2.setRenderView(f6Var2);
        w1Var2.setValueOverride(cVar);
        t1Var4.f44640c = cVar.get();
        w1Var2.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        mb mbVar2 = mbVar;
                        pg.t1 t1Var32 = mbVar2.A1;
                        mbVar2.F0(t1Var32);
                        pg.u0.e(i10).j(t1Var32.f44640c);
                        return;
                    default:
                        mbVar.l1.setTypeface(pg.u0.e(i10).f44654j);
                        return;
                }
            }
        });
        addView(w1Var2, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V0 = frameLayout2;
        addView(frameLayout2, w7.z5.c(-1.0f, -1));
        Paint paint6 = paint;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(t1Var4, null, false);
        b((pg.m) pg.m.f44534a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.O1 = new s5(mbVar, jcVar, new ai.g3(2, mbVar, jcVar));
        s2.G = i14;
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

    public static void Z(mb mbVar, pg.u0 u0Var, Integer num) {
        u0Var.h(num.intValue(), true);
        u0Var.g();
        mbVar.setNewColor(num.intValue());
        mbVar.f5788w1.setSelectedColorIndex(u0Var.d());
        mbVar.T1 = null;
    }

    public static void a0(mb mbVar, Integer num) {
        mbVar.setNewColor(num.intValue());
        mbVar.I0(false);
    }

    public ViewGroup getBarView() {
        if (this.Y0 == 2) {
            return this.l1;
        }
        return this.f5765k1;
    }

    private int getFrameRotation() {
        int i10 = this.f5755f1;
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

    private fw0 getPaintingSize() {
        fw0 fw0Var = this.H0;
        if (fw0Var != null) {
            return fw0Var;
        }
        fw0 fw0Var2 = new fw0(1080.0f, 1920.0f);
        this.H0 = fw0Var2;
        return fw0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 < j6Var.getChildCount()) {
                View childAt = j6Var.getChildAt(i10);
                if (childAt instanceof qg.o2) {
                    ImageReceiver imageReceiver = ((qg.o2) childAt).f45291x0;
                    kj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
                        animation.f25605y = z10;
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
        int i11 = t1Var.f44638a;
        t1Var.f44638a = i10;
        E0(t1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new c5(this, i11, i10, 0));
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
        e7.f44647a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        w5 w5Var = new w5(this, context);
        this.W0 = w5Var;
        w5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.z5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f5759h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f5759h1;
        int i10 = org.telegram.ui.ActionBar.i6.f20913i6;
        d6 d6Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), 7, -1));
        this.f5759h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5759h1.setTextColor(-1);
        this.f5759h1.setTextSize(1, 14.0f);
        this.f5759h1.setGravity(1);
        this.f5759h1.setTypeface(AndroidUtilities.bold());
        this.f5759h1.setSingleLine();
        this.f5759h1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f6114b;

            {
                this.f6114b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f6114b;
                        if (q6Var.K0) {
                            q6Var.D0(null, true);
                            return;
                        } else {
                            q6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f6114b.A0();
                        return;
                    default:
                        q6 q6Var2 = this.f6114b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof qg.v2)) {
                            q6Var2.f5767l2 = true;
                            q6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f5759h1, w7.z5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f5761i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f5761i1.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), 7, -1));
        this.f5761i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5761i1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f6114b;

            {
                this.f6114b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f6114b;
                        if (q6Var.K0) {
                            q6Var.D0(null, true);
                            return;
                        } else {
                            q6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f6114b.A0();
                        return;
                    default:
                        q6 q6Var2 = this.f6114b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof qg.v2)) {
                            q6Var2.f5767l2 = true;
                            q6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f5761i1.setTextColor(-1);
        this.f5761i1.setTextSize(1, 14.0f);
        this.f5761i1.setGravity(1);
        this.f5761i1.setTypeface(AndroidUtilities.bold());
        this.f5761i1.setAlpha(0.6f);
        this.f5761i1.setSingleLine();
        this.W0.addView(this.f5761i1, w7.z5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f5763j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f5763j1.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), 7, -1));
        this.f5763j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5763j1.setTextColor(-1);
        this.f5763j1.setTextSize(1, 14.0f);
        this.f5763j1.setGravity(1);
        this.f5763j1.setTypeface(AndroidUtilities.bold());
        this.f5763j1.setAlpha(0.6f);
        this.f5763j1.setSingleLine();
        this.f5763j1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f6114b;

            {
                this.f6114b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f6114b;
                        if (q6Var.K0) {
                            q6Var.D0(null, true);
                            return;
                        } else {
                            q6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f6114b.A0();
                        return;
                    default:
                        q6 q6Var2 = this.f6114b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof qg.v2)) {
                            q6Var2.f5767l2 = true;
                            q6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f5763j1, w7.z5.l(1.0f, 0, -2));
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
    public final void A(qg.j jVar) {
        O0(false);
        M0(jVar);
    }

    public final void A0() {
        final int i10 = this.Y0;
        R0(1);
        postDelayed(new ai.f(this, 8), 350L);
        y5 y5Var = new y5(this, getContext(), this.G1, i10);
        this.f5766k2 = y5Var;
        jc jcVar = this.M1;
        Objects.requireNonNull(jcVar);
        y5Var.f5898w = new bi.v(jcVar, 6);
        final boolean[] zArr = {true};
        y5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                q6 q6Var = q6.this;
                q6Var.f5766k2 = null;
                if (zArr[0]) {
                    q6Var.z0(false);
                }
                q6Var.R0(i10);
            }
        });
        y5Var.f5900y = new h5(this);
        y5Var.q0(new o5(this, zArr, y5Var, 0));
        y5Var.show();
        z0(true);
    }

    public final void B0(qg.j jVar) {
        this.D0.b(jVar.getUUID(), new e5(this, jVar, 0));
    }

    public final void C0(qg.j jVar) {
        qg.j jVar2 = this.J0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            D0(null, true);
            if (jVar instanceof qg.v2) {
                ValueAnimator valueAnimator = this.f5747b1;
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
            w1Var.f44679b.remove(uuid);
            w1Var.f44680c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(w1Var, 12));
        }
        qg.w1 w1Var2 = this.f5751d1;
        xa.c cVar = this.f5753e1;
        w1Var2.setValueOverride(cVar);
        w1Var2.setShowPreview(true);
        float f7 = cVar.get();
        pg.t1 t1Var = this.A1;
        t1Var.f44640c = f7;
        E0(t1Var, null, false);
        if (!this.f5771n2 && (jVar instanceof qg.b2)) {
            kc kcVar = ((mb) this).A2;
            yb ybVar = kcVar.X0;
            if (ybVar != null) {
                ybVar.s(null, null, true);
            }
            mb mbVar = kcVar.f5443v1;
            if (mbVar != null) {
                mbVar.q0();
            }
            ac acVar = kcVar.f5383c1;
            if (acVar != null) {
                acVar.setHasRoundVideo(false);
            }
            k8 k8Var = kcVar.K1;
            if (k8Var != null) {
                File file = k8Var.f5341o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    kcVar.K1.f5341o0 = null;
                }
                if (kcVar.K1.f5343p0 != null) {
                    try {
                        new File(kcVar.K1.f5343p0).delete();
                    } catch (Exception unused2) {
                    }
                    kcVar.K1.f5343p0 = null;
                }
            }
        }
    }

    @Override
    public final int[] D(qg.j jVar) {
        int[] iArr = this.f5773o2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final boolean D0(qg.j jVar, boolean z10) {
        boolean z11;
        vc vcVar;
        vc vcVar2;
        sk0 sk0Var;
        int i10;
        boolean z12 = jVar instanceof qg.v2;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f5747b1;
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
            qg.o1 o1Var = this.l1;
            o1Var.setAlignment(i11);
            pg.k0 typeface = v2Var.getTypeface();
            if (typeface != null) {
                o1Var.setTypeface(typeface.f44521a);
            }
            o1Var.e(v2Var.getType(), true);
            this.U0.invalidate();
        }
        qg.j jVar2 = this.J0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f45082d0) {
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
                        qg.o0 o0Var = q0Var.f45303q0;
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
                            r0();
                            return true;
                        } else if (jVar instanceof qg.a2) {
                            qg.a2 a2Var = (qg.a2) jVar;
                            if (this.f5750c2 && this.a2 == jVar) {
                                a2Var.q(true);
                                return true;
                            }
                            qg.a2 a2Var2 = this.a2;
                            if (a2Var2 != null && a2Var2 != a2Var && (sk0Var = this.Z1) != null) {
                                sk0Var.animate().alpha(0.0f).setListener(new u5(sk0Var, 0));
                                this.Z1 = null;
                                this.f5750c2 = false;
                                this.f5748b2 = 0.0f;
                            }
                            if (this.Z1 == null) {
                                sk0 sk0Var2 = new sk0(2, this.F1, getContext(), LaunchActivity.R(), new ai.x3(6, new ai.d()));
                                this.Z1 = sk0Var2;
                                org.telegram.ui.Components.oa oaVar = new org.telegram.ui.Components.oa(this.f5754e2, sk0Var2, 0, false);
                                this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.M1.addView(this.Z1, w7.z5.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                sk0 sk0Var3 = this.Z1;
                                ?? obj = new Object();
                                obj.f4606e = this;
                                obj.f4605c = oaVar;
                                obj.d = paint;
                                obj.f4604b = new Path();
                                sk0Var3.setDelegate(obj);
                                this.Z1.p(null, null, true);
                            }
                            this.Z1.setFragment(LaunchActivity.R());
                            this.a2 = a2Var;
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
                qg.u2 u2Var = v2Var2.f45373q0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((qg.v2) this.J0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar3 instanceof qg.b2) && (vcVar2 = ((mb) this).A2.Z0) != null) {
                vcVar2.l(false);
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
        if (jVar4 != jVar5 && (jVar5 instanceof qg.b2) && (vcVar = ((mb) this).A2.Z0) != null) {
            vcVar.l(true);
        }
        qg.j jVar6 = this.J0;
        xa.c cVar = this.f5753e1;
        pg.t1 t1Var = this.A1;
        qg.w1 w1Var = this.f5751d1;
        if (jVar6 != null) {
            k6 k6Var = this.Q0;
            jVar6.m0 = k6Var;
            jVar6.l(k6Var, true);
            qg.j jVar7 = this.J0;
            if (jVar7 instanceof qg.v2) {
                qg.v2 v2Var3 = (qg.v2) jVar7;
                v2Var3.getSwatch().f44640c = t1Var.f44640c;
                v2Var3.f45382z0 = false;
                F0(v2Var3.getSwatch());
                w1Var.setValueOverride(new t5(v2Var3, (int) (this.H0.f26590a / 9.0f), 0));
                w1Var.setShowPreview(false);
            } else {
                w1Var.setValueOverride(cVar);
                w1Var.setShowPreview(true);
                t1Var.f44640c = cVar.get();
                E0(t1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f5747b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                I0(false);
            }
            R0(0);
            w1Var.setValueOverride(cVar);
            w1Var.setShowPreview(true);
            t1Var.f44640c = cVar.get();
            E0(t1Var, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    @Override
    public final void E() {
        P0(true);
    }

    public final void E0(pg.t1 t1Var, Integer num, boolean z10) {
        pg.t1 t1Var2 = this.A1;
        if (t1Var2 != t1Var) {
            t1Var2.f44638a = t1Var.f44638a;
            t1Var2.f44639b = t1Var.f44639b;
            t1Var2.f44640c = t1Var.f44640c;
            int i10 = this.F1;
            pg.u0.e(i10).h(t1Var.f44638a, true);
            pg.u0.e(i10).j(t1Var.f44640c);
        }
        int i11 = t1Var.f44638a;
        f6 f6Var = this.O0;
        f6Var.setColor(i11);
        f6Var.setBrushSize(t1Var.f44640c);
        int i12 = t1Var2.f44638a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new w4(this, num, i12, 0));
            duration.start();
        } else {
            l6 l6Var = this.T0;
            if (l6Var != null) {
                l6Var.invalidate();
            }
        }
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            ((qg.v2) jVar).setSwatch(new pg.t1(t1Var.f44639b, t1Var.f44640c, t1Var.f44638a));
        } else if (z10 && (jVar instanceof qg.t0)) {
            ((qg.t0) jVar).setColor(t1Var.f44638a);
            ((qg.t0) this.J0).setType(3);
        } else if (z10 && (jVar instanceof qg.w2)) {
            ((qg.w2) jVar).setColor(t1Var.f44638a);
            ((qg.w2) this.J0).setType(3);
        } else if (z10 && (jVar instanceof qg.q0)) {
            ((qg.q0) jVar).setColor(t1Var.f44638a);
            ((qg.q0) this.J0).setType(0);
        }
    }

    @Override
    public final void F(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f5779r2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f5789w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f5789w2).commit();
            } else {
                this.f5787v2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f5787v2).commit();
            }
        }
        boolean z13 = this.f5777q2;
        s5 s5Var = this.O1;
        if (z13) {
            if (z10) {
                i11 = this.f5789w2;
            } else {
                i11 = this.f5787v2;
            }
            int paddingUnderContainer = this.M1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5775p2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f5775p2.setLayoutParams(layoutParams);
                this.f5783t2 = layoutParams.height;
                s5Var.a();
                requestLayout();
            }
        }
        if (this.f5791x2 == i10 && this.f5793y2 == z10) {
            return;
        }
        this.f5791x2 = i10;
        this.f5793y2 = z10;
        boolean z14 = this.f5779r2;
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            if (((qg.v2) jVar).getEditText().isFocused() && s5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f5779r2 = z12;
        } else {
            this.f5779r2 = false;
        }
        if (this.f5779r2 && this.f5777q2) {
            J0(0);
        }
        if (this.f5783t2 != 0 && !(z11 = this.f5779r2) && z11 != z14 && !this.f5777q2) {
            this.f5783t2 = 0;
            s5Var.a();
            requestLayout();
        }
        U0();
        if (z14 && !this.f5779r2 && this.f5783t2 > 0 && this.f5785u2) {
            this.f5785u2 = false;
        }
        S0();
    }

    public final void F0(pg.t1 t1Var) {
        E0(t1Var, null, false);
    }

    public final void H0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        qg.j jVar;
        ArrayList arrayList = this.Q1;
        if (arrayList != null) {
            k8 k8Var = this.P1;
            this.P1 = null;
            this.Q1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                j6 j6Var = this.R0;
                if (i11 < size) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        c6 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
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
                        pg.t1 swatch = o02.getSwatch();
                        swatch.f44638a = mediaEntity.color;
                        o02.setSwatch(swatch);
                        jVar = o02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            qg.x1 k02 = k0(mediaEntity.text, false);
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
                            ArrayList arrayList3 = k8Var.v;
                            boolean z11 = k8Var.K;
                            this.f5767l2 = true;
                            qg.j b6Var = new b6(this, getContext(), e0(), arrayList3, this.f5754e2, z11, this.f5756f2);
                            b6Var.setDelegate(this);
                            j6Var.addView(b6Var);
                            g0();
                            jVar = b6Var;
                            if (mediaEntity.viewWidth > 0) {
                                jVar = b6Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = b6Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    jVar = b6Var;
                                }
                            }
                        } else if (b10 == 3) {
                            qg.t0 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                j02.setColor(i14);
                            }
                            j02.setType(mediaEntity.subType);
                            jVar = j02;
                        } else if (b10 == 8) {
                            jd jdVar = mediaEntity.weather;
                            if (jdVar != null) {
                                qg.w2 p02 = p0(jdVar);
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
                            qg.q0 i02 = i0(mediaEntity.linkSettings);
                            qg.o0 o0Var = i02.f45303q0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                i02.setColor(i16);
                            }
                            boolean e7 = o0Var.e();
                            int i17 = o0Var.h;
                            int i18 = o0Var.f45255f;
                            if (e7) {
                                o0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                i02.setType(3);
                                o0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(o0Var.f45247a0)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(o0Var.f45249b0)) + i17 + i17;
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
                            qg.a2 l02 = l0(false);
                            l02.s(zg.o0.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                l02.r(false);
                            }
                            jVar = l02;
                            if (mediaEntity.mediaArea.dark) {
                                l02.q(false);
                                jVar = l02;
                            }
                        } else {
                            if (b10 == 5 && k8Var.f5341o0 != null) {
                                qg.b2 m0 = m0(k8Var.f5343p0, false);
                                kc kcVar = ((mb) this).A2;
                                yb ybVar = kcVar.X0;
                                if (ybVar != null) {
                                    ybVar.f4767w = m0;
                                    d81 d81Var = ybVar.f4769x;
                                    if (d81Var != null) {
                                        d81Var.V(m0.f44988u0);
                                    }
                                }
                                ac acVar = kcVar.f5383c1;
                                if (acVar != null) {
                                    acVar.setHasRoundVideo(true);
                                }
                                jVar = m0;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !m0.f44985r0;
                                    m0.f44985r0 = z12;
                                    m0.f44986s0.f(z12, true);
                                    m0.invalidate();
                                    jVar = m0;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f17284x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f17285y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                    jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
                    jVar.setScale(mediaEntity.scale);
                    jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                    i11 = i10 + 1;
                    z10 = false;
                } else {
                    j6Var.setVisibility(0);
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
            lVar.f16995i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16988u = lVar;
            if (!this.O1.c() && this.f5783t2 <= 0) {
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
                    q5 q5Var = q6Var.f5788w1;
                    float f17 = q6Var.D1;
                    boolean z12 = z10;
                    q5Var.A1(f17, z12);
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
            this.C1.a(new y4(this, z10, 0));
            this.C1.f();
            if (z10) {
                q5 q5Var = this.f5788w1;
                q5Var.setVisibility(0);
                q5Var.setSelectedColorIndex(pg.u0.e(this.F1).d());
            }
        }
    }

    public final void J0(int i10) {
        boolean z10;
        int i11;
        qg.o1 o1Var = this.l1;
        s5 s5Var = this.O1;
        if (i10 == 1) {
            nz nzVar = this.f5775p2;
            if (nzVar != null && nzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            nz nzVar2 = this.f5775p2;
            jc jcVar = this.M1;
            if (nzVar2 != null && nzVar2.f29097c1 != UserConfig.selectedAccount) {
                jcVar.removeView(nzVar2);
                this.f5775p2 = null;
            }
            if (this.f5775p2 == null) {
                nz nzVar3 = new nz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.f5775p2 = nzVar3;
                nzVar3.f29162w2 = false;
                nzVar3.U0 = true;
                nzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f5775p2.setForseMultiwindowLayout(true);
                }
                this.f5775p2.setDelegate(new e6(this));
                jcVar.addView(this.f5775p2);
            }
            this.f5775p2.setVisibility(0);
            this.f5777q2 = true;
            nz nzVar4 = this.f5775p2;
            if (this.f5787v2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f5787v2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f5787v2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f5789w2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f5789w2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f5789w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f5789w2;
            } else {
                i11 = this.f5787v2;
            }
            int paddingUnderContainer = jcVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            nzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                qg.j jVar = this.J0;
                if (jVar instanceof qg.v2) {
                    AndroidUtilities.hideKeyboard(((qg.v2) jVar).getEditText());
                }
            }
            this.f5783t2 = paddingUnderContainer;
            s5Var.a();
            requestLayout();
            ch emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(ah.d, true);
            }
            if (!z10) {
                if (this.f5779r2) {
                    this.f5785u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5783t2, 0.0f);
                    ofFloat.addUpdateListener(new z4(this, 1));
                    ofFloat.addListener(new v5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21448w);
                    ofFloat.start();
                }
            }
        } else {
            ch emojiButton2 = o1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(ah.f24532e, true);
            }
            nz nzVar5 = this.f5775p2;
            if (nzVar5 != null) {
                this.f5777q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    nzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f5783t2 = 0;
                s5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(qg.q0 q0Var) {
        t8 t8Var = new t8(getContext(), this.G1, this.f5758g2, new ai.g3(4, this, q0Var));
        if (q0Var != null) {
            qg.n0 n0Var = q0Var.f45307u0;
            t8Var.f6000c0 = true;
            org.telegram.ui.Cells.j3 j3Var = t8Var.Z;
            org.telegram.ui.Cells.j3 j3Var2 = t8Var.Y;
            if (n0Var != null) {
                t8Var.f6004g0 = n0Var.d;
                t8Var.f6005h0 = false;
                j3Var2.setText(n0Var.f45210c);
                j3Var.setText(n0Var.f45209b);
                t8Var.m0 = !TextUtils.isEmpty(n0Var.f45209b);
                t8Var.f6010n0 = n0Var.f45212f;
                t8Var.f6011o0 = n0Var.f45211e;
            } else {
                j3Var2.setText("");
                j3Var.setText("");
                t8Var.f6010n0 = true;
                t8Var.f6011o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = t8Var.f5999b0;
            dVar.g(string, false, true);
            p8 p8Var = t8Var.X;
            if (p8Var != null) {
                p8Var.N(false);
            }
            dVar.setEnabled(t8Var.T(j3Var2.getText().toString()));
            t8Var.f6000c0 = false;
        }
        t8Var.setOnDismissListener(new l5(this, 1));
        t8Var.show();
        z0(true);
    }

    public final void L0(qg.t0 t0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        xi xiVar = new xi(getContext(), new z5(this, callback2), false, true, false, this.G1);
        xiVar.Z1 = new Object();
        wh whVar = xiVar.f32877x1;
        if (t0Var != null && (messageMedia = t0Var.f45347u0) != null && (geoPoint = messageMedia.geo) != null) {
            xiVar.f32878x2 = new double[]{geoPoint.lat, geoPoint._long};
            xiVar.O = true;
            whVar.setVisibility(8);
        } else if (this.U1) {
            xiVar.f32870v2 = this.W1;
            xiVar.f32874w2 = this.V1;
            xiVar.O = true;
            whVar.setVisibility(8);
        } else {
            xiVar.O = true;
            whVar.setVisibility(8);
        }
        xiVar.setOnDismissListener(new l5(this, 0));
        xiVar.q1();
        xiVar.show();
    }

    public final void M0(qg.j jVar) {
        if (jVar instanceof qg.e1) {
            org.telegram.ui.ActionBar.n1 n1Var = this.H1;
            if (n1Var != null && n1Var.isShowing()) {
                this.H1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f5773o2;
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
        N0(new e5(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
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
            this.I1.setOnTouchListener(new g5(this, 0));
            this.I1.setDispatchKeyEventListener(new h5(this));
            this.I1.setShownFromBottom(true);
        }
        o6 o6Var2 = this.I1;
        o6Var2.W = z10;
        o6Var2.d();
        runnable.run();
        if (this.H1 == null) {
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(this.I1, -2, -2);
            this.H1 = n1Var2;
            n1Var2.f21411b = true;
            n1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.H1.setOutsideTouchable(true);
            this.H1.setClippingEnabled(true);
            this.H1.setInputMethodMode(2);
            this.H1.setSoftInputMode(0);
            this.H1.getContentView().setFocusableInTouchMode(true);
            this.H1.setOnDismissListener(new i5(this, 0));
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
            o6Var3.setBackgroundDrawable(new org.telegram.ui.Components.na(new org.telegram.ui.Components.oa(this.f5754e2, o6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.I1.setBackgroundDrawable(mutate);
        this.I1.setBackgroundColor(-14145495);
    }

    public final void O0(boolean z10) {
        if (this.f5750c2 != z10) {
            if (z10 || this.Z1 != null) {
                this.f5750c2 = z10;
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
                    this.f5752d2 = true;
                    this.M1.invalidate();
                    float f10 = this.f5748b2;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.Z1.setTransitionProgress(this.f5748b2);
                    ofFloat.addUpdateListener(new z4(this, 2));
                    ofFloat.addListener(new ai.n(11, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(tr.f31148g);
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

    public final void P0(boolean z10) {
        float f7;
        if (this.f5784u1 != z10) {
            this.f5784u1 = z10;
            o1.k kVar = this.f5786v1;
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
            this.f5786v1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f16995i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16988u = lVar;
            if (z10) {
                qg.t1 t1Var = this.f5768m1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.f5786v1.b(new ai.qa(1, this));
            this.f5786v1.a(new y4(this, z10, 1));
            this.f5786v1.f();
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
                j6 j6Var = this.R0;
                if (i11 >= j6Var.getChildCount()) {
                    break;
                }
                View childAt = j6Var.getChildAt(i11);
                if (!(childAt instanceof qg.j) || (childAt instanceof qg.e1)) {
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
        return this.O1.f5168l - this.M1.getBottomPadding2();
    }

    public final void R0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.Y0 != i10 && this.Z0 != i10) {
            ValueAnimator valueAnimator = this.f5747b1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.Y0;
            ViewGroup viewGroup3 = this.l1;
            ViewGroup viewGroup4 = this.f5765k1;
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
            if (e7.f44656l != z10) {
                e7.f44656l = z10;
                if (z10) {
                    e7.i(-1, false);
                } else {
                    e7.i(e7.f44647a.getInt("brush", 0), false);
                }
            }
            int c10 = pg.u0.e(i12).c();
            pg.t1 t1Var = this.A1;
            t1Var.f44638a = c10;
            E0(t1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f5747b1 = duration;
            duration.setInterpolator(tr.f31147f);
            this.f5747b1.addUpdateListener(new ai.x4(this, viewGroup, viewGroup2, 1));
            this.f5747b1.addListener(new x5(this, viewGroup, viewGroup2, i10, 0));
            this.f5747b1.start();
        }
    }

    public final void S0() {
        boolean z10;
        s5 s5Var = this.O1;
        qg.o1 o1Var = this.l1;
        if (o1Var != null) {
            if (s5Var.c()) {
                o1Var.a(R.drawable.input_smile);
            } else if (this.f5777q2) {
                o1Var.a(R.drawable.input_keyboard);
            } else {
                o1Var.a(R.drawable.msg_add);
            }
        }
        if (!s5Var.c() && !this.f5777q2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.f5772o1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5770n1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5776q1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5774p1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        float f7;
        qg.j jVar;
        ObjectAnimator objectAnimator = this.f5762i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        s5 s5Var = this.O1;
        if (((s5Var.c() && !s5Var.d) || this.f5783t2 > 0) && (jVar = this.J0) != null) {
            f7 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.f5762i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f5762i2.setInterpolator(tr.h);
        this.f5762i2.start();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: ci.q6.U0():void");
    }

    @Override
    public final void a() {
        I0(true);
    }

    @Override
    public final void b(pg.m mVar) {
        boolean z10 = mVar instanceof pg.b;
        qg.w1 w1Var = this.f5751d1;
        if (!z10 && !(mVar instanceof pg.d)) {
            w1Var.b(0.05f, 1.0f);
        } else {
            w1Var.b(0.4f, 1.75f);
        }
        w1Var.setDrawCenter(!(mVar instanceof pg.l));
        f6 f6Var = this.O0;
        if (f6Var.getCurrentBrush() instanceof pg.l) {
            this.f5749c1 = true;
        }
        f6Var.setBrush(mVar);
        pg.t1 t1Var = this.A1;
        int i10 = t1Var.f44638a;
        t1Var.f44638a = pg.u0.e(this.F1).c();
        t1Var.f44640c = this.f5753e1.get();
        E0(t1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    @Override
    public final boolean c(qg.j jVar) {
        return D0(jVar, true);
    }

    @Override
    public final void d() {
        setTextType((this.L0 + 1) % 4);
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
        if (this.f5769m2) {
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
    public final void f(int i10) {
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            G0((qg.v2) jVar, i10);
            pg.u0 e7 = pg.u0.e(this.F1);
            e7.f44652g = i10;
            e7.f44647a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public abstract boolean f0(ai.o8 o8Var);

    public final void g0() {
        org.telegram.ui.Components.z5[] z5VarArr;
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
                            for (org.telegram.ui.Components.z5 z5Var : (org.telegram.ui.Components.z5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.z5.class)) {
                                TLRPC.Document document = z5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.q5.f(i11, z5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.q5.h(i11).e(document);
                                }
                                if (k8.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
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
                        if (k8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
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
        return this.f5757g1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.z5[] z5VarArr;
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
                tL_inputDocument.f20054id = sticker.f20048id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof qg.v2) {
                CharSequence text = ((qg.v2) childAt).getText();
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
                                tL_inputDocument2.f20054id = document.f20048id;
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
        return this.f5751d1;
    }

    public final TextView h0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, this.G1));
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

    public final qg.q0 i0(qg.n0 n0Var) {
        int measuredWidth;
        int i10;
        this.f5767l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        j6 j6Var = this.R0;
        if (j6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = j6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        qg.q0 q0Var = new qg.q0(getContext(), Q0, this.F1, n0Var, f7 / 360.0f, dp);
        if (Q0.x == j6Var.getMeasuredWidth() / 2.0f) {
            q0Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            q0Var.setStickyY(2);
        }
        pg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.f44638a) != -47814) {
            q0Var.setColor(i10);
        }
        q0Var.setDelegate(this);
        q0Var.setMaxWidth(dp);
        j6Var.addView(q0Var, w7.z5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            q0Var.j(1.0f / cropState.cropScale);
            q0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return q0Var;
    }

    public final qg.t0 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f5767l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        j6 j6Var = this.R0;
        if (j6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = j6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        qg.t0 t0Var = new qg.t0(getContext(), Q0, this.F1, messageMedia, mediaArea, f7 / 240.0f, dp);
        if (Q0.x == j6Var.getMeasuredWidth() / 2.0f) {
            t0Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            t0Var.setStickyY(2);
        }
        pg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.f44638a) != -47814) {
            t0Var.setColor(i10);
        }
        t0Var.setDelegate(this);
        t0Var.setMaxWidth(dp);
        j6Var.addView(t0Var, w7.z5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            t0Var.j(1.0f / cropState.cropScale);
            t0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return t0Var;
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        if (this.f5769m2) {
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

    public final qg.x1 k0(String str, boolean z10) {
        float f7;
        fw0 fw0Var;
        this.f5767l2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e7) {
            FileLog.e(e7);
            f7 = 1.0f;
        }
        j6 j6Var = this.R0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.R1, j6Var.getMeasuredWidth()) * 0.5d);
            fw0Var = new fw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, j6Var.getMeasuredHeight()) * 0.5d);
            fw0Var = new fw0(f7 * floor2, floor2);
        }
        fw0 fw0Var2 = fw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = fw0Var2.f26590a;
            fw0Var2.f26590a = fw0Var2.f26591b;
            fw0Var2.f26591b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        qg.x1 x1Var = new qg.x1(context, e02, fw0Var2, str, intValue);
        x1Var.setDelegate(this);
        j6Var.addView(x1Var);
        g0();
        return x1Var;
    }

    public final qg.a2 l0(boolean z10) {
        String str;
        fw0 fw0Var = new fw0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
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
        jVar.f44964r0 = new ai.ob(jVar);
        jVar.f44965s0 = new ai.ob(jVar);
        jVar.f44966t0 = new zg.f0(jVar);
        jVar.f44967u0 = new zg.f0(jVar);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6((View) jVar);
        jVar.f44969w0 = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6((View) jVar);
        jVar.f44970x0 = e6Var2;
        jVar.f44972z0 = 1.0f;
        jVar.f44963q0 = fw0Var;
        e6Var2.d(1.0f, true);
        e6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        zg.f0 f0Var = jVar.f44966t0;
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
        zg.o0 b10 = zg.o0.b(str);
        jVar.f44968v0 = b10;
        f0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        j6Var.addView(jVar);
        g0();
        if (z10) {
            B0(jVar);
            D0(jVar, true);
        }
        return jVar;
    }

    public final qg.b2 m0(String str, boolean z10) {
        float f7;
        this.f5767l2 = true;
        this.f5771n2 = true;
        q0();
        j6 j6Var = this.R0;
        int measuredWidth = j6Var.getMeasuredWidth();
        j6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        fw0 fw0Var = new fw0(floor, floor);
        qg.b2 b2Var = new qg.b2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (fw0Var.f26591b / 2.0f) + AndroidUtilities.dp(72.0f)), fw0Var, str);
        b2Var.setDelegate(this);
        j6Var.addView(b2Var);
        g0();
        if (z10) {
            B0(b2Var);
            post(new u4(this, b2Var, 0));
        }
        this.f5771n2 = false;
        return b2Var;
    }

    public final c6 n0(Object obj, TLRPC.Document document) {
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
        float floor = (float) Math.floor(getPaintingSize().f26590a * 0.5d);
        c6 c6Var = new c6(this, context, p6Var.f5703a, p6Var.f5705c, p6Var.f5704b, new fw0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = c6Var.f45291x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        c6Var.setDelegate(this);
        this.R0.addView(c6Var);
        g0();
        return c6Var;
    }

    public final qg.v2 o0(boolean z10) {
        fw0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        qg.v2 v2Var = new qg.v2(getContext(), Q0, (int) (paintingSize.f26590a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.f26590a / 9.0f;
        f5 f5Var = new f5(this, 0);
        v2Var.f45379w0 = (int) (0.5f * f7);
        v2Var.f45380x0 = (int) (f7 * 2.0f);
        v2Var.f45381y0 = f5Var;
        float f10 = Q0.x;
        j6 j6Var = this.R0;
        if (f10 == j6Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        v2Var.setTypeface(pg.u0.e(i10).f44654j);
        v2Var.setType(pg.u0.e(i10).h);
        j6Var.addView(v2Var, w7.z5.c(-2.0f, -2));
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
            int i11 = pg.u0.e(i10).f44652g;
            qg.o1 o1Var = this.l1;
            o1Var.d(i11, true);
            o1Var.setOutlineType(pg.u0.e(i10).h);
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
        float f11 = this.H0.f26590a;
        qg.j jVar = this.J0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.T0, i10, i11);
        measureChild(this.f5751d1, i10, i11);
        measureChild(this.V0, i10, i11);
        measureChild(this.U0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f5783t2 - this.M1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.S0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.G0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f5777q2 && !this.f5781s2) {
            this.G0 = true;
            w0();
            this.G0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    public final qg.w2 p0(jd jdVar) {
        int measuredWidth;
        int i10;
        this.f5767l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        j6 j6Var = this.R0;
        if (j6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = j6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        qg.w2 w2Var = new qg.w2(getContext(), Q0, this.F1, jdVar, f7 / 240.0f, dp);
        if (Q0.x == j6Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        pg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.f44638a) != -47814) {
            w2Var.setColor(i10);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth(dp);
        j6Var.addView(w2Var, w7.z5.c(-2.0f, -2));
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
        return !(this.J0 instanceof qg.e1);
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 < j6Var.getChildCount()) {
                View childAt = j6Var.getChildAt(i10);
                if (childAt instanceof qg.b2) {
                    if (this.J0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(tr.h).withEndAction(new u4(this, (qg.b2) childAt, 1)).start();
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

    public final qg.e1 s0() {
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

    public void setBlurManager(org.telegram.ui.Components.ka kaVar) {
        this.f5754e2 = kaVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f5769m2 != z10) {
            this.f5769m2 = z10;
            if (z10) {
                D0(null, true);
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
                    ImageReceiver imageReceiver = ((qg.o2) childAt).f45291x0;
                    kj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    imageReceiver.getAnimation();
                    if (lottieAnimation != null) {
                        lottieAnimation.N(Math.round(((((float) j3) % ((float) lottieAnimation.r())) / ((float) lottieAnimation.r())) * lottieAnimation.f28130e[0]), true, false);
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

    public final android.graphics.Bitmap t0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, ci.k8 r46) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q6.t0(java.util.ArrayList, boolean, boolean, boolean, boolean, ci.k8):android.graphics.Bitmap");
    }

    @Override
    public final void u() {
        if (!this.f5779r2 && !this.f5777q2) {
            this.f5767l2 = true;
            o0(true);
            return;
        }
        if (this.f5777q2) {
            qg.j jVar = this.J0;
            if (jVar instanceof qg.v2) {
                this.O1.f5162e = true;
                AndroidUtilities.showKeyboard(((qg.v2) jVar).getEditText());
            }
        }
        J0(!this.f5777q2 ? 1 : 0);
    }

    public final boolean u0() {
        if (!this.D0.a() && !this.f5767l2) {
            return false;
        }
        return true;
    }

    @Override
    public final void v(float f7, float f10, float[] fArr) {
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

    public final void v0(boolean z10) {
        if (this.f5777q2) {
            J0(0);
        }
        if (z10) {
            nz nzVar = this.f5775p2;
            if (nzVar != null && nzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f5775p2.getMeasuredHeight());
                ofFloat.addUpdateListener(new z4(this, 0));
                this.f5781s2 = true;
                ofFloat.addListener(new v5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f21448w);
                ofFloat.start();
                return;
            }
            w0();
        }
    }

    @Override
    public final pg.u0 w() {
        return pg.u0.e(this.F1);
    }

    public final void w0() {
        nz nzVar;
        if (!this.f5777q2 && (nzVar = this.f5775p2) != null && nzVar.getVisibility() != 8) {
            this.f5775p2.setVisibility(8);
        }
        int i10 = this.f5783t2;
        this.f5783t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    public final boolean y0() {
        if (this.f5750c2) {
            if (this.Z1.getReactionsWindow() != null && !this.Z1.getReactionsWindow().f53336q) {
                this.Z1.e();
                return true;
            }
            O0(false);
            return true;
        } else if (this.B1) {
            I0(false);
            return true;
        } else if (this.f5777q2) {
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
    public final void z() {
        N0(new f5(this, 3), this, 53, 0, getHeight(), false);
    }

    public abstract void z0(boolean z10);

    public void setOffsetTranslationX(float f7) {
    }

    public View getView() {
        return this;
    }
}
