package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
public final class rp4 extends s09 {
    public boolean r;
    public boolean s;
    public final qp4 w;
    public final qp4 x;
    public final FragmentContextView y;

    public rp4(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.y = fragmentContextView;
        this.w = new Runnable(this) {
            public final rp4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                int i;
                byte b = r2;
                rp4 rp4Var = this.b;
                switch (b) {
                    case 0:
                        FragmentContextView fragmentContextView2 = rp4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            p09 p09Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i = 15;
                            } else {
                                i = 29;
                            }
                            if (p09Var.K(i)) {
                                boolean z = fragmentContextView2.P;
                                p09 p09Var2 = fragmentContextView2.E;
                                if (z) {
                                    p09Var2.H(0);
                                } else {
                                    p09Var2.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            cmb.E0().c(true);
                            fragmentContextView2.a.h(true);
                            return;
                        }
                        return;
                    default:
                        FragmentContextView fragmentContextView3 = rp4Var.y;
                        if (rp4Var.r && VoIPService.getSharedInstance() != null) {
                            rp4Var.r = false;
                            rp4Var.s = true;
                            fragmentContextView3.P = false;
                            gm.d3(rp4Var.w, 90L);
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
            public final rp4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                int i;
                byte b = r2;
                rp4 rp4Var = this.b;
                switch (b) {
                    case 0:
                        FragmentContextView fragmentContextView2 = rp4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            p09 p09Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i = 15;
                            } else {
                                i = 29;
                            }
                            if (p09Var.K(i)) {
                                boolean z = fragmentContextView2.P;
                                p09 p09Var2 = fragmentContextView2.E;
                                if (z) {
                                    p09Var2.H(0);
                                } else {
                                    p09Var2.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            cmb.E0().c(true);
                            fragmentContextView2.a.h(true);
                            return;
                        }
                        return;
                    default:
                        FragmentContextView fragmentContextView3 = rp4Var.y;
                        if (rp4Var.r && VoIPService.getSharedInstance() != null) {
                            rp4Var.r = false;
                            rp4Var.s = true;
                            fragmentContextView3.P = false;
                            gm.d3(rp4Var.w, 90L);
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
            i = 2131742914;
        } else {
            i = 2131742977;
        }
        accessibilityNodeInfo.setText(jb6.M0(i, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.y;
        int i = fragmentContextView.U;
        if (i != 3 && i != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        qp4 qp4Var = this.w;
        qp4 qp4Var2 = this.x;
        if (sharedInstance == null) {
            gm.r(qp4Var2);
            gm.r(qp4Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            gm.d3(qp4Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gm.r(qp4Var);
            if (this.r) {
                gm.r(qp4Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.K(15)) {
                    boolean z = fragmentContextView.P;
                    p09 p09Var = fragmentContextView.E;
                    if (z) {
                        p09Var.H(0);
                    } else {
                        p09Var.H(14);
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
                cmb.E0().c(true);
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
