package ai;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zh;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.pi1;
import org.telegram.ui.pu0;
import org.telegram.ui.s21;
import org.telegram.ui.to;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.vw;
import org.telegram.ui.y21;
import org.telegram.ui.yn;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f1824a;
    public final Object f1825b;
    public final Object f1826c;

    public x(int i10, Object obj, Object obj2) {
        this.f1824a = i10;
        this.f1825b = obj;
        this.f1826c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f1824a) {
            case 0:
                a0 a0Var = (a0) this.f1825b;
                View view = (View) this.f1826c;
                a0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue);
                a0Var.f549y.setAlpha(floatValue);
                a0Var.f549y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1825b;
                boolean[] zArr = (boolean[]) this.f1826c;
                int i11 = ProfileStoriesView.f34487s0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue2 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.d(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue2);
                profileStoriesView.invalidate();
                return;
            case 2:
                ((TextView) this.f1825b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f1826c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                ig.g gVar = (ig.g) this.f1825b;
                kg.d dVar = (kg.d) this.f1826c;
                gVar.getClass();
                dVar.f14780f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.f12111b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.d dVar2 = (kg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f14780f = (int) ((dVar2.f14781g / 255.0f) * (255 - dVar.f14780f));
                    }
                }
                gVar.invalidate();
                return;
            case 4:
                ig.g gVar2 = (ig.g) this.f1825b;
                kg.b bVar = (kg.b) this.f1826c;
                gVar2.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar2.f12114c;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    kg.b bVar2 = (kg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue3 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue3) * bVar2.f14768e);
                    }
                }
                gVar2.invalidate();
                return;
            case 5:
                ig.n nVar = (ig.n) this.f1825b;
                nVar.getClass();
                ((ig.o) this.f1826c).f12173r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 6:
                ii.b0 b0Var = (ii.b0) this.f1825b;
                b0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b0Var.f12233a = intValue;
                ((ei.f) this.f1826c).d(intValue);
                return;
            case 7:
                ((org.telegram.ui.Cells.v0) this.f1825b).f23539c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f1826c).invalidate();
                return;
            case 8:
                ng.a aVar = (ng.a) this.f1825b;
                int[] iArr = (int[]) this.f1826c;
                aVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue4, iArr[0], aVar.h[0]), i0.a.d(floatValue4, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f16887b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f16888c);
                paint.setShader(aVar.f16887b);
                aVar.f16886a.setPaint(paint, 0);
                aVar.f16891g.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[1], aVar.h[1]), -1));
                aVar.f16890f.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 9:
                yn ynVar = (yn) this.f1825b;
                yn ynVar2 = (yn) this.f1826c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar2.S9 = floatValue5;
                ynVar2.fragmentView.invalidate();
                ynVar2.f43525v0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                ynVar.Y0.setTranslationY(dp);
                ynVar.Y0.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                ynVar2.Y0.setTranslationY(f11);
                ynVar2.Y0.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                ynVar.Y0.getAvatarImageView().setScaleX(f12);
                ynVar.Y0.getAvatarImageView().setScaleY(f12);
                ynVar.Y0.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                ynVar2.Y0.getAvatarImageView().setScaleX(f13);
                ynVar2.Y0.getAvatarImageView().setScaleY(f13);
                ynVar2.Y0.getAvatarImageView().setAlpha(f10);
                eh ehVar = ynVar2.K0;
                if (ehVar != null) {
                    ehVar.setAlpha(f10);
                    return;
                }
                return;
            case 10:
                to toVar = (to) this.f1825b;
                ArrayList arrayList3 = (ArrayList) this.f1826c;
                toVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                toVar.N.setAlpha(floatValue6);
                org.telegram.ui.Cells.r8 r8Var = toVar.N;
                float f14 = 1.0f - floatValue6;
                r8Var.setTranslationY(((-r8Var.getHeight()) / 2.0f) * f14);
                toVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-toVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 11:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f1825b;
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f1826c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue7);
                w9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !w9Var2.getImageReceiver().hasBitmapImage()) {
                    w9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.hb) this.f1825b).accept(Float.valueOf(((org.telegram.ui.Components.vb) this.f1826c).getTranslationY()));
                return;
            case 13:
                ((pl) this.f1825b).accept(Float.valueOf(((org.telegram.ui.Components.vb) this.f1826c).getTranslationY()));
                return;
            case 14:
                zh zhVar = (zh) this.f1825b;
                zhVar.getClass();
                ((eu) this.f1826c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xi xiVar = zhVar.f33495c0;
                xiVar.R1();
                pi piVar = xiVar.f32873y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.f32824j0;
                if (piVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(xiVar.f32831l2);
                    return;
                }
                return;
            case 15:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f1825b;
                mVar.getClass();
                ((ou) this.f1826c).f29451b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!zg.e0.f53366b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 16:
                yy0 yy0Var = (yy0) this.f1825b;
                xy0[] xy0VarArr = (xy0[]) this.f1826c;
                yy0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < xy0VarArr.length) {
                    yy0Var.f33281c[i10] = (yy0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * yy0Var.f33282e[i10]);
                    i10++;
                }
                yy0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f1825b;
                m0Var.getClass();
                ((org.telegram.ui.Components.voip.u) this.f1826c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m0Var.invalidate();
                return;
            case 18:
                View view2 = (View) this.f1826c;
                View view3 = (View) this.f1825b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue9;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view3.setAlpha(f15);
                return;
            case 19:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f1825b;
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f1826c;
                r1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r1Var.c();
                int i12 = r1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && d3Var.R) {
                    d3Var.Q.pause();
                    AnimatorSet animatorSet = d3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.p3 p3Var = (org.telegram.ui.Components.voip.p3) this.f1825b;
                int i13 = p3Var.f32075e;
                p3Var.f32077g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.f32074c - i13)) + i13);
                int i14 = p3Var.f32076f;
                p3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.d - i14)) + i14);
                ((org.telegram.ui.Components.voip.a3) this.f1826c).invalidate();
                return;
            case 21:
                uy.u1(((vw) this.f1825b).M, (ty) this.f1826c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f1825b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f1826c).invalidateOutline();
                ImageView imageView = photoViewer.f34066x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                pu0 pu0Var = photoViewer.E2;
                if (pu0Var != null) {
                    pu0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                y21 y21Var = (y21) this.f1825b;
                int[] iArr2 = (int[]) this.f1826c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc0 pc0Var = y21Var.f43021n;
                if (pc0Var != null) {
                    pc0Var.K = 1.0f;
                    pc0Var.i();
                    y21Var.f43021n.s(1.0f - floatValue10);
                }
                pc0 pc0Var2 = y21Var.h;
                pc0Var2.K = floatValue10;
                pc0Var2.i();
                y21Var.h.s(floatValue10);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue10, y21Var.f43019e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue10, y21Var.f43019e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue10, y21Var.f43019e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue10, y21Var.f43019e[3], iArr2[3]);
                    s21 s21Var = y21Var.E;
                    s21Var.f40330a.n(d, d10, d11, d12);
                    s21Var.invalidate();
                }
                y21Var.f43024w.invalidate();
                return;
            case 24:
                a5.a aVar2 = (a5.a) this.f1825b;
                int[] iArr3 = (int[]) this.f1826c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f299b;
                ((zl0) aVar2.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                aVar2.f299b = intValue2;
                return;
            case 25:
                pi1 pi1Var = (pi1) this.f1825b;
                pi1Var.getClass();
                pi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((wi) this.f1826c).invalidate();
                return;
            case 26:
                qg.a2 a2Var = (qg.a2) this.f1825b;
                boolean[] zArr2 = (boolean[]) this.f1826c;
                a2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    a2Var.setRotationY(90.0f * f16);
                    a2Var.f44964z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    a2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a2Var.f44956r0.b(a2Var.f44963y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                a2Var.setRotationY((1.0f - f17) * (-90.0f));
                a2Var.f44964z0 = (f17 * 0.3f) + 0.7f;
                a2Var.invalidate();
                return;
            case 27:
                cl0 cl0Var = (cl0) this.f1825b;
                cl0Var.getClass();
                ((Drawable) this.f1826c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view4 = ((rg.m1) cl0Var.f25414c).A0;
                if (view4 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view4).a3();
                    return;
                } else {
                    view4.invalidate();
                    return;
                }
            default:
                ((s4.j) this.f1825b).P((s4.c1) this.f1826c);
                return;
        }
    }

    public x(View view, View view2) {
        this.f1824a = 18;
        this.f1826c = view;
        this.f1825b = view2;
    }
}
