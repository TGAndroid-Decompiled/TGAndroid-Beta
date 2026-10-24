package ei;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.zr;
public final class g extends ou {
    public org.telegram.ui.Components.la V;
    public dh.d W;
    public final org.telegram.ui.ActionBar.g6 f9071a0;
    public final org.telegram.ui.Components.ha f9072b0;
    public final m f9073c0;

    public g(m mVar, Context context, nw0 nw0Var, int i10, ci.b bVar, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ha haVar) {
        super(context, nw0Var, null, i10, true, bVar);
        this.f9073c0 = mVar;
        this.f9071a0 = g6Var;
        this.f9072b0 = haVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f9073c0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        rz emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f9073c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f30372w0 = false;
                emojiView.f30378x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof id) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f30308c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.N2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new ci.n1(1));
        }
    }

    @Override
    public final void g(Canvas canvas, ku kuVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.f9073c0;
        bh.j jVar = mVar.d;
        RectF rectF = mVar.f9436z0;
        rectF.set(0.0f, 0.0f, kuVar.getWidth(), AndroidUtilities.dp(29.0f) + kuVar.getHeight());
        int i12 = 0;
        if (mVar.f9413h0 != null) {
            if (this.W == null) {
                if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    if (roundedCorner == null) {
                        i11 = 0;
                    } else {
                        i11 = roundedCorner.getRadius();
                    }
                    if (roundedCorner2 == null) {
                        i10 = 0;
                    } else {
                        i10 = roundedCorner2.getRadius();
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                dh.d c10 = mVar.f9413h0.c(kuVar, null, false);
                c10.o(fh.c.i(this.f9071a0));
                this.W = c10;
                c10.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                dh.d dVar = this.W;
                dVar.f8029y = true;
                dVar.u(AndroidUtilities.dp(32.0f));
                dh.d dVar2 = this.W;
                dVar2.v.f8012g = 0.4f;
                dVar2.k();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.la(this.f9072b0, kuVar, 7, false);
            }
            mVar.h(this.V, canvas, mVar.f9436z0, AndroidUtilities.dp(29.0f), false, 0.0f, -kuVar.getY(), false);
            jVar.f4422l = AndroidUtilities.dp(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
        } else {
            Paint paint = mVar.e;
            FrameLayout frameLayout = mVar.J;
            if (mVar.f9420o0 > 0.0f && mVar.f9428u0 != null && mVar.f9426s0 != null && (bitmap = mVar.f9424r0) != null && !bitmap.isRecycled()) {
                mVar.f9427t0.reset();
                mVar.f9427t0.postScale(frameLayout.getWidth() / mVar.f9424r0.getWidth(), frameLayout.getHeight() / mVar.f9424r0.getHeight());
                float f7 = 0.0f;
                float f10 = 0.0f;
                ku kuVar2 = kuVar;
                while (i12 < 8 && kuVar2 != null) {
                    f7 += kuVar2.getX();
                    f10 += kuVar2.getY();
                    ViewParent parent = kuVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    kuVar2 = r14;
                }
                mVar.f9427t0.postTranslate(-f7, -f10);
                mVar.f9426s0.setLocalMatrix(mVar.f9427t0);
                mVar.f9428u0.setAlpha((int) (mVar.f9420o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f9428u0);
            }
            if (mVar.f9428u0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f9420o0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f9073c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f9073c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.f9073c0;
        g gVar = mVar.f9410f;
        ObjectAnimator objectAnimator = mVar.f9412g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.f9405b0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.W) {
            mVar.W = false;
            if (mVar.f9403a0 != i10) {
                ObjectAnimator objectAnimator2 = mVar.f9412g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != mVar.f9405b0) {
                    ObjectAnimator objectAnimator3 = mVar.f9412g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f9403a0);
                    gu editText = gVar.getEditText();
                    int i11 = mVar.f9403a0;
                    mVar.f9405b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    mVar.f9412g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f9412g0.setInterpolator(zr.h);
                    mVar.f9412g0.addListener(new ah.b(this, 16));
                    mVar.f9412g0.start();
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void u() {
        this.f9073c0.L.e = true;
    }

    @Override
    public final void y() {
        this.f9073c0.L.a();
    }
}
