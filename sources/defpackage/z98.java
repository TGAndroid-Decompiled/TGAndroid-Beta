package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class z98 implements View.OnClickListener {
    public final byte a;
    public final PhotoViewer b;

    public z98(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        kfc kfcVar;
        int i3;
        Bitmap bitmap;
        Bitmap bitmap2;
        sc8 sc8Var;
        f41 f41Var;
        r47 r47Var;
        b77 b;
        ed8 ed8Var;
        float f = 1.0f;
        boolean z = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.e();
                photoViewer.o2(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (photoViewer2.J1.b()) {
                    Activity activity = photoViewer2.E;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer2.w2, activity);
                        alertDialog$Builder.a.U = ob6.M0(2131751370, "DiscardChanges");
                        alertDialog$Builder.a.S = ob6.M0(2131689472, "AppName");
                        alertDialog$Builder.j(ob6.M0(2131747558, "OK"), new fa8(photoViewer2));
                        alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                        photoViewer2.b2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.o2(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer3.d8 = photoViewer3.f8;
                photoViewer3.N();
                photoViewer3.h2(false);
                photoViewer3.x1(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                Object obj = photoViewer4.f7.get(photoViewer4.O4);
                if (obj instanceof go6) {
                    ((go6) obj).s = photoViewer4.k0();
                }
                photoViewer4.h2(false);
                photoViewer4.x1(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                r47 r47Var2 = photoViewer5.S4;
                if (r47Var2 != null && r47Var2.q4()) {
                    e eVar = photoViewer5.l4;
                    if (eVar instanceof zu1) {
                        ((zu1) eVar).Z9(photoViewer5.S4, false, true);
                    }
                    photoViewer5.A(true, false);
                    String str = photoViewer5.S4.T0;
                    if (str != null) {
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = photoViewer5.F;
                        }
                        m01.t(context, Uri.parse(str), true, false, false, null, null, false, uc7.s1(photoViewer5.U).l4.I2.f, false, false);
                        return;
                    }
                    return;
                }
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
                photoViewer10.z();
                return;
            case 10:
                PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.d9;
                if (!photoViewer11.p5.b.R && (i = photoViewer11.O4) >= 0 && i < photoViewer11.f7.size() && (photoViewer11.f7.get(photoViewer11.O4) instanceof no6)) {
                    no6 no6Var = (no6) photoViewer11.f7.get(photoViewer11.O4);
                    long time = photoViewer11.p5.getTime();
                    String x0 = PhotoViewer.x0();
                    photoViewer11.p5.b.setLoading(true);
                    Utilities.e.c(new ba7(photoViewer11, x0, no6Var, time, (byte) 28));
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
                            ((kg5) obj2).f(true);
                        }
                    }
                    if (photoViewer12.r) {
                        final kg5 kg5Var = new kg5(photoViewer12.E, 3);
                        kg5Var.p(true);
                        kg5Var.t(ob6.M0(2131751174, null));
                        kg5Var.h = kg5.a(kg5Var.getText(), kg5Var.getTextPaint());
                        kg5Var.setPadding(hl.L(6.0f), 0, hl.L(6.0f), 0);
                        kg5Var.n(0.0f, 22.0f);
                        kg5Var.r0 = new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r3;
                                kg5 kg5Var2 = kg5Var;
                                PhotoViewer photoViewer13 = photoViewer12;
                                switch (b2) {
                                    case 0:
                                        Drawable[] drawableArr13 = PhotoViewer.d9;
                                        ArrayList arrayList2 = photoViewer13.i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(kg5Var2);
                                            return;
                                        }
                                        return;
                                    default:
                                        Drawable[] drawableArr14 = PhotoViewer.d9;
                                        ArrayList arrayList3 = photoViewer13.i1;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(kg5Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer13.j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(kg5Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer12.i1 == null) {
                            photoViewer12.i1 = new ArrayList();
                        }
                        photoViewer12.f0.addView(kg5Var, tre.e(-1, 200, 83));
                        photoViewer12.i1.add(kg5Var);
                        kg5Var.v();
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
                    if (obj3 instanceof go6) {
                        ((go6) obj3).s = photoViewer12.k0();
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
                    if (obj4 instanceof no6) {
                        ((no6) obj4).O = Boolean.valueOf(z2);
                        SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                        xea.e1 = U0;
                        edit.putBoolean("photoLiveDefault", U0).apply();
                        ed8 ed8Var2 = photoViewer13.d;
                        if (ed8Var2 != null) {
                            ed8Var2.m();
                        }
                    }
                }
                photoViewer13.g1.a(!photoViewer13.U0(), true);
                ViewPropertyAnimator animate = photoViewer13.X7.animate();
                if (photoViewer13.U0()) {
                    f = 0.45f;
                }
                animate.alpha(f).start();
                if (photoViewer13.U0() && (kfcVar = photoViewer13.G2) != null) {
                    kfcVar.f0();
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
                    ((kg5) obj5).f(true);
                }
                final kg5 kg5Var2 = new kg5(photoViewer13.E, 3);
                if (photoViewer13.U0()) {
                    i2 = 2131748590;
                } else {
                    i2 = 2131748589;
                }
                kg5Var2.t(hl.S2(ob6.M0(i2, null)));
                kg5Var2.setPadding(hl.L(6.0f), 0, hl.L(6.0f), hl.L(6.0f));
                kg5Var2.n(0.0f, 28.0f);
                kg5Var2.r0 = new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        kg5 kg5Var22 = kg5Var2;
                        PhotoViewer photoViewer132 = photoViewer13;
                        switch (b2) {
                            case 0:
                                Drawable[] drawableArr132 = PhotoViewer.d9;
                                ArrayList arrayList22 = photoViewer132.i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(kg5Var22);
                                    return;
                                }
                                return;
                            default:
                                Drawable[] drawableArr14 = PhotoViewer.d9;
                                ArrayList arrayList3 = photoViewer132.i1;
                                if (arrayList3 != null) {
                                    arrayList3.remove(kg5Var22);
                                }
                                ArrayList arrayList4 = photoViewer132.j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(kg5Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer13.f0.addView(kg5Var2, tre.e(-1, 200, 83));
                photoViewer13.i1.add(kg5Var2);
                photoViewer13.j1.add(kg5Var2);
                kg5Var2.v();
                return;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.d9;
                if (photoViewer14.d != null && !photoViewer14.K0()) {
                    photoViewer14.d.n();
                    photoViewer14.A(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.d9;
                if (photoViewer15.d != null && !photoViewer15.K0()) {
                    photoViewer15.d.n();
                    photoViewer15.A(true, false);
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.d9;
                ArrayList arrayList3 = photoViewer16.f7;
                if (!photoViewer16.A7) {
                    sc8 sc8Var2 = photoViewer16.s5;
                    if (!sc8Var2.R && sc8Var2.o0 != 1 && (i3 = photoViewer16.O4) >= 0 && i3 < arrayList3.size() && !photoViewer16.o5.W) {
                        go6 go6Var = (go6) arrayList3.get(photoViewer16.O4);
                        boolean isEmpty = TextUtils.isEmpty(go6Var.i);
                        boolean z3 = !isEmpty;
                        sc8 sc8Var3 = photoViewer16.s5;
                        byte b2 = sc8Var3.o0;
                        if (b2 == 0) {
                            sc8Var3.setCancelState(true);
                            k3b k3bVar = photoViewer16.o5;
                            e52 e52Var = new e52(photoViewer16, z3, go6Var, (byte) 3);
                            k3bVar.getClass();
                            k3bVar.setOnClickListener(new jy8(k3bVar, e52Var, (byte) 23));
                            TextView textView = k3bVar.N;
                            textView.setText(ob6.M0(2131745403, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(k43.h).start();
                            ValueAnimator valueAnimator = k3bVar.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            k3bVar.R = k3bVar.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            k3bVar.O = ofFloat;
                            ofFloat.addUpdateListener(new ija(k3bVar, (byte) 13));
                            k3bVar.O.setRepeatCount(-1);
                            k3bVar.O.setRepeatMode(1);
                            k3bVar.O.setDuration(2400L);
                            k3bVar.O.setInterpolator(new LinearInterpolator());
                            k3bVar.O.start();
                            photoViewer16.f0.invalidate();
                            return;
                        } else if (b2 == 2) {
                            sc8Var3.setCutOutState(true);
                            photoViewer16.g2(false, true);
                            photoViewer16.o5.f();
                            photoViewer16.f0.invalidate();
                            return;
                        } else {
                            photoViewer16.o5.k();
                            photoViewer16.o5.getThanosEffect();
                            k3b k3bVar2 = photoViewer16.o5;
                            k3bVar2.M = false;
                            k3bVar2.F = null;
                            ImageReceiver imageReceiver = photoViewer16.B4;
                            if (isEmpty || (bitmap = k3bVar2.L) == null) {
                                bitmap = k3bVar2.J;
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
                k3b k3bVar3 = photoViewer17.o5;
                if (k3bVar3 != null) {
                    k3bVar3.setOutlineVisible(false);
                }
                photoViewer17.N1 = true;
                gc8 gc8Var = photoViewer17.O1;
                if (gc8Var != null) {
                    gc8Var.setEraser(true);
                }
                photoViewer17.o2(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr18 = PhotoViewer.d9;
                photoViewer18.u5.m(false, true);
                photoViewer18.v5.m(true, true);
                k3b k3bVar4 = photoViewer18.o5;
                if (k3bVar4 != null) {
                    k3bVar4.setOutlineVisible(false);
                }
                photoViewer18.N1 = false;
                gc8 gc8Var2 = photoViewer18.O1;
                if (gc8Var2 != null) {
                    gc8Var2.setEraser(false);
                }
                photoViewer18.o2(4);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                Drawable[] drawableArr19 = PhotoViewer.d9;
                gc8 gc8Var3 = photoViewer19.O1;
                if (gc8Var3 != null) {
                    a9c a9cVar = gc8Var3.b;
                    if (a9cVar.a()) {
                        a9cVar.c();
                        return;
                    }
                }
                photoViewer19.o2(0);
                photoViewer19.o5.k();
                boolean isEmpty2 = TextUtils.isEmpty(((go6) photoViewer19.f7.get(photoViewer19.O4)).i);
                k3b k3bVar5 = photoViewer19.o5;
                if (k3bVar5 != null && !k3bVar5.H) {
                    k3bVar5.M = false;
                    k3bVar5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer19.B4;
                if (isEmpty2 || (bitmap2 = k3bVar5.L) == null) {
                    bitmap2 = k3bVar5.J;
                }
                imageReceiver2.f0(bitmap2);
                k3b k3bVar6 = photoViewer19.o5;
                if (k3bVar6 == null || !k3bVar6.H) {
                    photoViewer19.s5.setCutOutState(true);
                }
                photoViewer19.k2(true, true);
                return;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr20 = PhotoViewer.d9;
                if (photoViewer20.o5 != null) {
                    photoViewer20.x5.m(!sc8Var.u0, true);
                    k3b k3bVar7 = photoViewer20.o5;
                    if (!photoViewer20.x5.u0 || photoViewer20.u5.u0 || photoViewer20.v5.u0) {
                        z = false;
                    }
                    k3bVar7.setOutlineVisible(z);
                    return;
                }
                return;
            case 20:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr21 = PhotoViewer.d9;
                zu1 zu1Var = photoViewer21.k4;
                if (zu1Var != null && (r47Var = zu1Var.H5) != null && r47Var.o5() && !xc2.z(photoViewer21.U, 24, r47.B0(photoViewer21.k4.H5.k))) {
                    if (photoViewer21.l4 == null || (b = photoViewer21.k4.y5) == null) {
                        b = b77.b(photoViewer21.k4.H5.k.suggested_post);
                    }
                    if (!jxa.R(photoViewer21.U, b.a)) {
                        zu1 zu1Var2 = photoViewer21.k4;
                        if (zu1Var2 != null) {
                            zu1Var2.wc(b);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer21.V1.o()) {
                    in inVar = photoViewer21.V1.w;
                    float f2 = -photoViewer21.X1;
                    photoViewer21.X1 = f2;
                    hl.A3(f2, inVar, null);
                    yw0.APP_ERROR.a();
                    if (!uc7.s1(photoViewer21.U).M3() && uc7.s1(photoViewer21.U).l4.p1.f() > photoViewer21.V1.getCodePointCount()) {
                        photoViewer21.c2(photoViewer21.f0);
                        return;
                    }
                    return;
                }
                zu1 zu1Var3 = photoViewer21.k4;
                if (zu1Var3 != null && zu1Var3.X7() && ((f41Var = photoViewer21.k4.Y1) == null || f41Var.E3 == null)) {
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
                if (photoViewer23.E != null && (ed8Var = photoViewer23.d) != null) {
                    ed8Var.W();
                    photoViewer23.A(true, false);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr24 = PhotoViewer.d9;
                photoViewer24.l();
                if (!photoViewer24.K0()) {
                    if (photoViewer24.s1) {
                        if (photoViewer24.p8) {
                            TextureView textureView = photoViewer24.C2;
                            if (textureView instanceof kec) {
                                kec kecVar = (kec) textureView;
                                if (kecVar.getVideoWidth() <= 0 || kecVar.getVideoHeight() <= 0) {
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
                photoViewer25.K(-90.0f, false, null);
                return;
            case 25:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr26 = PhotoViewer.d9;
                photoViewer26.J();
                return;
            case 26:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr27 = PhotoViewer.d9;
                photoViewer27.l();
                if (!photoViewer27.K0()) {
                    if (photoViewer27.s1) {
                        if (photoViewer27.p8) {
                            TextureView textureView2 = photoViewer27.C2;
                            if (textureView2 instanceof kec) {
                                kec kecVar2 = (kec) textureView2;
                                if (kecVar2.getVideoWidth() <= 0 || kecVar2.getVideoHeight() <= 0) {
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
                    photoViewer28.l();
                    if (!photoViewer28.K0()) {
                        if (photoViewer28.s1) {
                            if (photoViewer28.p8) {
                                TextureView textureView3 = photoViewer28.C2;
                                if (textureView3 instanceof kec) {
                                    kec kecVar3 = (kec) textureView3;
                                    if (kecVar3.getVideoWidth() <= 0 || kecVar3.getVideoHeight() <= 0) {
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
                    y98 y98Var = new y98(photoViewer29, (byte) 2);
                    if (!photoViewer29.J2) {
                        float stateOrientation = photoViewer29.R2 - photoViewer29.D1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer29.K(stateOrientation, photoViewer29.D1.b.getStateMirror(), y98Var);
                        return;
                    }
                    y98Var.run();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer30 = this.b;
                Drawable[] drawableArr30 = PhotoViewer.d9;
                if (photoViewer30.t4 == 1) {
                    b43 b43Var = photoViewer30.D1.b;
                    n33 n33Var = b43Var.H;
                    if (n33Var.a.isInProgress() || n33Var.h || b43Var.a.f0) {
                        return;
                    }
                }
                photoViewer30.e();
                photoViewer30.o2(0);
                return;
        }
    }
}
