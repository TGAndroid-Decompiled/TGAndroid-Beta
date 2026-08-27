package gh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.fb0;
import org.telegram.ui.ig0;
import org.telegram.ui.j9;
import org.telegram.ui.pn;
import org.telegram.ui.q91;
import org.telegram.ui.x71;

public final class q4 extends zu0 {

    public final int f7506s0;

    public final Object f7507t0;

    public q4(Object obj, Context context, int i10) {
        super(context, null);
        this.f7506s0 = i10;
        this.f7507t0 = obj;
    }

    @Override
    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        switch (this.f7506s0) {
            case 1:
                j9 j9Var = (j9) this.f7507t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && j9Var.V != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    j9Var.V.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                } else {
                    canvas.drawRect(rect, paint);
                }
                break;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f7507t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f35435q0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    contactsActivity.f35435q0.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha2 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha2);
                } else {
                    canvas.drawRect(rect, paint);
                }
                break;
            case 8:
                x71 x71Var = (x71) this.f7507t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && x71Var.S != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    x71Var.S.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha3 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha3);
                } else {
                    canvas.drawRect(rect, paint);
                }
                break;
            case 9:
                q91 q91Var = (q91) this.f7507t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && q91Var.f41584z0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    q91Var.f41584z0.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha4 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha4);
                } else {
                    canvas.drawRect(rect, paint);
                }
                break;
            default:
                super.J(canvas, f10, rect, paint, z10);
                break;
        }
    }

    @Override
    public boolean P() {
        switch (this.f7506s0) {
            case 3:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f7506s0) {
            case 3:
                return false;
            default:
                return super.Q();
        }
    }

    @Override
    public void d() {
        switch (this.f7506s0) {
            case 8:
                ((x71) this.f7507t0).p0();
                break;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f7506s0) {
            case 1:
                j9 j9Var = (j9) this.f7507t0;
                og.d dVar = j9Var.W;
                og.d dVar2 = j9Var.V;
                jg.e eVar = j9Var.U;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    j9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f19455n) {
                        RecordingCanvas recordingCanvasA = dVar2.a(measuredWidth, measuredHeight);
                        recordingCanvasA.drawColor(j9Var.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(recordingCanvasA, -3);
                        }
                        dVar2.b();
                    }
                    if (dVar != null && !dVar.f19455n) {
                        RecordingCanvas recordingCanvasA2 = dVar.a(measuredWidth, measuredHeight);
                        recordingCanvasA2.drawColor(j9Var.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(recordingCanvasA2, -2);
                        }
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f7507t0;
                og.d dVar3 = contactsActivity.f35437r0;
                og.d dVar4 = contactsActivity.f35435q0;
                jg.e eVar2 = contactsActivity.f35434p0;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.f19455n) {
                        RecordingCanvas recordingCanvasA3 = dVar4.a(measuredWidth2, measuredHeight2);
                        recordingCanvasA3.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(recordingCanvasA3, -3);
                        }
                        dVar4.b();
                    }
                    if (dVar3 != null && !dVar3.f19455n) {
                        RecordingCanvas recordingCanvasA4 = dVar3.a(measuredWidth2, measuredHeight2);
                        recordingCanvasA4.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(recordingCanvasA4, -2);
                        }
                        dVar3.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 8:
                x71 x71Var = (x71) this.f7507t0;
                og.d dVar5 = x71Var.T;
                og.d dVar6 = x71Var.S;
                jg.e eVar3 = x71Var.R;
                if (Build.VERSION.SDK_INT >= 31 && eVar3 != null) {
                    x71Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.f19455n) {
                        RecordingCanvas recordingCanvasA5 = dVar6.a(measuredWidth3, measuredHeight3);
                        recordingCanvasA5.drawColor(x71Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(recordingCanvasA5, -3);
                        }
                        dVar6.b();
                    }
                    if (dVar5 != null && !dVar5.f19455n) {
                        RecordingCanvas recordingCanvasA6 = dVar5.a(measuredWidth3, measuredHeight3);
                        recordingCanvasA6.drawColor(x71Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(recordingCanvasA6, -2);
                        }
                        dVar5.b();
                    }
                }
                super.dispatchDraw(canvas);
                if (!x71Var.I) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, x71Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), x71Var.O);
                }
                break;
            case 9:
                q91 q91Var = (q91) this.f7507t0;
                og.d dVar7 = q91Var.A0;
                og.d dVar8 = q91Var.f41584z0;
                jg.e eVar4 = q91Var.f41583y0;
                if (Build.VERSION.SDK_INT >= 31 && eVar4 != null) {
                    q91.W(q91Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.f19455n) {
                        RecordingCanvas recordingCanvasA7 = dVar8.a(measuredWidth4, measuredHeight4);
                        recordingCanvasA7.drawColor(q91Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(recordingCanvasA7, -3);
                        }
                        dVar8.b();
                    }
                    if (dVar7 != null && !dVar7.f19455n) {
                        RecordingCanvas recordingCanvasA8 = dVar7.a(measuredWidth4, measuredHeight4);
                        recordingCanvasA8.drawColor(q91Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(recordingCanvasA8, -2);
                        }
                        dVar7.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f7506s0) {
            case 2:
                if (motionEvent.getY() < ((ab0) this.f7507t0).P) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f7506s0) {
            case 2:
                Drawable drawableD = ((pn) ((ab0) this.f7507t0).V.B).d();
                return drawableD != null ? drawableD : super.getNewDrawable();
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        switch (this.f7506s0) {
            case 3:
                return ((kz0) this.f7507t0).f30229c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int measuredWidth;
        int i16;
        int i17;
        int measuredHeight;
        int measuredHeight2;
        switch (this.f7506s0) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                j9 j9Var = (j9) this.f7507t0;
                j9Var.g0();
                j9Var.h0();
                break;
            case 2:
            case 3:
            case 6:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                ContactsActivity contactsActivity = (ContactsActivity) this.f7507t0;
                contactsActivity.h0();
                contactsActivity.k0();
                contactsActivity.m0();
                contactsActivity.i0();
                ContactsActivity.d0(contactsActivity);
                break;
            case 5:
                fb0 fb0Var = (fb0) this.f7507t0;
                int scrollY = fb0Var.F.getScrollY();
                super.onLayout(z10, i10, i11, i12, i13);
                if (scrollY != fb0Var.F.getScrollY()) {
                    kn0 kn0Var = fb0Var.F;
                    kn0Var.setTranslationY(kn0Var.getScrollY() - scrollY);
                    fb0Var.F.animate().cancel();
                    fb0Var.F.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f23706w).start();
                }
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f7507t0;
                int childCount = getChildCount();
                int emojiPadding = R() <= AndroidUtilities.dp(20.0f) ? popupNotificationActivity.f35832b.getEmojiPadding() : 0;
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int i19 = layoutParams.gravity;
                        if (i19 == -1) {
                            i19 = 51;
                        }
                        int i20 = i19 & 112;
                        int i21 = i19 & 7;
                        if (i21 != 1) {
                            if (i21 != 5) {
                                measuredWidth = layoutParams.leftMargin;
                            } else {
                                i14 = i12 - measuredWidth2;
                                i15 = layoutParams.rightMargin;
                            }
                            if (i20 != 16) {
                                if (i20 != 80) {
                                    measuredHeight = layoutParams.topMargin;
                                } else {
                                    i16 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                                    i17 = layoutParams.bottomMargin;
                                }
                                if (popupNotificationActivity.f35832b.u0(childAt)) {
                                    measuredHeight2 = getMeasuredHeight();
                                    if (emojiPadding != 0) {
                                        measuredHeight2 -= emojiPadding;
                                    }
                                    measuredHeight = measuredHeight2;
                                } else if (childAt == popupNotificationActivity.f35832b.I1) {
                                    measuredHeight = ((popupNotificationActivity.A.getMeasuredHeight() + popupNotificationActivity.A.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                    measuredWidth = ((popupNotificationActivity.A.getMeasuredWidth() + popupNotificationActivity.A.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                                }
                                childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight3 + measuredHeight);
                            } else {
                                i16 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i17 = layoutParams.bottomMargin;
                            }
                            measuredHeight = i16 - i17;
                            if (popupNotificationActivity.f35832b.u0(childAt)) {
                                measuredHeight2 = getMeasuredHeight();
                                if (emojiPadding != 0) {
                                    measuredHeight2 -= emojiPadding;
                                }
                                measuredHeight = measuredHeight2;
                            } else if (childAt == popupNotificationActivity.f35832b.I1) {
                                measuredHeight = ((popupNotificationActivity.A.getMeasuredHeight() + popupNotificationActivity.A.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                measuredWidth = ((popupNotificationActivity.A.getMeasuredWidth() + popupNotificationActivity.A.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                            }
                            childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight3 + measuredHeight);
                        } else {
                            i14 = (((i12 - i10) - measuredWidth2) / 2) + layoutParams.leftMargin;
                            i15 = layoutParams.rightMargin;
                        }
                        measuredWidth = i14 - i15;
                        if (i20 != 16) {
                            if (i20 != 80) {
                                measuredHeight = layoutParams.topMargin;
                            } else {
                                i16 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                                i17 = layoutParams.bottomMargin;
                            }
                            if (popupNotificationActivity.f35832b.u0(childAt)) {
                                measuredHeight2 = getMeasuredHeight();
                                if (emojiPadding != 0) {
                                    measuredHeight2 -= emojiPadding;
                                }
                                measuredHeight = measuredHeight2;
                            } else if (childAt == popupNotificationActivity.f35832b.I1) {
                                measuredHeight = ((popupNotificationActivity.A.getMeasuredHeight() + popupNotificationActivity.A.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                measuredWidth = ((popupNotificationActivity.A.getMeasuredWidth() + popupNotificationActivity.A.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                            }
                            childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight3 + measuredHeight);
                        } else {
                            i16 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i17 = layoutParams.bottomMargin;
                        }
                        measuredHeight = i16 - i17;
                        if (popupNotificationActivity.f35832b.u0(childAt)) {
                            measuredHeight2 = getMeasuredHeight();
                            if (emojiPadding != 0) {
                                measuredHeight2 -= emojiPadding;
                            }
                            measuredHeight = measuredHeight2;
                        } else if (childAt == popupNotificationActivity.f35832b.I1) {
                            measuredHeight = ((popupNotificationActivity.A.getMeasuredHeight() + popupNotificationActivity.A.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                            measuredWidth = ((popupNotificationActivity.A.getMeasuredWidth() + popupNotificationActivity.A.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                        }
                        childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight3 + measuredHeight);
                    }
                }
                S();
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f7506s0) {
            case 0:
                y5 y5Var = (y5) this.f7507t0;
                ((FrameLayout.LayoutParams) y5Var.f7690y.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (((org.telegram.ui.ActionBar.n2) y5Var).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                ((FrameLayout.LayoutParams) y5Var.h.getLayoutParams()).topMargin = AndroidUtilities.dp(47.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (((org.telegram.ui.ActionBar.n2) y5Var).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                ((FrameLayout.LayoutParams) y5Var.f7685n.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (((org.telegram.ui.ActionBar.n2) y5Var).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                ((FrameLayout.LayoutParams) y5Var.f7688w.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (((org.telegram.ui.ActionBar.n2) y5Var).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                super.onMeasure(i10, i11);
                break;
            case 1:
                j9 j9Var = (j9) this.f7507t0;
                measureChildWithMargins(((org.telegram.ui.ActionBar.n2) j9Var).actionBar, i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) j9Var.I.getLayoutParams()).topMargin = ((org.telegram.ui.ActionBar.n2) j9Var).actionBar.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) j9Var.f39292b.getLayoutParams()).topMargin = ((org.telegram.ui.ActionBar.n2) j9Var).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) j9Var.f39298r.getLayoutParams()).topMargin = ((org.telegram.ui.ActionBar.n2) j9Var).actionBar.getMeasuredHeight();
                j9Var.i0();
                super.onMeasure(i10, i11);
                break;
            case 2:
            default:
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((kz0) this.f7507t0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                break;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f7507t0;
                measureChildWithMargins(((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar, i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) contactsActivity.f35421e.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) contactsActivity.U.getLayoutParams()).topMargin = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                break;
            case 5:
                fb0 fb0Var = (fb0) this.f7507t0;
                super.onMeasure(i10, i11);
                R();
                int i12 = this.f35375f;
                if (i12 != 0 && i12 < AndroidUtilities.dp(20.0f)) {
                    fb0Var.B.clearFocus();
                    fb0Var.G.clearFocus();
                }
                fb0Var.D.setVisibility(this.f35375f > AndroidUtilities.dp(20.0f) ? 8 : 0);
                break;
            case 6:
                ig0 ig0Var = (ig0) this.f7507t0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ig0Var.J.getLayoutParams();
                int iDp = ig0Var.h1() ? AndroidUtilities.dp(226.0f) : 0;
                if (ig0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    iDp -= R();
                }
                ec ecVar = ec.f28012w;
                if (ecVar == null || !ecVar.f28022l) {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + iDp;
                } else {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = rl.C(10.0f, ec.f28012w.f28016e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), iDp);
                }
                int i13 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) ig0Var.Q.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) ig0Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) ig0Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                TextView textView = ig0Var.f39082b0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                }
                if (R() > AndroidUtilities.dp(20.0f) && ig0Var.f39083c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !ig0Var.W) {
                    ValueAnimator valueAnimator = ig0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ig0Var.f39083c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f7507t0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f35832b.getEmojiPadding();
                }
                int i14 = size2;
                int childCount = getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f35832b.u0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f35832b.I1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i14), 1073741824));
                        }
                    }
                }
                break;
        }
    }
}
