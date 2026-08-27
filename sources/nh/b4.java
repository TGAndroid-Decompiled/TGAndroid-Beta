package nh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.ir;

public final class b4 extends GestureDetector.SimpleOnGestureListener {

    public final int f18604a;

    public final int f18605b;

    public final ViewGroup f18606c;

    public b4(ViewGroup viewGroup, int i10, int i11) {
        this.f18604a = i11;
        this.f18606c = viewGroup;
        this.f18605b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f18604a) {
            case 1:
                ir irVar = (ir) this.f18606c;
                fr frVar = irVar.f29475r;
                if (irVar.f29474n) {
                    irVar.removeCallbacks(frVar);
                }
                irVar.f29474n = true;
                irVar.postDelayed(frVar, 200L);
                irVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.w0 w0Var;
        switch (this.f18604a) {
            case 0:
                d4 d4Var = (d4) this.f18606c;
                if (d4Var.d || !d4Var.I) {
                    return false;
                }
                if (d4Var.F && !d4Var.H) {
                    return false;
                }
                if (d4Var.J && !d4Var.b(false)) {
                    return false;
                }
                float fDistance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f11 >= AndroidUtilities.dp(650.0f) && ((fDistance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((w0Var = d4Var.f18653x) == null || w0Var.getScrollY() == 0))) {
                    d4Var.f18652w = true;
                    float f12 = d4Var.f18650r;
                    int i10 = d4Var.D;
                    if (f12 < i10 && !d4Var.F) {
                        d4Var.e(0.0f);
                    } else if (d4Var.F && d4Var.H && (d4Var.M == (-d4Var.f18648f) + d4Var.f18647e || (f12 <= (-i10) && f11 < AndroidUtilities.dp(1200.0f)))) {
                        d4Var.e((-d4Var.f18648f) + d4Var.f18647e);
                    } else {
                        c4 c4Var = d4Var.B;
                        if (c4Var != null) {
                            c4Var.i(false);
                        }
                    }
                } else {
                    if (f11 > -700.0f) {
                        return false;
                    }
                    float f13 = d4Var.f18650r;
                    float f14 = (-d4Var.f18648f) + d4Var.f18647e;
                    if (f13 <= f14) {
                        return false;
                    }
                    d4Var.f18652w = true;
                    d4Var.e(f14);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                hg0 hg0Var = (hg0) this.f18606c;
                if (!hg0Var.f29010f && !hg0Var.h && f10 >= 600.0f) {
                    hg0Var.f29009e = false;
                    hg0Var.h = false;
                    hg0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        org.telegram.ui.web.w0 w0Var;
        float fA;
        float f13;
        org.telegram.ui.web.w0 w0Var2;
        float scrollY;
        org.telegram.ui.web.w0 w0Var3;
        MotionEvent motionEvent3;
        switch (this.f18604a) {
            case 0:
                d4 d4Var = (d4) this.f18606c;
                if (d4Var.O) {
                    f12 = f11;
                } else {
                    float f14 = d4Var.N + f11;
                    d4Var.N = f14;
                    float fAbs = Math.abs(f14);
                    float f15 = d4Var.P;
                    if (fAbs > f15) {
                        d4Var.O = true;
                        float f16 = d4Var.N;
                        f12 = f16 > 0.0f ? f16 - f15 : f16 + f15;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!d4Var.f18646c && !d4Var.d && d4Var.I) {
                    if (!d4Var.J || d4Var.f18650r != (-d4Var.f18648f) + d4Var.f18647e || d4Var.b(false)) {
                        if (((Boolean) d4Var.E.provide(null)).booleanValue() && d4Var.f18650r == (-d4Var.f18648f) + d4Var.f18647e) {
                            d4Var.d = true;
                        } else {
                            float fAbs2 = Math.abs(f12);
                            float f17 = this.f18605b;
                            if (fAbs2 < f17 || Math.abs(f12) * 1.5f < Math.abs(f10) || (d4Var.f18650r == (-d4Var.f18648f) + d4Var.f18647e && (w0Var3 = d4Var.f18653x) != null && (f12 >= 0.0f || w0Var3.getScrollY() != 0))) {
                                org.telegram.ui.web.w0 w0Var4 = d4Var.f18653x;
                                if (w0Var4 != null) {
                                    if (w0Var4.canScrollHorizontally(f10 >= 0.0f ? 1 : -1)) {
                                        d4Var.d = true;
                                    } else if (Math.abs(f10) >= f17) {
                                        d4Var.d = true;
                                    }
                                } else if (Math.abs(f10) >= f17 && Math.abs(f10) * 1.5f >= Math.abs(f12)) {
                                    d4Var.d = true;
                                }
                            } else {
                                d4Var.f18646c = true;
                                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i10 = 0; i10 < d4Var.getChildCount(); i10++) {
                                    d4Var.getChildAt(i10).dispatchTouchEvent(motionEventObtain);
                                }
                                motionEventObtain.recycle();
                            }
                        }
                        if (d4Var.f18646c) {
                            if (f12 < 0.0f) {
                                f13 = d4Var.f18650r;
                                if (f13 > (-d4Var.f18648f) + d4Var.f18647e) {
                                    d4Var.f18650r = f13 - f12;
                                } else {
                                    scrollY = w0Var2.getScrollY() + f12;
                                    org.telegram.ui.web.w0 w0Var5 = d4Var.f18653x;
                                    w0Var5.setScrollY((int) h7.n.a(scrollY, 0.0f, Math.max(w0Var5.getContentHeight(), d4Var.f18653x.getHeight()) - d4Var.f18647e));
                                    if (scrollY < 0.0f) {
                                        d4Var.f18650r -= scrollY;
                                    }
                                }
                            } else if (f12 > 0.0f) {
                                float f18 = d4Var.f18650r - f12;
                                d4Var.f18650r = f18;
                                w0Var = d4Var.f18653x;
                                if (w0Var != null) {
                                    float scrollY2 = w0Var.getScrollY() - ((d4Var.f18650r + d4Var.f18648f) - d4Var.f18647e);
                                    org.telegram.ui.web.w0 w0Var6 = d4Var.f18653x;
                                    w0Var6.setScrollY((int) h7.n.a(scrollY2, 0.0f, Math.max(w0Var6.getContentHeight(), d4Var.f18653x.getHeight()) - d4Var.f18647e));
                                }
                            }
                            fA = h7.n.a(d4Var.f18650r, (-d4Var.f18648f) + d4Var.f18647e, (d4Var.getHeight() - d4Var.f18648f) + d4Var.f18647e);
                            d4Var.f18650r = fA;
                            if (d4Var.F) {
                                d4Var.f18650r = Math.min(fA, (-d4Var.f18648f) + d4Var.f18647e);
                            }
                            d4Var.c();
                        }
                    } else if (d4Var.f18646c) {
                        if (f12 < 0.0f) {
                            f13 = d4Var.f18650r;
                            if (f13 > (-d4Var.f18648f) + d4Var.f18647e) {
                                d4Var.f18650r = f13 - f12;
                            } else {
                                scrollY = w0Var2.getScrollY() + f12;
                                org.telegram.ui.web.w0 w0Var7 = d4Var.f18653x;
                                w0Var7.setScrollY((int) h7.n.a(scrollY, 0.0f, Math.max(w0Var7.getContentHeight(), d4Var.f18653x.getHeight()) - d4Var.f18647e));
                                if (scrollY < 0.0f) {
                                    d4Var.f18650r -= scrollY;
                                }
                            }
                        } else if (f12 > 0.0f) {
                            float f19 = d4Var.f18650r - f12;
                            d4Var.f18650r = f19;
                            w0Var = d4Var.f18653x;
                            if (w0Var != null) {
                                float scrollY3 = w0Var.getScrollY() - ((d4Var.f18650r + d4Var.f18648f) - d4Var.f18647e);
                                org.telegram.ui.web.w0 w0Var8 = d4Var.f18653x;
                                w0Var8.setScrollY((int) h7.n.a(scrollY3, 0.0f, Math.max(w0Var8.getContentHeight(), d4Var.f18653x.getHeight()) - d4Var.f18647e));
                            }
                        }
                        fA = h7.n.a(d4Var.f18650r, (-d4Var.f18648f) + d4Var.f18647e, (d4Var.getHeight() - d4Var.f18648f) + d4Var.f18647e);
                        d4Var.f18650r = fA;
                        if (d4Var.F) {
                            d4Var.f18650r = Math.min(fA, (-d4Var.f18648f) + d4Var.f18647e);
                        }
                        d4Var.c();
                    }
                } else if (d4Var.f18646c) {
                    if (f12 < 0.0f) {
                        f13 = d4Var.f18650r;
                        if (f13 > (-d4Var.f18648f) + d4Var.f18647e && (w0Var2 = d4Var.f18653x) != null) {
                            scrollY = w0Var2.getScrollY() + f12;
                            org.telegram.ui.web.w0 w0Var9 = d4Var.f18653x;
                            w0Var9.setScrollY((int) h7.n.a(scrollY, 0.0f, Math.max(w0Var9.getContentHeight(), d4Var.f18653x.getHeight()) - d4Var.f18647e));
                            if (scrollY < 0.0f) {
                                d4Var.f18650r -= scrollY;
                            }
                        } else {
                            d4Var.f18650r = f13 - f12;
                        }
                    } else if (f12 > 0.0f) {
                        float f110 = d4Var.f18650r - f12;
                        d4Var.f18650r = f110;
                        w0Var = d4Var.f18653x;
                        if (w0Var != null && f110 < (-d4Var.f18648f) + d4Var.f18647e) {
                            float scrollY4 = w0Var.getScrollY() - ((d4Var.f18650r + d4Var.f18648f) - d4Var.f18647e);
                            org.telegram.ui.web.w0 w0Var10 = d4Var.f18653x;
                            w0Var10.setScrollY((int) h7.n.a(scrollY4, 0.0f, Math.max(w0Var10.getContentHeight(), d4Var.f18653x.getHeight()) - d4Var.f18647e));
                        }
                    }
                    fA = h7.n.a(d4Var.f18650r, (-d4Var.f18648f) + d4Var.f18647e, (d4Var.getHeight() - d4Var.f18648f) + d4Var.f18647e);
                    d4Var.f18650r = fA;
                    if (d4Var.F && !d4Var.H) {
                        d4Var.f18650r = Math.min(fA, (-d4Var.f18648f) + d4Var.f18647e);
                    }
                    d4Var.c();
                }
                return true;
            case 1:
                ir irVar = (ir) this.f18606c;
                if (irVar.f29474n || irVar.f29473f) {
                    float fAbs3 = Math.abs(f10);
                    float f20 = this.f18605b;
                    if (fAbs3 >= f20 || Math.abs(f11) >= f20) {
                        irVar.f29474n = false;
                        irVar.f29473f = false;
                        irVar.removeCallbacks(irVar.f29475r);
                        irVar.removeCallbacks(irVar.h);
                    }
                }
                return false;
            default:
                hg0 hg0Var = (hg0) this.f18606c;
                if (hg0Var.f29009e || hg0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (hg0Var.f29016y || hg0Var.f29007b != 1.0f || f10 > (-this.f18605b) || Math.abs(f10) < Math.abs(1.5f * f11)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!hg0Var.d(motionEvent3, hg0Var.getChildAt(hg0Var.f29007b > 0.5f ? 1 : 0))) {
                            hg0Var.f29009e = true;
                            MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i11 = 0; i11 < hg0Var.getChildCount(); i11++) {
                                hg0Var.getChildAt(i11).dispatchTouchEvent(motionEventObtain2);
                            }
                            motionEventObtain2.recycle();
                        }
                    }
                    hg0Var.h = true;
                }
                if (hg0Var.f29009e) {
                    hg0Var.f29008c = -1.0f;
                    hg0Var.f29007b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / hg0Var.getWidth()));
                    hg0Var.c(true);
                }
                return hg0Var.f29009e;
        }
    }
}
