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
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.LaunchActivity;
public abstract class o6 extends pw0 implements rg.s1, rg.h, rg.o1, nw0, gc {
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
    public final c6 G1;
    public iw0 H0;
    public org.telegram.ui.ActionBar.m1 H1;
    public boolean I0;
    public m6 I1;
    public rg.j J0;
    public Rect J1;
    public boolean K0;
    public Runnable K1;
    public int L0;
    public Runnable L1;
    public boolean M0;
    public final jc M1;
    public final boolean N0;
    public AnimatorSet N1;
    public final e6 O0;
    public final r5 O1;
    public final g6 P0;
    public k8 P1;
    public final j6 Q0;
    public ArrayList Q1;
    public final i6 R0;
    public int R1;
    public final FrameLayout S0;
    public int S1;
    public final k6 T0;
    public qg.x T1;
    public final o5 U0;
    public final boolean U1;
    public final FrameLayout V0;
    public final File V1;
    public v5 W0;
    public final boolean W1;
    public final View X0;
    public final boolean X1;
    public int Y0;
    public boolean Y1;
    public int Z0;
    public gl0 Z1;
    public float f7515a1;
    public rg.c2 a2;
    public ValueAnimator f7516b1;
    public float f7517b2;
    public boolean f7518c1;
    public boolean f7519c2;
    public final rg.y1 f7520d1;
    public boolean f7521d2;
    public final a4.l f7522e1;
    public org.telegram.ui.Components.la f7523e2;
    public final int f7524f1;
    public final z6 f7525f2;
    public BigInteger f7526g1;
    public final a7 f7527g2;
    public TextView f7528h1;
    public boolean f7529h2;
    public TextView f7530i1;
    public ObjectAnimator f7531i2;
    public TextView f7532j1;
    public final float[] f7533j2;
    public final rg.t1 f7534k1;
    public x5 f7535k2;
    public final rg.q1 l1;
    public boolean f7536l2;
    public final rg.v1 f7537m1;
    public boolean f7538m2;
    public final ImageView f7539n1;
    public boolean f7540n2;
    public final TextView f7541o1;
    public final int[] f7542o2;
    public final TextView f7543p1;
    public wz f7544p2;
    public final TextView f7545q1;
    public boolean f7546q2;
    public final Paint f7547r1;
    public boolean f7548r2;
    public final Paint f7549s1;
    public boolean f7550s2;
    public float f7551t1;
    public int f7552t2;
    public boolean f7553u1;
    public boolean f7554u2;
    public o1.k f7555v1;
    public int f7556v2;
    public final p5 f7557w1;
    public int f7558w2;
    public final Paint f7559x1;
    public int f7560x2;
    public final Paint f7561y1;
    public boolean f7562y2;
    public final Paint f7563z1;

    public o6(Context context, boolean z10, File file, boolean z11, boolean z12, jc jcVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, k8 k8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.la laVar, org.telegram.ui.ActionBar.c6 c6Var, z6 z6Var, a7 a7Var) {
        super(context, activity);
        e6 e6Var;
        Paint paint;
        org.telegram.ui.Components.la laVar2;
        qg.s0 s0Var;
        Bitmap bitmap3;
        DispatchQueue dispatchQueue;
        Paint paint2;
        qg.q1 q1Var;
        e6 e6Var2;
        int i14;
        this.Y0 = 0;
        this.Z0 = -1;
        final mb mbVar = (mb) this;
        a4.l lVar = new a4.l(mbVar, 18);
        this.f7522e1 = lVar;
        Paint paint3 = new Paint(1);
        this.f7547r1 = paint3;
        Paint paint4 = new Paint(1);
        this.f7549s1 = paint4;
        this.f7559x1 = new Paint(1);
        this.f7561y1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f7563z1 = paint5;
        qg.q1 q1Var2 = new qg.q1(1.0f, 0.016773745f, -1);
        this.A1 = q1Var2;
        this.E1 = new Paint(1);
        this.f7533j2 = new float[2];
        this.f7538m2 = false;
        this.f7542o2 = new int[2];
        new androidx.activity.i(mbVar, 18);
        setDelegate(this);
        this.f7523e2 = laVar;
        this.f7525f2 = z6Var;
        this.U1 = z10;
        this.V1 = file;
        this.W1 = z11;
        this.X1 = z12;
        this.M1 = jcVar;
        this.R1 = i12;
        this.S1 = i13;
        this.f7527g2 = a7Var;
        this.F1 = i10;
        c6 c6Var2 = new c6(c6Var);
        this.G1 = c6Var2;
        this.F0 = cropState;
        this.N0 = context instanceof BubbleActivity;
        qg.s0 e = qg.s0.e(i10);
        e.i(0, true);
        q1Var2.f43285a = e.c();
        q1Var2.f43287c = e.f43312i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.E0 = dispatchQueue2;
        this.C0 = bitmap;
        this.f7524f1 = i11;
        qg.t1 t1Var = new qg.t1();
        this.D0 = t1Var;
        t1Var.f43327a = new a1.c(mbVar, 25);
        View view = new View(context);
        this.X0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        qg.q0 q0Var = new qg.q0(getPaintingSize(), null, i11, laVar);
        if (k8Var == null || !k8Var.f7216u) {
            paint = paint5;
            laVar2 = laVar;
            s0Var = e;
            bitmap3 = bitmap;
            dispatchQueue = dispatchQueue2;
            paint2 = paint4;
            q1Var = q1Var2;
            e6Var2 = e6Var;
        } else {
            paint = paint5;
            laVar2 = null;
            s0Var = e;
            bitmap3 = bitmap;
            paint2 = paint4;
            q1Var = q1Var2;
            e6Var2 = e6Var;
            dispatchQueue = dispatchQueue2;
        }
        e6Var2 = new e6(mbVar, context, q0Var, bitmap3, bitmap2, laVar2);
        this.O0 = e6Var2;
        e6Var2.setDelegate(new f6(mbVar));
        e6Var2.setUndoStore(t1Var);
        e6Var2.setQueue(dispatchQueue);
        e6Var2.setVisibility(4);
        g6 g6Var = new g6(mbVar, context);
        this.P0 = g6Var;
        g6Var.setVisibility(4);
        i6 i6Var = new i6(mbVar, context, new h6(mbVar));
        this.R0 = i6Var;
        this.P1 = k8Var;
        this.Q1 = arrayList;
        if (this.R1 > 0 && this.S1 > 0) {
            G0();
        }
        i6Var.setVisibility(4);
        this.Q0 = new j6(mbVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, w7.z5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f7539n1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        mb mbVar2 = mbVar;
                        e6 e6Var3 = mbVar2.O0;
                        if (e6Var3 != null && (e6Var3.getCurrentBrush() instanceof qg.l)) {
                            e6Var3.b();
                            mbVar2.f7534k1.setSelectedIndex(1);
                            mbVar2.o((qg.m) qg.m.f43227a.get(0));
                            return;
                        }
                        mbVar2.D0.c();
                        return;
                    case 1:
                        mb mbVar3 = mbVar;
                        e6 e6Var4 = mbVar3.O0;
                        qg.t1 t1Var2 = mbVar3.D0;
                        if (t1Var2.a()) {
                            if (e6Var4 != null && (e6Var4.getCurrentBrush() instanceof qg.l)) {
                                e6Var4.b();
                                mbVar3.f7534k1.setSelectedIndex(1);
                                mbVar3.o((qg.m) qg.m.f43227a.get(0));
                            }
                            if (e6Var4 != null) {
                                e6Var4.a();
                            }
                            t1Var2.f43329c.clear();
                            t1Var2.f43328b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var2, 18));
                            mbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        mb mbVar4 = mbVar;
                        rg.j jVar = mbVar4.J0;
                        if (jVar instanceof rg.x2) {
                            AndroidUtilities.hideKeyboard(((rg.x2) jVar).getFocusedView());
                        }
                        if (mbVar4.f7546q2) {
                            mbVar4.u0(false);
                        }
                        mbVar4.B0(mbVar4.J0);
                        mbVar4.C0(null, true);
                        return;
                    case 3:
                        mbVar.C0(null, true);
                        return;
                    default:
                        mb mbVar5 = mbVar;
                        if (mbVar5.B1) {
                            mbVar5.H0(false);
                            return;
                        } else if (mbVar5.f7546q2) {
                            mbVar5.u0(true);
                            return;
                        } else if (mbVar5.K0) {
                            mbVar5.C0(null, true);
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
        frameLayout.addView(imageView, w7.z5.a(32.0f, 12.0f, 0.0f, 0.0f, 0.0f, 32, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        sk.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, w7.z5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ah.f(3));
        frameLayout.addView(linearLayout, w7.z5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f7541o1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
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
                        e6 e6Var3 = mbVar2.O0;
                        if (e6Var3 != null && (e6Var3.getCurrentBrush() instanceof qg.l)) {
                            e6Var3.b();
                            mbVar2.f7534k1.setSelectedIndex(1);
                            mbVar2.o((qg.m) qg.m.f43227a.get(0));
                            return;
                        }
                        mbVar2.D0.c();
                        return;
                    case 1:
                        mb mbVar3 = mbVar;
                        e6 e6Var4 = mbVar3.O0;
                        qg.t1 t1Var2 = mbVar3.D0;
                        if (t1Var2.a()) {
                            if (e6Var4 != null && (e6Var4.getCurrentBrush() instanceof qg.l)) {
                                e6Var4.b();
                                mbVar3.f7534k1.setSelectedIndex(1);
                                mbVar3.o((qg.m) qg.m.f43227a.get(0));
                            }
                            if (e6Var4 != null) {
                                e6Var4.a();
                            }
                            t1Var2.f43329c.clear();
                            t1Var2.f43328b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var2, 18));
                            mbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        mb mbVar4 = mbVar;
                        rg.j jVar = mbVar4.J0;
                        if (jVar instanceof rg.x2) {
                            AndroidUtilities.hideKeyboard(((rg.x2) jVar).getFocusedView());
                        }
                        if (mbVar4.f7546q2) {
                            mbVar4.u0(false);
                        }
                        mbVar4.B0(mbVar4.J0);
                        mbVar4.C0(null, true);
                        return;
                    case 3:
                        mbVar.C0(null, true);
                        return;
                    default:
                        mb mbVar5 = mbVar;
                        if (mbVar5.B1) {
                            mbVar5.H0(false);
                            return;
                        } else if (mbVar5.f7546q2) {
                            mbVar5.u0(true);
                            return;
                        } else if (mbVar5.K0) {
                            mbVar5.C0(null, true);
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
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView2, w7.z5.a(32.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5), context);
        this.f7543p1 = g10;
        g10.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
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
                        mb mbVar2 = mbVar;
                        e6 e6Var3 = mbVar2.O0;
                        if (e6Var3 != null && (e6Var3.getCurrentBrush() instanceof qg.l)) {
                            e6Var3.b();
                            mbVar2.f7534k1.setSelectedIndex(1);
                            mbVar2.o((qg.m) qg.m.f43227a.get(0));
                            return;
                        }
                        mbVar2.D0.c();
                        return;
                    case 1:
                        mb mbVar3 = mbVar;
                        e6 e6Var4 = mbVar3.O0;
                        qg.t1 t1Var2 = mbVar3.D0;
                        if (t1Var2.a()) {
                            if (e6Var4 != null && (e6Var4.getCurrentBrush() instanceof qg.l)) {
                                e6Var4.b();
                                mbVar3.f7534k1.setSelectedIndex(1);
                                mbVar3.o((qg.m) qg.m.f43227a.get(0));
                            }
                            if (e6Var4 != null) {
                                e6Var4.a();
                            }
                            t1Var2.f43329c.clear();
                            t1Var2.f43328b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var2, 18));
                            mbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        mb mbVar4 = mbVar;
                        rg.j jVar = mbVar4.J0;
                        if (jVar instanceof rg.x2) {
                            AndroidUtilities.hideKeyboard(((rg.x2) jVar).getFocusedView());
                        }
                        if (mbVar4.f7546q2) {
                            mbVar4.u0(false);
                        }
                        mbVar4.B0(mbVar4.J0);
                        mbVar4.C0(null, true);
                        return;
                    case 3:
                        mbVar.C0(null, true);
                        return;
                    default:
                        mb mbVar5 = mbVar;
                        if (mbVar5.B1) {
                            mbVar5.H0(false);
                            return;
                        } else if (mbVar5.f7546q2) {
                            mbVar5.u0(true);
                            return;
                        } else if (mbVar5.K0) {
                            mbVar5.C0(null, true);
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
        g10.setAlpha(0.0f);
        g10.setVisibility(8);
        TextView g11 = org.telegram.ui.Cells.c1.g(frameLayout, g10, w7.z5.a(32.0f, 4.0f, 0.0f, 0.0f, 0.0f, -2, 51), context);
        this.f7545q1 = g11;
        g11.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
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
                        mb mbVar2 = mbVar;
                        e6 e6Var3 = mbVar2.O0;
                        if (e6Var3 != null && (e6Var3.getCurrentBrush() instanceof qg.l)) {
                            e6Var3.b();
                            mbVar2.f7534k1.setSelectedIndex(1);
                            mbVar2.o((qg.m) qg.m.f43227a.get(0));
                            return;
                        }
                        mbVar2.D0.c();
                        return;
                    case 1:
                        mb mbVar3 = mbVar;
                        e6 e6Var4 = mbVar3.O0;
                        qg.t1 t1Var2 = mbVar3.D0;
                        if (t1Var2.a()) {
                            if (e6Var4 != null && (e6Var4.getCurrentBrush() instanceof qg.l)) {
                                e6Var4.b();
                                mbVar3.f7534k1.setSelectedIndex(1);
                                mbVar3.o((qg.m) qg.m.f43227a.get(0));
                            }
                            if (e6Var4 != null) {
                                e6Var4.a();
                            }
                            t1Var2.f43329c.clear();
                            t1Var2.f43328b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var2, 18));
                            mbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        mb mbVar4 = mbVar;
                        rg.j jVar = mbVar4.J0;
                        if (jVar instanceof rg.x2) {
                            AndroidUtilities.hideKeyboard(((rg.x2) jVar).getFocusedView());
                        }
                        if (mbVar4.f7546q2) {
                            mbVar4.u0(false);
                        }
                        mbVar4.B0(mbVar4.J0);
                        mbVar4.C0(null, true);
                        return;
                    case 3:
                        mbVar.C0(null, true);
                        return;
                    default:
                        mb mbVar5 = mbVar;
                        if (mbVar5.B1) {
                            mbVar5.H0(false);
                            return;
                        } else if (mbVar5.f7546q2) {
                            mbVar5.u0(true);
                            return;
                        } else if (mbVar5.K0) {
                            mbVar5.C0(null, true);
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
        g11.setAlpha(0.0f);
        g11.setVisibility(8);
        frameLayout.addView(g11, w7.z5.a(32.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5));
        qg.s0 s0Var2 = s0Var;
        k6 k6Var = new k6(mbVar, context, s0Var2);
        this.T0 = k6Var;
        k6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        k6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(k6Var, w7.z5.e(-1, 104, 80));
        rg.t1 t1Var2 = new rg.t1(context, (k8Var == null || k8Var.v() || k8Var.f7216u || laVar == null) ? false : true);
        this.f7534k1 = t1Var2;
        t1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        t1Var2.setDelegate(this);
        t1Var2.setSelectedIndex(1);
        k6Var.addView(t1Var2, w7.z5.d(48.0f, -1));
        rg.q1 q1Var3 = new rg.q1(context);
        this.l1 = q1Var3;
        q1Var3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        q1Var3.setVisibility(8);
        q1Var3.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        mb mbVar2 = mbVar;
                        qg.q1 q1Var4 = mbVar2.A1;
                        mbVar2.E0(q1Var4);
                        qg.s0.e(i10).j(q1Var4.f43287c);
                        return;
                    default:
                        mbVar.l1.setTypeface(qg.s0.e(i10).f43313j);
                        return;
                }
            }
        });
        q1Var3.setAlignment(qg.s0.e(i10).f43311g);
        k6Var.addView(q1Var3, w7.z5.d(48.0f, -1));
        o5 o5Var = new o5(mbVar, context);
        this.U0 = o5Var;
        addView(o5Var, w7.z5.d(-1.0f, -1));
        rg.v1 v1Var = new rg.v1(context);
        this.f7537m1 = v1Var;
        v1Var.setVisibility(8);
        v1Var.setOnItemClickListener(new bi.d(mbVar, 5));
        q1Var3.setTypefaceListView(v1Var);
        o5Var.addView(v1Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 8.0f, 8.0f, -2, 85));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint2.setColor(c6Var2.E0(org.telegram.ui.ActionBar.g6.G8));
        p5 p5Var = new p5(mbVar, context);
        this.f7557w1 = p5Var;
        p5Var.setVisibility(8);
        p5Var.setColorPalette(qg.s0.e(i10));
        p5Var.setColorListener(new c5(mbVar, 0));
        k6Var.addView(p5Var, w7.z5.a(84.0f, 56.0f, 0.0f, 56.0f, 6.0f, -1, 48));
        setupTabsLayout(context);
        rg.h1 h1Var = new rg.h1(context);
        this.A0 = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        h1Var.setBackground(org.telegram.ui.ActionBar.g6.g0(1090519039, 1, -1));
        k6Var.addView(h1Var, w7.z5.a(32.0f, 12.0f, 0.0f, 0.0f, 4.0f, 32, 83));
        h1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        mb mbVar2 = mbVar;
                        e6 e6Var3 = mbVar2.O0;
                        if (e6Var3 != null && (e6Var3.getCurrentBrush() instanceof qg.l)) {
                            e6Var3.b();
                            mbVar2.f7534k1.setSelectedIndex(1);
                            mbVar2.o((qg.m) qg.m.f43227a.get(0));
                            return;
                        }
                        mbVar2.D0.c();
                        return;
                    case 1:
                        mb mbVar3 = mbVar;
                        e6 e6Var4 = mbVar3.O0;
                        qg.t1 t1Var22 = mbVar3.D0;
                        if (t1Var22.a()) {
                            if (e6Var4 != null && (e6Var4.getCurrentBrush() instanceof qg.l)) {
                                e6Var4.b();
                                mbVar3.f7534k1.setSelectedIndex(1);
                                mbVar3.o((qg.m) qg.m.f43227a.get(0));
                            }
                            if (e6Var4 != null) {
                                e6Var4.a();
                            }
                            t1Var22.f43329c.clear();
                            t1Var22.f43328b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var22, 18));
                            mbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        mb mbVar4 = mbVar;
                        rg.j jVar = mbVar4.J0;
                        if (jVar instanceof rg.x2) {
                            AndroidUtilities.hideKeyboard(((rg.x2) jVar).getFocusedView());
                        }
                        if (mbVar4.f7546q2) {
                            mbVar4.u0(false);
                        }
                        mbVar4.B0(mbVar4.J0);
                        mbVar4.C0(null, true);
                        return;
                    case 3:
                        mbVar.C0(null, true);
                        return;
                    default:
                        mb mbVar5 = mbVar;
                        if (mbVar5.B1) {
                            mbVar5.H0(false);
                            return;
                        } else if (mbVar5.f7546q2) {
                            mbVar5.u0(true);
                            return;
                        } else if (mbVar5.K0) {
                            mbVar5.C0(null, true);
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
        rg.l1 l1Var = new rg.l1(context);
        this.B0 = l1Var;
        l1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        l1Var.setBackground(org.telegram.ui.ActionBar.g6.g0(1090519039, 1, -1));
        l1Var.setOnClickListener(new bi.x(mbVar, context, s0Var2, 6));
        k6Var.addView(l1Var, w7.z5.a(32.0f, 0.0f, 0.0f, 12.0f, 4.0f, 32, 85));
        rg.y1 y1Var = new rg.y1(context);
        this.f7520d1 = y1Var;
        qg.q1 q1Var4 = q1Var;
        y1Var.setColorSwatch(q1Var4);
        y1Var.setRenderView(e6Var2);
        y1Var.setValueOverride(lVar);
        q1Var4.f43287c = lVar.get();
        y1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        mb mbVar2 = mbVar;
                        qg.q1 q1Var42 = mbVar2.A1;
                        mbVar2.E0(q1Var42);
                        qg.s0.e(i10).j(q1Var42.f43287c);
                        return;
                    default:
                        mbVar.l1.setTypeface(qg.s0.e(i10).f43313j);
                        return;
                }
            }
        });
        addView(y1Var, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V0 = frameLayout2;
        addView(frameLayout2, w7.z5.d(-1.0f, -1));
        Paint paint6 = paint;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(AndroidUtilities.dp(2.0f));
        D0(q1Var4, null, false);
        o((qg.m) qg.m.f43227a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.O1 = new r5(mbVar, jcVar, new bi.v2(2, mbVar, jcVar));
        r2.G = i14;
    }

    public static void F0(rg.x2 x2Var, int i10) {
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

    public static void Z(mb mbVar, qg.s0 s0Var, Integer num) {
        s0Var.h(num.intValue(), true);
        s0Var.g();
        mbVar.setNewColor(num.intValue());
        mbVar.f7557w1.setSelectedColorIndex(s0Var.d());
        mbVar.T1 = null;
    }

    public static void a0(mb mbVar, Integer num) {
        mbVar.setNewColor(num.intValue());
        mbVar.H0(false);
    }

    public ViewGroup getBarView() {
        if (this.Y0 == 2) {
            return this.l1;
        }
        return this.f7534k1;
    }

    private int getFrameRotation() {
        int i10 = this.f7524f1;
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

    private iw0 getPaintingSize() {
        iw0 iw0Var = this.H0;
        if (iw0Var != null) {
            return iw0Var;
        }
        iw0 iw0Var2 = new iw0(1080.0f, 1920.0f);
        this.H0 = iw0Var2;
        return iw0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            i6 i6Var = this.R0;
            if (i10 < i6Var.getChildCount()) {
                View childAt = i6Var.getChildAt(i10);
                if (childAt instanceof rg.q2) {
                    ImageReceiver imageReceiver = ((rg.q2) childAt).f44282x0;
                    yj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
                        animation.f24634y = z10;
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
        int i11 = q1Var.f43285a;
        q1Var.f43285a = i10;
        D0(q1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new b5(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        rg.j jVar = this.J0;
        if (jVar instanceof rg.x2) {
            ((rg.x2) jVar).setType(i10);
        }
        qg.s0 e = qg.s0.e(this.F1);
        e.h = i10;
        e.f43307a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        v5 v5Var = new v5(this, context);
        this.W0 = v5Var;
        v5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.z5.a(40.0f, 52.0f, 0.0f, 52.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        this.f7528h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f7528h1;
        int i10 = org.telegram.ui.ActionBar.g6.f19690i6;
        c6 c6Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), 7, -1));
        this.f7528h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f7528h1.setTextColor(-1);
        this.f7528h1.setTextSize(1, 14.0f);
        this.f7528h1.setGravity(1);
        this.f7528h1.setTypeface(AndroidUtilities.bold());
        this.f7528h1.setSingleLine();
        this.f7528h1.setOnClickListener(new View.OnClickListener(this) {
            public final o6 f7895b;

            {
                this.f7895b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f7895b;
                        if (o6Var.K0) {
                            o6Var.C0(null, true);
                            return;
                        } else {
                            o6Var.Q0(0);
                            return;
                        }
                    case 1:
                        this.f7895b.z0();
                        return;
                    default:
                        o6 o6Var2 = this.f7895b;
                        o6Var2.Q0(2);
                        if (!(o6Var2.J0 instanceof rg.x2)) {
                            o6Var2.f7536l2 = true;
                            o6Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f7528h1, w7.z5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f7530i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f7530i1.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), 7, -1));
        this.f7530i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f7530i1.setOnClickListener(new View.OnClickListener(this) {
            public final o6 f7895b;

            {
                this.f7895b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f7895b;
                        if (o6Var.K0) {
                            o6Var.C0(null, true);
                            return;
                        } else {
                            o6Var.Q0(0);
                            return;
                        }
                    case 1:
                        this.f7895b.z0();
                        return;
                    default:
                        o6 o6Var2 = this.f7895b;
                        o6Var2.Q0(2);
                        if (!(o6Var2.J0 instanceof rg.x2)) {
                            o6Var2.f7536l2 = true;
                            o6Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f7530i1.setTextColor(-1);
        this.f7530i1.setTextSize(1, 14.0f);
        this.f7530i1.setGravity(1);
        this.f7530i1.setTypeface(AndroidUtilities.bold());
        this.f7530i1.setAlpha(0.6f);
        this.f7530i1.setSingleLine();
        this.W0.addView(this.f7530i1, w7.z5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f7532j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f7532j1.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), 7, -1));
        this.f7532j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f7532j1.setTextColor(-1);
        this.f7532j1.setTextSize(1, 14.0f);
        this.f7532j1.setGravity(1);
        this.f7532j1.setTypeface(AndroidUtilities.bold());
        this.f7532j1.setAlpha(0.6f);
        this.f7532j1.setSingleLine();
        this.f7532j1.setOnClickListener(new View.OnClickListener(this) {
            public final o6 f7895b;

            {
                this.f7895b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o6 o6Var = this.f7895b;
                        if (o6Var.K0) {
                            o6Var.C0(null, true);
                            return;
                        } else {
                            o6Var.Q0(0);
                            return;
                        }
                    case 1:
                        this.f7895b.z0();
                        return;
                    default:
                        o6 o6Var2 = this.f7895b;
                        o6Var2.Q0(2);
                        if (!(o6Var2.J0 instanceof rg.x2)) {
                            o6Var2.f7536l2 = true;
                            o6Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f7532j1, w7.z5.l(1.0f, 0, -2));
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

    @Override
    public final void A() {
        M0(new e5(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0(rg.j jVar) {
        this.D0.b(jVar.getUUID(), new d5(this, jVar, 0));
    }

    public final void B0(rg.j jVar) {
        rg.j jVar2 = this.J0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            C0(null, true);
            if (jVar instanceof rg.x2) {
                ValueAnimator valueAnimator = this.f7516b1;
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
            qg.t1 t1Var = this.D0;
            t1Var.f43328b.remove(uuid);
            t1Var.f43329c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var, 18));
        }
        rg.y1 y1Var = this.f7520d1;
        a4.l lVar = this.f7522e1;
        y1Var.setValueOverride(lVar);
        y1Var.setShowPreview(true);
        float f7 = lVar.get();
        qg.q1 q1Var = this.A1;
        q1Var.f43287c = f7;
        D0(q1Var, null, false);
        if (!this.f7540n2 && (jVar instanceof rg.d2)) {
            kc kcVar = ((mb) this).A2;
            yb ybVar = kcVar.X0;
            if (ybVar != null) {
                ybVar.s(null, null, true);
            }
            mb mbVar = kcVar.f7305v1;
            if (mbVar != null) {
                mbVar.p0();
            }
            ac acVar = kcVar.f7246c1;
            if (acVar != null) {
                acVar.setHasRoundVideo(false);
            }
            k8 k8Var = kcVar.K1;
            if (k8Var != null) {
                File file = k8Var.f7205o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    kcVar.K1.f7205o0 = null;
                }
                if (kcVar.K1.f7207p0 != null) {
                    try {
                        new File(kcVar.K1.f7207p0).delete();
                    } catch (Exception unused2) {
                    }
                    kcVar.K1.f7207p0 = null;
                }
            }
        }
    }

    public final boolean C0(rg.j jVar, boolean z10) {
        boolean z11;
        uc ucVar;
        uc ucVar2;
        gl0 gl0Var;
        int i10;
        boolean z12 = jVar instanceof rg.x2;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f7516b1;
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
            rg.x2 x2Var = (rg.x2) jVar;
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
                q1Var.setTypeface(typeface.f43202a);
            }
            q1Var.e(x2Var.getType(), true);
            this.U0.invalidate();
        }
        rg.j jVar2 = this.J0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f44055d0) {
                    if (jVar instanceof rg.v0) {
                        rg.v0 v0Var = (rg.v0) jVar;
                        v0Var.setType((v0Var.getType() + 1) % v0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof rg.y2) {
                        rg.y2 y2Var = (rg.y2) jVar;
                        y2Var.setType((y2Var.getType() + 1) % y2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof rg.s0) {
                        rg.s0 s0Var = (rg.s0) jVar;
                        rg.q0 q0Var = s0Var.f44296q0;
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
                        if (jVar instanceof rg.x2) {
                            this.M0 = true;
                            q0();
                            return true;
                        } else if (jVar instanceof rg.c2) {
                            rg.c2 c2Var = (rg.c2) jVar;
                            if (this.f7519c2 && this.a2 == jVar) {
                                c2Var.q(true);
                                return true;
                            }
                            rg.c2 c2Var2 = this.a2;
                            if (c2Var2 != null && c2Var2 != c2Var && (gl0Var = this.Z1) != null) {
                                gl0Var.animate().alpha(0.0f).setListener(new t5(gl0Var, 0));
                                this.Z1 = null;
                                this.f7519c2 = false;
                                this.f7517b2 = 0.0f;
                            }
                            if (this.Z1 == null) {
                                gl0 gl0Var2 = new gl0(2, this.F1, getContext(), LaunchActivity.R(), new bi.n3(6, new bi.b()));
                                this.Z1 = gl0Var2;
                                org.telegram.ui.Components.pa paVar = new org.telegram.ui.Components.pa(this.f7523e2, gl0Var2, 0, false);
                                this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.M1.addView(this.Z1, w7.z5.a(96.0f, 0.0f, 0.0f, 12.0f, 64.0f, -2, 53));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                gl0 gl0Var3 = this.Z1;
                                ?? obj = new Object();
                                obj.e = this;
                                obj.f5428a = paVar;
                                obj.d = paint;
                                obj.f5430c = new Path();
                                gl0Var3.setDelegate(obj);
                                this.Z1.p(null, null, true);
                            }
                            this.Z1.setFragment(LaunchActivity.R());
                            this.a2 = c2Var;
                            N0(true);
                            return true;
                        } else {
                            L0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof rg.x2) {
                        AndroidUtilities.showKeyboard(((rg.x2) jVar2).getFocusedView());
                        u0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            rg.j jVar3 = this.J0;
            if (jVar3 instanceof rg.x2) {
                rg.x2 x2Var2 = (rg.x2) jVar3;
                rg.w2 w2Var = x2Var2.f44354q0;
                w2Var.clearFocus();
                w2Var.setEnabled(false);
                w2Var.setClickable(false);
                x2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((rg.x2) this.J0).getFocusedView());
                    u0(false);
                }
            } else if ((jVar3 instanceof rg.d2) && (ucVar2 = ((mb) this).A2.Z0) != null) {
                ucVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        rg.j jVar4 = this.J0;
        this.J0 = jVar;
        if ((jVar4 instanceof rg.x2) && TextUtils.isEmpty(((rg.x2) jVar4).getText())) {
            B0(jVar4);
        }
        rg.j jVar5 = this.J0;
        if (jVar4 != jVar5 && (jVar5 instanceof rg.d2) && (ucVar = ((mb) this).A2.Z0) != null) {
            ucVar.l(true);
        }
        rg.j jVar6 = this.J0;
        a4.l lVar = this.f7522e1;
        qg.q1 q1Var2 = this.A1;
        rg.y1 y1Var = this.f7520d1;
        if (jVar6 != null) {
            j6 j6Var = this.Q0;
            jVar6.m0 = j6Var;
            jVar6.l(j6Var, true);
            rg.j jVar7 = this.J0;
            if (jVar7 instanceof rg.x2) {
                rg.x2 x2Var3 = (rg.x2) jVar7;
                x2Var3.getSwatch().f43287c = q1Var2.f43287c;
                x2Var3.f44363z0 = false;
                E0(x2Var3.getSwatch());
                y1Var.setValueOverride(new s5(x2Var3, (int) (this.H0.f25809a / 9.0f), 0));
                y1Var.setShowPreview(false);
            } else {
                y1Var.setValueOverride(lVar);
                y1Var.setShowPreview(true);
                q1Var2.f43287c = lVar.get();
                D0(q1Var2, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f7516b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                H0(false);
            }
            Q0(0);
            y1Var.setValueOverride(lVar);
            y1Var.setShowPreview(true);
            q1Var2.f43287c = lVar.get();
            D0(q1Var2, null, false);
            z13 = z11;
        }
        T0();
        return z13;
    }

    @Override
    public final void D() {
        O0(true);
    }

    public final void D0(qg.q1 q1Var, Integer num, boolean z10) {
        qg.q1 q1Var2 = this.A1;
        if (q1Var2 != q1Var) {
            q1Var2.f43285a = q1Var.f43285a;
            q1Var2.f43286b = q1Var.f43286b;
            q1Var2.f43287c = q1Var.f43287c;
            int i10 = this.F1;
            qg.s0.e(i10).h(q1Var.f43285a, true);
            qg.s0.e(i10).j(q1Var.f43287c);
        }
        int i11 = q1Var.f43285a;
        e6 e6Var = this.O0;
        e6Var.setColor(i11);
        e6Var.setBrushSize(q1Var.f43287c);
        int i12 = q1Var2.f43285a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new v4(this, num, i12, 0));
            duration.start();
        } else {
            k6 k6Var = this.T0;
            if (k6Var != null) {
                k6Var.invalidate();
            }
        }
        rg.j jVar = this.J0;
        if (jVar instanceof rg.x2) {
            ((rg.x2) jVar).setSwatch(new qg.q1(q1Var.f43286b, q1Var.f43287c, q1Var.f43285a));
        } else if (z10 && (jVar instanceof rg.v0)) {
            ((rg.v0) jVar).setColor(q1Var.f43285a);
            ((rg.v0) this.J0).setType(3);
        } else if (z10 && (jVar instanceof rg.y2)) {
            ((rg.y2) jVar).setColor(q1Var.f43285a);
            ((rg.y2) this.J0).setType(3);
        } else if (z10 && (jVar instanceof rg.s0)) {
            ((rg.s0) jVar).setColor(q1Var.f43285a);
            ((rg.s0) this.J0).setType(0);
        }
    }

    public final void E0(qg.q1 q1Var) {
        D0(q1Var, null, false);
    }

    public final void G0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        rg.j jVar;
        ArrayList arrayList = this.Q1;
        if (arrayList != null) {
            k8 k8Var = this.P1;
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
                        b6 m0 = m0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            m0.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = m0.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i10 = i11;
                        jVar = m0;
                    } else if (b10 == 1) {
                        rg.x2 n02 = n0(z10);
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
                        qg.q1 swatch = n02.getSwatch();
                        swatch.f43285a = mediaEntity.color;
                        n02.setSwatch(swatch);
                        jVar = n02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            rg.z1 j02 = j0(mediaEntity.text, false);
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
                            ArrayList arrayList3 = k8Var.v;
                            boolean z11 = k8Var.K;
                            this.f7536l2 = true;
                            rg.j a6Var = new a6(this, getContext(), e0(), arrayList3, this.f7523e2, z11, this.f7525f2);
                            a6Var.setDelegate(this);
                            r13.addView(a6Var);
                            f0();
                            jVar = a6Var;
                            if (mediaEntity.viewWidth > 0) {
                                jVar = a6Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = a6Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    jVar = a6Var;
                                }
                            }
                        } else if (b10 == 3) {
                            rg.v0 i02 = i0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                i02.setColor(i14);
                            }
                            i02.setType(mediaEntity.subType);
                            jVar = i02;
                        } else if (b10 == 8) {
                            id idVar = mediaEntity.weather;
                            if (idVar != null) {
                                rg.y2 o02 = o0(idVar);
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
                            rg.s0 h02 = h0(mediaEntity.linkSettings);
                            rg.q0 q0Var = h02.f44296q0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                h02.setColor(i16);
                            }
                            boolean e = q0Var.e();
                            int i17 = q0Var.h;
                            int i18 = q0Var.f44247f;
                            if (e) {
                                q0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                h02.setType(3);
                                q0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(q0Var.f44240a0)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(q0Var.f44242b0)) + i17 + i17;
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
                            rg.c2 k02 = k0(false);
                            k02.s(ah.i1.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                k02.r(false);
                            }
                            jVar = k02;
                            if (mediaEntity.mediaArea.dark) {
                                k02.q(false);
                                jVar = k02;
                            }
                        } else {
                            if (b10 == 5 && k8Var.f7205o0 != null) {
                                rg.d2 l02 = l0(k8Var.f7207p0, false);
                                kc kcVar = ((mb) this).A2;
                                yb ybVar = kcVar.X0;
                                if (ybVar != null) {
                                    ybVar.f6624w = l02;
                                    i81 i81Var = ybVar.f6626x;
                                    if (i81Var != null) {
                                        i81Var.V(l02.f43992u0);
                                    }
                                }
                                ac acVar = kcVar.f7246c1;
                                if (acVar != null) {
                                    acVar.setHasRoundVideo(true);
                                }
                                jVar = l02;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !l02.f43989r0;
                                    l02.f43989r0 = z12;
                                    l02.f43990s0.f(z12, true);
                                    l02.invalidate();
                                    jVar = l02;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f16423x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f16424y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
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
        if (i10 > AndroidUtilities.dp(50.0f) && this.f7548r2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f7558w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f7558w2).commit();
            } else {
                this.f7556v2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f7556v2).commit();
            }
        }
        boolean z13 = this.f7546q2;
        r5 r5Var = this.O1;
        if (z13) {
            if (z10) {
                i11 = this.f7558w2;
            } else {
                i11 = this.f7556v2;
            }
            int paddingUnderContainer = this.M1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7544p2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f7544p2.setLayoutParams(layoutParams);
                this.f7552t2 = layoutParams.height;
                r5Var.a();
                requestLayout();
            }
        }
        if (this.f7560x2 == i10 && this.f7562y2 == z10) {
            return;
        }
        this.f7560x2 = i10;
        this.f7562y2 = z10;
        boolean z14 = this.f7548r2;
        rg.j jVar = this.J0;
        if (jVar instanceof rg.x2) {
            if (((rg.x2) jVar).getEditText().isFocused() && r5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f7548r2 = z12;
        } else {
            this.f7548r2 = false;
        }
        if (this.f7548r2 && this.f7546q2) {
            I0(0);
        }
        if (this.f7552t2 != 0 && !(z11 = this.f7548r2) && z11 != z14 && !this.f7546q2) {
            this.f7552t2 = 0;
            r5Var.a();
            requestLayout();
        }
        T0();
        if (z14 && !this.f7548r2 && this.f7552t2 > 0 && this.f7554u2) {
            this.f7554u2 = false;
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
            lVar.f16167i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16161u = lVar;
            if (!this.O1.c() && this.f7552t2 <= 0) {
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
                    o6 o6Var = o6.this;
                    k6 k6Var = o6Var.T0;
                    float f14 = f11 / 1000.0f;
                    o6Var.D1 = f14;
                    float f15 = 1.0f;
                    float f16 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f16);
                    view.setScaleY(f16);
                    view.setTranslationY((Math.min(o6Var.D1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(o6Var.D1, 0.25f) / 0.25f));
                    p5 p5Var = o6Var.f7557w1;
                    float f17 = o6Var.D1;
                    boolean z12 = z10;
                    p5Var.z1(f17, z12);
                    rg.l1 l1Var = o6Var.B0;
                    l1Var.setProgress(o6Var.D1);
                    rg.h1 h1Var = o6Var.A0;
                    h1Var.setProgress(o6Var.D1);
                    o6Var.W0.setTranslationY(AndroidUtilities.dp(32.0f) * o6Var.D1);
                    AnimatorSet animatorSet = o6Var.N1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f18 = o6Var.D1;
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
                        k6Var.setTranslationY(translationY - (dp * i10));
                    }
                    k6Var.invalidate();
                    if (view == o6Var.l1) {
                        o6Var.U0.invalidate();
                    }
                }
            });
            this.C1.a(new x4(this, z10, 0));
            this.C1.h();
            if (z10) {
                p5 p5Var = this.f7557w1;
                p5Var.setVisibility(0);
                p5Var.setSelectedColorIndex(qg.s0.e(this.F1).d());
            }
        }
    }

    public final void I0(int i10) {
        boolean z10;
        int i11;
        rg.q1 q1Var = this.l1;
        r5 r5Var = this.O1;
        if (i10 == 1) {
            wz wzVar = this.f7544p2;
            if (wzVar != null && wzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            wz wzVar2 = this.f7544p2;
            jc jcVar = this.M1;
            if (wzVar2 != null && wzVar2.f30707c1 != UserConfig.selectedAccount) {
                jcVar.removeView(wzVar2);
                this.f7544p2 = null;
            }
            if (this.f7544p2 == null) {
                wz wzVar3 = new wz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.f7544p2 = wzVar3;
                wzVar3.f30771w2 = false;
                wzVar3.U0 = true;
                wzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f7544p2.setForseMultiwindowLayout(true);
                }
                this.f7544p2.setDelegate(new d6(this));
                jcVar.addView(this.f7544p2);
            }
            this.f7544p2.setVisibility(0);
            this.f7546q2 = true;
            wz wzVar4 = this.f7544p2;
            if (this.f7556v2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f7556v2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f7556v2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f7558w2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f7558w2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f7558w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f7558w2;
            } else {
                i11 = this.f7556v2;
            }
            int paddingUnderContainer = jcVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            wzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                rg.j jVar = this.J0;
                if (jVar instanceof rg.x2) {
                    AndroidUtilities.hideKeyboard(((rg.x2) jVar).getEditText());
                }
            }
            this.f7552t2 = paddingUnderContainer;
            r5Var.a();
            requestLayout();
            bh emojiButton = q1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(zg.d, true);
            }
            if (!z10) {
                if (this.f7548r2) {
                    this.f7554u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f7552t2, 0.0f);
                    ofFloat.addUpdateListener(new y4(this, 1));
                    ofFloat.addListener(new u5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f20254w);
                    ofFloat.start();
                }
            }
        } else {
            bh emojiButton2 = q1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(zg.e, true);
            }
            wz wzVar5 = this.f7544p2;
            if (wzVar5 != null) {
                this.f7546q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    wzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f7552t2 = 0;
                r5Var.a();
            }
            requestLayout();
        }
        R0();
    }

    public final void J0(rg.s0 s0Var) {
        t8 t8Var = new t8(getContext(), this.G1, this.f7527g2, new bi.v2(4, this, s0Var));
        if (s0Var != null) {
            rg.p0 p0Var = s0Var.f44300u0;
            t8Var.f7843c0 = true;
            org.telegram.ui.Cells.j3 j3Var = t8Var.Z;
            org.telegram.ui.Cells.j3 j3Var2 = t8Var.Y;
            if (p0Var != null) {
                t8Var.f7847g0 = p0Var.d;
                t8Var.f7848h0 = false;
                j3Var2.setText(p0Var.f44206c);
                j3Var.setText(p0Var.f44205b);
                t8Var.m0 = !TextUtils.isEmpty(p0Var.f44205b);
                t8Var.f7853n0 = p0Var.f44207f;
                t8Var.f7854o0 = p0Var.e;
            } else {
                j3Var2.setText("");
                j3Var.setText("");
                t8Var.f7853n0 = true;
                t8Var.f7854o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = t8Var.f7842b0;
            dVar.g(string, false, true);
            p8 p8Var = t8Var.X;
            if (p8Var != null) {
                p8Var.N(false);
            }
            dVar.setEnabled(t8Var.W(j3Var2.getText().toString()));
            t8Var.f7843c0 = false;
        }
        t8Var.setOnDismissListener(new k5(this, 1));
        t8Var.show();
        y0(true);
    }

    public final void K0(rg.v0 v0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        vi viVar = new vi(getContext(), new y5(this, callback2), false, true, false, this.G1);
        viVar.f29664c2 = new Object();
        xh xhVar = viVar.A1;
        if (v0Var != null && (messageMedia = v0Var.f44338u0) != null && (geoPoint = messageMedia.geo) != null) {
            viVar.A2 = new double[]{geoPoint.lat, geoPoint._long};
            viVar.O = true;
            xhVar.setVisibility(8);
        } else if (this.U1) {
            viVar.f29735y2 = this.W1;
            viVar.f29738z2 = this.V1;
            viVar.O = true;
            xhVar.setVisibility(8);
        } else {
            viVar.O = true;
            xhVar.setVisibility(8);
        }
        viVar.setOnDismissListener(new k5(this, 0));
        viVar.t1();
        viVar.show();
    }

    public final void L0(rg.j jVar) {
        if (jVar instanceof rg.g1) {
            org.telegram.ui.ActionBar.m1 m1Var = this.H1;
            if (m1Var != null && m1Var.isShowing()) {
                this.H1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f7542o2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        i6 i6Var = this.R0;
        float scaleX2 = i6Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = i6Var.getScaleY() * scaleY * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        M0(new d5(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void M0(Runnable runnable, o6 o6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.m1 m1Var = this.H1;
        if (m1Var != null && m1Var.isShowing()) {
            this.H1.d(true);
            return;
        }
        if (this.I1 == null) {
            this.J1 = new Rect();
            m6 m6Var = new m6(this, getContext());
            this.I1 = m6Var;
            m6Var.setAnimationEnabled(true);
            this.I1.setOnTouchListener(new f5(this, 0));
            this.I1.setDispatchKeyEventListener(new g5(this));
            this.I1.setShownFromBottom(true);
        }
        m6 m6Var2 = this.I1;
        m6Var2.W = z10;
        m6Var2.d();
        runnable.run();
        if (this.H1 == null) {
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(this.I1, -2, -2);
            this.H1 = m1Var2;
            m1Var2.f20220b = true;
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
        this.H1.showAtLocation(o6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.m1.i(this.I1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            m6 m6Var3 = this.I1;
            m6Var3.setBackgroundDrawable(new org.telegram.ui.Components.oa(new org.telegram.ui.Components.pa(this.f7523e2, m6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.I1.setBackgroundDrawable(mutate);
        this.I1.setBackgroundColor(-14145495);
    }

    public final void N0(boolean z10) {
        if (this.f7519c2 != z10) {
            if (z10 || this.Z1 != null) {
                this.f7519c2 = z10;
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
                    this.f7521d2 = true;
                    this.M1.invalidate();
                    float f10 = this.f7517b2;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.Z1.setTransitionProgress(this.f7517b2);
                    ofFloat.addUpdateListener(new y4(this, 2));
                    ofFloat.addListener(new ah.p0(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(es.f24466g);
                    ofFloat.start();
                    return;
                }
                if (this.Z1.getReactionsWindow() != null) {
                    this.Z1.getReactionsWindow().e();
                }
                this.Z1.animate().alpha(0.0f).setDuration(150L).setListener(new u5(this, 0)).start();
            }
        }
    }

    public final void O0(boolean z10) {
        float f7;
        if (this.f7553u1 != z10) {
            this.f7553u1 = z10;
            o1.k kVar = this.f7555v1;
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
            this.f7555v1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f16167i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16161u = lVar;
            if (z10) {
                rg.v1 v1Var = this.f7537m1;
                v1Var.setAlpha(0.0f);
                v1Var.setVisibility(0);
            }
            this.f7555v1.b(new bi.aa(1, this));
            this.f7555v1.a(new x4(this, z10, 1));
            this.f7555v1.h();
        }
    }

    public final PointF P0(rg.j jVar) {
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
                i6 i6Var = this.R0;
                if (i11 >= i6Var.getChildCount()) {
                    break;
                }
                View childAt = i6Var.getChildAt(i11);
                if (!(childAt instanceof rg.j) || (childAt instanceof rg.g1)) {
                    f7 = f12;
                    f10 = f13;
                } else {
                    PointF position2 = ((rg.j) childAt).getPosition();
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
            ValueAnimator valueAnimator = this.f7516b1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.Y0;
            ViewGroup viewGroup3 = this.l1;
            ViewGroup viewGroup4 = this.f7534k1;
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
            qg.s0 e = qg.s0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f43315l != z10) {
                e.f43315l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f43307a.getInt("brush", 0), false);
                }
            }
            int c10 = qg.s0.e(i12).c();
            qg.q1 q1Var = this.A1;
            q1Var.f43285a = c10;
            D0(q1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f7516b1 = duration;
            duration.setInterpolator(es.f24465f);
            this.f7516b1.addUpdateListener(new bi.l4(this, viewGroup, viewGroup2, 1));
            this.f7516b1.addListener(new w5(this, viewGroup, viewGroup2, i10, 0));
            this.f7516b1.start();
        }
    }

    @Override
    public final int R() {
        return this.O1.f7003l - this.M1.getBottomPadding2();
    }

    public final void R0() {
        boolean z10;
        r5 r5Var = this.O1;
        rg.q1 q1Var = this.l1;
        if (q1Var != null) {
            if (r5Var.c()) {
                q1Var.a(R.drawable.input_smile);
            } else if (this.f7546q2) {
                q1Var.a(R.drawable.input_keyboard);
            } else {
                q1Var.a(R.drawable.msg_add);
            }
        }
        if (!r5Var.c() && !this.f7546q2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        boolean z12 = !z11;
        AndroidUtilities.updateViewShow(this.f7541o1, z12, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f7539n1, z12, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f7545q1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f7543p1, z11, false, 1.0f, true, null);
    }

    public final void S0() {
        float f7;
        rg.j jVar;
        ObjectAnimator objectAnimator = this.f7531i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        r5 r5Var = this.O1;
        if (((r5Var.c() && !r5Var.d) || this.f7552t2 > 0) && (jVar = this.J0) != null) {
            f7 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.f7531i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f7531i2.setInterpolator(es.h);
        this.f7531i2.start();
    }

    public final void T0() {
        throw new UnsupportedOperationException("Method not decompiled: di.o6.T0():void");
    }

    @Override
    public final void a() {
        H0(true);
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
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new bi.u8(28, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7538m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
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
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i10 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public final void e(int i10) {
        rg.j jVar = this.J0;
        if (jVar instanceof rg.x2) {
            F0((rg.x2) jVar, i10);
            qg.s0 e = qg.s0.e(this.F1);
            e.f43311g = i10;
            e.f43307a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final PointF e0() {
        i6 i6Var = this.R0;
        int measuredWidth = i6Var.getMeasuredWidth();
        int measuredHeight = i6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.S1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public final void f0() {
        org.telegram.ui.Components.b6[] b6VarArr;
        boolean z10 = this.W1;
        i6 i6Var = this.R0;
        boolean z11 = true;
        if (!z10 && !this.Y1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < i6Var.getChildCount()) {
                    View childAt = i6Var.getChildAt(i10);
                    boolean z12 = childAt instanceof rg.x2;
                    int i11 = this.F1;
                    if (z12) {
                        CharSequence text = ((rg.x2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.b6 b6Var : (org.telegram.ui.Components.b6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.b6.class)) {
                                TLRPC.Document document = b6Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.s5.f(i11, b6Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.s5.h(i11).e(document);
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
                    } else if (childAt instanceof rg.q2) {
                        TLRPC.Document sticker = ((rg.q2) childAt).getSticker();
                        if (k8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
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
        for (int i12 = 0; i12 < i6Var.getChildCount(); i12++) {
            View childAt2 = i6Var.getChildAt(i12);
            if (childAt2 instanceof rg.j) {
                ((rg.j) childAt2).setIsVideo(z11);
            }
        }
    }

    public final TextView g0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, this.G1));
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
        return this.f7526g1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.b6[] b6VarArr;
        i6 i6Var = this.R0;
        int childCount = i6Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = i6Var.getChildAt(i10);
            if (childAt instanceof rg.q2) {
                TLRPC.Document sticker = ((rg.q2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f18928id = sticker.f18922id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof rg.x2) {
                CharSequence text = ((rg.x2) childAt).getText();
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
                                tL_inputDocument2.f18928id = document.f18922id;
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

    public rg.j getSelectedEntity() {
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
        return this.f7520d1;
    }

    @Override
    public final void h(rg.j jVar) {
        N0(false);
        L0(jVar);
    }

    public final rg.s0 h0(rg.p0 p0Var) {
        int measuredWidth;
        int i10;
        this.f7536l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        i6 i6Var = this.R0;
        if (i6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = i6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.s0 s0Var = new rg.s0(getContext(), P0, this.F1, p0Var, f7 / 360.0f, dp);
        if (P0.x == i6Var.getMeasuredWidth() / 2.0f) {
            s0Var.setStickyX(2);
        }
        if (P0.y == i6Var.getMeasuredHeight() / 2.0f) {
            s0Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.f43285a) != -47814) {
            s0Var.setColor(i10);
        }
        s0Var.setDelegate(this);
        s0Var.setMaxWidth(dp);
        i6Var.addView(s0Var, w7.z5.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            s0Var.j(1.0f / cropState.cropScale);
            s0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return s0Var;
    }

    public final rg.v0 i0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f7536l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        i6 i6Var = this.R0;
        if (i6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = i6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.v0 v0Var = new rg.v0(getContext(), P0, this.F1, messageMedia, mediaArea, f7 / 240.0f, dp);
        if (P0.x == i6Var.getMeasuredWidth() / 2.0f) {
            v0Var.setStickyX(2);
        }
        if (P0.y == i6Var.getMeasuredHeight() / 2.0f) {
            v0Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.f43285a) != -47814) {
            v0Var.setColor(i10);
        }
        v0Var.setDelegate(this);
        v0Var.setMaxWidth(dp);
        i6Var.addView(v0Var, w7.z5.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            v0Var.j(1.0f / cropState.cropScale);
            v0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return v0Var;
    }

    public final rg.z1 j0(String str, boolean z10) {
        float f7;
        iw0 iw0Var;
        this.f7536l2 = true;
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
        i6 i6Var = this.R0;
        if (i10 > 0) {
            float floor = (float) Math.floor(Math.max(this.R1, i6Var.getMeasuredWidth()) * 0.5d);
            iw0Var = new iw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, i6Var.getMeasuredHeight()) * 0.5d);
            iw0Var = new iw0(f7 * floor2, floor2);
        }
        iw0 iw0Var2 = iw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = iw0Var2.f25809a;
            iw0Var2.f25809a = iw0Var2.f25810b;
            iw0Var2.f25810b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        rg.z1 z1Var = new rg.z1(context, e02, iw0Var2, str, intValue);
        z1Var.setDelegate(this);
        i6Var.addView(z1Var);
        f0();
        return z1Var;
    }

    public final rg.c2 k0(boolean z10) {
        String str;
        iw0 iw0Var = new iw0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        i6 i6Var = this.R0;
        if (i6Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < i6Var.getChildCount(); i10++) {
                    View childAt = i6Var.getChildAt(i10);
                    if (v7.f7.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (i6Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (i6Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, i6Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, i6Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new rg.j(getContext(), e02);
        jVar.f43975r0 = new bi.ya(jVar);
        jVar.f43976s0 = new bi.ya(jVar);
        jVar.f43977t0 = new ah.y0(jVar);
        jVar.f43978u0 = new ah.y0(jVar);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6((View) jVar);
        jVar.f43980w0 = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6((View) jVar);
        jVar.f43981x0 = g6Var2;
        jVar.f43983z0 = 1.0f;
        jVar.f43974q0 = iw0Var;
        g6Var2.d(1.0f, true);
        g6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        ah.y0 y0Var = jVar.f43977t0;
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
        ah.i1 b10 = ah.i1.b(str);
        jVar.f43979v0 = b10;
        y0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        i6Var.addView(jVar);
        f0();
        if (z10) {
            A0(jVar);
            C0(jVar, true);
        }
        return jVar;
    }

    @Override
    public final boolean l(MotionEvent motionEvent) {
        if (this.f7538m2) {
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

    public final rg.d2 l0(String str, boolean z10) {
        float f7;
        this.f7536l2 = true;
        this.f7540n2 = true;
        p0();
        i6 i6Var = this.R0;
        int measuredWidth = i6Var.getMeasuredWidth();
        i6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        iw0 iw0Var = new iw0(floor, floor);
        rg.d2 d2Var = new rg.d2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (iw0Var.f25810b / 2.0f) + AndroidUtilities.dp(72.0f)), iw0Var, str);
        d2Var.setDelegate(this);
        i6Var.addView(d2Var);
        f0();
        if (z10) {
            A0(d2Var);
            post(new t4(this, d2Var, 0));
        }
        this.f7540n2 = false;
        return d2Var;
    }

    public final b6 m0(Object obj, TLRPC.Document document) {
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
        n6 n6Var = new n6(e0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f25809a * 0.5d);
        b6 b6Var = new b6(this, context, n6Var.f7459a, n6Var.f7461c, n6Var.f7460b, new iw0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = b6Var.f44282x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        b6Var.setDelegate(this);
        this.R0.addView(b6Var);
        f0();
        return b6Var;
    }

    public final rg.x2 n0(boolean z10) {
        iw0 paintingSize = getPaintingSize();
        PointF P0 = P0(null);
        rg.x2 x2Var = new rg.x2(getContext(), P0, (int) (paintingSize.f25809a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.f25809a / 9.0f;
        e5 e5Var = new e5(this, 0);
        x2Var.f44360w0 = (int) (0.5f * f7);
        x2Var.f44361x0 = (int) (f7 * 2.0f);
        x2Var.f44362y0 = e5Var;
        float f10 = P0.x;
        i6 i6Var = this.R0;
        if (f10 == i6Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (P0.y == i6Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        x2Var.setTypeface(qg.s0.e(i10).f43313j);
        x2Var.setType(qg.s0.e(i10).h);
        i6Var.addView(x2Var, w7.z5.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            x2Var.j(1.0f / cropState.cropScale);
            x2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            A0(x2Var);
            x2Var.q();
            C0(x2Var, false);
            x2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(x2Var.getFocusedView());
            this.K0 = true;
            int i11 = qg.s0.e(i10).f43311g;
            rg.q1 q1Var = this.l1;
            q1Var.d(i11, true);
            q1Var.setOutlineType(qg.s0.e(i10).h);
        }
        return x2Var;
    }

    @Override
    public final void o(qg.m mVar) {
        boolean z10 = mVar instanceof qg.b;
        rg.y1 y1Var = this.f7520d1;
        if (!z10 && !(mVar instanceof qg.d)) {
            y1Var.b(0.05f, 1.0f);
        } else {
            y1Var.b(0.4f, 1.75f);
        }
        y1Var.setDrawCenter(!(mVar instanceof qg.l));
        e6 e6Var = this.O0;
        if (e6Var.getCurrentBrush() instanceof qg.l) {
            this.f7518c1 = true;
        }
        e6Var.setBrush(mVar);
        qg.q1 q1Var = this.A1;
        int i10 = q1Var.f43285a;
        q1Var.f43285a = qg.s0.e(this.F1).c();
        q1Var.f43287c = this.f7522e1.get();
        D0(q1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    public final rg.y2 o0(id idVar) {
        int measuredWidth;
        int i10;
        this.f7536l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        i6 i6Var = this.R0;
        if (i6Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = i6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.y2 y2Var = new rg.y2(getContext(), P0, this.F1, idVar, f7 / 240.0f, dp);
        if (P0.x == i6Var.getMeasuredWidth() / 2.0f) {
            y2Var.setStickyX(2);
        }
        if (P0.y == i6Var.getMeasuredHeight() / 2.0f) {
            y2Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.f43285a) != -47814) {
            y2Var.setColor(i10);
        }
        y2Var.setDelegate(this);
        y2Var.setMaxWidth(dp);
        i6Var.addView(y2Var, w7.z5.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            y2Var.j(1.0f / cropState.cropScale);
            y2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return y2Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        gl0 gl0Var = this.Z1;
        if (gl0Var != null) {
            AndroidUtilities.removeFromParent(gl0Var);
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
        float f11 = this.H0.f25809a;
        rg.j jVar = this.J0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.T0, i10, i11);
        measureChild(this.f7520d1, i10, i11);
        measureChild(this.V0, i10, i11);
        measureChild(this.U0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f7552t2 - this.M1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.S0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.G0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f7546q2 && !this.f7550s2) {
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
            i6 i6Var = this.R0;
            if (i10 < i6Var.getChildCount()) {
                View childAt = i6Var.getChildAt(i10);
                if (childAt instanceof rg.d2) {
                    if (this.J0 == childAt) {
                        C0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(es.h).withEndAction(new t4(this, (rg.d2) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean q() {
        return !(this.J0 instanceof rg.g1);
    }

    public abstract void q0();

    @Override
    public final boolean r() {
        return !this.K0;
    }

    public final rg.g1 r0() {
        int i10 = 0;
        while (true) {
            i6 i6Var = this.R0;
            if (i10 < i6Var.getChildCount()) {
                View childAt = i6Var.getChildAt(i10);
                if (childAt instanceof rg.g1) {
                    return (rg.g1) childAt;
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

    public final android.graphics.Bitmap s0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, di.k8 r46) {
        throw new UnsupportedOperationException("Method not decompiled: di.o6.s0(java.util.ArrayList, boolean, boolean, boolean, boolean, di.k8):android.graphics.Bitmap");
    }

    public void setBlurManager(org.telegram.ui.Components.la laVar) {
        this.f7523e2 = laVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f7538m2 != z10) {
            this.f7538m2 = z10;
            if (z10) {
                C0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            i6 i6Var = this.R0;
            if (i10 < i6Var.getChildCount()) {
                View childAt = i6Var.getChildAt(i10);
                if (childAt instanceof rg.q2) {
                    ImageReceiver imageReceiver = ((rg.q2) childAt).f44282x0;
                    yj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        if (!this.f7548r2 && !this.f7546q2) {
            this.f7536l2 = true;
            n0(true);
            return;
        }
        if (this.f7546q2) {
            rg.j jVar = this.J0;
            if (jVar instanceof rg.x2) {
                this.O1.e = true;
                AndroidUtilities.showKeyboard(((rg.x2) jVar).getEditText());
            }
        }
        I0(!this.f7546q2 ? 1 : 0);
    }

    public final boolean t0() {
        if (!this.D0.a() && !this.f7536l2) {
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
        if (this.f7546q2) {
            I0(0);
        }
        if (z10) {
            wz wzVar = this.f7544p2;
            if (wzVar != null && wzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f7544p2.getMeasuredHeight());
                ofFloat.addUpdateListener(new y4(this, 0));
                this.f7550s2 = true;
                ofFloat.addListener(new u5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f20254w);
                ofFloat.start();
                return;
            }
            v0();
        }
    }

    @Override
    public final boolean v(rg.j jVar) {
        return C0(jVar, true);
    }

    public final void v0() {
        wz wzVar;
        if (!this.f7546q2 && (wzVar = this.f7544p2) != null && wzVar.getVisibility() != 8) {
            this.f7544p2.setVisibility(8);
        }
        int i10 = this.f7552t2;
        this.f7552t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    @Override
    public final int[] w(rg.j jVar) {
        int[] iArr = this.f7542o2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    @Override
    public final qg.s0 x() {
        return qg.s0.e(this.F1);
    }

    public final boolean x0() {
        if (this.f7519c2) {
            if (this.Z1.getReactionsWindow() != null && !this.Z1.getReactionsWindow().f881q) {
                this.Z1.e();
                return true;
            }
            N0(false);
            return true;
        } else if (this.B1) {
            H0(false);
            return true;
        } else if (this.f7546q2) {
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

    public abstract void y0(boolean z10);

    public final void z0() {
        final int i10 = this.Y0;
        Q0(1);
        postDelayed(new ah.j(this, 9), 350L);
        x5 x5Var = new x5(this, getContext(), this.G1, i10);
        this.f7535k2 = x5Var;
        jc jcVar = this.M1;
        Objects.requireNonNull(jcVar);
        x5Var.f7697w = new ci.u(jcVar, 6);
        final boolean[] zArr = {true};
        x5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                o6 o6Var = o6.this;
                o6Var.f7535k2 = null;
                if (zArr[0]) {
                    o6Var.y0(false);
                }
                o6Var.Q0(i10);
            }
        });
        x5Var.f7699y = new g5(this);
        x5Var.r0(new n5(this, zArr, x5Var, 0));
        x5Var.show();
        y0(true);
    }

    public void setOffsetTranslationX(float f7) {
    }

    public View getView() {
        return this;
    }
}
