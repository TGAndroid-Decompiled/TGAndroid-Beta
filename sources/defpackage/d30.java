package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class d30 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final boolean b;
    public final Object c;

    public d30(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        rw9 rw9Var;
        d53 d53Var;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                bf0 bf0Var = (bf0) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bf0Var.setScaleX(floatValue);
                bf0Var.setScaleY(floatValue);
                if (!z) {
                    bf0Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 1:
                mc0 mc0Var = (mc0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mc0Var.n0(false, floatValue2);
                if (z) {
                    dc0 dc0Var = mc0Var.a;
                    dc0Var.x = floatValue2;
                    dc0Var.invalidate();
                    return;
                }
                return;
            case 2:
                rc2 rc2Var = (rc2) obj;
                rc2Var.Eb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rc2Var.invalidate();
                if (z && rc2Var.getParent() != null) {
                    ((View) rc2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                x53 x53Var = (x53) obj;
                x53Var.x = null;
                x53Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x53Var.k();
                x53Var.l();
                x53Var.n.setCustomEmojiEnterProgress(Utilities.i(x53Var.j, 1.0f, 0.0f));
                x53Var.a.invalidate();
                x53Var.m.invalidateOutline();
                if (x53Var.w) {
                    x53Var.j(z, x53Var.j);
                    return;
                }
                return;
            case 4:
                py5 py5Var = (py5) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                py5Var.e = floatValue3;
                if (!z) {
                    py5Var.c.setAlpha(1.0f - floatValue3);
                }
                py5Var.b.invalidate();
                return;
            case 5:
                j37 j37Var = (j37) obj;
                j37Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j37Var.invalidate();
                if (z) {
                    j37Var.requestLayout();
                    return;
                }
                return;
            case 6:
                j67 j67Var = (j67) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j67Var.E = floatValue4;
                j67Var.H.setAlpha(floatValue4);
                j67Var.K.setAlpha(j67Var.E);
                if (!z && (viewGroup = j67Var.Z) != null) {
                    viewGroup.setAlpha(j67Var.E);
                }
                j67Var.F.invalidate();
                j67Var.G.invalidate();
                return;
            case 7:
                vv7 vv7Var = (vv7) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vv7Var.e = floatValue5;
                if (!z) {
                    vv7Var.c.setAlpha(1.0f - floatValue5);
                }
                vv7Var.b.invalidate();
                return;
            case 8:
                tw9 tw9Var = (tw9) obj;
                tw9Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tw9Var.b.invalidate();
                tw9Var.c.invalidate();
                if (tw9Var.T) {
                    tw9Var.O.invalidate();
                }
                tw9Var.e();
                TextView textView = tw9Var.E;
                if (textView != null) {
                    textView.setAlpha(tw9Var.s);
                }
                if (!tw9Var.T && (rw9Var = tw9Var.O) != null && rw9Var.getSeekBarWaveform() != null) {
                    gx9 seekBarWaveform = tw9Var.O.getSeekBarWaveform();
                    if (z) {
                        d53Var = d53.g;
                    } else {
                        d53Var = d53.i;
                    }
                    seekBarWaveform.L = d53Var.getInterpolation(Utilities.i(tw9Var.s * 1.25f, 1.0f, 0.0f));
                    rc2 rc2Var2 = seekBarWaveform.n;
                    if (rc2Var2 != null) {
                        rc2Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                y5b y5bVar = (y5b) obj;
                y5bVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5bVar.invalidate();
                if (z) {
                    y5bVar.requestLayout();
                    return;
                }
                return;
            case 10:
                hkb hkbVar = (hkb) obj;
                hkbVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rkb rkbVar = hkbVar.C;
                if (rkbVar != null) {
                    rkbVar.invalidate();
                }
                nkb nkbVar = hkbVar.W;
                if (nkbVar != null && ((rc2) nkbVar).getCurrentMessagesGroup() == null && z) {
                    ((rc2) hkbVar.W).setSelectedBackgroundProgress(1.0f - hkbVar.U);
                    return;
                }
                return;
            default:
                dkc dkcVar = (dkc) obj;
                TextView[] textViewArr = dkcVar.h;
                dkcVar.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dkcVar.invalidate();
                if (z) {
                    textViewArr[0].setAlpha(1.0f - dkcVar.s);
                    textViewArr[0].setScaleX(1.0f - dkcVar.s);
                    textViewArr[0].setScaleY(1.0f - dkcVar.s);
                    textViewArr[1].setAlpha(dkcVar.s);
                    textViewArr[1].setScaleX(dkcVar.s);
                    textViewArr[1].setScaleY(dkcVar.s);
                    return;
                }
                return;
        }
    }
}
