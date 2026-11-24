package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.ui.PhotoViewer;
public final class jh3 extends ky1 {
    public final byte y0 = 0;
    public final Object z0;

    public jh3(df9 df9Var, Context context, wjb wjbVar) {
        super(2131232699, wjbVar, context, true);
        this.z0 = df9Var;
    }

    @Override
    public final boolean b() {
        switch (this.y0) {
            case 0:
            case 1:
                return false;
            case 2:
                return ((hd9) this.z0).h0();
            default:
                return super.b();
        }
    }

    @Override
    public final boolean d() {
        byte b = this.y0;
        Object obj = this.z0;
        switch (b) {
            case 0:
            case 1:
                return true;
            case 2:
                if (!((hd9) obj).M0 && this.w <= 0) {
                    return false;
                }
                return true;
            case 3:
                if (!((df9) obj).a0 && this.w <= 0) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int getFillColor() {
        byte b = this.y0;
        Object obj = this.z0;
        switch (b) {
            case 1:
                int i = bkb.pg;
                Drawable[] drawableArr = PhotoViewer.d9;
                return ((PhotoViewer) obj).y0(i);
            case 4:
                return bkb.v0(bkb.R5, ((taa) obj).J0);
            default:
                return super.getFillColor();
        }
    }

    @Override
    public final boolean j() {
        switch (this.y0) {
            case 0:
            case 1:
            case 4:
                return true;
            case 2:
            case 3:
            default:
                return super.j();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.y0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(k96.G(((cj3) this.z0).K2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public jh3(hd9 hd9Var, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context, true);
        this.z0 = hd9Var;
    }

    public jh3(taa taaVar, Context context, wjb wjbVar) {
        super(2131232699, wjbVar, context, false);
        this.z0 = taaVar;
    }

    public jh3(cj3 cj3Var, Context context, wjb wjbVar) {
        super(2131232699, wjbVar, context, false);
        this.z0 = cj3Var;
    }

    public jh3(PhotoViewer photoViewer, Context context, wjb wjbVar) {
        super(2131232699, wjbVar, context, false);
        this.z0 = photoViewer;
    }
}
