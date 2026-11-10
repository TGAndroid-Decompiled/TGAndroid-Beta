package bg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
public final class q0 extends ViewOutlineProvider {
    public final int f3367a;

    public q0(int i7) {
        this.f3367a = i7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f3367a) {
            case 0:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                return;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), org.telegram.messenger.g0.L(29.0f) + view.getHeight(), org.telegram.messenger.g0.L(29.0f));
                return;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.g0.L(18.0f));
                return;
            case 4:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.g0.L(22.0f));
                return;
            case 5:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.g0.L(22.0f));
                return;
            case 6:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.g0.L(22.0f));
                return;
            case 7:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.g0.L(22.0f));
                return;
            case 8:
                outline.setRoundRect(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), view.getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), view.getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(6.0f));
                return;
            case 9:
                int i7 = org.telegram.messenger.g0.f22571u;
                outline.setOval(0, 0, i7, i7);
                return;
            case 10:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f) + view.getMeasuredHeight(), org.telegram.messenger.g0.L(6.0f));
                return;
            case 11:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 12:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 13:
                outline.setOval(0, 0, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f));
                return;
            case 14:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.g0.L(12.0f));
                return;
            case 15:
                outline.setRoundRect(0, org.telegram.messenger.g0.L(50.0f), view.getWidth(), org.telegram.messenger.g0.L(24.0f) + view.getHeight(), org.telegram.messenger.g0.L(24.0f));
                return;
            case 16:
                outline.setRoundRect(0, 0, org.telegram.messenger.g0.L(24.0f) + view.getWidth(), view.getHeight(), org.telegram.messenger.g0.L(24.0f));
                return;
            case 17:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.g0.L(4.0f));
                return;
            case 18:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * org.telegram.messenger.g0.L(4.0f));
                return;
            case 19:
                outline.setOval(0, 0, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
                return;
            case 20:
                outline.setOval(0, 0, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
                return;
            case 21:
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(2131296591);
                if (imageReceiver != null) {
                    int[] E = imageReceiver.E();
                    int i10 = 0;
                    for (int i11 = 0; i11 < 4; i11++) {
                        i10 = Math.max(i10, E[i11]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i10);
                    return;
                }
                int i12 = org.telegram.messenger.g0.f22571u;
                outline.setOval(0, 0, i12, i12);
                return;
            case 22:
                float L = org.telegram.messenger.g0.L(12.0f);
                outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + L), L);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.g0.L(6.0f));
                return;
        }
    }
}
