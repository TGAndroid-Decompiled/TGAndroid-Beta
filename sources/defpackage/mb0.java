package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class mb0 extends d {
    public static final int[][] d0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] e0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public a I;
    public q31 J;
    public ib0 K;
    public ra1 L;
    public boolean M;
    public ValueAnimator N;
    public float O;
    public final Paint P;
    public int Q;
    public boolean R;
    public r7 S;
    public ya0 T;
    public final ul5 U;
    public boolean V;
    public TextView W;
    public TextView X;
    public final wl5 Y;
    public hb0 Z;
    public db0 a;
    public boolean a0;
    public fb0 b;
    public float b0;
    public int c;
    public ValueAnimator c0;
    public int d;
    public View e;
    public boolean f;
    public boolean h;
    public boolean n;
    public pkb r;
    public CharSequence s;
    public SpannableStringBuilder w;
    public boolean x;
    public u41 y;

    public mb0(wl5 wl5Var, ul5 ul5Var) {
        super(null);
        this.P = new Paint();
        this.R = true;
        this.a0 = false;
        this.b0 = 0.0f;
        this.Y = wl5Var;
        this.U = ul5Var;
    }

    @Override
    public final View createView(Context context) {
        String M0;
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        a aVar = this.actionBar;
        int i = bkb.F6;
        zkb.l(aVar, 5, i, null);
        zkb.l(this.actionBar, 1, i, null);
        zkb.l(this.actionBar, 3, bkb.h6, null);
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(k96.M0(2131747087, null));
        this.actionBar.setActionBarMenuOnItemClick(new bb0(this, (byte) 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        a aVar2 = new a(getParentActivity(), null);
        this.I = aVar2;
        aVar2.setCastShadows(false);
        this.I.setAddToContainer(false);
        this.I.setOccupyStatusBar(true);
        this.I.setClipChildren(false);
        int o = bm2.o(-1, 60);
        this.I.H(-1, false);
        this.I.setBackButtonDrawable(new ed0(false));
        this.I.setAllowOverlayTitle(false);
        this.I.G(o, false);
        r6 t = this.I.t();
        t.setClipChildren(false);
        ul5 ul5Var = this.U;
        if (ul5Var != null && ul5Var.c == 2) {
            M0 = k96.M0(2131744167, null);
        } else {
            M0 = k96.M0(2131745327, null);
        }
        r7 e = t.e(1, M0);
        this.S = e;
        e.setBackground(bkb.f0(o, 3, -1));
        this.I.setActionBarMenuOnItemClick(new bb0(this, (byte) 1));
        this.r = new pkb((byte) 2, getParentActivity(), this);
        cb0 cb0Var = new cb0(this, context);
        cb0Var.setFitsSystemWindows(true);
        zkb.h(bkb.Z6, null, cb0Var);
        this.r.setClipChildren(false);
        this.r.setClipToPadding(false);
        this.r.setPadding(0, gl.m, 0, 0);
        this.r.setOrientation(1);
        pkb pkbVar = this.r;
        db0 db0Var = new db0(this, getParentActivity(), cb0Var);
        this.a = db0Var;
        pkbVar.addView(db0Var);
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setText(k96.M0(2131752127, null));
        TextView textView2 = this.X;
        int i2 = bkb.x6;
        zkb.X(textView2, i2, null);
        this.X.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.r.addView(this.X, nme.t(-1, -2, 0, 21, 10, 21, 10));
        eb0 eb0Var = new eb0(this, getParentActivity());
        ib0 ib0Var = new ib0(this, getParentActivity());
        this.K = ib0Var;
        eb0Var.addView(ib0Var);
        this.r.addView(eb0Var, nme.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.W = textView3;
        textView3.setText(k96.M0(2131752119, null));
        zkb.X(this.W, i2, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.r.addView(this.W, nme.t(-1, -2, 0, 21, 18, 21, 10));
        fb0 fb0Var = new fb0(this, this, getParentActivity(), getThemedColor(i));
        this.b = fb0Var;
        fb0Var.S = true;
        fb0Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.b.setClipChildren(false);
        this.r.addView(this.b, nme.t(-1, -1, 0, 12, 0, 12, 12));
        this.r.setClipChildren(false);
        cb0Var.addView(this.r, nme.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        u41 u41Var = new u41(this.resourceProvider, context, true);
        this.y = u41Var;
        u41Var.f();
        this.y.d.r(false, false);
        byte b = this.Y.W;
        if (b == 1) {
            this.s = k96.M0(2131745347, null);
        } else if (b == 3) {
            this.s = k96.M0(2131745344, null);
        } else if (b == 2) {
            this.s = k96.M0(2131745333, null);
        } else if (ul5Var != null && ul5Var.c == 2) {
            this.s = k96.M0(2131744167, null);
        } else {
            this.s = k96.M0(2131745331, null);
        }
        this.s = new SpannableStringBuilder(this.s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new cm2(2131232247, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.w = spannableStringBuilder;
        this.x = false;
        this.y.i(this.s, false, true);
        this.y.setOnClickListener(new j1(this, (byte) 14));
        this.E = new FrameLayout(context);
        cb0Var.addView(this.y, nme.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        cb0Var.addView(this.E, nme.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        cb0Var.addView(this.actionBar);
        cb0Var.addView(this.I);
        cb0Var.addView(this.e, nme.c(-1.0f, -1));
        ra1 ra1Var = new ra1(cb0Var);
        this.L = ra1Var;
        ra1Var.h = new wa0(this, (byte) 0);
        this.fragmentView = cb0Var;
        return cb0Var;
    }

    public final void g0() {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.H.cancel();
            this.H = null;
        }
    }

    public final void h0() {
        if (getParentActivity() == null) {
            return;
        }
        if (this.n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131747085, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.U = M0;
            hdVar.S = k96.M0(2131751393, null);
            alertDialog$Builder.j(k96.M0(2131747387, null), new xa0(this, (byte) 1));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            showDialog(hdVar);
            hdVar.h();
            return;
        }
        finishFragment();
    }

    public final boolean i0() {
        if (y6c.h(this.currentAccount).p()) {
            return false;
        }
        db0 db0Var = this.a;
        hb0 hb0Var = db0Var.h;
        if ((hb0Var == null || !hb0Var.b) && !db0Var.n) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb0.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        int i;
        File file;
        jm6 jm6Var;
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().C()) {
            if (i0()) {
                new u21(this.E, this.resourceProvider).Q(2131624211, 36, gl.N2(k96.M0(2131746874, null), -1, 2, new wa0(this, (byte) 1), null)).j();
                return;
            }
            q31 q31Var = this.J;
            if (q31Var != null) {
                db0 db0Var = this.a;
                hb0 hb0Var = db0Var.h;
                long j = db0Var.a;
                TLRPC.Document document = db0Var.b;
                mb0 mb0Var = (mb0) q31Var.c;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                x02 x02Var = ((ChatAttachAlertPhotoLayout) q31Var.b).b;
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                Bitmap createBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                kz4 kz4Var = new kz4();
                if (hb0Var != null) {
                    i = 0;
                    kz4Var.d(hb0Var.c, hb0Var.d, hb0Var.e, hb0Var.f);
                } else {
                    i = 0;
                    int[] iArr = d0[0];
                    kz4Var.d(iArr[0], iArr[1], iArr[2], iArr[3]);
                }
                kz4Var.b(0.0f, 0.0f, 800.0f, 800.0f);
                canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, kz4Var.c);
                File z2 = ba4.z(4);
                StringBuilder sb = new StringBuilder();
                byte b = 4;
                sb.append(gba.p());
                sb.append("avatar_background.png");
                File file2 = new File(z2, sb.toString());
                try {
                    file2.createNewFile();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.PNG, i, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(byteArray);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ImageReceiver imageReceiver = db0Var.getImageReceiver();
                if (imageReceiver.m() != null) {
                    Bitmap p = imageReceiver.m().p();
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.f0(p);
                    imageReceiver2.i0(120.0f, 120.0f, 560.0f, 560.0f);
                    imageReceiver2.q0(72);
                    imageReceiver2.h(canvas, null);
                    imageReceiver2.f();
                    p.recycle();
                    file = file2;
                } else {
                    if (imageReceiver.y() != null) {
                        file = file2;
                        imageReceiver.y().I(0, false, true);
                    } else {
                        file = file2;
                    }
                    imageReceiver.i0(120.0f, 120.0f, 560.0f, 560.0f);
                    imageReceiver.q0(72);
                    imageReceiver.h(canvas, null);
                }
                File file3 = new File(ba4.z(4), gba.p() + "avatar_background.png");
                try {
                    file3.createNewFile();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                    fileOutputStream2.write(byteArray2);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                if (db0Var.getImageReceiver().m() == null && db0Var.getImageReceiver().y() == null) {
                    jm6Var = new jm6(0, file3.getPath(), 0, false, 0, 0);
                } else {
                    jm6Var = new jm6(0, file.getPath(), 0, false, 0, 0);
                    jm6Var.c = file3.getPath();
                    if (db0Var.a != 0) {
                        TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                        tL_videoSizeEmojiMarkup.emoji_id = db0Var.a;
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(db0Var.h.c));
                        int i2 = db0Var.h.d;
                        if (i2 != 0) {
                            tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i2));
                        }
                        int i3 = db0Var.h.e;
                        if (i3 != 0) {
                            tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i3));
                        }
                        int i4 = db0Var.h.f;
                        if (i4 != 0) {
                            tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i4));
                        }
                        jm6Var.S = tL_videoSizeEmojiMarkup;
                    } else if (db0Var.b != null) {
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                        TLRPC.Document document2 = db0Var.b;
                        tL_videoSizeStickerMarkup.sticker_id = document2.id;
                        tL_videoSizeStickerMarkup.stickerset = k27.i1(document2);
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(db0Var.h.c));
                        int i5 = db0Var.h.d;
                        if (i5 != 0) {
                            tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i5));
                        }
                        int i6 = db0Var.h.e;
                        if (i6 != 0) {
                            tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i6));
                        }
                        int i7 = db0Var.h.f;
                        if (i7 != 0) {
                            tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i7));
                        }
                        jm6Var.S = tL_videoSizeStickerMarkup;
                    }
                    oac oacVar = new oac();
                    jm6Var.s = oacVar;
                    oacVar.o = file.getPath();
                    oac oacVar2 = jm6Var.s;
                    oacVar2.k = 800;
                    oacVar2.l = 800;
                    oacVar2.h = 800;
                    oacVar2.i = 800;
                    oacVar2.I = true;
                    oacVar2.m = -1;
                    oacVar2.t = true;
                    oacVar2.a = 0L;
                    oacVar2.d = 0.0f;
                    oacVar2.b = db0Var.getDuration();
                    oac oacVar3 = jm6Var.s;
                    oacVar3.n = 30;
                    oacVar3.c = 0L;
                    long j2 = oacVar3.b;
                    oacVar3.q = (int) ((((float) j2) / 1000.0f) * 115200.0f);
                    oacVar3.r = j2;
                    mac macVar = new mac();
                    macVar.a = (byte) 0;
                    if (document == null) {
                        document = vl.e(y6c.t0, j);
                    }
                    if (document != null) {
                        macVar.q = 560;
                        macVar.r = 560;
                        macVar.f = 0.7f;
                        macVar.g = 0.7f;
                        macVar.c = 0.15f;
                        macVar.d = 0.15f;
                        macVar.B = document;
                        macVar.C = null;
                        ba4.G(y6c.t0);
                        macVar.j = ba4.J(document, null, true, true).getAbsolutePath();
                        macVar.s = 0.13f;
                        if (k27.K2(document, true) || k27.N4(document)) {
                            boolean K2 = k27.K2(document, true);
                            byte b2 = macVar.b;
                            if (K2) {
                                b = 1;
                            }
                            macVar.b = (byte) (b2 | b);
                        }
                        if (k27.B4(document)) {
                            macVar.l = -1;
                            macVar.b = (byte) (macVar.b | 8);
                        }
                        jm6Var.s.G = new ArrayList();
                        jm6Var.s.G.add(macVar);
                    }
                }
                hashMap.put(-1, jm6Var);
                ChatAttachAlertPhotoLayout.u1.add(-1);
                x02Var.W3.B1(7, true, false, 0, 0, 0L, x02Var.a1(), false, 0L);
                if (!mb0Var.R) {
                    d dVar = x02Var.Z1;
                    if (dVar != null) {
                        dVar.removeSelfFromStack();
                    }
                    mb0Var.finishFragment();
                }
            }
            if (this.R) {
                finishFragment();
            }
        }
    }

    public final void k0(boolean z, boolean z2, boolean z3) {
        float f;
        if (this.V) {
            return;
        }
        g0();
        float f2 = this.F;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.H = ValueAnimator.ofFloat(f2, f);
        if (z2) {
            this.a.x = this.F;
            kk7.e().k(kk7.t4, new Object[0]);
        }
        this.H.addUpdateListener(new d20((byte) 1, this, z2));
        this.H.addListener(new x5(this, z, z2, (byte) 2));
        ValueAnimator valueAnimator = this.H;
        if (z3) {
            valueAnimator.setInterpolator(s33.h);
            this.H.setDuration(350L);
            this.H.setStartDelay(150L);
        } else {
            valueAnimator.setInterpolator(s33.f);
            this.H.setDuration(250L);
        }
        this.H.start();
    }

    public final void l0(boolean z, long j, TLRPC.Document document) {
        db0 db0Var = this.a;
        db0Var.a = j;
        db0Var.b = document;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        kb0 kb0Var = db0Var.c;
        if (i == 0) {
            kb0Var.setAnimatedEmojiDrawable(null);
            this.a.c.getImageReceiver().Z(gl5.b(document), "100_100", null, null, uo3.f(document, bkb.l6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            kb0Var.setAnimatedEmojiDrawable(new vl(14, this.currentAccount, j));
            this.a.c.getImageReceiver().f();
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().m() != null) {
            this.a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().y() != null) {
            this.a.getImageReceiver().y().I(0, false, true);
        }
        this.n = true;
        r0();
    }

    public final void m0(boolean z, float f) {
        boolean z2;
        this.F = f;
        float f2 = ((this.d - this.c) - gl.m) * f;
        if (this.O == 0.0f) {
            this.r.setTranslationY(f2);
            this.y.setTranslationY(f2);
        }
        this.a.setTranslationY(((-(this.d - this.c)) / 2.0f) * f);
        this.fragmentView.invalidate();
        if (z) {
            db0 db0Var = this.a;
            if (f > 0.5f) {
                z2 = true;
            } else {
                z2 = false;
            }
            db0Var.setExpanded(z2);
        }
    }

    public final void n0(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            int f2 = bm2.f(f, -16777216, -1);
            int o = bm2.o(f2, 60);
            this.I.H(f2, false);
            this.S.setBackground(bkb.f0(o, 3, -1));
        }
    }

    public final void o0(long j) {
        db0 db0Var = this.a;
        if (db0Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = d0[0];
        obj.c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f = iArr[3];
        db0Var.b(obj, false);
        r0();
        db0 db0Var2 = this.a;
        db0Var2.a = j;
        db0Var2.c.setAnimatedEmojiDrawable(new vl(14, this.currentAccount, j));
        this.K.z1(obj);
        this.b.setForUser(false);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.n) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131747085, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.U = M0;
                hdVar.S = k96.M0(2131751393, null);
                alertDialog$Builder.j(k96.M0(2131747387, null), new xa0(this, (byte) 0));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                showDialog(hdVar);
                hdVar.h();
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onResume() {
        super.onResume();
        gl.V2(getParentActivity(), getClassGuid());
    }

    public final void p0(ob0 ob0Var) {
        hb0 backgroundGradient = ob0Var.getBackgroundGradient();
        db0 db0Var = this.a;
        if (db0Var == null) {
            return;
        }
        db0Var.b(backgroundGradient, false);
        r0();
        if (ob0Var.getAnimatedEmoji() != null) {
            long h = ob0Var.getAnimatedEmoji().h();
            db0 db0Var2 = this.a;
            db0Var2.a = h;
            db0Var2.c.setAnimatedEmojiDrawable(new vl(14, this.currentAccount, h));
        }
        this.K.z1(backgroundGradient);
        this.b.setForUser(false);
    }

    public final void q0(TLRPC.VideoSize videoSize) {
        int i;
        int i2;
        int i3;
        ?? obj = new Object();
        obj.c = bm2.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i = bm2.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i = 0;
        }
        obj.d = i;
        if (videoSize.background_colors.size() > 2) {
            i2 = bm2.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i2 = 0;
        }
        obj.e = i2;
        if (videoSize.background_colors.size() > 3) {
            i3 = bm2.o(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i3 = 0;
        }
        obj.f = i3;
        this.a.b(obj, false);
        r0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            l0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet n0 = hq6.d0(this.currentAccount).n0(tL_videoSizeStickerMarkup.stickerset, false);
            if (n0 != null) {
                for (int i4 = 0; i4 < n0.documents.size(); i4++) {
                    if (n0.documents.get(i4).id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = n0.documents.get(i4);
                    }
                }
            }
            l0(false, 0L, document);
        }
        this.K.z1(obj);
        this.b.setForUser(true);
    }

    public final void r0() {
        CharSequence charSequence;
        boolean i0 = i0();
        if (this.x != i0) {
            u41 u41Var = this.y;
            this.x = i0;
            if (i0) {
                charSequence = this.w;
            } else {
                charSequence = this.s;
            }
            u41Var.i(charSequence, true, true);
        }
    }
}
