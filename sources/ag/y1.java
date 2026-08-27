package ag;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a61;
import org.telegram.ui.at0;
import org.telegram.ui.b5;
import org.telegram.ui.c41;
import org.telegram.ui.d51;
import org.telegram.ui.e51;
import org.telegram.ui.f51;
import org.telegram.ui.j51;
import org.telegram.ui.kt;
import org.telegram.ui.ky0;
import org.telegram.ui.l70;
import org.telegram.ui.m4;
import org.telegram.ui.nc1;
import org.telegram.ui.p5;
import org.telegram.ui.v10;
import org.telegram.ui.v31;
import org.telegram.ui.vs;
import org.telegram.ui.wb;
import org.telegram.ui.x11;
import org.telegram.ui.y11;

public final class y1 extends FrameLayout {

    public final int f705a;

    public Object f706b;

    public Object f707c;

    public y1(Context context, int i10) {
        super(context);
        this.f705a = i10;
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f706b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f707c).setText(charSequence);
    }

    public void c(String str, boolean z10) {
        ((i6) this.f707c).q(str, z10 && !LocaleController.isRTL, true);
    }

    public void d(String str, boolean z10) {
        ((i6) this.f706b).q(str, z10 && !LocaleController.isRTL, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        char c10;
        float f10;
        ?? r10;
        float f11;
        float f12;
        org.telegram.ui.Cells.z zVar;
        switch (this.f705a) {
            case 0:
                ((i2) this.f706b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                i2 i2Var = (i2) this.f706b;
                i2Var.f458f.setAlpha(((g2) this.f707c).G);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, i2Var.f458f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f706b;
                paint.setColor(g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.n2) ((p5) this.f707c).d).resourceProvider));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint);
                break;
            case 8:
                RectF rectF2 = (RectF) this.f706b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.y0 y0Var = (org.telegram.ui.Cells.y0) this.f707c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i10 = y0Var.d;
                float x8 = y0Var.getX();
                float f13 = y0Var.f25974c;
                c6 c6Var = y0Var.f25973b;
                if (c6Var != null) {
                    c6Var.m(x8, f13, measuredWidth, i10);
                } else {
                    g6.q(x8, f13, measuredWidth, i10);
                }
                float fDp = AndroidUtilities.dp(18.0f);
                float fDp2 = AndroidUtilities.dp(18.0f);
                Paint paintN = c6Var != null ? c6Var.N("paintChatActionBackground") : null;
                if (paintN == null) {
                    paintN = g6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, fDp, fDp2, paintN);
                if (c6Var != null ? c6Var.u0() : g6.a1()) {
                    float fDp3 = AndroidUtilities.dp(18.0f);
                    float fDp4 = AndroidUtilities.dp(18.0f);
                    Paint paintN2 = c6Var != null ? c6Var.N("paintChatActionBackgroundDarken") : null;
                    if (paintN2 == null) {
                        paintN2 = g6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, fDp3, fDp4, paintN2);
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f706b;
                paint2.setColor(g6.v0(g6.f22999a7, ((wb) this.f707c).f43686f.f44755e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                break;
            case 10:
                float fDp5 = AndroidUtilities.dp(20.0f);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f706b;
                path.rewind();
                path.addRoundRect(rectF3, fDp5, fDp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF3, 255, 31);
                super.dispatchDraw(canvas);
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                v10 v10Var = (v10) this.f707c;
                v10Var.b(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                v10Var.b(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.f706b;
                paint3.setColor(((ap) this.f707c).getThemedColor(g6.f23054d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint3);
                break;
            case 12:
                ky kyVar = (ky) this.f707c;
                if (!kyVar.C.f35027q0 && kyVar.f30220w > 0.0f) {
                    if (((Paint) this.f706b) == null) {
                        Paint paint4 = new Paint();
                        this.f706b = paint4;
                        paint4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f706b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f706b).setAlpha((int) (kyVar.f30220w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f706b);
                    canvas.restore();
                } else {
                    super.dispatchDraw(canvas);
                }
                break;
            case 13:
                i6 i6Var = (i6) this.f706b;
                int iDp = AndroidUtilities.dp(29.0f);
                int iDp2 = AndroidUtilities.dp(18.83f);
                i6 i6Var2 = (i6) this.f707c;
                int iLerp = AndroidUtilities.lerp(iDp, iDp2, i6Var2.g());
                i6Var.setBounds(getPaddingLeft(), iLerp - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + iLerp);
                i6Var.draw(canvas);
                int iDp3 = AndroidUtilities.dp(39.5f);
                i6Var2.setBounds(getPaddingLeft(), iDp3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + iDp3);
                i6Var2.draw(canvas);
                break;
            case 15:
                Paint paint5 = (Paint) this.f706b;
                wj0 wj0Var = (wj0) this.f707c;
                int i11 = wj0Var.I0;
                paint5.setColor((i11 == 1 || i11 == 2 || i11 == 4) ? i0.b.k(-1, 30) : i0.b.d(0.7f, g6.v0(g6.F8, wj0Var.f34250g0), g6.v0(g6.f23124h5, wj0Var.f34250g0)));
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float fG = wj0Var.g();
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - fG, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + fG);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF4, measuredWidth3, measuredWidth3, paint5);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, fG);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 21:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f707c;
                h5[] h5VarArr = profileActivity.f36040r;
                if (profileActivity.S4 != null) {
                    canvas.save();
                    canvas.translate(h5VarArr[0].getX(), h5VarArr[0].getY());
                    c10 = 2;
                    f10 = 0.0f;
                    r10 = 0;
                    f11 = 24.0f;
                    f12 = 14.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.S4.getMeasuredWidth(), profileActivity.S4.getMeasuredHeight(), (int) ((1.0f - profileActivity.O1) * 255.0f), 31);
                    profileActivity.S4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    c10 = 2;
                    f10 = 0.0f;
                    r10 = 0;
                    f11 = 24.0f;
                    f12 = 14.0f;
                }
                if (profileActivity.f36005l5 && profileActivity.U5 != f10 && profileActivity.f35992j5 != 1.0f) {
                    float measuredHeight2 = (h5VarArr[1].getMeasuredHeight() / 2.0f) + h5VarArr[1].getY();
                    float fDp6 = AndroidUtilities.dp(22.0f);
                    float x10 = ((h5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f35999k5)) - fDp6) - profileActivity.Z3();
                    profileActivity.f36019n5.setImageCoords(x10, measuredHeight2 - (fDp6 / 2.0f), fDp6, fDp6);
                    profileActivity.f36019n5.setAlpha(profileActivity.U5);
                    canvas.save();
                    float f14 = profileActivity.U5;
                    canvas.scale(f14, f14, profileActivity.f36019n5.getCenterX(), profileActivity.f36019n5.getCenterY());
                    profileActivity.f36019n5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f35992j5 == f10) {
                        if (((tc) this.f706b) == null) {
                            tc tcVar = new tc(this);
                            this.f706b = tcVar;
                            tcVar.h = new ky0(this, r10);
                        }
                        float fDp7 = (1.0f - profileActivity.f35992j5) * AndroidUtilities.dp(28.0f);
                        float textWidth = h5VarArr[c10].getTextWidth();
                        float fMax = Math.max(textWidth, profileActivity.P != null ? (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.P.getVisibilityFactor() : 0.0f) + fDp7;
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(x10 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f12), x10 + fMax + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f12));
                        tc tcVar2 = (tc) this.f706b;
                        tcVar2.f32735i = r10;
                        tcVar2.f32731c = r10;
                        tcVar2.a(rectF5);
                        tc tcVar3 = (tc) this.f706b;
                        tcVar3.f32740n = true;
                        int iK = i0.b.k(-1, 50);
                        tcVar3.f32734g.setColor((int) r10);
                        org.telegram.ui.Cells.z zVar2 = tcVar3.f32732e;
                        if (zVar2 != null) {
                            g6.B1(zVar2, iK, true);
                        }
                        tc tcVar4 = (tc) this.f706b;
                        tcVar4.c(canvas, tcVar4.f32734g);
                        org.telegram.ui.Cells.z zVar3 = tcVar4.f32732e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                        }
                        break;
                    } else {
                        tc tcVar5 = (tc) this.f706b;
                        if (tcVar5 != null && (zVar = tcVar5.f32732e) != null) {
                            zVar.setState(StateSet.NOTHING);
                            zVar.jumpToCurrentState();
                            break;
                        }
                    }
                }
                break;
            case 22:
                Rect rect = (Rect) this.f706b;
                x11 x11Var = (x11) this.f707c;
                if (x11Var.N) {
                    x11Var.f44251f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    x11Var.f44251f.draw(canvas);
                } else {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF6, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), x11Var.f44247a);
                }
                super.dispatchDraw(canvas);
                break;
            case 26:
                ImageReceiver imageReceiver = (ImageReceiver) this.f706b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f705a) {
            case 4:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                ig.d0 d0Var = (ig.d0) this.f707c;
                if (!d0Var.f11276k) {
                    return true;
                }
                d0Var.d();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f705a) {
            case 4:
                break;
            default:
                super.dispatchSetPressed(z10);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f705a) {
            case 6:
                m4 m4Var = (m4) this.f707c;
                v9 v9VarO = m4Var.L0.o(getContext());
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f706b;
                motionEventObtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (m4Var.L0.y() && m4Var.L0.o(getContext()).onTouchEvent(motionEventObtain)) {
                    return true;
                }
                if (v9VarO.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() != 0 || !m4Var.L0.y() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (m4Var.L0.o(getContext()).onTouchEvent(motionEventObtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            case 16:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f707c;
                if (g1Var.F != null) {
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.offsetLocation(g1Var.F.getX(), g1Var.F.getY());
                    boolean zDispatchTouchEvent = g1Var.F.dispatchTouchEvent(motionEvent);
                    motionEventObtain2.recycle();
                    if (action == 1 || action == 3) {
                        g1Var.F = null;
                    }
                    if (zDispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent motionEventObtain3 = MotionEvent.obtain(motionEvent);
                motionEventObtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean zOnTouchEvent = g1Var.B.onTouchEvent(motionEventObtain3);
                motionEventObtain3.recycle();
                boolean z10 = !g1Var.B.isInProgress() && ((GestureDetector) g1Var.C.f17823b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    g1Var.D = false;
                    g1Var.E = false;
                    o1.j jVar = g1Var.O;
                    if (!jVar.f19141f) {
                        float f10 = g1Var.M;
                        jVar.f19138b = f10;
                        jVar.f19139c = true;
                        o1.k kVar = jVar.f19147u;
                        int i10 = g1Var.I;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        kVar.f19154i = f11 >= ((float) i11) / 2.0f ? (i11 - i10) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        g1Var.O.f();
                    }
                    o1.j jVar2 = g1Var.P;
                    if (!jVar2.f19141f) {
                        float f12 = g1Var.N;
                        jVar2.f19138b = f12;
                        jVar2.f19139c = true;
                        jVar2.f19147u.f19154i = h7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
                        g1Var.P.f();
                    }
                }
                return zOnTouchEvent || z10;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        switch (this.f705a) {
            case 5:
                Path path = (Path) this.f706b;
                lh.c6 c6Var = (lh.c6) this.f707c;
                if (c6Var.h == null || (!((z10 = c6Var.f15751f) && view == c6Var.d) && (z10 || view != c6Var.f15749c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? c6Var.f15750e : 1.0f - c6Var.f15750e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild;
            case 18:
                if (view instanceof rc0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                return view != ((SecretMediaViewer) this.f706b).f36166w && super.drawChild(canvas, view, j10);
            case 24:
                Path path2 = (Path) this.f706b;
                c41 c41Var = (c41) this.f707c;
                RectF rectF = c41Var.N;
                if (view == c41Var.J || view == c41Var.f36946x) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(c41Var.P, 0.0f, c41Var.f36944s), getWidth(), AndroidUtilities.lerp(c41Var.Q, getHeight(), c41Var.f36944s));
                    boolean zDrawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return zDrawChild2;
                }
                if (view != c41Var.L) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path2.rewind();
                path2.addCircle(rectF.centerX() + c41Var.J.getX(), rectF.centerY() + c41Var.J.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.clipRect(0.0f, AndroidUtilities.lerp(c41Var.P, 0.0f, c41Var.f36944s), getWidth(), AndroidUtilities.lerp(c41Var.Q, getHeight(), c41Var.f36944s));
                canvas.translate(-c41Var.L.getX(), -c41Var.L.getY());
                canvas.translate(c41Var.J.getX() + rectF.left, c41Var.J.getY() + rectF.top);
                canvas.scale(rectF.width() / c41Var.L.getMeasuredWidth(), rectF.height() / c41Var.L.getMeasuredHeight(), c41Var.L.getX(), c41Var.L.getY());
                boolean zDrawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild3;
            case 25:
                if (view != ((a61) this.f707c).f36392d0 || !ig.g0.f11303b || !ig.g0.f11306f) {
                    return super.drawChild(canvas, view, j10);
                }
                for (int i10 = 0; i10 < ((a61) this.f707c).f36392d0.getChildCount(); i10++) {
                    View childAt = ((a61) this.f707c).f36392d0.getChildAt(i10);
                    if (childAt instanceof j51) {
                        j51 j51Var = (j51) childAt;
                        if (j51Var.getAnimatedScale() == 1.0f) {
                            ((Rect) this.f706b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f706b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        } else if (j51Var.getAnimatedScale() > 0.0f) {
                            ((Rect) this.f706b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            Rect rect = (Rect) this.f706b;
                            rect.set((int) (rect.centerX() - (j51Var.getAnimatedScale() * (((Rect) this.f706b).width() / 2.0f))), (int) (((Rect) this.f706b).centerY() - (j51Var.getAnimatedScale() * (((Rect) this.f706b).height() / 2.0f))), (int) ((j51Var.getAnimatedScale() * (((Rect) this.f706b).width() / 2.0f)) + ((Rect) this.f706b).centerX()), (int) ((j51Var.getAnimatedScale() * (((Rect) this.f706b).height() / 2.0f)) + ((Rect) this.f706b).centerY()));
                            canvas.save();
                            canvas.clipRect((Rect) this.f706b);
                            canvas.scale(j51Var.getAnimatedScale(), j51Var.getAnimatedScale(), ((Rect) this.f706b).centerX(), ((Rect) this.f706b).centerY());
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    } else if ((childAt instanceof TextView) || (childAt instanceof e51) || (childAt instanceof d51) || (childAt instanceof f51)) {
                        ((Rect) this.f706b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        canvas.save();
                        canvas.clipRect((Rect) this.f706b);
                        super.drawChild(canvas, view, j10);
                        canvas.restore();
                    }
                }
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f705a) {
            case 4:
                ig.d0 d0Var = (ig.d0) this.f707c;
                float f10 = d0Var.f11286u;
                float f11 = rect.bottom;
                if (f10 != f11 && d0Var.v) {
                    d0Var.f11286u = f11;
                    y1 y1Var = d0Var.f11270c;
                    ig.c0 c0Var = d0Var.f11268a;
                    if (!d0Var.f11282q) {
                        float measuredHeight = d0Var.f11285t;
                        int iDp = AndroidUtilities.dp(32.0f);
                        int i10 = d0Var.f11289y;
                        if (i10 == 1 || i10 == 2) {
                            iDp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = iDp;
                        if (c0Var.getMeasuredHeight() + measuredHeight > (y1Var.getMeasuredHeight() - d0Var.f11286u) - f12) {
                            measuredHeight = ((y1Var.getMeasuredHeight() - d0Var.f11286u) - c0Var.getMeasuredHeight()) - f12;
                        }
                        if (measuredHeight < 0.0f) {
                            measuredHeight = 0.0f;
                        }
                        c0Var.animate().translationY(measuredHeight).setDuration(250L).setUpdateListener(new ig.x(d0Var, 1)).setInterpolator(er.f28122f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f705a) {
            case 28:
                super.invalidate();
                org.telegram.ui.ActionBar.q0 q0Var = ((nc1) this.f707c).f40774p0;
                if (q0Var != null) {
                    q0Var.invalidate();
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f705a) {
            case 3:
                super.onAttachedToWindow();
                ((ig.o) this.f706b).c();
                break;
            case 4:
                super.onAttachedToWindow();
                ec.a(this, (gh.w0) this.f706b);
                break;
            case 18:
                super.onAttachedToWindow();
                kt ktVar = (kt) this.f707c;
                ktVar.A.onAttachedToWindow();
                ktVar.B.onAttachedToWindow();
                break;
            case 21:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f707c).f36019n5.onAttachedToWindow();
                break;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f706b).h.onAttachedToWindow();
                break;
            case 26:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f706b).onAttachedToWindow();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f705a) {
            case 16:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f707c;
                AndroidUtilities.setPreferredMaxRefreshRate(g1Var.f33568b, g1Var.d, g1Var.f33569c);
                g1Var.i(false);
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f705a) {
            case 3:
                super.onDetachedFromWindow();
                ((ig.o) this.f706b).d();
                break;
            case 4:
                super.onDetachedFromWindow();
                ec.h(this);
                break;
            case 18:
                super.onDetachedFromWindow();
                kt ktVar = (kt) this.f707c;
                ktVar.A.onDetachedFromWindow();
                ktVar.B.onDetachedFromWindow();
                break;
            case 21:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f707c).f36019n5.onDetachedFromWindow();
                break;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f706b).h.onDetachedFromWindow();
                break;
            case 26:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f706b).onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        float f10;
        float f11;
        switch (this.f705a) {
            case 14:
                dd0 dd0Var = (dd0) this.f707c;
                Drawable drawable2 = dd0Var.f27717a;
                if (drawable2 == null) {
                    super.onDraw(canvas);
                } else if ((drawable2 instanceof nb0) || (drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable)) {
                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    dd0Var.f27717a.draw(canvas);
                } else {
                    float fMax = Math.max(getMeasuredWidth() / dd0Var.f27717a.getIntrinsicWidth(), (getMeasuredHeight() + dd0Var.C) / dd0Var.f27717a.getIntrinsicHeight());
                    int iCeil = (int) Math.ceil(dd0Var.f27717a.getIntrinsicWidth() * fMax);
                    int iCeil2 = (int) Math.ceil(dd0Var.f27717a.getIntrinsicHeight() * fMax);
                    int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                    int measuredHeight = ((getMeasuredHeight() - iCeil2) + dd0Var.C) / 2;
                    dd0Var.f27717a.setBounds(measuredWidth, measuredHeight, iCeil + measuredWidth, iCeil2 + measuredHeight);
                    dd0Var.f27717a.draw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.f706b);
                break;
            case 17:
                canvas.save();
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.f707c;
                canvas.scale(l2Var.f33703b.getScaleX(), l2Var.f33703b.getScaleY(), l2Var.f33703b.getPivotX() + l2Var.f33703b.getLeft(), l2Var.f33703b.getPivotY() + l2Var.f33703b.getTop());
                Drawable drawable3 = (Drawable) this.f706b;
                drawable3.setBounds(l2Var.f33703b.getLeft() - AndroidUtilities.dp(2.0f), l2Var.f33703b.getTop() - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + l2Var.f33703b.getRight(), AndroidUtilities.dp(2.0f) + l2Var.f33703b.getBottom());
                drawable3.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                break;
            case 18:
                kt ktVar = (kt) this.f706b;
                Paint paint = ktVar.N;
                ImageReceiver imageReceiver = ktVar.B;
                ColorDrawable colorDrawable = ktVar.f39877u;
                ImageReceiver imageReceiver2 = ktVar.A;
                if (ktVar.f39881z != null && colorDrawable != null) {
                    if (ktVar.K && ktVar.v == null && ktVar.f39878w != null && !ktVar.f39862e0) {
                        ktVar.f39862e0 = true;
                        imageReceiver2.setVisible(false, false);
                        ol0.d(new b5(ktVar, 8));
                    }
                    if (ktVar.v != null) {
                        boolean z10 = ktVar.K;
                        if (z10) {
                            float f12 = ktVar.M;
                            if (f12 != 1.0f) {
                                float f13 = f12 + 0.13333334f;
                                ktVar.M = f13;
                                if (f13 > 1.0f) {
                                    ktVar.M = 1.0f;
                                }
                                ktVar.f39881z.invalidate();
                            } else if (!z10) {
                                f10 = ktVar.M;
                                if (f10 != 0.0f) {
                                    f11 = f10 - 0.13333334f;
                                    ktVar.M = f11;
                                    if (f11 < 0.0f) {
                                        ktVar.M = 0.0f;
                                    }
                                    ktVar.f39881z.invalidate();
                                }
                            }
                        } else if (!z10) {
                            f10 = ktVar.M;
                            if (f10 != 0.0f) {
                                f11 = f10 - 0.13333334f;
                                ktVar.M = f11;
                                if (f11 < 0.0f) {
                                    ktVar.M = 0.0f;
                                }
                                ktVar.f39881z.invalidate();
                            }
                        }
                        float f14 = ktVar.M;
                        if (f14 != 0.0f && ktVar.v != null) {
                            paint.setAlpha((int) (f14 * 255.0f));
                            if (paint.getAlpha() != 255) {
                                canvas.drawColor(g6.l1(ktVar.M, g6.v0(g6.f22999a7, ktVar.f39859c0)));
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (ktVar.F * 180.0f));
                    colorDrawable.setBounds(0, 0, ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    i0.c cVar = ktVar.f39873q;
                    int i10 = cVar.d;
                    int i11 = cVar.f10490b;
                    int i12 = i10 + i11;
                    int iMin = ktVar.V == 1 ? Math.min(ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight() - i12) - AndroidUtilities.dp(40.0f) : (int) (ktVar.S ? Math.min(ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight() - i12) - AndroidUtilities.dpf2(40.0f) : Math.min(ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight() - i12) / 1.8f);
                    float fMax2 = Math.max((iMin / 2) + i11 + (ktVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ktVar.f39881z.getHeight() - i12) - ktVar.I) / 2);
                    if (ktVar.S) {
                        fMax2 += AndroidUtilities.dp(40.0f);
                    }
                    canvas.translate(ktVar.f39881z.getWidth() / 2, ktVar.f39861e + fMax2);
                    int i13 = (int) (iMin * ((ktVar.F * 0.8f) / 0.8f));
                    if (ktVar.V == 3) {
                        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
                    }
                    if (ktVar.S) {
                        float f15 = i13;
                        float f16 = 0.6669f * f15;
                        imageReceiver2.setAlpha(ktVar.F);
                        float f17 = f15 - f16;
                        float f18 = f15 / 2.0f;
                        imageReceiver2.setImageCoords((f17 - f18) - (0.0546875f * f15), (f17 / 2.0f) - f18, f16, f16);
                        imageReceiver2.draw(canvas);
                        imageReceiver.setAlpha(ktVar.F);
                        float f19 = (-i13) / 2.0f;
                        imageReceiver.setImageCoords(f19, f19, f15, f15);
                        imageReceiver.draw(canvas);
                    } else {
                        imageReceiver2.setAlpha(ktVar.F);
                        float f20 = (-i13) / 2.0f;
                        float f21 = i13;
                        imageReceiver2.setImageCoords(f20, f20, f21, f21);
                        imageReceiver2.draw(canvas);
                    }
                    if (ktVar.C != null) {
                        canvas.save();
                        float f22 = (-i13) / 2.0f;
                        canvas.translate(f22, f22);
                        float f23 = i13;
                        canvas.scale(f23 / ktVar.C.getWidth(), f23 / ktVar.C.getHeight());
                        ktVar.C.setAlpha(ktVar.F);
                        if (ktVar.D == null) {
                            ktVar.D = new Path();
                        }
                        ktVar.D.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, ktVar.C.getWidth(), ktVar.C.getHeight());
                        float f24 = f23 / 8.0f;
                        ktVar.D.addRoundRect(rectF, f24, f24, Path.Direction.CW);
                        canvas.clipPath(ktVar.D);
                        ktVar.C.draw(canvas);
                        canvas.restore();
                    }
                    if (ktVar.V == 1 && !ktVar.f39869m && (drawable = ktVar.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = ktVar.J.getIntrinsicHeight();
                        int iDp = (int) (imageReceiver2.getDrawRegion().top - AndroidUtilities.dp(((ktVar.d / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
                        ktVar.J.setAlpha((int) ((1.0f - ktVar.f39864g) * 255.0f));
                        ktVar.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + iDp, intrinsicWidth / 2, iDp);
                        ktVar.J.draw(canvas);
                    }
                    StaticLayout staticLayout = ktVar.G;
                    if (staticLayout != null) {
                        if (ktVar.S) {
                            canvas.translate((-staticLayout.getWidth()) / 2.0f, ((-imageReceiver.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        } else {
                            canvas.translate((-staticLayout.getWidth()) / 2.0f, ((-imageReceiver2.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
                        }
                        kt.f39852f0.setAlpha((int) (ktVar.F * 255.0f));
                        ktVar.G.draw(canvas);
                    }
                    canvas.restore();
                    if (ktVar.E) {
                        if (ktVar.F != 1.0f) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j10 = jCurrentTimeMillis - ktVar.H;
                            ktVar.H = jCurrentTimeMillis;
                            ktVar.F = (j10 / 120.0f) + ktVar.F;
                            ktVar.f39881z.invalidate();
                            if (ktVar.F > 1.0f) {
                                ktVar.F = 1.0f;
                            }
                        }
                    } else if (ktVar.F != 0.0f) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long j11 = jCurrentTimeMillis2 - ktVar.H;
                        ktVar.H = jCurrentTimeMillis2;
                        ktVar.F -= j11 / 120.0f;
                        ktVar.f39881z.invalidate();
                        if (ktVar.F < 0.0f) {
                            ktVar.F = 0.0f;
                        }
                        if (ktVar.F == 0.0f) {
                            imageReceiver2.setImageBitmap((Drawable) null);
                            AndroidUtilities.unlockOrientation(ktVar.f39878w);
                            AndroidUtilities.runOnUIThread(new vs(ktVar, 1));
                            Bitmap bitmap = ktVar.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ktVar.v = null;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(ktVar.O, false, 1.0f, false);
                            ktVar.M = 0.0f;
                            try {
                                if (ktVar.f39880y.getParent() != null) {
                                    ((WindowManager) ktVar.f39878w.getSystemService("window")).removeView(ktVar.f39880y);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                        }
                    }
                    break;
                }
                break;
            case 23:
                SecretMediaViewer.b((SecretMediaViewer) this.f706b, canvas);
                break;
            case 27:
                int intrinsicHeight2 = g6.f23141i3.getIntrinsicHeight();
                g6.f23141i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                g6.f23141i3.draw(canvas);
                Paint paint2 = (Paint) this.f706b;
                paint2.setColor(((nc1) this.f707c).getThemedColor(g6.Sd));
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), paint2);
                break;
            case 28:
                int[] iArr = (int[]) this.f706b;
                nc1 nc1Var = (nc1) this.f707c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    float translationY = nc1Var.f40772o0.getTranslationY();
                    int i14 = iArr[1];
                    if (translationY != i14) {
                        nc1Var.f40772o0.setTranslationY(-i14);
                        nc1Var.f40774p0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < nc1Var.L) {
                        invalidate();
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        tc tcVar;
        switch (this.f705a) {
            case 21:
                return (((ProfileActivity) this.f707c).f35992j5 == 0.0f && (tcVar = (tc) this.f706b) != null && tcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f705a) {
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int iX = rl.x(275.0f, i15, 2);
                l70 l70Var = (l70) this.f707c;
                FrameLayout frameLayout = l70Var.f39968r;
                frameLayout.layout(0, iX, frameLayout.getMeasuredWidth(), l70Var.f39968r.getMeasuredHeight() + iX);
                int iDp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + iX;
                int measuredWidth = (getMeasuredWidth() - l70Var.f39965e.getMeasuredWidth()) / 2;
                ia iaVar = l70Var.f39965e;
                iaVar.layout(measuredWidth, iDp, iaVar.getMeasuredWidth() + measuredWidth, l70Var.f39965e.getMeasuredHeight() + iDp);
                m2.g gVar = l70Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), l70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - l70Var.f39967n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - l70Var.f39967n.getMeasuredWidth()) / 2;
                e1 e1Var = l70Var.f39967n;
                e1Var.layout(measuredWidth2, measuredHeight, e1Var.getMeasuredWidth() + measuredWidth2, l70Var.f39967n.getMeasuredHeight() + measuredHeight);
                int iDp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - l70Var.f39966f.getMeasuredWidth()) / 2;
                TextView textView = l70Var.f39966f;
                textView.layout(measuredWidth3, iDp2 - textView.getMeasuredHeight(), l70Var.f39966f.getMeasuredWidth() + measuredWidth3, iDp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f706b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int iDp3 = AndroidUtilities.dp(4) + (AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
                if (marginLayoutParams.topMargin != iDp3) {
                    marginLayoutParams.topMargin = iDp3;
                    frameLayout2.requestLayout();
                }
                break;
            case 20:
                int iDp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + rl.x(275.0f, ((i13 - i11) / 4) * 3, 2);
                int iDp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f706b;
                textView2.layout(iDp5, iDp4, textView2.getMeasuredWidth() + iDp5, textView2.getMeasuredHeight() + iDp4);
                int iDp6 = AndroidUtilities.dp(18.0f) + iDp4 + ((int) textView2.getTextSize());
                int iDp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f707c;
                textView3.layout(iDp7, iDp6, textView3.getMeasuredWidth() + iDp7, textView3.getMeasuredHeight() + iDp6);
                break;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f707c).V4();
                break;
            case 22:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f707c;
                if (secretMediaViewer.f36148n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f36148n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    v31 v31Var = secretMediaViewer.f36148n;
                    v31Var.layout(v31Var.getLeft(), currentActionBarHeight, secretMediaViewer.f36148n.getRight(), secretMediaViewer.f36148n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f36157r != null && secretMediaViewer.f36148n != null) {
                    int measuredHeight2 = (secretMediaViewer.f36148n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f36148n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    w3 w3Var = secretMediaViewer.f36157r;
                    w3Var.layout(w3Var.getLeft(), measuredHeight2, secretMediaViewer.f36157r.getRight(), secretMediaViewer.f36157r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.W != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    at0 at0Var = secretMediaViewer.W;
                    at0Var.layout(at0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.W.getRight(), secretMediaViewer.W.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f36133f;
                if (view != null) {
                    int i16 = i13 - i11;
                    view.layout(0, i16, i12 - i10, AndroidUtilities.navigationBarHeight + i16);
                }
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        f2.k0 xVar;
        switch (this.f705a) {
            case 0:
                super.onMeasure(i10, rl.B(2.0f, ((g2) this.f707c).f396s, 1073741824));
                break;
            case 6:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, rl.B(8.0f, ((LinearLayout) this.f706b).getMeasuredHeight(), 1073741824));
                break;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                break;
            case 13:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                break;
            case 22:
                x11 x11Var = (x11) this.f707c;
                View view = x11Var.D;
                View view2 = x11Var.E;
                LinearLayout linearLayout = x11Var.v;
                TextView textView = x11Var.f44254s;
                zk0 zk0Var = x11Var.f44257y;
                boolean z10 = x11Var.O.L;
                int iDp = AndroidUtilities.dp(12.0f);
                if (z10) {
                    zk0Var.setLayoutParams(z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    zk0Var.setPadding(iDp, 0, iDp, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(z5.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    zk0Var.setPadding(iDp, iDp / 2, iDp, iDp);
                    if (linearLayout != null) {
                        zk0Var.setLayoutParams(z5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        zk0Var.setLayoutParams(z5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z10) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    int i12 = textView != null ? 136 : 80;
                    view2.setVisibility(0);
                    view2.setLayoutParams(z5.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(z5.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (x11Var.N != z10) {
                    y11 y11Var = x11Var.d;
                    if (z10) {
                        y11Var.getParentActivity();
                        xVar = new f2.k0(0, false);
                    } else {
                        y11Var.getParentActivity();
                        xVar = new f2.x(3, false);
                    }
                    x11Var.C = xVar;
                    zk0Var.setLayoutManager(xVar);
                    zk0Var.requestLayout();
                    int i13 = x11Var.H;
                    if (i13 != -1) {
                        x11Var.b(i13);
                    }
                    x11Var.N = z10;
                }
                super.onMeasure(i10, i11);
                break;
            case 23:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f707c;
                at0 at0Var = secretMediaViewer.W;
                if (at0Var != null) {
                    at0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (secretMediaViewer.Q.getVisibility() != 0 ? 0 : secretMediaViewer.Q.getMeasuredHeight()), 1073741824));
                }
                View view3 = secretMediaViewer.f36133f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                }
                break;
            case 29:
                ViewGroup viewGroup = (ViewGroup) this.f706b;
                pf.d dVar = (pf.d) this.f707c;
                if (dVar.G && dVar.F) {
                    super.onMeasure(i10, i11);
                } else {
                    int size = View.MeasureSpec.getSize(i11);
                    if (size == 0) {
                        size = viewGroup.getMeasuredHeight();
                    }
                    if (size == 0) {
                        size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    }
                    int iDp2 = AndroidUtilities.dp(50.0f);
                    int iDp3 = dVar.v != 0 ? 0 : AndroidUtilities.dp(30.0f) + iDp2;
                    if (!dVar.A && !dVar.f45763w) {
                        iDp3 += iDp2;
                    }
                    int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(iDp3 < paddingTop ? paddingTop - iDp3 : 0, 1073741824));
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f705a) {
            case 16:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f706b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        tc tcVar;
        float f10;
        switch (this.f705a) {
            case 21:
                return (((ProfileActivity) this.f707c).f35992j5 == 0.0f && (tcVar = (tc) this.f706b) != null && tcVar.b(motionEvent)) || super.onTouchEvent(motionEvent);
            case 22:
            default:
                return super.onTouchEvent(motionEvent);
            case 23:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f706b;
                if (secretMediaViewer.f36140i0 == 0 && secretMediaViewer.F0 == 0) {
                    if (motionEvent.getPointerCount() == 1 && secretMediaViewer.H0.onTouchEvent(motionEvent) && secretMediaViewer.X0) {
                        secretMediaViewer.X0 = false;
                        secretMediaViewer.W0 = false;
                        secretMediaViewer.V0 = false;
                        secretMediaViewer.d(false);
                    } else if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                        secretMediaViewer.f36124b1 = false;
                        bm0 bm0Var = secretMediaViewer.f36127c1;
                        if (!bm0Var.f27178q) {
                            bm0Var.a();
                        }
                        if (!secretMediaViewer.f36146l0) {
                            if (motionEvent.getPointerCount() == 2) {
                                secretMediaViewer.J0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                secretMediaViewer.K0 = secretMediaViewer.f36164u0;
                                secretMediaViewer.L0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                                secretMediaViewer.M0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                                secretMediaViewer.N0 = secretMediaViewer.f36161s0;
                                secretMediaViewer.O0 = secretMediaViewer.f36163t0;
                                secretMediaViewer.V0 = true;
                                secretMediaViewer.W0 = false;
                            } else if (motionEvent.getPointerCount() == 1) {
                                secretMediaViewer.P0 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                secretMediaViewer.Q0 = y10;
                                secretMediaViewer.m0 = y10;
                                secretMediaViewer.f36146l0 = false;
                                secretMediaViewer.Z0 = true;
                            }
                        }
                    } else {
                        float f11 = 0.0f;
                        if (motionEvent.getActionMasked() == 2) {
                            if (motionEvent.getPointerCount() == 2 && !secretMediaViewer.f36146l0 && secretMediaViewer.V0) {
                                secretMediaViewer.f36124b1 = true;
                                secretMediaViewer.f36164u0 = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / secretMediaViewer.J0) * secretMediaViewer.K0;
                                secretMediaViewer.f36161s0 = rl.c(secretMediaViewer.f36164u0, secretMediaViewer.K0, (secretMediaViewer.L0 - (secretMediaViewer.f36130e.getWidth() / 2)) - secretMediaViewer.N0, secretMediaViewer.L0 - (secretMediaViewer.f36130e.getWidth() / 2));
                                float height = secretMediaViewer.M0 - (secretMediaViewer.f36130e.getHeight() / 2);
                                float height2 = (secretMediaViewer.M0 - (secretMediaViewer.f36130e.getHeight() / 2)) - secretMediaViewer.O0;
                                float f12 = secretMediaViewer.f36164u0;
                                secretMediaViewer.f36163t0 = rl.c(f12, secretMediaViewer.K0, height2, height);
                                secretMediaViewer.n(f12);
                                secretMediaViewer.f36130e.invalidate();
                            } else if (motionEvent.getPointerCount() == 1) {
                                float fAbs = Math.abs(motionEvent.getX() - secretMediaViewer.P0);
                                float fAbs2 = Math.abs(motionEvent.getY() - secretMediaViewer.m0);
                                if (fAbs > AndroidUtilities.dp(3.0f) || fAbs2 > AndroidUtilities.dp(3.0f)) {
                                    secretMediaViewer.f36124b1 = true;
                                }
                                if (secretMediaViewer.Z0 && !secretMediaViewer.f36146l0 && secretMediaViewer.f36164u0 == 1.0f && fAbs2 >= AndroidUtilities.dp(30.0f) && fAbs2 / 2.0f > fAbs) {
                                    secretMediaViewer.f36146l0 = true;
                                    secretMediaViewer.W0 = false;
                                    secretMediaViewer.m0 = motionEvent.getY();
                                    if (secretMediaViewer.f36136g0) {
                                        secretMediaViewer.m(false, true);
                                    }
                                } else if (secretMediaViewer.f36146l0) {
                                    secretMediaViewer.f36163t0 = motionEvent.getY() - secretMediaViewer.m0;
                                    secretMediaViewer.f36130e.invalidate();
                                } else if (secretMediaViewer.Y0 || secretMediaViewer.F0 != 0) {
                                    secretMediaViewer.Y0 = false;
                                    secretMediaViewer.P0 = motionEvent.getX();
                                    secretMediaViewer.Q0 = motionEvent.getY();
                                } else {
                                    float x8 = secretMediaViewer.P0 - motionEvent.getX();
                                    float y11 = secretMediaViewer.Q0 - motionEvent.getY();
                                    if (secretMediaViewer.W0 || ((secretMediaViewer.f36164u0 == 1.0f && Math.abs(y11) + AndroidUtilities.dp(12.0f) < Math.abs(x8)) || secretMediaViewer.f36164u0 != 1.0f)) {
                                        if (!secretMediaViewer.W0) {
                                            secretMediaViewer.W0 = true;
                                            secretMediaViewer.Z0 = false;
                                            x8 = 0.0f;
                                            y11 = 0.0f;
                                        }
                                        secretMediaViewer.P0 = motionEvent.getX();
                                        secretMediaViewer.Q0 = motionEvent.getY();
                                        secretMediaViewer.n(secretMediaViewer.f36164u0);
                                        float f13 = secretMediaViewer.f36161s0;
                                        if (f13 < secretMediaViewer.R0 || f13 > secretMediaViewer.S0) {
                                            x8 /= 3.0f;
                                        }
                                        float f14 = secretMediaViewer.U0;
                                        if (f14 == 0.0f) {
                                            float f15 = secretMediaViewer.T0;
                                            if (f15 == 0.0f) {
                                                float f16 = secretMediaViewer.f36163t0 - y11;
                                                if (f16 < f15) {
                                                    secretMediaViewer.f36163t0 = f15;
                                                } else if (f16 > f14) {
                                                    secretMediaViewer.f36163t0 = f14;
                                                } else {
                                                    f11 = y11;
                                                }
                                            } else {
                                                f10 = secretMediaViewer.f36163t0;
                                                if (f10 >= secretMediaViewer.T0 || f10 > f14) {
                                                    f11 = y11 / 3.0f;
                                                } else {
                                                    f11 = y11;
                                                }
                                            }
                                        } else {
                                            f10 = secretMediaViewer.f36163t0;
                                            if (f10 >= secretMediaViewer.T0) {
                                            }
                                            f11 = y11 / 3.0f;
                                        }
                                        secretMediaViewer.f36161s0 = f13 - x8;
                                        if (secretMediaViewer.f36164u0 != 1.0f) {
                                            secretMediaViewer.f36163t0 -= f11;
                                        }
                                        secretMediaViewer.f36130e.invalidate();
                                    }
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                            if (secretMediaViewer.V0) {
                                secretMediaViewer.Y0 = true;
                                float f17 = secretMediaViewer.f36164u0;
                                if (f17 < 1.0f) {
                                    secretMediaViewer.n(1.0f);
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, true);
                                } else if (f17 > 3.0f) {
                                    float fC = rl.c(3.0f, secretMediaViewer.K0, (secretMediaViewer.L0 - (secretMediaViewer.f36130e.getWidth() / 2)) - secretMediaViewer.N0, secretMediaViewer.L0 - (secretMediaViewer.f36130e.getWidth() / 2));
                                    float fC2 = rl.c(3.0f, secretMediaViewer.K0, (secretMediaViewer.M0 - (secretMediaViewer.f36130e.getHeight() / 2)) - secretMediaViewer.O0, secretMediaViewer.M0 - (secretMediaViewer.f36130e.getHeight() / 2));
                                    secretMediaViewer.n(3.0f);
                                    float f18 = secretMediaViewer.R0;
                                    if (fC < f18) {
                                        fC = f18;
                                    } else {
                                        f18 = secretMediaViewer.S0;
                                        if (fC > f18) {
                                            fC = f18;
                                        }
                                    }
                                    float f19 = secretMediaViewer.T0;
                                    if (fC2 < f19) {
                                        fC2 = f19;
                                    } else {
                                        f19 = secretMediaViewer.U0;
                                        if (fC2 > f19) {
                                            fC2 = f19;
                                        }
                                    }
                                    secretMediaViewer.c(3.0f, fC, fC2, true);
                                } else {
                                    secretMediaViewer.d(true);
                                }
                                secretMediaViewer.V0 = false;
                            } else if (secretMediaViewer.f36146l0) {
                                if (Math.abs(secretMediaViewer.m0 - motionEvent.getY()) > secretMediaViewer.f36130e.getHeight() / 6.0f) {
                                    secretMediaViewer.e(true, false);
                                } else {
                                    secretMediaViewer.c(1.0f, 0.0f, 0.0f, false);
                                }
                                secretMediaViewer.f36146l0 = false;
                            } else if (secretMediaViewer.W0) {
                                float f20 = secretMediaViewer.f36161s0;
                                float f21 = secretMediaViewer.f36163t0;
                                secretMediaViewer.n(secretMediaViewer.f36164u0);
                                secretMediaViewer.W0 = false;
                                secretMediaViewer.Z0 = true;
                                float f22 = secretMediaViewer.f36161s0;
                                float f23 = secretMediaViewer.R0;
                                if (f22 < f23) {
                                    f20 = f23;
                                } else {
                                    f23 = secretMediaViewer.S0;
                                    if (f22 > f23) {
                                        f20 = f23;
                                    }
                                }
                                float f24 = secretMediaViewer.f36163t0;
                                float f25 = secretMediaViewer.T0;
                                if (f24 < f25) {
                                    f21 = f25;
                                } else {
                                    f25 = secretMediaViewer.U0;
                                    if (f24 > f25) {
                                        f21 = f25;
                                    }
                                }
                                secretMediaViewer.c(secretMediaViewer.f36164u0, f20, f21, false);
                            }
                        }
                    }
                }
                return true;
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f705a) {
            case 14:
                ((Paint) this.f706b).setColor(i10);
                break;
            default:
                super.setBackgroundColor(i10);
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f705a) {
            case 13:
                return ((i6) this.f706b) == drawable || ((i6) this.f707c) == drawable || super.verifyDrawable(drawable);
            case 22:
                return drawable == ((x11) this.f707c).f44251f || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public y1(Object obj, Context context, int i10) {
        super(context);
        this.f705a = i10;
        this.f707c = obj;
    }

    public y1(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f705a = i10;
        this.f707c = obj;
        this.f706b = obj2;
    }

    public y1(org.telegram.ui.Cells.y0 y0Var, Context context) {
        super(context);
        this.f705a = 8;
        this.f707c = y0Var;
        this.f706b = new RectF();
    }

    public y1(ig.d0 d0Var, Context context) {
        super(context);
        this.f705a = 4;
        this.f707c = d0Var;
        this.f706b = new gh.w0(this, 1);
    }

    public y1(c41 c41Var, Context context) {
        super(context);
        this.f705a = 24;
        this.f707c = c41Var;
        this.f706b = new Path();
    }

    public y1(wb wbVar, Context context) {
        super(context);
        this.f705a = 9;
        this.f707c = wbVar;
        this.f706b = new Paint(1);
    }

    public y1(ig.s sVar, Context context) {
        super(context);
        this.f705a = 3;
        this.f707c = sVar;
        this.f706b = new ig.o(this, this);
    }

    public y1(p5 p5Var, Activity activity) {
        super(activity);
        this.f705a = 7;
        this.f707c = p5Var;
        this.f706b = new Paint(1);
    }

    public y1(org.telegram.ui.Components.voip.g1 g1Var, Context context) {
        super(context);
        this.f705a = 16;
        this.f707c = g1Var;
        this.f706b = new Path();
    }

    public y1(dd0 dd0Var, Context context) {
        super(context);
        this.f705a = 14;
        this.f707c = dd0Var;
        this.f706b = new Paint();
    }

    public y1(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f705a = 20;
        this.f706b = textView;
        this.f707c = textView2;
    }

    public y1(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f705a = 23;
        this.f707c = secretMediaViewer;
        this.f706b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public y1(a61 a61Var, Context context) {
        super(context);
        this.f705a = 25;
        this.f707c = a61Var;
        this.f706b = new Rect();
    }

    private final void a(boolean z10) {
    }

    public y1(Context context, int i10, c6 c6Var) {
        super(context);
        this.f705a = i10;
        switch (i10) {
            case 13:
                super(context);
                i6 i6Var = new i6(true, true, true, false);
                this.f706b = i6Var;
                er erVar = er.h;
                i6Var.k(0.3f, 430L, erVar);
                i6Var.u(AndroidUtilities.bold());
                i6Var.r(g6.v0(g6.A8, c6Var));
                i6Var.t(AndroidUtilities.dp(18.0f));
                i6Var.n(!LocaleController.isRTL);
                i6Var.setCallback(this);
                i6Var.G = AndroidUtilities.displaySize.x;
                i6 i6Var2 = new i6(true, true, true, false);
                this.f707c = i6Var2;
                i6Var2.k(0.3f, 430L, erVar);
                i6Var2.r(g6.v0(g6.B8, c6Var));
                i6Var2.t(AndroidUtilities.dp(14.0f));
                i6Var2.n(true ^ LocaleController.isRTL);
                i6Var2.setCallback(this);
                i6Var2.G = AndroidUtilities.displaySize.x;
                break;
            default:
                LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
                j6 j6Var = new j6(context, false, false, false);
                this.f706b = j6Var;
                int i11 = g6.G6;
                j6Var.setTextColor(g6.v0(i11, c6Var));
                j6Var.setTextSize(AndroidUtilities.dp(17.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                linearLayoutG.addView(j6Var, z5.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f707c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(g6.v0(i11, c6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayoutG.addView(textView, z5.q(-2, -2, 1));
                addView(linearLayoutG, z5.e(-2, -2, 17));
                break;
        }
    }

    public y1(x11 x11Var, Activity activity, y11 y11Var) {
        super(activity);
        this.f705a = 22;
        this.f707c = x11Var;
        Rect rect = new Rect();
        this.f706b = rect;
        x11Var.f44247a.setColor(y11Var.getThemedColor(g6.f23053d6));
        Drawable drawable = x11Var.f44251f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public y1(ap apVar, Context context) {
        super(context);
        this.f705a = 11;
        this.f707c = apVar;
        this.f706b = new Paint();
    }

    public y1(kt ktVar, Activity activity) {
        super(activity);
        this.f705a = 18;
        this.f707c = ktVar;
        this.f706b = ktVar;
        setWillNotDraw(false);
    }

    public y1(nc1 nc1Var, Context context, int i10) {
        super(context);
        this.f705a = i10;
        switch (i10) {
            case 28:
                this.f707c = nc1Var;
                super(context);
                this.f706b = new int[2];
                break;
            default:
                this.f707c = nc1Var;
                this.f706b = new Paint();
                break;
        }
    }

    public y1(wj0 wj0Var, Context context) {
        super(context);
        this.f705a = 15;
        this.f707c = wj0Var;
        this.f706b = new Paint(1);
    }

    public y1(Context context) {
        super(context);
        this.f705a = 10;
        this.f706b = new Path();
        this.f707c = new v10();
    }

    public y1(lh.c6 c6Var, Context context) {
        super(context);
        this.f705a = 5;
        this.f707c = c6Var;
        this.f706b = new Path();
    }
}
