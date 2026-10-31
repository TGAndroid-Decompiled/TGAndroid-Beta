package kg;

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
import org.telegram.messenger.us;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.w7;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ay;
import org.telegram.ui.px;
import org.telegram.ui.xw;
public final class g1 extends org.telegram.ui.ActionBar.l {
    public final int E1;
    public final Object F1;

    public g1(Object obj, Context context, int i10) {
        super(context, null);
        this.E1 = i10;
        this.F1 = obj;
    }

    @Override
    public void D(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.E1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.F1;
                super.D(i10, z10);
                if (!z10) {
                    profileActivity.C5 = i10;
                    profileActivity.z5();
                }
                if (!z10 && (imageView2 = profileActivity.X0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.D(i10, z10);
                return;
        }
    }

    @Override
    public boolean N(View view) {
        switch (this.E1) {
            case 4:
                if (!super.N(view) && view != ((ay) this.F1).m0) {
                    return false;
                }
                return true;
            default:
                return super.N(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.E1) {
            case 4:
                super.O(viewArr, zArr);
                ((ay) this.F1).h.a(true, true);
                return;
            default:
                super.O(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.E1) {
            case 4:
                ay ayVar = (ay) this.F1;
                px pxVar = ayVar.X;
                if (pxVar != null && pxVar.getAlpha() > 0.0f && ayVar.f35777b.f7021f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void k(boolean z10) {
        switch (this.E1) {
            case 4:
                ay ayVar = (ay) this.F1;
                ayVar.X.f26588r.getText().clear();
                if (z10 && ayVar.X.f26588r.isFocused()) {
                    org.telegram.messenger.i0.v1(ayVar.X.f26588r);
                }
                ayVar.X.f26588r.clearFocus();
                ayVar.Y.b(false);
                return;
            default:
                super.k(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.E1) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                RectF rectF = ProfileActivity.R6;
                ((ProfileActivity) this.F1).K5(false);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.E1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.F1;
                org.telegram.ui.l0 l0Var = profileActivity.X;
                Rect rect = profileActivity.K2;
                l0Var.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f7) {
        int i10;
        switch (this.E1) {
            case 0:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    ((i1) this.F1).f21586b.invalidate();
                    return;
                }
                return;
            case 1:
                super.setAlpha(f7);
                ((w7) this.F1).f21586b.invalidate();
                return;
            case 2:
                bi biVar = (bi) this.F1;
                ah ahVar = biVar.f24741x2;
                TextView textView = biVar.f24668d3;
                ah ahVar2 = biVar.f24718r3;
                float alpha = getAlpha();
                super.setAlpha(f7);
                if (alpha != f7) {
                    float f10 = 0.0f;
                    if (textView != null) {
                        float f11 = 1.0f - f7;
                        textView.setAlpha(f11);
                        if (f11 > 0.0f) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        textView.setVisibility(i10);
                    }
                    bi.I0(biVar);
                    biVar.f21586b.invalidate();
                    if (ahVar != null && ahVar2 != null) {
                        if (ahVar.getTag() == null) {
                            uh uhVar = biVar.f24721s2;
                            if (uhVar == null || uhVar.L()) {
                                ahVar2.setAlpha(1.0f - f7);
                                ahVar2.setTranslationY(org.telegram.messenger.i0.L(44.0f) * f7);
                            }
                            ahVar.setTranslationY(org.telegram.messenger.i0.L(48.0f) * f7);
                            return;
                        } else if (biVar.f24721s2 == null) {
                            if (f7 == 0.0f) {
                                f10 = 1.0f;
                            }
                            if (ahVar2.getAlpha() != f10) {
                                ahVar2.setAlpha(f10);
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
            case 3:
                super.setAlpha(f7);
                ((tf0) this.F1).f21586b.invalidate();
                return;
            case 4:
            case 6:
            default:
                super.setAlpha(f7);
                return;
            case 5:
                super.setAlpha(f7);
                ((PhotoViewer) this.F1).f33470e0.invalidate();
                return;
            case 7:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.F1;
                secretMediaViewer.f34013r.setAlpha(f7);
                secretMediaViewer.f34004n.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.E1) {
            case 0:
                super.setTag(obj);
                i1 i1Var = (i1) this.F1;
                g1 g1Var = i1Var.E1;
                if (g1Var != null && g1Var.getTag() != null) {
                    if (i0.b.h(t6.w0(t6.f21001h5, i1Var.I0)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.messenger.i0.p3(i1Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.k2 k2Var = i1Var.f11110i1;
                if (k2Var != null) {
                    org.telegram.messenger.i0.p3(i1Var, k2Var.isLightStatusBar());
                    return;
                }
                return;
            default:
                super.setTag(obj);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        View view;
        switch (this.E1) {
            case 4:
                if (f7 != getTranslationY() && (view = ((ay) this.F1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.E1) {
            case 2:
                super.setVisibility(i10);
                bi.I0((bi) this.F1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public void t() {
        switch (this.E1) {
            case 4:
                super.t();
                ((ay) this.F1).h.a(false, true);
                return;
            default:
                super.t();
                return;
        }
    }

    @Override
    public boolean x() {
        switch (this.E1) {
            case 4:
                xw xwVar = ((ay) this.F1).F3;
                if (xwVar != null && xwVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.x();
        }
    }

    @Override
    public void y(boolean z10) {
        float f7;
        switch (this.E1) {
            case 4:
                xw xwVar = ((ay) this.F1).F3;
                if (xwVar != null && xwVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                }
                super.y(z10);
                return;
            default:
                super.y(z10);
                return;
        }
    }

    public g1(us usVar, Context context, p6 p6Var, int i10) {
        super(context, p6Var);
        this.E1 = i10;
        this.F1 = usVar;
    }
}
