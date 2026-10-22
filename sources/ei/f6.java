package ei;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.wh;
import org.telegram.ui.Components.yg;
import org.telegram.ui.LaunchActivity;
public abstract class f6 extends mw0 implements rg.q1, rg.h, rg.m1, kw0, rb {
    public final rg.f1 A0;
    public final qg.t1 A1;
    public final rg.j1 B0;
    public boolean B1;
    public final Bitmap C0;
    public o1.k C1;
    public final qg.w1 D0;
    public float D1;
    public final DispatchQueue E0;
    public final Paint E1;
    public final MediaController.CropState F0;
    public final int F1;
    public boolean G0;
    public final t5 G1;
    public fw0 H0;
    public org.telegram.ui.ActionBar.m1 H1;
    public boolean I0;
    public d6 I1;
    public rg.j J0;
    public Rect J1;
    public boolean K0;
    public Runnable K1;
    public int L0;
    public Runnable L1;
    public boolean M0;
    public final ub M1;
    public final boolean N0;
    public AnimatorSet N1;
    public final v5 O0;
    public final i5 O1;
    public final x5 P0;
    public a8 P1;
    public final a6 Q0;
    public ArrayList Q1;
    public final z5 R0;
    public int R1;
    public final FrameLayout S0;
    public int S1;
    public final b6 T0;
    public qg.y T1;
    public final f5 U0;
    public final boolean U1;
    public final FrameLayout V0;
    public final File V1;
    public m5 W0;
    public final boolean W1;
    public final View X0;
    public final boolean X1;
    public int Y0;
    public boolean Y1;
    public int Z0;
    public dl0 Z1;
    public float f8999a1;
    public rg.b2 a2;
    public ValueAnimator f9000b1;
    public float f9001b2;
    public boolean f9002c1;
    public boolean f9003c2;
    public final rg.w1 f9004d1;
    public boolean f9005d2;
    public final qb.c f9006e1;
    public org.telegram.ui.Components.ja f9007e2;
    public final int f9008f1;
    public final q6 f9009f2;
    public BigInteger f9010g1;
    public final r6 f9011g2;
    public TextView f9012h1;
    public boolean f9013h2;
    public TextView f9014i1;
    public ObjectAnimator f9015i2;
    public TextView f9016j1;
    public final float[] f9017j2;
    public final rg.r1 f9018k1;
    public o5 f9019k2;
    public final rg.o1 l1;
    public boolean f9020l2;
    public final rg.t1 f9021m1;
    public boolean f9022m2;
    public final ImageView f9023n1;
    public boolean f9024n2;
    public final TextView f9025o1;
    public final int[] f9026o2;
    public final TextView f9027p1;
    public tz f9028p2;
    public final TextView f9029q1;
    public boolean f9030q2;
    public final Paint f9031r1;
    public boolean f9032r2;
    public final Paint f9033s1;
    public boolean f9034s2;
    public float f9035t1;
    public int f9036t2;
    public boolean f9037u1;
    public boolean f9038u2;
    public o1.k f9039v1;
    public int f9040v2;
    public final g5 f9041w1;
    public int f9042w2;
    public final Paint f9043x1;
    public int f9044x2;
    public final Paint f9045y1;
    public boolean f9046y2;
    public final Paint f9047z1;

    public f6(Context context, boolean z10, File file, boolean z11, boolean z12, ub ubVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, a8 a8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ja jaVar, org.telegram.ui.ActionBar.d6 d6Var, q6 q6Var, r6 r6Var) {
        super(context, activity);
        v5 v5Var;
        qg.t1 t1Var;
        org.telegram.ui.Components.ja jaVar2;
        qg.v0 v0Var;
        DispatchQueue dispatchQueue;
        Bitmap bitmap3;
        Paint paint;
        Paint paint2;
        v5 v5Var2;
        int i14;
        this.Y0 = 0;
        this.Z0 = -1;
        final xa xaVar = (xa) this;
        qb.c cVar = new qb.c(xaVar, 21);
        this.f9006e1 = cVar;
        Paint paint3 = new Paint(1);
        this.f9031r1 = paint3;
        Paint paint4 = new Paint(1);
        this.f9033s1 = paint4;
        this.f9043x1 = new Paint(1);
        this.f9045y1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f9047z1 = paint5;
        qg.t1 t1Var2 = new qg.t1(1.0f, 0.016773745f, -1);
        this.A1 = t1Var2;
        this.E1 = new Paint(1);
        this.f9017j2 = new float[2];
        this.f9022m2 = false;
        this.f9026o2 = new int[2];
        new androidx.activity.i(xaVar, 18);
        setDelegate(this);
        this.f9007e2 = jaVar;
        this.f9009f2 = q6Var;
        this.U1 = z10;
        this.V1 = file;
        this.W1 = z11;
        this.X1 = z12;
        this.M1 = ubVar;
        this.R1 = i12;
        this.S1 = i13;
        this.f9011g2 = r6Var;
        this.F1 = i10;
        t5 t5Var = new t5(d6Var);
        this.G1 = t5Var;
        this.F0 = cropState;
        this.N0 = context instanceof BubbleActivity;
        qg.v0 e = qg.v0.e(i10);
        e.i(0, true);
        t1Var2.f44660a = e.c();
        t1Var2.f44662c = e.f44685i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.E0 = dispatchQueue2;
        this.C0 = bitmap;
        this.f9008f1 = i11;
        qg.w1 w1Var = new qg.w1();
        this.D0 = w1Var;
        w1Var.f44698a = new e1.c(xaVar, 6);
        View view = new View(context);
        this.X0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        qg.t0 t0Var = new qg.t0(getPaintingSize(), null, i11, jaVar);
        if (a8Var == null || !a8Var.f8735u) {
            t1Var = t1Var2;
            jaVar2 = jaVar;
            v0Var = e;
            dispatchQueue = dispatchQueue2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            v5Var2 = v5Var;
        } else {
            t1Var = t1Var2;
            jaVar2 = null;
            v0Var = e;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            v5Var2 = v5Var;
            dispatchQueue = dispatchQueue2;
        }
        v5Var2 = new v5(xaVar, context, t0Var, bitmap3, bitmap2, jaVar2);
        this.O0 = v5Var2;
        v5Var2.setDelegate(new w5(xaVar));
        v5Var2.setUndoStore(w1Var);
        v5Var2.setQueue(dispatchQueue);
        v5Var2.setVisibility(4);
        x5 x5Var = new x5(xaVar, context);
        this.P0 = x5Var;
        x5Var.setVisibility(4);
        z5 z5Var = new z5(xaVar, context, new y5(xaVar));
        this.R0 = z5Var;
        this.P1 = a8Var;
        this.Q1 = arrayList;
        if (this.R1 > 0 && this.S1 > 0) {
            G0();
        }
        z5Var.setVisibility(4);
        this.Q0 = new a6(xaVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, w7.z5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f9023n1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xa xaVar2 = xaVar;
                        v5 v5Var3 = xaVar2.O0;
                        if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof qg.l)) {
                            v5Var3.b();
                            xaVar2.f9018k1.setSelectedIndex(1);
                            xaVar2.o((qg.m) qg.m.f44564a.get(0));
                            return;
                        }
                        xaVar2.D0.c();
                        return;
                    case 1:
                        xa xaVar3 = xaVar;
                        v5 v5Var4 = xaVar3.O0;
                        qg.w1 w1Var2 = xaVar3.D0;
                        if (w1Var2.a()) {
                            if (v5Var4 != null && (v5Var4.getCurrentBrush() instanceof qg.l)) {
                                v5Var4.b();
                                xaVar3.f9018k1.setSelectedIndex(1);
                                xaVar3.o((qg.m) qg.m.f44564a.get(0));
                            }
                            if (v5Var4 != null) {
                                v5Var4.a();
                            }
                            w1Var2.f44700c.clear();
                            w1Var2.f44699b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(w1Var2, 7));
                            xaVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xa xaVar4 = xaVar;
                        rg.j jVar = xaVar4.J0;
                        if (jVar instanceof rg.v2) {
                            AndroidUtilities.hideKeyboard(((rg.v2) jVar).getFocusedView());
                        }
                        if (xaVar4.f9030q2) {
                            xaVar4.u0(false);
                        }
                        xaVar4.B0(xaVar4.J0);
                        xaVar4.C0(null, true);
                        return;
                    case 3:
                        xaVar.C0(null, true);
                        return;
                    default:
                        xa xaVar5 = xaVar;
                        if (xaVar5.B1) {
                            xaVar5.H0(false);
                            return;
                        } else if (xaVar5.f9030q2) {
                            xaVar5.u0(true);
                            return;
                        } else if (xaVar5.K0) {
                            xaVar5.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = xaVar5.L1;
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
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        ok.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, w7.z5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ah.f(4));
        frameLayout.addView(linearLayout, w7.z5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f9025o1 = textView2;
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
                        xa xaVar2 = xaVar;
                        v5 v5Var3 = xaVar2.O0;
                        if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof qg.l)) {
                            v5Var3.b();
                            xaVar2.f9018k1.setSelectedIndex(1);
                            xaVar2.o((qg.m) qg.m.f44564a.get(0));
                            return;
                        }
                        xaVar2.D0.c();
                        return;
                    case 1:
                        xa xaVar3 = xaVar;
                        v5 v5Var4 = xaVar3.O0;
                        qg.w1 w1Var2 = xaVar3.D0;
                        if (w1Var2.a()) {
                            if (v5Var4 != null && (v5Var4.getCurrentBrush() instanceof qg.l)) {
                                v5Var4.b();
                                xaVar3.f9018k1.setSelectedIndex(1);
                                xaVar3.o((qg.m) qg.m.f44564a.get(0));
                            }
                            if (v5Var4 != null) {
                                v5Var4.a();
                            }
                            w1Var2.f44700c.clear();
                            w1Var2.f44699b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(w1Var2, 7));
                            xaVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xa xaVar4 = xaVar;
                        rg.j jVar = xaVar4.J0;
                        if (jVar instanceof rg.v2) {
                            AndroidUtilities.hideKeyboard(((rg.v2) jVar).getFocusedView());
                        }
                        if (xaVar4.f9030q2) {
                            xaVar4.u0(false);
                        }
                        xaVar4.B0(xaVar4.J0);
                        xaVar4.C0(null, true);
                        return;
                    case 3:
                        xaVar.C0(null, true);
                        return;
                    default:
                        xa xaVar5 = xaVar;
                        if (xaVar5.B1) {
                            xaVar5.H0(false);
                            return;
                        } else if (xaVar5.f9030q2) {
                            xaVar5.u0(true);
                            return;
                        } else if (xaVar5.K0) {
                            xaVar5.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = xaVar5.L1;
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
        TextView j10 = org.telegram.ui.Cells.c1.j(frameLayout, textView2, w7.z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f9027p1 = j10;
        j10.setBackground(org.telegram.ui.ActionBar.h6.g0(822083583, 7, -1));
        j10.setPadding(org.telegram.ui.Cells.c1.e(8.0f, R.string.Clear, j10), 0, AndroidUtilities.dp(8.0f), 0);
        j10.setGravity(16);
        j10.setTextColor(-1);
        j10.setTypeface(AndroidUtilities.bold());
        j10.setTextSize(1, 16.0f);
        j10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xa xaVar2 = xaVar;
                        v5 v5Var3 = xaVar2.O0;
                        if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof qg.l)) {
                            v5Var3.b();
                            xaVar2.f9018k1.setSelectedIndex(1);
                            xaVar2.o((qg.m) qg.m.f44564a.get(0));
                            return;
                        }
                        xaVar2.D0.c();
                        return;
                    case 1:
                        xa xaVar3 = xaVar;
                        v5 v5Var4 = xaVar3.O0;
                        qg.w1 w1Var2 = xaVar3.D0;
                        if (w1Var2.a()) {
                            if (v5Var4 != null && (v5Var4.getCurrentBrush() instanceof qg.l)) {
                                v5Var4.b();
                                xaVar3.f9018k1.setSelectedIndex(1);
                                xaVar3.o((qg.m) qg.m.f44564a.get(0));
                            }
                            if (v5Var4 != null) {
                                v5Var4.a();
                            }
                            w1Var2.f44700c.clear();
                            w1Var2.f44699b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(w1Var2, 7));
                            xaVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xa xaVar4 = xaVar;
                        rg.j jVar = xaVar4.J0;
                        if (jVar instanceof rg.v2) {
                            AndroidUtilities.hideKeyboard(((rg.v2) jVar).getFocusedView());
                        }
                        if (xaVar4.f9030q2) {
                            xaVar4.u0(false);
                        }
                        xaVar4.B0(xaVar4.J0);
                        xaVar4.C0(null, true);
                        return;
                    case 3:
                        xaVar.C0(null, true);
                        return;
                    default:
                        xa xaVar5 = xaVar;
                        if (xaVar5.B1) {
                            xaVar5.H0(false);
                            return;
                        } else if (xaVar5.f9030q2) {
                            xaVar5.u0(true);
                            return;
                        } else if (xaVar5.K0) {
                            xaVar5.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = xaVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        j10.setAlpha(0.0f);
        j10.setVisibility(8);
        TextView j11 = org.telegram.ui.Cells.c1.j(frameLayout, j10, w7.z5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f9029q1 = j11;
        j11.setBackground(org.telegram.ui.ActionBar.h6.g0(822083583, 7, -1));
        j11.setPadding(org.telegram.ui.Cells.c1.e(8.0f, R.string.Done, j11), 0, AndroidUtilities.dp(8.0f), 0);
        j11.setGravity(16);
        j11.setTextColor(-1);
        j11.setTypeface(AndroidUtilities.bold());
        j11.setTextSize(1, 16.0f);
        j11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xa xaVar2 = xaVar;
                        v5 v5Var3 = xaVar2.O0;
                        if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof qg.l)) {
                            v5Var3.b();
                            xaVar2.f9018k1.setSelectedIndex(1);
                            xaVar2.o((qg.m) qg.m.f44564a.get(0));
                            return;
                        }
                        xaVar2.D0.c();
                        return;
                    case 1:
                        xa xaVar3 = xaVar;
                        v5 v5Var4 = xaVar3.O0;
                        qg.w1 w1Var2 = xaVar3.D0;
                        if (w1Var2.a()) {
                            if (v5Var4 != null && (v5Var4.getCurrentBrush() instanceof qg.l)) {
                                v5Var4.b();
                                xaVar3.f9018k1.setSelectedIndex(1);
                                xaVar3.o((qg.m) qg.m.f44564a.get(0));
                            }
                            if (v5Var4 != null) {
                                v5Var4.a();
                            }
                            w1Var2.f44700c.clear();
                            w1Var2.f44699b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(w1Var2, 7));
                            xaVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xa xaVar4 = xaVar;
                        rg.j jVar = xaVar4.J0;
                        if (jVar instanceof rg.v2) {
                            AndroidUtilities.hideKeyboard(((rg.v2) jVar).getFocusedView());
                        }
                        if (xaVar4.f9030q2) {
                            xaVar4.u0(false);
                        }
                        xaVar4.B0(xaVar4.J0);
                        xaVar4.C0(null, true);
                        return;
                    case 3:
                        xaVar.C0(null, true);
                        return;
                    default:
                        xa xaVar5 = xaVar;
                        if (xaVar5.B1) {
                            xaVar5.H0(false);
                            return;
                        } else if (xaVar5.f9030q2) {
                            xaVar5.u0(true);
                            return;
                        } else if (xaVar5.K0) {
                            xaVar5.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = xaVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        j11.setAlpha(0.0f);
        j11.setVisibility(8);
        frameLayout.addView(j11, w7.z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        qg.v0 v0Var2 = v0Var;
        b6 b6Var = new b6(xaVar, context, v0Var2);
        this.T0 = b6Var;
        b6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        b6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(b6Var, w7.z5.e(-1, 104, 80));
        rg.r1 r1Var = new rg.r1(context, (a8Var == null || a8Var.v() || a8Var.f8735u || jaVar == null) ? false : true);
        this.f9018k1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        b6Var.addView(r1Var, w7.z5.c(48.0f, -1));
        rg.o1 o1Var = new rg.o1(context);
        this.l1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        xa xaVar2 = xaVar;
                        qg.t1 t1Var3 = xaVar2.A1;
                        xaVar2.E0(t1Var3);
                        qg.v0.e(i10).j(t1Var3.f44662c);
                        return;
                    default:
                        xaVar.l1.setTypeface(qg.v0.e(i10).f44686j);
                        return;
                }
            }
        });
        o1Var.setAlignment(qg.v0.e(i10).f44684g);
        b6Var.addView(o1Var, w7.z5.c(48.0f, -1));
        f5 f5Var = new f5(xaVar, context);
        this.U0 = f5Var;
        addView(f5Var, w7.z5.c(-1.0f, -1));
        rg.t1 t1Var3 = new rg.t1(context);
        this.f9021m1 = t1Var3;
        t1Var3.setVisibility(8);
        t1Var3.setOnItemClickListener(new ai.wa(xaVar, 9));
        o1Var.setTypefaceListView(t1Var3);
        f5Var.addView(t1Var3, w7.z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint2.setColor(t5Var.w(org.telegram.ui.ActionBar.h6.G8));
        g5 g5Var = new g5(xaVar, context);
        this.f9041w1 = g5Var;
        g5Var.setVisibility(8);
        g5Var.setColorPalette(qg.v0.e(i10));
        g5Var.setColorListener(new ai.r7(xaVar, 1));
        b6Var.addView(g5Var, w7.z5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        rg.f1 f1Var = new rg.f1(context);
        this.A0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 1, -1));
        b6Var.addView(f1Var, w7.z5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        f1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xa xaVar2 = xaVar;
                        v5 v5Var3 = xaVar2.O0;
                        if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof qg.l)) {
                            v5Var3.b();
                            xaVar2.f9018k1.setSelectedIndex(1);
                            xaVar2.o((qg.m) qg.m.f44564a.get(0));
                            return;
                        }
                        xaVar2.D0.c();
                        return;
                    case 1:
                        xa xaVar3 = xaVar;
                        v5 v5Var4 = xaVar3.O0;
                        qg.w1 w1Var2 = xaVar3.D0;
                        if (w1Var2.a()) {
                            if (v5Var4 != null && (v5Var4.getCurrentBrush() instanceof qg.l)) {
                                v5Var4.b();
                                xaVar3.f9018k1.setSelectedIndex(1);
                                xaVar3.o((qg.m) qg.m.f44564a.get(0));
                            }
                            if (v5Var4 != null) {
                                v5Var4.a();
                            }
                            w1Var2.f44700c.clear();
                            w1Var2.f44699b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(w1Var2, 7));
                            xaVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xa xaVar4 = xaVar;
                        rg.j jVar = xaVar4.J0;
                        if (jVar instanceof rg.v2) {
                            AndroidUtilities.hideKeyboard(((rg.v2) jVar).getFocusedView());
                        }
                        if (xaVar4.f9030q2) {
                            xaVar4.u0(false);
                        }
                        xaVar4.B0(xaVar4.J0);
                        xaVar4.C0(null, true);
                        return;
                    case 3:
                        xaVar.C0(null, true);
                        return;
                    default:
                        xa xaVar5 = xaVar;
                        if (xaVar5.B1) {
                            xaVar5.H0(false);
                            return;
                        } else if (xaVar5.f9030q2) {
                            xaVar5.u0(true);
                            return;
                        } else if (xaVar5.K0) {
                            xaVar5.C0(null, true);
                            return;
                        } else {
                            Runnable runnable = xaVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        rg.j1 j1Var = new rg.j1(context);
        this.B0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(org.telegram.ui.ActionBar.h6.g0(1090519039, 1, -1));
        j1Var.setOnClickListener(new ai.v0(xaVar, context, v0Var2, 9));
        b6Var.addView(j1Var, w7.z5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        rg.w1 w1Var2 = new rg.w1(context);
        this.f9004d1 = w1Var2;
        qg.t1 t1Var4 = t1Var;
        w1Var2.setColorSwatch(t1Var4);
        w1Var2.setRenderView(v5Var2);
        w1Var2.setValueOverride(cVar);
        t1Var4.f44662c = cVar.get();
        w1Var2.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        xa xaVar2 = xaVar;
                        qg.t1 t1Var32 = xaVar2.A1;
                        xaVar2.E0(t1Var32);
                        qg.v0.e(i10).j(t1Var32.f44662c);
                        return;
                    default:
                        xaVar.l1.setTypeface(qg.v0.e(i10).f44686j);
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
        D0(t1Var4, null, false);
        o((qg.m) qg.m.f44564a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.O1 = new i5(xaVar, ubVar, new ai.o2(8, xaVar, ubVar));
        n2.G = i14;
    }

    public static void F0(rg.v2 v2Var, int i10) {
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

    public static void Z(xa xaVar, qg.v0 v0Var, Integer num) {
        v0Var.h(num.intValue(), true);
        v0Var.g();
        xaVar.setNewColor(num.intValue());
        xaVar.f9041w1.setSelectedColorIndex(v0Var.d());
        xaVar.T1 = null;
    }

    public static void a0(xa xaVar, Integer num) {
        xaVar.setNewColor(num.intValue());
        xaVar.H0(false);
    }

    public ViewGroup getBarView() {
        if (this.Y0 == 2) {
            return this.l1;
        }
        return this.f9018k1;
    }

    private int getFrameRotation() {
        int i10 = this.f9008f1;
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
            z5 z5Var = this.R0;
            if (i10 < z5Var.getChildCount()) {
                View childAt = z5Var.getChildAt(i10);
                if (childAt instanceof rg.o2) {
                    ImageReceiver imageReceiver = ((rg.o2) childAt).f45599x0;
                    vj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    org.telegram.ui.Components.e6 animation = imageReceiver.getAnimation();
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
                        animation.f25777y = z10;
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
        qg.t1 t1Var = this.A1;
        int i11 = t1Var.f44660a;
        t1Var.f44660a = i10;
        D0(t1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new u4(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        rg.j jVar = this.J0;
        if (jVar instanceof rg.v2) {
            ((rg.v2) jVar).setType(i10);
        }
        qg.v0 e = qg.v0.e(this.F1);
        e.h = i10;
        e.f44680a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        m5 m5Var = new m5(this, context);
        this.W0 = m5Var;
        m5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.z5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f9012h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f9012h1;
        int i10 = org.telegram.ui.ActionBar.h6.f21082i6;
        t5 t5Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i10, t5Var), 7, -1));
        this.f9012h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f9012h1.setTextColor(-1);
        this.f9012h1.setTextSize(1, 14.0f);
        this.f9012h1.setGravity(1);
        this.f9012h1.setTypeface(AndroidUtilities.bold());
        this.f9012h1.setSingleLine();
        this.f9012h1.setOnClickListener(new View.OnClickListener(this) {
            public final f6 f9511b;

            {
                this.f9511b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f6 f6Var = this.f9511b;
                        if (f6Var.K0) {
                            f6Var.C0(null, true);
                            return;
                        } else {
                            f6Var.Q0(0);
                            return;
                        }
                    case 1:
                        this.f9511b.z0();
                        return;
                    default:
                        f6 f6Var2 = this.f9511b;
                        f6Var2.Q0(2);
                        if (!(f6Var2.J0 instanceof rg.v2)) {
                            f6Var2.f9020l2 = true;
                            f6Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f9012h1, w7.z5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f9014i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f9014i1.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i10, t5Var), 7, -1));
        this.f9014i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f9014i1.setOnClickListener(new View.OnClickListener(this) {
            public final f6 f9511b;

            {
                this.f9511b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f6 f6Var = this.f9511b;
                        if (f6Var.K0) {
                            f6Var.C0(null, true);
                            return;
                        } else {
                            f6Var.Q0(0);
                            return;
                        }
                    case 1:
                        this.f9511b.z0();
                        return;
                    default:
                        f6 f6Var2 = this.f9511b;
                        f6Var2.Q0(2);
                        if (!(f6Var2.J0 instanceof rg.v2)) {
                            f6Var2.f9020l2 = true;
                            f6Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f9014i1.setTextColor(-1);
        this.f9014i1.setTextSize(1, 14.0f);
        this.f9014i1.setGravity(1);
        this.f9014i1.setTypeface(AndroidUtilities.bold());
        this.f9014i1.setAlpha(0.6f);
        this.f9014i1.setSingleLine();
        this.W0.addView(this.f9014i1, w7.z5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f9016j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f9016j1.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i10, t5Var), 7, -1));
        this.f9016j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f9016j1.setTextColor(-1);
        this.f9016j1.setTextSize(1, 14.0f);
        this.f9016j1.setGravity(1);
        this.f9016j1.setTypeface(AndroidUtilities.bold());
        this.f9016j1.setAlpha(0.6f);
        this.f9016j1.setSingleLine();
        this.f9016j1.setOnClickListener(new View.OnClickListener(this) {
            public final f6 f9511b;

            {
                this.f9511b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f6 f6Var = this.f9511b;
                        if (f6Var.K0) {
                            f6Var.C0(null, true);
                            return;
                        } else {
                            f6Var.Q0(0);
                            return;
                        }
                    case 1:
                        this.f9511b.z0();
                        return;
                    default:
                        f6 f6Var2 = this.f9511b;
                        f6Var2.Q0(2);
                        if (!(f6Var2.J0 instanceof rg.v2)) {
                            f6Var2.f9020l2 = true;
                            f6Var2.n0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f9016j1, w7.z5.l(1.0f, 0, -2));
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
        M0(new w4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0(rg.j jVar) {
        this.D0.b(jVar.getUUID(), new v4(this, jVar, 0));
    }

    public final void B0(rg.j jVar) {
        rg.j jVar2 = this.J0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            C0(null, true);
            if (jVar instanceof rg.v2) {
                ValueAnimator valueAnimator = this.f9000b1;
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
            qg.w1 w1Var = this.D0;
            w1Var.f44699b.remove(uuid);
            w1Var.f44700c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(w1Var, 7));
        }
        rg.w1 w1Var2 = this.f9004d1;
        qb.c cVar = this.f9006e1;
        w1Var2.setValueOverride(cVar);
        w1Var2.setShowPreview(true);
        float f7 = cVar.get();
        qg.t1 t1Var = this.A1;
        t1Var.f44662c = f7;
        D0(t1Var, null, false);
        if (!this.f9024n2 && (jVar instanceof rg.c2)) {
            vb vbVar = ((xa) this).A2;
            jb jbVar = vbVar.X0;
            if (jbVar != null) {
                jbVar.s(null, null, true);
            }
            xa xaVar = vbVar.f10015v1;
            if (xaVar != null) {
                xaVar.p0();
            }
            lb lbVar = vbVar.f9956c1;
            if (lbVar != null) {
                lbVar.setHasRoundVideo(false);
            }
            a8 a8Var = vbVar.K1;
            if (a8Var != null) {
                File file = a8Var.f8724o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    vbVar.K1.f8724o0 = null;
                }
                if (vbVar.K1.f8726p0 != null) {
                    try {
                        new File(vbVar.K1.f8726p0).delete();
                    } catch (Exception unused2) {
                    }
                    vbVar.K1.f8726p0 = null;
                }
            }
        }
    }

    public final boolean C0(rg.j jVar, boolean z10) {
        boolean z11;
        gc gcVar;
        gc gcVar2;
        dl0 dl0Var;
        int i10;
        boolean z12 = jVar instanceof rg.v2;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f9000b1;
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
            rg.v2 v2Var = (rg.v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            rg.o1 o1Var = this.l1;
            o1Var.setAlignment(i11);
            qg.m0 typeface = v2Var.getTypeface();
            if (typeface != null) {
                o1Var.setTypeface(typeface.f44568a);
            }
            o1Var.e(v2Var.getType(), true);
            this.U0.invalidate();
        }
        rg.j jVar2 = this.J0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f45398d0) {
                    if (jVar instanceof rg.t0) {
                        rg.t0 t0Var = (rg.t0) jVar;
                        t0Var.setType((t0Var.getType() + 1) % t0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof rg.w2) {
                        rg.w2 w2Var = (rg.w2) jVar;
                        w2Var.setType((w2Var.getType() + 1) % w2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof rg.q0) {
                        rg.q0 q0Var = (rg.q0) jVar;
                        rg.o0 o0Var = q0Var.f45611q0;
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
                        if (jVar instanceof rg.v2) {
                            this.M0 = true;
                            q0();
                            return true;
                        } else if (jVar instanceof rg.b2) {
                            rg.b2 b2Var = (rg.b2) jVar;
                            if (this.f9003c2 && this.a2 == jVar) {
                                b2Var.q(true);
                                return true;
                            }
                            rg.b2 b2Var2 = this.a2;
                            if (b2Var2 != null && b2Var2 != b2Var && (dl0Var = this.Z1) != null) {
                                dl0Var.animate().alpha(0.0f).setListener(new k5(dl0Var, 0));
                                this.Z1 = null;
                                this.f9003c2 = false;
                                this.f9001b2 = 0.0f;
                            }
                            if (this.Z1 == null) {
                                dl0 dl0Var2 = new dl0(2, this.F1, getContext(), LaunchActivity.R(), new ci.t2(6, new ci.b()));
                                this.Z1 = dl0Var2;
                                org.telegram.ui.Components.na naVar = new org.telegram.ui.Components.na(this.f9007e2, dl0Var2, 0, false);
                                this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.M1.addView(this.Z1, w7.z5.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.o(-16777216, 120));
                                dl0 dl0Var3 = this.Z1;
                                ?? obj = new Object();
                                obj.e = this;
                                obj.f6880a = naVar;
                                obj.d = paint;
                                obj.f6882c = new Path();
                                dl0Var3.setDelegate(obj);
                                this.Z1.p(null, null, true);
                            }
                            this.Z1.setFragment(LaunchActivity.R());
                            this.a2 = b2Var;
                            N0(true);
                            return true;
                        } else {
                            L0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof rg.v2) {
                        AndroidUtilities.showKeyboard(((rg.v2) jVar2).getFocusedView());
                        u0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            rg.j jVar3 = this.J0;
            if (jVar3 instanceof rg.v2) {
                rg.v2 v2Var2 = (rg.v2) jVar3;
                rg.u2 u2Var = v2Var2.f45672q0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((rg.v2) this.J0).getFocusedView());
                    u0(false);
                }
            } else if ((jVar3 instanceof rg.c2) && (gcVar2 = ((xa) this).A2.Z0) != null) {
                gcVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        rg.j jVar4 = this.J0;
        this.J0 = jVar;
        if ((jVar4 instanceof rg.v2) && TextUtils.isEmpty(((rg.v2) jVar4).getText())) {
            B0(jVar4);
        }
        rg.j jVar5 = this.J0;
        if (jVar4 != jVar5 && (jVar5 instanceof rg.c2) && (gcVar = ((xa) this).A2.Z0) != null) {
            gcVar.l(true);
        }
        rg.j jVar6 = this.J0;
        qb.c cVar = this.f9006e1;
        qg.t1 t1Var = this.A1;
        rg.w1 w1Var = this.f9004d1;
        if (jVar6 != null) {
            a6 a6Var = this.Q0;
            jVar6.m0 = a6Var;
            jVar6.l(a6Var, true);
            rg.j jVar7 = this.J0;
            if (jVar7 instanceof rg.v2) {
                rg.v2 v2Var3 = (rg.v2) jVar7;
                v2Var3.getSwatch().f44662c = t1Var.f44662c;
                v2Var3.f45681z0 = false;
                E0(v2Var3.getSwatch());
                w1Var.setValueOverride(new j5(v2Var3, (int) (this.H0.f26431a / 9.0f), 0));
                w1Var.setShowPreview(false);
            } else {
                w1Var.setValueOverride(cVar);
                w1Var.setShowPreview(true);
                t1Var.f44662c = cVar.get();
                D0(t1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f9000b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                H0(false);
            }
            Q0(0);
            w1Var.setValueOverride(cVar);
            w1Var.setShowPreview(true);
            t1Var.f44662c = cVar.get();
            D0(t1Var, null, false);
            z13 = z11;
        }
        T0();
        return z13;
    }

    @Override
    public final void D() {
        O0(true);
    }

    public final void D0(qg.t1 t1Var, Integer num, boolean z10) {
        qg.t1 t1Var2 = this.A1;
        if (t1Var2 != t1Var) {
            t1Var2.f44660a = t1Var.f44660a;
            t1Var2.f44661b = t1Var.f44661b;
            t1Var2.f44662c = t1Var.f44662c;
            int i10 = this.F1;
            qg.v0.e(i10).h(t1Var.f44660a, true);
            qg.v0.e(i10).j(t1Var.f44662c);
        }
        int i11 = t1Var.f44660a;
        v5 v5Var = this.O0;
        v5Var.setColor(i11);
        v5Var.setBrushSize(t1Var.f44662c);
        int i12 = t1Var2.f44660a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new o4(this, num, i12, 0));
            duration.start();
        } else {
            b6 b6Var = this.T0;
            if (b6Var != null) {
                b6Var.invalidate();
            }
        }
        rg.j jVar = this.J0;
        if (jVar instanceof rg.v2) {
            ((rg.v2) jVar).setSwatch(new qg.t1(t1Var.f44661b, t1Var.f44662c, t1Var.f44660a));
        } else if (z10 && (jVar instanceof rg.t0)) {
            ((rg.t0) jVar).setColor(t1Var.f44660a);
            ((rg.t0) this.J0).setType(3);
        } else if (z10 && (jVar instanceof rg.w2)) {
            ((rg.w2) jVar).setColor(t1Var.f44660a);
            ((rg.w2) this.J0).setType(3);
        } else if (z10 && (jVar instanceof rg.q0)) {
            ((rg.q0) jVar).setColor(t1Var.f44660a);
            ((rg.q0) this.J0).setType(0);
        }
    }

    public final void E0(qg.t1 t1Var) {
        D0(t1Var, null, false);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f9032r2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f9042w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f9042w2).commit();
            } else {
                this.f9040v2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f9040v2).commit();
            }
        }
        boolean z13 = this.f9030q2;
        i5 i5Var = this.O1;
        if (z13) {
            if (z10) {
                i11 = this.f9042w2;
            } else {
                i11 = this.f9040v2;
            }
            int paddingUnderContainer = this.M1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9028p2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f9028p2.setLayoutParams(layoutParams);
                this.f9036t2 = layoutParams.height;
                i5Var.a();
                requestLayout();
            }
        }
        if (this.f9044x2 == i10 && this.f9046y2 == z10) {
            return;
        }
        this.f9044x2 = i10;
        this.f9046y2 = z10;
        boolean z14 = this.f9032r2;
        rg.j jVar = this.J0;
        if (jVar instanceof rg.v2) {
            if (((rg.v2) jVar).getEditText().isFocused() && i5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f9032r2 = z12;
        } else {
            this.f9032r2 = false;
        }
        if (this.f9032r2 && this.f9030q2) {
            I0(0);
        }
        if (this.f9036t2 != 0 && !(z11 = this.f9032r2) && z11 != z14 && !this.f9030q2) {
            this.f9036t2 = 0;
            i5Var.a();
            requestLayout();
        }
        T0();
        if (z14 && !this.f9032r2 && this.f9036t2 > 0 && this.f9038u2) {
            this.f9038u2 = false;
        }
        R0();
    }

    public final void G0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        rg.j jVar;
        ArrayList arrayList = this.Q1;
        if (arrayList != null) {
            a8 a8Var = this.P1;
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
                        s5 m0 = m0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            m0.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = m0.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i10 = i11;
                        jVar = m0;
                    } else if (b10 == 1) {
                        rg.v2 n02 = n0(z10);
                        n02.setType(mediaEntity.subType);
                        n02.setTypeface(mediaEntity.textTypeface);
                        n02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        for (int i12 = z10; i12 < size2; i12++) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i12);
                            org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(emojiEntity.document_id, 1.0f, n02.getFontMetricsInt());
                            int i13 = emojiEntity.offset;
                            spannableString.setSpan(a6Var, i13, emojiEntity.length + i13, 33);
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
                        qg.t1 swatch = n02.getSwatch();
                        swatch.f44660a = mediaEntity.color;
                        n02.setSwatch(swatch);
                        jVar = n02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            rg.y1 j02 = j0(mediaEntity.text, false);
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
                            ArrayList arrayList3 = a8Var.v;
                            boolean z11 = a8Var.K;
                            this.f9020l2 = true;
                            rg.j r5Var = new r5(this, getContext(), e0(), arrayList3, this.f9007e2, z11, this.f9009f2);
                            r5Var.setDelegate(this);
                            r13.addView(r5Var);
                            f0();
                            jVar = r5Var;
                            if (mediaEntity.viewWidth > 0) {
                                jVar = r5Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = r5Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    jVar = r5Var;
                                }
                            }
                        } else if (b10 == 3) {
                            rg.t0 i02 = i0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                i02.setColor(i14);
                            }
                            i02.setType(mediaEntity.subType);
                            jVar = i02;
                        } else if (b10 == 8) {
                            tc tcVar = mediaEntity.weather;
                            if (tcVar != null) {
                                rg.w2 o02 = o0(tcVar);
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
                            rg.q0 h02 = h0(mediaEntity.linkSettings);
                            rg.o0 o0Var = h02.f45611q0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                h02.setColor(i16);
                            }
                            boolean e = o0Var.e();
                            int i17 = o0Var.h;
                            int i18 = o0Var.f45564f;
                            if (e) {
                                o0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                h02.setType(3);
                                o0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(o0Var.f45557a0)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(o0Var.f45559b0)) + i17 + i17;
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
                            rg.b2 k02 = k0(false);
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
                            if (b10 == 5 && a8Var.f8724o0 != null) {
                                rg.c2 l02 = l0(a8Var.f8726p0, false);
                                vb vbVar = ((xa) this).A2;
                                jb jbVar = vbVar.X0;
                                if (jbVar != null) {
                                    jbVar.f9733w = l02;
                                    c81 c81Var = jbVar.f9735x;
                                    if (c81Var != null) {
                                        c81Var.V(l02.f45316u0);
                                    }
                                }
                                lb lbVar = vbVar.f9956c1;
                                if (lbVar != null) {
                                    lbVar.setHasRoundVideo(true);
                                }
                                jVar = l02;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !l02.f45313r0;
                                    l02.f45313r0 = z12;
                                    l02.f45314s0.f(z12, true);
                                    l02.invalidate();
                                    jVar = l02;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f17822x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f17823y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
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
            lVar.f17565i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f17559u = lVar;
            if (!this.O1.c() && this.f9036t2 <= 0) {
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
                    f6 f6Var = f6.this;
                    b6 b6Var = f6Var.T0;
                    float f14 = f11 / 1000.0f;
                    f6Var.D1 = f14;
                    float f15 = 1.0f;
                    float f16 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f16);
                    view.setScaleY(f16);
                    view.setTranslationY((Math.min(f6Var.D1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(f6Var.D1, 0.25f) / 0.25f));
                    g5 g5Var = f6Var.f9041w1;
                    float f17 = f6Var.D1;
                    boolean z12 = z10;
                    g5Var.z1(f17, z12);
                    rg.j1 j1Var = f6Var.B0;
                    j1Var.setProgress(f6Var.D1);
                    rg.f1 f1Var = f6Var.A0;
                    f1Var.setProgress(f6Var.D1);
                    f6Var.W0.setTranslationY(AndroidUtilities.dp(32.0f) * f6Var.D1);
                    AnimatorSet animatorSet = f6Var.N1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f18 = f6Var.D1;
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
                        b6Var.setTranslationY(translationY - (dp * i10));
                    }
                    b6Var.invalidate();
                    if (view == f6Var.l1) {
                        f6Var.U0.invalidate();
                    }
                }
            });
            this.C1.a(new q4(this, z10, 0));
            this.C1.h();
            if (z10) {
                g5 g5Var = this.f9041w1;
                g5Var.setVisibility(0);
                g5Var.setSelectedColorIndex(qg.v0.e(this.F1).d());
            }
        }
    }

    public final void I0(int i10) {
        boolean z10;
        int i11;
        rg.o1 o1Var = this.l1;
        i5 i5Var = this.O1;
        if (i10 == 1) {
            tz tzVar = this.f9028p2;
            if (tzVar != null && tzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            tz tzVar2 = this.f9028p2;
            ub ubVar = this.M1;
            if (tzVar2 != null && tzVar2.f30726c1 != UserConfig.selectedAccount) {
                ubVar.removeView(tzVar2);
                this.f9028p2 = null;
            }
            if (this.f9028p2 == null) {
                tz tzVar3 = new tz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.f9028p2 = tzVar3;
                tzVar3.f30790w2 = false;
                tzVar3.U0 = true;
                tzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f9028p2.setForseMultiwindowLayout(true);
                }
                this.f9028p2.setDelegate(new u5(this));
                ubVar.addView(this.f9028p2);
            }
            this.f9028p2.setVisibility(0);
            this.f9030q2 = true;
            tz tzVar4 = this.f9028p2;
            if (this.f9040v2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f9040v2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f9040v2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f9042w2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f9042w2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f9042w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f9042w2;
            } else {
                i11 = this.f9040v2;
            }
            int paddingUnderContainer = ubVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            tzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                rg.j jVar = this.J0;
                if (jVar instanceof rg.v2) {
                    AndroidUtilities.hideKeyboard(((rg.v2) jVar).getEditText());
                }
            }
            this.f9036t2 = paddingUnderContainer;
            i5Var.a();
            requestLayout();
            ah emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            if (!z10) {
                if (this.f9032r2) {
                    this.f9038u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f9036t2, 0.0f);
                    ofFloat.addUpdateListener(new r4(this, 1));
                    ofFloat.addListener(new l5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21635w);
                    ofFloat.start();
                }
            }
        } else {
            ah emojiButton2 = o1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(yg.e, true);
            }
            tz tzVar5 = this.f9028p2;
            if (tzVar5 != null) {
                this.f9030q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    tzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f9036t2 = 0;
                i5Var.a();
            }
            requestLayout();
        }
        R0();
    }

    public final void J0(rg.q0 q0Var) {
        j8 j8Var = new j8(getContext(), this.G1, this.f9011g2, new ai.o2(10, this, q0Var));
        if (q0Var != null) {
            rg.n0 n0Var = q0Var.f45615u0;
            j8Var.f9269c0 = true;
            org.telegram.ui.Cells.i3 i3Var = j8Var.Z;
            org.telegram.ui.Cells.i3 i3Var2 = j8Var.Y;
            if (n0Var != null) {
                j8Var.f9273g0 = n0Var.d;
                j8Var.f9274h0 = false;
                i3Var2.setText(n0Var.f45522c);
                i3Var.setText(n0Var.f45521b);
                j8Var.m0 = !TextUtils.isEmpty(n0Var.f45521b);
                j8Var.f9279n0 = n0Var.f45523f;
                j8Var.f9280o0 = n0Var.e;
            } else {
                i3Var2.setText("");
                i3Var.setText("");
                j8Var.f9279n0 = true;
                j8Var.f9280o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = j8Var.f9268b0;
            dVar.g(string, false, true);
            f8 f8Var = j8Var.X;
            if (f8Var != null) {
                f8Var.N(false);
            }
            dVar.setEnabled(j8Var.W(i3Var2.getText().toString()));
            j8Var.f9269c0 = false;
        }
        j8Var.setOnDismissListener(new b5(this, 1));
        j8Var.show();
        y0(true);
    }

    public final void K0(rg.t0 t0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ti tiVar = new ti(getContext(), new p5(this, callback2), false, true, false, this.G1);
        tiVar.f30541c2 = new Object();
        wh whVar = tiVar.A1;
        if (t0Var != null && (messageMedia = t0Var.f45653u0) != null && (geoPoint = messageMedia.geo) != null) {
            tiVar.A2 = new double[]{geoPoint.lat, geoPoint._long};
            tiVar.O = true;
            whVar.setVisibility(8);
        } else if (this.U1) {
            tiVar.f30612y2 = this.W1;
            tiVar.f30615z2 = this.V1;
            tiVar.O = true;
            whVar.setVisibility(8);
        } else {
            tiVar.O = true;
            whVar.setVisibility(8);
        }
        tiVar.setOnDismissListener(new b5(this, 0));
        tiVar.t1();
        tiVar.show();
    }

    public final void L0(rg.j jVar) {
        if (jVar instanceof rg.e1) {
            org.telegram.ui.ActionBar.m1 m1Var = this.H1;
            if (m1Var != null && m1Var.isShowing()) {
                this.H1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f9026o2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        z5 z5Var = this.R0;
        float scaleX2 = z5Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = z5Var.getScaleY() * scaleY * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        M0(new v4(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void M0(Runnable runnable, f6 f6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.m1 m1Var = this.H1;
        if (m1Var != null && m1Var.isShowing()) {
            this.H1.d(true);
            return;
        }
        if (this.I1 == null) {
            this.J1 = new Rect();
            d6 d6Var = new d6(this, getContext());
            this.I1 = d6Var;
            d6Var.setAnimationEnabled(true);
            this.I1.setOnTouchListener(new x4(this, 0));
            this.I1.setDispatchKeyEventListener(new y4(this));
            this.I1.setShownFromBottom(true);
        }
        d6 d6Var2 = this.I1;
        d6Var2.W = z10;
        d6Var2.d();
        runnable.run();
        if (this.H1 == null) {
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(this.I1, -2, -2);
            this.H1 = m1Var2;
            m1Var2.f21579b = true;
            m1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.H1.setOutsideTouchable(true);
            this.H1.setClippingEnabled(true);
            this.H1.setInputMethodMode(2);
            this.H1.setSoftInputMode(0);
            this.H1.getContentView().setFocusableInTouchMode(true);
            this.H1.setOnDismissListener(new z4(this, 0));
        }
        this.I1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.H1.setFocusable(true);
        int measuredWidth = i11 - (this.I1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.I1.getMeasuredHeight();
        this.H1.showAtLocation(f6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.m1.i(this.I1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            d6 d6Var3 = this.I1;
            d6Var3.setBackgroundDrawable(new org.telegram.ui.Components.ma(new org.telegram.ui.Components.na(this.f9007e2, d6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.I1.setBackgroundDrawable(mutate);
        this.I1.setBackgroundColor(-14145495);
    }

    public final void N0(boolean z10) {
        if (this.f9003c2 != z10) {
            if (z10 || this.Z1 != null) {
                this.f9003c2 = z10;
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
                    this.f9005d2 = true;
                    this.M1.invalidate();
                    float f10 = this.f9001b2;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.Z1.setTransitionProgress(this.f9001b2);
                    ofFloat.addUpdateListener(new r4(this, 2));
                    ofFloat.addListener(new ah.p0(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(bs.f25025g);
                    ofFloat.start();
                    return;
                }
                if (this.Z1.getReactionsWindow() != null) {
                    this.Z1.getReactionsWindow().e();
                }
                this.Z1.animate().alpha(0.0f).setDuration(150L).setListener(new l5(this, 0)).start();
            }
        }
    }

    public final void O0(boolean z10) {
        float f7;
        if (this.f9037u1 != z10) {
            this.f9037u1 = z10;
            o1.k kVar = this.f9039v1;
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
            this.f9039v1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f17565i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f17559u = lVar;
            if (z10) {
                rg.t1 t1Var = this.f9021m1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.f9039v1.b(new ci.l8(1, this));
            this.f9039v1.a(new q4(this, z10, 1));
            this.f9039v1.h();
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
                z5 z5Var = this.R0;
                if (i11 >= z5Var.getChildCount()) {
                    break;
                }
                View childAt = z5Var.getChildAt(i11);
                if (!(childAt instanceof rg.j) || (childAt instanceof rg.e1)) {
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
            ValueAnimator valueAnimator = this.f9000b1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.Y0;
            ViewGroup viewGroup3 = this.l1;
            ViewGroup viewGroup4 = this.f9018k1;
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
            qg.v0 e = qg.v0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f44688l != z10) {
                e.f44688l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f44680a.getInt("brush", 0), false);
                }
            }
            int c10 = qg.v0.e(i12).c();
            qg.t1 t1Var = this.A1;
            t1Var.f44660a = c10;
            D0(t1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f9000b1 = duration;
            duration.setInterpolator(bs.f25024f);
            this.f9000b1.addUpdateListener(new ci.o3(this, viewGroup, viewGroup2, 1));
            this.f9000b1.addListener(new n5(this, viewGroup, viewGroup2, i10, 0));
            this.f9000b1.start();
        }
    }

    @Override
    public final int R() {
        return this.O1.f8784l - this.M1.getBottomPadding2();
    }

    public final void R0() {
        boolean z10;
        i5 i5Var = this.O1;
        rg.o1 o1Var = this.l1;
        if (o1Var != null) {
            if (i5Var.c()) {
                o1Var.a(R.drawable.input_smile);
            } else if (this.f9030q2) {
                o1Var.a(R.drawable.input_keyboard);
            } else {
                o1Var.a(R.drawable.msg_add);
            }
        }
        if (!i5Var.c() && !this.f9030q2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        boolean z12 = !z11;
        AndroidUtilities.updateViewShow(this.f9025o1, z12, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f9023n1, z12, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f9029q1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f9027p1, z11, false, 1.0f, true, null);
    }

    public final void S0() {
        float f7;
        rg.j jVar;
        ObjectAnimator objectAnimator = this.f9015i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        i5 i5Var = this.O1;
        if (((i5Var.c() && !i5Var.d) || this.f9036t2 > 0) && (jVar = this.J0) != null) {
            f7 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.f9015i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f9015i2.setInterpolator(bs.h);
        this.f9015i2.start();
    }

    public final void T0() {
        throw new UnsupportedOperationException("Method not decompiled: ei.f6.T0():void");
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
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new ci.v7(26, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f9022m2) {
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
        if (jVar instanceof rg.v2) {
            F0((rg.v2) jVar, i10);
            qg.v0 e = qg.v0.e(this.F1);
            e.f44684g = i10;
            e.f44680a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final PointF e0() {
        z5 z5Var = this.R0;
        int measuredWidth = z5Var.getMeasuredWidth();
        int measuredHeight = z5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.S1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public final void f0() {
        org.telegram.ui.Components.a6[] a6VarArr;
        boolean z10 = this.W1;
        z5 z5Var = this.R0;
        boolean z11 = true;
        if (!z10 && !this.Y1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < z5Var.getChildCount()) {
                    View childAt = z5Var.getChildAt(i10);
                    boolean z12 = childAt instanceof rg.v2;
                    int i11 = this.F1;
                    if (z12) {
                        CharSequence text = ((rg.v2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.a6 a6Var : (org.telegram.ui.Components.a6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.a6.class)) {
                                TLRPC.Document document = a6Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.r5.f(i11, a6Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.r5.h(i11).e(document);
                                }
                                if (a8.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i10++;
                    } else if (childAt instanceof rg.o2) {
                        TLRPC.Document sticker = ((rg.o2) childAt).getSticker();
                        if (a8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof rg.c2) {
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
        for (int i12 = 0; i12 < z5Var.getChildCount(); i12++) {
            View childAt2 = z5Var.getChildAt(i12);
            if (childAt2 instanceof rg.j) {
                ((rg.j) childAt2).setIsVideo(z11);
            }
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
        return this.f9010g1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.a6[] a6VarArr;
        z5 z5Var = this.R0;
        int childCount = z5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = z5Var.getChildAt(i10);
            if (childAt instanceof rg.o2) {
                TLRPC.Document sticker = ((rg.o2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f20291id = sticker.f20285id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof rg.v2) {
                CharSequence text = ((rg.v2) childAt).getText();
                if ((text instanceof Spanned) && (a6VarArr = (org.telegram.ui.Components.a6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.a6.class)) != null) {
                    for (org.telegram.ui.Components.a6 a6Var : a6VarArr) {
                        if (a6Var != null) {
                            TLRPC.Document document = a6Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.r5.f(this.F1, a6Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f20291id = document.f20285id;
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

    public qg.f1 getRenderView() {
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
        return this.f9004d1;
    }

    @Override
    public final void h(rg.j jVar) {
        N0(false);
        L0(jVar);
    }

    public final rg.q0 h0(rg.n0 n0Var) {
        int measuredWidth;
        int i10;
        this.f9020l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        z5 z5Var = this.R0;
        if (z5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = z5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.q0 q0Var = new rg.q0(getContext(), P0, this.F1, n0Var, f7 / 360.0f, dp);
        if (P0.x == z5Var.getMeasuredWidth() / 2.0f) {
            q0Var.setStickyX(2);
        }
        if (P0.y == z5Var.getMeasuredHeight() / 2.0f) {
            q0Var.setStickyY(2);
        }
        qg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.f44660a) != -47814) {
            q0Var.setColor(i10);
        }
        q0Var.setDelegate(this);
        q0Var.setMaxWidth(dp);
        z5Var.addView(q0Var, w7.z5.c(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            q0Var.j(1.0f / cropState.cropScale);
            q0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return q0Var;
    }

    public final rg.t0 i0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f9020l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        z5 z5Var = this.R0;
        if (z5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = z5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.t0 t0Var = new rg.t0(getContext(), P0, this.F1, messageMedia, mediaArea, f7 / 240.0f, dp);
        if (P0.x == z5Var.getMeasuredWidth() / 2.0f) {
            t0Var.setStickyX(2);
        }
        if (P0.y == z5Var.getMeasuredHeight() / 2.0f) {
            t0Var.setStickyY(2);
        }
        qg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.f44660a) != -47814) {
            t0Var.setColor(i10);
        }
        t0Var.setDelegate(this);
        t0Var.setMaxWidth(dp);
        z5Var.addView(t0Var, w7.z5.c(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            t0Var.j(1.0f / cropState.cropScale);
            t0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return t0Var;
    }

    public final rg.y1 j0(String str, boolean z10) {
        float f7;
        fw0 fw0Var;
        this.f9020l2 = true;
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
        z5 z5Var = this.R0;
        if (i10 > 0) {
            float floor = (float) Math.floor(Math.max(this.R1, z5Var.getMeasuredWidth()) * 0.5d);
            fw0Var = new fw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, z5Var.getMeasuredHeight()) * 0.5d);
            fw0Var = new fw0(f7 * floor2, floor2);
        }
        fw0 fw0Var2 = fw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = fw0Var2.f26431a;
            fw0Var2.f26431a = fw0Var2.f26432b;
            fw0Var2.f26432b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        rg.y1 y1Var = new rg.y1(context, e02, fw0Var2, str, intValue);
        y1Var.setDelegate(this);
        z5Var.addView(y1Var);
        f0();
        return y1Var;
    }

    public final rg.b2 k0(boolean z10) {
        String str;
        fw0 fw0Var = new fw0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        z5 z5Var = this.R0;
        if (z5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < z5Var.getChildCount(); i10++) {
                    View childAt = z5Var.getChildAt(i10);
                    if (v7.f7.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (z5Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (z5Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, z5Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, z5Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new rg.j(getContext(), e02);
        jVar.f45300r0 = new ci.g9(jVar);
        jVar.f45301s0 = new ci.g9(jVar);
        jVar.f45302t0 = new ah.y0(jVar);
        jVar.f45303u0 = new ah.y0(jVar);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6((View) jVar);
        jVar.f45305w0 = f6Var;
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6((View) jVar);
        jVar.f45306x0 = f6Var2;
        jVar.f45308z0 = 1.0f;
        jVar.f45299q0 = fw0Var;
        f6Var2.d(1.0f, true);
        f6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        ah.y0 y0Var = jVar.f45302t0;
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
        jVar.f45304v0 = b10;
        y0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        z5Var.addView(jVar);
        f0();
        if (z10) {
            A0(jVar);
            C0(jVar, true);
        }
        return jVar;
    }

    @Override
    public final boolean l(MotionEvent motionEvent) {
        if (this.f9022m2) {
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

    public final rg.c2 l0(String str, boolean z10) {
        float f7;
        this.f9020l2 = true;
        this.f9024n2 = true;
        p0();
        z5 z5Var = this.R0;
        int measuredWidth = z5Var.getMeasuredWidth();
        z5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        fw0 fw0Var = new fw0(floor, floor);
        rg.c2 c2Var = new rg.c2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (fw0Var.f26432b / 2.0f) + AndroidUtilities.dp(72.0f)), fw0Var, str);
        c2Var.setDelegate(this);
        z5Var.addView(c2Var);
        f0();
        if (z10) {
            A0(c2Var);
            post(new m4(this, c2Var, 0));
        }
        this.f9024n2 = false;
        return c2Var;
    }

    public final s5 m0(Object obj, TLRPC.Document document) {
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
        e6 e6Var = new e6(e0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f26431a * 0.5d);
        s5 s5Var = new s5(this, context, e6Var.f8958a, e6Var.f8960c, e6Var.f8959b, new fw0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = s5Var.f45599x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        s5Var.setDelegate(this);
        this.R0.addView(s5Var);
        f0();
        return s5Var;
    }

    public final rg.v2 n0(boolean z10) {
        fw0 paintingSize = getPaintingSize();
        PointF P0 = P0(null);
        rg.v2 v2Var = new rg.v2(getContext(), P0, (int) (paintingSize.f26431a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.f26431a / 9.0f;
        w4 w4Var = new w4(this, 0);
        v2Var.f45678w0 = (int) (0.5f * f7);
        v2Var.f45679x0 = (int) (f7 * 2.0f);
        v2Var.f45680y0 = w4Var;
        float f10 = P0.x;
        z5 z5Var = this.R0;
        if (f10 == z5Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (P0.y == z5Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        v2Var.setTypeface(qg.v0.e(i10).f44686j);
        v2Var.setType(qg.v0.e(i10).h);
        z5Var.addView(v2Var, w7.z5.c(-2.0f, -2));
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
            int i11 = qg.v0.e(i10).f44684g;
            rg.o1 o1Var = this.l1;
            o1Var.d(i11, true);
            o1Var.setOutlineType(qg.v0.e(i10).h);
        }
        return v2Var;
    }

    @Override
    public final void o(qg.m mVar) {
        boolean z10 = mVar instanceof qg.b;
        rg.w1 w1Var = this.f9004d1;
        if (!z10 && !(mVar instanceof qg.d)) {
            w1Var.b(0.05f, 1.0f);
        } else {
            w1Var.b(0.4f, 1.75f);
        }
        w1Var.setDrawCenter(!(mVar instanceof qg.l));
        v5 v5Var = this.O0;
        if (v5Var.getCurrentBrush() instanceof qg.l) {
            this.f9002c1 = true;
        }
        v5Var.setBrush(mVar);
        qg.t1 t1Var = this.A1;
        int i10 = t1Var.f44660a;
        t1Var.f44660a = qg.v0.e(this.F1).c();
        t1Var.f44662c = this.f9006e1.get();
        D0(t1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    public final rg.w2 o0(tc tcVar) {
        int measuredWidth;
        int i10;
        this.f9020l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        z5 z5Var = this.R0;
        if (z5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = z5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.w2 w2Var = new rg.w2(getContext(), P0, this.F1, tcVar, f7 / 240.0f, dp);
        if (P0.x == z5Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (P0.y == z5Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        qg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.f44660a) != -47814) {
            w2Var.setColor(i10);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth(dp);
        z5Var.addView(w2Var, w7.z5.c(-2.0f, -2));
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
        dl0 dl0Var = this.Z1;
        if (dl0Var != null) {
            AndroidUtilities.removeFromParent(dl0Var);
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
        float f11 = this.H0.f26431a;
        rg.j jVar = this.J0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.T0, i10, i11);
        measureChild(this.f9004d1, i10, i11);
        measureChild(this.V0, i10, i11);
        measureChild(this.U0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f9036t2 - this.M1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.S0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.G0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f9030q2 && !this.f9034s2) {
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
            z5 z5Var = this.R0;
            if (i10 < z5Var.getChildCount()) {
                View childAt = z5Var.getChildAt(i10);
                if (childAt instanceof rg.c2) {
                    if (this.J0 == childAt) {
                        C0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(bs.h).withEndAction(new m4(this, (rg.c2) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean q() {
        return !(this.J0 instanceof rg.e1);
    }

    public abstract void q0();

    @Override
    public final boolean r() {
        return !this.K0;
    }

    public final rg.e1 r0() {
        int i10 = 0;
        while (true) {
            z5 z5Var = this.R0;
            if (i10 < z5Var.getChildCount()) {
                View childAt = z5Var.getChildAt(i10);
                if (childAt instanceof rg.e1) {
                    return (rg.e1) childAt;
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

    public final android.graphics.Bitmap s0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, ei.a8 r46) {
        throw new UnsupportedOperationException("Method not decompiled: ei.f6.s0(java.util.ArrayList, boolean, boolean, boolean, boolean, ei.a8):android.graphics.Bitmap");
    }

    public void setBlurManager(org.telegram.ui.Components.ja jaVar) {
        this.f9007e2 = jaVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f9022m2 != z10) {
            this.f9022m2 = z10;
            if (z10) {
                C0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            z5 z5Var = this.R0;
            if (i10 < z5Var.getChildCount()) {
                View childAt = z5Var.getChildAt(i10);
                if (childAt instanceof rg.o2) {
                    ImageReceiver imageReceiver = ((rg.o2) childAt).f45599x0;
                    vj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        if (!this.f9032r2 && !this.f9030q2) {
            this.f9020l2 = true;
            n0(true);
            return;
        }
        if (this.f9030q2) {
            rg.j jVar = this.J0;
            if (jVar instanceof rg.v2) {
                this.O1.e = true;
                AndroidUtilities.showKeyboard(((rg.v2) jVar).getEditText());
            }
        }
        I0(!this.f9030q2 ? 1 : 0);
    }

    public final boolean t0() {
        if (!this.D0.a() && !this.f9020l2) {
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
        if (this.f9030q2) {
            I0(0);
        }
        if (z10) {
            tz tzVar = this.f9028p2;
            if (tzVar != null && tzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f9028p2.getMeasuredHeight());
                ofFloat.addUpdateListener(new r4(this, 0));
                this.f9034s2 = true;
                ofFloat.addListener(new l5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21635w);
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
        tz tzVar;
        if (!this.f9030q2 && (tzVar = this.f9028p2) != null && tzVar.getVisibility() != 8) {
            this.f9028p2.setVisibility(8);
        }
        int i10 = this.f9036t2;
        this.f9036t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    @Override
    public final int[] w(rg.j jVar) {
        int[] iArr = this.f9026o2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    @Override
    public final qg.v0 x() {
        return qg.v0.e(this.F1);
    }

    public final boolean x0() {
        if (this.f9003c2) {
            if (this.Z1.getReactionsWindow() != null && !this.Z1.getReactionsWindow().f881q) {
                this.Z1.e();
                return true;
            }
            N0(false);
            return true;
        } else if (this.B1) {
            H0(false);
            return true;
        } else if (this.f9030q2) {
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
        postDelayed(new ah.j(this, 13), 350L);
        o5 o5Var = new o5(this, getContext(), this.G1, i10);
        this.f9019k2 = o5Var;
        ub ubVar = this.M1;
        Objects.requireNonNull(ubVar);
        o5Var.f9505w = new ai.q(ubVar, 17);
        final boolean[] zArr = {true};
        o5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                f6 f6Var = f6.this;
                f6Var.f9019k2 = null;
                if (zArr[0]) {
                    f6Var.y0(false);
                }
                f6Var.Q0(i10);
            }
        });
        o5Var.f9507y = new y4(this);
        o5Var.r0(new e5(this, zArr, o5Var, 0));
        o5Var.show();
        y0(true);
    }

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f7) {
    }
}
