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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
public final class x10 extends a {
    public final byte G1;
    public final Object H1;

    public x10(byte b, Context context, Object obj) {
        super(context, null);
        this.G1 = b;
        this.H1 = obj;
    }

    @Override
    public final boolean A() {
        switch (this.G1) {
            case 2:
                rh3 rh3Var = ((cj3) this.H1).H3;
                if (rh3Var != null && rh3Var.c()) {
                    return true;
                }
                return false;
            default:
                return super.A();
        }
    }

    @Override
    public final void B(boolean z) {
        float f;
        switch (this.G1) {
            case 2:
                rh3 rh3Var = ((cj3) this.H1).H3;
                if (rh3Var != null && rh3Var.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    animate.alpha(f).start();
                }
                super.B(z);
                return;
            default:
                super.B(z);
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
                    profileActivity.V3();
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
                if (!super.Q(view) && view != ((cj3) this.H1).n0) {
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
                ((cj3) this.H1).h.a(true, true);
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
                cj3 cj3Var = (cj3) this.H1;
                pi3 pi3Var = cj3Var.Y;
                if (pi3Var != null && pi3Var.getAlpha() > 0.0f && cj3Var.b.f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void n(boolean z) {
        switch (this.G1) {
            case 2:
                cj3 cj3Var = (cj3) this.H1;
                cj3Var.Y.r.getText().clear();
                if (z && cj3Var.Y.r.isFocused()) {
                    gl.t1(cj3Var.Y.r);
                }
                cj3Var.Y.r.clearFocus();
                cj3Var.Z.b(false);
                return;
            default:
                super.n(z);
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.G1) {
            case 6:
                super.onLayout(z, i, i2, i3, i4);
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) this.H1).h4(false);
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
                oc6 oc6Var = profileActivity.Y;
                Rect rect = profileActivity.M2;
                oc6Var.getHitRect(rect);
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
                ((i20) obj).b.invalidate();
                return;
            case 1:
                x02 x02Var = (x02) obj;
                wz1 wz1Var = x02Var.A2;
                TextView textView = x02Var.g3;
                wz1 wz1Var2 = x02Var.u3;
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
                    x02Var.L0();
                    x02Var.b.invalidate();
                    if (wz1Var != null && wz1Var2 != null) {
                        Object tag = wz1Var.getTag();
                        p02 p02Var = x02Var.v2;
                        if (tag == null) {
                            if (p02Var == null || p02Var.N()) {
                                wz1Var2.setAlpha(1.0f - f);
                                wz1Var2.setTranslationY(gl.L(44.0f) * f);
                            }
                            wz1Var.setTranslationY(gl.L(48.0f) * f);
                            return;
                        } else if (p02Var == null) {
                            if (f == 0.0f) {
                                f2 = 1.0f;
                            }
                            if (wz1Var2.getAlpha() != f2) {
                                wz1Var2.setAlpha(f2);
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
                ((gf8) obj).b.invalidate();
                return;
            case 5:
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((jh8) obj).b.invalidate();
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
                jh8 jh8Var = (jh8) this.H1;
                x10 x10Var = jh8Var.H1;
                if (x10Var != null && x10Var.getTag() != null) {
                    if (bm2.h(bkb.v0(bkb.g5, jh8Var.J0)) > 0.699999988079071d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gl.m3(jh8Var, z);
                    return;
                }
                d dVar = jh8Var.l1;
                if (dVar != null) {
                    gl.m3(jh8Var, dVar.isLightStatusBar());
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
                if (f != getTranslationY() && (view = ((cj3) this.H1).fragmentView) != null) {
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
                ((x02) this.H1).L0();
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    @Override
    public final void x() {
        switch (this.G1) {
            case 2:
                super.x();
                ((cj3) this.H1).h.a(false, true);
                return;
            default:
                super.x();
                return;
        }
    }

    public x10(gk7 gk7Var, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.G1 = b;
        this.H1 = gk7Var;
    }
}
