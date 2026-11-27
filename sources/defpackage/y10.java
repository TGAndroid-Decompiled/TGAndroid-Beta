package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
public final class y10 extends a {
    public final byte G1;
    public final Object H1;

    public y10(byte b, Context context, Object obj) {
        super(context, null);
        this.G1 = b;
        this.H1 = obj;
    }

    @Override
    public final boolean B() {
        switch (this.G1) {
            case 2:
                li3 li3Var = ((uj3) this.H1).H3;
                if (li3Var != null && li3Var.c()) {
                    return true;
                }
                return false;
            default:
                return super.B();
        }
    }

    @Override
    public final void C(boolean z) {
        float f;
        switch (this.G1) {
            case 2:
                li3 li3Var = ((uj3) this.H1).H3;
                if (li3Var != null && li3Var.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    animate.alpha(f).start();
                }
                super.C(z);
                return;
            default:
                super.C(z);
                return;
        }
    }

    @Override
    public final void H(int i, boolean z) {
        ImageView imageView;
        switch (this.G1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                super.H(i, z);
                if (!z) {
                    profileActivity.I5 = i;
                    profileActivity.W3();
                    ImageView imageView2 = profileActivity.Y0;
                    if (imageView2 != null) {
                        imageView2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                }
                if (profileActivity.J0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.H(i, z);
                return;
        }
    }

    @Override
    public final boolean Q(View view) {
        switch (this.G1) {
            case 2:
                if (!super.Q(view) && view != ((uj3) this.H1).n0) {
                    return false;
                }
                return true;
            default:
                return super.Q(view);
        }
    }

    @Override
    public final void R(View[] viewArr, boolean[] zArr) {
        switch (this.G1) {
            case 2:
                super.R(viewArr, zArr);
                ((uj3) this.H1).h.a(true, true);
                return;
            default:
                super.R(viewArr, zArr);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 2:
                uj3 uj3Var = (uj3) this.H1;
                hj3 hj3Var = uj3Var.Y;
                if (hj3Var != null && hj3Var.getAlpha() > 0.0f && uj3Var.b.f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void o(boolean z) {
        switch (this.G1) {
            case 2:
                uj3 uj3Var = (uj3) this.H1;
                uj3Var.Y.r.getText().clear();
                if (z && uj3Var.Y.r.isFocused()) {
                    hl.t1(uj3Var.Y.r);
                }
                uj3Var.Y.r.clearFocus();
                uj3Var.Z.b(false);
                return;
            default:
                super.o(z);
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.G1) {
            case 6:
                super.onLayout(z, i, i2, i3, i4);
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) this.H1).i4(false);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                d26 d26Var = profileActivity.Y;
                Rect rect = profileActivity.M2;
                d26Var.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void setAlpha(float f) {
        int i;
        byte b = this.G1;
        Object obj = this.H1;
        switch (b) {
            case 0:
                super.setAlpha(f);
                ((j20) obj).b.invalidate();
                return;
            case 1:
                n12 n12Var = (n12) obj;
                m02 m02Var = n12Var.A2;
                TextView textView = n12Var.g3;
                m02 m02Var2 = n12Var.u3;
                float alpha = getAlpha();
                super.setAlpha(f);
                if (alpha != f) {
                    float f2 = 0.0f;
                    if (textView != null) {
                        float f3 = 1.0f - f;
                        textView.setAlpha(f3);
                        if (f3 > 0.0f) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        textView.setVisibility(i);
                    }
                    n12Var.M0();
                    n12Var.b.invalidate();
                    if (m02Var != null && m02Var2 != null) {
                        Object tag = m02Var.getTag();
                        f12 f12Var = n12Var.v2;
                        if (tag == null) {
                            if (f12Var == null || f12Var.M()) {
                                m02Var2.setAlpha(1.0f - f);
                                m02Var2.setTranslationY(hl.L(44.0f) * f);
                            }
                            m02Var.setTranslationY(hl.L(48.0f) * f);
                            return;
                        } else if (f12Var == null) {
                            if (f == 0.0f) {
                                f2 = 1.0f;
                            }
                            if (m02Var2.getAlpha() != f2) {
                                m02Var2.setAlpha(f2);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
            case 6:
            default:
                super.setAlpha(f);
                return;
            case 3:
                super.setAlpha(f);
                ((PhotoViewer) obj).f0.invalidate();
                return;
            case 4:
                super.setAlpha(f);
                ((ui8) obj).b.invalidate();
                return;
            case 5:
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((xk8) obj).b.invalidate();
                    return;
                }
                return;
            case 7:
                super.setAlpha(f);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                secretMediaViewer.r.setAlpha(f);
                secretMediaViewer.n.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setTag(Object obj) {
        boolean z;
        switch (this.G1) {
            case 5:
                super.setTag(obj);
                xk8 xk8Var = (xk8) this.H1;
                y10 y10Var = xk8Var.H1;
                if (y10Var != null && y10Var.getTag() != null) {
                    if (vm2.h(aob.v0(aob.h5, xk8Var.J0)) > 0.699999988079071d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hl.l3(xk8Var, z);
                    return;
                }
                e eVar = xk8Var.l1;
                if (eVar != null) {
                    hl.l3(xk8Var, eVar.isLightStatusBar());
                    return;
                }
                return;
            default:
                super.setTag(obj);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        View view;
        switch (this.G1) {
            case 2:
                if (f != getTranslationY() && (view = ((uj3) this.H1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f);
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.G1) {
            case 1:
                super.setVisibility(i);
                ((n12) this.H1).M0();
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    @Override
    public final void y() {
        switch (this.G1) {
            case 2:
                super.y();
                ((uj3) this.H1).h.a(false, true);
                return;
            default:
                super.y();
                return;
        }
    }

    public y10(fn7 fn7Var, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.G1 = b;
        this.H1 = fn7Var;
    }
}
