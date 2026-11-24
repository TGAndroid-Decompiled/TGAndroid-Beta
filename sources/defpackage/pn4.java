package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
public final class pn4 extends ry8 {
    public boolean r;
    public boolean s;
    public final on4 w;
    public final on4 x;
    public final FragmentContextView y;

    public pn4(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.y = fragmentContextView;
        this.w = new Runnable(this) {
            public final pn4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                int i;
                byte b = r2;
                pn4 pn4Var = this.b;
                switch (b) {
                    case 0:
                        FragmentContextView fragmentContextView2 = pn4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            oy8 oy8Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i = 15;
                            } else {
                                i = 29;
                            }
                            if (oy8Var.K(i)) {
                                boolean z = fragmentContextView2.P;
                                oy8 oy8Var2 = fragmentContextView2.E;
                                if (z) {
                                    oy8Var2.H(0);
                                } else {
                                    oy8Var2.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            bkb.E0().c(true);
                            fragmentContextView2.a.h(true);
                            return;
                        }
                        return;
                    default:
                        FragmentContextView fragmentContextView3 = pn4Var.y;
                        if (pn4Var.r && VoIPService.getSharedInstance() != null) {
                            pn4Var.r = false;
                            pn4Var.s = true;
                            fragmentContextView3.P = false;
                            gl.e3(pn4Var.w, 90L);
                            try {
                                fragmentContextView3.y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.x = new Runnable(this) {
            public final pn4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                int i;
                byte b = r2;
                pn4 pn4Var = this.b;
                switch (b) {
                    case 0:
                        FragmentContextView fragmentContextView2 = pn4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            oy8 oy8Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i = 15;
                            } else {
                                i = 29;
                            }
                            if (oy8Var.K(i)) {
                                boolean z = fragmentContextView2.P;
                                oy8 oy8Var2 = fragmentContextView2.E;
                                if (z) {
                                    oy8Var2.H(0);
                                } else {
                                    oy8Var2.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            bkb.E0().c(true);
                            fragmentContextView2.a.h(true);
                            return;
                        }
                        return;
                    default:
                        FragmentContextView fragmentContextView3 = pn4Var.y;
                        if (pn4Var.r && VoIPService.getSharedInstance() != null) {
                            pn4Var.r = false;
                            pn4Var.s = true;
                            fragmentContextView3.P = false;
                            gl.e3(pn4Var.w, 90L);
                            try {
                                fragmentContextView3.y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        if (this.y.P) {
            i = 2131742988;
        } else {
            i = 2131743051;
        }
        accessibilityNodeInfo.setText(k96.M0(i, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.y;
        int i = fragmentContextView.U;
        if (i != 3 && i != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        on4 on4Var = this.w;
        on4 on4Var2 = this.x;
        if (sharedInstance == null) {
            gl.r(on4Var2);
            gl.r(on4Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            gl.e3(on4Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gl.r(on4Var);
            if (this.r) {
                gl.r(on4Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.K(15)) {
                    boolean z = fragmentContextView.P;
                    oy8 oy8Var = fragmentContextView.E;
                    if (z) {
                        oy8Var.H(0);
                    } else {
                        oy8Var.H(14);
                    }
                }
                fragmentContextView.y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.s = false;
                bkb.E0().c(true);
                fragmentContextView.a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
