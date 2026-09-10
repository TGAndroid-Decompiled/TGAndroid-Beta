package bi;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.LaunchActivity;
public abstract class r7 extends bw0 implements pg.q1, pg.h, pg.m1, zv0, yd {
    public final pg.f1 A0;
    public final og.v1 A1;
    public final pg.j1 B0;
    public boolean B1;
    public final Bitmap C0;
    public o1.k C1;
    public final og.y1 D0;
    public float D1;
    public final DispatchQueue E0;
    public final Paint E1;
    public final MediaController.CropState F0;
    public final int F1;
    public boolean G0;
    public final d7 G1;
    public tv0 H0;
    public org.telegram.ui.ActionBar.p1 H1;
    public boolean I0;
    public p7 I1;
    public pg.j J0;
    public Rect J1;
    public boolean K0;
    public Runnable K1;
    public int L0;
    public Runnable L1;
    public boolean M0;
    public final be M1;
    public final boolean N0;
    public AnimatorSet N1;
    public final f7 O0;
    public final r6 O1;
    public final h7 P0;
    public r9 P1;
    public final k7 Q0;
    public ArrayList Q1;
    public final j7 R0;
    public int R1;
    public final FrameLayout S0;
    public int S1;
    public final l7 T0;
    public og.a0 T1;
    public final o6 U0;
    public final boolean U1;
    public final FrameLayout V0;
    public final File V1;
    public w6 W0;
    public final boolean W1;
    public final View X0;
    public final boolean X1;
    public int Y0;
    public boolean Y1;
    public int Z0;
    public pk0 Z1;
    public float f3500a1;
    public pg.a2 a2;
    public ValueAnimator f3501b1;
    public float f3502b2;
    public boolean f3503c1;
    public boolean f3504c2;
    public final pg.w1 f3505d1;
    public boolean f3506d2;
    public final a4.m f3507e1;
    public org.telegram.ui.Components.ia f3508e2;
    public final int f3509f1;
    public final d8 f3510f2;
    public BigInteger f3511g1;
    public final e8 f3512g2;
    public TextView f3513h1;
    public boolean f3514h2;
    public TextView f3515i1;
    public ObjectAnimator f3516i2;
    public TextView f3517j1;
    public final float[] f3518j2;
    public final pg.r1 f3519k1;
    public y6 f3520k2;
    public final pg.o1 l1;
    public boolean f3521l2;
    public final pg.t1 f3522m1;
    public boolean f3523m2;
    public final ImageView f3524n1;
    public boolean f3525n2;
    public final TextView f3526o1;
    public final int[] f3527o2;
    public final TextView f3528p1;
    public rz f3529p2;
    public final TextView f3530q1;
    public boolean f3531q2;
    public final Paint f3532r1;
    public boolean f3533r2;
    public final Paint f3534s1;
    public boolean f3535s2;
    public float f3536t1;
    public int f3537t2;
    public boolean f3538u1;
    public boolean f3539u2;
    public o1.k f3540v1;
    public int f3541v2;
    public final p6 f3542w1;
    public int f3543w2;
    public final Paint f3544x1;
    public int f3545x2;
    public final Paint f3546y1;
    public boolean f3547y2;
    public final Paint f3548z1;

    public r7(Context context, boolean z10, File file, boolean z11, boolean z12, be beVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, r9 r9Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ia iaVar, org.telegram.ui.ActionBar.f6 f6Var, d8 d8Var, e8 e8Var) {
        super(context, activity);
        f7 f7Var;
        og.v1 v1Var;
        org.telegram.ui.Components.ia iaVar2;
        d7 d7Var;
        DispatchQueue dispatchQueue;
        Bitmap bitmap3;
        Paint paint;
        Paint paint2;
        f7 f7Var2;
        int i14;
        this.Y0 = 0;
        this.Z0 = -1;
        final ad adVar = (ad) this;
        a4.m mVar = new a4.m(adVar, 5);
        this.f3507e1 = mVar;
        Paint paint3 = new Paint(1);
        this.f3532r1 = paint3;
        Paint paint4 = new Paint(1);
        this.f3534s1 = paint4;
        this.f3544x1 = new Paint(1);
        this.f3546y1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f3548z1 = paint5;
        og.v1 v1Var2 = new og.v1(1.0f, 0.016773745f, -1);
        this.A1 = v1Var2;
        this.E1 = new Paint(1);
        this.f3518j2 = new float[2];
        this.f3523m2 = false;
        this.f3527o2 = new int[2];
        new androidx.activity.i(adVar, 8);
        setDelegate(this);
        this.f3508e2 = iaVar;
        this.f3510f2 = d8Var;
        this.U1 = z10;
        this.V1 = file;
        this.W1 = z11;
        this.X1 = z12;
        this.M1 = beVar;
        this.R1 = i12;
        this.S1 = i13;
        this.f3512g2 = e8Var;
        this.F1 = i10;
        d7 d7Var2 = new d7(f6Var);
        this.G1 = d7Var2;
        this.F0 = cropState;
        this.N0 = context instanceof BubbleActivity;
        og.x0 e = og.x0.e(i10);
        e.i(0, true);
        v1Var2.f14534a = e.c();
        v1Var2.f14536c = e.f14557i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.E0 = dispatchQueue2;
        this.C0 = bitmap;
        this.f3509f1 = i11;
        og.y1 y1Var = new og.y1();
        this.D0 = y1Var;
        y1Var.f14570a = new a1.c(adVar, 8);
        View view = new View(context);
        this.X0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        og.v0 v0Var = new og.v0(getPaintingSize(), null, i11, iaVar);
        if (r9Var == null || !r9Var.f3600u) {
            v1Var = v1Var2;
            iaVar2 = iaVar;
            d7Var = d7Var2;
            dispatchQueue = dispatchQueue2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            f7Var2 = f7Var;
        } else {
            v1Var = v1Var2;
            iaVar2 = null;
            d7Var = d7Var2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            f7Var2 = f7Var;
            dispatchQueue = dispatchQueue2;
        }
        f7Var2 = new f7(adVar, context, v0Var, bitmap3, bitmap2, iaVar2);
        this.O0 = f7Var2;
        f7Var2.setDelegate(new g7(adVar));
        f7Var2.setUndoStore(y1Var);
        f7Var2.setQueue(dispatchQueue);
        f7Var2.setVisibility(4);
        h7 h7Var = new h7(adVar, context);
        this.P0 = h7Var;
        h7Var.setVisibility(4);
        j7 j7Var = new j7(adVar, context, new i7(adVar));
        this.R0 = j7Var;
        this.P1 = r9Var;
        this.Q1 = arrayList;
        if (this.R1 > 0 && this.S1 > 0) {
            H0();
        }
        j7Var.setVisibility(4);
        this.Q0 = new k7(adVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, w7.a6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f3524n1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ad adVar2 = adVar;
                        f7 f7Var3 = adVar2.O0;
                        if (f7Var3 != null && (f7Var3.getCurrentBrush() instanceof og.l)) {
                            f7Var3.b();
                            adVar2.f3519k1.setSelectedIndex(1);
                            adVar2.B((og.m) og.m.f14420a.get(0));
                            return;
                        }
                        adVar2.D0.c();
                        return;
                    case 1:
                        ad adVar3 = adVar;
                        f7 f7Var4 = adVar3.O0;
                        og.y1 y1Var2 = adVar3.D0;
                        if (y1Var2.a()) {
                            if (f7Var4 != null && (f7Var4.getCurrentBrush() instanceof og.l)) {
                                f7Var4.b();
                                adVar3.f3519k1.setSelectedIndex(1);
                                adVar3.B((og.m) og.m.f14420a.get(0));
                            }
                            if (f7Var4 != null) {
                                f7Var4.a();
                            }
                            y1Var2.f14572c.clear();
                            y1Var2.f14571b.clear();
                            AndroidUtilities.runOnUIThread(new gg.v1(y1Var2, 27));
                            adVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ad adVar4 = adVar;
                        pg.j jVar = adVar4.J0;
                        if (jVar instanceof pg.v2) {
                            AndroidUtilities.hideKeyboard(((pg.v2) jVar).getFocusedView());
                        }
                        if (adVar4.f3531q2) {
                            adVar4.v0(false);
                        }
                        adVar4.C0(adVar4.J0);
                        adVar4.D0(null, true);
                        return;
                    case 3:
                        adVar.D0(null, true);
                        return;
                    default:
                        ad adVar5 = adVar;
                        if (adVar5.B1) {
                            adVar5.I0(false);
                            return;
                        } else if (adVar5.f3531q2) {
                            adVar5.v0(true);
                            return;
                        } else if (adVar5.K0) {
                            adVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = adVar5.L1;
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
        frameLayout.addView(imageView, w7.a6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        em.j(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, w7.a6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.a6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new d5(1));
        frameLayout.addView(linearLayout, w7.a6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f3526o1 = textView2;
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
                        ad adVar2 = adVar;
                        f7 f7Var3 = adVar2.O0;
                        if (f7Var3 != null && (f7Var3.getCurrentBrush() instanceof og.l)) {
                            f7Var3.b();
                            adVar2.f3519k1.setSelectedIndex(1);
                            adVar2.B((og.m) og.m.f14420a.get(0));
                            return;
                        }
                        adVar2.D0.c();
                        return;
                    case 1:
                        ad adVar3 = adVar;
                        f7 f7Var4 = adVar3.O0;
                        og.y1 y1Var2 = adVar3.D0;
                        if (y1Var2.a()) {
                            if (f7Var4 != null && (f7Var4.getCurrentBrush() instanceof og.l)) {
                                f7Var4.b();
                                adVar3.f3519k1.setSelectedIndex(1);
                                adVar3.B((og.m) og.m.f14420a.get(0));
                            }
                            if (f7Var4 != null) {
                                f7Var4.a();
                            }
                            y1Var2.f14572c.clear();
                            y1Var2.f14571b.clear();
                            AndroidUtilities.runOnUIThread(new gg.v1(y1Var2, 27));
                            adVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ad adVar4 = adVar;
                        pg.j jVar = adVar4.J0;
                        if (jVar instanceof pg.v2) {
                            AndroidUtilities.hideKeyboard(((pg.v2) jVar).getFocusedView());
                        }
                        if (adVar4.f3531q2) {
                            adVar4.v0(false);
                        }
                        adVar4.C0(adVar4.J0);
                        adVar4.D0(null, true);
                        return;
                    case 3:
                        adVar.D0(null, true);
                        return;
                    default:
                        ad adVar5 = adVar;
                        if (adVar5.B1) {
                            adVar5.I0(false);
                            return;
                        } else if (adVar5.f3531q2) {
                            adVar5.v0(true);
                            return;
                        } else if (adVar5.K0) {
                            adVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = adVar5.L1;
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
        TextView f7 = org.telegram.ui.Cells.r6.f(frameLayout, textView2, w7.a6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f3528p1 = f7;
        f7.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        f7.setPadding(org.telegram.ui.Cells.r6.b(8.0f, R.string.Clear, f7), 0, AndroidUtilities.dp(8.0f), 0);
        f7.setGravity(16);
        f7.setTextColor(-1);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setTextSize(1, 16.0f);
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ad adVar2 = adVar;
                        f7 f7Var3 = adVar2.O0;
                        if (f7Var3 != null && (f7Var3.getCurrentBrush() instanceof og.l)) {
                            f7Var3.b();
                            adVar2.f3519k1.setSelectedIndex(1);
                            adVar2.B((og.m) og.m.f14420a.get(0));
                            return;
                        }
                        adVar2.D0.c();
                        return;
                    case 1:
                        ad adVar3 = adVar;
                        f7 f7Var4 = adVar3.O0;
                        og.y1 y1Var2 = adVar3.D0;
                        if (y1Var2.a()) {
                            if (f7Var4 != null && (f7Var4.getCurrentBrush() instanceof og.l)) {
                                f7Var4.b();
                                adVar3.f3519k1.setSelectedIndex(1);
                                adVar3.B((og.m) og.m.f14420a.get(0));
                            }
                            if (f7Var4 != null) {
                                f7Var4.a();
                            }
                            y1Var2.f14572c.clear();
                            y1Var2.f14571b.clear();
                            AndroidUtilities.runOnUIThread(new gg.v1(y1Var2, 27));
                            adVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ad adVar4 = adVar;
                        pg.j jVar = adVar4.J0;
                        if (jVar instanceof pg.v2) {
                            AndroidUtilities.hideKeyboard(((pg.v2) jVar).getFocusedView());
                        }
                        if (adVar4.f3531q2) {
                            adVar4.v0(false);
                        }
                        adVar4.C0(adVar4.J0);
                        adVar4.D0(null, true);
                        return;
                    case 3:
                        adVar.D0(null, true);
                        return;
                    default:
                        ad adVar5 = adVar;
                        if (adVar5.B1) {
                            adVar5.I0(false);
                            return;
                        } else if (adVar5.f3531q2) {
                            adVar5.v0(true);
                            return;
                        } else if (adVar5.K0) {
                            adVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = adVar5.L1;
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
        TextView f10 = org.telegram.ui.Cells.r6.f(frameLayout, f7, w7.a6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f3530q1 = f10;
        f10.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        f10.setPadding(org.telegram.ui.Cells.r6.b(8.0f, R.string.Done, f10), 0, AndroidUtilities.dp(8.0f), 0);
        f10.setGravity(16);
        f10.setTextColor(-1);
        f10.setTypeface(AndroidUtilities.bold());
        f10.setTextSize(1, 16.0f);
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ad adVar2 = adVar;
                        f7 f7Var3 = adVar2.O0;
                        if (f7Var3 != null && (f7Var3.getCurrentBrush() instanceof og.l)) {
                            f7Var3.b();
                            adVar2.f3519k1.setSelectedIndex(1);
                            adVar2.B((og.m) og.m.f14420a.get(0));
                            return;
                        }
                        adVar2.D0.c();
                        return;
                    case 1:
                        ad adVar3 = adVar;
                        f7 f7Var4 = adVar3.O0;
                        og.y1 y1Var2 = adVar3.D0;
                        if (y1Var2.a()) {
                            if (f7Var4 != null && (f7Var4.getCurrentBrush() instanceof og.l)) {
                                f7Var4.b();
                                adVar3.f3519k1.setSelectedIndex(1);
                                adVar3.B((og.m) og.m.f14420a.get(0));
                            }
                            if (f7Var4 != null) {
                                f7Var4.a();
                            }
                            y1Var2.f14572c.clear();
                            y1Var2.f14571b.clear();
                            AndroidUtilities.runOnUIThread(new gg.v1(y1Var2, 27));
                            adVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ad adVar4 = adVar;
                        pg.j jVar = adVar4.J0;
                        if (jVar instanceof pg.v2) {
                            AndroidUtilities.hideKeyboard(((pg.v2) jVar).getFocusedView());
                        }
                        if (adVar4.f3531q2) {
                            adVar4.v0(false);
                        }
                        adVar4.C0(adVar4.J0);
                        adVar4.D0(null, true);
                        return;
                    case 3:
                        adVar.D0(null, true);
                        return;
                    default:
                        ad adVar5 = adVar;
                        if (adVar5.B1) {
                            adVar5.I0(false);
                            return;
                        } else if (adVar5.f3531q2) {
                            adVar5.v0(true);
                            return;
                        } else if (adVar5.K0) {
                            adVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = adVar5.L1;
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
        frameLayout.addView(f10, w7.a6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        l7 l7Var = new l7(adVar, context, e);
        this.T0 = l7Var;
        l7Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        l7Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(l7Var, w7.a6.e(-1, 104, 80));
        pg.r1 r1Var = new pg.r1(context, (r9Var == null || r9Var.v() || r9Var.f3600u || iaVar == null) ? false : true);
        this.f3519k1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        l7Var.addView(r1Var, w7.a6.c(48.0f, -1));
        pg.o1 o1Var = new pg.o1(context);
        this.l1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ad adVar2 = adVar;
                        og.v1 v1Var3 = adVar2.A1;
                        adVar2.F0(v1Var3);
                        og.x0.e(i10).j(v1Var3.f14536c);
                        return;
                    default:
                        adVar.l1.setTypeface(og.x0.e(i10).f14558j);
                        return;
                }
            }
        });
        o1Var.setAlignment(og.x0.e(i10).f14556g);
        l7Var.addView(o1Var, w7.a6.c(48.0f, -1));
        o6 o6Var = new o6(adVar, context);
        this.U0 = o6Var;
        addView(o6Var, w7.a6.c(-1.0f, -1));
        pg.t1 t1Var = new pg.t1(context);
        this.f3522m1 = t1Var;
        t1Var.setVisibility(8);
        t1Var.setOnItemClickListener(new ai.g(adVar, 4));
        o1Var.setTypefaceListView(t1Var);
        o6Var.addView(t1Var, w7.a6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint2.setColor(d7Var.F0(org.telegram.ui.ActionBar.j6.G8));
        p6 p6Var = new p6(adVar, context);
        this.f3542w1 = p6Var;
        p6Var.setVisibility(8);
        p6Var.setColorPalette(og.x0.e(i10));
        p6Var.setColorListener(new a6(adVar, 0));
        l7Var.addView(p6Var, w7.a6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        pg.f1 f1Var = new pg.f1(context);
        this.A0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        l7Var.addView(f1Var, w7.a6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        f1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ad adVar2 = adVar;
                        f7 f7Var3 = adVar2.O0;
                        if (f7Var3 != null && (f7Var3.getCurrentBrush() instanceof og.l)) {
                            f7Var3.b();
                            adVar2.f3519k1.setSelectedIndex(1);
                            adVar2.B((og.m) og.m.f14420a.get(0));
                            return;
                        }
                        adVar2.D0.c();
                        return;
                    case 1:
                        ad adVar3 = adVar;
                        f7 f7Var4 = adVar3.O0;
                        og.y1 y1Var2 = adVar3.D0;
                        if (y1Var2.a()) {
                            if (f7Var4 != null && (f7Var4.getCurrentBrush() instanceof og.l)) {
                                f7Var4.b();
                                adVar3.f3519k1.setSelectedIndex(1);
                                adVar3.B((og.m) og.m.f14420a.get(0));
                            }
                            if (f7Var4 != null) {
                                f7Var4.a();
                            }
                            y1Var2.f14572c.clear();
                            y1Var2.f14571b.clear();
                            AndroidUtilities.runOnUIThread(new gg.v1(y1Var2, 27));
                            adVar3.R0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ad adVar4 = adVar;
                        pg.j jVar = adVar4.J0;
                        if (jVar instanceof pg.v2) {
                            AndroidUtilities.hideKeyboard(((pg.v2) jVar).getFocusedView());
                        }
                        if (adVar4.f3531q2) {
                            adVar4.v0(false);
                        }
                        adVar4.C0(adVar4.J0);
                        adVar4.D0(null, true);
                        return;
                    case 3:
                        adVar.D0(null, true);
                        return;
                    default:
                        ad adVar5 = adVar;
                        if (adVar5.B1) {
                            adVar5.I0(false);
                            return;
                        } else if (adVar5.f3531q2) {
                            adVar5.v0(true);
                            return;
                        } else if (adVar5.K0) {
                            adVar5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = adVar5.L1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        pg.j1 j1Var = new pg.j1(context);
        this.B0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new q(adVar, context, e, 2));
        l7Var.addView(j1Var, w7.a6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        pg.w1 w1Var = new pg.w1(context);
        this.f3505d1 = w1Var;
        og.v1 v1Var3 = v1Var;
        w1Var.setColorSwatch(v1Var3);
        w1Var.setRenderView(f7Var2);
        w1Var.setValueOverride(mVar);
        v1Var3.f14536c = mVar.get();
        w1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ad adVar2 = adVar;
                        og.v1 v1Var32 = adVar2.A1;
                        adVar2.F0(v1Var32);
                        og.x0.e(i10).j(v1Var32.f14536c);
                        return;
                    default:
                        adVar.l1.setTypeface(og.x0.e(i10).f14558j);
                        return;
                }
            }
        });
        addView(w1Var, w7.a6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V0 = frameLayout2;
        addView(frameLayout2, w7.a6.c(-1.0f, -1));
        Paint paint6 = paint;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(v1Var3, null, false);
        B((og.m) og.m.f14420a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.O1 = new r6(adVar, beVar, new y2(i14, adVar, beVar));
        f3.G = i14;
    }

    public static void G0(pg.v2 v2Var, int i10) {
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

    public static void Z(ad adVar, og.x0 x0Var, Integer num) {
        x0Var.h(num.intValue(), true);
        x0Var.g();
        adVar.setNewColor(num.intValue());
        adVar.f3542w1.setSelectedColorIndex(x0Var.d());
        adVar.T1 = null;
    }

    public static void a0(ad adVar, Integer num) {
        adVar.setNewColor(num.intValue());
        adVar.I0(false);
    }

    public ViewGroup getBarView() {
        if (this.Y0 == 2) {
            return this.l1;
        }
        return this.f3519k1;
    }

    private int getFrameRotation() {
        int i10 = this.f3509f1;
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

    private tv0 getPaintingSize() {
        tv0 tv0Var = this.H0;
        if (tv0Var != null) {
            return tv0Var;
        }
        tv0 tv0Var2 = new tv0(1080.0f, 1920.0f);
        this.H0 = tv0Var2;
        return tv0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            j7 j7Var = this.R0;
            if (i10 < j7Var.getChildCount()) {
                View childAt = j7Var.getChildAt(i10);
                if (childAt instanceof pg.o2) {
                    ImageReceiver imageReceiver = ((pg.o2) childAt).f40246x0;
                    hj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
                        animation.f22028y = z10;
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
        og.v1 v1Var = this.A1;
        int i11 = v1Var.f14534a;
        v1Var.f14534a = i10;
        E0(v1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new z5(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        pg.j jVar = this.J0;
        if (jVar instanceof pg.v2) {
            ((pg.v2) jVar).setType(i10);
        }
        og.x0 e = og.x0.e(this.F1);
        e.h = i10;
        e.f14552a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        w6 w6Var = new w6(this, context);
        this.W0 = w6Var;
        w6Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.a6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f3513h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f3513h1;
        int i10 = org.telegram.ui.ActionBar.j6.f18017i6;
        d7 d7Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, d7Var), 7, -1));
        this.f3513h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f3513h1.setTextColor(-1);
        this.f3513h1.setTextSize(1, 14.0f);
        this.f3513h1.setGravity(1);
        this.f3513h1.setTypeface(AndroidUtilities.bold());
        this.f3513h1.setSingleLine();
        this.f3513h1.setOnClickListener(new View.OnClickListener(this) {
            public final r7 f3498b;

            {
                this.f3498b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r7 r7Var = this.f3498b;
                        if (r7Var.K0) {
                            r7Var.D0(null, true);
                            return;
                        } else {
                            r7Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f3498b.A0();
                        return;
                    default:
                        r7 r7Var2 = this.f3498b;
                        r7Var2.R0(2);
                        if (!(r7Var2.J0 instanceof pg.v2)) {
                            r7Var2.f3521l2 = true;
                            r7Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f3513h1, w7.a6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f3515i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f3515i1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, d7Var), 7, -1));
        this.f3515i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f3515i1.setOnClickListener(new View.OnClickListener(this) {
            public final r7 f3498b;

            {
                this.f3498b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r7 r7Var = this.f3498b;
                        if (r7Var.K0) {
                            r7Var.D0(null, true);
                            return;
                        } else {
                            r7Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f3498b.A0();
                        return;
                    default:
                        r7 r7Var2 = this.f3498b;
                        r7Var2.R0(2);
                        if (!(r7Var2.J0 instanceof pg.v2)) {
                            r7Var2.f3521l2 = true;
                            r7Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f3515i1.setTextColor(-1);
        this.f3515i1.setTextSize(1, 14.0f);
        this.f3515i1.setGravity(1);
        this.f3515i1.setTypeface(AndroidUtilities.bold());
        this.f3515i1.setAlpha(0.6f);
        this.f3515i1.setSingleLine();
        this.W0.addView(this.f3515i1, w7.a6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f3517j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f3517j1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, d7Var), 7, -1));
        this.f3517j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f3517j1.setTextColor(-1);
        this.f3517j1.setTextSize(1, 14.0f);
        this.f3517j1.setGravity(1);
        this.f3517j1.setTypeface(AndroidUtilities.bold());
        this.f3517j1.setAlpha(0.6f);
        this.f3517j1.setSingleLine();
        this.f3517j1.setOnClickListener(new View.OnClickListener(this) {
            public final r7 f3498b;

            {
                this.f3498b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r7 r7Var = this.f3498b;
                        if (r7Var.K0) {
                            r7Var.D0(null, true);
                            return;
                        } else {
                            r7Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f3498b.A0();
                        return;
                    default:
                        r7 r7Var2 = this.f3498b;
                        r7Var2.R0(2);
                        if (!(r7Var2.J0 instanceof pg.v2)) {
                            r7Var2.f3521l2 = true;
                            r7Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.addView(this.f3517j1, w7.a6.l(1.0f, 0, -2));
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
        postDelayed(new f0(this, 2), 350L);
        y6 y6Var = new y6(this, getContext(), this.G1, i10);
        this.f3520k2 = y6Var;
        be beVar = this.M1;
        Objects.requireNonNull(beVar);
        y6Var.f2697w = new ai.c0(beVar, 6);
        final boolean[] zArr = {true};
        y6Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                r7 r7Var = r7.this;
                r7Var.f3520k2 = null;
                if (zArr[0]) {
                    r7Var.z0(false);
                }
                r7Var.R0(i10);
            }
        });
        y6Var.f2699y = new e6(this);
        y6Var.q0(new n6(this, zArr, y6Var, 0));
        y6Var.show();
        z0(true);
    }

    @Override
    public final void B(og.m mVar) {
        boolean z10 = mVar instanceof og.b;
        pg.w1 w1Var = this.f3505d1;
        if (!z10 && !(mVar instanceof og.d)) {
            w1Var.b(0.05f, 1.0f);
        } else {
            w1Var.b(0.4f, 1.75f);
        }
        w1Var.setDrawCenter(!(mVar instanceof og.l));
        f7 f7Var = this.O0;
        if (f7Var.getCurrentBrush() instanceof og.l) {
            this.f3503c1 = true;
        }
        f7Var.setBrush(mVar);
        og.v1 v1Var = this.A1;
        int i10 = v1Var.f14534a;
        v1Var.f14534a = og.x0.e(this.F1).c();
        v1Var.f14536c = this.f3507e1.get();
        E0(v1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    public final void B0(pg.j jVar) {
        this.D0.b(jVar.getUUID(), new b6(this, jVar, 0));
    }

    @Override
    public final void C() {
        P0(true);
    }

    public final void C0(pg.j jVar) {
        pg.j jVar2 = this.J0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            D0(null, true);
            if (jVar instanceof pg.v2) {
                ValueAnimator valueAnimator = this.f3501b1;
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
            og.y1 y1Var = this.D0;
            y1Var.f14571b.remove(uuid);
            y1Var.f14572c.remove(uuid);
            AndroidUtilities.runOnUIThread(new gg.v1(y1Var, 27));
        }
        pg.w1 w1Var = this.f3505d1;
        a4.m mVar = this.f3507e1;
        w1Var.setValueOverride(mVar);
        w1Var.setShowPreview(true);
        float f7 = mVar.get();
        og.v1 v1Var = this.A1;
        v1Var.f14536c = f7;
        E0(v1Var, null, false);
        if (!this.f3525n2 && (jVar instanceof pg.b2)) {
            ce ceVar = ((ad) this).A2;
            nd ndVar = ceVar.X0;
            if (ndVar != null) {
                ndVar.s(null, null, true);
            }
            ad adVar = ceVar.f2498v1;
            if (adVar != null) {
                adVar.q0();
            }
            qd qdVar = ceVar.f2439c1;
            if (qdVar != null) {
                qdVar.setHasRoundVideo(false);
            }
            r9 r9Var = ceVar.K1;
            if (r9Var != null) {
                File file = r9Var.f3589o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    ceVar.K1.f3589o0 = null;
                }
                if (ceVar.K1.f3591p0 != null) {
                    try {
                        new File(ceVar.K1.f3591p0).delete();
                    } catch (Exception unused2) {
                    }
                    ceVar.K1.f3591p0 = null;
                }
            }
        }
    }

    @Override
    public final void D(pg.j jVar) {
        O0(false);
        M0(jVar);
    }

    public final boolean D0(pg.j jVar, boolean z10) {
        boolean z11;
        me meVar;
        me meVar2;
        pk0 pk0Var;
        int i10;
        boolean z12 = jVar instanceof pg.v2;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f3501b1;
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
            pg.v2 v2Var = (pg.v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            pg.o1 o1Var = this.l1;
            o1Var.setAlignment(i11);
            og.m0 typeface = v2Var.getTypeface();
            if (typeface != null) {
                o1Var.setTypeface(typeface.f14424a);
            }
            o1Var.e(v2Var.getType(), true);
            this.U0.invalidate();
        }
        pg.j jVar2 = this.J0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f40046d0) {
                    if (jVar instanceof pg.t0) {
                        pg.t0 t0Var = (pg.t0) jVar;
                        t0Var.setType((t0Var.getType() + 1) % t0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof pg.w2) {
                        pg.w2 w2Var = (pg.w2) jVar;
                        w2Var.setType((w2Var.getType() + 1) % w2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof pg.q0) {
                        pg.q0 q0Var = (pg.q0) jVar;
                        pg.o0 o0Var = q0Var.f40258q0;
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
                        if (jVar instanceof pg.v2) {
                            this.M0 = true;
                            r0();
                            return true;
                        } else if (jVar instanceof pg.a2) {
                            pg.a2 a2Var = (pg.a2) jVar;
                            if (this.f3504c2 && this.a2 == jVar) {
                                a2Var.q(true);
                                return true;
                            }
                            pg.a2 a2Var2 = this.a2;
                            if (a2Var2 != null && a2Var2 != a2Var && (pk0Var = this.Z1) != null) {
                                pk0Var.animate().alpha(0.0f).setListener(new t6(pk0Var, 0));
                                this.Z1 = null;
                                this.f3504c2 = false;
                                this.f3502b2 = 0.0f;
                            }
                            if (this.Z1 == null) {
                                pk0 pk0Var2 = new pk0(2, this.F1, getContext(), LaunchActivity.R(), new n1(1, new zh.b()));
                                this.Z1 = pk0Var2;
                                org.telegram.ui.Components.ma maVar = new org.telegram.ui.Components.ma(this.f3508e2, pk0Var2, 0, false);
                                this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.M1.addView(this.Z1, w7.a6.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                pk0 pk0Var3 = this.Z1;
                                ?? obj = new Object();
                                obj.e = this;
                                obj.f3720b = maVar;
                                obj.d = paint;
                                obj.f3721c = new Path();
                                pk0Var3.setDelegate(obj);
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
                    } else if (jVar2 instanceof pg.v2) {
                        AndroidUtilities.showKeyboard(((pg.v2) jVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            pg.j jVar3 = this.J0;
            if (jVar3 instanceof pg.v2) {
                pg.v2 v2Var2 = (pg.v2) jVar3;
                pg.u2 u2Var = v2Var2.f40322q0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((pg.v2) this.J0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar3 instanceof pg.b2) && (meVar2 = ((ad) this).A2.Z0) != null) {
                meVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        pg.j jVar4 = this.J0;
        this.J0 = jVar;
        if ((jVar4 instanceof pg.v2) && TextUtils.isEmpty(((pg.v2) jVar4).getText())) {
            C0(jVar4);
        }
        pg.j jVar5 = this.J0;
        if (jVar4 != jVar5 && (jVar5 instanceof pg.b2) && (meVar = ((ad) this).A2.Z0) != null) {
            meVar.l(true);
        }
        pg.j jVar6 = this.J0;
        a4.m mVar = this.f3507e1;
        og.v1 v1Var = this.A1;
        pg.w1 w1Var = this.f3505d1;
        if (jVar6 != null) {
            k7 k7Var = this.Q0;
            jVar6.m0 = k7Var;
            jVar6.l(k7Var, true);
            pg.j jVar7 = this.J0;
            if (jVar7 instanceof pg.v2) {
                pg.v2 v2Var3 = (pg.v2) jVar7;
                v2Var3.getSwatch().f14536c = v1Var.f14536c;
                v2Var3.f40331z0 = false;
                F0(v2Var3.getSwatch());
                w1Var.setValueOverride(new s6(v2Var3, (int) (this.H0.f27499a / 9.0f), 0));
                w1Var.setShowPreview(false);
            } else {
                w1Var.setValueOverride(mVar);
                w1Var.setShowPreview(true);
                v1Var.f14536c = mVar.get();
                E0(v1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f3501b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                I0(false);
            }
            R0(0);
            w1Var.setValueOverride(mVar);
            w1Var.setShowPreview(true);
            v1Var.f14536c = mVar.get();
            E0(v1Var, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(og.v1 v1Var, Integer num, boolean z10) {
        og.v1 v1Var2 = this.A1;
        if (v1Var2 != v1Var) {
            v1Var2.f14534a = v1Var.f14534a;
            v1Var2.f14535b = v1Var.f14535b;
            v1Var2.f14536c = v1Var.f14536c;
            int i10 = this.F1;
            og.x0.e(i10).h(v1Var.f14534a, true);
            og.x0.e(i10).j(v1Var.f14536c);
        }
        int i11 = v1Var.f14534a;
        f7 f7Var = this.O0;
        f7Var.setColor(i11);
        f7Var.setBrushSize(v1Var.f14536c);
        int i12 = v1Var2.f14534a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new s5(this, num, i12, 0));
            duration.start();
        } else {
            l7 l7Var = this.T0;
            if (l7Var != null) {
                l7Var.invalidate();
            }
        }
        pg.j jVar = this.J0;
        if (jVar instanceof pg.v2) {
            ((pg.v2) jVar).setSwatch(new og.v1(v1Var.f14535b, v1Var.f14536c, v1Var.f14534a));
        } else if (z10 && (jVar instanceof pg.t0)) {
            ((pg.t0) jVar).setColor(v1Var.f14534a);
            ((pg.t0) this.J0).setType(3);
        } else if (z10 && (jVar instanceof pg.w2)) {
            ((pg.w2) jVar).setColor(v1Var.f14534a);
            ((pg.w2) this.J0).setType(3);
        } else if (z10 && (jVar instanceof pg.q0)) {
            ((pg.q0) jVar).setColor(v1Var.f14534a);
            ((pg.q0) this.J0).setType(0);
        }
    }

    public final void F0(og.v1 v1Var) {
        E0(v1Var, null, false);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f3533r2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f3543w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f3543w2).commit();
            } else {
                this.f3541v2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f3541v2).commit();
            }
        }
        boolean z13 = this.f3531q2;
        r6 r6Var = this.O1;
        if (z13) {
            if (z10) {
                i11 = this.f3543w2;
            } else {
                i11 = this.f3541v2;
            }
            int paddingUnderContainer = this.M1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f3529p2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f3529p2.setLayoutParams(layoutParams);
                this.f3537t2 = layoutParams.height;
                r6Var.a();
                requestLayout();
            }
        }
        if (this.f3545x2 == i10 && this.f3547y2 == z10) {
            return;
        }
        this.f3545x2 = i10;
        this.f3547y2 = z10;
        boolean z14 = this.f3533r2;
        pg.j jVar = this.J0;
        if (jVar instanceof pg.v2) {
            if (((pg.v2) jVar).getEditText().isFocused() && r6Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f3533r2 = z12;
        } else {
            this.f3533r2 = false;
        }
        if (this.f3533r2 && this.f3531q2) {
            J0(0);
        }
        if (this.f3537t2 != 0 && !(z11 = this.f3533r2) && z11 != z14 && !this.f3531q2) {
            this.f3537t2 = 0;
            r6Var.a();
            requestLayout();
        }
        U0();
        if (z14 && !this.f3533r2 && this.f3537t2 > 0 && this.f3539u2) {
            this.f3539u2 = false;
        }
        S0();
    }

    public final void H0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        pg.j jVar;
        ArrayList arrayList = this.Q1;
        if (arrayList != null) {
            r9 r9Var = this.P1;
            this.P1 = null;
            this.Q1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                j7 j7Var = this.R0;
                if (i11 < size) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        c7 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            n02.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = n02.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i10 = i11;
                        jVar = n02;
                    } else if (b10 == 1) {
                        pg.v2 o02 = o0(z10);
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
                        og.v1 swatch = o02.getSwatch();
                        swatch.f14534a = mediaEntity.color;
                        o02.setSwatch(swatch);
                        jVar = o02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            pg.x1 k02 = k0(mediaEntity.text, false);
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
                            ArrayList arrayList3 = r9Var.v;
                            boolean z11 = r9Var.K;
                            this.f3521l2 = true;
                            pg.j b7Var = new b7(this, getContext(), e0(), arrayList3, this.f3508e2, z11, this.f3510f2);
                            b7Var.setDelegate(this);
                            j7Var.addView(b7Var);
                            g0();
                            jVar = b7Var;
                            if (mediaEntity.viewWidth > 0) {
                                jVar = b7Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = b7Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    jVar = b7Var;
                                }
                            }
                        } else if (b10 == 3) {
                            pg.t0 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                j02.setColor(i14);
                            }
                            j02.setType(mediaEntity.subType);
                            jVar = j02;
                        } else if (b10 == 8) {
                            df dfVar = mediaEntity.weather;
                            if (dfVar != null) {
                                pg.w2 p02 = p0(dfVar);
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
                            pg.q0 i02 = i0(mediaEntity.linkSettings);
                            pg.o0 o0Var = i02.f40258q0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                i02.setColor(i16);
                            }
                            boolean e = o0Var.e();
                            int i17 = o0Var.h;
                            int i18 = o0Var.f40211f;
                            if (e) {
                                o0Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                i02.setType(3);
                                o0Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(o0Var.f40204a0)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(o0Var.f40206b0)) + i17 + i17;
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
                            pg.a2 l02 = l0(false);
                            l02.s(yg.p0.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                l02.r(false);
                            }
                            jVar = l02;
                            if (mediaEntity.mediaArea.dark) {
                                l02.q(false);
                                jVar = l02;
                            }
                        } else {
                            if (b10 == 5 && r9Var.f3589o0 != null) {
                                pg.b2 m0 = m0(r9Var.f3591p0, false);
                                ce ceVar = ((ad) this).A2;
                                nd ndVar = ceVar.X0;
                                if (ndVar != null) {
                                    ndVar.f2659w = m0;
                                    t71 t71Var = ndVar.f2661x;
                                    if (t71Var != null) {
                                        t71Var.V(m0.f39958u0);
                                    }
                                }
                                qd qdVar = ceVar.f2439c1;
                                if (qdVar != null) {
                                    qdVar.setHasRoundVideo(true);
                                }
                                jVar = m0;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z12 = !m0.f39955r0;
                                    m0.f39955r0 = z12;
                                    m0.f39956s0.f(z12, true);
                                    m0.invalidate();
                                    jVar = m0;
                                }
                            }
                            i11 = i10 + 1;
                            z10 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f14669x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f14670y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                    jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
                    jVar.setScale(mediaEntity.scale);
                    jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                    i11 = i10 + 1;
                    z10 = false;
                } else {
                    j7Var.setVisibility(0);
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
            lVar.f14140i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f14134u = lVar;
            if (!this.O1.c() && this.f3537t2 <= 0) {
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
                    r7 r7Var = r7.this;
                    l7 l7Var = r7Var.T0;
                    float f14 = f11 / 1000.0f;
                    r7Var.D1 = f14;
                    float f15 = 1.0f;
                    float f16 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f16);
                    view.setScaleY(f16);
                    view.setTranslationY((Math.min(r7Var.D1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(r7Var.D1, 0.25f) / 0.25f));
                    p6 p6Var = r7Var.f3542w1;
                    float f17 = r7Var.D1;
                    boolean z12 = z10;
                    p6Var.x1(f17, z12);
                    pg.j1 j1Var = r7Var.B0;
                    j1Var.setProgress(r7Var.D1);
                    pg.f1 f1Var = r7Var.A0;
                    f1Var.setProgress(r7Var.D1);
                    r7Var.W0.setTranslationY(AndroidUtilities.dp(32.0f) * r7Var.D1);
                    AnimatorSet animatorSet = r7Var.N1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f18 = r7Var.D1;
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
                        l7Var.setTranslationY(translationY - (dp * i10));
                    }
                    l7Var.invalidate();
                    if (view == r7Var.l1) {
                        r7Var.U0.invalidate();
                    }
                }
            });
            this.C1.a(new u5(this, z10, 0));
            this.C1.f();
            if (z10) {
                p6 p6Var = this.f3542w1;
                p6Var.setVisibility(0);
                p6Var.setSelectedColorIndex(og.x0.e(this.F1).d());
            }
        }
    }

    public final void J0(int i10) {
        boolean z10;
        int i11;
        pg.o1 o1Var = this.l1;
        r6 r6Var = this.O1;
        if (i10 == 1) {
            rz rzVar = this.f3529p2;
            if (rzVar != null && rzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rz rzVar2 = this.f3529p2;
            be beVar = this.M1;
            if (rzVar2 != null && rzVar2.f26805c1 != UserConfig.selectedAccount) {
                beVar.removeView(rzVar2);
                this.f3529p2 = null;
            }
            if (this.f3529p2 == null) {
                rz rzVar3 = new rz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.f3529p2 = rzVar3;
                rzVar3.f26873x2 = false;
                rzVar3.U0 = true;
                rzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f3529p2.setForseMultiwindowLayout(true);
                }
                this.f3529p2.setDelegate(new e7(this));
                beVar.addView(this.f3529p2);
            }
            this.f3529p2.setVisibility(0);
            this.f3531q2 = true;
            rz rzVar4 = this.f3529p2;
            if (this.f3541v2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f3541v2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f3541v2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f3543w2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f3543w2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f3543w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f3543w2;
            } else {
                i11 = this.f3541v2;
            }
            int paddingUnderContainer = beVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            rzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                pg.j jVar = this.J0;
                if (jVar instanceof pg.v2) {
                    AndroidUtilities.hideKeyboard(((pg.v2) jVar).getEditText());
                }
            }
            this.f3537t2 = paddingUnderContainer;
            r6Var.a();
            requestLayout();
            dh emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(bh.d, true);
            }
            if (!z10) {
                if (this.f3533r2) {
                    this.f3539u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f3537t2, 0.0f);
                    ofFloat.addUpdateListener(new w5(this, 1));
                    ofFloat.addListener(new v6(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
                    ofFloat.start();
                }
            }
        } else {
            dh emojiButton2 = o1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(bh.e, true);
            }
            rz rzVar5 = this.f3529p2;
            if (rzVar5 != null) {
                this.f3531q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    rzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f3537t2 = 0;
                r6Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(pg.q0 q0Var) {
        aa aaVar = new aa(getContext(), this.G1, this.f3512g2, new y2(3, this, q0Var));
        if (q0Var != null) {
            pg.n0 n0Var = q0Var.f40262u0;
            aaVar.f2324c0 = true;
            org.telegram.ui.Cells.i3 i3Var = aaVar.Z;
            org.telegram.ui.Cells.i3 i3Var2 = aaVar.Y;
            if (n0Var != null) {
                aaVar.f2328g0 = n0Var.d;
                aaVar.f2329h0 = false;
                i3Var2.setText(n0Var.f40169c);
                i3Var.setText(n0Var.f40168b);
                aaVar.m0 = !TextUtils.isEmpty(n0Var.f40168b);
                aaVar.f2334n0 = n0Var.f40170f;
                aaVar.f2335o0 = n0Var.e;
            } else {
                i3Var2.setText("");
                i3Var.setText("");
                aaVar.f2334n0 = true;
                aaVar.f2335o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = aaVar.f2323b0;
            dVar.g(string, false, true);
            w9 w9Var = aaVar.X;
            if (w9Var != null) {
                w9Var.N(false);
            }
            dVar.setEnabled(aaVar.V(i3Var2.getText().toString()));
            aaVar.f2324c0 = false;
        }
        aaVar.setOnDismissListener(new j6(this, 1));
        aaVar.show();
        z0(true);
    }

    public final void L0(pg.t0 t0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        yi yiVar = new yi(getContext(), new z6(this, callback2), false, true, false, this.G1);
        yiVar.Z1 = new Object();
        ai aiVar = yiVar.f29424x1;
        if (t0Var != null && (messageMedia = t0Var.f40300u0) != null && (geoPoint = messageMedia.geo) != null) {
            yiVar.f29425x2 = new double[]{geoPoint.lat, geoPoint._long};
            yiVar.O = true;
            aiVar.setVisibility(8);
        } else if (this.U1) {
            yiVar.f29417v2 = this.W1;
            yiVar.f29421w2 = this.V1;
            yiVar.O = true;
            aiVar.setVisibility(8);
        } else {
            yiVar.O = true;
            aiVar.setVisibility(8);
        }
        yiVar.setOnDismissListener(new j6(this, 0));
        yiVar.r1();
        yiVar.show();
    }

    public final void M0(pg.j jVar) {
        if (jVar instanceof pg.e1) {
            org.telegram.ui.ActionBar.p1 p1Var = this.H1;
            if (p1Var != null && p1Var.isShowing()) {
                this.H1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f3527o2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        j7 j7Var = this.R0;
        float scaleX2 = j7Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = j7Var.getScaleY() * scaleY * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        N0(new b6(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, r7 r7Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.p1 p1Var = this.H1;
        if (p1Var != null && p1Var.isShowing()) {
            this.H1.d(true);
            return;
        }
        if (this.I1 == null) {
            this.J1 = new Rect();
            p7 p7Var = new p7(this, getContext());
            this.I1 = p7Var;
            p7Var.setAnimationEnabled(true);
            this.I1.setOnTouchListener(new d6(this, 0));
            this.I1.setDispatchKeyEventListener(new e6(this));
            this.I1.setShownFromBottom(true);
        }
        p7 p7Var2 = this.I1;
        p7Var2.W = z10;
        p7Var2.d();
        runnable.run();
        if (this.H1 == null) {
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(this.I1, -2, -2);
            this.H1 = p1Var2;
            p1Var2.f18534b = true;
            p1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.H1.setOutsideTouchable(true);
            this.H1.setClippingEnabled(true);
            this.H1.setInputMethodMode(2);
            this.H1.setSoftInputMode(0);
            this.H1.getContentView().setFocusableInTouchMode(true);
            this.H1.setOnDismissListener(new f6(this, 0));
        }
        this.I1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.H1.setFocusable(true);
        int measuredWidth = i11 - (this.I1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.I1.getMeasuredHeight();
        this.H1.showAtLocation(r7Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.p1.i(this.I1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            p7 p7Var3 = this.I1;
            p7Var3.setBackgroundDrawable(new org.telegram.ui.Components.la(new org.telegram.ui.Components.ma(this.f3508e2, p7Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.I1.setBackgroundDrawable(mutate);
        this.I1.setBackgroundColor(-14145495);
    }

    public final void O0(boolean z10) {
        if (this.f3504c2 != z10) {
            if (z10 || this.Z1 != null) {
                this.f3504c2 = z10;
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
                    this.f3506d2 = true;
                    this.M1.invalidate();
                    float f10 = this.f3502b2;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.Z1.setTransitionProgress(this.f3502b2);
                    ofFloat.addUpdateListener(new w5(this, 2));
                    ofFloat.addListener(new ai.e(7, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(wr.f28820g);
                    ofFloat.start();
                    return;
                }
                if (this.Z1.getReactionsWindow() != null) {
                    this.Z1.getReactionsWindow().e();
                }
                this.Z1.animate().alpha(0.0f).setDuration(150L).setListener(new v6(this, 0)).start();
            }
        }
    }

    public final void P0(boolean z10) {
        float f7;
        if (this.f3538u1 != z10) {
            this.f3538u1 = z10;
            o1.k kVar = this.f3540v1;
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
            this.f3540v1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f14140i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f14134u = lVar;
            if (z10) {
                pg.t1 t1Var = this.f3522m1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.f3540v1.b(new i6(0, this));
            this.f3540v1.a(new u5(this, z10, 1));
            this.f3540v1.f();
        }
    }

    public final PointF Q0(pg.j jVar) {
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
                j7 j7Var = this.R0;
                if (i11 >= j7Var.getChildCount()) {
                    break;
                }
                View childAt = j7Var.getChildAt(i11);
                if (!(childAt instanceof pg.j) || (childAt instanceof pg.e1)) {
                    f7 = f11;
                } else {
                    PointF position2 = ((pg.j) childAt).getPosition();
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
        return this.O1.f2365l - this.M1.getBottomPadding2();
    }

    public final void R0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.Y0 != i10 && this.Z0 != i10) {
            ValueAnimator valueAnimator = this.f3501b1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.Y0;
            ViewGroup viewGroup3 = this.l1;
            ViewGroup viewGroup4 = this.f3519k1;
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
            og.x0 e = og.x0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f14560l != z10) {
                e.f14560l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f14552a.getInt("brush", 0), false);
                }
            }
            int c10 = og.x0.e(i12).c();
            og.v1 v1Var = this.A1;
            v1Var.f14534a = c10;
            E0(v1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f3501b1 = duration;
            duration.setInterpolator(wr.f28819f);
            this.f3501b1.addUpdateListener(new v5(this, viewGroup, viewGroup2, 0));
            this.f3501b1.addListener(new x6(this, viewGroup, viewGroup2, i10, 0));
            this.f3501b1.start();
        }
    }

    public final void S0() {
        boolean z10;
        r6 r6Var = this.O1;
        pg.o1 o1Var = this.l1;
        if (o1Var != null) {
            if (r6Var.c()) {
                o1Var.a(R.drawable.input_smile);
            } else if (this.f3531q2) {
                o1Var.a(R.drawable.input_keyboard);
            } else {
                o1Var.a(R.drawable.msg_add);
            }
        }
        if (!r6Var.c() && !this.f3531q2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.f3526o1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f3524n1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f3530q1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f3528p1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        float f7;
        pg.j jVar;
        ObjectAnimator objectAnimator = this.f3516i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        r6 r6Var = this.O1;
        if (((r6Var.c() && !r6Var.d) || this.f3537t2 > 0) && (jVar = this.J0) != null) {
            f7 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.f3516i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f3516i2.setInterpolator(wr.h);
        this.f3516i2.start();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: bi.r7.U0():void");
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
    public final void d(int i10) {
        pg.j jVar = this.J0;
        if (jVar instanceof pg.v2) {
            G0((pg.v2) jVar, i10);
            og.x0 e = og.x0.e(this.F1);
            e.f14556g = i10;
            e.f14552a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new a1.e(13, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f3523m2) {
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
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
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
        j7 j7Var = this.R0;
        int measuredWidth = j7Var.getMeasuredWidth();
        int measuredHeight = j7Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.S1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public abstract boolean f0(s sVar);

    public final void g0() {
        org.telegram.ui.Components.y5[] y5VarArr;
        boolean z10 = this.W1;
        j7 j7Var = this.R0;
        boolean z11 = true;
        if (!z10 && !this.Y1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < j7Var.getChildCount()) {
                    View childAt = j7Var.getChildAt(i10);
                    boolean z12 = childAt instanceof pg.v2;
                    int i11 = this.F1;
                    if (z12) {
                        CharSequence text = ((pg.v2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.y5 y5Var : (org.telegram.ui.Components.y5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.y5.class)) {
                                TLRPC.Document document = y5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.p5.f(i11, y5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.p5.h(i11).e(document);
                                }
                                if (r9.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i10++;
                    } else if (childAt instanceof pg.o2) {
                        TLRPC.Document sticker = ((pg.o2) childAt).getSticker();
                        if (r9.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof pg.b2) {
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
        for (int i12 = 0; i12 < j7Var.getChildCount(); i12++) {
            View childAt2 = j7Var.getChildAt(i12);
            if (childAt2 instanceof pg.j) {
                ((pg.j) childAt2).setIsVideo(z11);
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
        return this.f3511g1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.y5[] y5VarArr;
        j7 j7Var = this.R0;
        int childCount = j7Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = j7Var.getChildAt(i10);
            if (childAt instanceof pg.o2) {
                TLRPC.Document sticker = ((pg.o2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f17207id = sticker.f17201id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof pg.v2) {
                CharSequence text = ((pg.v2) childAt).getText();
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
                                tL_inputDocument2.f17207id = document.f17201id;
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

    public og.h1 getRenderView() {
        return this.O0;
    }

    public pg.j getSelectedEntity() {
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
        return this.f3505d1;
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

    public final pg.q0 i0(pg.n0 n0Var) {
        int measuredWidth;
        int i10;
        this.f3521l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        j7 j7Var = this.R0;
        if (j7Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = j7Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        pg.q0 q0Var = new pg.q0(getContext(), Q0, this.F1, n0Var, f7 / 360.0f, dp);
        if (Q0.x == j7Var.getMeasuredWidth() / 2.0f) {
            q0Var.setStickyX(2);
        }
        if (Q0.y == j7Var.getMeasuredHeight() / 2.0f) {
            q0Var.setStickyY(2);
        }
        og.v1 v1Var = this.A1;
        if (v1Var != null && (i10 = v1Var.f14534a) != -47814) {
            q0Var.setColor(i10);
        }
        q0Var.setDelegate(this);
        q0Var.setMaxWidth(dp);
        j7Var.addView(q0Var, w7.a6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            q0Var.j(1.0f / cropState.cropScale);
            q0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return q0Var;
    }

    public final pg.t0 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f3521l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        j7 j7Var = this.R0;
        if (j7Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = j7Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        pg.t0 t0Var = new pg.t0(getContext(), Q0, this.F1, messageMedia, mediaArea, f7 / 240.0f, dp);
        if (Q0.x == j7Var.getMeasuredWidth() / 2.0f) {
            t0Var.setStickyX(2);
        }
        if (Q0.y == j7Var.getMeasuredHeight() / 2.0f) {
            t0Var.setStickyY(2);
        }
        og.v1 v1Var = this.A1;
        if (v1Var != null && (i10 = v1Var.f14534a) != -47814) {
            t0Var.setColor(i10);
        }
        t0Var.setDelegate(this);
        t0Var.setMaxWidth(dp);
        j7Var.addView(t0Var, w7.a6.c(-2.0f, -2));
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
        if (this.f3523m2) {
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

    public final pg.x1 k0(String str, boolean z10) {
        float f7;
        tv0 tv0Var;
        this.f3521l2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        j7 j7Var = this.R0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.R1, j7Var.getMeasuredWidth()) * 0.5d);
            tv0Var = new tv0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, j7Var.getMeasuredHeight()) * 0.5d);
            tv0Var = new tv0(f7 * floor2, floor2);
        }
        tv0 tv0Var2 = tv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = tv0Var2.f27499a;
            tv0Var2.f27499a = tv0Var2.f27500b;
            tv0Var2.f27500b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        pg.x1 x1Var = new pg.x1(context, e02, tv0Var2, str, intValue);
        x1Var.setDelegate(this);
        j7Var.addView(x1Var);
        g0();
        return x1Var;
    }

    @Override
    public final boolean l(pg.j jVar) {
        return D0(jVar, true);
    }

    public final pg.a2 l0(boolean z10) {
        String str;
        tv0 tv0Var = new tv0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        j7 j7Var = this.R0;
        if (j7Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < j7Var.getChildCount(); i10++) {
                    View childAt = j7Var.getChildAt(i10);
                    if (v7.a7.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (j7Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (j7Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, j7Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, j7Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new pg.j(getContext(), e02);
        jVar.f39935r0 = new zh.a7(jVar);
        jVar.f39936s0 = new zh.a7(jVar);
        jVar.f39937t0 = new yg.g0(jVar);
        jVar.f39938u0 = new yg.g0(jVar);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6((View) jVar);
        jVar.f39940w0 = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6((View) jVar);
        jVar.f39941x0 = d6Var2;
        jVar.f39943z0 = 1.0f;
        jVar.f39934q0 = tv0Var;
        d6Var2.d(1.0f, true);
        d6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        yg.g0 g0Var = jVar.f39937t0;
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
        yg.p0 b10 = yg.p0.b(str);
        jVar.f39939v0 = b10;
        g0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        j7Var.addView(jVar);
        g0();
        if (z10) {
            B0(jVar);
            D0(jVar, true);
        }
        return jVar;
    }

    public final pg.b2 m0(String str, boolean z10) {
        float f7;
        this.f3521l2 = true;
        this.f3525n2 = true;
        q0();
        j7 j7Var = this.R0;
        int measuredWidth = j7Var.getMeasuredWidth();
        j7Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        tv0 tv0Var = new tv0(floor, floor);
        pg.b2 b2Var = new pg.b2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (tv0Var.f27500b / 2.0f) + AndroidUtilities.dp(72.0f)), tv0Var, str);
        b2Var.setDelegate(this);
        j7Var.addView(b2Var);
        g0();
        if (z10) {
            B0(b2Var);
            post(new q5(this, b2Var, 0));
        }
        this.f3525n2 = false;
        return b2Var;
    }

    public final c7 n0(Object obj, TLRPC.Document document) {
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
        q7 q7Var = new q7(e0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f27499a * 0.5d);
        c7 c7Var = new c7(this, context, q7Var.f3458a, q7Var.f3460c, q7Var.f3459b, new tv0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = c7Var.f40246x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        c7Var.setDelegate(this);
        this.R0.addView(c7Var);
        g0();
        return c7Var;
    }

    public final pg.v2 o0(boolean z10) {
        tv0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        pg.v2 v2Var = new pg.v2(getContext(), Q0, (int) (paintingSize.f27499a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.f27499a / 9.0f;
        c6 c6Var = new c6(this, 0);
        v2Var.f40328w0 = (int) (0.5f * f7);
        v2Var.f40329x0 = (int) (f7 * 2.0f);
        v2Var.f40330y0 = c6Var;
        float f10 = Q0.x;
        j7 j7Var = this.R0;
        if (f10 == j7Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (Q0.y == j7Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        v2Var.setTypeface(og.x0.e(i10).f14558j);
        v2Var.setType(og.x0.e(i10).h);
        j7Var.addView(v2Var, w7.a6.c(-2.0f, -2));
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
            int i11 = og.x0.e(i10).f14556g;
            pg.o1 o1Var = this.l1;
            o1Var.d(i11, true);
            o1Var.setOutlineType(og.x0.e(i10).h);
        }
        return v2Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        pk0 pk0Var = this.Z1;
        if (pk0Var != null) {
            AndroidUtilities.removeFromParent(pk0Var);
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
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.C0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f7 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f7)) > currentActionBarHeight2) {
            Math.floor((f10 * f7) / currentActionBarHeight);
        }
        float f11 = this.H0.f27499a;
        pg.j jVar = this.J0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.T0, i10, i11);
        measureChild(this.f3505d1, i10, i11);
        measureChild(this.V0, i10, i11);
        measureChild(this.U0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f3537t2 - this.M1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.S0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.G0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f3531q2 && !this.f3535s2) {
            this.G0 = true;
            w0();
            this.G0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    @Override
    public final boolean p() {
        return !(this.J0 instanceof pg.e1);
    }

    public final pg.w2 p0(df dfVar) {
        int measuredWidth;
        int i10;
        this.f3521l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        j7 j7Var = this.R0;
        if (j7Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.R1;
        } else {
            measuredWidth = j7Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int dp = ((int) f7) - AndroidUtilities.dp(58.0f);
        pg.w2 w2Var = new pg.w2(getContext(), Q0, this.F1, dfVar, f7 / 240.0f, dp);
        if (Q0.x == j7Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (Q0.y == j7Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        og.v1 v1Var = this.A1;
        if (v1Var != null && (i10 = v1Var.f14534a) != -47814) {
            w2Var.setColor(i10);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth(dp);
        j7Var.addView(w2Var, w7.a6.c(-2.0f, -2));
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
        return !this.K0;
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            j7 j7Var = this.R0;
            if (i10 < j7Var.getChildCount()) {
                View childAt = j7Var.getChildAt(i10);
                if (childAt instanceof pg.b2) {
                    if (this.J0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(wr.h).withEndAction(new q5(this, (pg.b2) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public abstract void r0();

    @Override
    public final void requestLayout() {
        if (this.G0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        if (!this.f3533r2 && !this.f3531q2) {
            this.f3521l2 = true;
            o0(true);
            return;
        }
        if (this.f3531q2) {
            pg.j jVar = this.J0;
            if (jVar instanceof pg.v2) {
                this.O1.e = true;
                AndroidUtilities.showKeyboard(((pg.v2) jVar).getEditText());
            }
        }
        J0(!this.f3531q2 ? 1 : 0);
    }

    public final pg.e1 s0() {
        int i10 = 0;
        while (true) {
            j7 j7Var = this.R0;
            if (i10 < j7Var.getChildCount()) {
                View childAt = j7Var.getChildAt(i10);
                if (childAt instanceof pg.e1) {
                    return (pg.e1) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ia iaVar) {
        this.f3508e2 = iaVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.f3523m2 != z10) {
            this.f3523m2 = z10;
            if (z10) {
                D0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j3) {
        int i10 = 0;
        while (true) {
            j7 j7Var = this.R0;
            if (i10 < j7Var.getChildCount()) {
                View childAt = j7Var.getChildAt(i10);
                if (childAt instanceof pg.o2) {
                    ImageReceiver imageReceiver = ((pg.o2) childAt).f40246x0;
                    hj0 lottieAnimation = imageReceiver.getLottieAnimation();
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

    public final android.graphics.Bitmap t0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, bi.r9 r46) {
        throw new UnsupportedOperationException("Method not decompiled: bi.r7.t0(java.util.ArrayList, boolean, boolean, boolean, boolean, bi.r9):android.graphics.Bitmap");
    }

    @Override
    public final og.x0 u() {
        return og.x0.e(this.F1);
    }

    public final boolean u0() {
        if (!this.D0.a() && !this.f3521l2) {
            return false;
        }
        return true;
    }

    public final void v0(boolean z10) {
        if (this.f3531q2) {
            J0(0);
        }
        if (z10) {
            rz rzVar = this.f3529p2;
            if (rzVar != null && rzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f3529p2.getMeasuredHeight());
                ofFloat.addUpdateListener(new w5(this, 0));
                this.f3535s2 = true;
                ofFloat.addListener(new v6(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
                ofFloat.start();
                return;
            }
            w0();
        }
    }

    public final void w0() {
        rz rzVar;
        if (!this.f3531q2 && (rzVar = this.f3529p2) != null && rzVar.getVisibility() != 8) {
            this.f3529p2.setVisibility(8);
        }
        int i10 = this.f3537t2;
        this.f3537t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    @Override
    public final void x() {
        N0(new c6(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean y0() {
        if (this.f3504c2) {
            if (this.Z1.getReactionsWindow() != null && !this.Z1.getReactionsWindow().f46963q) {
                this.Z1.e();
                return true;
            }
            O0(false);
            return true;
        } else if (this.B1) {
            I0(false);
            return true;
        } else if (this.f3531q2) {
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
    public final int[] z(pg.j jVar) {
        int[] iArr = this.f3527o2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public abstract void z0(boolean z10);

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f7) {
    }
}
