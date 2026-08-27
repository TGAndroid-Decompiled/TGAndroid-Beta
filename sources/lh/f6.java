package lh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
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
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.LaunchActivity;

public abstract class f6 extends av0 implements zf.q1, zf.h, zf.m1, yu0, ob {
    public final DispatchQueue A0;
    public final Paint A1;
    public final MediaController.CropState B0;
    public final int B1;
    public boolean C0;
    public final t5 C1;
    public tu0 D0;
    public org.telegram.ui.ActionBar.n1 D1;
    public boolean E0;
    public d6 E1;
    public zf.j F0;
    public Rect F1;
    public boolean G0;
    public Runnable G1;
    public int H0;
    public Runnable H1;
    public boolean I0;
    public final rb I1;
    public final boolean J0;
    public AnimatorSet J1;
    public final v5 K0;
    public final i5 K1;
    public final x5 L0;
    public z7 L1;
    public final a6 M0;
    public ArrayList M1;
    public final z5 N0;
    public int N1;
    public final FrameLayout O0;
    public int O1;
    public final b6 P0;
    public yf.x P1;
    public final f5 Q0;
    public final boolean Q1;
    public final FrameLayout R0;
    public final File R1;
    public m5 S0;
    public final boolean S1;
    public final View T0;
    public final boolean T1;
    public int U0;
    public boolean U1;
    public int V0;
    public wj0 V1;
    public float W0;
    public zf.b2 W1;
    public ValueAnimator X0;
    public float X1;
    public boolean Y0;
    public boolean Y1;
    public final zf.w1 Z0;
    public boolean Z1;

    public final k5.i f15958a1;
    public org.telegram.ui.Components.z9 a2;

    public final int f15959b1;

    public final p6 f15960b2;

    public BigInteger f15961c1;

    public final q6 f15962c2;

    public TextView f15963d1;

    public boolean f15964d2;

    public TextView f15965e1;

    public ObjectAnimator f15966e2;

    public TextView f15967f1;

    public final float[] f15968f2;

    public final zf.r1 f15969g1;

    public o5 f15970g2;

    public final zf.o1 f15971h1;

    public boolean f15972h2;

    public final zf.t1 f15973i1;

    public boolean f15974i2;

    public final ImageView f15975j1;

    public boolean f15976j2;

    public final TextView f15977k1;

    public final int[] f15978k2;
    public final TextView l1;

    public yy f15979l2;

    public final TextView f15980m1;

    public boolean f15981m2;

    public final Paint f15982n1;

    public boolean f15983n2;

    public final Paint f15984o1;

    public boolean f15985o2;

    public float f15986p1;

    public int f15987p2;

    public boolean f15988q1;

    public boolean f15989q2;

    public o1.j f15990r1;

    public int f15991r2;

    public final g5 f15992s1;

    public int f15993s2;

    public final Paint f15994t1;

    public int f15995t2;

    public final Paint f15996u1;

    public boolean f15997u2;

    public final Paint f15998v1;

    public final zf.f1 f15999w0;

    public final yf.p1 f16000w1;

    public final zf.j1 f16001x0;

    public boolean f16002x1;

    public final Bitmap f16003y0;

    public o1.j f16004y1;

    public final yf.s1 f16005z0;

    public float f16006z1;

    public f6(Context context, boolean z10, File file, boolean z11, boolean z12, rb rbVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, z7 z7Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.z9 z9Var, org.telegram.ui.ActionBar.c6 c6Var, p6 p6Var, q6 q6Var) {
        super(context, activity);
        this.U0 = 0;
        this.V0 = -1;
        final va vaVar = (va) this;
        k5.i iVar = new k5.i(vaVar, 24);
        this.f15958a1 = iVar;
        Paint paint = new Paint(1);
        this.f15982n1 = paint;
        Paint paint2 = new Paint(1);
        this.f15984o1 = paint2;
        this.f15994t1 = new Paint(1);
        this.f15996u1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f15998v1 = paint3;
        yf.p1 p1Var = new yf.p1(1.0f, 0.016773745f, -1);
        this.f16000w1 = p1Var;
        this.A1 = new Paint(1);
        this.f15968f2 = new float[2];
        this.f15974i2 = false;
        this.f15978k2 = new int[2];
        new a8.b(vaVar, 28);
        setDelegate(this);
        this.a2 = z9Var;
        this.f15960b2 = p6Var;
        this.Q1 = z10;
        this.R1 = file;
        this.S1 = z11;
        this.T1 = z12;
        this.I1 = rbVar;
        this.N1 = i12;
        this.O1 = i13;
        this.f15962c2 = q6Var;
        this.B1 = i10;
        t5 t5Var = new t5(c6Var);
        this.C1 = t5Var;
        this.B0 = cropState;
        this.J0 = context instanceof BubbleActivity;
        yf.r0 r0VarE = yf.r0.e(i10);
        r0VarE.i(0, true);
        p1Var.f50034a = r0VarE.c();
        p1Var.f50036c = r0VarE.f50060i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.A0 = dispatchQueue;
        this.f16003y0 = bitmap;
        this.f15959b1 = i11;
        yf.s1 s1Var = new yf.s1();
        this.f16005z0 = s1Var;
        s1Var.f50076a = new p(vaVar, 4);
        View view = new View(context);
        this.T0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        v5 v5Var = new v5(vaVar, context, new yf.p0(getPaintingSize(), null, i11, z9Var), bitmap, bitmap2, (z7Var == null || !z7Var.f17235u) ? z9Var : null);
        this.K0 = v5Var;
        v5Var.setDelegate(new w5(vaVar));
        v5Var.setUndoStore(s1Var);
        v5Var.setQueue(dispatchQueue);
        v5Var.setVisibility(4);
        x5 x5Var = new x5(vaVar, context);
        this.L0 = x5Var;
        x5Var.setVisibility(4);
        z5 z5Var = new z5(vaVar, context, new y5(vaVar));
        this.N0 = z5Var;
        this.L1 = z7Var;
        this.M1 = arrayList;
        if (this.N1 > 0 && this.O1 > 0) {
            H0();
        }
        z5Var.setVisibility(4);
        this.M0 = new a6(vaVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, h7.z5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f15975j1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        final int i14 = 0;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        va vaVar2 = vaVar;
                        v5 v5Var2 = vaVar2.K0;
                        if (v5Var2 != null && (v5Var2.getCurrentBrush() instanceof yf.l)) {
                            v5Var2.b();
                            vaVar2.f15969g1.setSelectedIndex(1);
                            vaVar2.l((yf.m) yf.m.f49979a.get(0));
                        } else {
                            vaVar2.f16005z0.c();
                        }
                        break;
                    case 1:
                        va vaVar3 = vaVar;
                        v5 v5Var3 = vaVar3.K0;
                        yf.s1 s1Var2 = vaVar3.f16005z0;
                        if (s1Var2.a()) {
                            if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof yf.l)) {
                                v5Var3.b();
                                vaVar3.f15969g1.setSelectedIndex(1);
                                vaVar3.l((yf.m) yf.m.f49979a.get(0));
                            }
                            if (v5Var3 != null) {
                                v5Var3.a();
                            }
                            s1Var2.f50078c.clear();
                            s1Var2.f50077b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            vaVar3.N0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        va vaVar4 = vaVar;
                        zf.j jVar = vaVar4.F0;
                        if (jVar instanceof zf.v2) {
                            AndroidUtilities.hideKeyboard(((zf.v2) jVar).getFocusedView());
                        }
                        if (vaVar4.f15981m2) {
                            vaVar4.v0(false);
                        }
                        vaVar4.C0(vaVar4.F0);
                        vaVar4.D0(null, true);
                        break;
                    case 3:
                        vaVar.D0(null, true);
                        break;
                    default:
                        va vaVar5 = vaVar;
                        if (vaVar5.f16002x1) {
                            vaVar5.I0(false);
                        } else if (vaVar5.f15981m2) {
                            vaVar5.v0(true);
                        } else if (!vaVar5.G0) {
                            Runnable runnable = vaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            vaVar5.D0(null, true);
                        }
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, h7.z5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        rl.h(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, h7.z5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, h7.z5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ag.l2(8));
        frameLayout.addView(linearLayout, h7.z5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f15977k1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i15 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        va vaVar2 = vaVar;
                        v5 v5Var2 = vaVar2.K0;
                        if (v5Var2 != null && (v5Var2.getCurrentBrush() instanceof yf.l)) {
                            v5Var2.b();
                            vaVar2.f15969g1.setSelectedIndex(1);
                            vaVar2.l((yf.m) yf.m.f49979a.get(0));
                        } else {
                            vaVar2.f16005z0.c();
                        }
                        break;
                    case 1:
                        va vaVar3 = vaVar;
                        v5 v5Var3 = vaVar3.K0;
                        yf.s1 s1Var2 = vaVar3.f16005z0;
                        if (s1Var2.a()) {
                            if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof yf.l)) {
                                v5Var3.b();
                                vaVar3.f15969g1.setSelectedIndex(1);
                                vaVar3.l((yf.m) yf.m.f49979a.get(0));
                            }
                            if (v5Var3 != null) {
                                v5Var3.a();
                            }
                            s1Var2.f50078c.clear();
                            s1Var2.f50077b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            vaVar3.N0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        va vaVar4 = vaVar;
                        zf.j jVar = vaVar4.F0;
                        if (jVar instanceof zf.v2) {
                            AndroidUtilities.hideKeyboard(((zf.v2) jVar).getFocusedView());
                        }
                        if (vaVar4.f15981m2) {
                            vaVar4.v0(false);
                        }
                        vaVar4.C0(vaVar4.F0);
                        vaVar4.D0(null, true);
                        break;
                    case 3:
                        vaVar.D0(null, true);
                        break;
                    default:
                        va vaVar5 = vaVar;
                        if (vaVar5.f16002x1) {
                            vaVar5.I0(false);
                        } else if (vaVar5.f15981m2) {
                            vaVar5.v0(true);
                        } else if (!vaVar5.G0) {
                            Runnable runnable = vaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            vaVar5.D0(null, true);
                        }
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView textViewH = org.telegram.ui.Cells.pa.h(frameLayout, textView2, h7.z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.l1 = textViewH;
        textViewH.setBackground(org.telegram.ui.ActionBar.g6.f0(822083583, 7, -1));
        textViewH.setPadding(org.telegram.ui.Cells.pa.c(8.0f, R.string.Clear, textViewH), 0, AndroidUtilities.dp(8.0f), 0);
        textViewH.setGravity(16);
        textViewH.setTextColor(-1);
        textViewH.setTypeface(AndroidUtilities.bold());
        textViewH.setTextSize(1, 16.0f);
        final int i16 = 2;
        textViewH.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        va vaVar2 = vaVar;
                        v5 v5Var2 = vaVar2.K0;
                        if (v5Var2 != null && (v5Var2.getCurrentBrush() instanceof yf.l)) {
                            v5Var2.b();
                            vaVar2.f15969g1.setSelectedIndex(1);
                            vaVar2.l((yf.m) yf.m.f49979a.get(0));
                        } else {
                            vaVar2.f16005z0.c();
                        }
                        break;
                    case 1:
                        va vaVar3 = vaVar;
                        v5 v5Var3 = vaVar3.K0;
                        yf.s1 s1Var2 = vaVar3.f16005z0;
                        if (s1Var2.a()) {
                            if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof yf.l)) {
                                v5Var3.b();
                                vaVar3.f15969g1.setSelectedIndex(1);
                                vaVar3.l((yf.m) yf.m.f49979a.get(0));
                            }
                            if (v5Var3 != null) {
                                v5Var3.a();
                            }
                            s1Var2.f50078c.clear();
                            s1Var2.f50077b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            vaVar3.N0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        va vaVar4 = vaVar;
                        zf.j jVar = vaVar4.F0;
                        if (jVar instanceof zf.v2) {
                            AndroidUtilities.hideKeyboard(((zf.v2) jVar).getFocusedView());
                        }
                        if (vaVar4.f15981m2) {
                            vaVar4.v0(false);
                        }
                        vaVar4.C0(vaVar4.F0);
                        vaVar4.D0(null, true);
                        break;
                    case 3:
                        vaVar.D0(null, true);
                        break;
                    default:
                        va vaVar5 = vaVar;
                        if (vaVar5.f16002x1) {
                            vaVar5.I0(false);
                        } else if (vaVar5.f15981m2) {
                            vaVar5.v0(true);
                        } else if (!vaVar5.G0) {
                            Runnable runnable = vaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            vaVar5.D0(null, true);
                        }
                        break;
                }
            }
        });
        textViewH.setAlpha(0.0f);
        textViewH.setVisibility(8);
        TextView textViewH2 = org.telegram.ui.Cells.pa.h(frameLayout, textViewH, h7.z5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f15980m1 = textViewH2;
        textViewH2.setBackground(org.telegram.ui.ActionBar.g6.f0(822083583, 7, -1));
        textViewH2.setPadding(org.telegram.ui.Cells.pa.c(8.0f, R.string.Done, textViewH2), 0, AndroidUtilities.dp(8.0f), 0);
        textViewH2.setGravity(16);
        textViewH2.setTextColor(-1);
        textViewH2.setTypeface(AndroidUtilities.bold());
        textViewH2.setTextSize(1, 16.0f);
        final int i17 = 3;
        textViewH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        va vaVar2 = vaVar;
                        v5 v5Var2 = vaVar2.K0;
                        if (v5Var2 != null && (v5Var2.getCurrentBrush() instanceof yf.l)) {
                            v5Var2.b();
                            vaVar2.f15969g1.setSelectedIndex(1);
                            vaVar2.l((yf.m) yf.m.f49979a.get(0));
                        } else {
                            vaVar2.f16005z0.c();
                        }
                        break;
                    case 1:
                        va vaVar3 = vaVar;
                        v5 v5Var3 = vaVar3.K0;
                        yf.s1 s1Var2 = vaVar3.f16005z0;
                        if (s1Var2.a()) {
                            if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof yf.l)) {
                                v5Var3.b();
                                vaVar3.f15969g1.setSelectedIndex(1);
                                vaVar3.l((yf.m) yf.m.f49979a.get(0));
                            }
                            if (v5Var3 != null) {
                                v5Var3.a();
                            }
                            s1Var2.f50078c.clear();
                            s1Var2.f50077b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            vaVar3.N0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        va vaVar4 = vaVar;
                        zf.j jVar = vaVar4.F0;
                        if (jVar instanceof zf.v2) {
                            AndroidUtilities.hideKeyboard(((zf.v2) jVar).getFocusedView());
                        }
                        if (vaVar4.f15981m2) {
                            vaVar4.v0(false);
                        }
                        vaVar4.C0(vaVar4.F0);
                        vaVar4.D0(null, true);
                        break;
                    case 3:
                        vaVar.D0(null, true);
                        break;
                    default:
                        va vaVar5 = vaVar;
                        if (vaVar5.f16002x1) {
                            vaVar5.I0(false);
                        } else if (vaVar5.f15981m2) {
                            vaVar5.v0(true);
                        } else if (!vaVar5.G0) {
                            Runnable runnable = vaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            vaVar5.D0(null, true);
                        }
                        break;
                }
            }
        });
        textViewH2.setAlpha(0.0f);
        textViewH2.setVisibility(8);
        frameLayout.addView(textViewH2, h7.z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        b6 b6Var = new b6(vaVar, context, r0VarE);
        this.P0 = b6Var;
        b6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        b6Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(b6Var, h7.z5.e(-1, 104, 80));
        zf.r1 r1Var = new zf.r1(context, (z7Var == null || z7Var.v() || z7Var.f17235u || z9Var == null) ? false : true);
        this.f15969g1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        b6Var.addView(r1Var, h7.z5.c(48.0f, -1));
        zf.o1 o1Var = new zf.o1(context);
        this.f15971h1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        final int i18 = 1;
        post(new Runnable() {
            @Override
            public final void run() {
                switch (i18) {
                    case 0:
                        va vaVar2 = vaVar;
                        yf.p1 p1Var2 = vaVar2.f16000w1;
                        vaVar2.F0(p1Var2);
                        yf.r0.e(i10).j(p1Var2.f50036c);
                        break;
                    default:
                        vaVar.f15971h1.setTypeface(yf.r0.e(i10).f50061j);
                        break;
                }
            }
        });
        o1Var.setAlignment(yf.r0.e(i10).f50059g);
        b6Var.addView(o1Var, h7.z5.c(48.0f, -1));
        f5 f5Var = new f5(vaVar, context);
        this.Q0 = f5Var;
        addView(f5Var, h7.z5.c(-1.0f, -1));
        zf.t1 t1Var = new zf.t1(context);
        this.f15973i1 = t1Var;
        t1Var.setVisibility(8);
        t1Var.setOnItemClickListener(new ag.p0(vaVar, 14));
        o1Var.setTypefaceListView(t1Var);
        f5Var.addView(t1Var, h7.z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(t5Var.N0(org.telegram.ui.ActionBar.g6.G8));
        g5 g5Var = new g5(vaVar, context);
        this.f15992s1 = g5Var;
        g5Var.setVisibility(8);
        g5Var.setColorPalette(yf.r0.e(i10));
        g5Var.setColorListener(new gh.c6(vaVar, 2));
        b6Var.addView(g5Var, h7.z5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        zf.f1 f1Var = new zf.f1(context);
        this.f15999w0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        b6Var.addView(f1Var, h7.z5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final int i19 = 4;
        f1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        va vaVar2 = vaVar;
                        v5 v5Var2 = vaVar2.K0;
                        if (v5Var2 != null && (v5Var2.getCurrentBrush() instanceof yf.l)) {
                            v5Var2.b();
                            vaVar2.f15969g1.setSelectedIndex(1);
                            vaVar2.l((yf.m) yf.m.f49979a.get(0));
                        } else {
                            vaVar2.f16005z0.c();
                        }
                        break;
                    case 1:
                        va vaVar3 = vaVar;
                        v5 v5Var3 = vaVar3.K0;
                        yf.s1 s1Var2 = vaVar3.f16005z0;
                        if (s1Var2.a()) {
                            if (v5Var3 != null && (v5Var3.getCurrentBrush() instanceof yf.l)) {
                                v5Var3.b();
                                vaVar3.f15969g1.setSelectedIndex(1);
                                vaVar3.l((yf.m) yf.m.f49979a.get(0));
                            }
                            if (v5Var3 != null) {
                                v5Var3.a();
                            }
                            s1Var2.f50078c.clear();
                            s1Var2.f50077b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            vaVar3.N0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        va vaVar4 = vaVar;
                        zf.j jVar = vaVar4.F0;
                        if (jVar instanceof zf.v2) {
                            AndroidUtilities.hideKeyboard(((zf.v2) jVar).getFocusedView());
                        }
                        if (vaVar4.f15981m2) {
                            vaVar4.v0(false);
                        }
                        vaVar4.C0(vaVar4.F0);
                        vaVar4.D0(null, true);
                        break;
                    case 3:
                        vaVar.D0(null, true);
                        break;
                    default:
                        va vaVar5 = vaVar;
                        if (vaVar5.f16002x1) {
                            vaVar5.I0(false);
                        } else if (vaVar5.f15981m2) {
                            vaVar5.v0(true);
                        } else if (!vaVar5.G0) {
                            Runnable runnable = vaVar5.H1;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            vaVar5.D0(null, true);
                        }
                        break;
                }
            }
        });
        zf.j1 j1Var = new zf.j1(context);
        this.f16001x0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new gg.f(vaVar, context, r0VarE, 15));
        b6Var.addView(j1Var, h7.z5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        zf.w1 w1Var = new zf.w1(context);
        this.Z0 = w1Var;
        w1Var.setColorSwatch(p1Var);
        w1Var.setRenderView(v5Var);
        w1Var.setValueOverride(iVar);
        p1Var.f50036c = iVar.get();
        final int i20 = 0;
        w1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (i20) {
                    case 0:
                        va vaVar2 = vaVar;
                        yf.p1 p1Var2 = vaVar2.f16000w1;
                        vaVar2.F0(p1Var2);
                        yf.r0.e(i10).j(p1Var2.f50036c);
                        break;
                    default:
                        vaVar.f15971h1.setTypeface(yf.r0.e(i10).f50061j);
                        break;
                }
            }
        });
        addView(w1Var, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R0 = frameLayout2;
        addView(frameLayout2, h7.z5.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(p1Var, null, false);
        l((yf.m) yf.m.f49979a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (((double) AndroidUtilities.displaySize.y) * 0.65d))));
        }
        this.K1 = new i5(vaVar, rbVar, new gh.d1(10, vaVar, rbVar));
        l2.C = 1;
    }

    public static void G0(zf.v2 v2Var, int i10) {
        int i11;
        v2Var.setAlign(i10);
        int i12 = 2;
        if (i10 != 1) {
            i11 = i10 != 2 ? 19 : 21;
        } else {
            i11 = 17;
        }
        v2Var.getEditText().setGravity(i11);
        if (i10 == 1) {
            i12 = 4;
        } else if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i12 = 3;
        }
        v2Var.getEditText().setTextAlignment(i12);
    }

    public static void Z(va vaVar, yf.r0 r0Var, Integer num) {
        r0Var.h(num.intValue(), true);
        r0Var.g();
        vaVar.setNewColor(num.intValue());
        vaVar.f15992s1.setSelectedColorIndex(r0Var.d());
        vaVar.P1 = null;
    }

    public static void a0(va vaVar, Integer num) {
        vaVar.setNewColor(num.intValue());
        vaVar.I0(false);
    }

    public ViewGroup getBarView() {
        return this.U0 == 2 ? this.f15971h1 : this.f15969g1;
    }

    private int getFrameRotation() {
        int i10 = this.f15959b1;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private tu0 getPaintingSize() {
        tu0 tu0Var = this.D0;
        if (tu0Var != null) {
            return tu0Var;
        }
        tu0 tu0Var2 = new tu0(1080.0f, 1920.0f);
        this.D0 = tu0Var2;
        return tu0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            z5 z5Var = this.N0;
            if (i10 >= z5Var.getChildCount()) {
                return;
            }
            View childAt = z5Var.getChildAt(i10);
            if (childAt instanceof zf.o2) {
                ImageReceiver imageReceiver = ((zf.o2) childAt).f50651t0;
                oi0 lottieAnimation = imageReceiver.getLottieAnimation();
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
                    animation.f34500y = z10;
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
        }
    }

    public void setNewColor(int i10) {
        yf.p1 p1Var = this.f16000w1;
        int i11 = p1Var.f50034a;
        p1Var.f50034a = i10;
        E0(p1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new t4(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.H0 = i10;
        zf.j jVar = this.F0;
        if (jVar instanceof zf.v2) {
            ((zf.v2) jVar).setType(i10);
        }
        yf.r0 r0VarE = yf.r0.e(this.B1);
        r0VarE.h = i10;
        r0VarE.f50054a.edit().putInt("text_type", i10).apply();
        this.f15971h1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        m5 m5Var = new m5(this, context);
        this.S0 = m5Var;
        m5Var.setClipToPadding(false);
        this.S0.setOrientation(0);
        this.P0.addView(this.S0, h7.z5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f15963d1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f15963d1;
        int i10 = org.telegram.ui.ActionBar.g6.f23144i6;
        t5 t5Var = this.C1;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i10, t5Var), 7, -1));
        this.f15963d1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f15963d1.setTextColor(-1);
        this.f15963d1.setTextSize(1, 14.0f);
        this.f15963d1.setGravity(1);
        this.f15963d1.setTypeface(AndroidUtilities.bold());
        this.f15963d1.setSingleLine();
        final int i11 = 0;
        this.f15963d1.setOnClickListener(new View.OnClickListener(this) {

            public final f6 f16381b;

            {
                this.f16381b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        f6 f6Var = this.f16381b;
                        if (!f6Var.G0) {
                            f6Var.R0(0);
                        } else {
                            f6Var.D0(null, true);
                        }
                        break;
                    case 1:
                        this.f16381b.A0();
                        break;
                    default:
                        f6 f6Var2 = this.f16381b;
                        f6Var2.R0(2);
                        if (!(f6Var2.F0 instanceof zf.v2)) {
                            f6Var2.f15972h2 = true;
                            f6Var2.o0(true);
                        }
                        break;
                }
            }
        });
        this.S0.addView(this.f15963d1, h7.z5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f15965e1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f15965e1.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i10, t5Var), 7, -1));
        this.f15965e1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        final int i12 = 1;
        this.f15965e1.setOnClickListener(new View.OnClickListener(this) {

            public final f6 f16381b;

            {
                this.f16381b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        f6 f6Var = this.f16381b;
                        if (!f6Var.G0) {
                            f6Var.R0(0);
                        } else {
                            f6Var.D0(null, true);
                        }
                        break;
                    case 1:
                        this.f16381b.A0();
                        break;
                    default:
                        f6 f6Var2 = this.f16381b;
                        f6Var2.R0(2);
                        if (!(f6Var2.F0 instanceof zf.v2)) {
                            f6Var2.f15972h2 = true;
                            f6Var2.o0(true);
                        }
                        break;
                }
            }
        });
        this.f15965e1.setTextColor(-1);
        this.f15965e1.setTextSize(1, 14.0f);
        this.f15965e1.setGravity(1);
        this.f15965e1.setTypeface(AndroidUtilities.bold());
        this.f15965e1.setAlpha(0.6f);
        this.f15965e1.setSingleLine();
        this.S0.addView(this.f15965e1, h7.z5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f15967f1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f15967f1.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i10, t5Var), 7, -1));
        this.f15967f1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f15967f1.setTextColor(-1);
        this.f15967f1.setTextSize(1, 14.0f);
        this.f15967f1.setGravity(1);
        this.f15967f1.setTypeface(AndroidUtilities.bold());
        this.f15967f1.setAlpha(0.6f);
        this.f15967f1.setSingleLine();
        final int i13 = 2;
        this.f15967f1.setOnClickListener(new View.OnClickListener(this) {

            public final f6 f16381b;

            {
                this.f16381b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        f6 f6Var = this.f16381b;
                        if (!f6Var.G0) {
                            f6Var.R0(0);
                        } else {
                            f6Var.D0(null, true);
                        }
                        break;
                    case 1:
                        this.f16381b.A0();
                        break;
                    default:
                        f6 f6Var2 = this.f16381b;
                        f6Var2.R0(2);
                        if (!(f6Var2.F0 instanceof zf.v2)) {
                            f6Var2.f15972h2 = true;
                            f6Var2.o0(true);
                        }
                        break;
                }
            }
        });
        this.S0.addView(this.f15967f1, h7.z5.l(1.0f, 0, -2));
    }

    public static boolean x0(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    @Override
    public final void A() {
        N0(new v4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0() {
        final int i10 = this.U0;
        R0(1);
        postDelayed(new ag.l3(this, 17), 350L);
        o5 o5Var = new o5(this, getContext(), this.C1, i10);
        this.f15970g2 = o5Var;
        rb rbVar = this.I1;
        Objects.requireNonNull(rbVar);
        o5Var.f16292w = new zf.w0(1, rbVar);
        final boolean[] zArr = {true};
        o5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                f6 f6Var = this.f15857a;
                f6Var.f15970g2 = null;
                if (zArr[0]) {
                    f6Var.z0(false);
                }
                f6Var.R0(i10);
            }
        });
        o5Var.f16294y = new x4(this);
        o5Var.q0(new e5(this, zArr, o5Var, 0));
        o5Var.show();
        z0(true);
    }

    public final void B0(zf.j jVar) {
        this.f16005z0.b(jVar.getUUID(), new u4(this, jVar, 0));
    }

    public final void C0(zf.j jVar) {
        zf.j jVar2 = this.F0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f50460i0, false);
            D0(null, true);
            if (jVar instanceof zf.v2) {
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
            yf.s1 s1Var = this.f16005z0;
            s1Var.f50077b.remove(uuid);
            s1Var.f50078c.remove(uuid);
            AndroidUtilities.runOnUIThread(new qf.b(s1Var, 22));
        }
        zf.w1 w1Var = this.Z0;
        k5.i iVar = this.f15958a1;
        w1Var.setValueOverride(iVar);
        w1Var.setShowPreview(true);
        float f10 = iVar.get();
        yf.p1 p1Var = this.f16000w1;
        p1Var.f50036c = f10;
        E0(p1Var, null, false);
        if (this.f15976j2 || !(jVar instanceof zf.c2)) {
            return;
        }
        sb sbVar = ((va) this).f16954w2;
        hb hbVar = sbVar.T0;
        if (hbVar != null) {
            hbVar.s(null, null, true);
        }
        va vaVar = sbVar.f16798r1;
        if (vaVar != null) {
            vaVar.q0();
        }
        ib ibVar = sbVar.Y0;
        if (ibVar != null) {
            ibVar.setHasRoundVideo(false);
        }
        z7 z7Var = sbVar.G1;
        if (z7Var != null) {
            File file = z7Var.f17224o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                sbVar.G1.f17224o0 = null;
            }
            if (sbVar.G1.f17226p0 != null) {
                try {
                    new File(sbVar.G1.f17226p0).delete();
                } catch (Exception unused2) {
                }
                sbVar.G1.f17226p0 = null;
            }
        }
    }

    @Override
    public final void D() {
        P0(true);
    }

    public final boolean D0(zf.j jVar, boolean z10) {
        boolean z11;
        cc ccVar;
        cc ccVar2;
        wj0 wj0Var;
        int i10;
        boolean z12 = jVar instanceof zf.v2;
        int i11 = 2;
        if (z12 && (((i10 = this.V0) == -1 && this.U0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.X0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.f16002x1) {
                I0(false);
            }
            R0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            zf.v2 v2Var = (zf.v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            zf.o1 o1Var = this.f15971h1;
            o1Var.setAlignment(i11);
            yf.i0 typeface = v2Var.getTypeface();
            if (typeface != null) {
                o1Var.setTypeface(typeface.f49948a);
            }
            o1Var.e(v2Var.getType(), true);
            this.Q0.invalidate();
        }
        zf.j jVar2 = this.F0;
        if (jVar2 == null) {
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!jVar.W) {
                    if (jVar instanceof zf.s0) {
                        zf.s0 s0Var = (zf.s0) jVar;
                        s0Var.setType((s0Var.getType() + 1) % s0Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof zf.w2) {
                        zf.w2 w2Var = (zf.w2) jVar;
                        w2Var.setType((w2Var.getType() + 1) % w2Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof zf.p0) {
                        zf.p0 p0Var = (zf.p0) jVar;
                        zf.n0 n0Var = p0Var.m0;
                        if (n0Var.e()) {
                            n0Var.setPreviewType(n0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        p0Var.setType(p0Var.getNextType());
                        return true;
                    }
                    if (!this.G0) {
                        if (jVar instanceof zf.v2) {
                            this.I0 = true;
                            r0();
                            return true;
                        }
                        if (!(jVar instanceof zf.b2)) {
                            M0(jVar2);
                            return true;
                        }
                        zf.b2 b2Var = (zf.b2) jVar;
                        if (this.Y1 && this.W1 == jVar) {
                            b2Var.q(true);
                            return true;
                        }
                        zf.b2 b2Var2 = this.W1;
                        if (b2Var2 != null && b2Var2 != b2Var && (wj0Var = this.V1) != null) {
                            wj0Var.animate().alpha(0.0f).setListener(new k5(wj0Var, 0));
                            this.V1 = null;
                            this.Y1 = false;
                            this.X1 = 0.0f;
                        }
                        if (this.V1 == null) {
                            wj0 wj0Var2 = new wj0(2, this.B1, getContext(), LaunchActivity.R(), new jh.m2(6, new jh.b()));
                            this.V1 = wj0Var2;
                            org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(this.a2, wj0Var2, 0, false);
                            this.V1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                            this.I1.addView(this.V1, h7.z5.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.b.k(-16777216, 120));
                            wj0 wj0Var3 = this.V1;
                            af.h hVar = new af.h();
                            hVar.f277e = this;
                            hVar.f276c = daVar;
                            hVar.d = paint;
                            hVar.f275b = new Path();
                            wj0Var3.setDelegate(hVar);
                            this.V1.p(null, null, true);
                        }
                        this.V1.setFragment(LaunchActivity.R());
                        this.W1 = b2Var;
                        O0(true);
                        return true;
                    }
                    if (jVar2 instanceof zf.v2) {
                        AndroidUtilities.showKeyboard(((zf.v2) jVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.f50460i0, false);
            zf.j jVar3 = this.F0;
            if (jVar3 instanceof zf.v2) {
                zf.v2 v2Var2 = (zf.v2) jVar3;
                zf.u2 u2Var = v2Var2.m0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    this.G0 = false;
                    AndroidUtilities.hideKeyboard(((zf.v2) this.F0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar3 instanceof zf.c2) && (ccVar2 = ((va) this).f16954w2.V0) != null) {
                ccVar2.l(false);
            }
            z11 = true;
        }
        zf.j jVar4 = this.F0;
        this.F0 = jVar;
        if ((jVar4 instanceof zf.v2) && TextUtils.isEmpty(((zf.v2) jVar4).getText())) {
            C0(jVar4);
        }
        zf.j jVar5 = this.F0;
        if (jVar4 != jVar5 && (jVar5 instanceof zf.c2) && (ccVar = ((va) this).f16954w2.V0) != null) {
            ccVar.l(true);
        }
        zf.j jVar6 = this.F0;
        k5.i iVar = this.f15958a1;
        yf.p1 p1Var = this.f16000w1;
        zf.w1 w1Var = this.Z0;
        if (jVar6 != null) {
            a6 a6Var = this.M0;
            jVar6.f50460i0 = a6Var;
            jVar6.l(a6Var, true);
            zf.j jVar7 = this.F0;
            if (jVar7 instanceof zf.v2) {
                zf.v2 v2Var3 = (zf.v2) jVar7;
                v2Var3.getSwatch().f50036c = p1Var.f50036c;
                v2Var3.f50742v0 = false;
                F0(v2Var3.getSwatch());
                w1Var.setValueOverride(new j5(v2Var3, (int) (this.D0.f32893a / 9.0f), 0));
                w1Var.setShowPreview(false);
            } else {
                w1Var.setValueOverride(iVar);
                w1Var.setShowPreview(true);
                p1Var.f50036c = iVar.get();
                E0(p1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.X0;
            if (valueAnimator2 != null && this.V0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.f16002x1) {
                I0(false);
            }
            R0(0);
            w1Var.setValueOverride(iVar);
            w1Var.setShowPreview(true);
            p1Var.f50036c = iVar.get();
            E0(p1Var, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(yf.p1 p1Var, Integer num, boolean z10) {
        yf.p1 p1Var2 = this.f16000w1;
        if (p1Var2 != p1Var) {
            p1Var2.f50034a = p1Var.f50034a;
            p1Var2.f50035b = p1Var.f50035b;
            p1Var2.f50036c = p1Var.f50036c;
            int i10 = this.B1;
            yf.r0.e(i10).h(p1Var.f50034a, true);
            yf.r0.e(i10).j(p1Var.f50036c);
        }
        int i11 = p1Var.f50034a;
        v5 v5Var = this.K0;
        v5Var.setColor(i11);
        v5Var.setBrushSize(p1Var.f50036c);
        int i12 = p1Var2.f50034a;
        int i13 = 0;
        if (num == null || num.intValue() == i12) {
            b6 b6Var = this.P0;
            if (b6Var != null) {
                b6Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new n4(this, num, i12, i13));
            duration.start();
        }
        zf.j jVar = this.F0;
        if (jVar instanceof zf.v2) {
            ((zf.v2) jVar).setSwatch(new yf.p1(p1Var.f50035b, p1Var.f50036c, p1Var.f50034a));
            return;
        }
        if (z10 && (jVar instanceof zf.s0)) {
            ((zf.s0) jVar).setColor(p1Var.f50034a);
            ((zf.s0) this.F0).setType(3);
        } else if (z10 && (jVar instanceof zf.w2)) {
            ((zf.w2) jVar).setColor(p1Var.f50034a);
            ((zf.w2) this.F0).setType(3);
        } else if (z10 && (jVar instanceof zf.p0)) {
            ((zf.p0) jVar).setColor(p1Var.f50034a);
            ((zf.p0) this.F0).setType(0);
        }
    }

    public final void F0(yf.p1 p1Var) {
        E0(p1Var, null, false);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f15983n2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f15993s2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f15993s2).commit();
            } else {
                this.f15991r2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f15991r2).commit();
            }
        }
        boolean z12 = this.f15981m2;
        i5 i5Var = this.K1;
        if (z12) {
            int paddingUnderContainer = this.I1.getPaddingUnderContainer() + (z10 ? this.f15993s2 : this.f15991r2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f15979l2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = AndroidUtilities.displaySize.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.f15979l2.setLayoutParams(layoutParams);
                this.f15987p2 = layoutParams.height;
                i5Var.a();
                requestLayout();
            }
        }
        if (this.f15995t2 == i10 && this.f15997u2 == z10) {
            return;
        }
        this.f15995t2 = i10;
        this.f15997u2 = z10;
        boolean z13 = this.f15983n2;
        zf.j jVar = this.F0;
        if (jVar instanceof zf.v2) {
            this.f15983n2 = ((zf.v2) jVar).getEditText().isFocused() && i5Var.c();
        } else {
            this.f15983n2 = false;
        }
        if (this.f15983n2 && this.f15981m2) {
            J0(0);
        }
        if (this.f15987p2 != 0 && !(z11 = this.f15983n2) && z11 != z13 && !this.f15981m2) {
            this.f15987p2 = 0;
            i5Var.a();
            requestLayout();
        }
        U0();
        if (z13 && !this.f15983n2 && this.f15987p2 > 0 && this.f15989q2) {
            this.f15989q2 = false;
        }
        S0();
    }

    public final void H0() {
        int i10;
        r5 r5Var;
        Emoji.EmojiSpan[] emojiSpanArr;
        zf.j jVar;
        ArrayList arrayList = this.M1;
        if (arrayList == null) {
            return;
        }
        z7 z7Var = this.L1;
        this.L1 = null;
        this.M1 = null;
        int size = arrayList.size();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            z5 z5Var = this.N0;
            if (i11 >= size) {
                z5Var.setVisibility(0);
                return;
            }
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
            byte b10 = mediaEntity.type;
            if (b10 == 0) {
                s5 s5VarN0 = n0(mediaEntity.parentObject, mediaEntity.document);
                if ((2 & mediaEntity.subType) != 0) {
                    s5VarN0.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = s5VarN0.getLayoutParams();
                layoutParams.width = mediaEntity.viewWidth;
                layoutParams.height = mediaEntity.viewHeight;
                i10 = i11;
                jVar = s5VarN0;
            } else if (b10 == 1) {
                zf.v2 v2VarO0 = o0(z10);
                v2VarO0.setType(mediaEntity.subType);
                v2VarO0.setTypeface(mediaEntity.textTypeface);
                v2VarO0.setBaseFontSize(mediaEntity.fontSize);
                SpannableString spannableString = new SpannableString(mediaEntity.text);
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i12);
                    i12++;
                    VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                    org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(emojiEntity2.document_id, 1.0f, v2VarO0.getFontMetricsInt());
                    int i13 = emojiEntity2.offset;
                    spannableString.setSpan(t5Var, i13, emojiEntity2.length + i13, 33);
                    i11 = i11;
                }
                i10 = i11;
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableString, v2VarO0.getFontMetricsInt(), false);
                if ((charSequenceReplaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                v2VarO0.setText(charSequenceReplaceEmoji);
                G0(v2VarO0, mediaEntity.textAlign);
                yf.p1 swatch = v2VarO0.getSwatch();
                swatch.f50034a = mediaEntity.color;
                v2VarO0.setSwatch(swatch);
                jVar = v2VarO0;
            } else {
                i10 = i11;
                if (b10 == 2) {
                    zf.x1 x1VarK0 = k0(mediaEntity.text, false);
                    x1VarK0.C0 = mediaEntity.crop;
                    x1VarK0.f50773x0 = false;
                    if ((2 & mediaEntity.subType) != 0) {
                        x1VarK0.r(false);
                    }
                    if ((mediaEntity.subType & 16) != 0) {
                        x1VarK0.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = x1VarK0.getLayoutParams();
                    layoutParams2.width = mediaEntity.viewWidth;
                    layoutParams2.height = mediaEntity.viewHeight;
                    jVar = x1VarK0;
                } else if (b10 == 6) {
                    ArrayList arrayList3 = z7Var.v;
                    boolean z11 = z7Var.K;
                    this.f15972h2 = true;
                    r5Var = new r5(this, getContext(), e0(), arrayList3, this.a2, z11, this.f15960b2);
                    r5Var.setDelegate(this);
                    z5Var.addView(r5Var);
                    g0();
                    if (mediaEntity.viewWidth > 0 && mediaEntity.viewHeight > 0) {
                        jVar = r5Var;
                        jVar = r5Var;
                        ViewGroup.LayoutParams layoutParams3 = r5Var.getLayoutParams();
                        layoutParams3.width = mediaEntity.viewWidth;
                        layoutParams3.height = mediaEntity.viewHeight;
                        jVar = r5Var;
                    }
                } else if (b10 == 3) {
                    zf.s0 s0VarJ0 = j0(mediaEntity.media, mediaEntity.mediaArea);
                    int i14 = mediaEntity.color;
                    if (i14 != 0) {
                        s0VarJ0.setColor(i14);
                    }
                    s0VarJ0.setType(mediaEntity.subType);
                    jVar = s0VarJ0;
                } else {
                    if (b10 == 8) {
                        pc pcVar = mediaEntity.weather;
                        if (pcVar != null) {
                            zf.w2 w2VarP0 = p0(pcVar);
                            int i15 = mediaEntity.color;
                            if (i15 != 0) {
                                w2VarP0.setColor(i15);
                            }
                            w2VarP0.setType(mediaEntity.subType);
                            jVar = w2VarP0;
                        }
                    } else if (b10 == 7) {
                        zf.p0 p0VarI0 = i0(mediaEntity.linkSettings);
                        zf.n0 n0Var = p0VarI0.m0;
                        int i16 = mediaEntity.color;
                        if (i16 != 0) {
                            p0VarI0.setColor(i16);
                        }
                        boolean zE = n0Var.e();
                        int i17 = n0Var.h;
                        int i18 = n0Var.f50589f;
                        if (zE) {
                            n0Var.setPreviewType(mediaEntity.subType);
                        }
                        byte b11 = mediaEntity.subType;
                        if (b11 == -1) {
                            p0VarI0.setType(3);
                            n0Var.d();
                            mediaEntity.viewWidth = ((int) Math.ceil(n0Var.T)) + i18 + i18;
                            mediaEntity.viewHeight = ((int) Math.ceil(n0Var.U)) + i17 + i17;
                            PointF position = p0VarI0.getPosition();
                            position.y = (this.O1 * 0.3f) + position.y;
                            p0VarI0.setPosition(position);
                        } else {
                            p0VarI0.setType(b11);
                            jVar = p0VarI0;
                        }
                    } else if (b10 == 4) {
                        zf.b2 b2VarL0 = l0(false);
                        b2VarL0.s(ig.q0.d(mediaEntity.mediaArea.reaction), false);
                        if (mediaEntity.mediaArea.flipped) {
                            b2VarL0.r(false);
                        }
                        jVar = b2VarL0;
                        if (mediaEntity.mediaArea.dark) {
                            b2VarL0.q(false);
                            jVar = b2VarL0;
                        }
                    } else if (b10 == 5 && z7Var.f17224o0 != null) {
                        zf.c2 c2VarM0 = m0(z7Var.f17226p0, false);
                        sb sbVar = ((va) this).f16954w2;
                        hb hbVar = sbVar.T0;
                        if (hbVar != null) {
                            hbVar.f16587w = c2VarM0;
                            m61 m61Var = hbVar.f16589x;
                            if (m61Var != null) {
                                m61Var.W(c2VarM0.f50363q0);
                            }
                        }
                        ib ibVar = sbVar.Y0;
                        if (ibVar != null) {
                            ibVar.setHasRoundVideo(true);
                        }
                        jVar = c2VarM0;
                        if ((2 & mediaEntity.subType) != 0) {
                            boolean z12 = !c2VarM0.f50360n0;
                            c2VarM0.f50360n0 = z12;
                            c2VarM0.f50361o0.f(z12, true);
                            c2VarM0.invalidate();
                            jVar = c2VarM0;
                        }
                    }
                    i11 = i10 + 1;
                    z10 = false;
                }
            }
            jVar = r5Var;
            jVar = r5Var;
            jVar = r5Var;
            jVar.setX((mediaEntity.f19646x * this.N1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
            jVar.setY((mediaEntity.f19647y * this.O1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
            jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
            jVar.setScale(mediaEntity.scale);
            jVar.setRotation((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d));
            i11 = i10 + 1;
            z10 = false;
        }
    }

    public final void I0(final boolean z10) {
        if (this.f16002x1 != z10) {
            this.f16002x1 = z10;
            o1.j jVar = this.f16004y1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new hb.a(z10 ? 0.0f : 1000.0f));
            this.f16004y1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.f19154i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f19147u = kVar;
            int i10 = 0;
            final boolean[] zArr = {this.K1.c() || this.f15987p2 > 0};
            final float translationY = this.P0.getTranslationY();
            final float alpha = this.f16001x0.getAlpha();
            final ViewGroup barView = getBarView();
            this.f16004y1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f10, float f11) {
                    f6 f6Var = this.f16477a;
                    b6 b6Var = f6Var.P0;
                    float f12 = f10 / 1000.0f;
                    f6Var.f16006z1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(f6Var.f16006z1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(f6Var.f16006z1, 0.25f) / 0.25f));
                    g5 g5Var = f6Var.f15992s1;
                    float f14 = f6Var.f16006z1;
                    boolean z11 = z10;
                    g5Var.y1(f14, z11);
                    zf.j1 j1Var = f6Var.f16001x0;
                    j1Var.setProgress(f6Var.f16006z1);
                    zf.f1 f1Var = f6Var.f15999w0;
                    f1Var.setProgress(f6Var.f16006z1);
                    f6Var.S0.setTranslationY(AndroidUtilities.dp(32.0f) * f6Var.f16006z1);
                    AnimatorSet animatorSet = f6Var.J1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f15 = f6Var.f16006z1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        float f16 = z11 ? 1.0f : 0.0f;
                        float f17 = alpha;
                        j1Var.setAlpha(AndroidUtilities.lerp(f17, f16, f15));
                        f1Var.setAlpha(AndroidUtilities.lerp(f17, z11 ? 1.0f : 0.0f, f15));
                        b6Var.setTranslationY(translationY - ((AndroidUtilities.dp(39.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    b6Var.invalidate();
                    if (view == f6Var.f15971h1) {
                        f6Var.Q0.invalidate();
                    }
                }
            });
            this.f16004y1.a(new p4(this, z10, i10));
            this.f16004y1.f();
            if (z10) {
                g5 g5Var = this.f15992s1;
                g5Var.setVisibility(0);
                g5Var.setSelectedColorIndex(yf.r0.e(this.B1).d());
            }
        }
    }

    public final void J0(int i10) {
        zf.o1 o1Var = this.f15971h1;
        i5 i5Var = this.K1;
        int i11 = 1;
        if (i10 == 1) {
            yy yyVar = this.f15979l2;
            boolean z10 = yyVar != null && yyVar.getVisibility() == 0;
            yy yyVar2 = this.f15979l2;
            rb rbVar = this.I1;
            if (yyVar2 != null && yyVar2.Y0 != UserConfig.selectedAccount) {
                rbVar.removeView(yyVar2);
                this.f15979l2 = null;
            }
            if (this.f15979l2 == null) {
                yy yyVar3 = new yy(null, true, false, false, getContext(), false, null, null, true, this.C1, false, false);
                this.f15979l2 = yyVar3;
                yyVar3.f35040t2 = false;
                yyVar3.Q0 = true;
                yyVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f15979l2.setForseMultiwindowLayout(true);
                }
                this.f15979l2.setDelegate(new u5(this));
                rbVar.addView(this.f15979l2);
            }
            this.f15979l2.setVisibility(0);
            this.f15981m2 = true;
            yy yyVar4 = this.f15979l2;
            if (this.f15991r2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f15991r2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f15991r2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f15993s2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f15993s2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f15993s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int paddingUnderContainer = rbVar.getPaddingUnderContainer() + (point.x > point.y ? this.f15993s2 : this.f15991r2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            yyVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                zf.j jVar = this.F0;
                if (jVar instanceof zf.v2) {
                    AndroidUtilities.hideKeyboard(((zf.v2) jVar).getEditText());
                }
            }
            this.f15987p2 = paddingUnderContainer;
            i5Var.a();
            requestLayout();
            mg emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(kg.d, true);
            }
            if (!z10) {
                if (this.f15983n2) {
                    this.f15989q2 = true;
                } else {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f15987p2, 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new q4(this, i11));
                    valueAnimatorOfFloat.addListener(new l5(this, i11));
                    valueAnimatorOfFloat.setDuration(250L);
                    valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                    valueAnimatorOfFloat.start();
                }
            }
        } else {
            mg emojiButton2 = o1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(kg.f30100e, true);
            }
            yy yyVar5 = this.f15979l2;
            if (yyVar5 != null) {
                this.f15981m2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    yyVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f15987p2 = 0;
                i5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(zf.p0 p0Var) {
        j8 j8Var = new j8(getContext(), this.C1, this.f15962c2, new gh.d1(12, this, p0Var));
        if (p0Var != null) {
            zf.m0 m0Var = p0Var.f50658q0;
            j8Var.Y = true;
            org.telegram.ui.Cells.g3 g3Var = j8Var.V;
            org.telegram.ui.Cells.g3 g3Var2 = j8Var.U;
            if (m0Var != null) {
                j8Var.f16197c0 = m0Var.d;
                j8Var.f16198d0 = false;
                g3Var2.setText(m0Var.f50570c);
                g3Var.setText(m0Var.f50569b);
                j8Var.f16203i0 = !TextUtils.isEmpty(m0Var.f50569b);
                j8Var.f16204j0 = m0Var.f50572f;
                j8Var.f16205k0 = m0Var.f50571e;
            } else {
                g3Var2.setText("");
                g3Var.setText("");
                j8Var.f16204j0 = true;
                j8Var.f16205k0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = j8Var.X;
            dVar.g(string, false, true);
            f8 f8Var = j8Var.T;
            if (f8Var != null) {
                f8Var.N(false);
            }
            dVar.setEnabled(j8Var.V(g3Var2.getText().toString()));
            j8Var.Y = false;
        }
        j8Var.setOnDismissListener(new a5(this, 1));
        j8Var.show();
        z0(true);
    }

    public final void L0(zf.s0 s0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        gi giVar = new gi(getContext(), new p5(this, callback2), false, true, false, this.C1);
        giVar.V1 = new q5();
        ih ihVar = giVar.f28694t1;
        if (s0Var != null && (messageMedia = s0Var.f50698q0) != null && (geoPoint = messageMedia.geo) != null) {
            giVar.f28695t2 = new double[]{geoPoint.lat, geoPoint._long};
            giVar.K = true;
            ihVar.setVisibility(8);
        } else if (this.Q1) {
            giVar.f28688r2 = this.S1;
            giVar.f28692s2 = this.R1;
            giVar.K = true;
            ihVar.setVisibility(8);
        } else {
            giVar.K = true;
            ihVar.setVisibility(8);
        }
        giVar.setOnDismissListener(new a5(this, 0));
        giVar.r1();
        giVar.show();
    }

    public final void M0(zf.j jVar) {
        if (jVar instanceof zf.e1) {
            org.telegram.ui.ActionBar.n1 n1Var = this.D1;
            if (n1Var == null || !n1Var.isShowing()) {
                return;
            }
            this.D1.d(true);
            return;
        }
        int[] iArr = this.f15978k2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        z5 z5Var = this.N0;
        float scaleX2 = z5Var.getScaleX() * scaleX;
        float scaleY = z5Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i11;
        N0(new u4(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, f6 f6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.n1 n1Var = this.D1;
        if (n1Var != null && n1Var.isShowing()) {
            this.D1.d(true);
            return;
        }
        if (this.E1 == null) {
            this.F1 = new Rect();
            d6 d6Var = new d6(this, getContext());
            this.E1 = d6Var;
            d6Var.setAnimationEnabled(true);
            this.E1.setOnTouchListener(new w4(this, 0));
            this.E1.setDispatchKeyEventListener(new x4(this));
            this.E1.setShownFromBottom(true);
        }
        d6 d6Var2 = this.E1;
        d6Var2.S = z10;
        d6Var2.d();
        runnable.run();
        if (this.D1 == null) {
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(this.E1, -2, -2);
            this.D1 = n1Var2;
            n1Var2.f23682b = true;
            n1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.D1.setOutsideTouchable(true);
            this.D1.setClippingEnabled(true);
            this.D1.setInputMethodMode(2);
            this.D1.setSoftInputMode(0);
            this.D1.getContentView().setFocusableInTouchMode(true);
            this.D1.setOnDismissListener(new y4(this, 0));
        }
        this.E1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.D1.setFocusable(true);
        int measuredWidth = i11 - (this.E1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.E1.getMeasuredHeight();
        this.D1.showAtLocation(f6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.n1.i(this.E1);
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            d6 d6Var3 = this.E1;
            d6Var3.setBackgroundDrawable(new org.telegram.ui.Components.ca(new org.telegram.ui.Components.da(this.a2, d6Var3, 5, false), measuredWidth, measuredHeight, drawableMutate, AndroidUtilities.dpf2(8.3f)));
        } else {
            this.E1.setBackgroundDrawable(drawableMutate);
            this.E1.setBackgroundColor(-14145495);
        }
    }

    public final void O0(boolean z10) {
        if (this.Y1 != z10) {
            if (z10 || this.V1 != null) {
                this.Y1 = z10;
                int i10 = 0;
                if (z10) {
                    this.V1.n();
                    this.V1.setVisibility(0);
                    this.V1.setSelectedReaction(this.W1.getCurrentReaction());
                    this.V1.getParent().bringChildToFront(this.V1);
                } else {
                    this.W1 = null;
                }
                if (!z10) {
                    if (this.V1.getReactionsWindow() != null) {
                        this.V1.getReactionsWindow().e();
                    }
                    this.V1.animate().alpha(0.0f).setDuration(150L).setListener(new l5(this, i10)).start();
                    return;
                }
                this.Z1 = true;
                this.I1.invalidate();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.X1, z10 ? 1.0f : 0.0f);
                this.V1.setTransitionProgress(this.X1);
                valueAnimatorOfFloat.addUpdateListener(new q4(this, 2));
                valueAnimatorOfFloat.addListener(new ag.x(14, this, z10));
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.setInterpolator(er.f28123g);
                valueAnimatorOfFloat.start();
            }
        }
    }

    public final void P0(boolean z10) {
        if (this.f15988q1 != z10) {
            this.f15988q1 = z10;
            o1.j jVar = this.f15990r1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new hb.a(z10 ? 0.0f : 1000.0f));
            this.f15990r1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.f19154i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f19147u = kVar;
            if (z10) {
                zf.t1 t1Var = this.f15973i1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            int i10 = 1;
            this.f15990r1.b(new jh.t7(i10, this));
            this.f15990r1.a(new p4(this, z10, i10));
            this.f15990r1.f();
        }
    }

    public final PointF Q0(zf.j jVar) {
        float f10;
        MediaController.CropState cropState = this.B0;
        float fMin = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float fMin2 = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + fMin2, position.y + fMin2);
        }
        float f11 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF pointFE0 = e0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                z5 z5Var = this.N0;
                if (i11 >= z5Var.getChildCount()) {
                    break;
                }
                View childAt = z5Var.getChildAt(i11);
                if (!(childAt instanceof zf.j) || (childAt instanceof zf.e1)) {
                    f10 = f11;
                } else {
                    PointF position2 = ((zf.j) childAt).getPosition();
                    f10 = f11;
                    if (((float) Math.sqrt(Math.pow(position2.y - pointFE0.y, 2.0d) + Math.pow(position2.x - pointFE0.x, 2.0d))) < f10) {
                        fMin = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z10 = true;
                    }
                }
                i11++;
                f11 = f10;
            }
            float f12 = f11;
            if (!z10) {
                break;
            }
            i10++;
            pointFE0 = new PointF(pointFE0.x + fMin, pointFE0.y + fMin);
            f11 = f12;
        }
        return pointFE0;
    }

    @Override
    public final int R() {
        return this.K1.f15642l - this.I1.getBottomPadding2();
    }

    public final void R0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.U0 == i10 || this.V0 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.U0;
        zf.o1 o1Var = this.f15971h1;
        zf.r1 r1Var = this.f15969g1;
        if (i11 == 0) {
            viewGroup = r1Var;
        } else {
            viewGroup = i11 == 2 ? o1Var : null;
        }
        this.V0 = i10;
        if (i10 == 0) {
            viewGroup2 = r1Var;
        } else {
            viewGroup2 = i10 == 2 ? o1Var : null;
        }
        int i12 = this.B1;
        yf.r0 r0VarE = yf.r0.e(i12);
        int i13 = 1;
        boolean z10 = i10 == 2;
        if (r0VarE.f50063l != z10) {
            r0VarE.f50063l = z10;
            if (z10) {
                r0VarE.i(-1, false);
            } else {
                r0VarE.i(r0VarE.f50054a.getInt("brush", 0), false);
            }
        }
        int iC = yf.r0.e(i12).c();
        yf.p1 p1Var = this.f16000w1;
        p1Var.f50034a = iC;
        E0(p1Var, null, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.X0 = duration;
        duration.setInterpolator(er.f28122f);
        this.X0.addUpdateListener(new jh.g3(this, viewGroup, viewGroup2, i13));
        this.X0.addListener(new n5(this, viewGroup, viewGroup2, i10, 0));
        this.X0.start();
    }

    public final void S0() {
        i5 i5Var = this.K1;
        zf.o1 o1Var = this.f15971h1;
        if (o1Var != null) {
            if (i5Var.c()) {
                o1Var.a(R.drawable.input_smile);
            } else if (this.f15981m2) {
                o1Var.a(R.drawable.input_keyboard);
            } else {
                o1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = i5Var.c() || this.f15981m2;
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.f15977k1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f15975j1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f15980m1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.l1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        zf.j jVar;
        ObjectAnimator objectAnimator = this.f15966e2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.K0.getParent();
        if (view == null) {
            return;
        }
        i5 i5Var = this.K1;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!i5Var.c() || i5Var.d) && this.f15987p2 <= 0) || (jVar = this.F0) == null) ? 0.0f : view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.f15966e2 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(350L);
        this.f15966e2.setInterpolator(er.h);
        this.f15966e2.start();
    }

    public final void U0() {
        boolean z10;
        if (this.F0 instanceof zf.v2) {
            i5 i5Var = this.K1;
            if ((i5Var.c() || this.f15987p2 > 0) && !i5Var.d) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        View view = this.T0;
        view.animate().cancel();
        view.setVisibility(0);
        view.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new fh.f(9, this, z10)).start();
    }

    @Override
    public final void a() {
        I0(true);
    }

    @Override
    public final void c(zf.j jVar) {
        O0(false);
        M0(jVar);
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
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new jh.p6(21, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f15974i2) {
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
            i10 = this.J0 ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = cropState.transformRotation;
            if (i11 == 90 || i11 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
            float fCeil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i10 + 0.0f;
            canvas.clipRect(Math.max(0.0f, fCeil), Math.max(0.0f, additionalBottom), Math.min(fCeil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i10 = 1;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (i10 != 0) {
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override
    public final void e() {
        setTextType((this.H0 + 1) % 4);
    }

    public final PointF e0() {
        z5 z5Var = this.N0;
        int measuredWidth = z5Var.getMeasuredWidth();
        int measuredHeight = z5Var.getMeasuredHeight();
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
        zf.j jVar = this.F0;
        if (jVar instanceof zf.v2) {
            G0((zf.v2) jVar, i10);
            yf.r0 r0VarE = yf.r0.e(this.B1);
            r0VarE.f50059g = i10;
            r0VarE.f50054a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public abstract boolean f0(cg.w1 w1Var);

    public final void g0() {
        boolean z10 = this.S1;
        z5 z5Var = this.N0;
        boolean z11 = true;
        if (!z10 && !this.U1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 >= z5Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = z5Var.getChildAt(i10);
                boolean z12 = childAt instanceof zf.v2;
                int i11 = this.B1;
                if (z12) {
                    CharSequence text = ((zf.v2) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.t5.class)) {
                            TLRPC.Document documentF = t5Var.document;
                            if (documentF == null) {
                                documentF = org.telegram.ui.Components.k5.f(i11, t5Var.getDocumentId());
                            }
                            if (documentF != null) {
                                org.telegram.ui.Components.k5.h(i11).e(documentF);
                            }
                            if (z7.u(documentF, FileLoader.getInstance(i11).getPathToAttach(documentF, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i10++;
                } else if (childAt instanceof zf.o2) {
                    TLRPC.Document sticker = ((zf.o2) childAt).getSticker();
                    if (z7.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                        break;
                    } else {
                        i10++;
                    }
                } else if (childAt instanceof zf.c2) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        for (int i12 = 0; i12 < z5Var.getChildCount(); i12++) {
            View childAt2 = z5Var.getChildAt(i12);
            if (childAt2 instanceof zf.j) {
                ((zf.j) childAt2).setIsVideo(z11);
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
        return this.f15999w0;
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
        return this.f16001x0;
    }

    public View getEntitiesView() {
        return this.N0;
    }

    public long getLcm() {
        return this.f15961c1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.t5[] t5VarArr;
        z5 z5Var = this.N0;
        int childCount = z5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = z5Var.getChildAt(i10);
            if (childAt instanceof zf.o2) {
                TLRPC.Document sticker = ((zf.o2) childAt).getSticker();
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
            } else if (childAt instanceof zf.v2) {
                CharSequence text = ((zf.v2) childAt).getText();
                if ((text instanceof Spanned) && (t5VarArr = (org.telegram.ui.Components.t5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.t5.class)) != null) {
                    for (org.telegram.ui.Components.t5 t5Var : t5VarArr) {
                        if (t5Var != null) {
                            TLRPC.Document documentF = t5Var.document;
                            if (documentF == null) {
                                documentF = org.telegram.ui.Components.k5.f(this.B1, t5Var.getDocumentId());
                            }
                            if (documentF != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f22392id = documentF.f22386id;
                                tL_inputDocument2.access_hash = documentF.access_hash;
                                byte[] bArr2 = documentF.file_reference;
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

    public yf.b1 getRenderView() {
        return this.K0;
    }

    public zf.j getSelectedEntity() {
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

    public final zf.p0 i0(zf.m0 m0Var) {
        int i10;
        this.f15972h2 = true;
        getPaintingSize();
        PointF pointFQ0 = Q0(null);
        z5 z5Var = this.N0;
        float measuredWidth = z5Var.getMeasuredWidth() <= 0 ? this.N1 : z5Var.getMeasuredWidth();
        int iDp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        zf.p0 p0Var = new zf.p0(getContext(), pointFQ0, this.B1, m0Var, measuredWidth / 360.0f, iDp);
        if (pointFQ0.x == z5Var.getMeasuredWidth() / 2.0f) {
            p0Var.setStickyX(2);
        }
        if (pointFQ0.y == z5Var.getMeasuredHeight() / 2.0f) {
            p0Var.setStickyY(2);
        }
        yf.p1 p1Var = this.f16000w1;
        if (p1Var != null && (i10 = p1Var.f50034a) != -47814) {
            p0Var.setColor(i10);
        }
        p0Var.setDelegate(this);
        p0Var.setMaxWidth(iDp);
        z5Var.addView(p0Var, h7.z5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            p0Var.j(1.0f / cropState.cropScale);
            p0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return p0Var;
    }

    @Override
    public final boolean j(zf.j jVar) {
        return D0(jVar, true);
    }

    public final zf.s0 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i10;
        this.f15972h2 = true;
        getPaintingSize();
        PointF pointFQ0 = Q0(null);
        z5 z5Var = this.N0;
        float measuredWidth = z5Var.getMeasuredWidth() <= 0 ? this.N1 : z5Var.getMeasuredWidth();
        int iDp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        zf.s0 s0Var = new zf.s0(getContext(), pointFQ0, this.B1, messageMedia, mediaArea, measuredWidth / 240.0f, iDp);
        if (pointFQ0.x == z5Var.getMeasuredWidth() / 2.0f) {
            s0Var.setStickyX(2);
        }
        if (pointFQ0.y == z5Var.getMeasuredHeight() / 2.0f) {
            s0Var.setStickyY(2);
        }
        yf.p1 p1Var = this.f16000w1;
        if (p1Var != null && (i10 = p1Var.f50034a) != -47814) {
            s0Var.setColor(i10);
        }
        s0Var.setDelegate(this);
        s0Var.setMaxWidth(iDp);
        z5Var.addView(s0Var, h7.z5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            s0Var.j(1.0f / cropState.cropScale);
            s0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return s0Var;
    }

    public final zf.x1 k0(String str, boolean z10) {
        float f10;
        tu0 tu0Var;
        this.f15972h2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e9) {
            FileLog.e(e9);
            f10 = 1.0f;
        }
        z5 z5Var = this.N0;
        if (f10 > 1.0f) {
            float fFloor = (float) Math.floor(((double) Math.max(this.N1, z5Var.getMeasuredWidth())) * 0.5d);
            tu0Var = new tu0(fFloor, fFloor / f10);
        } else {
            float fFloor2 = (float) Math.floor(((double) Math.max(this.O1, z5Var.getMeasuredHeight())) * 0.5d);
            tu0Var = new tu0(f10 * fFloor2, fFloor2);
        }
        tu0 tu0Var2 = tu0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = tu0Var2.f32893a;
            tu0Var2.f32893a = tu0Var2.f32894b;
            tu0Var2.f32894b = f11;
        }
        Context context = getContext();
        PointF pointFE0 = e0();
        int iIntValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        zf.x1 x1Var = new zf.x1(context, pointFE0, tu0Var2, str, iIntValue);
        x1Var.setDelegate(this);
        z5Var.addView(x1Var);
        g0();
        return x1Var;
    }

    @Override
    public final void l(yf.m mVar) {
        boolean z10 = mVar instanceof yf.b;
        zf.w1 w1Var = this.Z0;
        if (z10 || (mVar instanceof yf.d)) {
            w1Var.b(0.4f, 1.75f);
        } else {
            w1Var.b(0.05f, 1.0f);
        }
        w1Var.setDrawCenter(!(mVar instanceof yf.l));
        v5 v5Var = this.K0;
        if (v5Var.getCurrentBrush() instanceof yf.l) {
            this.Y0 = true;
        }
        v5Var.setBrush(mVar);
        yf.p1 p1Var = this.f16000w1;
        int i10 = p1Var.f50034a;
        p1Var.f50034a = yf.r0.e(this.B1).c();
        p1Var.f50036c = this.f15958a1.get();
        E0(p1Var, Integer.valueOf(i10), false);
        this.L0.invalidate();
    }

    public final zf.b2 l0(boolean z10) {
        String str;
        tu0 tu0Var = new tu0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF pointFE0 = e0();
        z5 z5Var = this.N0;
        if (z5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                int i10 = 0;
                while (true) {
                    if (i10 >= z5Var.getChildCount()) {
                        break loop0;
                    }
                    View childAt = z5Var.getChildAt(i10);
                    if (h7.y.a(pointFE0.x, pointFE0.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                    i10++;
                }
                pointFE0.x = (z5Var.getMeasuredWidth() * 0.05f) + pointFE0.x;
                pointFE0.y = (z5Var.getMeasuredHeight() * 0.05f) + pointFE0.y;
                pointFE0.x = Utilities.clamp(pointFE0.x, z5Var.getMeasuredWidth(), 0.0f);
                pointFE0.y = Utilities.clamp(pointFE0.y, z5Var.getMeasuredHeight(), 0.0f);
            }
        }
        zf.b2 b2Var = new zf.b2(getContext(), pointFE0);
        b2Var.f50348n0 = new jh.o8(b2Var);
        b2Var.f50349o0 = new jh.o8(b2Var);
        b2Var.f50350p0 = new ig.h0(b2Var);
        b2Var.f50351q0 = new ig.h0(b2Var);
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(b2Var);
        b2Var.f50353s0 = y5Var;
        org.telegram.ui.Components.y5 y5Var2 = new org.telegram.ui.Components.y5(b2Var);
        b2Var.f50354t0 = y5Var2;
        b2Var.f50356v0 = 1.0f;
        b2Var.m0 = tu0Var;
        y5Var2.d(1.0f, true);
        y5Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        ig.h0 h0Var = b2Var.f50350p0;
        int i11 = 0;
        while (true) {
            if (i11 >= reactionsList.size()) {
                str = reactionsList.get(0).reaction;
                break;
            }
            if (reactionsList.get(i11).title.equals("Red Heart")) {
                str = reactionsList.get(i11).reaction;
                break;
            }
            i11++;
        }
        ig.q0 q0VarB = ig.q0.b(str);
        b2Var.f50352r0 = q0VarB;
        h0Var.e(q0VarB);
        b2Var.k();
        b2Var.setDelegate(this);
        z5Var.addView(b2Var);
        g0();
        if (z10) {
            B0(b2Var);
            D0(b2Var, true);
        }
        return b2Var;
    }

    public final zf.c2 m0(String str, boolean z10) {
        this.f15972h2 = true;
        this.f15976j2 = true;
        q0();
        z5 z5Var = this.N0;
        int measuredWidth = z5Var.getMeasuredWidth();
        z5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.N1;
        }
        float f10 = measuredWidth;
        float fFloor = (float) Math.floor(0.43f * f10);
        tu0 tu0Var = new tu0(fFloor, fFloor);
        zf.c2 c2Var = new zf.c2(getContext(), new PointF((f10 - (fFloor / 2.0f)) - AndroidUtilities.dp(16.0f), (tu0Var.f32894b / 2.0f) + AndroidUtilities.dp(72.0f)), tu0Var, str);
        c2Var.setDelegate(this);
        z5Var.addView(c2Var);
        g0();
        if (z10) {
            B0(c2Var);
            post(new l4(this, c2Var, 0));
        }
        this.f15976j2 = false;
        return c2Var;
    }

    @Override
    public final boolean n(MotionEvent motionEvent) {
        if (this.f15974i2) {
            return false;
        }
        if (this.F0 != null) {
            D0(null, true);
        }
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(x8, y10);
        this.K0.e(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public final s5 n0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i10 = 0; i10 < document.attributes.size() && !(document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker); i10++) {
        }
        float f11 = 0.75f;
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            f10 = -(cropState.transformRotation + cropState.cropRotate);
            f11 = 0.75f / cropState.cropScale;
        } else {
            f10 = 0.0f;
        }
        e6 e6Var = new e6(e0(), f11, f10);
        Context context = getContext();
        float fFloor = (float) Math.floor(((double) getPaintingSize().f32893a) * 0.5d);
        s5 s5Var = new s5(this, context, e6Var.f15933a, e6Var.f15935c, e6Var.f15934b, new tu0(fFloor, fFloor), document, obj);
        boolean zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = s5Var.f50651t0;
        if (zIsTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        s5Var.setDelegate(this);
        this.N0.addView(s5Var);
        g0();
        return s5Var;
    }

    public final zf.v2 o0(boolean z10) {
        tu0 paintingSize = getPaintingSize();
        PointF pointFQ0 = Q0(null);
        zf.v2 v2Var = new zf.v2(getContext(), pointFQ0, (int) (paintingSize.f32893a / 9.0f), "", this.f16000w1, this.H0);
        float f10 = paintingSize.f32893a / 9.0f;
        v4 v4Var = new v4(this, 0);
        v2Var.f50739s0 = (int) (0.5f * f10);
        v2Var.f50740t0 = (int) (f10 * 2.0f);
        v2Var.f50741u0 = v4Var;
        float f11 = pointFQ0.x;
        z5 z5Var = this.N0;
        if (f11 == z5Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (pointFQ0.y == z5Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth(this.N1 - AndroidUtilities.dp(32.0f));
        int i10 = this.B1;
        v2Var.setTypeface(yf.r0.e(i10).f50061j);
        v2Var.setType(yf.r0.e(i10).h);
        z5Var.addView(v2Var, h7.z5.c(-2.0f, -2));
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
            int i11 = yf.r0.e(i10).f50059g;
            zf.o1 o1Var = this.f15971h1;
            o1Var.d(i11, true);
            o1Var.setOutlineType(yf.r0.e(i10).h);
        }
        return v2Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        wj0 wj0Var = this.V1;
        if (wj0Var != null) {
            AndroidUtilities.removeFromParent(wj0Var);
            this.V1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float width;
        this.C0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.f16003y0;
        if (bitmap != null) {
            width = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            width = size;
        }
        float f10 = currentActionBarHeight2;
        if (((float) Math.floor((size * currentActionBarHeight) / width)) > f10) {
            Math.floor((f10 * width) / currentActionBarHeight);
        }
        float f11 = this.D0.f32893a;
        zf.j jVar = this.F0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.P0, i10, i11);
        measureChild(this.Z0, i10, i11);
        measureChild(this.R0, i10, i11);
        measureChild(this.Q0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f15987p2 - this.I1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.O0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.C0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f15981m2 && !this.f15985o2) {
            this.C0 = true;
            w0();
            this.C0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    public final zf.w2 p0(pc pcVar) {
        int i10;
        this.f15972h2 = true;
        getPaintingSize();
        PointF pointFQ0 = Q0(null);
        z5 z5Var = this.N0;
        float measuredWidth = z5Var.getMeasuredWidth() <= 0 ? this.N1 : z5Var.getMeasuredWidth();
        int iDp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        zf.w2 w2Var = new zf.w2(getContext(), pointFQ0, this.B1, pcVar, measuredWidth / 240.0f, iDp);
        if (pointFQ0.x == z5Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (pointFQ0.y == z5Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        yf.p1 p1Var = this.f16000w1;
        if (p1Var != null && (i10 = p1Var.f50034a) != -47814) {
            w2Var.setColor(i10);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth(iDp);
        z5Var.addView(w2Var, h7.z5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            w2Var.j(1.0f / cropState.cropScale);
            w2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return w2Var;
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            z5 z5Var = this.N0;
            if (i10 >= z5Var.getChildCount()) {
                return;
            }
            View childAt = z5Var.getChildAt(i10);
            if (childAt instanceof zf.c2) {
                if (this.F0 == childAt) {
                    D0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(er.h).withEndAction(new l4(this, (zf.c2) childAt, 1)).start();
            }
            i10++;
        }
    }

    @Override
    public final boolean r() {
        return !(this.F0 instanceof zf.e1);
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

    public final zf.e1 s0() {
        int i10 = 0;
        while (true) {
            z5 z5Var = this.N0;
            if (i10 >= z5Var.getChildCount()) {
                return null;
            }
            View childAt = z5Var.getChildAt(i10);
            if (childAt instanceof zf.e1) {
                return (zf.e1) childAt;
            }
            i10++;
        }
    }

    public void setBlurManager(org.telegram.ui.Components.z9 z9Var) {
        this.a2 = z9Var;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f15974i2 != z10) {
            this.f15974i2 = z10;
            if (z10) {
                D0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            z5 z5Var = this.N0;
            if (i10 >= z5Var.getChildCount()) {
                return;
            }
            View childAt = z5Var.getChildAt(i10);
            if (childAt instanceof zf.o2) {
                ImageReceiver imageReceiver = ((zf.o2) childAt).f50651t0;
                oi0 lottieAnimation = imageReceiver.getLottieAnimation();
                imageReceiver.getAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.L(Math.round(((j10 % lottieAnimation.p()) / lottieAnimation.p()) * lottieAnimation.f31312e[0]), true, false);
                }
            }
            i10++;
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

    public final Bitmap t0(ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, z7 z7Var) {
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        int i10;
        int i11;
        int childCount;
        int i12;
        View childAt;
        zf.j jVar;
        VideoEditedInfo.MediaEntity mediaEntity;
        z5 z5Var;
        int i13;
        int i14;
        boolean z14;
        boolean z15;
        ImageReceiver imageReceiver;
        Canvas canvas;
        View view;
        boolean z16;
        long jP;
        int i15;
        zf.e1 e1Var;
        ag.w wVar;
        ArrayList arrayList2;
        zf.x0 x0Var;
        MessageObject messageObject;
        Boolean boolD;
        int id2;
        boolean z17;
        Matrix matrix;
        View childAt2;
        ImageReceiver photoImage;
        boolean z18;
        TLRPC.Message message;
        org.telegram.ui.Cells.v0 v0Var;
        hh.k5 k5Var;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        zf.c2 c2Var;
        zf.b2 b2Var;
        ig.q0 currentReaction;
        TLRPC.Reaction reaction;
        boolean z19;
        zf.p0 p0Var;
        zf.n0 n0Var;
        int color;
        boolean z20;
        TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl;
        zf.m0 m0Var;
        TLRPC.WebPage webPage;
        String str;
        ImageReceiver imageReceiver4;
        zf.w2 w2Var;
        int color2;
        TLRPC.Document codeEmojiDocument;
        VideoEditedInfo.EmojiEntity emojiEntity;
        boolean zIsAnimatedStickerDocument;
        byte b10;
        zf.s0 s0Var;
        int color3;
        TLRPC.Document codeEmojiDocument2;
        VideoEditedInfo.EmojiEntity emojiEntity2;
        boolean zIsAnimatedStickerDocument2;
        byte b11;
        zf.x1 x1Var;
        zf.o2 o2Var;
        TLRPC.Document sticker;
        float scaleX;
        float scaleY;
        float x8;
        float y10;
        boolean z21;
        TL_stories.MediaArea mediaArea;
        boolean z22;
        float radius;
        double d;
        float imageAspectRatio;
        float f10;
        float f11;
        float measuredWidth;
        TL_stories.MediaArea mediaArea2;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        zf.v2 v2Var;
        CharSequence text;
        zf.v2 v2Var2;
        Spanned spanned;
        org.telegram.ui.Components.t5[] t5VarArr;
        int i16;
        org.telegram.ui.Components.t5 t5Var;
        TLRPC.Document documentF;
        VideoEditedInfo.EmojiEntity emojiEntity3;
        int i17;
        boolean z23;
        boolean zIsAnimatedStickerDocument3;
        byte b12;
        ArrayList<TLRPC.PhotoSize> arrayList3;
        int i18;
        f6 f6Var = this;
        v5 v5Var = f6Var.K0;
        int i19 = 0;
        byte b13 = 1;
        z5 z5Var2 = f6Var.N0;
        if (z10) {
            bitmapCreateBitmap = v5Var.c(false, z13);
        } else {
            if (!z12) {
                if (z11) {
                    Bitmap bitmapC = v5Var.c(false, false);
                    bitmapCreateBitmap = bitmapC != null ? Bitmap.createBitmap(bitmapC.getWidth(), bitmapC.getHeight(), Bitmap.Config.ARGB_8888) : null;
                } else {
                    bitmap = null;
                }
                f6Var.f15961c1 = BigInteger.ONE;
                i11 = 0;
                for (i10 = 0; i10 < z5Var2.getChildCount(); i10++) {
                    if (!(z5Var2.getChildAt(i10) instanceof zf.j)) {
                        i11++;
                    }
                }
                if (i11 > 0) {
                    childCount = z5Var2.getChildCount();
                    i12 = 0;
                    while (i12 < childCount) {
                        childAt = z5Var2.getChildAt(i12);
                        if (childAt instanceof zf.j) {
                            jVar = (zf.j) childAt;
                            jVar.getPosition();
                            mediaEntity = new VideoEditedInfo.MediaEntity();
                            if (arrayList != null) {
                                z16 = jVar instanceof zf.v2;
                                jP = 5000;
                                i15 = f6Var.B1;
                                if (z16) {
                                    mediaEntity.type = b13;
                                    v2Var = (zf.v2) jVar;
                                    text = v2Var.getText();
                                    if (text instanceof Spanned) {
                                        spanned = (Spanned) text;
                                        v2Var2 = v2Var;
                                        t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(i19, text.length(), org.telegram.ui.Components.t5.class);
                                        if (t5VarArr != null) {
                                            i16 = 0;
                                            while (i16 < t5VarArr.length) {
                                                t5Var = t5VarArr[i16];
                                                org.telegram.ui.Components.t5[] t5VarArr2 = t5VarArr;
                                                documentF = t5Var.document;
                                                int i20 = i16;
                                                z5 z5Var3 = z5Var2;
                                                if (documentF == null) {
                                                    documentF = org.telegram.ui.Components.k5.f(i15, t5Var.getDocumentId());
                                                }
                                                if (documentF != null) {
                                                    org.telegram.ui.Components.k5.h(i15).e(documentF);
                                                }
                                                emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                                int i21 = childCount;
                                                int i22 = i12;
                                                emojiEntity3.document_id = t5Var.getDocumentId();
                                                emojiEntity3.document = documentF;
                                                emojiEntity3.offset = spanned.getSpanStart(t5Var);
                                                emojiEntity3.length = spanned.getSpanEnd(t5Var) - emojiEntity3.offset;
                                                emojiEntity3.documentAbsolutePath = FileLoader.getInstance(i15).getPathToAttach(documentF, true).getAbsolutePath();
                                                i17 = 0;
                                                while (true) {
                                                    if (documentF == null) {
                                                        arrayList3 = documentF.thumbs;
                                                        if (arrayList3 == null && !arrayList3.isEmpty() && !new File(emojiEntity3.documentAbsolutePath).exists()) {
                                                            FileLoader fileLoader = FileLoader.getInstance(i15);
                                                            TLRPC.PhotoSize photoSize = documentF.thumbs.get(i17);
                                                            int i23 = i17;
                                                            z23 = true;
                                                            emojiEntity3.documentAbsolutePath = fileLoader.getPathToAttach(photoSize, true).getAbsolutePath();
                                                            i18 = i23 + 1;
                                                            if (i18 >= documentF.thumbs.size()) {
                                                                break;
                                                            }
                                                            i17 = i18;
                                                        }
                                                    }
                                                    z23 = true;
                                                    break;
                                                }
                                                zIsAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, z23);
                                                if (zIsAnimatedStickerDocument3 || x0(emojiEntity3.document)) {
                                                    byte b14 = emojiEntity3.subType;
                                                    if (zIsAnimatedStickerDocument3) {
                                                        b12 = 1;
                                                    } else {
                                                        b12 = 4;
                                                    }
                                                    emojiEntity3.subType = (byte) (b14 | b12);
                                                }
                                                if (MessageObject.isTextColorEmoji(emojiEntity3.document)) {
                                                    emojiEntity3.subType = (byte) (emojiEntity3.subType | 8);
                                                }
                                                mediaEntity.entities.add(emojiEntity3);
                                                if (documentF != null) {
                                                    BigInteger bigIntegerValueOf = BigInteger.valueOf(5000L);
                                                    f6Var.f15961c1 = f6Var.f15961c1.multiply(bigIntegerValueOf).divide(f6Var.f15961c1.gcd(bigIntegerValueOf));
                                                }
                                                i16 = i20 + 1;
                                                childCount = i21;
                                                t5VarArr = t5VarArr2;
                                                z5Var2 = z5Var3;
                                                i12 = i22;
                                            }
                                        }
                                    } else {
                                        v2Var2 = v2Var;
                                    }
                                    z5Var = z5Var2;
                                    i13 = childCount;
                                    i14 = i12;
                                    mediaEntity.text = text.toString();
                                    mediaEntity.subType = (byte) v2Var2.getType();
                                    mediaEntity.color = v2Var2.getSwatch().f50034a;
                                    mediaEntity.fontSize = v2Var2.getTextSize();
                                    mediaEntity.textTypeface = v2Var2.getTypeface();
                                    mediaEntity.textAlign = v2Var2.getAlign();
                                } else {
                                    z5Var = z5Var2;
                                    i13 = childCount;
                                    i14 = i12;
                                    if (jVar instanceof zf.o2) {
                                        mediaEntity.type = (byte) 0;
                                        o2Var = (zf.o2) jVar;
                                        tu0 baseSize = o2Var.getBaseSize();
                                        mediaEntity.width = baseSize.f32893a;
                                        mediaEntity.height = baseSize.f32894b;
                                        mediaEntity.document = o2Var.getSticker();
                                        mediaEntity.parentObject = o2Var.getParentObject();
                                        sticker = o2Var.getSticker();
                                        mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                        if (MessageObject.isAnimatedStickerDocument(sticker, true) || x0(sticker)) {
                                            boolean zIsAnimatedStickerDocument4 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                            mediaEntity.subType = (byte) (mediaEntity.subType | (zIsAnimatedStickerDocument4 ? (byte) 1 : (byte) 4));
                                            jP = (!zIsAnimatedStickerDocument4 || x0(sticker)) ? o2Var.getDuration() : 5000L;
                                            if (jP != 0) {
                                                BigInteger bigIntegerValueOf2 = BigInteger.valueOf(jP);
                                                f6Var.f15961c1 = f6Var.f15961c1.multiply(bigIntegerValueOf2).divide(f6Var.f15961c1.gcd(bigIntegerValueOf2));
                                            }
                                        }
                                        if (MessageObject.isTextColorEmoji(sticker)) {
                                            mediaEntity.color = -1;
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                        }
                                        if (o2Var.f50647p0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof zf.x1) {
                                        x1Var = (zf.x1) jVar;
                                        mediaEntity.type = (byte) 2;
                                        tu0 baseSize2 = x1Var.getBaseSize();
                                        mediaEntity.width = baseSize2.f32893a;
                                        mediaEntity.height = baseSize2.f32894b;
                                        mediaEntity.text = x1Var.q(i15);
                                        mediaEntity.crop = x1Var.C0;
                                        if (x1Var.f50765p0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof zf.s0) {
                                        s0Var = (zf.s0) jVar;
                                        zf.r0 r0Var = s0Var.m0;
                                        mediaEntity.type = (byte) 3;
                                        mediaEntity.subType = (byte) s0Var.getType();
                                        mediaEntity.width = r0Var.getWidth();
                                        mediaEntity.height = r0Var.getHeight();
                                        mediaEntity.text = r0Var.getText();
                                        if (s0Var.f50695n0) {
                                            color3 = s0Var.getColor();
                                        } else {
                                            color3 = 0;
                                        }
                                        mediaEntity.color = color3;
                                        mediaEntity.density = r0Var.f50683y;
                                        mediaEntity.media = s0Var.f50698q0;
                                        TL_stories.MediaArea mediaArea3 = s0Var.f50699r0;
                                        mediaEntity.mediaArea = mediaArea3;
                                        mediaArea3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        codeEmojiDocument2 = r0Var.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity2.document_id = codeEmojiDocument2.f22386id;
                                            emojiEntity2.document = codeEmojiDocument2;
                                            emojiEntity2.documentAbsolutePath = FileLoader.getInstance(i15).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                            zIsAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                            if (zIsAnimatedStickerDocument2 || x0(emojiEntity2.document)) {
                                                byte b15 = emojiEntity2.subType;
                                                if (zIsAnimatedStickerDocument2) {
                                                    b11 = 1;
                                                } else {
                                                    b11 = 4;
                                                }
                                                emojiEntity2.subType = (byte) (b15 | b11);
                                            }
                                            mediaEntity.entities.add(emojiEntity2);
                                        }
                                    } else if (jVar instanceof zf.w2) {
                                        w2Var = (zf.w2) jVar;
                                        zf.r0 r0Var2 = w2Var.m0;
                                        mediaEntity.type = (byte) 8;
                                        mediaEntity.subType = (byte) w2Var.getType();
                                        mediaEntity.width = r0Var2.getWidth();
                                        mediaEntity.height = r0Var2.getHeight();
                                        mediaEntity.text = r0Var2.getText();
                                        if (w2Var.f50757n0) {
                                            color2 = w2Var.getColor();
                                        } else {
                                            color2 = 0;
                                        }
                                        mediaEntity.color = color2;
                                        mediaEntity.density = r0Var2.f50683y;
                                        mediaEntity.weather = w2Var.f50760q0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        pc pcVar = w2Var.f50760q0;
                                        tL_mediaAreaWeather.emoji = pcVar.f16550c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(pcVar.d);
                                        tL_mediaAreaWeather.color = r0Var2.f50677f.getColor();
                                        mediaEntity.mediaArea = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        codeEmojiDocument = r0Var2.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            emojiEntity = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity.document_id = codeEmojiDocument.f22386id;
                                            emojiEntity.document = codeEmojiDocument;
                                            emojiEntity.documentAbsolutePath = FileLoader.getInstance(i15).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                            zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, true);
                                            if (zIsAnimatedStickerDocument || x0(emojiEntity.document)) {
                                                byte b16 = emojiEntity.subType;
                                                if (zIsAnimatedStickerDocument) {
                                                    b10 = 1;
                                                } else {
                                                    b10 = 4;
                                                }
                                                emojiEntity.subType = (byte) (b16 | b10);
                                            }
                                            mediaEntity.entities.add(emojiEntity);
                                        }
                                        i13 = i13;
                                        childAt = childAt;
                                        z17 = false;
                                        z18 = false;
                                        imageReceiver = null;
                                        arrayList.add(mediaEntity);
                                        scaleX = childAt.getScaleX();
                                        scaleY = childAt.getScaleY();
                                        x8 = childAt.getX();
                                        y10 = childAt.getY();
                                        mediaEntity.viewWidth = childAt.getWidth();
                                        mediaEntity.viewHeight = childAt.getHeight();
                                        mediaEntity.width = (childAt.getWidth() * scaleX) / z5Var.getMeasuredWidth();
                                        mediaEntity.height = (childAt.getHeight() * scaleY) / z5Var.getMeasuredHeight();
                                        mediaEntity.f19646x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                        mediaEntity.f19647y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                        mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                        mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / z5Var.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / z5Var.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (jVar instanceof zf.e1) {
                                            zf.e1 e1Var2 = (zf.e1) jVar;
                                            zf.x0 x0Var2 = e1Var2.f50388n0;
                                            ag.w wVar2 = e1Var2.m0;
                                            RectF rectF = AndroidUtilities.rectTmp;
                                            z21 = z17;
                                            double dR = e1Var2.r(rectF);
                                            rectF.offset(wVar2.getX(), wVar2.getY());
                                            rectF.offset(x0Var2.getX(), x0Var2.getY());
                                            mediaEntity.mediaArea.coordinates.f22614x = (((rectF.centerX() * scaleX) + rl.c(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x8)) / z5Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.f22615y = (((rectF.centerY() * scaleY) + rl.c(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y10)) / z5Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.f22613w = ((rectF.width() * scaleX) / z5Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / z5Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                            d = dR;
                                        } else {
                                            z21 = z17;
                                            if (jVar instanceof zf.o2) {
                                                imageAspectRatio = ((zf.o2) jVar).f50651t0.getImageAspectRatio();
                                                f10 = (mediaEntity.width / 2.0f) + mediaEntity.f19646x;
                                                f11 = (mediaEntity.height / 2.0f) + mediaEntity.f19647y;
                                                measuredWidth = z5Var.getMeasuredWidth() / z5Var.getMeasuredHeight();
                                                if (imageAspectRatio > 1.0f) {
                                                    float f12 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                    mediaEntity.height = f12;
                                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                    mediaEntity.f19647y = f11 - (f12 / 2.0f);
                                                } else if (imageAspectRatio < 1.0f) {
                                                    float f13 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                    mediaEntity.width = f13;
                                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                    mediaEntity.f19646x = f10 - (f13 / 2.0f);
                                                }
                                            } else {
                                                mediaArea = mediaEntity.mediaArea;
                                                if (mediaArea == null && (((z22 = jVar instanceof zf.s0)) || (jVar instanceof zf.w2) || (jVar instanceof zf.p0) || (jVar instanceof zf.b2))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea.coordinates;
                                                    float f14 = mediaEntity.f19646x;
                                                    float f15 = mediaEntity.width;
                                                    mediaAreaCoordinates2.f22614x = ((f15 / 2.0f) + f14) * 100.0f;
                                                    mediaAreaCoordinates2.f22615y = ((mediaEntity.height / 2.0f) + mediaEntity.f19647y) * 100.0f;
                                                    if (z22) {
                                                        zf.r0 r0Var3 = ((zf.s0) jVar).m0;
                                                        mediaAreaCoordinates2.f22613w = rl.t(r0Var3.E * 2 * scaleX, z5Var.getMeasuredWidth(), f15, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = rl.t(r0Var3.F * 2 * scaleY, z5Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof zf.w2) {
                                                        zf.r0 r0Var4 = ((zf.w2) jVar).m0;
                                                        mediaAreaCoordinates2.f22613w = rl.t(r0Var4.E * 2 * scaleX, z5Var.getMeasuredWidth(), f15, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = rl.t(r0Var4.F * 2 * scaleY, z5Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof zf.p0) {
                                                        zf.n0 n0Var2 = ((zf.p0) jVar).m0;
                                                        mediaAreaCoordinates2.f22613w = rl.t(n0Var2.f50589f * 2 * scaleX, z5Var.getMeasuredWidth(), f15, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = rl.t(n0Var2.h * 2 * scaleY, z5Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof zf.b2) {
                                                        zf.b2 b2Var2 = (zf.b2) jVar;
                                                        float padding = ((b2Var2.getPadding() * 2) * scaleX) / z5Var.getMeasuredWidth();
                                                        float padding2 = ((b2Var2.getPadding() * 2) * scaleX) / z5Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mediaEntity.mediaArea.coordinates;
                                                        mediaAreaCoordinates3.f22613w = (mediaEntity.width - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (mediaEntity.height - padding2) * 100.0f;
                                                    }
                                                    mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                                    if (z22) {
                                                        radius = ((zf.s0) jVar).m0.getRadius();
                                                    } else if (jVar instanceof zf.w2) {
                                                        radius = ((zf.w2) jVar).m0.getRadius();
                                                    } else if (jVar instanceof zf.p0) {
                                                        radius = ((zf.p0) jVar).m0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        }
                                        mediaArea2 = mediaEntity.mediaArea;
                                        if (mediaArea2 != null && (mediaAreaCoordinates = mediaArea2.coordinates) != null && d > 0.0d) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((((double) scaleX) * d) / ((double) childAt.getWidth())) * 100.0d;
                                        }
                                        z14 = z18;
                                        z15 = z21;
                                    } else {
                                        if (jVar instanceof zf.p0) {
                                            p0Var = (zf.p0) jVar;
                                            n0Var = p0Var.m0;
                                            mediaEntity.type = (byte) 7;
                                            if (n0Var.e()) {
                                                mediaEntity.subType = (byte) n0Var.getPreviewType();
                                            } else {
                                                mediaEntity.subType = (byte) p0Var.getType();
                                            }
                                            mediaEntity.width = n0Var.getWidth();
                                            mediaEntity.height = n0Var.getHeight();
                                            if (p0Var.f50657p0) {
                                                color = p0Var.getColor();
                                            } else {
                                                color = 0;
                                            }
                                            mediaEntity.color = color;
                                            mediaEntity.density = n0Var.f50587e;
                                            mediaEntity.linkSettings = p0Var.f50658q0;
                                            z20 = n0Var.N;
                                            if (z20) {
                                                imageReceiver4 = n0Var.P;
                                                if (z20 && imageReceiver4.hasImageLoaded() && imageReceiver4.getBitmap() != null) {
                                                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(imageReceiver4.getBitmap()), imageReceiver4.getImageKey(), false);
                                                }
                                                zf.m0 m0Var2 = mediaEntity.linkSettings;
                                                m0Var2.f50568a |= 4;
                                                m0Var2.f50573i = n0Var.getPhotoSide();
                                            }
                                            tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            mediaEntity.mediaArea = tL_mediaAreaUrl;
                                            m0Var = p0Var.f50658q0;
                                            if (m0Var == null) {
                                                webPage = m0Var.d;
                                                if (webPage != null || TextUtils.isEmpty(webPage.url)) {
                                                    str = p0Var.f50658q0.f50570c;
                                                } else {
                                                    str = p0Var.f50658q0.d.url;
                                                }
                                                tL_mediaAreaUrl.url = str;
                                                mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (jVar instanceof zf.b2) {
                                                b2Var = (zf.b2) jVar;
                                                mediaEntity.type = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction;
                                                currentReaction = b2Var.getCurrentReaction();
                                                if (currentReaction.f11412f != null) {
                                                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                                                    tL_reactionEmoji.emoticon = currentReaction.f11412f;
                                                    reaction = tL_reactionEmoji;
                                                } else {
                                                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                                                    tL_reactionCustomEmoji.document_id = currentReaction.f11413g;
                                                    reaction = tL_reactionCustomEmoji;
                                                }
                                                tL_mediaAreaSuggestedReaction.reaction = reaction;
                                                TL_stories.MediaArea mediaArea4 = mediaEntity.mediaArea;
                                                if (b2Var.f50348n0.f13756a == 1) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                mediaArea4.dark = z19;
                                                mediaArea4.flipped = b2Var.f50355u0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else {
                                                if (jVar instanceof zf.c2) {
                                                    c2Var = (zf.c2) jVar;
                                                    tu0 baseSize3 = c2Var.getBaseSize();
                                                    mediaEntity.width = baseSize3.f32893a;
                                                    mediaEntity.height = baseSize3.f32894b;
                                                    mediaEntity.type = (byte) 5;
                                                    if (z7Var != null) {
                                                        mediaEntity.text = z7Var.f17224o0.getAbsolutePath();
                                                        mediaEntity.roundOffset = z7Var.f17230r0;
                                                        long j10 = z7Var.f17228q0;
                                                        mediaEntity.roundDuration = j10;
                                                        float f16 = j10;
                                                        mediaEntity.roundLeft = (long) (z7Var.f17232s0 * f16);
                                                        mediaEntity.roundRight = (long) (z7Var.f17234t0 * f16);
                                                    }
                                                    mediaEntity.subType = (byte) 4;
                                                    if (c2Var.f50360n0) {
                                                        mediaEntity.subType = (byte) (4 | 2);
                                                    }
                                                } else if (jVar instanceof zf.e1) {
                                                    e1Var = (zf.e1) jVar;
                                                    wVar = e1Var.m0;
                                                    arrayList2 = e1Var.f50389o0;
                                                    x0Var = e1Var.f50388n0;
                                                    mediaEntity.type = (byte) 6;
                                                    int width = e1Var.getWidth();
                                                    mediaEntity.viewWidth = width;
                                                    mediaEntity.width = width;
                                                    int height = e1Var.getHeight();
                                                    mediaEntity.viewHeight = height;
                                                    mediaEntity.height = height;
                                                    if (arrayList2.size() > 0) {
                                                        messageObject = (MessageObject) arrayList2.get(0);
                                                    } else {
                                                        messageObject = null;
                                                    }
                                                    if (messageObject != null || (message = messageObject.messageOwner) == null) {
                                                        e1Var = e1Var;
                                                        i13 = i13;
                                                        wVar = wVar;
                                                        childAt = childAt;
                                                        if (messageObject != null) {
                                                            TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                            mediaEntity.mediaArea = tL_inputMediaAreaChannelPost;
                                                            tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                            ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(i15).getInputChannel(-z7.p(messageObject));
                                                            TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                            boolD = z7.D(messageObject);
                                                            if (boolD == null) {
                                                                id2 = 0;
                                                            } else if (boolD.booleanValue()) {
                                                                id2 = messageObject.messageOwner.fwd_from.channel_post;
                                                            } else {
                                                                id2 = messageObject.getId();
                                                            }
                                                            tL_inputMediaAreaChannelPost2.msg_id = id2;
                                                        } else {
                                                            TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                            mediaEntity.mediaArea = tL_inputMediaAreaChannelPost3;
                                                            tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        }
                                                        imageReceiver = null;
                                                    } else {
                                                        TLRPC.MessageAction messageAction = message.action;
                                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                            TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                            mediaEntity.mediaArea = tL_mediaAreaStarGift;
                                                            tL_mediaAreaStarGift.slug = starGift.slug;
                                                            tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                            int i24 = 0;
                                                            while (true) {
                                                                if (i24 >= x0Var.getChildCount()) {
                                                                    v0Var = null;
                                                                    break;
                                                                }
                                                                View childAt3 = x0Var.getChildAt(i24);
                                                                if (childAt3 instanceof org.telegram.ui.Cells.v0) {
                                                                    v0Var = (org.telegram.ui.Cells.v0) childAt3;
                                                                    break;
                                                                }
                                                                i24++;
                                                            }
                                                            if (v0Var == null || (k5Var = v0Var.B0) == null || (imageReceiver2 = k5Var.d) == null) {
                                                                e1Var = e1Var;
                                                                i13 = i13;
                                                                wVar = wVar;
                                                                childAt = childAt;
                                                            } else {
                                                                imageReceiver2.setVisible(false, false);
                                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) hh.u7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                                if (stargiftattributemodel != null) {
                                                                    float fDp = AndroidUtilities.dp(110.0f);
                                                                    float centerX = imageReceiver2.getCenterX() + v0Var.getX() + x0Var.getX() + v0Var.f25787z0;
                                                                    float centerY = imageReceiver2.getCenterY() + v0Var.getY() + x0Var.getY() + v0Var.A0;
                                                                    VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                                                                    imageReceiver3 = imageReceiver2;
                                                                    mediaEntity2.type = (byte) 0;
                                                                    mediaEntity2.width = fDp;
                                                                    mediaEntity2.height = fDp;
                                                                    TLRPC.Document document = stargiftattributemodel.document;
                                                                    mediaEntity2.document = document;
                                                                    mediaEntity2.parentObject = starGift;
                                                                    mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true).getAbsolutePath();
                                                                    if (MessageObject.isAnimatedStickerDocument(document, true) || x0(document)) {
                                                                        boolean zIsAnimatedStickerDocument5 = MessageObject.isAnimatedStickerDocument(document, true);
                                                                        mediaEntity2.subType = (byte) (mediaEntity2.subType | (zIsAnimatedStickerDocument5 ? (byte) 1 : (byte) 4));
                                                                        oi0 lottieAnimation = imageReceiver3.getLottieAnimation();
                                                                        if (lottieAnimation != null && (zIsAnimatedStickerDocument5 || x0(document))) {
                                                                            jP = lottieAnimation.p();
                                                                        }
                                                                        if (jP != 0) {
                                                                            BigInteger bigIntegerValueOf3 = BigInteger.valueOf(jP);
                                                                            f6Var.f15961c1 = f6Var.f15961c1.multiply(bigIntegerValueOf3).divide(f6Var.f15961c1.gcd(bigIntegerValueOf3));
                                                                        }
                                                                    }
                                                                    float scaleX2 = childAt.getScaleX();
                                                                    float scaleY2 = childAt.getScaleY();
                                                                    float x10 = childAt.getX();
                                                                    float y11 = childAt.getY();
                                                                    int i25 = (int) fDp;
                                                                    mediaEntity2.viewWidth = i25;
                                                                    mediaEntity2.viewHeight = i25;
                                                                    mediaEntity2.width = (fDp * scaleX2) / z5Var.getMeasuredWidth();
                                                                    mediaEntity2.height = (fDp * scaleY2) / z5Var.getMeasuredHeight();
                                                                    mediaEntity2.f19646x = (childAt.getWidth() / 2.0f) + x10;
                                                                    mediaEntity2.f19647y = (childAt.getHeight() / 2.0f) + y11;
                                                                    float fC = rl.c(childAt.getWidth(), 2.0f, scaleX2, centerX * scaleX2);
                                                                    float fC2 = rl.c(childAt.getHeight(), 2.0f, scaleY2, centerY * scaleY2);
                                                                    float rotation = (float) (((double) (childAt.getRotation() / 180.0f)) * 3.141592653589793d);
                                                                    childAt = childAt;
                                                                    double d10 = mediaEntity2.f19646x;
                                                                    double d11 = fC;
                                                                    double d12 = rotation;
                                                                    double dCos = Math.cos(d12) * d11;
                                                                    double d13 = fC2;
                                                                    mediaEntity2.f19646x = (float) ((dCos - (Math.sin(d12) * d13)) + d10);
                                                                    float fCos = (float) ((Math.cos(d12) * d13) + (Math.sin(d12) * d11) + ((double) mediaEntity2.f19647y));
                                                                    float f17 = (-fDp) / 2.0f;
                                                                    float f18 = (f17 * scaleX2) + mediaEntity2.f19646x;
                                                                    mediaEntity2.f19646x = f18;
                                                                    mediaEntity2.f19647y = (f17 * scaleY2) + fCos;
                                                                    mediaEntity2.f19646x = f18 / z5Var.getMeasuredWidth();
                                                                    mediaEntity2.f19647y /= z5Var.getMeasuredHeight();
                                                                    mediaEntity2.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                                                    mediaEntity2.scale = scaleX2;
                                                                    arrayList.add(mediaEntity2);
                                                                } else {
                                                                    imageReceiver3 = imageReceiver2;
                                                                    childAt = childAt;
                                                                }
                                                                imageReceiver = imageReceiver3;
                                                            }
                                                        } else {
                                                            e1Var = e1Var;
                                                            i13 = i13;
                                                            wVar = wVar;
                                                            childAt = childAt;
                                                            if (messageObject != null) {
                                                                TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost4 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                                mediaEntity.mediaArea = tL_inputMediaAreaChannelPost4;
                                                                tL_inputMediaAreaChannelPost4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                                ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(i15).getInputChannel(-z7.p(messageObject));
                                                                TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost5 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                                boolD = z7.D(messageObject);
                                                                if (boolD == null) {
                                                                    id2 = 0;
                                                                } else if (boolD.booleanValue()) {
                                                                    id2 = messageObject.messageOwner.fwd_from.channel_post;
                                                                } else {
                                                                    id2 = messageObject.getId();
                                                                }
                                                                tL_inputMediaAreaChannelPost5.msg_id = id2;
                                                            } else {
                                                                TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost6 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                                mediaEntity.mediaArea = tL_inputMediaAreaChannelPost6;
                                                                tL_inputMediaAreaChannelPost6.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                            }
                                                        }
                                                        imageReceiver = null;
                                                    }
                                                    if (z12) {
                                                        if (z7Var != null) {
                                                            matrix = z7Var.f17222n0;
                                                            if (z7Var.K) {
                                                                matrix.reset();
                                                                if (x0Var.getChildCount() == 1) {
                                                                    childAt2 = x0Var.getChildAt(0);
                                                                    photoImage = childAt2 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) childAt2).getPhotoImage() : null;
                                                                    if (photoImage != null) {
                                                                        float fMax = Math.max(photoImage.getImageWidth() / Math.max(1, z7Var.f17217k0), photoImage.getImageHeight() / Math.max(1, z7Var.f17219l0));
                                                                        matrix.postScale(fMax, fMax);
                                                                        matrix.postTranslate(photoImage.getCenterX() - ((z7Var.f17217k0 * fMax) / 2.0f), photoImage.getCenterY() - ((z7Var.f17219l0 * fMax) / 2.0f));
                                                                        matrix.postTranslate(wVar.getX(), wVar.getY());
                                                                        matrix.postTranslate(x0Var.getX(), x0Var.getY());
                                                                        matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                                        matrix.postScale(e1Var.getScaleX(), e1Var.getScaleY(), e1Var.getPivotX(), e1Var.getPivotY());
                                                                        matrix.postRotate(e1Var.getRotation(), e1Var.getPivotX(), e1Var.getPivotY());
                                                                        matrix.postTranslate(e1Var.getX(), e1Var.getY());
                                                                        matrix.postScale(1.0f / z5Var.getWidth(), 1.0f / z5Var.getHeight());
                                                                        matrix.postScale(z7Var.f17213i0, z7Var.f17215j0);
                                                                    }
                                                                } else {
                                                                    childAt2 = null;
                                                                }
                                                                if (photoImage != null) {
                                                                    float fMax2 = Math.max(photoImage.getImageWidth() / Math.max(1, z7Var.f17217k0), photoImage.getImageHeight() / Math.max(1, z7Var.f17219l0));
                                                                    matrix.postScale(fMax2, fMax2);
                                                                    matrix.postTranslate(photoImage.getCenterX() - ((z7Var.f17217k0 * fMax2) / 2.0f), photoImage.getCenterY() - ((z7Var.f17219l0 * fMax2) / 2.0f));
                                                                    matrix.postTranslate(wVar.getX(), wVar.getY());
                                                                    matrix.postTranslate(x0Var.getX(), x0Var.getY());
                                                                    matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                                    matrix.postScale(e1Var.getScaleX(), e1Var.getScaleY(), e1Var.getPivotX(), e1Var.getPivotY());
                                                                    matrix.postRotate(e1Var.getRotation(), e1Var.getPivotX(), e1Var.getPivotY());
                                                                    matrix.postTranslate(e1Var.getX(), e1Var.getY());
                                                                    matrix.postScale(1.0f / z5Var.getWidth(), 1.0f / z5Var.getHeight());
                                                                    matrix.postScale(z7Var.f17213i0, z7Var.f17215j0);
                                                                }
                                                            }
                                                        }
                                                        z17 = false;
                                                    } else {
                                                        z17 = true;
                                                    }
                                                    z18 = true;
                                                }
                                                arrayList.add(mediaEntity);
                                                scaleX = childAt.getScaleX();
                                                scaleY = childAt.getScaleY();
                                                x8 = childAt.getX();
                                                y10 = childAt.getY();
                                                mediaEntity.viewWidth = childAt.getWidth();
                                                mediaEntity.viewHeight = childAt.getHeight();
                                                mediaEntity.width = (childAt.getWidth() * scaleX) / z5Var.getMeasuredWidth();
                                                mediaEntity.height = (childAt.getHeight() * scaleY) / z5Var.getMeasuredHeight();
                                                mediaEntity.f19646x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                                mediaEntity.f19647y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                                mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                                mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                                mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                                mediaEntity.textViewWidth = mediaEntity.viewWidth / z5Var.getMeasuredWidth();
                                                mediaEntity.textViewHeight = mediaEntity.viewHeight / z5Var.getMeasuredHeight();
                                                mediaEntity.scale = scaleX;
                                                if (jVar instanceof zf.e1) {
                                                    zf.e1 e1Var3 = (zf.e1) jVar;
                                                    zf.x0 x0Var3 = e1Var3.f50388n0;
                                                    ag.w wVar3 = e1Var3.m0;
                                                    RectF rectF2 = AndroidUtilities.rectTmp;
                                                    z21 = z17;
                                                    double dR2 = e1Var3.r(rectF2);
                                                    rectF2.offset(wVar3.getX(), wVar3.getY());
                                                    rectF2.offset(x0Var3.getX(), x0Var3.getY());
                                                    mediaEntity.mediaArea.coordinates.f22614x = (((rectF2.centerX() * scaleX) + rl.c(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x8)) / z5Var.getMeasuredWidth()) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.f22615y = (((rectF2.centerY() * scaleY) + rl.c(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y10)) / z5Var.getMeasuredHeight()) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.f22613w = ((rectF2.width() * scaleX) / z5Var.getMeasuredWidth()) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.h = ((rectF2.height() * scaleY) / z5Var.getMeasuredHeight()) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                                    d = dR2;
                                                } else {
                                                    z21 = z17;
                                                    if (jVar instanceof zf.o2) {
                                                        imageAspectRatio = ((zf.o2) jVar).f50651t0.getImageAspectRatio();
                                                        f10 = (mediaEntity.width / 2.0f) + mediaEntity.f19646x;
                                                        f11 = (mediaEntity.height / 2.0f) + mediaEntity.f19647y;
                                                        measuredWidth = z5Var.getMeasuredWidth() / z5Var.getMeasuredHeight();
                                                        if (imageAspectRatio > 1.0f) {
                                                            float f19 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                            mediaEntity.height = f19;
                                                            mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                            mediaEntity.f19647y = f11 - (f19 / 2.0f);
                                                        } else if (imageAspectRatio < 1.0f) {
                                                            float f110 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                            mediaEntity.width = f110;
                                                            mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                            mediaEntity.f19646x = f10 - (f110 / 2.0f);
                                                        }
                                                    } else {
                                                        mediaArea = mediaEntity.mediaArea;
                                                        if (mediaArea == null) {
                                                        }
                                                    }
                                                    d = -1.0d;
                                                }
                                                mediaArea2 = mediaEntity.mediaArea;
                                                if (mediaArea2 != null) {
                                                    mediaAreaCoordinates.flags |= 1;
                                                    mediaAreaCoordinates.radius = ((((double) scaleX) * d) / ((double) childAt.getWidth())) * 100.0d;
                                                }
                                                z14 = z18;
                                                z15 = z21;
                                            }
                                            i13 = i13;
                                            z17 = true;
                                            z18 = true;
                                            imageReceiver = null;
                                            arrayList.add(mediaEntity);
                                            scaleX = childAt.getScaleX();
                                            scaleY = childAt.getScaleY();
                                            x8 = childAt.getX();
                                            y10 = childAt.getY();
                                            mediaEntity.viewWidth = childAt.getWidth();
                                            mediaEntity.viewHeight = childAt.getHeight();
                                            mediaEntity.width = (childAt.getWidth() * scaleX) / z5Var.getMeasuredWidth();
                                            mediaEntity.height = (childAt.getHeight() * scaleY) / z5Var.getMeasuredHeight();
                                            mediaEntity.f19646x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                            mediaEntity.f19647y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                            mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                            mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                            mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / z5Var.getMeasuredWidth();
                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / z5Var.getMeasuredHeight();
                                            mediaEntity.scale = scaleX;
                                            if (jVar instanceof zf.e1) {
                                                zf.e1 e1Var4 = (zf.e1) jVar;
                                                zf.x0 x0Var4 = e1Var4.f50388n0;
                                                ag.w wVar4 = e1Var4.m0;
                                                RectF rectF3 = AndroidUtilities.rectTmp;
                                                z21 = z17;
                                                double dR3 = e1Var4.r(rectF3);
                                                rectF3.offset(wVar4.getX(), wVar4.getY());
                                                rectF3.offset(x0Var4.getX(), x0Var4.getY());
                                                mediaEntity.mediaArea.coordinates.f22614x = (((rectF3.centerX() * scaleX) + rl.c(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x8)) / z5Var.getMeasuredWidth()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.f22615y = (((rectF3.centerY() * scaleY) + rl.c(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y10)) / z5Var.getMeasuredHeight()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.f22613w = ((rectF3.width() * scaleX) / z5Var.getMeasuredWidth()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.h = ((rectF3.height() * scaleY) / z5Var.getMeasuredHeight()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                                d = dR3;
                                            } else {
                                                z21 = z17;
                                                if (jVar instanceof zf.o2) {
                                                    imageAspectRatio = ((zf.o2) jVar).f50651t0.getImageAspectRatio();
                                                    f10 = (mediaEntity.width / 2.0f) + mediaEntity.f19646x;
                                                    f11 = (mediaEntity.height / 2.0f) + mediaEntity.f19647y;
                                                    measuredWidth = z5Var.getMeasuredWidth() / z5Var.getMeasuredHeight();
                                                    if (imageAspectRatio > 1.0f) {
                                                        float f111 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                        mediaEntity.height = f111;
                                                        mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                        mediaEntity.f19647y = f11 - (f111 / 2.0f);
                                                    } else if (imageAspectRatio < 1.0f) {
                                                        float f112 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                        mediaEntity.width = f112;
                                                        mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                        mediaEntity.f19646x = f10 - (f112 / 2.0f);
                                                    }
                                                } else {
                                                    mediaArea = mediaEntity.mediaArea;
                                                    if (mediaArea == null) {
                                                    }
                                                }
                                                d = -1.0d;
                                            }
                                            mediaArea2 = mediaEntity.mediaArea;
                                            if (mediaArea2 != null) {
                                                mediaAreaCoordinates.flags |= 1;
                                                mediaAreaCoordinates.radius = ((((double) scaleX) * d) / ((double) childAt.getWidth())) * 100.0d;
                                            }
                                            z14 = z18;
                                            z15 = z21;
                                        }
                                        i13 = i13;
                                    }
                                }
                                i13 = i13;
                                z17 = false;
                                z18 = true;
                                imageReceiver = null;
                                arrayList.add(mediaEntity);
                                scaleX = childAt.getScaleX();
                                scaleY = childAt.getScaleY();
                                x8 = childAt.getX();
                                y10 = childAt.getY();
                                mediaEntity.viewWidth = childAt.getWidth();
                                mediaEntity.viewHeight = childAt.getHeight();
                                mediaEntity.width = (childAt.getWidth() * scaleX) / z5Var.getMeasuredWidth();
                                mediaEntity.height = (childAt.getHeight() * scaleY) / z5Var.getMeasuredHeight();
                                mediaEntity.f19646x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                mediaEntity.f19647y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / z5Var.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / z5Var.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (jVar instanceof zf.e1) {
                                    zf.e1 e1Var5 = (zf.e1) jVar;
                                    zf.x0 x0Var5 = e1Var5.f50388n0;
                                    ag.w wVar5 = e1Var5.m0;
                                    RectF rectF4 = AndroidUtilities.rectTmp;
                                    z21 = z17;
                                    double dR4 = e1Var5.r(rectF4);
                                    rectF4.offset(wVar5.getX(), wVar5.getY());
                                    rectF4.offset(x0Var5.getX(), x0Var5.getY());
                                    mediaEntity.mediaArea.coordinates.f22614x = (((rectF4.centerX() * scaleX) + rl.c(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x8)) / z5Var.getMeasuredWidth()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.f22615y = (((rectF4.centerY() * scaleY) + rl.c(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y10)) / z5Var.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.f22613w = ((rectF4.width() * scaleX) / z5Var.getMeasuredWidth()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.h = ((rectF4.height() * scaleY) / z5Var.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                    d = dR4;
                                } else {
                                    z21 = z17;
                                    if (jVar instanceof zf.o2) {
                                        imageAspectRatio = ((zf.o2) jVar).f50651t0.getImageAspectRatio();
                                        f10 = (mediaEntity.width / 2.0f) + mediaEntity.f19646x;
                                        f11 = (mediaEntity.height / 2.0f) + mediaEntity.f19647y;
                                        measuredWidth = z5Var.getMeasuredWidth() / z5Var.getMeasuredHeight();
                                        if (imageAspectRatio > 1.0f) {
                                            float f113 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                            mediaEntity.height = f113;
                                            mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                            mediaEntity.f19647y = f11 - (f113 / 2.0f);
                                        } else if (imageAspectRatio < 1.0f) {
                                            float f114 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                            mediaEntity.width = f114;
                                            mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                            mediaEntity.f19646x = f10 - (f114 / 2.0f);
                                        }
                                    } else {
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea == null) {
                                        }
                                    }
                                    d = -1.0d;
                                }
                                mediaArea2 = mediaEntity.mediaArea;
                                if (mediaArea2 != null) {
                                    mediaAreaCoordinates.flags |= 1;
                                    mediaAreaCoordinates.radius = ((((double) scaleX) * d) / ((double) childAt.getWidth())) * 100.0d;
                                }
                                z14 = z18;
                                z15 = z21;
                            } else {
                                z5Var = z5Var2;
                                i13 = childCount;
                                i14 = i12;
                                childAt = childAt;
                                z14 = true;
                                z15 = false;
                                imageReceiver = null;
                            }
                            if (!z14 && ((z11 || (z12 && mediaEntity.type == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width2 = bitmap.getWidth() / z5Var.getMeasuredWidth();
                                int i26 = 0;
                                while (i26 < 2) {
                                    Canvas canvas3 = i26 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i26 == 0 && z15)) {
                                        canvas = canvas2;
                                        view = childAt;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width2, width2);
                                        canvas3.translate(mediaEntity.f19646x * z5Var.getMeasuredWidth(), mediaEntity.f19647y * z5Var.getMeasuredHeight());
                                        canvas3.scale(childAt.getScaleX(), childAt.getScaleY());
                                        canvas3.rotate(childAt.getRotation(), ((mediaEntity.width / 2.0f) / childAt.getScaleX()) * z5Var.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / childAt.getScaleY()) * z5Var.getMeasuredHeight());
                                        view = childAt;
                                        if (!(view instanceof zf.v2) || view.getHeight() <= 0 || view.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view instanceof zf.e1) {
                                                zf.e1 e1Var6 = (zf.e1) view;
                                                zf.x0 x0Var6 = e1Var6.f50388n0;
                                                boolean z24 = true;
                                                e1Var6.f50391q0 = true;
                                                int i27 = 0;
                                                while (i27 < x0Var6.getChildCount()) {
                                                    View childAt4 = x0Var6.getChildAt(i27);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                                        ((org.telegram.ui.Cells.s1) childAt4).f25411ke = z24;
                                                    }
                                                    i27++;
                                                    z24 = true;
                                                }
                                                view.draw(canvas3);
                                                boolean z25 = false;
                                                e1Var6.f50391q0 = false;
                                                int i28 = 0;
                                                while (i28 < x0Var6.getChildCount()) {
                                                    View childAt5 = x0Var6.getChildAt(i28);
                                                    if (childAt5 instanceof org.telegram.ui.Cells.s1) {
                                                        ((org.telegram.ui.Cells.s1) childAt5).f25411ke = z25;
                                                    }
                                                    i28++;
                                                    z25 = false;
                                                }
                                            } else {
                                                view.draw(canvas3);
                                            }
                                        } else {
                                            int scaleX3 = (int) (view.getScaleX() * view.getWidth());
                                            int scaleY3 = (int) (view.getScaleY() * view.getHeight());
                                            Bitmap bitmapCreateBitmap2 = Bitmaps.createBitmap(scaleX3, scaleY3, Bitmap.Config.ARGB_8888);
                                            Canvas canvas4 = new Canvas(bitmapCreateBitmap2);
                                            canvas = canvas2;
                                            canvas4.scale(view.getScaleX(), view.getScaleY());
                                            view.draw(canvas4);
                                            canvas3.scale(1.0f / view.getScaleX(), 1.0f / view.getScaleY());
                                            canvas3.drawBitmap(bitmapCreateBitmap2, (Rect) null, new Rect(0, 0, scaleX3, scaleY3), new Paint(3));
                                            try {
                                                canvas4.setBitmap(null);
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                            }
                                            bitmapCreateBitmap2.recycle();
                                        }
                                        canvas3.restore();
                                    }
                                    i26++;
                                    childAt = view;
                                    canvas2 = canvas;
                                }
                                if (imageReceiver != null) {
                                    imageReceiver.setVisible(true, false);
                                }
                            }
                            i12 = i14 + 1;
                            f6Var = this;
                            childCount = i13;
                            z5Var2 = z5Var;
                            i19 = 0;
                            b13 = 1;
                        } else {
                            z5Var = z5Var2;
                            i13 = childCount;
                            i14 = i12;
                        }
                        i12 = i14 + 1;
                        f6Var = this;
                        childCount = i13;
                        z5Var2 = z5Var;
                        i19 = 0;
                        b13 = 1;
                    }
                }
                return bitmap;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, z5Var2.getMeasuredWidth()), Math.max(1, z5Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        }
        bitmap = bitmapCreateBitmap;
        f6Var.f15961c1 = BigInteger.ONE;
        i11 = 0;
        while (i10 < z5Var2.getChildCount()) {
            if (!(z5Var2.getChildAt(i10) instanceof zf.j)) {
                i11++;
            }
        }
        if (i11 > 0) {
            childCount = z5Var2.getChildCount();
            i12 = 0;
            while (i12 < childCount) {
                childAt = z5Var2.getChildAt(i12);
                if (childAt instanceof zf.j) {
                    z5Var = z5Var2;
                    i13 = childCount;
                    i14 = i12;
                } else {
                    jVar = (zf.j) childAt;
                    jVar.getPosition();
                    mediaEntity = new VideoEditedInfo.MediaEntity();
                    if (arrayList != null) {
                        z16 = jVar instanceof zf.v2;
                        jP = 5000;
                        i15 = f6Var.B1;
                        if (z16) {
                            mediaEntity.type = b13;
                            v2Var = (zf.v2) jVar;
                            text = v2Var.getText();
                            if (text instanceof Spanned) {
                                spanned = (Spanned) text;
                                v2Var2 = v2Var;
                                t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(i19, text.length(), org.telegram.ui.Components.t5.class);
                                if (t5VarArr != null) {
                                    i16 = 0;
                                    while (i16 < t5VarArr.length) {
                                        t5Var = t5VarArr[i16];
                                        org.telegram.ui.Components.t5[] t5VarArr3 = t5VarArr;
                                        documentF = t5Var.document;
                                        int i29 = i16;
                                        z5 z5Var4 = z5Var2;
                                        if (documentF == null) {
                                            documentF = org.telegram.ui.Components.k5.f(i15, t5Var.getDocumentId());
                                        }
                                        if (documentF != null) {
                                            org.telegram.ui.Components.k5.h(i15).e(documentF);
                                        }
                                        emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                        int i210 = childCount;
                                        int i211 = i12;
                                        emojiEntity3.document_id = t5Var.getDocumentId();
                                        emojiEntity3.document = documentF;
                                        emojiEntity3.offset = spanned.getSpanStart(t5Var);
                                        emojiEntity3.length = spanned.getSpanEnd(t5Var) - emojiEntity3.offset;
                                        emojiEntity3.documentAbsolutePath = FileLoader.getInstance(i15).getPathToAttach(documentF, true).getAbsolutePath();
                                        i17 = 0;
                                        while (true) {
                                            if (documentF == null) {
                                                arrayList3 = documentF.thumbs;
                                                if (arrayList3 == null) {
                                                }
                                            }
                                            z23 = true;
                                            i17 = i18;
                                        }
                                        zIsAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, z23);
                                        if (zIsAnimatedStickerDocument3) {
                                            byte b17 = emojiEntity3.subType;
                                            if (zIsAnimatedStickerDocument3) {
                                                b12 = 1;
                                            } else {
                                                b12 = 4;
                                            }
                                            emojiEntity3.subType = (byte) (b17 | b12);
                                        } else {
                                            byte b18 = emojiEntity3.subType;
                                            if (zIsAnimatedStickerDocument3) {
                                                b12 = 1;
                                            } else {
                                                b12 = 4;
                                            }
                                            emojiEntity3.subType = (byte) (b18 | b12);
                                        }
                                        if (MessageObject.isTextColorEmoji(emojiEntity3.document)) {
                                            emojiEntity3.subType = (byte) (emojiEntity3.subType | 8);
                                        }
                                        mediaEntity.entities.add(emojiEntity3);
                                        if (documentF != null) {
                                            BigInteger bigIntegerValueOf4 = BigInteger.valueOf(5000L);
                                            f6Var.f15961c1 = f6Var.f15961c1.multiply(bigIntegerValueOf4).divide(f6Var.f15961c1.gcd(bigIntegerValueOf4));
                                        }
                                        i16 = i29 + 1;
                                        childCount = i210;
                                        t5VarArr = t5VarArr3;
                                        z5Var2 = z5Var4;
                                        i12 = i211;
                                    }
                                }
                            } else {
                                v2Var2 = v2Var;
                            }
                            z5Var = z5Var2;
                            i13 = childCount;
                            i14 = i12;
                            mediaEntity.text = text.toString();
                            mediaEntity.subType = (byte) v2Var2.getType();
                            mediaEntity.color = v2Var2.getSwatch().f50034a;
                            mediaEntity.fontSize = v2Var2.getTextSize();
                            mediaEntity.textTypeface = v2Var2.getTypeface();
                            mediaEntity.textAlign = v2Var2.getAlign();
                        } else {
                            z5Var = z5Var2;
                            i13 = childCount;
                            i14 = i12;
                            if (jVar instanceof zf.o2) {
                                mediaEntity.type = (byte) 0;
                                o2Var = (zf.o2) jVar;
                                tu0 baseSize4 = o2Var.getBaseSize();
                                mediaEntity.width = baseSize4.f32893a;
                                mediaEntity.height = baseSize4.f32894b;
                                mediaEntity.document = o2Var.getSticker();
                                mediaEntity.parentObject = o2Var.getParentObject();
                                sticker = o2Var.getSticker();
                                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                if (MessageObject.isAnimatedStickerDocument(sticker, true)) {
                                    boolean zIsAnimatedStickerDocument6 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                    mediaEntity.subType = (byte) (mediaEntity.subType | (zIsAnimatedStickerDocument6 ? (byte) 1 : (byte) 4));
                                    if (zIsAnimatedStickerDocument6) {
                                    }
                                    if (jP != 0) {
                                        BigInteger bigIntegerValueOf5 = BigInteger.valueOf(jP);
                                        f6Var.f15961c1 = f6Var.f15961c1.multiply(bigIntegerValueOf5).divide(f6Var.f15961c1.gcd(bigIntegerValueOf5));
                                    }
                                } else {
                                    boolean zIsAnimatedStickerDocument7 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                    mediaEntity.subType = (byte) (mediaEntity.subType | (zIsAnimatedStickerDocument7 ? (byte) 1 : (byte) 4));
                                    if (zIsAnimatedStickerDocument7) {
                                    }
                                    if (jP != 0) {
                                        BigInteger bigIntegerValueOf6 = BigInteger.valueOf(jP);
                                        f6Var.f15961c1 = f6Var.f15961c1.multiply(bigIntegerValueOf6).divide(f6Var.f15961c1.gcd(bigIntegerValueOf6));
                                    }
                                }
                                if (MessageObject.isTextColorEmoji(sticker)) {
                                    mediaEntity.color = -1;
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                }
                                if (o2Var.f50647p0) {
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                }
                            } else if (jVar instanceof zf.x1) {
                                x1Var = (zf.x1) jVar;
                                mediaEntity.type = (byte) 2;
                                tu0 baseSize5 = x1Var.getBaseSize();
                                mediaEntity.width = baseSize5.f32893a;
                                mediaEntity.height = baseSize5.f32894b;
                                mediaEntity.text = x1Var.q(i15);
                                mediaEntity.crop = x1Var.C0;
                                if (x1Var.f50765p0) {
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                }
                            } else if (jVar instanceof zf.s0) {
                                s0Var = (zf.s0) jVar;
                                zf.r0 r0Var5 = s0Var.m0;
                                mediaEntity.type = (byte) 3;
                                mediaEntity.subType = (byte) s0Var.getType();
                                mediaEntity.width = r0Var5.getWidth();
                                mediaEntity.height = r0Var5.getHeight();
                                mediaEntity.text = r0Var5.getText();
                                if (s0Var.f50695n0) {
                                    color3 = s0Var.getColor();
                                } else {
                                    color3 = 0;
                                }
                                mediaEntity.color = color3;
                                mediaEntity.density = r0Var5.f50683y;
                                mediaEntity.media = s0Var.f50698q0;
                                TL_stories.MediaArea mediaArea5 = s0Var.f50699r0;
                                mediaEntity.mediaArea = mediaArea5;
                                mediaArea5.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                codeEmojiDocument2 = r0Var5.getCodeEmojiDocument();
                                if (codeEmojiDocument2 != null) {
                                    emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                    emojiEntity2.document_id = codeEmojiDocument2.f22386id;
                                    emojiEntity2.document = codeEmojiDocument2;
                                    emojiEntity2.documentAbsolutePath = FileLoader.getInstance(i15).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                    zIsAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                    if (zIsAnimatedStickerDocument2) {
                                        byte b19 = emojiEntity2.subType;
                                        if (zIsAnimatedStickerDocument2) {
                                            b11 = 1;
                                        } else {
                                            b11 = 4;
                                        }
                                        emojiEntity2.subType = (byte) (b19 | b11);
                                    } else {
                                        byte b110 = emojiEntity2.subType;
                                        if (zIsAnimatedStickerDocument2) {
                                            b11 = 1;
                                        } else {
                                            b11 = 4;
                                        }
                                        emojiEntity2.subType = (byte) (b110 | b11);
                                    }
                                    mediaEntity.entities.add(emojiEntity2);
                                }
                            } else if (jVar instanceof zf.w2) {
                                w2Var = (zf.w2) jVar;
                                zf.r0 r0Var6 = w2Var.m0;
                                mediaEntity.type = (byte) 8;
                                mediaEntity.subType = (byte) w2Var.getType();
                                mediaEntity.width = r0Var6.getWidth();
                                mediaEntity.height = r0Var6.getHeight();
                                mediaEntity.text = r0Var6.getText();
                                if (w2Var.f50757n0) {
                                    color2 = w2Var.getColor();
                                } else {
                                    color2 = 0;
                                }
                                mediaEntity.color = color2;
                                mediaEntity.density = r0Var6.f50683y;
                                mediaEntity.weather = w2Var.f50760q0;
                                TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather2 = new TL_stories.TL_mediaAreaWeather();
                                pc pcVar2 = w2Var.f50760q0;
                                tL_mediaAreaWeather2.emoji = pcVar2.f16550c;
                                tL_mediaAreaWeather2.temperature_c = Math.round(pcVar2.d);
                                tL_mediaAreaWeather2.color = r0Var6.f50677f.getColor();
                                mediaEntity.mediaArea = tL_mediaAreaWeather2;
                                tL_mediaAreaWeather2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                codeEmojiDocument = r0Var6.getCodeEmojiDocument();
                                if (codeEmojiDocument != null) {
                                    emojiEntity = new VideoEditedInfo.EmojiEntity();
                                    emojiEntity.document_id = codeEmojiDocument.f22386id;
                                    emojiEntity.document = codeEmojiDocument;
                                    emojiEntity.documentAbsolutePath = FileLoader.getInstance(i15).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                    zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, true);
                                    if (zIsAnimatedStickerDocument) {
                                        byte b111 = emojiEntity.subType;
                                        if (zIsAnimatedStickerDocument) {
                                            b10 = 1;
                                        } else {
                                            b10 = 4;
                                        }
                                        emojiEntity.subType = (byte) (b111 | b10);
                                    } else {
                                        byte b112 = emojiEntity.subType;
                                        if (zIsAnimatedStickerDocument) {
                                            b10 = 1;
                                        } else {
                                            b10 = 4;
                                        }
                                        emojiEntity.subType = (byte) (b112 | b10);
                                    }
                                    mediaEntity.entities.add(emojiEntity);
                                }
                                i13 = i13;
                                childAt = childAt;
                                z17 = false;
                                z18 = false;
                                imageReceiver = null;
                                arrayList.add(mediaEntity);
                                scaleX = childAt.getScaleX();
                                scaleY = childAt.getScaleY();
                                x8 = childAt.getX();
                                y10 = childAt.getY();
                                mediaEntity.viewWidth = childAt.getWidth();
                                mediaEntity.viewHeight = childAt.getHeight();
                                mediaEntity.width = (childAt.getWidth() * scaleX) / z5Var.getMeasuredWidth();
                                mediaEntity.height = (childAt.getHeight() * scaleY) / z5Var.getMeasuredHeight();
                                mediaEntity.f19646x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                mediaEntity.f19647y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / z5Var.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / z5Var.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (jVar instanceof zf.e1) {
                                    zf.e1 e1Var7 = (zf.e1) jVar;
                                    zf.x0 x0Var7 = e1Var7.f50388n0;
                                    ag.w wVar6 = e1Var7.m0;
                                    RectF rectF5 = AndroidUtilities.rectTmp;
                                    z21 = z17;
                                    double dR5 = e1Var7.r(rectF5);
                                    rectF5.offset(wVar6.getX(), wVar6.getY());
                                    rectF5.offset(x0Var7.getX(), x0Var7.getY());
                                    mediaEntity.mediaArea.coordinates.f22614x = (((rectF5.centerX() * scaleX) + rl.c(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x8)) / z5Var.getMeasuredWidth()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.f22615y = (((rectF5.centerY() * scaleY) + rl.c(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y10)) / z5Var.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.f22613w = ((rectF5.width() * scaleX) / z5Var.getMeasuredWidth()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.h = ((rectF5.height() * scaleY) / z5Var.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                    d = dR5;
                                } else {
                                    z21 = z17;
                                    if (jVar instanceof zf.o2) {
                                        imageAspectRatio = ((zf.o2) jVar).f50651t0.getImageAspectRatio();
                                        f10 = (mediaEntity.width / 2.0f) + mediaEntity.f19646x;
                                        f11 = (mediaEntity.height / 2.0f) + mediaEntity.f19647y;
                                        measuredWidth = z5Var.getMeasuredWidth() / z5Var.getMeasuredHeight();
                                        if (imageAspectRatio > 1.0f) {
                                            float f115 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                            mediaEntity.height = f115;
                                            mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                            mediaEntity.f19647y = f11 - (f115 / 2.0f);
                                        } else if (imageAspectRatio < 1.0f) {
                                            float f116 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                            mediaEntity.width = f116;
                                            mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                            mediaEntity.f19646x = f10 - (f116 / 2.0f);
                                        }
                                    } else {
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea == null) {
                                        }
                                    }
                                    d = -1.0d;
                                }
                                mediaArea2 = mediaEntity.mediaArea;
                                if (mediaArea2 != null) {
                                    mediaAreaCoordinates.flags |= 1;
                                    mediaAreaCoordinates.radius = ((((double) scaleX) * d) / ((double) childAt.getWidth())) * 100.0d;
                                }
                                z14 = z18;
                                z15 = z21;
                            } else {
                                if (jVar instanceof zf.p0) {
                                    p0Var = (zf.p0) jVar;
                                    n0Var = p0Var.m0;
                                    mediaEntity.type = (byte) 7;
                                    if (n0Var.e()) {
                                        mediaEntity.subType = (byte) n0Var.getPreviewType();
                                    } else {
                                        mediaEntity.subType = (byte) p0Var.getType();
                                    }
                                    mediaEntity.width = n0Var.getWidth();
                                    mediaEntity.height = n0Var.getHeight();
                                    if (p0Var.f50657p0) {
                                        color = p0Var.getColor();
                                    } else {
                                        color = 0;
                                    }
                                    mediaEntity.color = color;
                                    mediaEntity.density = n0Var.f50587e;
                                    mediaEntity.linkSettings = p0Var.f50658q0;
                                    z20 = n0Var.N;
                                    if (z20) {
                                        imageReceiver4 = n0Var.P;
                                        if (z20) {
                                            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(imageReceiver4.getBitmap()), imageReceiver4.getImageKey(), false);
                                        }
                                        zf.m0 m0Var3 = mediaEntity.linkSettings;
                                        m0Var3.f50568a |= 4;
                                        m0Var3.f50573i = n0Var.getPhotoSide();
                                    }
                                    tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                    mediaEntity.mediaArea = tL_mediaAreaUrl;
                                    m0Var = p0Var.f50658q0;
                                    if (m0Var == null) {
                                        webPage = m0Var.d;
                                        if (webPage != null) {
                                            str = p0Var.f50658q0.f50570c;
                                        } else {
                                            str = p0Var.f50658q0.f50570c;
                                        }
                                        tL_mediaAreaUrl.url = str;
                                        mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                    }
                                } else {
                                    if (jVar instanceof zf.b2) {
                                        b2Var = (zf.b2) jVar;
                                        mediaEntity.type = (byte) 4;
                                        TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction2 = new TL_stories.TL_mediaAreaSuggestedReaction();
                                        mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction2;
                                        currentReaction = b2Var.getCurrentReaction();
                                        if (currentReaction.f11412f != null) {
                                            TLRPC.TL_reactionEmoji tL_reactionEmoji2 = new TLRPC.TL_reactionEmoji();
                                            tL_reactionEmoji2.emoticon = currentReaction.f11412f;
                                            reaction = tL_reactionEmoji2;
                                        } else {
                                            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                                            tL_reactionCustomEmoji2.document_id = currentReaction.f11413g;
                                            reaction = tL_reactionCustomEmoji2;
                                        }
                                        tL_mediaAreaSuggestedReaction2.reaction = reaction;
                                        TL_stories.MediaArea mediaArea6 = mediaEntity.mediaArea;
                                        if (b2Var.f50348n0.f13756a == 1) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        mediaArea6.dark = z19;
                                        mediaArea6.flipped = b2Var.f50355u0;
                                        mediaArea6.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                    } else {
                                        if (jVar instanceof zf.c2) {
                                            c2Var = (zf.c2) jVar;
                                            tu0 baseSize6 = c2Var.getBaseSize();
                                            mediaEntity.width = baseSize6.f32893a;
                                            mediaEntity.height = baseSize6.f32894b;
                                            mediaEntity.type = (byte) 5;
                                            if (z7Var != null) {
                                                mediaEntity.text = z7Var.f17224o0.getAbsolutePath();
                                                mediaEntity.roundOffset = z7Var.f17230r0;
                                                long j11 = z7Var.f17228q0;
                                                mediaEntity.roundDuration = j11;
                                                float f117 = j11;
                                                mediaEntity.roundLeft = (long) (z7Var.f17232s0 * f117);
                                                mediaEntity.roundRight = (long) (z7Var.f17234t0 * f117);
                                            }
                                            mediaEntity.subType = (byte) 4;
                                            if (c2Var.f50360n0) {
                                                mediaEntity.subType = (byte) (4 | 2);
                                            }
                                        } else if (jVar instanceof zf.e1) {
                                            e1Var = (zf.e1) jVar;
                                            wVar = e1Var.m0;
                                            arrayList2 = e1Var.f50389o0;
                                            x0Var = e1Var.f50388n0;
                                            mediaEntity.type = (byte) 6;
                                            int width3 = e1Var.getWidth();
                                            mediaEntity.viewWidth = width3;
                                            mediaEntity.width = width3;
                                            int height2 = e1Var.getHeight();
                                            mediaEntity.viewHeight = height2;
                                            mediaEntity.height = height2;
                                            if (arrayList2.size() > 0) {
                                                messageObject = (MessageObject) arrayList2.get(0);
                                            } else {
                                                messageObject = null;
                                            }
                                            if (messageObject != null) {
                                                e1Var = e1Var;
                                                i13 = i13;
                                                wVar = wVar;
                                                childAt = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost7 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost7;
                                                    tL_inputMediaAreaChannelPost7.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(i15).getInputChannel(-z7.p(messageObject));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost8 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    boolD = z7.D(messageObject);
                                                    if (boolD == null) {
                                                        id2 = 0;
                                                    } else if (boolD.booleanValue()) {
                                                        id2 = messageObject.messageOwner.fwd_from.channel_post;
                                                    } else {
                                                        id2 = messageObject.getId();
                                                    }
                                                    tL_inputMediaAreaChannelPost8.msg_id = id2;
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost9 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost9;
                                                    tL_inputMediaAreaChannelPost9.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                            } else {
                                                e1Var = e1Var;
                                                i13 = i13;
                                                wVar = wVar;
                                                childAt = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost10 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost10;
                                                    tL_inputMediaAreaChannelPost10.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(i15).getInputChannel(-z7.p(messageObject));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost11 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    boolD = z7.D(messageObject);
                                                    if (boolD == null) {
                                                        id2 = 0;
                                                    } else if (boolD.booleanValue()) {
                                                        id2 = messageObject.messageOwner.fwd_from.channel_post;
                                                    } else {
                                                        id2 = messageObject.getId();
                                                    }
                                                    tL_inputMediaAreaChannelPost11.msg_id = id2;
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost12 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost12;
                                                    tL_inputMediaAreaChannelPost12.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                            }
                                            if (z12) {
                                                z17 = true;
                                            } else {
                                                if (z7Var != null) {
                                                    matrix = z7Var.f17222n0;
                                                    if (z7Var.K) {
                                                        matrix.reset();
                                                        if (x0Var.getChildCount() == 1) {
                                                            childAt2 = x0Var.getChildAt(0);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                                            }
                                                            if (photoImage != null) {
                                                                float fMax3 = Math.max(photoImage.getImageWidth() / Math.max(1, z7Var.f17217k0), photoImage.getImageHeight() / Math.max(1, z7Var.f17219l0));
                                                                matrix.postScale(fMax3, fMax3);
                                                                matrix.postTranslate(photoImage.getCenterX() - ((z7Var.f17217k0 * fMax3) / 2.0f), photoImage.getCenterY() - ((z7Var.f17219l0 * fMax3) / 2.0f));
                                                                matrix.postTranslate(wVar.getX(), wVar.getY());
                                                                matrix.postTranslate(x0Var.getX(), x0Var.getY());
                                                                matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                                matrix.postScale(e1Var.getScaleX(), e1Var.getScaleY(), e1Var.getPivotX(), e1Var.getPivotY());
                                                                matrix.postRotate(e1Var.getRotation(), e1Var.getPivotX(), e1Var.getPivotY());
                                                                matrix.postTranslate(e1Var.getX(), e1Var.getY());
                                                                matrix.postScale(1.0f / z5Var.getWidth(), 1.0f / z5Var.getHeight());
                                                                matrix.postScale(z7Var.f17213i0, z7Var.f17215j0);
                                                            }
                                                        } else {
                                                            childAt2 = null;
                                                        }
                                                        if (photoImage != null) {
                                                            float fMax4 = Math.max(photoImage.getImageWidth() / Math.max(1, z7Var.f17217k0), photoImage.getImageHeight() / Math.max(1, z7Var.f17219l0));
                                                            matrix.postScale(fMax4, fMax4);
                                                            matrix.postTranslate(photoImage.getCenterX() - ((z7Var.f17217k0 * fMax4) / 2.0f), photoImage.getCenterY() - ((z7Var.f17219l0 * fMax4) / 2.0f));
                                                            matrix.postTranslate(wVar.getX(), wVar.getY());
                                                            matrix.postTranslate(x0Var.getX(), x0Var.getY());
                                                            matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                            matrix.postScale(e1Var.getScaleX(), e1Var.getScaleY(), e1Var.getPivotX(), e1Var.getPivotY());
                                                            matrix.postRotate(e1Var.getRotation(), e1Var.getPivotX(), e1Var.getPivotY());
                                                            matrix.postTranslate(e1Var.getX(), e1Var.getY());
                                                            matrix.postScale(1.0f / z5Var.getWidth(), 1.0f / z5Var.getHeight());
                                                            matrix.postScale(z7Var.f17213i0, z7Var.f17215j0);
                                                        }
                                                    }
                                                }
                                                z17 = false;
                                            }
                                            z18 = true;
                                        }
                                        arrayList.add(mediaEntity);
                                        scaleX = childAt.getScaleX();
                                        scaleY = childAt.getScaleY();
                                        x8 = childAt.getX();
                                        y10 = childAt.getY();
                                        mediaEntity.viewWidth = childAt.getWidth();
                                        mediaEntity.viewHeight = childAt.getHeight();
                                        mediaEntity.width = (childAt.getWidth() * scaleX) / z5Var.getMeasuredWidth();
                                        mediaEntity.height = (childAt.getHeight() * scaleY) / z5Var.getMeasuredHeight();
                                        mediaEntity.f19646x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                        mediaEntity.f19647y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                        mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                        mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / z5Var.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / z5Var.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (jVar instanceof zf.e1) {
                                            zf.e1 e1Var8 = (zf.e1) jVar;
                                            zf.x0 x0Var8 = e1Var8.f50388n0;
                                            ag.w wVar7 = e1Var8.m0;
                                            RectF rectF6 = AndroidUtilities.rectTmp;
                                            z21 = z17;
                                            double dR6 = e1Var8.r(rectF6);
                                            rectF6.offset(wVar7.getX(), wVar7.getY());
                                            rectF6.offset(x0Var8.getX(), x0Var8.getY());
                                            mediaEntity.mediaArea.coordinates.f22614x = (((rectF6.centerX() * scaleX) + rl.c(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x8)) / z5Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.f22615y = (((rectF6.centerY() * scaleY) + rl.c(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y10)) / z5Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.f22613w = ((rectF6.width() * scaleX) / z5Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF6.height() * scaleY) / z5Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                            d = dR6;
                                        } else {
                                            z21 = z17;
                                            if (jVar instanceof zf.o2) {
                                                imageAspectRatio = ((zf.o2) jVar).f50651t0.getImageAspectRatio();
                                                f10 = (mediaEntity.width / 2.0f) + mediaEntity.f19646x;
                                                f11 = (mediaEntity.height / 2.0f) + mediaEntity.f19647y;
                                                measuredWidth = z5Var.getMeasuredWidth() / z5Var.getMeasuredHeight();
                                                if (imageAspectRatio > 1.0f) {
                                                    float f118 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                    mediaEntity.height = f118;
                                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                    mediaEntity.f19647y = f11 - (f118 / 2.0f);
                                                } else if (imageAspectRatio < 1.0f) {
                                                    float f119 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                    mediaEntity.width = f119;
                                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                    mediaEntity.f19646x = f10 - (f119 / 2.0f);
                                                }
                                            } else {
                                                mediaArea = mediaEntity.mediaArea;
                                                if (mediaArea == null) {
                                                }
                                            }
                                            d = -1.0d;
                                        }
                                        mediaArea2 = mediaEntity.mediaArea;
                                        if (mediaArea2 != null) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((((double) scaleX) * d) / ((double) childAt.getWidth())) * 100.0d;
                                        }
                                        z14 = z18;
                                        z15 = z21;
                                    }
                                    i13 = i13;
                                    z17 = true;
                                    z18 = true;
                                    imageReceiver = null;
                                    arrayList.add(mediaEntity);
                                    scaleX = childAt.getScaleX();
                                    scaleY = childAt.getScaleY();
                                    x8 = childAt.getX();
                                    y10 = childAt.getY();
                                    mediaEntity.viewWidth = childAt.getWidth();
                                    mediaEntity.viewHeight = childAt.getHeight();
                                    mediaEntity.width = (childAt.getWidth() * scaleX) / z5Var.getMeasuredWidth();
                                    mediaEntity.height = (childAt.getHeight() * scaleY) / z5Var.getMeasuredHeight();
                                    mediaEntity.f19646x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                    mediaEntity.f19647y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                    mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                    mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x8) / z5Var.getMeasuredWidth();
                                    mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y10) / z5Var.getMeasuredHeight();
                                    mediaEntity.textViewWidth = mediaEntity.viewWidth / z5Var.getMeasuredWidth();
                                    mediaEntity.textViewHeight = mediaEntity.viewHeight / z5Var.getMeasuredHeight();
                                    mediaEntity.scale = scaleX;
                                    if (jVar instanceof zf.e1) {
                                        zf.e1 e1Var9 = (zf.e1) jVar;
                                        zf.x0 x0Var9 = e1Var9.f50388n0;
                                        ag.w wVar8 = e1Var9.m0;
                                        RectF rectF7 = AndroidUtilities.rectTmp;
                                        z21 = z17;
                                        double dR7 = e1Var9.r(rectF7);
                                        rectF7.offset(wVar8.getX(), wVar8.getY());
                                        rectF7.offset(x0Var9.getX(), x0Var9.getY());
                                        mediaEntity.mediaArea.coordinates.f22614x = (((rectF7.centerX() * scaleX) + rl.c(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x8)) / z5Var.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.f22615y = (((rectF7.centerY() * scaleY) + rl.c(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y10)) / z5Var.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.f22613w = ((rectF7.width() * scaleX) / z5Var.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.h = ((rectF7.height() * scaleY) / z5Var.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                        d = dR7;
                                    } else {
                                        z21 = z17;
                                        if (jVar instanceof zf.o2) {
                                            imageAspectRatio = ((zf.o2) jVar).f50651t0.getImageAspectRatio();
                                            f10 = (mediaEntity.width / 2.0f) + mediaEntity.f19646x;
                                            f11 = (mediaEntity.height / 2.0f) + mediaEntity.f19647y;
                                            measuredWidth = z5Var.getMeasuredWidth() / z5Var.getMeasuredHeight();
                                            if (imageAspectRatio > 1.0f) {
                                                float f1110 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                mediaEntity.height = f1110;
                                                mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                mediaEntity.f19647y = f11 - (f1110 / 2.0f);
                                            } else if (imageAspectRatio < 1.0f) {
                                                float f1111 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                mediaEntity.width = f1111;
                                                mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                mediaEntity.f19646x = f10 - (f1111 / 2.0f);
                                            }
                                        } else {
                                            mediaArea = mediaEntity.mediaArea;
                                            if (mediaArea == null) {
                                            }
                                        }
                                        d = -1.0d;
                                    }
                                    mediaArea2 = mediaEntity.mediaArea;
                                    if (mediaArea2 != null) {
                                        mediaAreaCoordinates.flags |= 1;
                                        mediaAreaCoordinates.radius = ((((double) scaleX) * d) / ((double) childAt.getWidth())) * 100.0d;
                                    }
                                    z14 = z18;
                                    z15 = z21;
                                }
                                i13 = i13;
                            }
                        }
                        i13 = i13;
                        z17 = false;
                        z18 = true;
                        imageReceiver = null;
                        arrayList.add(mediaEntity);
                        scaleX = childAt.getScaleX();
                        scaleY = childAt.getScaleY();
                        x8 = childAt.getX();
                        y10 = childAt.getY();
                        mediaEntity.viewWidth = childAt.getWidth();
                        mediaEntity.viewHeight = childAt.getHeight();
                        mediaEntity.width = (childAt.getWidth() * scaleX) / z5Var.getMeasuredWidth();
                        mediaEntity.height = (childAt.getHeight() * scaleY) / z5Var.getMeasuredHeight();
                        mediaEntity.f19646x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x8) / z5Var.getMeasuredWidth();
                        mediaEntity.f19647y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y10) / z5Var.getMeasuredHeight();
                        mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                        mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x8) / z5Var.getMeasuredWidth();
                        mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y10) / z5Var.getMeasuredHeight();
                        mediaEntity.textViewWidth = mediaEntity.viewWidth / z5Var.getMeasuredWidth();
                        mediaEntity.textViewHeight = mediaEntity.viewHeight / z5Var.getMeasuredHeight();
                        mediaEntity.scale = scaleX;
                        if (jVar instanceof zf.e1) {
                            zf.e1 e1Var10 = (zf.e1) jVar;
                            zf.x0 x0Var10 = e1Var10.f50388n0;
                            ag.w wVar9 = e1Var10.m0;
                            RectF rectF8 = AndroidUtilities.rectTmp;
                            z21 = z17;
                            double dR8 = e1Var10.r(rectF8);
                            rectF8.offset(wVar9.getX(), wVar9.getY());
                            rectF8.offset(x0Var10.getX(), x0Var10.getY());
                            mediaEntity.mediaArea.coordinates.f22614x = (((rectF8.centerX() * scaleX) + rl.c(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x8)) / z5Var.getMeasuredWidth()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.f22615y = (((rectF8.centerY() * scaleY) + rl.c(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y10)) / z5Var.getMeasuredHeight()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.f22613w = ((rectF8.width() * scaleX) / z5Var.getMeasuredWidth()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.h = ((rectF8.height() * scaleY) / z5Var.getMeasuredHeight()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                            d = dR8;
                        } else {
                            z21 = z17;
                            if (jVar instanceof zf.o2) {
                                imageAspectRatio = ((zf.o2) jVar).f50651t0.getImageAspectRatio();
                                f10 = (mediaEntity.width / 2.0f) + mediaEntity.f19646x;
                                f11 = (mediaEntity.height / 2.0f) + mediaEntity.f19647y;
                                measuredWidth = z5Var.getMeasuredWidth() / z5Var.getMeasuredHeight();
                                if (imageAspectRatio > 1.0f) {
                                    float f1112 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                    mediaEntity.height = f1112;
                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                    mediaEntity.f19647y = f11 - (f1112 / 2.0f);
                                } else if (imageAspectRatio < 1.0f) {
                                    float f1113 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                    mediaEntity.width = f1113;
                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                    mediaEntity.f19646x = f10 - (f1113 / 2.0f);
                                }
                            } else {
                                mediaArea = mediaEntity.mediaArea;
                                if (mediaArea == null) {
                                }
                            }
                            d = -1.0d;
                        }
                        mediaArea2 = mediaEntity.mediaArea;
                        if (mediaArea2 != null) {
                            mediaAreaCoordinates.flags |= 1;
                            mediaAreaCoordinates.radius = ((((double) scaleX) * d) / ((double) childAt.getWidth())) * 100.0d;
                        }
                        z14 = z18;
                        z15 = z21;
                    } else {
                        z5Var = z5Var2;
                        i13 = childCount;
                        i14 = i12;
                        childAt = childAt;
                        z14 = true;
                        z15 = false;
                        imageReceiver = null;
                    }
                    if (!z14) {
                    }
                    i12 = i14 + 1;
                    f6Var = this;
                    childCount = i13;
                    z5Var2 = z5Var;
                    i19 = 0;
                    b13 = 1;
                }
                i12 = i14 + 1;
                f6Var = this;
                childCount = i13;
                z5Var2 = z5Var;
                i19 = 0;
                b13 = 1;
            }
        }
        return bitmap;
    }

    @Override
    public final void u() {
        if (!this.f15983n2 && !this.f15981m2) {
            this.f15972h2 = true;
            o0(true);
            return;
        }
        if (this.f15981m2) {
            zf.j jVar = this.F0;
            if (jVar instanceof zf.v2) {
                this.K1.f15636e = true;
                AndroidUtilities.showKeyboard(((zf.v2) jVar).getEditText());
            }
        }
        J0(!this.f15981m2 ? 1 : 0);
    }

    public final boolean u0() {
        return this.f16005z0.a() || this.f15972h2;
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.K0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x8 = (f10 - view2.getX()) - view.getLeft();
        float y10 = (f11 - view2.getY()) - view.getTop();
        float pivotX = ((x8 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = ((y10 - view2.getPivotY()) / view2.getScaleY()) + view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = pivotY;
    }

    public final void v0(boolean z10) {
        int i10 = 0;
        if (this.f15981m2) {
            J0(0);
        }
        if (z10) {
            yy yyVar = this.f15979l2;
            if (yyVar == null || yyVar.getVisibility() != 0) {
                w0();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f15979l2.getMeasuredHeight());
            valueAnimatorOfFloat.addUpdateListener(new q4(this, i10));
            this.f15985o2 = true;
            valueAnimatorOfFloat.addListener(new l5(this, 2));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
            valueAnimatorOfFloat.start();
        }
    }

    @Override
    public final int[] w(zf.j jVar) {
        int i10 = (int) jVar.getPosition().x;
        int[] iArr = this.f15978k2;
        iArr[0] = i10;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final void w0() {
        yy yyVar;
        if (!this.f15981m2 && (yyVar = this.f15979l2) != null && yyVar.getVisibility() != 8) {
            this.f15979l2.setVisibility(8);
        }
        int i10 = this.f15987p2;
        this.f15987p2 = 0;
        if (i10 != 0) {
            this.K1.a();
        }
    }

    @Override
    public final yf.r0 x() {
        return yf.r0.e(this.B1);
    }

    public final boolean y0() {
        if (this.Y1) {
            if (this.V1.getReactionsWindow() == null || this.V1.getReactionsWindow().f11282q) {
                O0(false);
                return true;
            }
            this.V1.e();
            return true;
        }
        if (this.f16002x1) {
            I0(false);
            return true;
        }
        if (this.f15981m2) {
            v0(true);
            return true;
        }
        if (!this.G0) {
            return false;
        }
        if (!this.I0) {
            D0(null, true);
            return true;
        }
        this.I0 = false;
        this.K1.b(true);
        return false;
    }

    public abstract void z0(boolean z10);

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f10) {
    }
}
