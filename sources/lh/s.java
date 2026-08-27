package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.zu0;

public abstract class s extends m {
    public static final int[] M1 = {21600, 43200, 86400, 172800};
    public float A1;
    public float B1;
    public final org.telegram.ui.Components.y5 C1;
    public final org.telegram.ui.Components.y5 D1;
    public final org.telegram.ui.Components.y5 E1;
    public final org.telegram.ui.Components.y5 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public final n L1;
    public final ImageView O0;
    public final ImageView P0;
    public final l Q0;
    public b70 R0;
    public boolean S0;
    public int T0;
    public Drawable U0;
    public boolean V0;
    public final r W0;
    public final org.telegram.ui.Components.i6 X0;
    public float Y0;
    public float Z0;

    public long f16688a1;

    public final Paint f16689b1;

    public final Paint f16690c1;

    public final org.telegram.ui.Components.s9 f16691d1;

    public final org.telegram.ui.Components.s9 f16692e1;

    public final Drawable f16693f1;

    public float f16694g1;

    public final org.telegram.ui.Components.y5 f16695h1;

    public final Path f16696i1;

    public final Path f16697j1;

    public final Paint f16698k1;
    public final Paint l1;

    public final Paint f16699m1;

    public final Paint f16700n1;

    public final org.telegram.ui.Components.y5 f16701o1;

    public final RectF f16702p1;

    public final RectF f16703q1;

    public final RectF f16704r1;

    public final Path f16705s1;

    public pz0 f16706t1;

    public Path f16707u1;

    public Paint f16708v1;

    public pz0 f16709w1;

    public Utilities.Callback f16710x1;

    public Utilities.Callback f16711y1;

    public q f16712z1;

    public s(Context context, FrameLayout frameLayout, zu0 zu0Var, FrameLayout frameLayout2, jh.b bVar, org.telegram.ui.Components.z9 z9Var) {
        super(context, frameLayout, zu0Var, frameLayout2, bVar, z9Var);
        this.S0 = true;
        this.T0 = 0;
        ib ibVar = (ib) this;
        this.W0 = new r(ibVar, ibVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.X0 = i6Var;
        er erVar = er.f28122f;
        i6Var.k(0.16f, 50L, erVar);
        i6Var.t(AndroidUtilities.dp(15.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.q("0:00.0", true, true);
        i6Var.r(-1);
        Paint paint = new Paint(1);
        this.f16689b1 = paint;
        Paint paint2 = new Paint(1);
        this.f16690c1 = paint2;
        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(11, 360928);
        this.f16691d1 = s9Var;
        org.telegram.ui.Components.s9 s9Var2 = new org.telegram.ui.Components.s9(12, 360928);
        this.f16692e1 = s9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        s9Var.f32356a = AndroidUtilities.dp(47.0f);
        s9Var.f32357b = AndroidUtilities.dp(55.0f);
        s9Var.b();
        s9Var2.f32356a = AndroidUtilities.dp(47.0f);
        s9Var2.f32357b = AndroidUtilities.dp(55.0f);
        s9Var2.b();
        this.f16693f1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.f16695h1 = new org.telegram.ui.Components.y5(new n(ibVar, 0), 200L, erVar, 0);
        this.f16696i1 = new Path();
        this.f16697j1 = new Path();
        this.f16698k1 = new Paint(1);
        this.l1 = new Paint(1);
        this.f16699m1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f16700n1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(ibVar, 0);
        er erVar2 = er.h;
        this.f16701o1 = new org.telegram.ui.Components.y5(nVar, 350L, erVar2);
        this.f16702p1 = new RectF();
        this.f16703q1 = new RectF();
        this.f16704r1 = new RectF();
        this.f16705s1 = new Path();
        this.C1 = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar2);
        this.D1 = new org.telegram.ui.Components.y5(new n(ibVar, 0), 420L, erVar2, 0);
        this.E1 = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar2);
        this.F1 = new org.telegram.ui.Components.y5(new n(ibVar, 0), 350L, erVar2, 0);
        this.L1 = new n(ibVar, 1);
        ImageView imageView = new ImageView(context);
        this.O0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, h7.z5.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new ag.w0(ibVar, 28));
        ImageView imageView2 = new ImageView(context);
        this.P0 = imageView2;
        l lVar = new l(5);
        this.Q0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, h7.z5.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new gg.f(ibVar, frameLayout, bVar, 13));
    }

    public final void A(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                i11 = 2;
                break;
            } else if (M1[i11] == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (this.T0 == i11) {
            return;
        }
        this.T0 = i11;
        this.Q0.d(i10 / 3600, false, z10);
    }

    public final void B() {
        if (this.V0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f16329a);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new p(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, this.f16329a));
            }
        }
    }

    @Override
    public final int b() {
        return 36;
    }

    @Override
    public final void c(boolean z10) {
        int i10 = (z10 || !this.S0) ? 8 : 0;
        ImageView imageView = this.P0;
        imageView.setVisibility(i10);
        this.O0.setVisibility(z10 ? 8 : 0);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z10) {
        if (z10) {
            return;
        }
        this.P0.setVisibility(this.S0 ? 0 : 8);
        this.O0.setVisibility(0);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action;
        r rVar;
        n nVar;
        boolean z10;
        ib ibVar;
        boolean zIsCameraAllowed;
        sb sbVar;
        boolean zD;
        q qVar;
        hb hbVar;
        cc ccVar;
        q qVar2;
        Drawable drawable;
        if (!this.K1 || (qVar2 = this.f16712z1) == null || qVar2.f15860a == null || (drawable = this.U0) == null) {
            RectF rectF = AndroidUtilities.rectTmp;
            ImageView imageView = this.O0;
            rectF.set(imageView.getX(), imageView.getY(), imageView.getX() + imageView.getMeasuredWidth(), imageView.getY() + imageView.getMeasuredHeight());
            if (this.J1 && (this.V0 || this.f16345l0 || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                if (this.K1 && this.I1) {
                    if (this.f16703q1.contains(motionEvent.getX(), motionEvent.getY())) {
                        z(false, true);
                        this.J1 = false;
                        return true;
                    }
                }
                if (this.K1) {
                    if (this.f16702p1.contains(motionEvent.getX(), motionEvent.getY()) || getBounds().contains(motionEvent.getX(), motionEvent.getY())) {
                        z(false, false);
                        this.J1 = false;
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }
            action = motionEvent.getAction();
            rVar = this.W0;
            nVar = this.L1;
            if (action == 0) {
                if (motionEvent.getAction() == 2) {
                    if (!this.G1) {
                        this.Y0 = Utilities.clamp((this.A1 - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                        float fClamp = Utilities.clamp((this.B1 - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                        this.Z0 = fClamp;
                        z10 = this.I1;
                        if (z10 && !this.G1 && this.Y0 >= 1.0f) {
                            this.G1 = true;
                            this.K1 = false;
                            imageView.setVisibility(4);
                            this.P0.setVisibility(4);
                            rVar.f16614g = true;
                            oi0 oi0Var = rVar.h;
                            oi0Var.Q(0.0f, true);
                            if (rVar.f16613f) {
                                oi0Var.start();
                            }
                            q qVar3 = this.f16712z1;
                            if (qVar3 != null) {
                                qVar3.f15869x = true;
                                AndroidUtilities.cancelRunOnUIThread(qVar3.h);
                                CameraController.getInstance().stopVideoRecording(qVar3.f15860a.getCameraSessionRecording(), false, false);
                                qVar3.a(false);
                            }
                            AndroidUtilities.runOnUIThread(nVar, 800L);
                        } else if (!z10 && !this.G1 && fClamp >= 1.0f && this.Y0 < 0.4f) {
                            this.I1 = true;
                            try {
                                performHapticFeedback(3, 1);
                            } catch (Exception unused) {
                            }
                        }
                        invalidate();
                        n();
                    }
                } else if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    if (!this.G1 && !this.I1) {
                        z(false, false);
                    }
                    this.J1 = false;
                }
                return this.J1;
            }
            if (this.K1) {
                this.J1 = false;
                z(false, false);
                return true;
            }
            this.J1 = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            ibVar = (ib) this;
            zIsCameraAllowed = CameraView.isCameraAllowed();
            sbVar = ibVar.O1;
            if (zIsCameraAllowed) {
                zD = sb.d(sbVar);
            } else {
                zD = false;
            }
            if (zD) {
                AndroidUtilities.cancelRunOnUIThread(nVar);
                this.A1 = motionEvent.getX();
                this.B1 = motionEvent.getY();
                this.f16694g1 = 0.0f;
                this.Y0 = 0.0f;
                this.C1.d(0.0f, true);
                this.D1.d(0.0f, true);
                this.G1 = false;
                this.H1 = false;
                this.I1 = false;
                rVar.f16614g = false;
                oi0 oi0Var2 = rVar.h;
                oi0Var2.stop();
                oi0Var2.Q(0.0f, true);
                this.K1 = true;
                this.f16688a1 = System.currentTimeMillis();
                this.G0 = true;
                this.H0 = Integer.MAX_VALUE;
                invalidate();
                n();
                q qVar4 = new q(this, getContext());
                this.f16712z1 = qVar4;
                qVar = sbVar.f16781m1;
                if (qVar != null) {
                    qVar.a(true);
                }
                hbVar = sbVar.T0;
                if (hbVar != null) {
                    hbVar.K = true;
                    hbVar.c();
                    hb hbVar2 = sbVar.T0;
                    hbVar2.m(0L);
                    ccVar = hbVar2.B;
                    if (ccVar != null) {
                        ccVar.setProgress(0L);
                    }
                }
                qVar4.f15865n = new jh.z(1, ibVar, qVar4);
                qVar4.f15866r = new n(ibVar, 2);
                fb fbVar = sbVar.f16753d0;
                sbVar.f16781m1 = qVar4;
                fbVar.addView(qVar4, h7.z5.c(-1.0f, -1));
                return true;
            }
        } else {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(drawable.getBounds());
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
            for (int i10 = 0; i10 < motionEvent.getPointerCount(); i10++) {
                if (AndroidUtilities.rectTmp.contains(motionEvent.getX(i10), motionEvent.getY(i10))) {
                    if (motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5) {
                        this.f16712z1.f15860a.switchCamera();
                        Drawable drawable2 = this.U0;
                        if (drawable2 instanceof AnimatedVectorDrawable) {
                            ((AnimatedVectorDrawable) drawable2).start();
                        }
                    }
                    if (this.J1) {
                        break;
                    }
                }
            }
            RectF rectF3 = AndroidUtilities.rectTmp;
            ImageView imageView2 = this.O0;
            rectF3.set(imageView2.getX(), imageView2.getY(), imageView2.getX() + imageView2.getMeasuredWidth(), imageView2.getY() + imageView2.getMeasuredHeight());
            if (this.J1) {
            }
            action = motionEvent.getAction();
            rVar = this.W0;
            nVar = this.L1;
            if (action == 0) {
                if (motionEvent.getAction() == 2) {
                    if (!this.G1) {
                        this.Y0 = Utilities.clamp((this.A1 - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                        float fClamp2 = Utilities.clamp((this.B1 - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                        this.Z0 = fClamp2;
                        z10 = this.I1;
                        if (z10) {
                            if (!z10) {
                                this.I1 = true;
                                performHapticFeedback(3, 1);
                            }
                        } else if (!z10) {
                            this.I1 = true;
                            performHapticFeedback(3, 1);
                        }
                        invalidate();
                        n();
                    }
                } else if (motionEvent.getAction() != 1) {
                    if (!this.G1) {
                        z(false, false);
                    }
                    this.J1 = false;
                } else {
                    if (!this.G1) {
                        z(false, false);
                    }
                    this.J1 = false;
                }
                return this.J1;
            }
            if (this.K1) {
                this.J1 = false;
                z(false, false);
                return true;
            }
            this.J1 = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            ibVar = (ib) this;
            zIsCameraAllowed = CameraView.isCameraAllowed();
            sbVar = ibVar.O1;
            if (zIsCameraAllowed) {
                zD = false;
            } else {
                zD = sb.d(sbVar);
            }
            if (zD) {
                AndroidUtilities.cancelRunOnUIThread(nVar);
                this.A1 = motionEvent.getX();
                this.B1 = motionEvent.getY();
                this.f16694g1 = 0.0f;
                this.Y0 = 0.0f;
                this.C1.d(0.0f, true);
                this.D1.d(0.0f, true);
                this.G1 = false;
                this.H1 = false;
                this.I1 = false;
                rVar.f16614g = false;
                oi0 oi0Var3 = rVar.h;
                oi0Var3.stop();
                oi0Var3.Q(0.0f, true);
                this.K1 = true;
                this.f16688a1 = System.currentTimeMillis();
                this.G0 = true;
                this.H0 = Integer.MAX_VALUE;
                invalidate();
                n();
                q qVar5 = new q(this, getContext());
                this.f16712z1 = qVar5;
                qVar = sbVar.f16781m1;
                if (qVar != null) {
                    qVar.a(true);
                }
                hbVar = sbVar.T0;
                if (hbVar != null) {
                    hbVar.K = true;
                    hbVar.c();
                    hb hbVar3 = sbVar.T0;
                    hbVar3.m(0L);
                    ccVar = hbVar3.B;
                    if (ccVar != null) {
                        ccVar.setProgress(0L);
                    }
                }
                qVar5.f15865n = new jh.z(1, ibVar, qVar5);
                qVar5.f15866r = new n(ibVar, 2);
                fb fbVar2 = sbVar.f16753d0;
                sbVar.f16781m1 = qVar5;
                fbVar2.addView(qVar5, h7.z5.c(-1.0f, -1));
                return true;
            }
        }
        return true;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.Q).storyCaptionLengthLimitDefault;
    }

    @Override
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.Q).storyCaptionLengthLimitPremium;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override
    public final void j(Canvas canvas, RectF rectF) {
        Paint paint;
        float f10;
        float f11;
        float f12;
        float f13;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (this.f16712z1 != null) {
            float fE = this.C1.e(this.G1);
            float fE2 = this.E1.e(this.I1);
            if (this.f16688a1 <= 0) {
                this.f16688a1 = System.currentTimeMillis();
            }
            float fSin = (((float) Math.sin(((double) ((System.currentTimeMillis() - this.f16688a1) / 900.0f)) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float fDp = rectF.left + AndroidUtilities.dp(21.0f);
            float fDp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            int iDp = (int) (fDp - AndroidUtilities.dp(12.0f));
            int iDp2 = (int) (fDp2 - AndroidUtilities.dp(12.0f));
            int iDp3 = (int) (fDp + AndroidUtilities.dp(12.0f));
            int iDp4 = (int) (fDp2 + AndroidUtilities.dp(12.0f));
            r rVar = this.W0;
            rVar.setBounds(iDp, iDp2, iDp3, iDp4);
            rVar.draw(canvas3);
            int iDp5 = (int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * fE));
            int iDp6 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f));
            int iDp7 = (int) (rectF.left + AndroidUtilities.dp(133.3f));
            int iDp8 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.i6 i6Var = this.X0;
            i6Var.setBounds(iDp5, iDp6, iDp7, iDp8);
            long jB = this.f16712z1.b();
            int i10 = (int) (jB / 1000);
            int i11 = (int) ((jB - ((long) (i10 * 1000))) / 100);
            int i12 = i10 / 60;
            int i13 = i10 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(":");
            sb2.append(i13 < 10 ? "0" : "");
            sb2.append(i13);
            sb2.append(".");
            sb2.append(i11);
            i6Var.q(sb2.toString(), true, true);
            i6Var.f29257w = (int) ((1.0f - fE) * 255.0f);
            i6Var.draw(canvas3);
            float f14 = 1.0f - fE2;
            float f15 = (1.0f - this.Y0) * f14;
            Paint paintC = this.L.c(1.0f);
            if (paintC != null) {
                paint = paintC;
                f10 = 10.0f;
                f11 = 12.0f;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                paint = paintC;
                f10 = 10.0f;
                f11 = 12.0f;
            }
            if (f15 > 0.0f) {
                if (this.f16706t1 == null) {
                    this.f16706t1 = new pz0(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.f16707u1 == null) {
                    Path path = new Path();
                    this.f16707u1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.f16707u1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.f16707u1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f10));
                    Paint paint2 = new Paint(1);
                    this.f16708v1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f16708v1.setStrokeCap(Paint.Cap.ROUND);
                    this.f16708v1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f16708v1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.f16706t1.f31708p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - i6Var.d());
                float fB = org.telegram.ui.Cells.pa.b(1.0f, this.Y0, AndroidUtilities.dp(6.0f) * fSin, (rectF.centerX() - ((this.f16706t1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.Y0, 1.0f, fE2) * (rectF.width() / 6.0f)));
                int iL1 = org.telegram.ui.ActionBar.g6.l1(f15, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(fB, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.f16708v1.setColor(iL1);
                canvas3.drawPath(this.f16707u1, this.f16708v1);
                canvas3.restore();
                f12 = 15.0f;
                f13 = 0.0f;
                this.f16706t1.c(fB + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, iL1, canvas3);
            } else {
                f12 = 15.0f;
                f13 = 0.0f;
            }
            if (fE2 > f13) {
                if (this.f16709w1 == null) {
                    this.f16709w1 = new pz0(LocaleController.getString(R.string.CancelRound), f12, AndroidUtilities.bold());
                }
                this.f16709w1.f31708p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - i6Var.d());
                float fWidth = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.f16709w1.l() / 2.0f));
                canvas2 = canvas;
                this.f16709w1.c(fWidth, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.g6.l1(fE2, paint != null ? -1 : -2130706433), canvas2);
                this.f16703q1.set(fWidth - AndroidUtilities.dp(f11), rectF.top, this.f16709w1.l() + fWidth + AndroidUtilities.dp(f11), rectF.bottom);
            } else {
                canvas2 = canvas;
            }
            if (paint != null) {
                canvas2.drawRect(rectF, paint);
                canvas2.restore();
            }
            invalidate();
        }
    }

    @Override
    public final void k(Canvas canvas, RectF rectF, float f10) {
        float f11;
        if (f10 <= 0.0f) {
            return;
        }
        boolean z10 = this.G1;
        org.telegram.ui.Components.y5 y5Var = this.D1;
        float fE = y5Var.e(z10);
        boolean z11 = this.I1;
        org.telegram.ui.Components.y5 y5Var2 = this.F1;
        float fE2 = y5Var2.e(z11);
        float fD = this.f16695h1.d(this.f16694g1, false);
        float f12 = 1.0f - fE;
        float fZ = com.google.android.recaptcha.internal.a.z(1.0f, this.Y0, AndroidUtilities.dp(30.0f) * fD, AndroidUtilities.dp(41.0f)) * f12 * f10;
        float fLerp = AndroidUtilities.lerp(org.telegram.ui.Cells.pa.b(1.0f, fE2, getWidth() * 0.35f * this.Y0, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), fE);
        float fDp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean zIsEnabled = LiteMode.isEnabled(360928);
        Paint paint = this.f16690c1;
        if (zIsEnabled) {
            float fDp2 = AndroidUtilities.dp(47.0f);
            org.telegram.ui.Components.s9 s9Var = this.f16691d1;
            s9Var.f32356a = fDp2;
            Paint paint2 = s9Var.d;
            f11 = 0.0f;
            s9Var.f32357b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            float fDp3 = AndroidUtilities.dp(50.0f);
            org.telegram.ui.Components.s9 s9Var2 = this.f16692e1;
            s9Var2.f32356a = fDp3;
            Paint paint3 = s9Var2.d;
            s9Var2.f32357b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            s9Var2.e(fD, 1.01f);
            s9Var.e(fD, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.g6.l1(0.15f * f10, paint.getColor()));
            canvas.save();
            float f13 = fZ / s9Var2.f32356a;
            canvas.scale(f13, f13, fLerp, fDp);
            s9Var2.a(fLerp, fDp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.g6.l1(0.3f * f10, paint.getColor()));
            canvas.save();
            float f14 = fZ / s9Var.f32356a;
            canvas.scale(f14, f14, fLerp, fDp);
            s9Var.a(fLerp, fDp, canvas, paint2);
            canvas.restore();
        } else {
            f11 = 0.0f;
        }
        float fMin = Math.min(fZ, AndroidUtilities.dp(55.0f));
        float f15 = f10 * 255.0f;
        paint.setAlpha((int) f15);
        canvas.drawCircle(fLerp, fDp, fMin, paint);
        canvas.save();
        Path path = this.f16696i1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(fLerp, fDp, fMin, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f16693f1;
        drawable.setBounds((int) (fLerp - (((drawable.getIntrinsicWidth() / 2.0f) * f12) * (this.H1 ? f10 : 1.0f))), (int) (fDp - (((drawable.getIntrinsicHeight() / 2.0f) * f12) * (this.H1 ? f10 : 1.0f))), (int) (((drawable.getIntrinsicWidth() / 2.0f) * f12 * (this.H1 ? f10 : 1.0f)) + fLerp), (int) (((drawable.getIntrinsicHeight() / 2.0f) * f12 * (this.H1 ? f10 : 1.0f)) + fDp));
        drawable.setAlpha((int) (f12 * 255.0f * (this.H1 ? f10 : 1.0f)));
        drawable.draw(canvas);
        if (fE2 > f11) {
            float fDpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * fE2 * f10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(fLerp - fDpf2, fDp - fDpf2, fLerp + fDpf2, fDp + fDpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.f16689b1);
        }
        canvas.restore();
        float f16 = y5Var.f34812c;
        float f17 = y5Var2.f34812c;
        float fZ2 = org.telegram.messenger.y1.z(1.0f, f16, AndroidUtilities.lerp(this.f16701o1.e(this.Y0 < 0.4f), 0.0f, f17), f10);
        float fDp4 = AndroidUtilities.dp(36.0f) * fZ2;
        float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f17) * fZ2;
        float fDp5 = rectF.right - AndroidUtilities.dp(20.0f);
        float f18 = fLerp2 / 2.0f;
        float f19 = 1.0f - f17;
        float fLerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - f18) - ((AndroidUtilities.dp(120.0f) * this.Z0) * f19), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - fZ2);
        float f20 = fDp4 / 2.0f;
        RectF rectF3 = this.f16702p1;
        rectF3.set(fDp5 - f20, fLerp3 - f18, f20 + fDp5, f18 + fLerp3);
        float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f17);
        float fDp6 = AndroidUtilities.dp(1.0f);
        float fDp7 = AndroidUtilities.dp(0.66f);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(fZ2, 536870912);
        Paint paint4 = this.l1;
        paint4.setShadowLayer(fDp6, 0.0f, fDp7, iL1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, fLerp4, fLerp4, paint4);
        Paint paintC = this.N.c(fZ2);
        if (paintC == null) {
            Paint paint5 = this.f16698k1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * fZ2));
            canvas.drawRoundRect(rectF3, fLerp4, fLerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, fLerp4, fLerp4, paintC);
            Paint paint6 = this.f16336e;
            paint6.setAlpha((int) (51.0f * fZ2));
            canvas.drawRoundRect(rectF3, fLerp4, fLerp4, paint6);
        }
        canvas.save();
        canvas.scale(fZ2, fZ2, fDp5, fLerp3);
        int iL2 = org.telegram.ui.ActionBar.g6.l1(fZ2, -1);
        Paint paint7 = this.f16699m1;
        paint7.setColor(iL2);
        int iL3 = org.telegram.ui.ActionBar.g6.l1(fZ2 * f19, -1);
        Paint paint8 = this.f16700n1;
        paint8.setColor(iL3);
        float fLerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f17);
        float fLerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f17);
        float fDp8 = (AndroidUtilities.dp(4.0f) * f19) + fLerp3;
        canvas.rotate(this.Z0 * 12.0f * f19, fDp5, fDp8);
        float f21 = fLerp5 / 2.0f;
        float f22 = fLerp6 / 2.0f;
        float f23 = fDp8 - f22;
        RectF rectF4 = this.f16704r1;
        rectF4.set(fDp5 - f21, f23, f21 + fDp5, fDp8 + f22);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f17 < 1.0f) {
            canvas.save();
            canvas.rotate(this.Z0 * 12.0f * f19, fDp5, f23);
            canvas.translate(0.0f, f22 * f17);
            canvas.scale(f19, f19, fDp5, f23);
            Path path2 = this.f16705s1;
            path2.rewind();
            float fDp9 = AndroidUtilities.dp(4.33f);
            float fDp10 = f23 - AndroidUtilities.dp(3.66f);
            float f24 = fDp5 + fDp9;
            path2.moveTo(f24, AndroidUtilities.dp(3.66f) + fDp10);
            path2.lineTo(f24, fDp10);
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f25 = fDp5 - fDp9;
            rectF5.set(f25, fDp10 - fDp9, f24, fDp9 + fDp10);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f25, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.Z0), 1.0f, f17) * AndroidUtilities.dp(3.66f)) + fDp10);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.G1) {
            ImageView imageView = this.O0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.y5 y5Var3 = this.I0;
            ImageView imageView2 = this.P0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || y5Var3.f34812c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f16344k0) * 255.0f), 31);
                Path path3 = this.f16697j1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || y5Var3.f34812c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || y5Var3.f34812c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.U0 == null) {
            this.U0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.U0.setAlpha((int) (f15 * f12));
        float timelineHeight = getTimelineHeight();
        this.U0.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.U0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r rVar = this.W0;
        oi0 oi0Var = rVar.h;
        rVar.f16613f = true;
        if (rVar.f16614g) {
            oi0Var.start();
        }
        oi0Var.f31328r0 = rVar.f16615i;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r rVar = this.W0;
        rVar.f16613f = false;
        oi0 oi0Var = rVar.h;
        oi0Var.stop();
        oi0Var.f31328r0 = null;
    }

    public void setAmplitude(double d) {
        this.f16694g1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i10 = z10 ? R.drawable.input_video_story_remove : R.drawable.input_video_story;
        ImageView imageView = this.O0;
        imageView.setImageResource(i10);
        imageView.setContentDescription(LocaleController.getString(z10 ? R.string.AccDescrRemoveRoundVideo : R.string.AccDescrVideoMessage));
        this.V0 = z10;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.f16710x1 = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.f16711y1 = callback;
    }

    public void setPeriod(int i10) {
        A(i10, true);
    }

    public void setPeriodVisible(boolean z10) {
        this.S0 = z10;
        this.P0.setVisibility((!z10 || this.f16345l0) ? 8 : 0);
    }

    @Override
    public final void u(float f10) {
        float f11 = 1.0f - f10;
        this.P0.setAlpha(f11);
        this.O0.setAlpha(f11);
    }

    public final void z(boolean z10, boolean z11) {
        AndroidUtilities.cancelRunOnUIThread(this.L1);
        this.H1 = true;
        this.K1 = false;
        int iDp = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.Y0));
        this.G0 = false;
        this.H0 = iDp;
        invalidate();
        q qVar = this.f16712z1;
        if (qVar != null) {
            if (!z10) {
                if (z11) {
                    qVar.f15869x = true;
                    AndroidUtilities.cancelRunOnUIThread(qVar.h);
                    CameraController.getInstance().stopVideoRecording(qVar.f15860a.getCameraSessionRecording(), false, false);
                    qVar.a(false);
                } else {
                    qVar.c();
                }
            }
            this.f16712z1 = null;
        }
        n();
    }
}
