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
public final class x20 extends a {
    public final byte G1;
    public final Object H1;

    public x20(byte b, Context context, Object obj) {
        super(context, null);
        this.G1 = b;
        this.H1 = obj;
    }

    @Override
    public final boolean A() {
        switch (this.G1) {
            case 2:
                dj3 dj3Var = ((nk3) this.H1).H3;
                if (dj3Var != null && dj3Var.c()) {
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
                dj3 dj3Var = ((nk3) this.H1).H3;
                if (dj3Var != null && dj3Var.c() && getBackButton() != null) {
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
                    profileActivity.N5 = i;
                    profileActivity.Z3();
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
                if (!super.Q(view) && view != ((nk3) this.H1).n0) {
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
                ((nk3) this.H1).h.a(true, true);
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
                nk3 nk3Var = (nk3) this.H1;
                zj3 zj3Var = nk3Var.Y;
                if (zj3Var != null && zj3Var.getAlpha() > 0.0f && nk3Var.b.f) {
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
                nk3 nk3Var = (nk3) this.H1;
                nk3Var.Y.r.getText().clear();
                if (z && nk3Var.Y.r.isFocused()) {
                    gm.t1(nk3Var.Y.r);
                }
                nk3Var.Y.r.clearFocus();
                nk3Var.Z.b(false);
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
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) this.H1).l4(false);
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
                ne6 ne6Var = profileActivity.Y;
                Rect rect = profileActivity.M2;
                ne6Var.getHitRect(rect);
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
                ((i30) obj).b.invalidate();
                return;
            case 1:
                i22 i22Var = (i22) obj;
                h12 h12Var = i22Var.A2;
                TextView textView = i22Var.g3;
                h12 h12Var2 = i22Var.u3;
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
                    i22Var.L0();
                    i22Var.b.invalidate();
                    if (h12Var != null && h12Var2 != null) {
                        Object tag = h12Var.getTag();
                        a22 a22Var = i22Var.v2;
                        if (tag == null) {
                            if (a22Var == null || a22Var.M()) {
                                h12Var2.setAlpha(1.0f - f);
                                h12Var2.setTranslationY(gm.L(44.0f) * f);
                            }
                            h12Var.setTranslationY(gm.L(48.0f) * f);
                            return;
                        } else if (a22Var == null) {
                            if (f == 0.0f) {
                                f2 = 1.0f;
                            }
                            if (h12Var2.getAlpha() != f2) {
                                h12Var2.setAlpha(f2);
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
                ((ih8) obj).b.invalidate();
                return;
            case 5:
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((kj8) obj).b.invalidate();
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
                kj8 kj8Var = (kj8) this.H1;
                x20 x20Var = kj8Var.H1;
                if (x20Var != null && x20Var.getTag() != null) {
                    if (on2.h(cmb.v0(cmb.g5, kj8Var.J0)) > 0.699999988079071d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gm.l3(kj8Var, z);
                    return;
                }
                d dVar = kj8Var.l1;
                if (dVar != null) {
                    gm.l3(kj8Var, dVar.isLightStatusBar());
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
                if (f != getTranslationY() && (view = ((nk3) this.H1).fragmentView) != null) {
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
                ((i22) this.H1).L0();
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
                ((nk3) this.H1).h.a(false, true);
                return;
            default:
                super.x();
                return;
        }
    }

    public x20(jm7 jm7Var, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.G1 = b;
        this.H1 = jm7Var;
    }
}
