package fi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.xq;
public final class w8 implements View.OnClickListener {
    public final int f13062a;
    public final va f13063b;

    public w8(va vaVar, int i7) {
        this.f13062a = i7;
        this.f13063b = vaVar;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        xq xqVar;
        boolean z9;
        int i7;
        String M0;
        int i10;
        int i11;
        y yVar;
        int i12 = this.f13062a;
        boolean z10 = false;
        va vaVar = this.f13063b;
        switch (i12) {
            case 0:
                va vaVar2 = this.f13063b;
                if (vaVar2.K1 != null && vaVar2.C2 == null && vaVar2.f12963i1 != null) {
                    ValueAnimator valueAnimator = vaVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = vaVar2.K1.f11926y0;
                        Bitmap createBitmap = Bitmap.createBitmap(vaVar2.f12975n.getWidth(), vaVar2.f12975n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        vaVar2.f12963i1.setAlpha(0.0f);
                        ja jaVar = vaVar2.X0;
                        if (jaVar != null) {
                            jaVar.f13173g0 = true;
                        }
                        x9 x9Var = vaVar2.f13002v1;
                        if (x9Var != null) {
                            x9Var.f12543r0 = true;
                        }
                        vaVar2.f12975n.draw(canvas);
                        ja jaVar2 = vaVar2.X0;
                        if (jaVar2 != null) {
                            jaVar2.f13173g0 = false;
                        }
                        x9 x9Var2 = vaVar2.f13002v1;
                        if (x9Var2 != null) {
                            x9Var2.f12543r0 = false;
                        }
                        vaVar2.f12963i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        vaVar2.f12963i1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        da daVar = new da(vaVar2, vaVar2.f12938b, z11, canvas, (vaVar2.f12963i1.getMeasuredWidth() / 2.0f) + f10, (vaVar2.f12963i1.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22532n, paint, createBitmap, paint2, f10, f11);
                        vaVar2.C2 = daVar;
                        daVar.setOnTouchListener(new ei.b(2));
                        vaVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        vaVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new ea(vaVar2, 0));
                        vaVar2.E2.addListener(new v9(vaVar2, 2));
                        vaVar2.E2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = vaVar2.E2;
                        if (z11) {
                            j3 = 320;
                        } else {
                            j3 = 450;
                        }
                        valueAnimator2.setDuration(j3);
                        ValueAnimator valueAnimator3 = vaVar2.E2;
                        if (z11) {
                            xqVar = xq.f40331i;
                        } else {
                            xqVar = xq.h;
                        }
                        valueAnimator3.setInterpolator(xqVar);
                        vaVar2.E2.start();
                        vaVar2.f12975n.addView(vaVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new u8(vaVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!vaVar.S1) {
                    vaVar.L();
                    return;
                }
                return;
            case 2:
                e7 e7Var = vaVar.K1;
                if (e7Var != null && !vaVar.S1) {
                    e7Var.Y = !e7Var.Y;
                    ArrayList arrayList = e7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList.get(i13);
                            i13++;
                            ((e7) obj).Y = vaVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(vaVar.K1.f11925y);
                    e7 e7Var2 = vaVar.K1;
                    if (e7Var2.f11907o0 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (vaVar.f12956g0 == -1) {
                        m3 m3Var = vaVar.f12969k1;
                        if (e7Var2.Y) {
                            if (isEmpty && !z9) {
                                i10 = 2131744461;
                            } else {
                                i10 = 2131744593;
                            }
                            M0 = hd.M0(i10, null);
                        } else {
                            if (isEmpty && !z9) {
                                i7 = 2131744460;
                            } else {
                                i7 = 2131744592;
                            }
                            M0 = hd.M0(i7, null);
                        }
                        boolean z12 = vaVar.f12969k1.V;
                        if (m3Var.getMeasuredWidth() < 0) {
                            m3Var.G = M0;
                        } else {
                            org.telegram.ui.Components.i6 i6Var = m3Var.H;
                            if (!hd.f22871a0 && z12) {
                                z10 = true;
                            }
                            i6Var.t(M0, z10, true);
                        }
                        vaVar.f12969k1.w();
                    }
                    vaVar.e0(vaVar.K1.Y, true);
                    vaVar.X0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = vaVar.X0.k();
                vaVar.X0.x(-9982, k10);
                ((he0) vaVar.f12966j1.f12598c).a(!k10, true);
                return;
            case 4:
                if (vaVar.B0 != null && !vaVar.S1) {
                    String B = vaVar.B();
                    String E = vaVar.E();
                    if (B != null && !B.equals(E)) {
                        y9 y9Var = vaVar.B0;
                        if (y9Var != null && y9Var.getCameraSession() != null) {
                            if (vaVar.B0.isFrontface() && !vaVar.B0.getCameraSession().hasFlashModes()) {
                                int indexOf = vaVar.f13000u2.indexOf(E);
                                if (indexOf >= 0) {
                                    vaVar.f12997t2 = indexOf;
                                    qp.e1().edit().putInt("frontflash", vaVar.f12997t2).apply();
                                }
                            } else {
                                vaVar.B0.getCameraSession().setCurrentFlashMode(E);
                            }
                        }
                        vaVar.d0(E);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                y9 y9Var2 = vaVar.B0;
                if (y9Var2 != null && vaVar.f12953f0 == 0) {
                    y9Var2.toggleDual();
                    vaVar.F0.setValue(vaVar.B0.isDual());
                    hb hbVar = vaVar.F0;
                    if (vaVar.B0.isDual()) {
                        i11 = 2131754886;
                    } else {
                        i11 = 2131754887;
                    }
                    hbVar.setContentDescription(hd.M0(i11, null));
                    vaVar.l1.f(true);
                    qp.e1().edit().putInt("storydualhint", 2).apply();
                    if (vaVar.f12973m1.V) {
                        qp.e1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    vaVar.f12973m1.f(true);
                    return;
                }
                return;
            case 6:
                if (vaVar.f12953f0 == 0 && !vaVar.f12937a2) {
                    y9 y9Var3 = vaVar.B0;
                    if (y9Var3 != null && y9Var3.isDual()) {
                        vaVar.B0.toggleDual();
                    }
                    if (!vaVar.I0.f13108e && !vaVar.A0.j()) {
                        vaVar.A0.o(vaVar.f13016z0);
                        vaVar.I0.setSelected(vaVar.f13016z0);
                        vaVar.G0.a(new u(vaVar.f13016z0, false), true);
                        vaVar.G0.setSelected(true);
                        y9 y9Var4 = vaVar.B0;
                        if (y9Var4 != null) {
                            y9Var4.recordHevc = !vaVar.A0.j();
                        }
                        i3 i3Var = vaVar.M0;
                        if (i3Var != null) {
                            i3Var.setMultipleOnClick(vaVar.A0.j());
                            vaVar.M0.setMaxCount(Math.min(10, t.b() - vaVar.A0.getFilledCount()));
                        }
                    }
                    vaVar.I0.a(!yVar.f13108e, true);
                    vaVar.l0(true);
                    return;
                }
                return;
            case 7:
                vaVar.A0.o(null);
                vaVar.A0.c();
                vaVar.I0.setSelected((t) null);
                y9 y9Var5 = vaVar.B0;
                if (y9Var5 != null) {
                    y9Var5.recordHevc = !vaVar.A0.j();
                }
                vaVar.I0.a(false, true);
                vaVar.l0(true);
                i3 i3Var2 = vaVar.M0;
                if (i3Var2 != null) {
                    i3Var2.setMultipleOnClick(vaVar.A0.j());
                    vaVar.M0.setMaxCount(Math.min(10, t.b() - vaVar.A0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                vaVar.j0();
                return;
            case 9:
                y9 y9Var6 = vaVar.B0;
                if (y9Var6 != null && !vaVar.S1 && !vaVar.P1 && y9Var6.isInited() && vaVar.f12953f0 == 0) {
                    vaVar.B0.switchCamera();
                    vaVar.O0.d(180.0f);
                    va.Z(vaVar.B0.isFrontface());
                    if (vaVar.p0()) {
                        vaVar.f12991s.c(null);
                        return;
                    } else {
                        vaVar.f12991s.d();
                        return;
                    }
                }
                return;
            case 10:
                vaVar.j0();
                return;
            case 11:
                e7 e7Var3 = vaVar.K1;
                if (e7Var3 != null) {
                    e7Var3.f11891f0 = true;
                    e7Var3.f11888e0 = vaVar.M1;
                    vaVar.W();
                    e7 e7Var4 = vaVar.K1;
                    if (e7Var4 != null && !e7Var4.f11880b0) {
                        org.telegram.messenger.g0.i3(new u8(vaVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (vaVar.f12994s2) {
                    vaVar.Y(true);
                    return;
                }
                return;
            case 13:
                vaVar.k0(-1, false, true);
                return;
            default:
                vaVar.k0(-1, false, true);
                return;
        }
    }
}
