package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
public final class lc8 extends Transition {
    public final byte a;
    public final Object b;

    public lc8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.R1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.U1.getPendingMarginTopDiff()));
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.Y) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.Z.getPendingMarginTopDiff()));
                    return;
                }
                return;
            default:
                transitionValues.values.put("start", Boolean.FALSE);
                s4b s4bVar = (s4b) obj;
                transitionValues.values.put("offset", Integer.valueOf(s4bVar.b.getTop() + s4bVar.Y1));
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                View view = transitionValues.view;
                ic8 ic8Var = ((PhotoViewer) obj).U1;
                if (view == ic8Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(ic8Var.getScrollY()));
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                View view2 = transitionValues.view;
                ic8 ic8Var2 = ((SecretMediaViewer) obj).Z;
                if (view2 == ic8Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(ic8Var2.getScrollY()));
                    return;
                }
                return;
            default:
                transitionValues.values.put("start", Boolean.TRUE);
                s4b s4bVar = (s4b) obj;
                transitionValues.values.put("offset", Integer.valueOf(s4bVar.b.getTop() + s4bVar.Y1));
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.U1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new kc8(this, (byte) 0));
                    ofInt.addUpdateListener(new pv7(this, (byte) 6));
                    return ofInt;
                } else if (transitionValues2.view != photoViewer.R1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(photoViewer.R1, View.TRANSLATION_Y, 0.0f, intValue);
                    ofFloat.addListener(new kc8(this, (byte) 1));
                    return ofFloat;
                }
            case 1:
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new b49(this, (byte) 11));
                return ofFloat2;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.Z) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new by9(this, (byte) 0));
                    ofInt2.addUpdateListener(new b49(this, (byte) 16));
                    return ofInt2;
                } else if (transitionValues2.view != secretMediaViewer.Y || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                } else {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(secretMediaViewer.Y, View.TRANSLATION_Y, 0.0f, intValue2);
                    ofFloat3.addListener(new by9(this, (byte) 1));
                    return ofFloat3;
                }
            default:
                int i = ((s4b) obj).Y1;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat4.setDuration(250L);
                ofFloat4.addUpdateListener(new cn(this, intValue3, i, (byte) 5));
                return ofFloat4;
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
