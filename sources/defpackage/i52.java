package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
public final class i52 extends d79 {
    public final byte f3;
    public final ChatAttachAlertPhotoLayout g3;

    public i52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.f3 = b;
        this.g3 = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.g3.b.Y3[0] - hl.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.f3) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer.q0().r();
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.g3.b.Y3[0] - hl.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f3) {
            case 0:
                if (!this.g3.K0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }
}
