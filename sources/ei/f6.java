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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wh;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
public abstract class f6 extends pw0 implements rg.r1, rg.h, rg.n1, nw0, rb {
    public final rg.g1 A0;
    public final qg.s1 A1;
    public final rg.k1 B0;
    public boolean B1;
    public final Bitmap C0;
    public o1.k C1;
    public final qg.v1 D0;
    public float D1;
    public final DispatchQueue E0;
    public final Paint E1;
    public final MediaController.CropState F0;
    public final int F1;
    public boolean G0;
    public final t5 G1;
    public iw0 H0;
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
    public gl0 Z1;
    public float f9010a1;
    public rg.c2 a2;
    public ValueAnimator f9011b1;
    public float f9012b2;
    public boolean f9013c1;
    public boolean f9014c2;
    public final rg.x1 f9015d1;
    public boolean f9016d2;
    public final qb.c f9017e1;
    public org.telegram.ui.Components.ja f9018e2;
    public final int f9019f1;
    public final q6 f9020f2;
    public BigInteger f9021g1;
    public final r6 f9022g2;
    public TextView f9023h1;
    public boolean f9024h2;
    public TextView f9025i1;
    public ObjectAnimator f9026i2;
    public TextView f9027j1;
    public final float[] f9028j2;
    public final rg.s1 f9029k1;
    public o5 f9030k2;
    public final rg.p1 l1;
    public boolean f9031l2;
    public final rg.u1 f9032m1;
    public boolean f9033m2;
    public final ImageView f9034n1;
    public boolean f9035n2;
    public final TextView f9036o1;
    public final int[] f9037o2;
    public final TextView f9038p1;
    public tz f9039p2;
    public final TextView f9040q1;
    public boolean f9041q2;
    public final Paint f9042r1;
    public boolean f9043r2;
    public final Paint f9044s1;
    public boolean f9045s2;
    public float f9046t1;
    public int f9047t2;
    public boolean f9048u1;
    public boolean f9049u2;
    public o1.k f9050v1;
    public int f9051v2;
    public final g5 f9052w1;
    public int f9053w2;
    public final Paint f9054x1;
    public int f9055x2;
    public final Paint f9056y1;
    public boolean f9057y2;
    public final Paint f9058z1;

    public f6(Context context, boolean z10, File file, boolean z11, boolean z12, ub ubVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, a8 a8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ja jaVar, org.telegram.ui.ActionBar.g6 g6Var, q6 q6Var, r6 r6Var) {
        super(context, activity);
        v5 v5Var;
        qg.s1 s1Var;
        org.telegram.ui.Components.ja jaVar2;
        qg.u0 u0Var;
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
        this.f9017e1 = cVar;
        Paint paint3 = new Paint(1);
        this.f9042r1 = paint3;
        Paint paint4 = new Paint(1);
        this.f9044s1 = paint4;
        this.f9054x1 = new Paint(1);
        this.f9056y1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f9058z1 = paint5;
        qg.s1 s1Var2 = new qg.s1(1.0f, 0.016773745f, -1);
        this.A1 = s1Var2;
        this.E1 = new Paint(1);
        this.f9028j2 = new float[2];
        this.f9033m2 = false;
        this.f9037o2 = new int[2];
        new androidx.activity.i(xaVar, 18);
        setDelegate(this);
        this.f9018e2 = jaVar;
        this.f9020f2 = q6Var;
        this.U1 = z10;
        this.V1 = file;
        this.W1 = z11;
        this.X1 = z12;
        this.M1 = ubVar;
        this.R1 = i12;
        this.S1 = i13;
        this.f9022g2 = r6Var;
        this.F1 = i10;
        t5 t5Var = new t5(g6Var);
        this.G1 = t5Var;
        this.F0 = cropState;
        this.N0 = context instanceof BubbleActivity;
        qg.u0 e = qg.u0.e(i10);
        e.i(0, true);
        s1Var2.f45066a = e.c();
        s1Var2.f45068c = e.f45096i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.E0 = dispatchQueue2;
        this.C0 = bitmap;
        this.f9019f1 = i11;
        qg.v1 v1Var = new qg.v1();
        this.D0 = v1Var;
        v1Var.f45105a = new e1.c(xaVar, 6);
        View view = new View(context);
        this.X0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        qg.s0 s0Var = new qg.s0(getPaintingSize(), null, i11, jaVar);
        if (a8Var == null || !a8Var.f8744u) {
            s1Var = s1Var2;
            jaVar2 = jaVar;
            u0Var = e;
            dispatchQueue = dispatchQueue2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            v5Var2 = v5Var;
        } else {
            s1Var = s1Var2;
            jaVar2 = null;
            u0Var = e;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            v5Var2 = v5Var;
            dispatchQueue = dispatchQueue2;
        }
        v5Var2 = new v5(xaVar, context, s0Var, bitmap3, bitmap2, jaVar2);
        this.O0 = v5Var2;
        v5Var2.setDelegate(new w5(xaVar));
        v5Var2.setUndoStore(v1Var);
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
            F0();
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
        this.f9034n1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xa xaVar2 = xaVar;
                        v5 v5Var3 = xaVar2.O0;
                        if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof qg.l)) {
                            v5Var3.b();
                            xaVar2.f9029k1.setSelectedIndex(1);
                            xaVar2.n((qg.m) qg.m.f44984a.get(0));
                            return;
                        }
                        xaVar2.D0.c();
                        return;
                    case 1:
                        xa xaVar3 = xaVar;
                        v5 v5Var4 = xaVar3.O0;
                        qg.v1 v1Var2 = xaVar3.D0;
                        if (v1Var2.a()) {
                            if (v5Var4 != null && (v5Var4.getCurrentBrush() instanceof qg.l)) {
                                v5Var4.b();
                                xaVar3.f9029k1.setSelectedIndex(1);
                                xaVar3.n((qg.m) qg.m.f44984a.get(0));
                            }
                            if (v5Var4 != null) {
                                v5Var4.a();
                            }
                            v1Var2.f45107c.clear();
                            v1Var2.f45106b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var2, 7));
                            xaVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xa xaVar4 = xaVar;
                        rg.j jVar = xaVar4.J0;
                        if (jVar instanceof rg.w2) {
                            AndroidUtilities.hideKeyboard(((rg.w2) jVar).getFocusedView());
                        }
                        if (xaVar4.f9041q2) {
                            xaVar4.t0(false);
                        }
                        xaVar4.A0(xaVar4.J0);
                        xaVar4.B0(null, true);
                        return;
                    case 3:
                        xaVar.B0(null, true);
                        return;
                    default:
                        xa xaVar5 = xaVar;
                        if (xaVar5.B1) {
                            xaVar5.G0(false);
                            return;
                        } else if (xaVar5.f9041q2) {
                            xaVar5.t0(true);
                            return;
                        } else if (xaVar5.K0) {
                            xaVar5.B0(null, true);
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
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        sl.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, w7.z5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ah.f(4));
        frameLayout.addView(linearLayout, w7.z5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f9036o1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.k6.g0(822083583, 7, -1));
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
                            xaVar2.f9029k1.setSelectedIndex(1);
                            xaVar2.n((qg.m) qg.m.f44984a.get(0));
                            return;
                        }
                        xaVar2.D0.c();
                        return;
                    case 1:
                        xa xaVar3 = xaVar;
                        v5 v5Var4 = xaVar3.O0;
                        qg.v1 v1Var2 = xaVar3.D0;
                        if (v1Var2.a()) {
                            if (v5Var4 != null && (v5Var4.getCurrentBrush() instanceof qg.l)) {
                                v5Var4.b();
                                xaVar3.f9029k1.setSelectedIndex(1);
                                xaVar3.n((qg.m) qg.m.f44984a.get(0));
                            }
                            if (v5Var4 != null) {
                                v5Var4.a();
                            }
                            v1Var2.f45107c.clear();
                            v1Var2.f45106b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var2, 7));
                            xaVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xa xaVar4 = xaVar;
                        rg.j jVar = xaVar4.J0;
                        if (jVar instanceof rg.w2) {
                            AndroidUtilities.hideKeyboard(((rg.w2) jVar).getFocusedView());
                        }
                        if (xaVar4.f9041q2) {
                            xaVar4.t0(false);
                        }
                        xaVar4.A0(xaVar4.J0);
                        xaVar4.B0(null, true);
                        return;
                    case 3:
                        xaVar.B0(null, true);
                        return;
                    default:
                        xa xaVar5 = xaVar;
                        if (xaVar5.B1) {
                            xaVar5.G0(false);
                            return;
                        } else if (xaVar5.f9041q2) {
                            xaVar5.t0(true);
                            return;
                        } else if (xaVar5.K0) {
                            xaVar5.B0(null, true);
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
        TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout, textView2, w7.z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f9038p1 = j10;
        j10.setBackground(org.telegram.ui.ActionBar.k6.g0(822083583, 7, -1));
        j10.setPadding(org.telegram.ui.Cells.b1.e(8.0f, R.string.Clear, j10), 0, AndroidUtilities.dp(8.0f), 0);
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
                            xaVar2.f9029k1.setSelectedIndex(1);
                            xaVar2.n((qg.m) qg.m.f44984a.get(0));
                            return;
                        }
                        xaVar2.D0.c();
                        return;
                    case 1:
                        xa xaVar3 = xaVar;
                        v5 v5Var4 = xaVar3.O0;
                        qg.v1 v1Var2 = xaVar3.D0;
                        if (v1Var2.a()) {
                            if (v5Var4 != null && (v5Var4.getCurrentBrush() instanceof qg.l)) {
                                v5Var4.b();
                                xaVar3.f9029k1.setSelectedIndex(1);
                                xaVar3.n((qg.m) qg.m.f44984a.get(0));
                            }
                            if (v5Var4 != null) {
                                v5Var4.a();
                            }
                            v1Var2.f45107c.clear();
                            v1Var2.f45106b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var2, 7));
                            xaVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xa xaVar4 = xaVar;
                        rg.j jVar = xaVar4.J0;
                        if (jVar instanceof rg.w2) {
                            AndroidUtilities.hideKeyboard(((rg.w2) jVar).getFocusedView());
                        }
                        if (xaVar4.f9041q2) {
                            xaVar4.t0(false);
                        }
                        xaVar4.A0(xaVar4.J0);
                        xaVar4.B0(null, true);
                        return;
                    case 3:
                        xaVar.B0(null, true);
                        return;
                    default:
                        xa xaVar5 = xaVar;
                        if (xaVar5.B1) {
                            xaVar5.G0(false);
                            return;
                        } else if (xaVar5.f9041q2) {
                            xaVar5.t0(true);
                            return;
                        } else if (xaVar5.K0) {
                            xaVar5.B0(null, true);
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
        TextView j11 = org.telegram.ui.Cells.b1.j(frameLayout, j10, w7.z5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f9040q1 = j11;
        j11.setBackground(org.telegram.ui.ActionBar.k6.g0(822083583, 7, -1));
        j11.setPadding(org.telegram.ui.Cells.b1.e(8.0f, R.string.Done, j11), 0, AndroidUtilities.dp(8.0f), 0);
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
                            xaVar2.f9029k1.setSelectedIndex(1);
                            xaVar2.n((qg.m) qg.m.f44984a.get(0));
                            return;
                        }
                        xaVar2.D0.c();
                        return;
                    case 1:
                        xa xaVar3 = xaVar;
                        v5 v5Var4 = xaVar3.O0;
                        qg.v1 v1Var2 = xaVar3.D0;
                        if (v1Var2.a()) {
                            if (v5Var4 != null && (v5Var4.getCurrentBrush() instanceof qg.l)) {
                                v5Var4.b();
                                xaVar3.f9029k1.setSelectedIndex(1);
                                xaVar3.n((qg.m) qg.m.f44984a.get(0));
                            }
                            if (v5Var4 != null) {
                                v5Var4.a();
                            }
                            v1Var2.f45107c.clear();
                            v1Var2.f45106b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var2, 7));
                            xaVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xa xaVar4 = xaVar;
                        rg.j jVar = xaVar4.J0;
                        if (jVar instanceof rg.w2) {
                            AndroidUtilities.hideKeyboard(((rg.w2) jVar).getFocusedView());
                        }
                        if (xaVar4.f9041q2) {
                            xaVar4.t0(false);
                        }
                        xaVar4.A0(xaVar4.J0);
                        xaVar4.B0(null, true);
                        return;
                    case 3:
                        xaVar.B0(null, true);
                        return;
                    default:
                        xa xaVar5 = xaVar;
                        if (xaVar5.B1) {
                            xaVar5.G0(false);
                            return;
                        } else if (xaVar5.f9041q2) {
                            xaVar5.t0(true);
                            return;
                        } else if (xaVar5.K0) {
                            xaVar5.B0(null, true);
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
        qg.u0 u0Var2 = u0Var;
        b6 b6Var = new b6(xaVar, context, u0Var2);
        this.T0 = b6Var;
        b6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        b6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(b6Var, w7.z5.e(-1, 104, 80));
        rg.s1 s1Var3 = new rg.s1(context, (a8Var == null || a8Var.v() || a8Var.f8744u || jaVar == null) ? false : true);
        this.f9029k1 = s1Var3;
        s1Var3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        s1Var3.setDelegate(this);
        s1Var3.setSelectedIndex(1);
        b6Var.addView(s1Var3, w7.z5.c(48.0f, -1));
        rg.p1 p1Var = new rg.p1(context);
        this.l1 = p1Var;
        p1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        p1Var.setVisibility(8);
        p1Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        xa xaVar2 = xaVar;
                        qg.s1 s1Var4 = xaVar2.A1;
                        xaVar2.D0(s1Var4);
                        qg.u0.e(i10).j(s1Var4.f45068c);
                        return;
                    default:
                        xaVar.l1.setTypeface(qg.u0.e(i10).f45097j);
                        return;
                }
            }
        });
        p1Var.setAlignment(qg.u0.e(i10).f45095g);
        b6Var.addView(p1Var, w7.z5.c(48.0f, -1));
        f5 f5Var = new f5(xaVar, context);
        this.U0 = f5Var;
        addView(f5Var, w7.z5.c(-1.0f, -1));
        rg.u1 u1Var = new rg.u1(context);
        this.f9032m1 = u1Var;
        u1Var.setVisibility(8);
        u1Var.setOnItemClickListener(new ai.xa(xaVar, 9));
        p1Var.setTypefaceListView(u1Var);
        f5Var.addView(u1Var, w7.z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint2.setColor(t5Var.g(org.telegram.ui.ActionBar.k6.G8));
        g5 g5Var = new g5(xaVar, context);
        this.f9052w1 = g5Var;
        g5Var.setVisibility(8);
        g5Var.setColorPalette(qg.u0.e(i10));
        g5Var.setColorListener(new ai.r7(xaVar, 1));
        b6Var.addView(g5Var, w7.z5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        rg.g1 g1Var = new rg.g1(context);
        this.A0 = g1Var;
        g1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        g1Var.setBackground(org.telegram.ui.ActionBar.k6.g0(1090519039, 1, -1));
        b6Var.addView(g1Var, w7.z5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        g1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xa xaVar2 = xaVar;
                        v5 v5Var3 = xaVar2.O0;
                        if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof qg.l)) {
                            v5Var3.b();
                            xaVar2.f9029k1.setSelectedIndex(1);
                            xaVar2.n((qg.m) qg.m.f44984a.get(0));
                            return;
                        }
                        xaVar2.D0.c();
                        return;
                    case 1:
                        xa xaVar3 = xaVar;
                        v5 v5Var4 = xaVar3.O0;
                        qg.v1 v1Var2 = xaVar3.D0;
                        if (v1Var2.a()) {
                            if (v5Var4 != null && (v5Var4.getCurrentBrush() instanceof qg.l)) {
                                v5Var4.b();
                                xaVar3.f9029k1.setSelectedIndex(1);
                                xaVar3.n((qg.m) qg.m.f44984a.get(0));
                            }
                            if (v5Var4 != null) {
                                v5Var4.a();
                            }
                            v1Var2.f45107c.clear();
                            v1Var2.f45106b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var2, 7));
                            xaVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xa xaVar4 = xaVar;
                        rg.j jVar = xaVar4.J0;
                        if (jVar instanceof rg.w2) {
                            AndroidUtilities.hideKeyboard(((rg.w2) jVar).getFocusedView());
                        }
                        if (xaVar4.f9041q2) {
                            xaVar4.t0(false);
                        }
                        xaVar4.A0(xaVar4.J0);
                        xaVar4.B0(null, true);
                        return;
                    case 3:
                        xaVar.B0(null, true);
                        return;
                    default:
                        xa xaVar5 = xaVar;
                        if (xaVar5.B1) {
                            xaVar5.G0(false);
                            return;
                        } else if (xaVar5.f9041q2) {
                            xaVar5.t0(true);
                            return;
                        } else if (xaVar5.K0) {
                            xaVar5.B0(null, true);
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
        rg.k1 k1Var = new rg.k1(context);
        this.B0 = k1Var;
        k1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        k1Var.setBackground(org.telegram.ui.ActionBar.k6.g0(1090519039, 1, -1));
        k1Var.setOnClickListener(new ai.v0(xaVar, context, u0Var2, 9));
        b6Var.addView(k1Var, w7.z5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        rg.x1 x1Var = new rg.x1(context);
        this.f9015d1 = x1Var;
        qg.s1 s1Var4 = s1Var;
        x1Var.setColorSwatch(s1Var4);
        x1Var.setRenderView(v5Var2);
        x1Var.setValueOverride(cVar);
        s1Var4.f45068c = cVar.get();
        x1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        xa xaVar2 = xaVar;
                        qg.s1 s1Var42 = xaVar2.A1;
                        xaVar2.D0(s1Var42);
                        qg.u0.e(i10).j(s1Var42.f45068c);
                        return;
                    default:
                        xaVar.l1.setTypeface(qg.u0.e(i10).f45097j);
                        return;
                }
            }
        });
        addView(x1Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V0 = frameLayout2;
        addView(frameLayout2, w7.z5.c(-1.0f, -1));
        Paint paint6 = paint;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(AndroidUtilities.dp(2.0f));
        C0(s1Var4, null, false);
        n((qg.m) qg.m.f44984a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.O1 = new i5(xaVar, ubVar, new ai.o2(8, xaVar, ubVar));
        n2.H = i14;
    }

    public static void E0(rg.w2 w2Var, int i10) {
        int i11;
        w2Var.setAlign(i10);
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
        w2Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        w2Var.getEditText().setTextAlignment(i12);
    }

    public static void Y(xa xaVar, qg.u0 u0Var, Integer num) {
        u0Var.h(num.intValue(), true);
        u0Var.g();
        xaVar.setNewColor(num.intValue());
        xaVar.f9052w1.setSelectedColorIndex(u0Var.d());
        xaVar.T1 = null;
    }

    public static void Z(xa xaVar, Integer num) {
        xaVar.setNewColor(num.intValue());
        xaVar.G0(false);
    }

    public ViewGroup getBarView() {
        if (this.Y0 == 2) {
            return this.l1;
        }
        return this.f9029k1;
    }

    private int getFrameRotation() {
        int i10 = this.f9019f1;
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
            z5 z5Var = this.R0;
            if (i10 < z5Var.getChildCount()) {
                View childAt = z5Var.getChildAt(i10);
                if (childAt instanceof rg.p2) {
                    ImageReceiver imageReceiver = ((rg.p2) childAt).f46033x0;
                    yj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
                        animation.f25894y = z10;
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
        qg.s1 s1Var = this.A1;
        int i11 = s1Var.f45066a;
        s1Var.f45066a = i10;
        C0(s1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new u4(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        rg.j jVar = this.J0;
        if (jVar instanceof rg.w2) {
            ((rg.w2) jVar).setType(i10);
        }
        qg.u0 e = qg.u0.e(this.F1);
        e.h = i10;
        e.f45091a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        m5 m5Var = new m5(this, context);
        this.W0 = m5Var;
        m5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.z5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f9023h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f9023h1;
        int i10 = org.telegram.ui.ActionBar.k6.f21272i6;
        t5 t5Var = this.G1;
        org.telegram.ui.ActionBar.r6.S(textView2, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i10, t5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.O(i10), t5Var);
        this.f9023h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f9023h1.setTextColor(-1);
        this.f9023h1.setTextSize(1, 14.0f);
        this.f9023h1.setGravity(1);
        this.f9023h1.setTypeface(AndroidUtilities.bold());
        this.f9023h1.setSingleLine();
        this.f9023h1.setOnClickListener(new View.OnClickListener(this) {
            public final f6 f9522b;

            {
                this.f9522b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f6 f6Var = this.f9522b;
                        if (f6Var.K0) {
                            f6Var.B0(null, true);
                            return;
                        } else {
                            f6Var.P0(0);
                            return;
                        }
                    case 1:
                        this.f9522b.y0();
                        return;
                    default:
                        f6 f6Var2 = this.f9522b;
                        f6Var2.P0(2);
                        if (!(f6Var2.J0 instanceof rg.w2)) {
                            f6Var2.f9031l2 = true;
                            f6Var2.m0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f9023h1, w7.z5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f9025i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        org.telegram.ui.ActionBar.r6.S(this.f9025i1, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i10, t5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.O(i10), t5Var);
        this.f9025i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f9025i1.setOnClickListener(new View.OnClickListener(this) {
            public final f6 f9522b;

            {
                this.f9522b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f6 f6Var = this.f9522b;
                        if (f6Var.K0) {
                            f6Var.B0(null, true);
                            return;
                        } else {
                            f6Var.P0(0);
                            return;
                        }
                    case 1:
                        this.f9522b.y0();
                        return;
                    default:
                        f6 f6Var2 = this.f9522b;
                        f6Var2.P0(2);
                        if (!(f6Var2.J0 instanceof rg.w2)) {
                            f6Var2.f9031l2 = true;
                            f6Var2.m0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f9025i1.setTextColor(-1);
        this.f9025i1.setTextSize(1, 14.0f);
        this.f9025i1.setGravity(1);
        this.f9025i1.setTypeface(AndroidUtilities.bold());
        this.f9025i1.setAlpha(0.6f);
        this.f9025i1.setSingleLine();
        this.W0.addView(this.f9025i1, w7.z5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f9027j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        org.telegram.ui.ActionBar.r6.S(this.f9027j1, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i10, t5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.O(i10), t5Var);
        this.f9027j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f9027j1.setTextColor(-1);
        this.f9027j1.setTextSize(1, 14.0f);
        this.f9027j1.setGravity(1);
        this.f9027j1.setTypeface(AndroidUtilities.bold());
        this.f9027j1.setAlpha(0.6f);
        this.f9027j1.setSingleLine();
        this.f9027j1.setOnClickListener(new View.OnClickListener(this) {
            public final f6 f9522b;

            {
                this.f9522b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f6 f6Var = this.f9522b;
                        if (f6Var.K0) {
                            f6Var.B0(null, true);
                            return;
                        } else {
                            f6Var.P0(0);
                            return;
                        }
                    case 1:
                        this.f9522b.y0();
                        return;
                    default:
                        f6 f6Var2 = this.f9522b;
                        f6Var2.P0(2);
                        if (!(f6Var2.J0 instanceof rg.w2)) {
                            f6Var2.f9031l2 = true;
                            f6Var2.m0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f9027j1, w7.z5.l(1.0f, 0, -2));
    }

    public static boolean v0(TLRPC.Document document) {
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

    public final void A0(rg.j jVar) {
        rg.j jVar2 = this.J0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            B0(null, true);
            if (jVar instanceof rg.w2) {
                ValueAnimator valueAnimator = this.f9011b1;
                if (valueAnimator != null && this.Z0 != 0) {
                    valueAnimator.cancel();
                }
                P0(0);
            }
        }
        this.R0.removeView(jVar);
        e0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            qg.v1 v1Var = this.D0;
            v1Var.f45106b.remove(uuid);
            v1Var.f45107c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var, 7));
        }
        rg.x1 x1Var = this.f9015d1;
        qb.c cVar = this.f9017e1;
        x1Var.setValueOverride(cVar);
        x1Var.setShowPreview(true);
        float f7 = cVar.get();
        qg.s1 s1Var = this.A1;
        s1Var.f45068c = f7;
        C0(s1Var, null, false);
        if (!this.f9035n2 && (jVar instanceof rg.d2)) {
            vb vbVar = ((xa) this).A2;
            jb jbVar = vbVar.X0;
            if (jbVar != null) {
                jbVar.s(null, null, true);
            }
            xa xaVar = vbVar.f10032v1;
            if (xaVar != null) {
                xaVar.o0();
            }
            lb lbVar = vbVar.f9973c1;
            if (lbVar != null) {
                lbVar.setHasRoundVideo(false);
            }
            a8 a8Var = vbVar.K1;
            if (a8Var != null) {
                File file = a8Var.f8733o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    vbVar.K1.f8733o0 = null;
                }
                if (vbVar.K1.f8735p0 != null) {
                    try {
                        new File(vbVar.K1.f8735p0).delete();
                    } catch (Exception unused2) {
                    }
                    vbVar.K1.f8735p0 = null;
                }
            }
        }
    }

    public final boolean B0(rg.j jVar, boolean z10) {
        boolean z11;
        gc gcVar;
        gc gcVar2;
        gl0 gl0Var;
        int i10;
        boolean z12 = jVar instanceof rg.w2;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f9011b1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.B1) {
                G0(false);
            }
            P0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            rg.w2 w2Var = (rg.w2) jVar;
            int gravity = w2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            rg.p1 p1Var = this.l1;
            p1Var.setAlignment(i11);
            qg.l0 typeface = w2Var.getTypeface();
            if (typeface != null) {
                p1Var.setTypeface(typeface.f44978a);
            }
            p1Var.e(w2Var.getType(), true);
            this.U0.invalidate();
        }
        rg.j jVar2 = this.J0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f45811d0) {
                    if (jVar instanceof rg.t0) {
                        rg.t0 t0Var = (rg.t0) jVar;
                        t0Var.setType((t0Var.getType() + 1) % t0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof rg.x2) {
                        rg.x2 x2Var = (rg.x2) jVar;
                        x2Var.setType((x2Var.getType() + 1) % x2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof rg.q0) {
                        rg.q0 q0Var = (rg.q0) jVar;
                        rg.o0 o0Var = q0Var.f46035q0;
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
                        if (jVar instanceof rg.w2) {
                            this.M0 = true;
                            p0();
                            return true;
                        } else if (jVar instanceof rg.c2) {
                            rg.c2 c2Var = (rg.c2) jVar;
                            if (this.f9014c2 && this.a2 == jVar) {
                                c2Var.q(true);
                                return true;
                            }
                            rg.c2 c2Var2 = this.a2;
                            if (c2Var2 != null && c2Var2 != c2Var && (gl0Var = this.Z1) != null) {
                                gl0Var.animate().alpha(0.0f).setListener(new k5(gl0Var, 0));
                                this.Z1 = null;
                                this.f9014c2 = false;
                                this.f9012b2 = 0.0f;
                            }
                            if (this.Z1 == null) {
                                gl0 gl0Var2 = new gl0(2, this.F1, getContext(), LaunchActivity.R(), new ci.s2(6, new ci.b()));
                                this.Z1 = gl0Var2;
                                org.telegram.ui.Components.na naVar = new org.telegram.ui.Components.na(this.f9018e2, gl0Var2, 0, false);
                                this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.M1.addView(this.Z1, w7.z5.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.o(-16777216, 120));
                                gl0 gl0Var3 = this.Z1;
                                ?? obj = new Object();
                                obj.e = this;
                                obj.f6892a = naVar;
                                obj.d = paint;
                                obj.f6894c = new Path();
                                gl0Var3.setDelegate(obj);
                                this.Z1.p(null, null, true);
                            }
                            this.Z1.setFragment(LaunchActivity.R());
                            this.a2 = c2Var;
                            M0(true);
                            return true;
                        } else {
                            K0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof rg.w2) {
                        AndroidUtilities.showKeyboard(((rg.w2) jVar2).getFocusedView());
                        t0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            rg.j jVar3 = this.J0;
            if (jVar3 instanceof rg.w2) {
                rg.w2 w2Var2 = (rg.w2) jVar3;
                rg.v2 v2Var = w2Var2.f46111q0;
                v2Var.clearFocus();
                v2Var.setEnabled(false);
                v2Var.setClickable(false);
                w2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((rg.w2) this.J0).getFocusedView());
                    t0(false);
                }
            } else if ((jVar3 instanceof rg.d2) && (gcVar2 = ((xa) this).A2.Z0) != null) {
                gcVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        rg.j jVar4 = this.J0;
        this.J0 = jVar;
        if ((jVar4 instanceof rg.w2) && TextUtils.isEmpty(((rg.w2) jVar4).getText())) {
            A0(jVar4);
        }
        rg.j jVar5 = this.J0;
        if (jVar4 != jVar5 && (jVar5 instanceof rg.d2) && (gcVar = ((xa) this).A2.Z0) != null) {
            gcVar.l(true);
        }
        rg.j jVar6 = this.J0;
        qb.c cVar = this.f9017e1;
        qg.s1 s1Var = this.A1;
        rg.x1 x1Var = this.f9015d1;
        if (jVar6 != null) {
            a6 a6Var = this.Q0;
            jVar6.m0 = a6Var;
            jVar6.l(a6Var, true);
            rg.j jVar7 = this.J0;
            if (jVar7 instanceof rg.w2) {
                rg.w2 w2Var3 = (rg.w2) jVar7;
                w2Var3.getSwatch().f45068c = s1Var.f45068c;
                w2Var3.f46120z0 = false;
                D0(w2Var3.getSwatch());
                x1Var.setValueOverride(new j5(w2Var3, (int) (this.H0.f27465a / 9.0f), 0));
                x1Var.setShowPreview(false);
            } else {
                x1Var.setValueOverride(cVar);
                x1Var.setShowPreview(true);
                s1Var.f45068c = cVar.get();
                C0(s1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f9011b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                G0(false);
            }
            P0(0);
            x1Var.setValueOverride(cVar);
            x1Var.setShowPreview(true);
            s1Var.f45068c = cVar.get();
            C0(s1Var, null, false);
            z13 = z11;
        }
        S0();
        return z13;
    }

    @Override
    public final void C() {
        N0(true);
    }

    public final void C0(qg.s1 s1Var, Integer num, boolean z10) {
        qg.s1 s1Var2 = this.A1;
        if (s1Var2 != s1Var) {
            s1Var2.f45066a = s1Var.f45066a;
            s1Var2.f45067b = s1Var.f45067b;
            s1Var2.f45068c = s1Var.f45068c;
            int i10 = this.F1;
            qg.u0.e(i10).h(s1Var.f45066a, true);
            qg.u0.e(i10).j(s1Var.f45068c);
        }
        int i11 = s1Var.f45066a;
        v5 v5Var = this.O0;
        v5Var.setColor(i11);
        v5Var.setBrushSize(s1Var.f45068c);
        int i12 = s1Var2.f45066a;
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
        if (jVar instanceof rg.w2) {
            ((rg.w2) jVar).setSwatch(new qg.s1(s1Var.f45067b, s1Var.f45068c, s1Var.f45066a));
        } else if (z10 && (jVar instanceof rg.t0)) {
            ((rg.t0) jVar).setColor(s1Var.f45066a);
            ((rg.t0) this.J0).setType(3);
        } else if (z10 && (jVar instanceof rg.x2)) {
            ((rg.x2) jVar).setColor(s1Var.f45066a);
            ((rg.x2) this.J0).setType(3);
        } else if (z10 && (jVar instanceof rg.q0)) {
            ((rg.q0) jVar).setColor(s1Var.f45066a);
            ((rg.q0) this.J0).setType(0);
        }
    }

    public final void D0(qg.s1 s1Var) {
        C0(s1Var, null, false);
    }

    public final void F0() {
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
                        s5 l02 = l0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            l02.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = l02.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i10 = i11;
                        jVar = l02;
                    } else if (b10 == 1) {
                        rg.w2 m0 = m0(z10);
                        m0.setType(mediaEntity.subType);
                        m0.setTypeface(mediaEntity.textTypeface);
                        m0.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        for (int i12 = z10; i12 < size2; i12++) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i12);
                            org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(emojiEntity.document_id, 1.0f, m0.getFontMetricsInt());
                            int i13 = emojiEntity.offset;
                            spannableString.setSpan(a6Var, i13, emojiEntity.length + i13, 33);
                            i11 = i11;
                        }
                        i10 = i11;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, m0.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        m0.setText(replaceEmoji);
                        E0(m0, mediaEntity.textAlign);
                        qg.s1 swatch = m0.getSwatch();
                        swatch.f45066a = mediaEntity.color;
                        m0.setSwatch(swatch);
                        jVar = m0;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            rg.z1 i02 = i0(mediaEntity.text, false);
                            i02.G0 = mediaEntity.crop;
                            i02.B0 = false;
                            if ((2 & mediaEntity.subType) != 0) {
                                i02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                i02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = i02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            jVar = i02;
                        } else if (b10 == 6) {
                            ArrayList arrayList3 = a8Var.v;
                            boolean z11 = a8Var.K;
                            this.f9031l2 = true;
                            rg.j r5Var = new r5(this, getContext(), d0(), arrayList3, this.f9018e2, z11, this.f9020f2);
                            r5Var.setDelegate(this);
                            r13.addView(r5Var);
                            e0();
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
                            rg.t0 h02 = h0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                h02.setColor(i14);
                            }
                            h02.setType(mediaEntity.subType);
                            jVar = h02;
                        } else if (b10 == 8) {
                            tc tcVar = mediaEntity.weather;
                            if (tcVar != null) {
                                rg.x2 n02 = n0(tcVar);
                                int i15 = mediaEntity.color;
                                if (i15 != 0) {
                                    n02.setColor(i15);
                                }
                                n02.setType(mediaEntity.subType);
                                jVar = n02;
                            } else {
                                i11 = i10 + 1;
                                z10 = false;
                            }
                        } else if (b10 == 7) {
                            rg.q0 g02 = g0(mediaEntity.linkSettings);
                            rg.o0 o0Var = g02.f46035q0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                g02.setColor(i16);
                            }
                            boolean e = o0Var.e();
                            int i17 = o0Var.h;
                            int i18 = o0Var.f45963f;
                            if (e) {
                                o0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                g02.setType(3);
                                o0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(o0Var.f45956a0)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(o0Var.f45958b0)) + i17 + i17;
                                PointF position = g02.getPosition();
                                position.y = (this.S1 * 0.3f) + position.y;
                                g02.setPosition(position);
                                i11 = i10 + 1;
                                z10 = false;
                            } else {
                                g02.setType(b11);
                                jVar = g02;
                            }
                        } else if (b10 == 4) {
                            rg.c2 j02 = j0(false);
                            j02.s(ah.i1.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                j02.r(false);
                            }
                            jVar = j02;
                            if (mediaEntity.mediaArea.dark) {
                                j02.q(false);
                                jVar = j02;
                            }
                        } else {
                            if (b10 == 5 && a8Var.f8733o0 != null) {
                                rg.d2 k02 = k0(a8Var.f8735p0, false);
                                vb vbVar = ((xa) this).A2;
                                jb jbVar = vbVar.X0;
                                if (jbVar != null) {
                                    jbVar.f9749w = k02;
                                    j81 j81Var = jbVar.f9751x;
                                    if (j81Var != null) {
                                        j81Var.V(k02.f45744u0);
                                    }
                                }
                                lb lbVar = vbVar.f9973c1;
                                if (lbVar != null) {
                                    lbVar.setHasRoundVideo(true);
                                }
                                jVar = k02;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !k02.f45741r0;
                                    k02.f45741r0 = z12;
                                    k02.f45742s0.f(z12, true);
                                    k02.invalidate();
                                    jVar = k02;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f17885x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f17886y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
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
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f9043r2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f9053w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f9053w2).commit();
            } else {
                this.f9051v2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f9051v2).commit();
            }
        }
        boolean z13 = this.f9041q2;
        i5 i5Var = this.O1;
        if (z13) {
            if (z10) {
                i11 = this.f9053w2;
            } else {
                i11 = this.f9051v2;
            }
            int paddingUnderContainer = this.M1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9039p2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f9039p2.setLayoutParams(layoutParams);
                this.f9047t2 = layoutParams.height;
                i5Var.a();
                requestLayout();
            }
        }
        if (this.f9055x2 == i10 && this.f9057y2 == z10) {
            return;
        }
        this.f9055x2 = i10;
        this.f9057y2 = z10;
        boolean z14 = this.f9043r2;
        rg.j jVar = this.J0;
        if (jVar instanceof rg.w2) {
            if (((rg.w2) jVar).getEditText().isFocused() && i5Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f9043r2 = z12;
        } else {
            this.f9043r2 = false;
        }
        if (this.f9043r2 && this.f9041q2) {
            H0(0);
        }
        if (this.f9047t2 != 0 && !(z11 = this.f9043r2) && z11 != z14 && !this.f9041q2) {
            this.f9047t2 = 0;
            i5Var.a();
            requestLayout();
        }
        S0();
        if (z14 && !this.f9043r2 && this.f9047t2 > 0 && this.f9049u2) {
            this.f9049u2 = false;
        }
        Q0();
    }

    public final void G0(final boolean z10) {
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
            lVar.f17628i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f17622u = lVar;
            if (!this.O1.c() && this.f9047t2 <= 0) {
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
                    g5 g5Var = f6Var.f9052w1;
                    float f17 = f6Var.D1;
                    boolean z12 = z10;
                    g5Var.E1(f17, z12);
                    rg.k1 k1Var = f6Var.B0;
                    k1Var.setProgress(f6Var.D1);
                    rg.g1 g1Var = f6Var.A0;
                    g1Var.setProgress(f6Var.D1);
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
                g5 g5Var = this.f9052w1;
                g5Var.setVisibility(0);
                g5Var.setSelectedColorIndex(qg.u0.e(this.F1).d());
            }
        }
    }

    public final void H0(int i10) {
        boolean z10;
        int i11;
        rg.p1 p1Var = this.l1;
        i5 i5Var = this.O1;
        if (i10 == 1) {
            tz tzVar = this.f9039p2;
            if (tzVar != null && tzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            tz tzVar2 = this.f9039p2;
            ub ubVar = this.M1;
            if (tzVar2 != null && tzVar2.f30966c1 != UserConfig.selectedAccount) {
                ubVar.removeView(tzVar2);
                this.f9039p2 = null;
            }
            if (this.f9039p2 == null) {
                tz tzVar3 = new tz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.f9039p2 = tzVar3;
                tzVar3.f31034x2 = false;
                tzVar3.U0 = true;
                tzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f9039p2.setForseMultiwindowLayout(true);
                }
                this.f9039p2.setDelegate(new u5(this));
                ubVar.addView(this.f9039p2);
            }
            this.f9039p2.setVisibility(0);
            this.f9041q2 = true;
            tz tzVar4 = this.f9039p2;
            if (this.f9051v2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f9051v2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f9051v2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f9053w2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f9053w2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f9053w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f9053w2;
            } else {
                i11 = this.f9051v2;
            }
            int paddingUnderContainer = ubVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            tzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                rg.j jVar = this.J0;
                if (jVar instanceof rg.w2) {
                    AndroidUtilities.hideKeyboard(((rg.w2) jVar).getEditText());
                }
            }
            this.f9047t2 = paddingUnderContainer;
            i5Var.a();
            requestLayout();
            ah emojiButton = p1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            if (!z10) {
                if (this.f9043r2) {
                    this.f9049u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f9047t2, 0.0f);
                    ofFloat.addUpdateListener(new r4(this, 1));
                    ofFloat.addListener(new l5(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21717w);
                    ofFloat.start();
                }
            }
        } else {
            ah emojiButton2 = p1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(yg.e, true);
            }
            tz tzVar5 = this.f9039p2;
            if (tzVar5 != null) {
                this.f9041q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    tzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f9047t2 = 0;
                i5Var.a();
            }
            requestLayout();
        }
        Q0();
    }

    public final void I0(rg.q0 q0Var) {
        j8 j8Var = new j8(getContext(), this.G1, this.f9022g2, new ai.o2(10, this, q0Var));
        if (q0Var != null) {
            rg.n0 n0Var = q0Var.f46039u0;
            j8Var.f9280c0 = true;
            org.telegram.ui.Cells.h3 h3Var = j8Var.Z;
            org.telegram.ui.Cells.h3 h3Var2 = j8Var.Y;
            if (n0Var != null) {
                j8Var.f9284g0 = n0Var.d;
                j8Var.f9285h0 = false;
                h3Var2.setText(n0Var.f45947c);
                h3Var.setText(n0Var.f45946b);
                j8Var.m0 = !TextUtils.isEmpty(n0Var.f45946b);
                j8Var.f9290n0 = n0Var.f45948f;
                j8Var.f9291o0 = n0Var.e;
            } else {
                h3Var2.setText("");
                h3Var.setText("");
                j8Var.f9290n0 = true;
                j8Var.f9291o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = j8Var.f9279b0;
            dVar.i(string, false, true);
            f8 f8Var = j8Var.X;
            if (f8Var != null) {
                f8Var.N(false);
            }
            dVar.setEnabled(j8Var.V(h3Var2.getText().toString()));
            j8Var.f9280c0 = false;
        }
        j8Var.setOnDismissListener(new b5(this, 1));
        j8Var.show();
        x0(true);
    }

    public final void J0(rg.t0 t0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ti tiVar = new ti(getContext(), new p5(this, callback2), false, true, false, this.G1);
        tiVar.f30722c2 = new Object();
        wh whVar = tiVar.A1;
        if (t0Var != null && (messageMedia = t0Var.f46080u0) != null && (geoPoint = messageMedia.geo) != null) {
            tiVar.D2 = new double[]{geoPoint.lat, geoPoint._long};
            tiVar.O = true;
            whVar.setVisibility(8);
        } else if (this.U1) {
            tiVar.B2 = this.W1;
            tiVar.C2 = this.V1;
            tiVar.O = true;
            whVar.setVisibility(8);
        } else {
            tiVar.O = true;
            whVar.setVisibility(8);
        }
        tiVar.setOnDismissListener(new b5(this, 0));
        tiVar.w1();
        tiVar.show();
    }

    public final void K0(rg.j jVar) {
        if (jVar instanceof rg.f1) {
            org.telegram.ui.ActionBar.m1 m1Var = this.H1;
            if (m1Var != null && m1Var.isShowing()) {
                this.H1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f9037o2;
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
        L0(new v4(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void L0(Runnable runnable, f6 f6Var, int i10, int i11, int i12, boolean z10) {
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
            m1Var2.f21630b = true;
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
            d6Var3.setBackgroundDrawable(new org.telegram.ui.Components.ma(new org.telegram.ui.Components.na(this.f9018e2, d6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.I1.setBackgroundDrawable(mutate);
        this.I1.setBackgroundColor(-14145495);
    }

    public final void M0(boolean z10) {
        if (this.f9014c2 != z10) {
            if (z10 || this.Z1 != null) {
                this.f9014c2 = z10;
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
                    this.f9016d2 = true;
                    this.M1.invalidate();
                    float f10 = this.f9012b2;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.Z1.setTransitionProgress(this.f9012b2);
                    ofFloat.addUpdateListener(new r4(this, 2));
                    ofFloat.addListener(new ah.p0(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(bs.f25134g);
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

    public final void N0(boolean z10) {
        float f7;
        if (this.f9048u1 != z10) {
            this.f9048u1 = z10;
            o1.k kVar = this.f9050v1;
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
            this.f9050v1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f17628i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f17622u = lVar;
            if (z10) {
                rg.u1 u1Var = this.f9032m1;
                u1Var.setAlpha(0.0f);
                u1Var.setVisibility(0);
            }
            this.f9050v1.b(new ci.k8(1, this));
            this.f9050v1.a(new q4(this, z10, 1));
            this.f9050v1.h();
        }
    }

    public final PointF O0(rg.j jVar) {
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
        PointF d02 = d0();
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
                if (!(childAt instanceof rg.j) || (childAt instanceof rg.f1)) {
                    f7 = f12;
                    f10 = f13;
                } else {
                    PointF position2 = ((rg.j) childAt).getPosition();
                    f7 = f12;
                    f10 = f13;
                    if (((float) Math.sqrt(Math.pow(position2.y - d02.y, 2.0d) + Math.pow(position2.x - d02.x, 2.0d))) < f10) {
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
            d02 = new PointF(d02.x + f11, d02.y + f11);
            f12 = f14;
            f13 = f15;
        }
        return d02;
    }

    public final void P0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.Y0 != i10 && this.Z0 != i10) {
            ValueAnimator valueAnimator = this.f9011b1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.Y0;
            ViewGroup viewGroup3 = this.l1;
            ViewGroup viewGroup4 = this.f9029k1;
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
            qg.u0 e = qg.u0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f45099l != z10) {
                e.f45099l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f45091a.getInt("brush", 0), false);
                }
            }
            int c10 = qg.u0.e(i12).c();
            qg.s1 s1Var = this.A1;
            s1Var.f45066a = c10;
            C0(s1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f9011b1 = duration;
            duration.setInterpolator(bs.f25133f);
            this.f9011b1.addUpdateListener(new ci.n3(this, viewGroup, viewGroup2, 1));
            this.f9011b1.addListener(new n5(this, viewGroup, viewGroup2, i10, 0));
            this.f9011b1.start();
        }
    }

    @Override
    public final int Q() {
        return this.O1.f8793l - this.M1.getBottomPadding2();
    }

    public final void Q0() {
        boolean z10;
        i5 i5Var = this.O1;
        rg.p1 p1Var = this.l1;
        if (p1Var != null) {
            if (i5Var.c()) {
                p1Var.a(R.drawable.input_smile);
            } else if (this.f9041q2) {
                p1Var.a(R.drawable.input_keyboard);
            } else {
                p1Var.a(R.drawable.msg_add);
            }
        }
        if (!i5Var.c() && !this.f9041q2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        boolean z12 = !z11;
        AndroidUtilities.updateViewShow(this.f9036o1, z12, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f9034n1, z12, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f9040q1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f9038p1, z11, false, 1.0f, true, null);
    }

    public final void R0() {
        float f7;
        rg.j jVar;
        ObjectAnimator objectAnimator = this.f9026i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        i5 i5Var = this.O1;
        if (((i5Var.c() && !i5Var.d) || this.f9047t2 > 0) && (jVar = this.J0) != null) {
            f7 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.f9026i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f9026i2.setInterpolator(bs.h);
        this.f9026i2.start();
    }

    public final void S0() {
        throw new UnsupportedOperationException("Method not decompiled: ei.f6.S0():void");
    }

    @Override
    public final void a() {
        G0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21254h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21289j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21439r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Eh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21125a7));
    }

    @Override
    public final void c() {
        setTextType((this.L0 + 1) % 4);
    }

    public final void c0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new ci.u7(26, this, view)).start();
    }

    @Override
    public final void d(int i10) {
        rg.j jVar = this.J0;
        if (jVar instanceof rg.w2) {
            E0((rg.w2) jVar, i10);
            qg.u0 e = qg.u0.e(this.F1);
            e.f45095g = i10;
            e.f45091a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final PointF d0() {
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

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f9033m2) {
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

    public final void e0() {
        org.telegram.ui.Components.a6[] a6VarArr;
        boolean z10 = this.W1;
        z5 z5Var = this.R0;
        boolean z11 = true;
        if (!z10 && !this.Y1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < z5Var.getChildCount()) {
                    View childAt = z5Var.getChildAt(i10);
                    boolean z12 = childAt instanceof rg.w2;
                    int i11 = this.F1;
                    if (z12) {
                        CharSequence text = ((rg.w2) childAt).getText();
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
                    } else if (childAt instanceof rg.p2) {
                        TLRPC.Document sticker = ((rg.p2) childAt).getSticker();
                        if (a8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
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
        for (int i12 = 0; i12 < z5Var.getChildCount(); i12++) {
            View childAt2 = z5Var.getChildAt(i12);
            if (childAt2 instanceof rg.j) {
                ((rg.j) childAt2).setIsVideo(z11);
            }
        }
    }

    public final TextView f0(int i10, String str) {
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.E8, this.G1);
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

    @Override
    public final void g(rg.j jVar) {
        M0(false);
        K0(jVar);
    }

    public final rg.q0 g0(rg.n0 n0Var) {
        int measuredWidth;
        int i10;
        this.f9031l2 = true;
        getPaintingSize();
        PointF O0 = O0(null);
        z5 z5Var = this.R0;
        if (z5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = z5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.q0 q0Var = new rg.q0(getContext(), O0, this.F1, n0Var, f7 / 360.0f, dp);
        if (O0.x == z5Var.getMeasuredWidth() / 2.0f) {
            q0Var.setStickyX(2);
        }
        if (O0.y == z5Var.getMeasuredHeight() / 2.0f) {
            q0Var.setStickyY(2);
        }
        qg.s1 s1Var = this.A1;
        if (s1Var != null && (i10 = s1Var.f45066a) != -47814) {
            q0Var.setColor(i10);
        }
        q0Var.setDelegate(this);
        q0Var.setMaxWidth(dp);
        z5Var.addView(q0Var, w7.z5.c(-2.0f, -2));
        e0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            q0Var.j(1.0f / cropState.cropScale);
            q0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return q0Var;
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
        return this.f9021g1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.a6[] a6VarArr;
        z5 z5Var = this.R0;
        int childCount = z5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = z5Var.getChildAt(i10);
            if (childAt instanceof rg.p2) {
                TLRPC.Document sticker = ((rg.p2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f20355id = sticker.f20349id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof rg.w2) {
                CharSequence text = ((rg.w2) childAt).getText();
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
                                tL_inputDocument2.f20355id = document.f20349id;
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

    public qg.e1 getRenderView() {
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
        return this.f9015d1;
    }

    public final rg.t0 h0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f9031l2 = true;
        getPaintingSize();
        PointF O0 = O0(null);
        z5 z5Var = this.R0;
        if (z5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = z5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.t0 t0Var = new rg.t0(getContext(), O0, this.F1, messageMedia, mediaArea, f7 / 240.0f, dp);
        if (O0.x == z5Var.getMeasuredWidth() / 2.0f) {
            t0Var.setStickyX(2);
        }
        if (O0.y == z5Var.getMeasuredHeight() / 2.0f) {
            t0Var.setStickyY(2);
        }
        qg.s1 s1Var = this.A1;
        if (s1Var != null && (i10 = s1Var.f45066a) != -47814) {
            t0Var.setColor(i10);
        }
        t0Var.setDelegate(this);
        t0Var.setMaxWidth(dp);
        z5Var.addView(t0Var, w7.z5.c(-2.0f, -2));
        e0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            t0Var.j(1.0f / cropState.cropScale);
            t0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return t0Var;
    }

    public final rg.z1 i0(String str, boolean z10) {
        float f7;
        iw0 iw0Var;
        this.f9031l2 = true;
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
            iw0Var = new iw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, z5Var.getMeasuredHeight()) * 0.5d);
            iw0Var = new iw0(f7 * floor2, floor2);
        }
        iw0 iw0Var2 = iw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = iw0Var2.f27465a;
            iw0Var2.f27465a = iw0Var2.f27466b;
            iw0Var2.f27466b = f10;
        }
        Context context = getContext();
        PointF d02 = d0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        rg.z1 z1Var = new rg.z1(context, d02, iw0Var2, str, intValue);
        z1Var.setDelegate(this);
        z5Var.addView(z1Var);
        e0();
        return z1Var;
    }

    public final rg.c2 j0(boolean z10) {
        String str;
        iw0 iw0Var = new iw0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF d02 = d0();
        z5 z5Var = this.R0;
        if (z5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < z5Var.getChildCount(); i10++) {
                    View childAt = z5Var.getChildAt(i10);
                    if (v7.f7.a(d02.x, d02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                d02.x = (z5Var.getMeasuredWidth() * 0.05f) + d02.x;
                d02.y = (z5Var.getMeasuredHeight() * 0.05f) + d02.y;
                d02.x = Utilities.clamp(d02.x, z5Var.getMeasuredWidth(), 0.0f);
                d02.y = Utilities.clamp(d02.y, z5Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new rg.j(getContext(), d02);
        jVar.f45725r0 = new ci.f9(jVar);
        jVar.f45726s0 = new ci.f9(jVar);
        jVar.f45727t0 = new ah.y0(jVar);
        jVar.f45728u0 = new ah.y0(jVar);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6((View) jVar);
        jVar.f45730w0 = f6Var;
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6((View) jVar);
        jVar.f45731x0 = f6Var2;
        jVar.f45733z0 = 1.0f;
        jVar.f45724q0 = iw0Var;
        f6Var2.d(1.0f, true);
        f6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        ah.y0 y0Var = jVar.f45727t0;
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
        jVar.f45729v0 = b10;
        y0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        z5Var.addView(jVar);
        e0();
        if (z10) {
            z0(jVar);
            B0(jVar, true);
        }
        return jVar;
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        if (this.f9033m2) {
            return false;
        }
        if (this.J0 != null) {
            B0(null, true);
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y3);
        this.O0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final rg.d2 k0(String str, boolean z10) {
        float f7;
        this.f9031l2 = true;
        this.f9035n2 = true;
        o0();
        z5 z5Var = this.R0;
        int measuredWidth = z5Var.getMeasuredWidth();
        z5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        iw0 iw0Var = new iw0(floor, floor);
        rg.d2 d2Var = new rg.d2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (iw0Var.f27466b / 2.0f) + AndroidUtilities.dp(72.0f)), iw0Var, str);
        d2Var.setDelegate(this);
        z5Var.addView(d2Var);
        e0();
        if (z10) {
            z0(d2Var);
            post(new m4(this, d2Var, 0));
        }
        this.f9035n2 = false;
        return d2Var;
    }

    public final s5 l0(Object obj, TLRPC.Document document) {
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
        e6 e6Var = new e6(d0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f27465a * 0.5d);
        s5 s5Var = new s5(this, context, e6Var.f8969a, e6Var.f8971c, e6Var.f8970b, new iw0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = s5Var.f46033x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        s5Var.setDelegate(this);
        this.R0.addView(s5Var);
        e0();
        return s5Var;
    }

    public final rg.w2 m0(boolean z10) {
        iw0 paintingSize = getPaintingSize();
        PointF O0 = O0(null);
        rg.w2 w2Var = new rg.w2(getContext(), O0, (int) (paintingSize.f27465a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.f27465a / 9.0f;
        w4 w4Var = new w4(this, 0);
        w2Var.f46117w0 = (int) (0.5f * f7);
        w2Var.f46118x0 = (int) (f7 * 2.0f);
        w2Var.f46119y0 = w4Var;
        float f10 = O0.x;
        z5 z5Var = this.R0;
        if (f10 == z5Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (O0.y == z5Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        w2Var.setTypeface(qg.u0.e(i10).f45097j);
        w2Var.setType(qg.u0.e(i10).h);
        z5Var.addView(w2Var, w7.z5.c(-2.0f, -2));
        e0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            w2Var.j(1.0f / cropState.cropScale);
            w2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            z0(w2Var);
            w2Var.q();
            B0(w2Var, false);
            w2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(w2Var.getFocusedView());
            this.K0 = true;
            int i11 = qg.u0.e(i10).f45095g;
            rg.p1 p1Var = this.l1;
            p1Var.d(i11, true);
            p1Var.setOutlineType(qg.u0.e(i10).h);
        }
        return w2Var;
    }

    @Override
    public final void n(qg.m mVar) {
        boolean z10 = mVar instanceof qg.b;
        rg.x1 x1Var = this.f9015d1;
        if (!z10 && !(mVar instanceof qg.d)) {
            x1Var.b(0.05f, 1.0f);
        } else {
            x1Var.b(0.4f, 1.75f);
        }
        x1Var.setDrawCenter(!(mVar instanceof qg.l));
        v5 v5Var = this.O0;
        if (v5Var.getCurrentBrush() instanceof qg.l) {
            this.f9013c1 = true;
        }
        v5Var.setBrush(mVar);
        qg.s1 s1Var = this.A1;
        int i10 = s1Var.f45066a;
        s1Var.f45066a = qg.u0.e(this.F1).c();
        s1Var.f45068c = this.f9017e1.get();
        C0(s1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    public final rg.x2 n0(tc tcVar) {
        int measuredWidth;
        int i10;
        this.f9031l2 = true;
        getPaintingSize();
        PointF O0 = O0(null);
        z5 z5Var = this.R0;
        if (z5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = z5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        rg.x2 x2Var = new rg.x2(getContext(), O0, this.F1, tcVar, f7 / 240.0f, dp);
        if (O0.x == z5Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (O0.y == z5Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        qg.s1 s1Var = this.A1;
        if (s1Var != null && (i10 = s1Var.f45066a) != -47814) {
            x2Var.setColor(i10);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth(dp);
        z5Var.addView(x2Var, w7.z5.c(-2.0f, -2));
        e0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            x2Var.j(1.0f / cropState.cropScale);
            x2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return x2Var;
    }

    public final void o0() {
        int i10 = 0;
        while (true) {
            z5 z5Var = this.R0;
            if (i10 < z5Var.getChildCount()) {
                View childAt = z5Var.getChildAt(i10);
                if (childAt instanceof rg.d2) {
                    if (this.J0 == childAt) {
                        B0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(bs.h).withEndAction(new m4(this, (rg.d2) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
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
        float f11 = this.H0.f27465a;
        rg.j jVar = this.J0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.T0, i10, i11);
        measureChild(this.f9015d1, i10, i11);
        measureChild(this.V0, i10, i11);
        measureChild(this.U0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f9047t2 - this.M1.getPaddingUnderContainer(), Q()), 1073741824));
        FrameLayout frameLayout = this.S0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.G0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f9041q2 && !this.f9045s2) {
            this.G0 = true;
            u0();
            this.G0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        u0();
    }

    @Override
    public final boolean p() {
        return !(this.J0 instanceof rg.f1);
    }

    public abstract void p0();

    @Override
    public final boolean q() {
        return !this.K0;
    }

    public final rg.f1 q0() {
        int i10 = 0;
        while (true) {
            z5 z5Var = this.R0;
            if (i10 < z5Var.getChildCount()) {
                View childAt = z5Var.getChildAt(i10);
                if (childAt instanceof rg.f1) {
                    return (rg.f1) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final android.graphics.Bitmap r0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, ei.a8 r46) {
        throw new UnsupportedOperationException("Method not decompiled: ei.f6.r0(java.util.ArrayList, boolean, boolean, boolean, boolean, ei.a8):android.graphics.Bitmap");
    }

    @Override
    public final void requestLayout() {
        if (this.G0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        if (!this.f9043r2 && !this.f9041q2) {
            this.f9031l2 = true;
            m0(true);
            return;
        }
        if (this.f9041q2) {
            rg.j jVar = this.J0;
            if (jVar instanceof rg.w2) {
                this.O1.e = true;
                AndroidUtilities.showKeyboard(((rg.w2) jVar).getEditText());
            }
        }
        H0(!this.f9041q2 ? 1 : 0);
    }

    public final boolean s0() {
        if (!this.D0.a() && !this.f9031l2) {
            return false;
        }
        return true;
    }

    public void setBlurManager(org.telegram.ui.Components.ja jaVar) {
        this.f9018e2 = jaVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f9033m2 != z10) {
            this.f9033m2 = z10;
            if (z10) {
                B0(null, true);
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
                if (childAt instanceof rg.p2) {
                    ImageReceiver imageReceiver = ((rg.p2) childAt).f46033x0;
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
            e0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.L1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.K1 = runnable;
    }

    @Override
    public final void t(float f7, float f10, float[] fArr) {
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

    public final void t0(boolean z10) {
        if (this.f9041q2) {
            H0(0);
        }
        if (z10) {
            tz tzVar = this.f9039p2;
            if (tzVar != null && tzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f9039p2.getMeasuredHeight());
                ofFloat.addUpdateListener(new r4(this, 0));
                this.f9045s2 = true;
                ofFloat.addListener(new l5(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21717w);
                ofFloat.start();
                return;
            }
            u0();
        }
    }

    @Override
    public final boolean u(rg.j jVar) {
        return B0(jVar, true);
    }

    public final void u0() {
        tz tzVar;
        if (!this.f9041q2 && (tzVar = this.f9039p2) != null && tzVar.getVisibility() != 8) {
            this.f9039p2.setVisibility(8);
        }
        int i10 = this.f9047t2;
        this.f9047t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    @Override
    public final void updateColors() {
        this.E1.setColor(-15132391);
    }

    @Override
    public final int[] v(rg.j jVar) {
        int[] iArr = this.f9037o2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    @Override
    public final qg.u0 w() {
        return qg.u0.e(this.F1);
    }

    public final boolean w0() {
        if (this.f9014c2) {
            if (this.Z1.getReactionsWindow() != null && !this.Z1.getReactionsWindow().f882q) {
                this.Z1.e();
                return true;
            }
            M0(false);
            return true;
        } else if (this.B1) {
            G0(false);
            return true;
        } else if (this.f9041q2) {
            t0(true);
            return true;
        } else if (!this.K0) {
            return false;
        } else {
            if (this.M0) {
                this.M0 = false;
                this.O1.b(true);
                return false;
            }
            B0(null, true);
            return true;
        }
    }

    public abstract void x0(boolean z10);

    public final void y0() {
        final int i10 = this.Y0;
        P0(1);
        postDelayed(new ah.j(this, 13), 350L);
        o5 o5Var = new o5(this, getContext(), this.G1, i10);
        this.f9030k2 = o5Var;
        ub ubVar = this.M1;
        Objects.requireNonNull(ubVar);
        o5Var.f9517x = new ai.q(ubVar, 17);
        final boolean[] zArr = {true};
        o5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                f6 f6Var = f6.this;
                f6Var.f9030k2 = null;
                if (zArr[0]) {
                    f6Var.x0(false);
                }
                f6Var.P0(i10);
            }
        });
        o5Var.E = new y4(this);
        o5Var.s0(new e5(this, zArr, o5Var, 0));
        o5Var.show();
        x0(true);
    }

    @Override
    public final void z() {
        L0(new w4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void z0(rg.j jVar) {
        this.D0.b(jVar.getUUID(), new v4(this, jVar, 0));
    }

    public void setOffsetTranslationX(float f7) {
    }

    public View getView() {
        return this;
    }
}
