package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.webkit.PermissionRequest;
import java.util.Arrays;
public final class su0 implements vs2 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public su0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int b;
        byte b2 = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b2) {
            case 0:
                zu0 zu0Var = (zu0) obj4;
                PermissionRequest permissionRequest = (PermissionRequest) obj3;
                String[] strArr = (String[]) obj2;
                Boolean bool = (Boolean) obj;
                if (zu0Var.a != null) {
                    zu0Var.a = null;
                    if (bool.booleanValue()) {
                        su0 su0Var = new su0(zu0Var, permissionRequest, strArr, (byte) 1);
                        boolean z = hv0.R0;
                        zu0Var.e.R.R(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, su0Var);
                        return;
                    }
                    permissionRequest.deny();
                    return;
                }
                return;
            case 1:
                zu0 zu0Var2 = (zu0) obj4;
                PermissionRequest permissionRequest2 = (PermissionRequest) obj3;
                String[] strArr2 = (String[]) obj2;
                if (((Boolean) obj).booleanValue()) {
                    permissionRequest2.grant(new String[]{strArr2[0], strArr2[1]});
                    zu0Var2.e.R.U = true;
                    return;
                }
                permissionRequest2.deny();
                return;
            default:
                Path path = (Path) obj3;
                float[] fArr = (float[]) obj2;
                Canvas canvas = (Canvas) obj;
                t98 t98Var = ((ei8) obj4).e;
                View pressedChildView = t98Var.getPressedChildView();
                if (pressedChildView == null) {
                    b = -1;
                } else {
                    b = t98Var.T(pressedChildView).b();
                }
                path.rewind();
                Rect selectorRect = t98Var.getSelectorRect();
                RectF rectF = gl.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                Arrays.fill(fArr, 0.0f);
                if (b == 0) {
                    Arrays.fill(fArr, 0, 4, gl.L(12.0f));
                }
                if (b == t98Var.getAdapter().b() - 1) {
                    Arrays.fill(fArr, 4, 8, gl.L(12.0f));
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                return;
        }
    }
}
