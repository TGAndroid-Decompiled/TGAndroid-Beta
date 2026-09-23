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
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
public abstract class q6 extends qv0 implements qg.t1, qg.h, qg.p1, ov0, hc {
    public final qg.i1 A0;
    public final pg.r1 A1;
    public final qg.m1 B0;
    public boolean B1;
    public final Bitmap C0;
    public o1.k C1;
    public final pg.u1 D0;
    public float D1;
    public final DispatchQueue E0;
    public final Paint E1;
    public final MediaController.CropState F0;
    public final int F1;
    public boolean G0;
    public final d6 G1;
    public jv0 H0;
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
    public final kc M1;
    public final boolean N0;
    public AnimatorSet N1;
    public final f6 O0;
    public final s5 O1;
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
    public gk0 Z1;
    public float f5331a1;
    public qg.d2 a2;
    public ValueAnimator f5332b1;
    public float f5333b2;
    public boolean f5334c1;
    public boolean f5335c2;
    public final qg.z1 f5336d1;
    public boolean f5337d2;
    public final xa.c f5338e1;
    public org.telegram.ui.Components.ja f5339e2;
    public final int f5340f1;
    public final a7 f5341f2;
    public BigInteger f5342g1;
    public final b7 f5343g2;
    public TextView f5344h1;
    public boolean f5345h2;
    public TextView f5346i1;
    public ObjectAnimator f5347i2;
    public TextView f5348j1;
    public final float[] f5349j2;
    public final qg.u1 f5350k1;
    public y5 f5351k2;
    public final qg.r1 l1;
    public boolean f5352l2;
    public final qg.w1 f5353m1;
    public boolean f5354m2;
    public final ImageView f5355n1;
    public boolean f5356n2;
    public final TextView f5357o1;
    public final int[] f5358o2;
    public final TextView f5359p1;
    public lz f5360p2;
    public final TextView f5361q1;
    public boolean f5362q2;
    public final Paint f5363r1;
    public boolean f5364r2;
    public final Paint f5365s1;
    public boolean f5366s2;
    public float f5367t1;
    public int f5368t2;
    public boolean f5369u1;
    public boolean f5370u2;
    public o1.k f5371v1;
    public int f5372v2;
    public final q5 f5373w1;
    public int f5374w2;
    public final Paint f5375x1;
    public int f5376x2;
    public final Paint f5377y1;
    public boolean f5378y2;
    public final Paint f5379z1;

    public q6(Context context, boolean z10, File file, boolean z11, boolean z12, kc kcVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, l8 l8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ja jaVar, org.telegram.ui.ActionBar.d6 d6Var, a7 a7Var, b7 b7Var) {
        super(context, activity);
        f6 f6Var;
        pg.r1 r1Var;
        org.telegram.ui.Components.ja jaVar2;
        pg.t0 t0Var;
        DispatchQueue dispatchQueue;
        Bitmap bitmap3;
        Paint paint;
        Paint paint2;
        f6 f6Var2;
        int i14;
        this.Y0 = 0;
        this.Z0 = -1;
        final nb nbVar = (nb) this;
        xa.c cVar = new xa.c(nbVar, 10);
        this.f5338e1 = cVar;
        Paint paint3 = new Paint(1);
        this.f5363r1 = paint3;
        Paint paint4 = new Paint(1);
        this.f5365s1 = paint4;
        this.f5375x1 = new Paint(1);
        this.f5377y1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f5379z1 = paint5;
        pg.r1 r1Var2 = new pg.r1(1.0f, 0.016773745f, -1);
        this.A1 = r1Var2;
        this.E1 = new Paint(1);
        this.f5349j2 = new float[2];
        this.f5354m2 = false;
        this.f5358o2 = new int[2];
        new ai.q4(nbVar, 12);
        setDelegate(this);
        this.f5339e2 = jaVar;
        this.f5341f2 = a7Var;
        this.U1 = z10;
        this.V1 = file;
        this.W1 = z11;
        this.X1 = z12;
        this.M1 = kcVar;
        this.R1 = i12;
        this.S1 = i13;
        this.f5343g2 = b7Var;
        this.F1 = i10;
        d6 d6Var2 = new d6(d6Var);
        this.G1 = d6Var2;
        this.F0 = cropState;
        this.N0 = context instanceof BubbleActivity;
        pg.t0 e = pg.t0.e(i10);
        e.i(0, true);
        r1Var2.f40927a = e.c();
        r1Var2.f40929c = e.f40957i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.E0 = dispatchQueue2;
        this.C0 = bitmap;
        this.f5340f1 = i11;
        pg.u1 u1Var = new pg.u1();
        this.D0 = u1Var;
        u1Var.f40966a = new a1.c(nbVar, 18);
        View view = new View(context);
        this.X0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        pg.r0 r0Var = new pg.r0(getPaintingSize(), null, i11, jaVar);
        if (l8Var == null || !l8Var.f5005u) {
            r1Var = r1Var2;
            jaVar2 = jaVar;
            t0Var = e;
            dispatchQueue = dispatchQueue2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            f6Var2 = f6Var;
        } else {
            r1Var = r1Var2;
            jaVar2 = null;
            t0Var = e;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            f6Var2 = f6Var;
            dispatchQueue = dispatchQueue2;
        }
        f6Var2 = new f6(nbVar, context, r0Var, bitmap3, bitmap2, jaVar2);
        this.O0 = f6Var2;
        f6Var2.setDelegate(new g6(nbVar));
        f6Var2.setUndoStore(u1Var);
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
            H0();
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
        this.f5355n1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        nb nbVar2 = nbVar;
                        f6 f6Var3 = nbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            nbVar2.f5350k1.setSelectedIndex(1);
                            nbVar2.b((pg.m) pg.m.f40862a.get(0));
                            return;
                        }
                        nbVar2.D0.c();
                        return;
                    case 1:
                        nb nbVar3 = nbVar;
                        f6 f6Var4 = nbVar3.O0;
                        pg.u1 u1Var2 = nbVar3.D0;
                        if (u1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                nbVar3.f5350k1.setSelectedIndex(1);
                                nbVar3.b((pg.m) pg.m.f40862a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            u1Var2.f40968c.clear();
                            u1Var2.f40967b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(u1Var2, 12));
                            nbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nb nbVar4 = nbVar;
                        qg.j jVar = nbVar4.J0;
                        if (jVar instanceof qg.x2) {
                            AndroidUtilities.hideKeyboard(((qg.x2) jVar).getFocusedView());
                        }
                        if (nbVar4.f5362q2) {
                            nbVar4.v0(false);
                        }
                        nbVar4.C0(nbVar4.J0);
                        nbVar4.D0(null, true);
                        return;
                    case 3:
                        nbVar.D0(null, true);
                        return;
                    default:
                        nb nbVar5 = nbVar;
                        if (nbVar5.B1) {
                            nbVar5.I0(false);
                            return;
                        } else if (nbVar5.f5362q2) {
                            nbVar5.v0(true);
                            return;
                        } else if (nbVar5.K0) {
                            nbVar5.D0(null, true);
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
        frameLayout.addView(imageView, w7.x5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        ul.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, w7.x5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.x5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ai.e2(2));
        frameLayout.addView(linearLayout, w7.x5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f5357o1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.f0(822083583, 7, -1));
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
                            nbVar2.f5350k1.setSelectedIndex(1);
                            nbVar2.b((pg.m) pg.m.f40862a.get(0));
                            return;
                        }
                        nbVar2.D0.c();
                        return;
                    case 1:
                        nb nbVar3 = nbVar;
                        f6 f6Var4 = nbVar3.O0;
                        pg.u1 u1Var2 = nbVar3.D0;
                        if (u1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                nbVar3.f5350k1.setSelectedIndex(1);
                                nbVar3.b((pg.m) pg.m.f40862a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            u1Var2.f40968c.clear();
                            u1Var2.f40967b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(u1Var2, 12));
                            nbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nb nbVar4 = nbVar;
                        qg.j jVar = nbVar4.J0;
                        if (jVar instanceof qg.x2) {
                            AndroidUtilities.hideKeyboard(((qg.x2) jVar).getFocusedView());
                        }
                        if (nbVar4.f5362q2) {
                            nbVar4.v0(false);
                        }
                        nbVar4.C0(nbVar4.J0);
                        nbVar4.D0(null, true);
                        return;
                    case 3:
                        nbVar.D0(null, true);
                        return;
                    default:
                        nb nbVar5 = nbVar;
                        if (nbVar5.B1) {
                            nbVar5.I0(false);
                            return;
                        } else if (nbVar5.f5362q2) {
                            nbVar5.v0(true);
                            return;
                        } else if (nbVar5.K0) {
                            nbVar5.D0(null, true);
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
        TextView f7 = org.telegram.ui.Cells.q3.f(frameLayout, textView2, w7.x5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f5359p1 = f7;
        f7.setBackground(org.telegram.ui.ActionBar.h6.f0(822083583, 7, -1));
        f7.setPadding(org.telegram.ui.Cells.q3.b(8.0f, R.string.Clear, f7), 0, AndroidUtilities.dp(8.0f), 0);
        f7.setGravity(16);
        f7.setTextColor(-1);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setTextSize(1, 16.0f);
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        nb nbVar2 = nbVar;
                        f6 f6Var3 = nbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            nbVar2.f5350k1.setSelectedIndex(1);
                            nbVar2.b((pg.m) pg.m.f40862a.get(0));
                            return;
                        }
                        nbVar2.D0.c();
                        return;
                    case 1:
                        nb nbVar3 = nbVar;
                        f6 f6Var4 = nbVar3.O0;
                        pg.u1 u1Var2 = nbVar3.D0;
                        if (u1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                nbVar3.f5350k1.setSelectedIndex(1);
                                nbVar3.b((pg.m) pg.m.f40862a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            u1Var2.f40968c.clear();
                            u1Var2.f40967b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(u1Var2, 12));
                            nbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nb nbVar4 = nbVar;
                        qg.j jVar = nbVar4.J0;
                        if (jVar instanceof qg.x2) {
                            AndroidUtilities.hideKeyboard(((qg.x2) jVar).getFocusedView());
                        }
                        if (nbVar4.f5362q2) {
                            nbVar4.v0(false);
                        }
                        nbVar4.C0(nbVar4.J0);
                        nbVar4.D0(null, true);
                        return;
                    case 3:
                        nbVar.D0(null, true);
                        return;
                    default:
                        nb nbVar5 = nbVar;
                        if (nbVar5.B1) {
                            nbVar5.I0(false);
                            return;
                        } else if (nbVar5.f5362q2) {
                            nbVar5.v0(true);
                            return;
                        } else if (nbVar5.K0) {
                            nbVar5.D0(null, true);
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
        f7.setAlpha(0.0f);
        f7.setVisibility(8);
        TextView f10 = org.telegram.ui.Cells.q3.f(frameLayout, f7, w7.x5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f5361q1 = f10;
        f10.setBackground(org.telegram.ui.ActionBar.h6.f0(822083583, 7, -1));
        f10.setPadding(org.telegram.ui.Cells.q3.b(8.0f, R.string.Done, f10), 0, AndroidUtilities.dp(8.0f), 0);
        f10.setGravity(16);
        f10.setTextColor(-1);
        f10.setTypeface(AndroidUtilities.bold());
        f10.setTextSize(1, 16.0f);
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        nb nbVar2 = nbVar;
                        f6 f6Var3 = nbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            nbVar2.f5350k1.setSelectedIndex(1);
                            nbVar2.b((pg.m) pg.m.f40862a.get(0));
                            return;
                        }
                        nbVar2.D0.c();
                        return;
                    case 1:
                        nb nbVar3 = nbVar;
                        f6 f6Var4 = nbVar3.O0;
                        pg.u1 u1Var2 = nbVar3.D0;
                        if (u1Var2.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                nbVar3.f5350k1.setSelectedIndex(1);
                                nbVar3.b((pg.m) pg.m.f40862a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            u1Var2.f40968c.clear();
                            u1Var2.f40967b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(u1Var2, 12));
                            nbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nb nbVar4 = nbVar;
                        qg.j jVar = nbVar4.J0;
                        if (jVar instanceof qg.x2) {
                            AndroidUtilities.hideKeyboard(((qg.x2) jVar).getFocusedView());
                        }
                        if (nbVar4.f5362q2) {
                            nbVar4.v0(false);
                        }
                        nbVar4.C0(nbVar4.J0);
                        nbVar4.D0(null, true);
                        return;
                    case 3:
                        nbVar.D0(null, true);
                        return;
                    default:
                        nb nbVar5 = nbVar;
                        if (nbVar5.B1) {
                            nbVar5.I0(false);
                            return;
                        } else if (nbVar5.f5362q2) {
                            nbVar5.v0(true);
                            return;
                        } else if (nbVar5.K0) {
                            nbVar5.D0(null, true);
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
        f10.setAlpha(0.0f);
        f10.setVisibility(8);
        frameLayout.addView(f10, w7.x5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        pg.t0 t0Var2 = t0Var;
        l6 l6Var = new l6(nbVar, context, t0Var2);
        this.T0 = l6Var;
        l6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        l6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(l6Var, w7.x5.e(-1, 104, 80));
        qg.u1 u1Var2 = new qg.u1(context, (l8Var == null || l8Var.v() || l8Var.f5005u || jaVar == null) ? false : true);
        this.f5350k1 = u1Var2;
        u1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        u1Var2.setDelegate(this);
        u1Var2.setSelectedIndex(1);
        l6Var.addView(u1Var2, w7.x5.c(48.0f, -1));
        qg.r1 r1Var3 = new qg.r1(context);
        this.l1 = r1Var3;
        r1Var3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        r1Var3.setVisibility(8);
        r1Var3.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        nb nbVar2 = nbVar;
                        pg.r1 r1Var4 = nbVar2.A1;
                        nbVar2.F0(r1Var4);
                        pg.t0.e(i10).j(r1Var4.f40929c);
                        return;
                    default:
                        nbVar.l1.setTypeface(pg.t0.e(i10).f40958j);
                        return;
                }
            }
        });
        r1Var3.setAlignment(pg.t0.e(i10).f40956g);
        l6Var.addView(r1Var3, w7.x5.c(48.0f, -1));
        p5 p5Var = new p5(nbVar, context);
        this.U0 = p5Var;
        addView(p5Var, w7.x5.c(-1.0f, -1));
        qg.w1 w1Var = new qg.w1(context);
        this.f5353m1 = w1Var;
        w1Var.setVisibility(8);
        w1Var.setOnItemClickListener(new ai.g(nbVar, 5));
        r1Var3.setTypefaceListView(w1Var);
        p5Var.addView(w1Var, w7.x5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint2.setColor(d6Var2.G0(org.telegram.ui.ActionBar.h6.G8));
        q5 q5Var = new q5(nbVar, context);
        this.f5373w1 = q5Var;
        q5Var.setVisibility(8);
        q5Var.setColorPalette(pg.t0.e(i10));
        q5Var.setColorListener(new d5(nbVar, 0));
        l6Var.addView(q5Var, w7.x5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        qg.i1 i1Var = new qg.i1(context);
        this.A0 = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        i1Var.setBackground(org.telegram.ui.ActionBar.h6.f0(1090519039, 1, -1));
        l6Var.addView(i1Var, w7.x5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        i1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        nb nbVar2 = nbVar;
                        f6 f6Var3 = nbVar2.O0;
                        if (f6Var3 != null && (f6Var3.getCurrentBrush() instanceof pg.l)) {
                            f6Var3.b();
                            nbVar2.f5350k1.setSelectedIndex(1);
                            nbVar2.b((pg.m) pg.m.f40862a.get(0));
                            return;
                        }
                        nbVar2.D0.c();
                        return;
                    case 1:
                        nb nbVar3 = nbVar;
                        f6 f6Var4 = nbVar3.O0;
                        pg.u1 u1Var22 = nbVar3.D0;
                        if (u1Var22.a()) {
                            if (f6Var4 != null && (f6Var4.getCurrentBrush() instanceof pg.l)) {
                                f6Var4.b();
                                nbVar3.f5350k1.setSelectedIndex(1);
                                nbVar3.b((pg.m) pg.m.f40862a.get(0));
                            }
                            if (f6Var4 != null) {
                                f6Var4.a();
                            }
                            u1Var22.f40968c.clear();
                            u1Var22.f40967b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(u1Var22, 12));
                            nbVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nb nbVar4 = nbVar;
                        qg.j jVar = nbVar4.J0;
                        if (jVar instanceof qg.x2) {
                            AndroidUtilities.hideKeyboard(((qg.x2) jVar).getFocusedView());
                        }
                        if (nbVar4.f5362q2) {
                            nbVar4.v0(false);
                        }
                        nbVar4.C0(nbVar4.J0);
                        nbVar4.D0(null, true);
                        return;
                    case 3:
                        nbVar.D0(null, true);
                        return;
                    default:
                        nb nbVar5 = nbVar;
                        if (nbVar5.B1) {
                            nbVar5.I0(false);
                            return;
                        } else if (nbVar5.f5362q2) {
                            nbVar5.v0(true);
                            return;
                        } else if (nbVar5.K0) {
                            nbVar5.D0(null, true);
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
        qg.m1 m1Var = new qg.m1(context);
        this.B0 = m1Var;
        m1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        m1Var.setBackground(org.telegram.ui.ActionBar.h6.f0(1090519039, 1, -1));
        m1Var.setOnClickListener(new ai.d0(nbVar, context, t0Var2, 6));
        l6Var.addView(m1Var, w7.x5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        qg.z1 z1Var = new qg.z1(context);
        this.f5336d1 = z1Var;
        pg.r1 r1Var4 = r1Var;
        z1Var.setColorSwatch(r1Var4);
        z1Var.setRenderView(f6Var2);
        z1Var.setValueOverride(cVar);
        r1Var4.f40929c = cVar.get();
        z1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        nb nbVar2 = nbVar;
                        pg.r1 r1Var42 = nbVar2.A1;
                        nbVar2.F0(r1Var42);
                        pg.t0.e(i10).j(r1Var42.f40929c);
                        return;
                    default:
                        nbVar.l1.setTypeface(pg.t0.e(i10).f40958j);
                        return;
                }
            }
        });
        addView(z1Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V0 = frameLayout2;
        addView(frameLayout2, w7.x5.c(-1.0f, -1));
        Paint paint6 = paint;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(r1Var4, null, false);
        b((pg.m) pg.m.f40862a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.O1 = new s5(nbVar, kcVar, new ai.g3(2, nbVar, kcVar));
        s2.G = i14;
    }

    public static void G0(qg.x2 x2Var, int i10) {
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

    public static void Z(nb nbVar, pg.t0 t0Var, Integer num) {
        t0Var.h(num.intValue(), true);
        t0Var.g();
        nbVar.setNewColor(num.intValue());
        nbVar.f5373w1.setSelectedColorIndex(t0Var.d());
        nbVar.T1 = null;
    }

    public static void a0(nb nbVar, Integer num) {
        nbVar.setNewColor(num.intValue());
        nbVar.I0(false);
    }

    public ViewGroup getBarView() {
        if (this.Y0 == 2) {
            return this.l1;
        }
        return this.f5350k1;
    }

    private int getFrameRotation() {
        int i10 = this.f5340f1;
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

    private jv0 getPaintingSize() {
        jv0 jv0Var = this.H0;
        if (jv0Var != null) {
            return jv0Var;
        }
        jv0 jv0Var2 = new jv0(1080.0f, 1920.0f);
        this.H0 = jv0Var2;
        return jv0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 < j6Var.getChildCount()) {
                View childAt = j6Var.getChildAt(i10);
                if (childAt instanceof qg.q2) {
                    ImageReceiver imageReceiver = ((qg.q2) childAt).f41548x0;
                    yi0 lottieAnimation = imageReceiver.getLottieAnimation();
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
                        animation.f23282y = z10;
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
        pg.r1 r1Var = this.A1;
        int i11 = r1Var.f40927a;
        r1Var.f40927a = i10;
        E0(r1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new c5(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        qg.j jVar = this.J0;
        if (jVar instanceof qg.x2) {
            ((qg.x2) jVar).setType(i10);
        }
        pg.t0 e = pg.t0.e(this.F1);
        e.h = i10;
        e.f40952a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        w5 w5Var = new w5(this, context);
        this.W0 = w5Var;
        w5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.x5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f5344h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f5344h1;
        int i10 = org.telegram.ui.ActionBar.h6.f18878i6;
        d6 d6Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), 7, -1));
        this.f5344h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5344h1.setTextColor(-1);
        this.f5344h1.setTextSize(1, 14.0f);
        this.f5344h1.setGravity(1);
        this.f5344h1.setTypeface(AndroidUtilities.bold());
        this.f5344h1.setSingleLine();
        this.f5344h1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f5669b;

            {
                this.f5669b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f5669b;
                        if (q6Var.K0) {
                            q6Var.D0(null, true);
                            return;
                        } else {
                            q6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f5669b.A0();
                        return;
                    default:
                        q6 q6Var2 = this.f5669b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof qg.x2)) {
                            q6Var2.f5352l2 = true;
                            q6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f5344h1, w7.x5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f5346i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f5346i1.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), 7, -1));
        this.f5346i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5346i1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f5669b;

            {
                this.f5669b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f5669b;
                        if (q6Var.K0) {
                            q6Var.D0(null, true);
                            return;
                        } else {
                            q6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f5669b.A0();
                        return;
                    default:
                        q6 q6Var2 = this.f5669b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof qg.x2)) {
                            q6Var2.f5352l2 = true;
                            q6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f5346i1.setTextColor(-1);
        this.f5346i1.setTextSize(1, 14.0f);
        this.f5346i1.setGravity(1);
        this.f5346i1.setTypeface(AndroidUtilities.bold());
        this.f5346i1.setAlpha(0.6f);
        this.f5346i1.setSingleLine();
        this.W0.addView(this.f5346i1, w7.x5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f5348j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f5348j1.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), 7, -1));
        this.f5348j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5348j1.setTextColor(-1);
        this.f5348j1.setTextSize(1, 14.0f);
        this.f5348j1.setGravity(1);
        this.f5348j1.setTypeface(AndroidUtilities.bold());
        this.f5348j1.setAlpha(0.6f);
        this.f5348j1.setSingleLine();
        this.f5348j1.setOnClickListener(new View.OnClickListener(this) {
            public final q6 f5669b;

            {
                this.f5669b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f5669b;
                        if (q6Var.K0) {
                            q6Var.D0(null, true);
                            return;
                        } else {
                            q6Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f5669b.A0();
                        return;
                    default:
                        q6 q6Var2 = this.f5669b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof qg.x2)) {
                            q6Var2.f5352l2 = true;
                            q6Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f5348j1, w7.x5.l(1.0f, 0, -2));
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
        y5 y5Var = new y5(this, getContext(), this.G1, i10);
        this.f5351k2 = y5Var;
        kc kcVar = this.M1;
        Objects.requireNonNull(kcVar);
        y5Var.f5478w = new bi.v(kcVar, 6);
        final boolean[] zArr = {true};
        y5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                q6 q6Var = q6.this;
                q6Var.f5351k2 = null;
                if (zArr[0]) {
                    q6Var.z0(false);
                }
                q6Var.R0(i10);
            }
        });
        y5Var.f5480y = new h5(this);
        y5Var.q0(new o5(this, zArr, y5Var, 0));
        y5Var.show();
        z0(true);
    }

    public final void B0(qg.j jVar) {
        this.D0.b(jVar.getUUID(), new e5(this, jVar, 0));
    }

    @Override
    public final int[] C(qg.j jVar) {
        int[] iArr = this.f5358o2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final void C0(qg.j jVar) {
        qg.j jVar2 = this.J0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            D0(null, true);
            if (jVar instanceof qg.x2) {
                ValueAnimator valueAnimator = this.f5332b1;
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
            pg.u1 u1Var = this.D0;
            u1Var.f40967b.remove(uuid);
            u1Var.f40968c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(u1Var, 12));
        }
        qg.z1 z1Var = this.f5336d1;
        xa.c cVar = this.f5338e1;
        z1Var.setValueOverride(cVar);
        z1Var.setShowPreview(true);
        float f7 = cVar.get();
        pg.r1 r1Var = this.A1;
        r1Var.f40929c = f7;
        E0(r1Var, null, false);
        if (!this.f5356n2 && (jVar instanceof qg.e2)) {
            lc lcVar = ((nb) this).A2;
            zb zbVar = lcVar.X0;
            if (zbVar != null) {
                zbVar.s(null, null, true);
            }
            nb nbVar = lcVar.f5094v1;
            if (nbVar != null) {
                nbVar.q0();
            }
            bc bcVar = lcVar.f5035c1;
            if (bcVar != null) {
                bcVar.setHasRoundVideo(false);
            }
            l8 l8Var = lcVar.K1;
            if (l8Var != null) {
                File file = l8Var.f4994o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    lcVar.K1.f4994o0 = null;
                }
                if (lcVar.K1.f4996p0 != null) {
                    try {
                        new File(lcVar.K1.f4996p0).delete();
                    } catch (Exception unused2) {
                    }
                    lcVar.K1.f4996p0 = null;
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
        wc wcVar;
        wc wcVar2;
        gk0 gk0Var;
        int i10;
        boolean z12 = jVar instanceof qg.x2;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f5332b1;
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
            qg.x2 x2Var = (qg.x2) jVar;
            int gravity = x2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            qg.r1 r1Var = this.l1;
            r1Var.setAlignment(i11);
            pg.k0 typeface = x2Var.getTypeface();
            if (typeface != null) {
                r1Var.setTypeface(typeface.f40841a);
            }
            r1Var.e(x2Var.getType(), true);
            this.U0.invalidate();
        }
        qg.j jVar2 = this.J0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f41355d0) {
                    if (jVar instanceof qg.w0) {
                        qg.w0 w0Var = (qg.w0) jVar;
                        w0Var.setType((w0Var.getType() + 1) % w0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof qg.y2) {
                        qg.y2 y2Var = (qg.y2) jVar;
                        y2Var.setType((y2Var.getType() + 1) % y2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof qg.t0) {
                        qg.t0 t0Var = (qg.t0) jVar;
                        qg.r0 r0Var = t0Var.f41604q0;
                        if (r0Var.e()) {
                            if (r0Var.getPreviewType() == 0) {
                                i12 = 1;
                            }
                            r0Var.setPreviewType(i12);
                            return true;
                        }
                        t0Var.setType(t0Var.getNextType());
                        return true;
                    } else if (!this.K0) {
                        if (jVar instanceof qg.x2) {
                            this.M0 = true;
                            r0();
                            return true;
                        } else if (jVar instanceof qg.d2) {
                            qg.d2 d2Var = (qg.d2) jVar;
                            if (this.f5335c2 && this.a2 == jVar) {
                                d2Var.q(true);
                                return true;
                            }
                            qg.d2 d2Var2 = this.a2;
                            if (d2Var2 != null && d2Var2 != d2Var && (gk0Var = this.Z1) != null) {
                                gk0Var.animate().alpha(0.0f).setListener(new u5(gk0Var, 0));
                                this.Z1 = null;
                                this.f5335c2 = false;
                                this.f5333b2 = 0.0f;
                            }
                            if (this.Z1 == null) {
                                gk0 gk0Var2 = new gk0(2, this.F1, getContext(), LaunchActivity.R(), new ai.x3(6, new ai.d()));
                                this.Z1 = gk0Var2;
                                org.telegram.ui.Components.na naVar = new org.telegram.ui.Components.na(this.f5339e2, gk0Var2, 0, false);
                                this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.M1.addView(this.Z1, w7.x5.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                gk0 gk0Var3 = this.Z1;
                                ?? obj = new Object();
                                obj.e = this;
                                obj.f4254c = naVar;
                                obj.d = paint;
                                obj.f4253b = new Path();
                                gk0Var3.setDelegate(obj);
                                this.Z1.p(null, null, true);
                            }
                            this.Z1.setFragment(LaunchActivity.R());
                            this.a2 = d2Var;
                            O0(true);
                            return true;
                        } else {
                            M0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof qg.x2) {
                        AndroidUtilities.showKeyboard(((qg.x2) jVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            qg.j jVar3 = this.J0;
            if (jVar3 instanceof qg.x2) {
                qg.x2 x2Var2 = (qg.x2) jVar3;
                qg.w2 w2Var = x2Var2.f41658q0;
                w2Var.clearFocus();
                w2Var.setEnabled(false);
                w2Var.setClickable(false);
                x2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((qg.x2) this.J0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar3 instanceof qg.e2) && (wcVar2 = ((nb) this).A2.Z0) != null) {
                wcVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        qg.j jVar4 = this.J0;
        this.J0 = jVar;
        if ((jVar4 instanceof qg.x2) && TextUtils.isEmpty(((qg.x2) jVar4).getText())) {
            C0(jVar4);
        }
        qg.j jVar5 = this.J0;
        if (jVar4 != jVar5 && (jVar5 instanceof qg.e2) && (wcVar = ((nb) this).A2.Z0) != null) {
            wcVar.l(true);
        }
        qg.j jVar6 = this.J0;
        xa.c cVar = this.f5338e1;
        pg.r1 r1Var2 = this.A1;
        qg.z1 z1Var = this.f5336d1;
        if (jVar6 != null) {
            k6 k6Var = this.Q0;
            jVar6.m0 = k6Var;
            jVar6.l(k6Var, true);
            qg.j jVar7 = this.J0;
            if (jVar7 instanceof qg.x2) {
                qg.x2 x2Var3 = (qg.x2) jVar7;
                x2Var3.getSwatch().f40929c = r1Var2.f40929c;
                x2Var3.f41667z0 = false;
                F0(x2Var3.getSwatch());
                z1Var.setValueOverride(new t5(x2Var3, (int) (this.H0.f25428a / 9.0f), 0));
                z1Var.setShowPreview(false);
            } else {
                z1Var.setValueOverride(cVar);
                z1Var.setShowPreview(true);
                r1Var2.f40929c = cVar.get();
                E0(r1Var2, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f5332b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                I0(false);
            }
            R0(0);
            z1Var.setValueOverride(cVar);
            z1Var.setShowPreview(true);
            r1Var2.f40929c = cVar.get();
            E0(r1Var2, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(pg.r1 r1Var, Integer num, boolean z10) {
        pg.r1 r1Var2 = this.A1;
        if (r1Var2 != r1Var) {
            r1Var2.f40927a = r1Var.f40927a;
            r1Var2.f40928b = r1Var.f40928b;
            r1Var2.f40929c = r1Var.f40929c;
            int i10 = this.F1;
            pg.t0.e(i10).h(r1Var.f40927a, true);
            pg.t0.e(i10).j(r1Var.f40929c);
        }
        int i11 = r1Var.f40927a;
        f6 f6Var = this.O0;
        f6Var.setColor(i11);
        f6Var.setBrushSize(r1Var.f40929c);
        int i12 = r1Var2.f40927a;
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
        if (jVar instanceof qg.x2) {
            ((qg.x2) jVar).setSwatch(new pg.r1(r1Var.f40928b, r1Var.f40929c, r1Var.f40927a));
        } else if (z10 && (jVar instanceof qg.w0)) {
            ((qg.w0) jVar).setColor(r1Var.f40927a);
            ((qg.w0) this.J0).setType(3);
        } else if (z10 && (jVar instanceof qg.y2)) {
            ((qg.y2) jVar).setColor(r1Var.f40927a);
            ((qg.y2) this.J0).setType(3);
        } else if (z10 && (jVar instanceof qg.t0)) {
            ((qg.t0) jVar).setColor(r1Var.f40927a);
            ((qg.t0) this.J0).setType(0);
        }
    }

    public final void F0(pg.r1 r1Var) {
        E0(r1Var, null, false);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f5364r2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f5374w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f5374w2).commit();
            } else {
                this.f5372v2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f5372v2).commit();
            }
        }
        boolean z13 = this.f5362q2;
        s5 s5Var = this.O1;
        if (z13) {
            if (z10) {
                i11 = this.f5374w2;
            } else {
                i11 = this.f5372v2;
            }
            int paddingUnderContainer = this.M1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5360p2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f5360p2.setLayoutParams(layoutParams);
                this.f5368t2 = layoutParams.height;
                s5Var.a();
                requestLayout();
            }
        }
        if (this.f5376x2 == i10 && this.f5378y2 == z10) {
            return;
        }
        this.f5376x2 = i10;
        this.f5378y2 = z10;
        boolean z14 = this.f5364r2;
        qg.j jVar = this.J0;
        if (jVar instanceof qg.x2) {
            if (((qg.x2) jVar).getEditText().isFocused() && s5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f5364r2 = z12;
        } else {
            this.f5364r2 = false;
        }
        if (this.f5364r2 && this.f5362q2) {
            J0(0);
        }
        if (this.f5368t2 != 0 && !(z11 = this.f5364r2) && z11 != z14 && !this.f5362q2) {
            this.f5368t2 = 0;
            s5Var.a();
            requestLayout();
        }
        U0();
        if (z14 && !this.f5364r2 && this.f5368t2 > 0 && this.f5370u2) {
            this.f5370u2 = false;
        }
        S0();
    }

    public final void H0() {
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
                        qg.x2 o02 = o0(z10);
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
                        pg.r1 swatch = o02.getSwatch();
                        swatch.f40927a = mediaEntity.color;
                        o02.setSwatch(swatch);
                        jVar = o02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            qg.a2 k02 = k0(mediaEntity.text, false);
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
                            ArrayList arrayList3 = l8Var.v;
                            boolean z11 = l8Var.K;
                            this.f5352l2 = true;
                            qg.j b6Var = new b6(this, getContext(), e0(), arrayList3, this.f5339e2, z11, this.f5341f2);
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
                            qg.w0 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                j02.setColor(i14);
                            }
                            j02.setType(mediaEntity.subType);
                            jVar = j02;
                        } else if (b10 == 8) {
                            kd kdVar = mediaEntity.weather;
                            if (kdVar != null) {
                                qg.y2 p02 = p0(kdVar);
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
                            qg.t0 i02 = i0(mediaEntity.linkSettings);
                            qg.r0 r0Var = i02.f41604q0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                i02.setColor(i16);
                            }
                            boolean e = r0Var.e();
                            int i17 = r0Var.h;
                            int i18 = r0Var.f41560f;
                            if (e) {
                                r0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                i02.setType(3);
                                r0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(r0Var.f41553a0)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(r0Var.f41555b0)) + i17 + i17;
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
                            qg.d2 l02 = l0(false);
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
                            if (b10 == 5 && l8Var.f4994o0 != null) {
                                qg.e2 m0 = m0(l8Var.f4996p0, false);
                                lc lcVar = ((nb) this).A2;
                                zb zbVar = lcVar.X0;
                                if (zbVar != null) {
                                    zbVar.f4405w = m0;
                                    f71 f71Var = zbVar.f4407x;
                                    if (f71Var != null) {
                                        f71Var.V(m0.f41299u0);
                                    }
                                }
                                bc bcVar = lcVar.f5035c1;
                                if (bcVar != null) {
                                    bcVar.setHasRoundVideo(true);
                                }
                                jVar = m0;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !m0.f41296r0;
                                    m0.f41296r0 = z12;
                                    m0.f41297s0.f(z12, true);
                                    m0.invalidate();
                                    jVar = m0;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f15600x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f15601y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
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
            lVar.f15332i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f15326u = lVar;
            if (!this.O1.c() && this.f5368t2 <= 0) {
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
                    q5 q5Var = q6Var.f5373w1;
                    float f17 = q6Var.D1;
                    boolean z12 = z10;
                    q5Var.y1(f17, z12);
                    qg.m1 m1Var = q6Var.B0;
                    m1Var.setProgress(q6Var.D1);
                    qg.i1 i1Var = q6Var.A0;
                    i1Var.setProgress(q6Var.D1);
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
                        m1Var.setAlpha(AndroidUtilities.lerp(f19, f13, f18));
                        if (!z12) {
                            f15 = 0.0f;
                        }
                        i1Var.setAlpha(AndroidUtilities.lerp(f19, f15, f18));
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
                q5 q5Var = this.f5373w1;
                q5Var.setVisibility(0);
                q5Var.setSelectedColorIndex(pg.t0.e(this.F1).d());
            }
        }
    }

    public final void J0(int i10) {
        boolean z10;
        int i11;
        qg.r1 r1Var = this.l1;
        s5 s5Var = this.O1;
        if (i10 == 1) {
            lz lzVar = this.f5360p2;
            if (lzVar != null && lzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            lz lzVar2 = this.f5360p2;
            kc kcVar = this.M1;
            if (lzVar2 != null && lzVar2.f25968c1 != UserConfig.selectedAccount) {
                kcVar.removeView(lzVar2);
                this.f5360p2 = null;
            }
            if (this.f5360p2 == null) {
                lz lzVar3 = new lz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.f5360p2 = lzVar3;
                lzVar3.f26032w2 = false;
                lzVar3.U0 = true;
                lzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f5360p2.setForseMultiwindowLayout(true);
                }
                this.f5360p2.setDelegate(new e6(this));
                kcVar.addView(this.f5360p2);
            }
            this.f5360p2.setVisibility(0);
            this.f5362q2 = true;
            lz lzVar4 = this.f5360p2;
            if (this.f5372v2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f5372v2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f5372v2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f5374w2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f5374w2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f5374w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f5374w2;
            } else {
                i11 = this.f5372v2;
            }
            int paddingUnderContainer = kcVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            lzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                qg.j jVar = this.J0;
                if (jVar instanceof qg.x2) {
                    AndroidUtilities.hideKeyboard(((qg.x2) jVar).getEditText());
                }
            }
            this.f5368t2 = paddingUnderContainer;
            s5Var.a();
            requestLayout();
            ah emojiButton = r1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            if (!z10) {
                if (this.f5364r2) {
                    this.f5370u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5368t2, 0.0f);
                    ofFloat.addUpdateListener(new z4(this, 1));
                    ofFloat.addListener(new v5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
                    ofFloat.start();
                }
            }
        } else {
            ah emojiButton2 = r1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(yg.e, true);
            }
            lz lzVar5 = this.f5360p2;
            if (lzVar5 != null) {
                this.f5362q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    lzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f5368t2 = 0;
                s5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(qg.t0 t0Var) {
        u8 u8Var = new u8(getContext(), this.G1, this.f5343g2, new ai.g3(4, this, t0Var));
        if (t0Var != null) {
            qg.q0 q0Var = t0Var.f41608u0;
            u8Var.f5619c0 = true;
            org.telegram.ui.Cells.i3 i3Var = u8Var.Z;
            org.telegram.ui.Cells.i3 i3Var2 = u8Var.Y;
            if (q0Var != null) {
                u8Var.f5623g0 = q0Var.d;
                u8Var.f5624h0 = false;
                i3Var2.setText(q0Var.f41536c);
                i3Var.setText(q0Var.f41535b);
                u8Var.m0 = !TextUtils.isEmpty(q0Var.f41535b);
                u8Var.f5629n0 = q0Var.f41537f;
                u8Var.f5630o0 = q0Var.e;
            } else {
                i3Var2.setText("");
                i3Var.setText("");
                u8Var.f5629n0 = true;
                u8Var.f5630o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = u8Var.f5618b0;
            dVar.g(string, false, true);
            q8 q8Var = u8Var.X;
            if (q8Var != null) {
                q8Var.N(false);
            }
            dVar.setEnabled(u8Var.V(i3Var2.getText().toString()));
            u8Var.f5619c0 = false;
        }
        u8Var.setOnDismissListener(new l5(this, 1));
        u8Var.show();
        z0(true);
    }

    public final void L0(qg.w0 w0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        wi wiVar = new wi(getContext(), new z5(this, callback2), false, true, false, this.G1);
        wiVar.Z1 = new Object();
        yh yhVar = wiVar.f29723x1;
        if (w0Var != null && (messageMedia = w0Var.f41653u0) != null && (geoPoint = messageMedia.geo) != null) {
            wiVar.f29724x2 = new double[]{geoPoint.lat, geoPoint._long};
            wiVar.O = true;
            yhVar.setVisibility(8);
        } else if (this.U1) {
            wiVar.f29716v2 = this.W1;
            wiVar.f29720w2 = this.V1;
            wiVar.O = true;
            yhVar.setVisibility(8);
        } else {
            wiVar.O = true;
            yhVar.setVisibility(8);
        }
        wiVar.setOnDismissListener(new l5(this, 0));
        wiVar.r1();
        wiVar.show();
    }

    public final void M0(qg.j jVar) {
        if (jVar instanceof qg.h1) {
            org.telegram.ui.ActionBar.n1 n1Var = this.H1;
            if (n1Var != null && n1Var.isShowing()) {
                this.H1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f5358o2;
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
            n1Var2.f19406b = true;
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
            o6Var3.setBackgroundDrawable(new org.telegram.ui.Components.ma(new org.telegram.ui.Components.na(this.f5339e2, o6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.I1.setBackgroundDrawable(mutate);
        this.I1.setBackgroundColor(-14145495);
    }

    public final void O0(boolean z10) {
        if (this.f5335c2 != z10) {
            if (z10 || this.Z1 != null) {
                this.f5335c2 = z10;
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
                    this.f5337d2 = true;
                    this.M1.invalidate();
                    float f10 = this.f5333b2;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.Z1.setTransitionProgress(this.f5333b2);
                    ofFloat.addUpdateListener(new z4(this, 2));
                    ofFloat.addListener(new ai.n(11, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(rr.f27702g);
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
        if (this.f5369u1 != z10) {
            this.f5369u1 = z10;
            o1.k kVar = this.f5371v1;
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
            this.f5371v1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f15332i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f15326u = lVar;
            if (z10) {
                qg.w1 w1Var = this.f5353m1;
                w1Var.setAlpha(0.0f);
                w1Var.setVisibility(0);
            }
            this.f5371v1.b(new ai.qa(1, this));
            this.f5371v1.a(new y4(this, z10, 1));
            this.f5371v1.f();
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
                if (!(childAt instanceof qg.j) || (childAt instanceof qg.h1)) {
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
        return this.O1.f4782l - this.M1.getBottomPadding2();
    }

    public final void R0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.Y0 != i10 && this.Z0 != i10) {
            ValueAnimator valueAnimator = this.f5332b1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.Y0;
            ViewGroup viewGroup3 = this.l1;
            ViewGroup viewGroup4 = this.f5350k1;
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
            pg.t0 e = pg.t0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f40960l != z10) {
                e.f40960l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f40952a.getInt("brush", 0), false);
                }
            }
            int c10 = pg.t0.e(i12).c();
            pg.r1 r1Var = this.A1;
            r1Var.f40927a = c10;
            E0(r1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f5332b1 = duration;
            duration.setInterpolator(rr.f27701f);
            this.f5332b1.addUpdateListener(new ai.x4(this, viewGroup, viewGroup2, 1));
            this.f5332b1.addListener(new x5(this, viewGroup, viewGroup2, i10, 0));
            this.f5332b1.start();
        }
    }

    public final void S0() {
        boolean z10;
        s5 s5Var = this.O1;
        qg.r1 r1Var = this.l1;
        if (r1Var != null) {
            if (s5Var.c()) {
                r1Var.a(R.drawable.input_smile);
            } else if (this.f5362q2) {
                r1Var.a(R.drawable.input_keyboard);
            } else {
                r1Var.a(R.drawable.msg_add);
            }
        }
        if (!s5Var.c() && !this.f5362q2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.f5357o1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5355n1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5361q1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f5359p1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        float f7;
        qg.j jVar;
        ObjectAnimator objectAnimator = this.f5347i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        s5 s5Var = this.O1;
        if (((s5Var.c() && !s5Var.d) || this.f5368t2 > 0) && (jVar = this.J0) != null) {
            f7 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.f5347i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f5347i2.setInterpolator(rr.h);
        this.f5347i2.start();
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
        qg.z1 z1Var = this.f5336d1;
        if (!z10 && !(mVar instanceof pg.d)) {
            z1Var.b(0.05f, 1.0f);
        } else {
            z1Var.b(0.4f, 1.75f);
        }
        z1Var.setDrawCenter(!(mVar instanceof pg.l));
        f6 f6Var = this.O0;
        if (f6Var.getCurrentBrush() instanceof pg.l) {
            this.f5334c1 = true;
        }
        f6Var.setBrush(mVar);
        pg.r1 r1Var = this.A1;
        int i10 = r1Var.f40927a;
        r1Var.f40927a = pg.t0.e(this.F1).c();
        r1Var.f40929c = this.f5338e1.get();
        E0(r1Var, Integer.valueOf(i10), false);
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
        if (this.f5354m2) {
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

    public abstract boolean f0(ai.o8 o8Var);

    @Override
    public final void g(int i10) {
        qg.j jVar = this.J0;
        if (jVar instanceof qg.x2) {
            G0((qg.x2) jVar, i10);
            pg.t0 e = pg.t0.e(this.F1);
            e.f40956g = i10;
            e.f40952a.edit().putInt("text_alignment", i10).apply();
        }
    }

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
                    boolean z12 = childAt instanceof qg.x2;
                    int i11 = this.F1;
                    if (z12) {
                        CharSequence text = ((qg.x2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.z5 z5Var : (org.telegram.ui.Components.z5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.z5.class)) {
                                TLRPC.Document document = z5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.q5.f(i11, z5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.q5.h(i11).e(document);
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
                    } else if (childAt instanceof qg.q2) {
                        TLRPC.Document sticker = ((qg.q2) childAt).getSticker();
                        if (l8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof qg.e2) {
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
        return this.f5342g1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.z5[] z5VarArr;
        j6 j6Var = this.R0;
        int childCount = j6Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = j6Var.getChildAt(i10);
            if (childAt instanceof qg.q2) {
                TLRPC.Document sticker = ((qg.q2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f18095id = sticker.f18089id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof qg.x2) {
                CharSequence text = ((qg.x2) childAt).getText();
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
                                tL_inputDocument2.f18095id = document.f18089id;
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

    public pg.d1 getRenderView() {
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
        return this.f5336d1;
    }

    public final TextView h0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, this.G1));
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

    public final qg.t0 i0(qg.q0 q0Var) {
        int measuredWidth;
        int i10;
        this.f5352l2 = true;
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
        qg.t0 t0Var = new qg.t0(getContext(), Q0, this.F1, q0Var, f7 / 360.0f, dp);
        if (Q0.x == j6Var.getMeasuredWidth() / 2.0f) {
            t0Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            t0Var.setStickyY(2);
        }
        pg.r1 r1Var = this.A1;
        if (r1Var != null && (i10 = r1Var.f40927a) != -47814) {
            t0Var.setColor(i10);
        }
        t0Var.setDelegate(this);
        t0Var.setMaxWidth(dp);
        j6Var.addView(t0Var, w7.x5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            t0Var.j(1.0f / cropState.cropScale);
            t0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return t0Var;
    }

    public final qg.w0 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f5352l2 = true;
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
        qg.w0 w0Var = new qg.w0(getContext(), Q0, this.F1, messageMedia, mediaArea, f7 / 240.0f, dp);
        if (Q0.x == j6Var.getMeasuredWidth() / 2.0f) {
            w0Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            w0Var.setStickyY(2);
        }
        pg.r1 r1Var = this.A1;
        if (r1Var != null && (i10 = r1Var.f40927a) != -47814) {
            w0Var.setColor(i10);
        }
        w0Var.setDelegate(this);
        w0Var.setMaxWidth(dp);
        j6Var.addView(w0Var, w7.x5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            w0Var.j(1.0f / cropState.cropScale);
            w0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return w0Var;
    }

    public final qg.a2 k0(String str, boolean z10) {
        float f7;
        jv0 jv0Var;
        this.f5352l2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        j6 j6Var = this.R0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.R1, j6Var.getMeasuredWidth()) * 0.5d);
            jv0Var = new jv0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, j6Var.getMeasuredHeight()) * 0.5d);
            jv0Var = new jv0(f7 * floor2, floor2);
        }
        jv0 jv0Var2 = jv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = jv0Var2.f25428a;
            jv0Var2.f25428a = jv0Var2.f25429b;
            jv0Var2.f25429b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        qg.a2 a2Var = new qg.a2(context, e02, jv0Var2, str, intValue);
        a2Var.setDelegate(this);
        j6Var.addView(a2Var);
        g0();
        return a2Var;
    }

    public final qg.d2 l0(boolean z10) {
        String str;
        jv0 jv0Var = new jv0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
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
        jVar.f41284r0 = new ai.ob(jVar);
        jVar.f41285s0 = new ai.ob(jVar);
        jVar.f41286t0 = new zg.g0(jVar);
        jVar.f41287u0 = new zg.g0(jVar);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6((View) jVar);
        jVar.f41289w0 = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6((View) jVar);
        jVar.f41290x0 = e6Var2;
        jVar.f41292z0 = 1.0f;
        jVar.f41283q0 = jv0Var;
        e6Var2.d(1.0f, true);
        e6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        zg.g0 g0Var = jVar.f41286t0;
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
        jVar.f41288v0 = b10;
        g0Var.e(b10);
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

    @Override
    public final boolean m(MotionEvent motionEvent) {
        if (this.f5354m2) {
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

    public final qg.e2 m0(String str, boolean z10) {
        float f7;
        this.f5352l2 = true;
        this.f5356n2 = true;
        q0();
        j6 j6Var = this.R0;
        int measuredWidth = j6Var.getMeasuredWidth();
        j6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        jv0 jv0Var = new jv0(floor, floor);
        qg.e2 e2Var = new qg.e2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (jv0Var.f25429b / 2.0f) + AndroidUtilities.dp(72.0f)), jv0Var, str);
        e2Var.setDelegate(this);
        j6Var.addView(e2Var);
        g0();
        if (z10) {
            B0(e2Var);
            post(new u4(this, e2Var, 0));
        }
        this.f5356n2 = false;
        return e2Var;
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
        float floor = (float) Math.floor(getPaintingSize().f25428a * 0.5d);
        c6 c6Var = new c6(this, context, p6Var.f5296a, p6Var.f5298c, p6Var.f5297b, new jv0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = c6Var.f41548x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        c6Var.setDelegate(this);
        this.R0.addView(c6Var);
        g0();
        return c6Var;
    }

    public final qg.x2 o0(boolean z10) {
        jv0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        qg.x2 x2Var = new qg.x2(getContext(), Q0, (int) (paintingSize.f25428a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.f25428a / 9.0f;
        f5 f5Var = new f5(this, 0);
        x2Var.f41664w0 = (int) (0.5f * f7);
        x2Var.f41665x0 = (int) (f7 * 2.0f);
        x2Var.f41666y0 = f5Var;
        float f10 = Q0.x;
        j6 j6Var = this.R0;
        if (f10 == j6Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        x2Var.setTypeface(pg.t0.e(i10).f40958j);
        x2Var.setType(pg.t0.e(i10).h);
        j6Var.addView(x2Var, w7.x5.c(-2.0f, -2));
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
            int i11 = pg.t0.e(i10).f40956g;
            qg.r1 r1Var = this.l1;
            r1Var.d(i11, true);
            r1Var.setOutlineType(pg.t0.e(i10).h);
        }
        return x2Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        gk0 gk0Var = this.Z1;
        if (gk0Var != null) {
            AndroidUtilities.removeFromParent(gk0Var);
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
        float f11 = this.H0.f25428a;
        qg.j jVar = this.J0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.T0, i10, i11);
        measureChild(this.f5336d1, i10, i11);
        measureChild(this.V0, i10, i11);
        measureChild(this.U0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f5368t2 - this.M1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.S0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.G0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f5362q2 && !this.f5366s2) {
            this.G0 = true;
            w0();
            this.G0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    public final qg.y2 p0(kd kdVar) {
        int measuredWidth;
        int i10;
        this.f5352l2 = true;
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
        qg.y2 y2Var = new qg.y2(getContext(), Q0, this.F1, kdVar, f7 / 240.0f, dp);
        if (Q0.x == j6Var.getMeasuredWidth() / 2.0f) {
            y2Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            y2Var.setStickyY(2);
        }
        pg.r1 r1Var = this.A1;
        if (r1Var != null && (i10 = r1Var.f40927a) != -47814) {
            y2Var.setColor(i10);
        }
        y2Var.setDelegate(this);
        y2Var.setMaxWidth(dp);
        j6Var.addView(y2Var, w7.x5.c(-2.0f, -2));
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
        return !(this.J0 instanceof qg.h1);
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 < j6Var.getChildCount()) {
                View childAt = j6Var.getChildAt(i10);
                if (childAt instanceof qg.e2) {
                    if (this.J0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(rr.h).withEndAction(new u4(this, (qg.e2) childAt, 1)).start();
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

    public final qg.h1 s0() {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 < j6Var.getChildCount()) {
                View childAt = j6Var.getChildAt(i10);
                if (childAt instanceof qg.h1) {
                    return (qg.h1) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ja jaVar) {
        this.f5339e2 = jaVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f5354m2 != z10) {
            this.f5354m2 = z10;
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
                if (childAt instanceof qg.q2) {
                    ImageReceiver imageReceiver = ((qg.q2) childAt).f41548x0;
                    yi0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        if (!this.f5364r2 && !this.f5362q2) {
            this.f5352l2 = true;
            o0(true);
            return;
        }
        if (this.f5362q2) {
            qg.j jVar = this.J0;
            if (jVar instanceof qg.x2) {
                this.O1.e = true;
                AndroidUtilities.showKeyboard(((qg.x2) jVar).getEditText());
            }
        }
        J0(!this.f5362q2 ? 1 : 0);
    }

    public final android.graphics.Bitmap t0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, ci.l8 r46) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q6.t0(java.util.ArrayList, boolean, boolean, boolean, boolean, ci.l8):android.graphics.Bitmap");
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
        if (!this.D0.a() && !this.f5352l2) {
            return false;
        }
        return true;
    }

    @Override
    public final pg.t0 v() {
        return pg.t0.e(this.F1);
    }

    public final void v0(boolean z10) {
        if (this.f5362q2) {
            J0(0);
        }
        if (z10) {
            lz lzVar = this.f5360p2;
            if (lzVar != null && lzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f5360p2.getMeasuredHeight());
                ofFloat.addUpdateListener(new z4(this, 0));
                this.f5366s2 = true;
                ofFloat.addListener(new v5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
                ofFloat.start();
                return;
            }
            w0();
        }
    }

    public final void w0() {
        lz lzVar;
        if (!this.f5362q2 && (lzVar = this.f5360p2) != null && lzVar.getVisibility() != 8) {
            this.f5360p2.setVisibility(8);
        }
        int i10 = this.f5368t2;
        this.f5368t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    @Override
    public final void y() {
        N0(new f5(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean y0() {
        if (this.f5335c2) {
            if (this.Z1.getReactionsWindow() != null && !this.Z1.getReactionsWindow().f48940q) {
                this.Z1.e();
                return true;
            }
            O0(false);
            return true;
        } else if (this.B1) {
            I0(false);
            return true;
        } else if (this.f5362q2) {
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

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f7) {
    }
}
