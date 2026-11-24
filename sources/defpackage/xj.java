package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
public final class xj extends ViewOutlineProvider {
    public final byte a;

    public xj(byte b) {
        this.a = b;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), gm.L(6.0f) + view.getMeasuredHeight(), gm.L(6.0f));
                return;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), gm.L(29.0f) + view.getHeight(), gm.L(29.0f));
                return;
            case 2:
                int i = gm.u;
                outline.setOval(0, 0, i, i);
                return;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gm.L(18.0f));
                return;
            case 4:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gm.L(4.0f));
                return;
            case 5:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 6:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 7:
                outline.setRoundRect(gm.L(1.0f), gm.L(1.0f), view.getMeasuredWidth() - gm.L(1.0f), view.getMeasuredHeight() - gm.L(1.0f), gm.L(6.0f));
                return;
            case 8:
                outline.setOval(0, 0, gm.L(56.0f), gm.L(56.0f));
                return;
            case 9:
                outline.setOval(0, 0, gm.L(56.0f), gm.L(56.0f));
                return;
            case 10:
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(2131296593);
                if (imageReceiver != null) {
                    int[] z = imageReceiver.z();
                    int i2 = 0;
                    for (int i3 = 0; i3 < 4; i3++) {
                        i2 = Math.max(i2, z[i3]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i2);
                    return;
                }
                int i4 = gm.u;
                outline.setOval(0, 0, i4, i4);
                return;
            case 11:
                outline.setOval(0, 0, gm.L(120.0f), gm.L(120.0f));
                return;
            case 12:
                float L = gm.L(12.0f);
                outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + L), L);
                return;
            case 13:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), gm.L(12.0f));
                return;
            case 14:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gm.L(22.0f));
                return;
            case 15:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gm.L(22.0f));
                return;
            case 16:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gm.L(22.0f));
                return;
            case 17:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gm.L(22.0f));
                return;
            case 18:
                outline.setRoundRect(0, gm.L(50.0f), view.getWidth(), gm.L(24.0f) + view.getHeight(), gm.L(24.0f));
                return;
            case 19:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), gm.L(6.0f));
                return;
            case 20:
                outline.setRoundRect(0, 0, gm.L(24.0f) + view.getWidth(), view.getHeight(), gm.L(24.0f));
                return;
            case 21:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 22:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * gm.L(4.0f));
                return;
        }
    }
}
