package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
public final class yi extends ViewOutlineProvider {
    public final byte a;

    public yi(byte b) {
        this.a = b;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), hl.L(6.0f) + view.getMeasuredHeight(), hl.L(6.0f));
                return;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), hl.L(29.0f) + view.getHeight(), hl.L(29.0f));
                return;
            case 2:
                int i = hl.u;
                outline.setOval(0, 0, i, i);
                return;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), hl.L(18.0f));
                return;
            case 4:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), hl.L(4.0f));
                return;
            case 5:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 6:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 7:
                outline.setRoundRect(hl.L(1.0f), hl.L(1.0f), view.getMeasuredWidth() - hl.L(1.0f), view.getMeasuredHeight() - hl.L(1.0f), hl.L(6.0f));
                return;
            case 8:
                outline.setOval(0, 0, hl.L(56.0f), hl.L(56.0f));
                return;
            case 9:
                outline.setOval(0, 0, hl.L(56.0f), hl.L(56.0f));
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
                int i4 = hl.u;
                outline.setOval(0, 0, i4, i4);
                return;
            case 11:
                float L = hl.L(12.0f);
                outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + L), L);
                return;
            case 12:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), hl.L(12.0f));
                return;
            case 13:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), hl.L(22.0f));
                return;
            case 14:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), hl.L(22.0f));
                return;
            case 15:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), hl.L(22.0f));
                return;
            case 16:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), hl.L(22.0f));
                return;
            case 17:
                outline.setRoundRect(0, hl.L(50.0f), view.getWidth(), hl.L(24.0f) + view.getHeight(), hl.L(24.0f));
                return;
            case 18:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), hl.L(6.0f));
                return;
            case 19:
                outline.setRoundRect(0, 0, hl.L(24.0f) + view.getWidth(), view.getHeight(), hl.L(24.0f));
                return;
            case 20:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 21:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * hl.L(4.0f));
                return;
        }
    }
}
