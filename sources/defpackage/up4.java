package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
public final class up4 extends e29 {
    public boolean r;
    public boolean s;
    public final tp4 w;
    public final tp4 x;
    public final FragmentContextView y;

    public up4(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.y = fragmentContextView;
        this.w = new Runnable(this) {
            public final up4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                int i;
                byte b = r2;
                up4 up4Var = this.b;
                switch (b) {
                    case 0:
                        FragmentContextView fragmentContextView2 = up4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            b29 b29Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i = 15;
                            } else {
                                i = 29;
                            }
                            if (b29Var.K(i)) {
                                boolean z = fragmentContextView2.P;
                                b29 b29Var2 = fragmentContextView2.E;
                                if (z) {
                                    b29Var2.H(0);
                                } else {
                                    b29Var2.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            aob.E0().c(true);
                            fragmentContextView2.a.h(true);
                            return;
                        }
                        return;
                    default:
                        FragmentContextView fragmentContextView3 = up4Var.y;
                        if (up4Var.r && VoIPService.getSharedInstance() != null) {
                            up4Var.r = false;
                            up4Var.s = true;
                            fragmentContextView3.P = false;
                            hl.d3(up4Var.w, 90L);
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
            public final up4 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                int i;
                byte b = r2;
                up4 up4Var = this.b;
                switch (b) {
                    case 0:
                        FragmentContextView fragmentContextView2 = up4Var.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            b29 b29Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i = 15;
                            } else {
                                i = 29;
                            }
                            if (b29Var.K(i)) {
                                boolean z = fragmentContextView2.P;
                                b29 b29Var2 = fragmentContextView2.E;
                                if (z) {
                                    b29Var2.H(0);
                                } else {
                                    b29Var2.H(14);
                                }
                            }
                            fragmentContextView2.y.d();
                            aob.E0().c(true);
                            fragmentContextView2.a.h(true);
                            return;
                        }
                        return;
                    default:
                        FragmentContextView fragmentContextView3 = up4Var.y;
                        if (up4Var.r && VoIPService.getSharedInstance() != null) {
                            up4Var.r = false;
                            up4Var.s = true;
                            fragmentContextView3.P = false;
                            hl.d3(up4Var.w, 90L);
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
            i = 2131742882;
        } else {
            i = 2131742945;
        }
        accessibilityNodeInfo.setText(ob6.M0(i, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.y;
        int i = fragmentContextView.U;
        if (i != 3 && i != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        tp4 tp4Var = this.w;
        tp4 tp4Var2 = this.x;
        if (sharedInstance == null) {
            hl.r(tp4Var2);
            hl.r(tp4Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            hl.d3(tp4Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hl.r(tp4Var);
            if (this.r) {
                hl.r(tp4Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.K(15)) {
                    boolean z = fragmentContextView.P;
                    b29 b29Var = fragmentContextView.E;
                    if (z) {
                        b29Var.H(0);
                    } else {
                        b29Var.H(14);
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
                aob.E0().c(true);
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
