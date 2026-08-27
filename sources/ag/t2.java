package ag;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import hh.kb;
import hh.lb;
import hh.y9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.zk;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.fy;
import org.telegram.ui.gy;
import org.telegram.ui.jo;
import org.telegram.ui.kw;
import org.telegram.ui.oh1;
import org.telegram.ui.rn;
import org.telegram.ui.t11;
import org.telegram.ui.tt0;
import org.telegram.ui.y11;

public final class t2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f665a;

    public final Object f666b;

    public final Object f667c;

    public t2(int i10, Object obj, Object obj2) {
        this.f665a = i10;
        this.f666b = obj;
        this.f667c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f665a) {
            case 0:
                x1 x1Var = (x1) this.f666b;
                Drawable drawable = (Drawable) this.f667c;
                x1Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((y2) x1Var.f699c).f729w0;
                if (!(view instanceof org.telegram.ui.Cells.s1)) {
                    view.invalidate();
                } else {
                    ((org.telegram.ui.Cells.s1) view).Z2();
                }
                break;
            case 1:
                ((f2.l) this.f666b).P((f2.o1) this.f667c);
                break;
            case 2:
                lb lbVar = (lb) this.f666b;
                kb kbVar = (kb) this.f667c;
                lbVar.getClass();
                kbVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lbVar.R();
                break;
            case 3:
                ig.d0 d0Var = (ig.d0) this.f666b;
                ArrayList arrayList = (ArrayList) this.f667c;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    ig.d0.g((View) arrayList.get(i10), fFloatValue);
                    i10++;
                }
                d0Var.f11278m.f36400g0.invalidate();
                break;
            case 4:
                jh.o oVar = (jh.o) this.f666b;
                View view2 = (View) this.f667c;
                oVar.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - fFloatValue2;
                view2.setAlpha(f10);
                view2.setTranslationY((-AndroidUtilities.dp(5.0f)) * fFloatValue2);
                oVar.f13730y.setAlpha(fFloatValue2);
                oVar.f13730y.setTranslationY(AndroidUtilities.dp(5.0f) * f10);
                break;
            case 5:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f666b;
                boolean[] zArr = (boolean[]) this.f667c;
                int i11 = ProfileStoriesView.f36200o0;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && fFloatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new y9(profileStoriesView, 14), 180L);
                    }
                }
                profileStoriesView.S = Math.max(1.0f, fFloatValue3);
                profileStoriesView.invalidate();
                break;
            case 6:
                rn rnVar = (rn) this.f666b;
                rn rnVar2 = (rn) this.f667c;
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar2.Q9 = fFloatValue4;
                rnVar2.fragmentView.invalidate();
                rnVar2.f42213t0.invalidate();
                float f11 = 1.0f - fFloatValue4;
                float fDp = AndroidUtilities.dp(8.0f) * f11;
                rnVar.W0.setTranslationY(fDp);
                rnVar.W0.getAvatarImageView().setTranslationY(-fDp);
                float f12 = (-AndroidUtilities.dp(8.0f)) * fFloatValue4;
                rnVar2.W0.setTranslationY(f12);
                rnVar2.W0.getAvatarImageView().setTranslationY(-f12);
                float f13 = (fFloatValue4 * 0.2f) + 0.8f;
                rnVar.W0.getAvatarImageView().setScaleX(f13);
                rnVar.W0.getAvatarImageView().setScaleY(f13);
                rnVar.W0.getAvatarImageView().setAlpha(fFloatValue4);
                float f14 = (0.2f * f11) + 0.8f;
                rnVar2.W0.getAvatarImageView().setScaleX(f14);
                rnVar2.W0.getAvatarImageView().setScaleY(f14);
                rnVar2.W0.getAvatarImageView().setAlpha(f11);
                og ogVar = rnVar2.I0;
                if (ogVar != null) {
                    ogVar.setAlpha(f11);
                }
                break;
            case 7:
                jo joVar = (jo) this.f666b;
                ArrayList arrayList2 = (ArrayList) this.f667c;
                joVar.getClass();
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                joVar.J.setAlpha(fFloatValue5);
                l8 l8Var = joVar.J;
                float f15 = 1.0f - fFloatValue5;
                l8Var.setTranslationY(((-l8Var.getHeight()) / 2.0f) * f15);
                joVar.J.setScaleY((fFloatValue5 * 0.8f) + 0.2f);
                while (i10 < arrayList2.size()) {
                    ((View) arrayList2.get(i10)).setTranslationY((-joVar.J.getHeight()) * f15);
                    i10++;
                }
                break;
            case 8:
                n9 n9Var = (n9) this.f666b;
                n9 n9Var2 = (n9) this.f667c;
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.setScaleX(fFloatValue6);
                n9Var.setScaleY(fFloatValue6);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !n9Var2.getImageReceiver().hasBitmapImage()) {
                    n9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 9:
                ((va) this.f666b).accept(Float.valueOf(((jb) this.f667c).getTranslationY()));
                break;
            case 10:
                ((zk) this.f666b).accept(Float.valueOf(((jb) this.f667c).getTranslationY()));
                break;
            case 11:
                mh mhVar = (mh) this.f666b;
                lt ltVar = (lt) this.f667c;
                mhVar.getClass();
                ltVar.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gi giVar = mhVar.V;
                giVar.U1();
                yh yhVar = giVar.f28696u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f28650f0;
                if (yhVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(giVar.f28658h2);
                }
                break;
            case 12:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.f666b;
                vt vtVar = (vt) this.f667c;
                lVar.getClass();
                vtVar.f34052b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) lVar.d).size()) {
                    if (!ig.g0.f11303b) {
                        ((View) ((ArrayList) lVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                break;
            case 13:
                mx0 mx0Var = (mx0) this.f666b;
                lx0[] lx0VarArr = (lx0[]) this.f667c;
                mx0Var.getClass();
                float fFloatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < lx0VarArr.length) {
                    mx0Var.f30767c[i10] = (mx0Var.d[i10] * fFloatValue7) + ((1.0f - fFloatValue7) * mx0Var.f30768e[i10]);
                    i10++;
                }
                mx0Var.invalidate();
                break;
            case 14:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f666b;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f667c;
                k0Var.getClass();
                tVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
                break;
            case 15:
                View view3 = (View) this.f666b;
                View view4 = (View) this.f667c;
                float fFloatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - fFloatValue8;
                view3.setTranslationY(AndroidUtilities.dp(8.0f) * f16);
                view3.setAlpha(fFloatValue8);
                view4.setTranslationY((-AndroidUtilities.dp(6.0f)) * fFloatValue8);
                view4.setAlpha(f16);
                break;
            case 16:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.f666b;
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f667c;
                n1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n1Var.c();
                int i12 = n1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && b3Var.N) {
                    b3Var.M.pause();
                    AnimatorSet animatorSet = b3Var.L;
                    if (animatorSet != null) {
                        animatorSet.pause();
                    }
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.voip.n3 n3Var = (org.telegram.ui.Components.voip.n3) this.f666b;
                org.telegram.ui.Components.voip.y2 y2Var = (org.telegram.ui.Components.voip.y2) this.f667c;
                int i13 = n3Var.f33752e;
                n3Var.f33754g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.f33751c - i13)) + i13);
                int i14 = n3Var.f33753f;
                n3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.d - i14)) + i14);
                y2Var.invalidate();
                break;
            case 18:
                gy.q1(((kw) this.f666b).M, (fy) this.f667c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) this.f666b;
                View view5 = (View) this.f667c;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view5.invalidateOutline();
                ImageView imageView = photoViewer.f35758t3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                tt0 tt0Var = photoViewer.A2;
                if (tt0Var != null) {
                    tt0Var.invalidateOutline();
                }
                break;
            case 20:
                y11 y11Var = (y11) this.f666b;
                int[] iArr = (int[]) this.f667c;
                float fFloatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nb0 nb0Var = y11Var.f44671n;
                if (nb0Var != null) {
                    nb0Var.K = 1.0f;
                    nb0Var.i();
                    y11Var.f44671n.s(1.0f - fFloatValue9);
                }
                nb0 nb0Var2 = y11Var.h;
                nb0Var2.K = fFloatValue9;
                nb0Var2.i();
                y11Var.h.s(fFloatValue9);
                if (iArr != null) {
                    int iD = i0.b.d(fFloatValue9, y11Var.f44669e[0], iArr[0]);
                    int iD2 = i0.b.d(fFloatValue9, y11Var.f44669e[1], iArr[1]);
                    int iD3 = i0.b.d(fFloatValue9, y11Var.f44669e[2], iArr[2]);
                    int iD4 = i0.b.d(fFloatValue9, y11Var.f44669e[3], iArr[3]);
                    t11 t11Var = y11Var.A;
                    t11Var.f42753a.n(iD, iD2, iD3, iD4);
                    t11Var.invalidate();
                }
                y11Var.f44674w.invalidate();
                break;
            case 21:
                b6.a aVar = (b6.a) this.f666b;
                int[] iArr2 = (int[]) this.f667c;
                aVar.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = iIntValue - aVar.f2034c;
                ((zk0) aVar.d).scrollBy(0, i15);
                iArr2[0] = iArr2[0] + i15;
                aVar.f2034c = iIntValue;
                break;
            case 22:
                oh1 oh1Var = (oh1) this.f666b;
                fi fiVar = (fi) this.f667c;
                oh1Var.getClass();
                oh1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fiVar.invalidate();
                break;
            case 23:
                TextView textView = (TextView) this.f666b;
                TextView textView2 = (TextView) this.f667c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                rf.g gVar = (rf.g) this.f666b;
                tf.d dVar = (tf.d) this.f667c;
                gVar.getClass();
                dVar.f48182f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar.f46955b;
                int size = arrayList3.size();
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    tf.d dVar2 = (tf.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f48182f = (int) ((dVar2.f48183g / 255.0f) * (255 - dVar.f48182f));
                    }
                }
                gVar.invalidate();
                break;
            case 25:
                rf.g gVar2 = (rf.g) this.f666b;
                tf.b bVar = (tf.b) this.f667c;
                gVar2.getClass();
                float fFloatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList4 = gVar2.f46958c;
                int size2 = arrayList4.size();
                while (i10 < size2) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    tf.b bVar2 = (tf.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (fFloatValue10 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - fFloatValue10) * bVar2.f48170e);
                    }
                }
                gVar2.invalidate();
                break;
            case 26:
                rf.n nVar = (rf.n) this.f666b;
                rf.o oVar2 = (rf.o) this.f667c;
                nVar.getClass();
                oVar2.f47013r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 27:
                j4.x0 x0Var = (j4.x0) this.f666b;
                lh.p pVar = (lh.p) this.f667c;
                x0Var.getClass();
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x0Var.f12711b = iIntValue2;
                pVar.d(iIntValue2);
                break;
            default:
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.f666b;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f667c;
                u0Var.f25691c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
                break;
        }
    }
}
