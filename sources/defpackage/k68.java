package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class k68 implements View.OnClickListener {
    public final byte a;
    public final PhotoViewer b;

    public k68(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        lbc lbcVar;
        int i3;
        Bitmap bitmap;
        Bitmap bitmap2;
        c98 c98Var;
        x31 x31Var;
        k27 k27Var;
        u47 b;
        o98 o98Var;
        float f = 1.0f;
        boolean z = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                Activity activity = photoViewer.E;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = (byte) 1;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
                    }
                    int rotation = ((WindowManager) photoViewer.E.getSystemService("window")).getDefaultDisplay().getRotation();
                    Activity activity2 = photoViewer.E;
                    if (rotation == 3) {
                        activity2.setRequestedOrientation(8);
                    } else {
                        activity2.setRequestedOrientation(0);
                    }
                    photoViewer.t2(false, false);
                    return;
                }
                return;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer2.e();
                photoViewer2.o2(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.d9;
                if (photoViewer3.J1.a()) {
                    Activity activity3 = photoViewer3.E;
                    if (activity3 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer3.w2, activity3);
                        alertDialog$Builder.a.U = k96.M0(2131751393, "DiscardChanges");
                        alertDialog$Builder.a.S = k96.M0(2131689472, "AppName");
                        alertDialog$Builder.j(k96.M0(2131747638, "OK"), new s68(photoViewer3));
                        alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                        photoViewer3.b2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer3.o2(0);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer4.d8 = photoViewer4.f8;
                photoViewer4.O();
                photoViewer4.h2(false);
                photoViewer4.x1(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                Object obj = photoViewer5.f7.get(photoViewer5.O4);
                if (obj instanceof bm6) {
                    ((bm6) obj).s = photoViewer5.l0();
                }
                photoViewer5.h2(false);
                photoViewer5.x1(2);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.d9;
                photoViewer6.u5.m(false, true);
                photoViewer6.v5.m(false, true);
                photoViewer6.o2(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.d9;
                photoViewer7.u5.m(false, true);
                photoViewer7.v5.m(false, true);
                photoViewer7.e();
                photoViewer7.o2(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.d9;
                photoViewer8.F1(false, 0, 0, false, false, false);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.d9;
                photoViewer9.o2(5);
                return;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.d9;
                photoViewer10.A();
                return;
            case 10:
                PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.d9;
                if (!photoViewer11.p5.b.R && (i = photoViewer11.O4) >= 0 && i < photoViewer11.f7.size() && (photoViewer11.f7.get(photoViewer11.O4) instanceof jm6)) {
                    jm6 jm6Var = (jm6) photoViewer11.f7.get(photoViewer11.O4);
                    long time = photoViewer11.p5.getTime();
                    String x0 = PhotoViewer.x0();
                    photoViewer11.p5.b.setLoading(true);
                    Utilities.e.c(new m77(photoViewer11, x0, jm6Var, time, (byte) 28));
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.d9;
                if (!photoViewer12.K0()) {
                    photoViewer12.r = !photoViewer12.r;
                    ArrayList arrayList = photoViewer12.i1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            ((je5) obj2).f(true);
                        }
                    }
                    if (photoViewer12.r) {
                        final je5 je5Var = new je5(photoViewer12.E, 3);
                        je5Var.p(true);
                        je5Var.t(k96.M0(2131751197, null));
                        je5Var.h = je5.a(je5Var.getText(), je5Var.getTextPaint());
                        je5Var.setPadding(gl.L(6.0f), 0, gl.L(6.0f), 0);
                        je5Var.n(0.0f, 22.0f);
                        je5Var.r0 = new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                je5 je5Var2 = je5Var;
                                PhotoViewer photoViewer13 = photoViewer12;
                                switch (b2) {
                                    case 0:
                                        Drawable[] drawableArr13 = PhotoViewer.d9;
                                        ArrayList arrayList2 = photoViewer13.i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(je5Var2);
                                            return;
                                        }
                                        return;
                                    default:
                                        Drawable[] drawableArr14 = PhotoViewer.d9;
                                        ArrayList arrayList3 = photoViewer13.i1;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(je5Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer13.j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(je5Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer12.i1 == null) {
                            photoViewer12.i1 = new ArrayList();
                        }
                        photoViewer12.f0.addView(je5Var, nme.e(-1, 200, 83));
                        photoViewer12.i1.add(je5Var);
                        je5Var.v();
                    }
                    photoViewer12.J2();
                    photoViewer12.P2();
                    if (photoViewer12.r) {
                        CheckBox checkBox = photoViewer12.O0;
                        if (!checkBox.y) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer12.f7.get(photoViewer12.O4);
                    if (obj3 instanceof bm6) {
                        ((bm6) obj3).s = photoViewer12.l0();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                final PhotoViewer photoViewer13 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.d9;
                boolean U0 = photoViewer13.U0();
                boolean z2 = !U0;
                int i5 = photoViewer13.O4;
                if (i5 >= 0 && i5 < photoViewer13.f7.size()) {
                    Object obj4 = photoViewer13.f7.get(photoViewer13.O4);
                    if (obj4 instanceof jm6) {
                        ((jm6) obj4).O = Boolean.valueOf(z2);
                        SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                        gba.e1 = U0;
                        edit.putBoolean("photoLiveDefault", U0).apply();
                        o98 o98Var2 = photoViewer13.d;
                        if (o98Var2 != null) {
                            o98Var2.m();
                        }
                    }
                }
                photoViewer13.g1.a(!photoViewer13.U0(), true);
                ViewPropertyAnimator animate = photoViewer13.X7.animate();
                if (photoViewer13.U0()) {
                    f = 0.45f;
                }
                animate.alpha(f).start();
                if (photoViewer13.U0() && (lbcVar = photoViewer13.G2) != null) {
                    lbcVar.f0();
                }
                photoViewer13.f0.invalidate();
                if (photoViewer13.i1 == null) {
                    photoViewer13.i1 = new ArrayList();
                }
                if (photoViewer13.j1 == null) {
                    photoViewer13.j1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer13.i1;
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj5 = arrayList2.get(i6);
                    i6++;
                    ((je5) obj5).f(true);
                }
                final je5 je5Var2 = new je5(photoViewer13.E, 3);
                if (photoViewer13.U0()) {
                    i2 = 2131748644;
                } else {
                    i2 = 2131748643;
                }
                je5Var2.t(gl.S2(k96.M0(i2, null)));
                je5Var2.setPadding(gl.L(6.0f), 0, gl.L(6.0f), gl.L(6.0f));
                je5Var2.n(0.0f, 28.0f);
                je5Var2.r0 = new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        je5 je5Var22 = je5Var2;
                        PhotoViewer photoViewer132 = photoViewer13;
                        switch (b2) {
                            case 0:
                                Drawable[] drawableArr132 = PhotoViewer.d9;
                                ArrayList arrayList22 = photoViewer132.i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(je5Var22);
                                    return;
                                }
                                return;
                            default:
                                Drawable[] drawableArr14 = PhotoViewer.d9;
                                ArrayList arrayList3 = photoViewer132.i1;
                                if (arrayList3 != null) {
                                    arrayList3.remove(je5Var22);
                                }
                                ArrayList arrayList4 = photoViewer132.j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(je5Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer13.f0.addView(je5Var2, nme.e(-1, 200, 83));
                photoViewer13.i1.add(je5Var2);
                photoViewer13.j1.add(je5Var2);
                je5Var2.v();
                return;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.d9;
                if (photoViewer14.d != null && !photoViewer14.K0()) {
                    photoViewer14.d.n();
                    photoViewer14.B(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.d9;
                if (photoViewer15.d != null && !photoViewer15.K0()) {
                    photoViewer15.d.n();
                    photoViewer15.B(true, false);
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.d9;
                ArrayList arrayList3 = photoViewer16.f7;
                if (!photoViewer16.A7) {
                    c98 c98Var2 = photoViewer16.s5;
                    if (!c98Var2.R && c98Var2.o0 != 1 && (i3 = photoViewer16.O4) >= 0 && i3 < arrayList3.size() && !photoViewer16.o5.W) {
                        bm6 bm6Var = (bm6) arrayList3.get(photoViewer16.O4);
                        boolean isEmpty = TextUtils.isEmpty(bm6Var.i);
                        boolean z3 = !isEmpty;
                        c98 c98Var3 = photoViewer16.s5;
                        byte b2 = c98Var3.o0;
                        if (b2 == 0) {
                            c98Var3.setCancelState(true);
                            mza mzaVar = photoViewer16.o5;
                            o42 o42Var = new o42(photoViewer16, z3, bm6Var, (byte) 3);
                            mzaVar.getClass();
                            mzaVar.setOnClickListener(new b99(mzaVar, o42Var, (byte) 20));
                            TextView textView = mzaVar.N;
                            textView.setText(k96.M0(2131745483, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(s33.h).start();
                            ValueAnimator valueAnimator = mzaVar.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            mzaVar.R = mzaVar.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            mzaVar.O = ofFloat;
                            ofFloat.addUpdateListener(new gja(mzaVar, (byte) 11));
                            mzaVar.O.setRepeatCount(-1);
                            mzaVar.O.setRepeatMode(1);
                            mzaVar.O.setDuration(2400L);
                            mzaVar.O.setInterpolator(new LinearInterpolator());
                            mzaVar.O.start();
                            photoViewer16.f0.invalidate();
                            return;
                        } else if (b2 == 2) {
                            c98Var3.setCutOutState(true);
                            photoViewer16.g2(false, true);
                            photoViewer16.o5.f();
                            photoViewer16.f0.invalidate();
                            return;
                        } else {
                            photoViewer16.o5.k();
                            photoViewer16.o5.getThanosEffect();
                            mza mzaVar2 = photoViewer16.o5;
                            mzaVar2.M = false;
                            mzaVar2.F = null;
                            ImageReceiver imageReceiver = photoViewer16.B4;
                            if (isEmpty || (bitmap = mzaVar2.L) == null) {
                                bitmap = mzaVar2.J;
                            }
                            imageReceiver.f0(bitmap);
                            photoViewer16.s5.setCutOutState(true);
                            photoViewer16.g2(false, true);
                            photoViewer16.e();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr17 = PhotoViewer.d9;
                photoViewer17.u5.m(true, true);
                photoViewer17.v5.m(false, true);
                mza mzaVar3 = photoViewer17.o5;
                if (mzaVar3 != null) {
                    mzaVar3.setOutlineVisible(false);
                }
                photoViewer17.N1 = true;
                p88 p88Var = photoViewer17.O1;
                if (p88Var != null) {
                    p88Var.setEraser(true);
                }
                photoViewer17.o2(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr18 = PhotoViewer.d9;
                photoViewer18.u5.m(false, true);
                photoViewer18.v5.m(true, true);
                mza mzaVar4 = photoViewer18.o5;
                if (mzaVar4 != null) {
                    mzaVar4.setOutlineVisible(false);
                }
                photoViewer18.N1 = false;
                p88 p88Var2 = photoViewer18.O1;
                if (p88Var2 != null) {
                    p88Var2.setEraser(false);
                }
                photoViewer18.o2(4);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                Drawable[] drawableArr19 = PhotoViewer.d9;
                p88 p88Var3 = photoViewer19.O1;
                if (p88Var3 != null) {
                    b5c b5cVar = p88Var3.b;
                    if (b5cVar.a()) {
                        b5cVar.c();
                        return;
                    }
                }
                photoViewer19.o2(0);
                photoViewer19.o5.k();
                boolean isEmpty2 = TextUtils.isEmpty(((bm6) photoViewer19.f7.get(photoViewer19.O4)).i);
                mza mzaVar5 = photoViewer19.o5;
                if (mzaVar5 != null && !mzaVar5.H) {
                    mzaVar5.M = false;
                    mzaVar5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer19.B4;
                if (isEmpty2 || (bitmap2 = mzaVar5.L) == null) {
                    bitmap2 = mzaVar5.J;
                }
                imageReceiver2.f0(bitmap2);
                mza mzaVar6 = photoViewer19.o5;
                if (mzaVar6 == null || !mzaVar6.H) {
                    photoViewer19.s5.setCutOutState(true);
                }
                photoViewer19.k2(true, true);
                return;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr20 = PhotoViewer.d9;
                if (photoViewer20.o5 != null) {
                    photoViewer20.x5.m(!c98Var.u0, true);
                    mza mzaVar7 = photoViewer20.o5;
                    if (!photoViewer20.x5.u0 || photoViewer20.u5.u0 || photoViewer20.v5.u0) {
                        z = false;
                    }
                    mzaVar7.setOutlineVisible(z);
                    return;
                }
                return;
            case 20:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr21 = PhotoViewer.d9;
                mu1 mu1Var = photoViewer21.k4;
                if (mu1Var != null && (k27Var = mu1Var.H5) != null && k27Var.o5() && !hc2.z(photoViewer21.U, 24, k27.B0(photoViewer21.k4.H5.k))) {
                    if (photoViewer21.l4 == null || (b = photoViewer21.k4.y5) == null) {
                        b = u47.b(photoViewer21.k4.H5.k.suggested_post);
                    }
                    if (!gta.Q(photoViewer21.U, b.a)) {
                        mu1 mu1Var2 = photoViewer21.k4;
                        if (mu1Var2 != null) {
                            mu1Var2.kc(b);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer21.V1.o()) {
                    hn hnVar = photoViewer21.V1.w;
                    float f2 = -photoViewer21.X1;
                    photoViewer21.X1 = f2;
                    gl.A3(f2, hnVar, null);
                    pw0.APP_ERROR.a();
                    if (!na7.q1(photoViewer21.U).F3() && na7.q1(photoViewer21.U).k4.h1.f() > photoViewer21.V1.getCodePointCount()) {
                        photoViewer21.c2(photoViewer21.f0);
                        return;
                    }
                    return;
                }
                mu1 mu1Var3 = photoViewer21.k4;
                if (mu1Var3 != null && mu1Var3.P7() && ((x31Var = photoViewer21.k4.Y1) == null || x31Var.E3 == null)) {
                    photoViewer21.i2();
                    return;
                } else {
                    photoViewer21.F1(true, 0, 0, false, false, false);
                    return;
                }
            case 21:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr22 = PhotoViewer.d9;
                photoViewer22.a.a(false, true);
                return;
            case 22:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr23 = PhotoViewer.d9;
                if (photoViewer23.E != null && (o98Var = photoViewer23.d) != null) {
                    o98Var.W();
                    photoViewer23.B(true, false);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr24 = PhotoViewer.d9;
                photoViewer24.m();
                if (!photoViewer24.K0()) {
                    if (photoViewer24.s1) {
                        if (photoViewer24.p8) {
                            TextureView textureView = photoViewer24.C2;
                            if (textureView instanceof kac) {
                                kac kacVar = (kac) textureView;
                                if (kacVar.getVideoWidth() <= 0 || kacVar.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer24.o2(1);
                    return;
                }
                return;
            case 24:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr25 = PhotoViewer.d9;
                photoViewer25.L(-90.0f, false, null);
                return;
            case 25:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr26 = PhotoViewer.d9;
                photoViewer26.K();
                return;
            case 26:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr27 = PhotoViewer.d9;
                photoViewer27.m();
                if (!photoViewer27.K0()) {
                    if (photoViewer27.s1) {
                        if (photoViewer27.p8) {
                            TextureView textureView2 = photoViewer27.C2;
                            if (textureView2 instanceof kac) {
                                kac kacVar2 = (kac) textureView2;
                                if (kacVar2.getVideoWidth() <= 0 || kacVar2.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer27.o2(3);
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer28 = this.b;
                Drawable[] drawableArr28 = PhotoViewer.d9;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer28.m();
                    if (!photoViewer28.K0()) {
                        if (photoViewer28.s1) {
                            if (photoViewer28.p8) {
                                TextureView textureView3 = photoViewer28.C2;
                                if (textureView3 instanceof kac) {
                                    kac kacVar3 = (kac) textureView3;
                                    if (kacVar3.getVideoWidth() <= 0 || kacVar3.getVideoHeight() <= 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        photoViewer28.o2(2);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer29 = this.b;
                Drawable[] drawableArr29 = PhotoViewer.d9;
                if (photoViewer29.o6 == null) {
                    l68 l68Var = new l68(photoViewer29, (byte) 4);
                    if (!photoViewer29.J2) {
                        float stateOrientation = photoViewer29.R2 - photoViewer29.D1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer29.L(stateOrientation, photoViewer29.D1.b.getStateMirror(), l68Var);
                        return;
                    }
                    l68Var.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer30 = this.b;
                Drawable[] drawableArr30 = PhotoViewer.d9;
                if (photoViewer30.t4 == 1) {
                    j33 j33Var = photoViewer30.D1.b;
                    v23 v23Var = j33Var.H;
                    if (v23Var.a.isInProgress() || v23Var.h || j33Var.a.f0) {
                        return;
                    }
                }
                photoViewer30.e();
                photoViewer30.o2(0);
                return;
        }
    }
}
