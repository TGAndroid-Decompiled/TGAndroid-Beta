package ig;

import ag.r1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.kj;
import org.telegram.ui.rn;

public final class j0 extends FrameLayout {

    public final n2 f11325a;

    public final View f11326b;

    public final boolean f11327c;
    public final MessageObject d;

    public final rn f11328e;

    public final int f11329f;
    public final int h;

    public final boolean f11330n;

    public final float f11331r;

    public final float f11332s;
    public final float v;

    public final q0 f11333w;

    public final m0 f11334x;

    public j0(m0 m0Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, rn rnVar, int i10, int i11, boolean z11, float f10, float f11, float f12, q0 q0Var) {
        super(context);
        this.f11334x = m0Var;
        this.f11325a = n2Var;
        this.f11326b = view;
        this.f11327c = z10;
        this.d = messageObject;
        this.f11328e = rnVar;
        this.f11329f = i10;
        this.h = i11;
        this.f11330n = z11;
        this.f11331r = f10;
        this.f11332s = f11;
        this.v = f12;
        this.f11333w = q0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int iDp;
        float f10;
        float measuredWidth;
        float measuredHeight;
        float f11;
        float interpolation;
        float interpolation2;
        float f12;
        float f13;
        int i10;
        m0 m0Var;
        float f14;
        float f15;
        k0 k0Var;
        oi0 lottieAnimation;
        int i11;
        l0 l0Var;
        float f16;
        float f17;
        float f18;
        float f19;
        float fA;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        m0 m0Var2;
        float f26;
        int i12;
        float f27;
        m0 m0Var3;
        int i13;
        View view;
        View view2;
        View view3;
        m0 m0Var4;
        k0 k0Var2;
        k0 k0Var3;
        float f28;
        o0 o0VarL;
        int paddingTop;
        rn rnVar;
        MessageObject messageObject;
        m0 m0Var5 = this.f11334x;
        if (m0Var5.f11360l) {
            float f29 = m0Var5.f11361m;
            if (f29 != 1.0f) {
                float f30 = f29 + 0.10666667f;
                m0Var5.f11361m = f30;
                if (f30 > 1.0f) {
                    m0Var5.f11361m = 1.0f;
                    final int i14 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                        public final j0 f11322b;

                        {
                            this.f11322b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    this.f11322b.f11334x.c();
                                    break;
                                default:
                                    this.f11322b.f11334x.c();
                                    break;
                            }
                        }
                    });
                }
            }
            float f31 = this.f11334x.f11361m;
            if (f31 != 1.0f) {
                setAlpha(1.0f - f31);
                super.dispatchDraw(canvas);
            }
            invalidate();
            return;
        }
        if (!m0Var5.f11367s) {
            invalidate();
            return;
        }
        uj0 uj0Var = m0Var5.f11368t;
        if (uj0Var != null) {
            uj0Var.f33099a.setAlpha(0.0f);
            this.f11334x.f11368t.f33101c.setAlpha(0.0f);
        }
        n2 n2Var = this.f11325a;
        if (n2Var instanceof rn) {
            rn rnVar2 = (rn) n2Var;
            int i15 = this.f11334x.f11362n;
            kj kjVar = rnVar2.f42213t0;
            if (kjVar != null) {
                int childCount = kjVar.getChildCount();
                int i16 = 0;
                while (true) {
                    if (i16 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = rnVar2.f42213t0.getChildAt(i16);
                    if (childAt instanceof s1) {
                        messageObject = ((s1) childAt).getMessageObject();
                    } else {
                        if (childAt instanceof v0) {
                            messageObject = ((v0) childAt).getMessageObject();
                        } else {
                            continue;
                        }
                        i16++;
                    }
                    if (messageObject != null && messageObject.getId() == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            } else {
                childAt = null;
                break;
            }
        } else {
            childAt = this.f11326b;
        }
        if (this.f11327c) {
            iDp = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 120.0f : 50.0f);
        } else {
            MessageObject messageObject2 = this.d;
            iDp = (messageObject2 == null || !messageObject2.shouldDrawReactionsInLayout()) ? AndroidUtilities.dp(14.0f) : AndroidUtilities.dp(20.0f);
        }
        float f32 = iDp;
        if (childAt != null) {
            childAt.getLocationInWindow(this.f11334x.f11358j);
            m0 m0Var6 = this.f11334x;
            int[] iArr = m0Var6.f11358j;
            measuredWidth = iArr[0];
            measuredHeight = iArr[1];
            if (childAt instanceof s1) {
                s1 s1Var = (s1) childAt;
                f10 = 0.10666667f;
                o0VarL = s1Var.J.l(m0Var6.f11364p);
                if (s1Var.F && !s1Var.e4()) {
                    measuredHeight += AndroidUtilities.dp(2.0f);
                }
                paddingTop = s1Var.getPaddingTop();
            } else {
                f10 = 0.10666667f;
                if (childAt instanceof v0) {
                    o0VarL = ((v0) childAt).f25785y0.l(m0Var6.f11364p);
                    paddingTop = childAt.getPaddingTop();
                } else {
                    if (childAt instanceof ug.d) {
                        measuredWidth += ((ug.d) childAt).getReactionCenterX();
                        measuredHeight += childAt.getMeasuredHeight() / 2.0f;
                    }
                    o0VarL = null;
                }
                if (o0VarL != null) {
                    Rect rect = o0VarL.f11401t;
                    measuredWidth += rect.left;
                    measuredHeight += rect.top;
                }
                rnVar = this.f11328e;
                if (rnVar != null) {
                    measuredHeight += rnVar.f42236ua;
                }
                m0 m0Var7 = this.f11334x;
                m0Var7.f11365q = measuredWidth;
                m0Var7.f11366r = measuredHeight;
            }
            measuredHeight += paddingTop;
            if (o0VarL != null) {
                Rect rect2 = o0VarL.f11401t;
                measuredWidth += rect2.left;
                measuredHeight += rect2.top;
            }
            rnVar = this.f11328e;
            if (rnVar != null) {
                measuredHeight += rnVar.f42236ua;
            }
            m0 m0Var8 = this.f11334x;
            m0Var8.f11365q = measuredWidth;
            m0Var8.f11366r = measuredHeight;
        } else {
            f10 = 0.10666667f;
            if (this.f11327c) {
                float f33 = f32 / 2.0f;
                measuredWidth = (getMeasuredWidth() / 2.0f) - f33;
                measuredHeight = (getMeasuredHeight() / 2.0f) - f33;
            } else {
                m0 m0Var9 = this.f11334x;
                measuredWidth = m0Var9.f11365q;
                measuredHeight = m0Var9.f11366r;
            }
        }
        n2 n2Var2 = this.f11325a;
        if (n2Var2 != null && n2Var2.getParentActivity() != null && this.f11325a.getFragmentView() != null && this.f11325a.getFragmentView().getParent() != null && this.f11325a.getFragmentView().getVisibility() == 0 && this.f11325a.getFragmentView() != null) {
            this.f11325a.getFragmentView().getLocationOnScreen(this.f11334x.f11358j);
            setAlpha(((View) this.f11325a.getFragmentView().getParent()).getAlpha());
        } else if (!this.f11327c && !(childAt instanceof ug.d)) {
            return;
        }
        float f34 = (childAt instanceof ug.d ? this.f11329f : this.f11329f - f32) / 2.0f;
        float measuredWidth2 = measuredWidth - f34;
        float f35 = measuredHeight - f34;
        if (this.f11327c && this.h == 0) {
            measuredWidth2 += AndroidUtilities.dp(40.0f);
        }
        if (this.h != 1 && !this.f11327c) {
            int i17 = this.f11334x.f11358j[0];
            float f36 = i17;
            if (measuredWidth2 < f36) {
                measuredWidth2 = f36;
            }
            if (this.f11329f + measuredWidth2 > getMeasuredWidth() + i17) {
                measuredWidth2 = (getMeasuredWidth() + this.f11334x.f11358j[0]) - this.f11329f;
            }
        }
        er erVar = er.f28122f;
        float interpolation3 = erVar.getInterpolation(this.f11334x.h);
        if (this.h == 2) {
            interpolation = er.h.getInterpolation(interpolation3);
            interpolation2 = erVar.getInterpolation(interpolation3);
            f11 = 2.0f;
        } else if (this.f11330n) {
            f11 = 2.0f;
            interpolation = er.h.getInterpolation(this.f11334x.f11356g);
            interpolation2 = erVar.getInterpolation(this.f11334x.f11356g);
        } else {
            f11 = 2.0f;
            interpolation = this.f11334x.f11356g;
            interpolation2 = interpolation;
        }
        float f37 = 1.0f - interpolation;
        float f38 = (this.f11331r * f37) + interpolation;
        float f39 = f32 / this.f11329f;
        if (this.h == 1) {
            f38 = 1.0f;
        } else {
            measuredWidth2 = (measuredWidth2 * interpolation) + (this.f11332s * f37);
            f35 = (f35 * interpolation2) + ((1.0f - interpolation2) * this.v);
        }
        this.f11334x.f11352b.setTranslationX(measuredWidth2);
        this.f11334x.f11352b.setTranslationY(f35);
        float f40 = 1.0f - interpolation3;
        this.f11334x.f11352b.setAlpha(f40);
        this.f11334x.f11352b.setScaleX(f38);
        this.f11334x.f11352b.setScaleY(f38);
        int i18 = this.h;
        if (i18 != 2) {
            if (interpolation3 != 0.0f) {
                f38 = (f38 * f40) + (f39 * interpolation3);
                measuredWidth2 = (measuredWidth2 * f40) + (measuredWidth * interpolation3);
                f12 = f35 * f40;
                f13 = measuredHeight * interpolation3;
            }
            if (i18 != 1) {
                if (this.f11327c) {
                    this.f11334x.d.setAlpha(1.0f);
                } else {
                    k0 k0Var4 = this.f11334x.d;
                    if (interpolation3 > 0.7f) {
                        f28 = (interpolation3 - 0.7f) / 0.3f;
                    } else {
                        f28 = 0.0f;
                    }
                    k0Var4.setAlpha(f28);
                }
            }
            if (this.h == 0 && this.f11327c) {
                this.f11334x.f11353c.setAlpha(f40);
            }
            this.f11334x.f11354e.setTranslationX(measuredWidth2);
            this.f11334x.f11354e.setTranslationY(f35);
            this.f11334x.f11354e.setScaleX(f38);
            this.f11334x.f11354e.setScaleY(f38);
            super.dispatchDraw(canvas);
            i10 = this.h;
            if (i10 != 1 || this.f11334x.f11353c.C) {
                m0Var = this.f11334x;
                f14 = m0Var.f11356g;
                if (f14 != 1.0f) {
                    if (this.f11330n) {
                        m0Var.f11356g = f14 + 0.045714285f;
                    } else {
                        m0Var.f11356g = f14 + 0.07272727f;
                    }
                    if (m0Var.f11356g > 1.0f) {
                        m0Var.f11356g = 1.0f;
                    }
                }
            }
            if (i10 != 2) {
                m0Var4 = this.f11334x;
                if (m0Var4.f11369u || i10 != 0) {
                    if (i10 != 1) {
                        k0Var3 = m0Var4.f11353c;
                        if (!k0Var3.C && k0Var3.getImageReceiver().getLottieAnimation() != null && !this.f11334x.f11353c.getImageReceiver().getLottieAnimation().f31317h0) {
                            f15 = 0.7f;
                        }
                        m0Var2 = this.f11334x;
                        f26 = m0Var2.h;
                        if (f26 != 1.0f) {
                            i12 = this.h;
                            if (i12 == 1) {
                                m0Var2.h = 1.0f;
                            } else {
                                if (i12 == 2) {
                                    f27 = 350.0f;
                                } else {
                                    f27 = 220.0f;
                                }
                                m0Var2.h = (16.0f / f27) + f26;
                            }
                            if (m0Var2.h > f15) {
                                if (this.f11327c || i12 != 2) {
                                    m0.g();
                                } else if (!m0Var2.A) {
                                    m0Var2.A = true;
                                    try {
                                        performHapticFeedback(0);
                                    } catch (Exception unused) {
                                    }
                                    ((ViewGroup) getParent()).addView(this.f11334x.f11355f.f11357i);
                                    m0 m0Var10 = this.f11334x.f11355f;
                                    m0Var10.f11373z = true;
                                    m0Var10.f11367s = true;
                                    m0Var10.f11372y = System.currentTimeMillis();
                                    this.f11334x.f11355f.f11357i.setTag(R.id.parent_tag, 1);
                                    animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new r1(this, 10));
                                }
                            }
                            m0Var3 = this.f11334x;
                            if (m0Var3.h >= 1.0f) {
                                i13 = this.h;
                                if (i13 != 0 || i13 == 2) {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                }
                                this.f11334x.h = 1.0f;
                                if (this.h == 1) {
                                    m0.C = null;
                                } else {
                                    m0.B = null;
                                }
                                view2 = this.f11326b;
                                if (view2 != null) {
                                    view2.invalidate();
                                    view3 = this.f11326b;
                                    if ((view3 instanceof s1) && ((s1) view3).getCurrentMessagesGroup() != null && this.f11326b.getParent() != null) {
                                        ((View) this.f11326b.getParent()).invalidate();
                                    }
                                }
                                if (this.f11327c || this.h != 2) {
                                    final int i19 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i19) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                    if (this.f11333w.f11413g != 0) {
                        f15 = 0.7f;
                        if (System.currentTimeMillis() - this.f11334x.f11372y > 2000) {
                            m0Var2 = this.f11334x;
                            f26 = m0Var2.h;
                            if (f26 != 1.0f) {
                                i12 = this.h;
                                if (i12 == 1) {
                                    m0Var2.h = 1.0f;
                                } else {
                                    if (i12 == 2) {
                                        f27 = 350.0f;
                                    } else {
                                        f27 = 220.0f;
                                    }
                                    m0Var2.h = (16.0f / f27) + f26;
                                }
                                if (m0Var2.h > f15) {
                                    if (this.f11327c) {
                                        m0.g();
                                    } else {
                                        m0.g();
                                    }
                                }
                                m0Var3 = this.f11334x;
                                if (m0Var3.h >= 1.0f) {
                                    i13 = this.h;
                                    if (i13 != 0) {
                                        view = this.f11326b;
                                        if (view instanceof s1) {
                                            ((s1) view).J.b(m0Var3.f11364p);
                                        } else if (view instanceof v0) {
                                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                                        }
                                    } else {
                                        view = this.f11326b;
                                        if (view instanceof s1) {
                                            ((s1) view).J.b(m0Var3.f11364p);
                                        } else if (view instanceof v0) {
                                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                                        }
                                    }
                                    this.f11334x.h = 1.0f;
                                    if (this.h == 1) {
                                        m0.C = null;
                                    } else {
                                        m0.B = null;
                                    }
                                    view2 = this.f11326b;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        view3 = this.f11326b;
                                        if (view3 instanceof s1) {
                                            ((View) this.f11326b.getParent()).invalidate();
                                        }
                                    }
                                    if (this.f11327c) {
                                        final int i110 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                                            public final j0 f11322b;

                                            {
                                                this.f11322b = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i110) {
                                                    case 0:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                    default:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i111 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                                            public final j0 f11322b;

                                            {
                                                this.f11322b = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i111) {
                                                    case 0:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                    default:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    } else {
                        f15 = 0.7f;
                    }
                    if (this.h == 1) {
                        k0Var2 = this.f11334x.f11352b;
                        if (!k0Var2.C && k0Var2.getImageReceiver().getLottieAnimation() != null && !this.f11334x.f11352b.getImageReceiver().getLottieAnimation().f31317h0) {
                            m0Var2 = this.f11334x;
                            f26 = m0Var2.h;
                            if (f26 != 1.0f) {
                                i12 = this.h;
                                if (i12 == 1) {
                                    m0Var2.h = 1.0f;
                                } else {
                                    if (i12 == 2) {
                                        f27 = 350.0f;
                                    } else {
                                        f27 = 220.0f;
                                    }
                                    m0Var2.h = (16.0f / f27) + f26;
                                }
                                if (m0Var2.h > f15) {
                                    if (this.f11327c) {
                                        m0.g();
                                    } else {
                                        m0.g();
                                    }
                                }
                                m0Var3 = this.f11334x;
                                if (m0Var3.h >= 1.0f) {
                                    i13 = this.h;
                                    if (i13 != 0) {
                                        view = this.f11326b;
                                        if (view instanceof s1) {
                                            ((s1) view).J.b(m0Var3.f11364p);
                                        } else if (view instanceof v0) {
                                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                                        }
                                    } else {
                                        view = this.f11326b;
                                        if (view instanceof s1) {
                                            ((s1) view).J.b(m0Var3.f11364p);
                                        } else if (view instanceof v0) {
                                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                                        }
                                    }
                                    this.f11334x.h = 1.0f;
                                    if (this.h == 1) {
                                        m0.C = null;
                                    } else {
                                        m0.B = null;
                                    }
                                    view2 = this.f11326b;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        view3 = this.f11326b;
                                        if (view3 instanceof s1) {
                                            ((View) this.f11326b.getParent()).invalidate();
                                        }
                                    }
                                    if (this.f11327c) {
                                        final int i112 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                                            public final j0 f11322b;

                                            {
                                                this.f11322b = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i112) {
                                                    case 0:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                    default:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i113 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                                            public final j0 f11322b;

                                            {
                                                this.f11322b = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i113) {
                                                    case 0:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                    default:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        } else if (this.f11333w.f11413g != 0 && System.currentTimeMillis() - this.f11334x.f11372y > 2000) {
                            m0Var2 = this.f11334x;
                            f26 = m0Var2.h;
                            if (f26 != 1.0f) {
                                i12 = this.h;
                                if (i12 == 1) {
                                    m0Var2.h = 1.0f;
                                } else {
                                    if (i12 == 2) {
                                        f27 = 350.0f;
                                    } else {
                                        f27 = 220.0f;
                                    }
                                    m0Var2.h = (16.0f / f27) + f26;
                                }
                                if (m0Var2.h > f15) {
                                    if (this.f11327c) {
                                        m0.g();
                                    } else {
                                        m0.g();
                                    }
                                }
                                m0Var3 = this.f11334x;
                                if (m0Var3.h >= 1.0f) {
                                    i13 = this.h;
                                    if (i13 != 0) {
                                        view = this.f11326b;
                                        if (view instanceof s1) {
                                            ((s1) view).J.b(m0Var3.f11364p);
                                        } else if (view instanceof v0) {
                                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                                        }
                                    } else {
                                        view = this.f11326b;
                                        if (view instanceof s1) {
                                            ((s1) view).J.b(m0Var3.f11364p);
                                        } else if (view instanceof v0) {
                                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                                        }
                                    }
                                    this.f11334x.h = 1.0f;
                                    if (this.h == 1) {
                                        m0.C = null;
                                    } else {
                                        m0.B = null;
                                    }
                                    view2 = this.f11326b;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        view3 = this.f11326b;
                                        if (view3 instanceof s1) {
                                            ((View) this.f11326b.getParent()).invalidate();
                                        }
                                    }
                                    if (this.f11327c) {
                                        final int i114 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                                            public final j0 f11322b;

                                            {
                                                this.f11322b = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i114) {
                                                    case 0:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                    default:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i115 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                                            public final j0 f11322b;

                                            {
                                                this.f11322b = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i115) {
                                                    case 0:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                    default:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    } else if (this.f11333w.f11413g != 0) {
                        m0Var2 = this.f11334x;
                        f26 = m0Var2.h;
                        if (f26 != 1.0f) {
                            i12 = this.h;
                            if (i12 == 1) {
                                m0Var2.h = 1.0f;
                            } else {
                                if (i12 == 2) {
                                    f27 = 350.0f;
                                } else {
                                    f27 = 220.0f;
                                }
                                m0Var2.h = (16.0f / f27) + f26;
                            }
                            if (m0Var2.h > f15) {
                                if (this.f11327c) {
                                    m0.g();
                                } else {
                                    m0.g();
                                }
                            }
                            m0Var3 = this.f11334x;
                            if (m0Var3.h >= 1.0f) {
                                i13 = this.h;
                                if (i13 != 0) {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                } else {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                }
                                this.f11334x.h = 1.0f;
                                if (this.h == 1) {
                                    m0.C = null;
                                } else {
                                    m0.B = null;
                                }
                                view2 = this.f11326b;
                                if (view2 != null) {
                                    view2.invalidate();
                                    view3 = this.f11326b;
                                    if (view3 instanceof s1) {
                                        ((View) this.f11326b.getParent()).invalidate();
                                    }
                                }
                                if (this.f11327c) {
                                    final int i116 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i116) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    final int i117 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i117) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                } else {
                    f15 = 0.7f;
                    m0Var2 = this.f11334x;
                    f26 = m0Var2.h;
                    if (f26 != 1.0f) {
                        i12 = this.h;
                        if (i12 == 1) {
                            m0Var2.h = 1.0f;
                        } else {
                            if (i12 == 2) {
                                f27 = 350.0f;
                            } else {
                                f27 = 220.0f;
                            }
                            m0Var2.h = (16.0f / f27) + f26;
                        }
                        if (m0Var2.h > f15) {
                            if (this.f11327c) {
                                m0.g();
                            } else {
                                m0.g();
                            }
                        }
                        m0Var3 = this.f11334x;
                        if (m0Var3.h >= 1.0f) {
                            i13 = this.h;
                            if (i13 != 0) {
                                view = this.f11326b;
                                if (view instanceof s1) {
                                    ((s1) view).J.b(m0Var3.f11364p);
                                } else if (view instanceof v0) {
                                    ((v0) view).f25785y0.b(m0Var3.f11364p);
                                }
                            } else {
                                view = this.f11326b;
                                if (view instanceof s1) {
                                    ((s1) view).J.b(m0Var3.f11364p);
                                } else if (view instanceof v0) {
                                    ((v0) view).f25785y0.b(m0Var3.f11364p);
                                }
                            }
                            this.f11334x.h = 1.0f;
                            if (this.h == 1) {
                                m0.C = null;
                            } else {
                                m0.B = null;
                            }
                            view2 = this.f11326b;
                            if (view2 != null) {
                                view2.invalidate();
                                view3 = this.f11326b;
                                if (view3 instanceof s1) {
                                    ((View) this.f11326b.getParent()).invalidate();
                                }
                            }
                            if (this.f11327c) {
                                final int i118 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable(this) {

                                    public final j0 f11322b;

                                    {
                                        this.f11322b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i118) {
                                            case 0:
                                                this.f11322b.f11334x.c();
                                                break;
                                            default:
                                                this.f11322b.f11334x.c();
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i119 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable(this) {

                                    public final j0 f11322b;

                                    {
                                        this.f11322b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i119) {
                                            case 0:
                                                this.f11322b.f11334x.c();
                                                break;
                                            default:
                                                this.f11322b.f11334x.c();
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            } else {
                f15 = 0.7f;
                m0Var2 = this.f11334x;
                f26 = m0Var2.h;
                if (f26 != 1.0f) {
                    i12 = this.h;
                    if (i12 == 1) {
                        m0Var2.h = 1.0f;
                    } else {
                        if (i12 == 2) {
                            f27 = 350.0f;
                        } else {
                            f27 = 220.0f;
                        }
                        m0Var2.h = (16.0f / f27) + f26;
                    }
                    if (m0Var2.h > f15) {
                        if (this.f11327c) {
                            m0.g();
                        } else {
                            m0.g();
                        }
                    }
                    m0Var3 = this.f11334x;
                    if (m0Var3.h >= 1.0f) {
                        i13 = this.h;
                        if (i13 != 0) {
                            view = this.f11326b;
                            if (view instanceof s1) {
                                ((s1) view).J.b(m0Var3.f11364p);
                            } else if (view instanceof v0) {
                                ((v0) view).f25785y0.b(m0Var3.f11364p);
                            }
                        } else {
                            view = this.f11326b;
                            if (view instanceof s1) {
                                ((s1) view).J.b(m0Var3.f11364p);
                            } else if (view instanceof v0) {
                                ((v0) view).f25785y0.b(m0Var3.f11364p);
                            }
                        }
                        this.f11334x.h = 1.0f;
                        if (this.h == 1) {
                            m0.C = null;
                        } else {
                            m0.B = null;
                        }
                        view2 = this.f11326b;
                        if (view2 != null) {
                            view2.invalidate();
                            view3 = this.f11326b;
                            if (view3 instanceof s1) {
                                ((View) this.f11326b.getParent()).invalidate();
                            }
                        }
                        if (this.f11327c) {
                            final int i1110 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable(this) {

                                public final j0 f11322b;

                                {
                                    this.f11322b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (i1110) {
                                        case 0:
                                            this.f11322b.f11334x.c();
                                            break;
                                        default:
                                            this.f11322b.f11334x.c();
                                            break;
                                    }
                                }
                            });
                        } else {
                            final int i1111 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable(this) {

                                public final j0 f11322b;

                                {
                                    this.f11322b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (i1111) {
                                        case 0:
                                            this.f11322b.f11334x.c();
                                            break;
                                        default:
                                            this.f11322b.f11334x.c();
                                            break;
                                    }
                                }
                            });
                        }
                    }
                }
            }
            if (!this.f11334x.f11371x.isEmpty()) {
                k0Var = this.f11334x.f11352b;
                if (k0Var.C) {
                    lottieAnimation = k0Var.getImageReceiver().getLottieAnimation();
                    i11 = 0;
                    while (i11 < this.f11334x.f11371x.size()) {
                        l0Var = (l0) this.f11334x.f11371x.get(i11);
                        f16 = l0Var.f11341c;
                        if (lottieAnimation == null && lottieAnimation.f31317h0) {
                            float fP = this.f11334x.f11352b.getImageReceiver().getLottieAnimation().p();
                            if (((int) rl.c(this.f11334x.f11352b.getImageReceiver().getLottieAnimation().X, this.f11334x.f11352b.getImageReceiver().getLottieAnimation().f31312e[0], fP, fP)) < l0Var.f11340b) {
                                f17 = l0Var.d;
                                if (f17 != 1.0f) {
                                    f18 = f17 + f10;
                                    l0Var.d = f18;
                                    if (f18 > 1.0f) {
                                        l0Var.d = 1.0f;
                                        this.f11334x.f11371x.remove(i11);
                                        i11--;
                                    } else {
                                        if (f16 < 0.5f) {
                                            fA = f16 / 0.5f;
                                            f19 = 1.0f;
                                        } else {
                                            f19 = 1.0f;
                                            fA = y1.a(f16, 0.5f, 0.5f, 1.0f);
                                        }
                                        float f41 = (f19 - f16) * 0.5f;
                                        float f42 = (l0Var.f11343f * f16) + f41;
                                        float f43 = ((l0Var.f11344g * f16) + f41) - (l0Var.f11342e * fA);
                                        float f44 = (1.0f - l0Var.d) * l0Var.h * f16;
                                        float scaleX = (this.f11334x.f11352b.getScaleX() * this.f11334x.f11352b.getWidth() * f42) + this.f11334x.f11352b.getX();
                                        float scaleY = (this.f11334x.f11352b.getScaleY() * this.f11334x.f11352b.getHeight() * f43) + this.f11334x.f11352b.getY();
                                        int iDp2 = AndroidUtilities.dp(16.0f);
                                        float f45 = iDp2;
                                        float f46 = f45 / f11;
                                        ((l0) this.f11334x.f11371x.get(i11)).f11339a.setImageCoords(scaleX - f46, scaleY - f46, f45, f45);
                                        ((l0) this.f11334x.f11371x.get(i11)).f11339a.setRoundRadius(iDp2 >> 1);
                                        canvas.save();
                                        canvas.translate(0.0f, l0Var.f11348l);
                                        canvas.scale(f44, f44, scaleX, scaleY);
                                        canvas.rotate(l0Var.f11346j, scaleX, scaleY);
                                        ((l0) this.f11334x.f11371x.get(i11)).f11339a.draw(canvas);
                                        canvas.restore();
                                        f20 = l0Var.f11341c;
                                        if (f20 < 1.0f) {
                                            f25 = f20 + 0.045714285f;
                                            l0Var.f11341c = f25;
                                            if (f25 > 1.0f) {
                                                l0Var.f11341c = 1.0f;
                                            }
                                        }
                                        if (f16 >= 1.0f) {
                                            l0Var.f11348l = a9.p.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.f11348l);
                                        }
                                        if (l0Var.f11347k) {
                                            float f47 = l0Var.f11346j;
                                            f23 = l0Var.f11345i;
                                            f24 = (f23 / 250.0f) + f47;
                                            l0Var.f11346j = f24;
                                            if (f24 > f23) {
                                                l0Var.f11347k = false;
                                            }
                                        } else {
                                            float f48 = l0Var.f11346j;
                                            f21 = l0Var.f11345i;
                                            f22 = f48 - (f21 / 250.0f);
                                            l0Var.f11346j = f22;
                                            if (f22 < (-f21)) {
                                                l0Var.f11347k = true;
                                            }
                                        }
                                    }
                                } else {
                                    if (f16 < 0.5f) {
                                        fA = f16 / 0.5f;
                                        f19 = 1.0f;
                                    } else {
                                        f19 = 1.0f;
                                        fA = y1.a(f16, 0.5f, 0.5f, 1.0f);
                                    }
                                    float f49 = (f19 - f16) * 0.5f;
                                    float f410 = (l0Var.f11343f * f16) + f49;
                                    float f411 = ((l0Var.f11344g * f16) + f49) - (l0Var.f11342e * fA);
                                    float f412 = (1.0f - l0Var.d) * l0Var.h * f16;
                                    float scaleX2 = (this.f11334x.f11352b.getScaleX() * this.f11334x.f11352b.getWidth() * f410) + this.f11334x.f11352b.getX();
                                    float scaleY2 = (this.f11334x.f11352b.getScaleY() * this.f11334x.f11352b.getHeight() * f411) + this.f11334x.f11352b.getY();
                                    int iDp3 = AndroidUtilities.dp(16.0f);
                                    float f413 = iDp3;
                                    float f414 = f413 / f11;
                                    ((l0) this.f11334x.f11371x.get(i11)).f11339a.setImageCoords(scaleX2 - f414, scaleY2 - f414, f413, f413);
                                    ((l0) this.f11334x.f11371x.get(i11)).f11339a.setRoundRadius(iDp3 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, l0Var.f11348l);
                                    canvas.scale(f412, f412, scaleX2, scaleY2);
                                    canvas.rotate(l0Var.f11346j, scaleX2, scaleY2);
                                    ((l0) this.f11334x.f11371x.get(i11)).f11339a.draw(canvas);
                                    canvas.restore();
                                    f20 = l0Var.f11341c;
                                    if (f20 < 1.0f) {
                                        f25 = f20 + 0.045714285f;
                                        l0Var.f11341c = f25;
                                        if (f25 > 1.0f) {
                                            l0Var.f11341c = 1.0f;
                                        }
                                    }
                                    if (f16 >= 1.0f) {
                                        l0Var.f11348l = a9.p.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.f11348l);
                                    }
                                    if (l0Var.f11347k) {
                                        float f415 = l0Var.f11346j;
                                        f23 = l0Var.f11345i;
                                        f24 = (f23 / 250.0f) + f415;
                                        l0Var.f11346j = f24;
                                        if (f24 > f23) {
                                            l0Var.f11347k = false;
                                        }
                                    } else {
                                        float f416 = l0Var.f11346j;
                                        f21 = l0Var.f11345i;
                                        f22 = f416 - (f21 / 250.0f);
                                        l0Var.f11346j = f22;
                                        if (f22 < (-f21)) {
                                            l0Var.f11347k = true;
                                        }
                                    }
                                }
                            } else {
                                if (f16 < 0.5f) {
                                    fA = f16 / 0.5f;
                                    f19 = 1.0f;
                                } else {
                                    f19 = 1.0f;
                                    fA = y1.a(f16, 0.5f, 0.5f, 1.0f);
                                }
                                float f417 = (f19 - f16) * 0.5f;
                                float f418 = (l0Var.f11343f * f16) + f417;
                                float f419 = ((l0Var.f11344g * f16) + f417) - (l0Var.f11342e * fA);
                                float f4110 = (1.0f - l0Var.d) * l0Var.h * f16;
                                float scaleX3 = (this.f11334x.f11352b.getScaleX() * this.f11334x.f11352b.getWidth() * f418) + this.f11334x.f11352b.getX();
                                float scaleY3 = (this.f11334x.f11352b.getScaleY() * this.f11334x.f11352b.getHeight() * f419) + this.f11334x.f11352b.getY();
                                int iDp4 = AndroidUtilities.dp(16.0f);
                                float f4111 = iDp4;
                                float f4112 = f4111 / f11;
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.setImageCoords(scaleX3 - f4112, scaleY3 - f4112, f4111, f4111);
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.setRoundRadius(iDp4 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, l0Var.f11348l);
                                canvas.scale(f4110, f4110, scaleX3, scaleY3);
                                canvas.rotate(l0Var.f11346j, scaleX3, scaleY3);
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.draw(canvas);
                                canvas.restore();
                                f20 = l0Var.f11341c;
                                if (f20 < 1.0f) {
                                    f25 = f20 + 0.045714285f;
                                    l0Var.f11341c = f25;
                                    if (f25 > 1.0f) {
                                        l0Var.f11341c = 1.0f;
                                    }
                                }
                                if (f16 >= 1.0f) {
                                    l0Var.f11348l = a9.p.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.f11348l);
                                }
                                if (l0Var.f11347k) {
                                    float f4113 = l0Var.f11346j;
                                    f23 = l0Var.f11345i;
                                    f24 = (f23 / 250.0f) + f4113;
                                    l0Var.f11346j = f24;
                                    if (f24 > f23) {
                                        l0Var.f11347k = false;
                                    }
                                } else {
                                    float f4114 = l0Var.f11346j;
                                    f21 = l0Var.f11345i;
                                    f22 = f4114 - (f21 / 250.0f);
                                    l0Var.f11346j = f22;
                                    if (f22 < (-f21)) {
                                        l0Var.f11347k = true;
                                    }
                                }
                            }
                        } else {
                            f17 = l0Var.d;
                            if (f17 != 1.0f) {
                                f18 = f17 + f10;
                                l0Var.d = f18;
                                if (f18 > 1.0f) {
                                    l0Var.d = 1.0f;
                                    this.f11334x.f11371x.remove(i11);
                                    i11--;
                                } else {
                                    if (f16 < 0.5f) {
                                        fA = f16 / 0.5f;
                                        f19 = 1.0f;
                                    } else {
                                        f19 = 1.0f;
                                        fA = y1.a(f16, 0.5f, 0.5f, 1.0f);
                                    }
                                    float f4115 = (f19 - f16) * 0.5f;
                                    float f4116 = (l0Var.f11343f * f16) + f4115;
                                    float f4117 = ((l0Var.f11344g * f16) + f4115) - (l0Var.f11342e * fA);
                                    float f4118 = (1.0f - l0Var.d) * l0Var.h * f16;
                                    float scaleX4 = (this.f11334x.f11352b.getScaleX() * this.f11334x.f11352b.getWidth() * f4116) + this.f11334x.f11352b.getX();
                                    float scaleY4 = (this.f11334x.f11352b.getScaleY() * this.f11334x.f11352b.getHeight() * f4117) + this.f11334x.f11352b.getY();
                                    int iDp5 = AndroidUtilities.dp(16.0f);
                                    float f4119 = iDp5;
                                    float f41110 = f4119 / f11;
                                    ((l0) this.f11334x.f11371x.get(i11)).f11339a.setImageCoords(scaleX4 - f41110, scaleY4 - f41110, f4119, f4119);
                                    ((l0) this.f11334x.f11371x.get(i11)).f11339a.setRoundRadius(iDp5 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, l0Var.f11348l);
                                    canvas.scale(f4118, f4118, scaleX4, scaleY4);
                                    canvas.rotate(l0Var.f11346j, scaleX4, scaleY4);
                                    ((l0) this.f11334x.f11371x.get(i11)).f11339a.draw(canvas);
                                    canvas.restore();
                                    f20 = l0Var.f11341c;
                                    if (f20 < 1.0f) {
                                        f25 = f20 + 0.045714285f;
                                        l0Var.f11341c = f25;
                                        if (f25 > 1.0f) {
                                            l0Var.f11341c = 1.0f;
                                        }
                                    }
                                    if (f16 >= 1.0f) {
                                        l0Var.f11348l = a9.p.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.f11348l);
                                    }
                                    if (l0Var.f11347k) {
                                        float f41111 = l0Var.f11346j;
                                        f23 = l0Var.f11345i;
                                        f24 = (f23 / 250.0f) + f41111;
                                        l0Var.f11346j = f24;
                                        if (f24 > f23) {
                                            l0Var.f11347k = false;
                                        }
                                    } else {
                                        float f41112 = l0Var.f11346j;
                                        f21 = l0Var.f11345i;
                                        f22 = f41112 - (f21 / 250.0f);
                                        l0Var.f11346j = f22;
                                        if (f22 < (-f21)) {
                                            l0Var.f11347k = true;
                                        }
                                    }
                                }
                            } else {
                                if (f16 < 0.5f) {
                                    fA = f16 / 0.5f;
                                    f19 = 1.0f;
                                } else {
                                    f19 = 1.0f;
                                    fA = y1.a(f16, 0.5f, 0.5f, 1.0f);
                                }
                                float f41113 = (f19 - f16) * 0.5f;
                                float f41114 = (l0Var.f11343f * f16) + f41113;
                                float f41115 = ((l0Var.f11344g * f16) + f41113) - (l0Var.f11342e * fA);
                                float f41116 = (1.0f - l0Var.d) * l0Var.h * f16;
                                float scaleX5 = (this.f11334x.f11352b.getScaleX() * this.f11334x.f11352b.getWidth() * f41114) + this.f11334x.f11352b.getX();
                                float scaleY5 = (this.f11334x.f11352b.getScaleY() * this.f11334x.f11352b.getHeight() * f41115) + this.f11334x.f11352b.getY();
                                int iDp6 = AndroidUtilities.dp(16.0f);
                                float f41117 = iDp6;
                                float f41118 = f41117 / f11;
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.setImageCoords(scaleX5 - f41118, scaleY5 - f41118, f41117, f41117);
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.setRoundRadius(iDp6 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, l0Var.f11348l);
                                canvas.scale(f41116, f41116, scaleX5, scaleY5);
                                canvas.rotate(l0Var.f11346j, scaleX5, scaleY5);
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.draw(canvas);
                                canvas.restore();
                                f20 = l0Var.f11341c;
                                if (f20 < 1.0f) {
                                    f25 = f20 + 0.045714285f;
                                    l0Var.f11341c = f25;
                                    if (f25 > 1.0f) {
                                        l0Var.f11341c = 1.0f;
                                    }
                                }
                                if (f16 >= 1.0f) {
                                    l0Var.f11348l = a9.p.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.f11348l);
                                }
                                if (l0Var.f11347k) {
                                    float f41119 = l0Var.f11346j;
                                    f23 = l0Var.f11345i;
                                    f24 = (f23 / 250.0f) + f41119;
                                    l0Var.f11346j = f24;
                                    if (f24 > f23) {
                                        l0Var.f11347k = false;
                                    }
                                } else {
                                    float f411110 = l0Var.f11346j;
                                    f21 = l0Var.f11345i;
                                    f22 = f411110 - (f21 / 250.0f);
                                    l0Var.f11346j = f22;
                                    if (f22 < (-f21)) {
                                        l0Var.f11347k = true;
                                    }
                                }
                            }
                        }
                        i11++;
                    }
                }
            }
            invalidate();
        }
        f38 = (this.f11331r * f37) + (f39 * interpolation);
        measuredWidth2 = (measuredWidth * interpolation) + (this.f11332s * f37);
        f12 = (1.0f - interpolation2) * this.v;
        f13 = measuredHeight * interpolation2;
        f35 = f12 + f13;
        if (i18 != 1) {
            if (this.f11327c) {
                k0 k0Var5 = this.f11334x.d;
                if (interpolation3 > 0.7f) {
                    f28 = (interpolation3 - 0.7f) / 0.3f;
                } else {
                    f28 = 0.0f;
                }
                k0Var5.setAlpha(f28);
            } else {
                this.f11334x.d.setAlpha(1.0f);
            }
        }
        if (this.h == 0) {
            this.f11334x.f11353c.setAlpha(f40);
        }
        this.f11334x.f11354e.setTranslationX(measuredWidth2);
        this.f11334x.f11354e.setTranslationY(f35);
        this.f11334x.f11354e.setScaleX(f38);
        this.f11334x.f11354e.setScaleY(f38);
        super.dispatchDraw(canvas);
        i10 = this.h;
        if (i10 != 1) {
            m0Var = this.f11334x;
            f14 = m0Var.f11356g;
            if (f14 != 1.0f) {
                if (this.f11330n) {
                    m0Var.f11356g = f14 + 0.045714285f;
                } else {
                    m0Var.f11356g = f14 + 0.07272727f;
                }
                if (m0Var.f11356g > 1.0f) {
                    m0Var.f11356g = 1.0f;
                }
            }
        } else {
            m0Var = this.f11334x;
            f14 = m0Var.f11356g;
            if (f14 != 1.0f) {
                if (this.f11330n) {
                    m0Var.f11356g = f14 + 0.045714285f;
                } else {
                    m0Var.f11356g = f14 + 0.07272727f;
                }
                if (m0Var.f11356g > 1.0f) {
                    m0Var.f11356g = 1.0f;
                }
            }
        }
        if (i10 != 2) {
            m0Var4 = this.f11334x;
            if (m0Var4.f11369u) {
                if (i10 != 1) {
                    k0Var3 = m0Var4.f11353c;
                    if (!k0Var3.C) {
                    }
                }
                if (this.f11333w.f11413g != 0) {
                    f15 = 0.7f;
                    if (System.currentTimeMillis() - this.f11334x.f11372y > 2000) {
                        m0Var2 = this.f11334x;
                        f26 = m0Var2.h;
                        if (f26 != 1.0f) {
                            i12 = this.h;
                            if (i12 == 1) {
                                m0Var2.h = 1.0f;
                            } else {
                                if (i12 == 2) {
                                    f27 = 350.0f;
                                } else {
                                    f27 = 220.0f;
                                }
                                m0Var2.h = (16.0f / f27) + f26;
                            }
                            if (m0Var2.h > f15) {
                                if (this.f11327c) {
                                    m0.g();
                                } else {
                                    m0.g();
                                }
                            }
                            m0Var3 = this.f11334x;
                            if (m0Var3.h >= 1.0f) {
                                i13 = this.h;
                                if (i13 != 0) {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                } else {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                }
                                this.f11334x.h = 1.0f;
                                if (this.h == 1) {
                                    m0.C = null;
                                } else {
                                    m0.B = null;
                                }
                                view2 = this.f11326b;
                                if (view2 != null) {
                                    view2.invalidate();
                                    view3 = this.f11326b;
                                    if (view3 instanceof s1) {
                                        ((View) this.f11326b.getParent()).invalidate();
                                    }
                                }
                                if (this.f11327c) {
                                    final int i1112 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i1112) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    final int i1113 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i1113) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                } else {
                    f15 = 0.7f;
                }
                if (this.h == 1) {
                    k0Var2 = this.f11334x.f11352b;
                    if (!k0Var2.C) {
                        if (this.f11333w.f11413g != 0) {
                            m0Var2 = this.f11334x;
                            f26 = m0Var2.h;
                            if (f26 != 1.0f) {
                                i12 = this.h;
                                if (i12 == 1) {
                                    m0Var2.h = 1.0f;
                                } else {
                                    if (i12 == 2) {
                                        f27 = 350.0f;
                                    } else {
                                        f27 = 220.0f;
                                    }
                                    m0Var2.h = (16.0f / f27) + f26;
                                }
                                if (m0Var2.h > f15) {
                                    if (this.f11327c) {
                                        m0.g();
                                    } else {
                                        m0.g();
                                    }
                                }
                                m0Var3 = this.f11334x;
                                if (m0Var3.h >= 1.0f) {
                                    i13 = this.h;
                                    if (i13 != 0) {
                                        view = this.f11326b;
                                        if (view instanceof s1) {
                                            ((s1) view).J.b(m0Var3.f11364p);
                                        } else if (view instanceof v0) {
                                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                                        }
                                    } else {
                                        view = this.f11326b;
                                        if (view instanceof s1) {
                                            ((s1) view).J.b(m0Var3.f11364p);
                                        } else if (view instanceof v0) {
                                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                                        }
                                    }
                                    this.f11334x.h = 1.0f;
                                    if (this.h == 1) {
                                        m0.C = null;
                                    } else {
                                        m0.B = null;
                                    }
                                    view2 = this.f11326b;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        view3 = this.f11326b;
                                        if (view3 instanceof s1) {
                                            ((View) this.f11326b.getParent()).invalidate();
                                        }
                                    }
                                    if (this.f11327c) {
                                        final int i1114 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                                            public final j0 f11322b;

                                            {
                                                this.f11322b = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i1114) {
                                                    case 0:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                    default:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i1115 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                                            public final j0 f11322b;

                                            {
                                                this.f11322b = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i1115) {
                                                    case 0:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                    default:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    } else if (this.f11333w.f11413g != 0) {
                        m0Var2 = this.f11334x;
                        f26 = m0Var2.h;
                        if (f26 != 1.0f) {
                            i12 = this.h;
                            if (i12 == 1) {
                                m0Var2.h = 1.0f;
                            } else {
                                if (i12 == 2) {
                                    f27 = 350.0f;
                                } else {
                                    f27 = 220.0f;
                                }
                                m0Var2.h = (16.0f / f27) + f26;
                            }
                            if (m0Var2.h > f15) {
                                if (this.f11327c) {
                                    m0.g();
                                } else {
                                    m0.g();
                                }
                            }
                            m0Var3 = this.f11334x;
                            if (m0Var3.h >= 1.0f) {
                                i13 = this.h;
                                if (i13 != 0) {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                } else {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                }
                                this.f11334x.h = 1.0f;
                                if (this.h == 1) {
                                    m0.C = null;
                                } else {
                                    m0.B = null;
                                }
                                view2 = this.f11326b;
                                if (view2 != null) {
                                    view2.invalidate();
                                    view3 = this.f11326b;
                                    if (view3 instanceof s1) {
                                        ((View) this.f11326b.getParent()).invalidate();
                                    }
                                }
                                if (this.f11327c) {
                                    final int i1116 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i1116) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    final int i1117 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i1117) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                } else if (this.f11333w.f11413g != 0) {
                    m0Var2 = this.f11334x;
                    f26 = m0Var2.h;
                    if (f26 != 1.0f) {
                        i12 = this.h;
                        if (i12 == 1) {
                            m0Var2.h = 1.0f;
                        } else {
                            if (i12 == 2) {
                                f27 = 350.0f;
                            } else {
                                f27 = 220.0f;
                            }
                            m0Var2.h = (16.0f / f27) + f26;
                        }
                        if (m0Var2.h > f15) {
                            if (this.f11327c) {
                                m0.g();
                            } else {
                                m0.g();
                            }
                        }
                        m0Var3 = this.f11334x;
                        if (m0Var3.h >= 1.0f) {
                            i13 = this.h;
                            if (i13 != 0) {
                                view = this.f11326b;
                                if (view instanceof s1) {
                                    ((s1) view).J.b(m0Var3.f11364p);
                                } else if (view instanceof v0) {
                                    ((v0) view).f25785y0.b(m0Var3.f11364p);
                                }
                            } else {
                                view = this.f11326b;
                                if (view instanceof s1) {
                                    ((s1) view).J.b(m0Var3.f11364p);
                                } else if (view instanceof v0) {
                                    ((v0) view).f25785y0.b(m0Var3.f11364p);
                                }
                            }
                            this.f11334x.h = 1.0f;
                            if (this.h == 1) {
                                m0.C = null;
                            } else {
                                m0.B = null;
                            }
                            view2 = this.f11326b;
                            if (view2 != null) {
                                view2.invalidate();
                                view3 = this.f11326b;
                                if (view3 instanceof s1) {
                                    ((View) this.f11326b.getParent()).invalidate();
                                }
                            }
                            if (this.f11327c) {
                                final int i1118 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable(this) {

                                    public final j0 f11322b;

                                    {
                                        this.f11322b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i1118) {
                                            case 0:
                                                this.f11322b.f11334x.c();
                                                break;
                                            default:
                                                this.f11322b.f11334x.c();
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i1119 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable(this) {

                                    public final j0 f11322b;

                                    {
                                        this.f11322b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i1119) {
                                            case 0:
                                                this.f11322b.f11334x.c();
                                                break;
                                            default:
                                                this.f11322b.f11334x.c();
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            } else {
                if (i10 != 1) {
                    k0Var3 = m0Var4.f11353c;
                    if (!k0Var3.C) {
                    }
                }
                if (this.f11333w.f11413g != 0) {
                    f15 = 0.7f;
                    if (System.currentTimeMillis() - this.f11334x.f11372y > 2000) {
                        m0Var2 = this.f11334x;
                        f26 = m0Var2.h;
                        if (f26 != 1.0f) {
                            i12 = this.h;
                            if (i12 == 1) {
                                m0Var2.h = 1.0f;
                            } else {
                                if (i12 == 2) {
                                    f27 = 350.0f;
                                } else {
                                    f27 = 220.0f;
                                }
                                m0Var2.h = (16.0f / f27) + f26;
                            }
                            if (m0Var2.h > f15) {
                                if (this.f11327c) {
                                    m0.g();
                                } else {
                                    m0.g();
                                }
                            }
                            m0Var3 = this.f11334x;
                            if (m0Var3.h >= 1.0f) {
                                i13 = this.h;
                                if (i13 != 0) {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                } else {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                }
                                this.f11334x.h = 1.0f;
                                if (this.h == 1) {
                                    m0.C = null;
                                } else {
                                    m0.B = null;
                                }
                                view2 = this.f11326b;
                                if (view2 != null) {
                                    view2.invalidate();
                                    view3 = this.f11326b;
                                    if (view3 instanceof s1) {
                                        ((View) this.f11326b.getParent()).invalidate();
                                    }
                                }
                                if (this.f11327c) {
                                    final int i11110 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i11110) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    final int i11111 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i11111) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                } else {
                    f15 = 0.7f;
                }
                if (this.h == 1) {
                    k0Var2 = this.f11334x.f11352b;
                    if (!k0Var2.C) {
                        if (this.f11333w.f11413g != 0) {
                            m0Var2 = this.f11334x;
                            f26 = m0Var2.h;
                            if (f26 != 1.0f) {
                                i12 = this.h;
                                if (i12 == 1) {
                                    m0Var2.h = 1.0f;
                                } else {
                                    if (i12 == 2) {
                                        f27 = 350.0f;
                                    } else {
                                        f27 = 220.0f;
                                    }
                                    m0Var2.h = (16.0f / f27) + f26;
                                }
                                if (m0Var2.h > f15) {
                                    if (this.f11327c) {
                                        m0.g();
                                    } else {
                                        m0.g();
                                    }
                                }
                                m0Var3 = this.f11334x;
                                if (m0Var3.h >= 1.0f) {
                                    i13 = this.h;
                                    if (i13 != 0) {
                                        view = this.f11326b;
                                        if (view instanceof s1) {
                                            ((s1) view).J.b(m0Var3.f11364p);
                                        } else if (view instanceof v0) {
                                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                                        }
                                    } else {
                                        view = this.f11326b;
                                        if (view instanceof s1) {
                                            ((s1) view).J.b(m0Var3.f11364p);
                                        } else if (view instanceof v0) {
                                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                                        }
                                    }
                                    this.f11334x.h = 1.0f;
                                    if (this.h == 1) {
                                        m0.C = null;
                                    } else {
                                        m0.B = null;
                                    }
                                    view2 = this.f11326b;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        view3 = this.f11326b;
                                        if (view3 instanceof s1) {
                                            ((View) this.f11326b.getParent()).invalidate();
                                        }
                                    }
                                    if (this.f11327c) {
                                        final int i11112 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                                            public final j0 f11322b;

                                            {
                                                this.f11322b = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i11112) {
                                                    case 0:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                    default:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i11113 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                                            public final j0 f11322b;

                                            {
                                                this.f11322b = this;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i11113) {
                                                    case 0:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                    default:
                                                        this.f11322b.f11334x.c();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    } else if (this.f11333w.f11413g != 0) {
                        m0Var2 = this.f11334x;
                        f26 = m0Var2.h;
                        if (f26 != 1.0f) {
                            i12 = this.h;
                            if (i12 == 1) {
                                m0Var2.h = 1.0f;
                            } else {
                                if (i12 == 2) {
                                    f27 = 350.0f;
                                } else {
                                    f27 = 220.0f;
                                }
                                m0Var2.h = (16.0f / f27) + f26;
                            }
                            if (m0Var2.h > f15) {
                                if (this.f11327c) {
                                    m0.g();
                                } else {
                                    m0.g();
                                }
                            }
                            m0Var3 = this.f11334x;
                            if (m0Var3.h >= 1.0f) {
                                i13 = this.h;
                                if (i13 != 0) {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                } else {
                                    view = this.f11326b;
                                    if (view instanceof s1) {
                                        ((s1) view).J.b(m0Var3.f11364p);
                                    } else if (view instanceof v0) {
                                        ((v0) view).f25785y0.b(m0Var3.f11364p);
                                    }
                                }
                                this.f11334x.h = 1.0f;
                                if (this.h == 1) {
                                    m0.C = null;
                                } else {
                                    m0.B = null;
                                }
                                view2 = this.f11326b;
                                if (view2 != null) {
                                    view2.invalidate();
                                    view3 = this.f11326b;
                                    if (view3 instanceof s1) {
                                        ((View) this.f11326b.getParent()).invalidate();
                                    }
                                }
                                if (this.f11327c) {
                                    final int i11114 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i11114) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    final int i11115 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                                        public final j0 f11322b;

                                        {
                                            this.f11322b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i11115) {
                                                case 0:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                                default:
                                                    this.f11322b.f11334x.c();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                } else if (this.f11333w.f11413g != 0) {
                    m0Var2 = this.f11334x;
                    f26 = m0Var2.h;
                    if (f26 != 1.0f) {
                        i12 = this.h;
                        if (i12 == 1) {
                            m0Var2.h = 1.0f;
                        } else {
                            if (i12 == 2) {
                                f27 = 350.0f;
                            } else {
                                f27 = 220.0f;
                            }
                            m0Var2.h = (16.0f / f27) + f26;
                        }
                        if (m0Var2.h > f15) {
                            if (this.f11327c) {
                                m0.g();
                            } else {
                                m0.g();
                            }
                        }
                        m0Var3 = this.f11334x;
                        if (m0Var3.h >= 1.0f) {
                            i13 = this.h;
                            if (i13 != 0) {
                                view = this.f11326b;
                                if (view instanceof s1) {
                                    ((s1) view).J.b(m0Var3.f11364p);
                                } else if (view instanceof v0) {
                                    ((v0) view).f25785y0.b(m0Var3.f11364p);
                                }
                            } else {
                                view = this.f11326b;
                                if (view instanceof s1) {
                                    ((s1) view).J.b(m0Var3.f11364p);
                                } else if (view instanceof v0) {
                                    ((v0) view).f25785y0.b(m0Var3.f11364p);
                                }
                            }
                            this.f11334x.h = 1.0f;
                            if (this.h == 1) {
                                m0.C = null;
                            } else {
                                m0.B = null;
                            }
                            view2 = this.f11326b;
                            if (view2 != null) {
                                view2.invalidate();
                                view3 = this.f11326b;
                                if (view3 instanceof s1) {
                                    ((View) this.f11326b.getParent()).invalidate();
                                }
                            }
                            if (this.f11327c) {
                                final int i11116 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable(this) {

                                    public final j0 f11322b;

                                    {
                                        this.f11322b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i11116) {
                                            case 0:
                                                this.f11322b.f11334x.c();
                                                break;
                                            default:
                                                this.f11322b.f11334x.c();
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i11117 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable(this) {

                                    public final j0 f11322b;

                                    {
                                        this.f11322b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i11117) {
                                            case 0:
                                                this.f11322b.f11334x.c();
                                                break;
                                            default:
                                                this.f11322b.f11334x.c();
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
        } else {
            f15 = 0.7f;
            m0Var2 = this.f11334x;
            f26 = m0Var2.h;
            if (f26 != 1.0f) {
                i12 = this.h;
                if (i12 == 1) {
                    m0Var2.h = 1.0f;
                } else {
                    if (i12 == 2) {
                        f27 = 350.0f;
                    } else {
                        f27 = 220.0f;
                    }
                    m0Var2.h = (16.0f / f27) + f26;
                }
                if (m0Var2.h > f15) {
                    if (this.f11327c) {
                        m0.g();
                    } else {
                        m0.g();
                    }
                }
                m0Var3 = this.f11334x;
                if (m0Var3.h >= 1.0f) {
                    i13 = this.h;
                    if (i13 != 0) {
                        view = this.f11326b;
                        if (view instanceof s1) {
                            ((s1) view).J.b(m0Var3.f11364p);
                        } else if (view instanceof v0) {
                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                        }
                    } else {
                        view = this.f11326b;
                        if (view instanceof s1) {
                            ((s1) view).J.b(m0Var3.f11364p);
                        } else if (view instanceof v0) {
                            ((v0) view).f25785y0.b(m0Var3.f11364p);
                        }
                    }
                    this.f11334x.h = 1.0f;
                    if (this.h == 1) {
                        m0.C = null;
                    } else {
                        m0.B = null;
                    }
                    view2 = this.f11326b;
                    if (view2 != null) {
                        view2.invalidate();
                        view3 = this.f11326b;
                        if (view3 instanceof s1) {
                            ((View) this.f11326b.getParent()).invalidate();
                        }
                    }
                    if (this.f11327c) {
                        final int i11118 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                            public final j0 f11322b;

                            {
                                this.f11322b = this;
                            }

                            @Override
                            public final void run() {
                                switch (i11118) {
                                    case 0:
                                        this.f11322b.f11334x.c();
                                        break;
                                    default:
                                        this.f11322b.f11334x.c();
                                        break;
                                }
                            }
                        });
                    } else {
                        final int i11119 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                            public final j0 f11322b;

                            {
                                this.f11322b = this;
                            }

                            @Override
                            public final void run() {
                                switch (i11119) {
                                    case 0:
                                        this.f11322b.f11334x.c();
                                        break;
                                    default:
                                        this.f11322b.f11334x.c();
                                        break;
                                }
                            }
                        });
                    }
                }
            }
        }
        if (!this.f11334x.f11371x.isEmpty()) {
            k0Var = this.f11334x.f11352b;
            if (k0Var.C) {
                lottieAnimation = k0Var.getImageReceiver().getLottieAnimation();
                i11 = 0;
                while (i11 < this.f11334x.f11371x.size()) {
                    l0Var = (l0) this.f11334x.f11371x.get(i11);
                    f16 = l0Var.f11341c;
                    if (lottieAnimation == null) {
                        f17 = l0Var.d;
                        if (f17 != 1.0f) {
                            f18 = f17 + f10;
                            l0Var.d = f18;
                            if (f18 > 1.0f) {
                                l0Var.d = 1.0f;
                                this.f11334x.f11371x.remove(i11);
                                i11--;
                            } else {
                                if (f16 < 0.5f) {
                                    fA = f16 / 0.5f;
                                    f19 = 1.0f;
                                } else {
                                    f19 = 1.0f;
                                    fA = y1.a(f16, 0.5f, 0.5f, 1.0f);
                                }
                                float f411111 = (f19 - f16) * 0.5f;
                                float f411112 = (l0Var.f11343f * f16) + f411111;
                                float f411113 = ((l0Var.f11344g * f16) + f411111) - (l0Var.f11342e * fA);
                                float f411114 = (1.0f - l0Var.d) * l0Var.h * f16;
                                float scaleX6 = (this.f11334x.f11352b.getScaleX() * this.f11334x.f11352b.getWidth() * f411112) + this.f11334x.f11352b.getX();
                                float scaleY6 = (this.f11334x.f11352b.getScaleY() * this.f11334x.f11352b.getHeight() * f411113) + this.f11334x.f11352b.getY();
                                int iDp7 = AndroidUtilities.dp(16.0f);
                                float f411115 = iDp7;
                                float f411116 = f411115 / f11;
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.setImageCoords(scaleX6 - f411116, scaleY6 - f411116, f411115, f411115);
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.setRoundRadius(iDp7 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, l0Var.f11348l);
                                canvas.scale(f411114, f411114, scaleX6, scaleY6);
                                canvas.rotate(l0Var.f11346j, scaleX6, scaleY6);
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.draw(canvas);
                                canvas.restore();
                                f20 = l0Var.f11341c;
                                if (f20 < 1.0f) {
                                    f25 = f20 + 0.045714285f;
                                    l0Var.f11341c = f25;
                                    if (f25 > 1.0f) {
                                        l0Var.f11341c = 1.0f;
                                    }
                                }
                                if (f16 >= 1.0f) {
                                    l0Var.f11348l = a9.p.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.f11348l);
                                }
                                if (l0Var.f11347k) {
                                    float f411117 = l0Var.f11346j;
                                    f23 = l0Var.f11345i;
                                    f24 = (f23 / 250.0f) + f411117;
                                    l0Var.f11346j = f24;
                                    if (f24 > f23) {
                                        l0Var.f11347k = false;
                                    }
                                } else {
                                    float f411118 = l0Var.f11346j;
                                    f21 = l0Var.f11345i;
                                    f22 = f411118 - (f21 / 250.0f);
                                    l0Var.f11346j = f22;
                                    if (f22 < (-f21)) {
                                        l0Var.f11347k = true;
                                    }
                                }
                            }
                        } else {
                            if (f16 < 0.5f) {
                                fA = f16 / 0.5f;
                                f19 = 1.0f;
                            } else {
                                f19 = 1.0f;
                                fA = y1.a(f16, 0.5f, 0.5f, 1.0f);
                            }
                            float f411119 = (f19 - f16) * 0.5f;
                            float f4111110 = (l0Var.f11343f * f16) + f411119;
                            float f4111111 = ((l0Var.f11344g * f16) + f411119) - (l0Var.f11342e * fA);
                            float f4111112 = (1.0f - l0Var.d) * l0Var.h * f16;
                            float scaleX7 = (this.f11334x.f11352b.getScaleX() * this.f11334x.f11352b.getWidth() * f4111110) + this.f11334x.f11352b.getX();
                            float scaleY7 = (this.f11334x.f11352b.getScaleY() * this.f11334x.f11352b.getHeight() * f4111111) + this.f11334x.f11352b.getY();
                            int iDp8 = AndroidUtilities.dp(16.0f);
                            float f4111113 = iDp8;
                            float f4111114 = f4111113 / f11;
                            ((l0) this.f11334x.f11371x.get(i11)).f11339a.setImageCoords(scaleX7 - f4111114, scaleY7 - f4111114, f4111113, f4111113);
                            ((l0) this.f11334x.f11371x.get(i11)).f11339a.setRoundRadius(iDp8 >> 1);
                            canvas.save();
                            canvas.translate(0.0f, l0Var.f11348l);
                            canvas.scale(f4111112, f4111112, scaleX7, scaleY7);
                            canvas.rotate(l0Var.f11346j, scaleX7, scaleY7);
                            ((l0) this.f11334x.f11371x.get(i11)).f11339a.draw(canvas);
                            canvas.restore();
                            f20 = l0Var.f11341c;
                            if (f20 < 1.0f) {
                                f25 = f20 + 0.045714285f;
                                l0Var.f11341c = f25;
                                if (f25 > 1.0f) {
                                    l0Var.f11341c = 1.0f;
                                }
                            }
                            if (f16 >= 1.0f) {
                                l0Var.f11348l = a9.p.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.f11348l);
                            }
                            if (l0Var.f11347k) {
                                float f4111115 = l0Var.f11346j;
                                f23 = l0Var.f11345i;
                                f24 = (f23 / 250.0f) + f4111115;
                                l0Var.f11346j = f24;
                                if (f24 > f23) {
                                    l0Var.f11347k = false;
                                }
                            } else {
                                float f4111116 = l0Var.f11346j;
                                f21 = l0Var.f11345i;
                                f22 = f4111116 - (f21 / 250.0f);
                                l0Var.f11346j = f22;
                                if (f22 < (-f21)) {
                                    l0Var.f11347k = true;
                                }
                            }
                        }
                    } else {
                        f17 = l0Var.d;
                        if (f17 != 1.0f) {
                            f18 = f17 + f10;
                            l0Var.d = f18;
                            if (f18 > 1.0f) {
                                l0Var.d = 1.0f;
                                this.f11334x.f11371x.remove(i11);
                                i11--;
                            } else {
                                if (f16 < 0.5f) {
                                    fA = f16 / 0.5f;
                                    f19 = 1.0f;
                                } else {
                                    f19 = 1.0f;
                                    fA = y1.a(f16, 0.5f, 0.5f, 1.0f);
                                }
                                float f4111117 = (f19 - f16) * 0.5f;
                                float f4111118 = (l0Var.f11343f * f16) + f4111117;
                                float f4111119 = ((l0Var.f11344g * f16) + f4111117) - (l0Var.f11342e * fA);
                                float f41111110 = (1.0f - l0Var.d) * l0Var.h * f16;
                                float scaleX8 = (this.f11334x.f11352b.getScaleX() * this.f11334x.f11352b.getWidth() * f4111118) + this.f11334x.f11352b.getX();
                                float scaleY8 = (this.f11334x.f11352b.getScaleY() * this.f11334x.f11352b.getHeight() * f4111119) + this.f11334x.f11352b.getY();
                                int iDp9 = AndroidUtilities.dp(16.0f);
                                float f41111111 = iDp9;
                                float f41111112 = f41111111 / f11;
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.setImageCoords(scaleX8 - f41111112, scaleY8 - f41111112, f41111111, f41111111);
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.setRoundRadius(iDp9 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, l0Var.f11348l);
                                canvas.scale(f41111110, f41111110, scaleX8, scaleY8);
                                canvas.rotate(l0Var.f11346j, scaleX8, scaleY8);
                                ((l0) this.f11334x.f11371x.get(i11)).f11339a.draw(canvas);
                                canvas.restore();
                                f20 = l0Var.f11341c;
                                if (f20 < 1.0f) {
                                    f25 = f20 + 0.045714285f;
                                    l0Var.f11341c = f25;
                                    if (f25 > 1.0f) {
                                        l0Var.f11341c = 1.0f;
                                    }
                                }
                                if (f16 >= 1.0f) {
                                    l0Var.f11348l = a9.p.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.f11348l);
                                }
                                if (l0Var.f11347k) {
                                    float f41111113 = l0Var.f11346j;
                                    f23 = l0Var.f11345i;
                                    f24 = (f23 / 250.0f) + f41111113;
                                    l0Var.f11346j = f24;
                                    if (f24 > f23) {
                                        l0Var.f11347k = false;
                                    }
                                } else {
                                    float f41111114 = l0Var.f11346j;
                                    f21 = l0Var.f11345i;
                                    f22 = f41111114 - (f21 / 250.0f);
                                    l0Var.f11346j = f22;
                                    if (f22 < (-f21)) {
                                        l0Var.f11347k = true;
                                    }
                                }
                            }
                        } else {
                            if (f16 < 0.5f) {
                                fA = f16 / 0.5f;
                                f19 = 1.0f;
                            } else {
                                f19 = 1.0f;
                                fA = y1.a(f16, 0.5f, 0.5f, 1.0f);
                            }
                            float f41111115 = (f19 - f16) * 0.5f;
                            float f41111116 = (l0Var.f11343f * f16) + f41111115;
                            float f41111117 = ((l0Var.f11344g * f16) + f41111115) - (l0Var.f11342e * fA);
                            float f41111118 = (1.0f - l0Var.d) * l0Var.h * f16;
                            float scaleX9 = (this.f11334x.f11352b.getScaleX() * this.f11334x.f11352b.getWidth() * f41111116) + this.f11334x.f11352b.getX();
                            float scaleY9 = (this.f11334x.f11352b.getScaleY() * this.f11334x.f11352b.getHeight() * f41111117) + this.f11334x.f11352b.getY();
                            int iDp10 = AndroidUtilities.dp(16.0f);
                            float f41111119 = iDp10;
                            float f411111110 = f41111119 / f11;
                            ((l0) this.f11334x.f11371x.get(i11)).f11339a.setImageCoords(scaleX9 - f411111110, scaleY9 - f411111110, f41111119, f41111119);
                            ((l0) this.f11334x.f11371x.get(i11)).f11339a.setRoundRadius(iDp10 >> 1);
                            canvas.save();
                            canvas.translate(0.0f, l0Var.f11348l);
                            canvas.scale(f41111118, f41111118, scaleX9, scaleY9);
                            canvas.rotate(l0Var.f11346j, scaleX9, scaleY9);
                            ((l0) this.f11334x.f11371x.get(i11)).f11339a.draw(canvas);
                            canvas.restore();
                            f20 = l0Var.f11341c;
                            if (f20 < 1.0f) {
                                f25 = f20 + 0.045714285f;
                                l0Var.f11341c = f25;
                                if (f25 > 1.0f) {
                                    l0Var.f11341c = 1.0f;
                                }
                            }
                            if (f16 >= 1.0f) {
                                l0Var.f11348l = a9.p.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.f11348l);
                            }
                            if (l0Var.f11347k) {
                                float f411111111 = l0Var.f11346j;
                                f23 = l0Var.f11345i;
                                f24 = (f23 / 250.0f) + f411111111;
                                l0Var.f11346j = f24;
                                if (f24 > f23) {
                                    l0Var.f11347k = false;
                                }
                            } else {
                                float f411111112 = l0Var.f11346j;
                                f21 = l0Var.f11345i;
                                f22 = f411111112 - (f21 / 250.0f);
                                l0Var.f11346j = f22;
                                if (f22 < (-f21)) {
                                    l0Var.f11347k = true;
                                }
                            }
                        }
                    }
                    i11++;
                }
            }
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            m0 m0Var = this.f11334x;
            if (i10 >= m0Var.f11371x.size()) {
                return;
            }
            ((l0) m0Var.f11371x.get(i10)).f11339a.onAttachedToWindow();
            i10++;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            m0 m0Var = this.f11334x;
            if (i10 >= m0Var.f11371x.size()) {
                return;
            }
            ((l0) m0Var.f11371x.get(i10)).f11339a.onDetachedFromWindow();
            i10++;
        }
    }
}
