package bi;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
public final class d2 extends ViewOutlineProvider {
    public final int f2918a;

    public d2(int i10) {
        this.f2918a = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f2918a) {
            case 0:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(22.0f));
                return;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(22.0f));
                return;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(22.0f));
                return;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(22.0f));
                return;
            case 4:
                float L = org.telegram.messenger.i0.L(12.0f);
                outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + L), L);
                return;
            case 5:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.i0.L(6.0f));
                return;
            case 6:
                outline.setRoundRect(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), view.getMeasuredWidth() - org.telegram.messenger.i0.L(1.0f), view.getMeasuredHeight() - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(6.0f));
                return;
            case 7:
                int i10 = org.telegram.messenger.i0.f16030u;
                outline.setOval(0, 0, i10, i10);
                return;
            case 8:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), org.telegram.messenger.i0.L(6.0f) + view.getMeasuredHeight(), org.telegram.messenger.i0.L(6.0f));
                return;
            case 9:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), org.telegram.messenger.i0.L(6.0f) + view.getMeasuredHeight(), org.telegram.messenger.i0.N(6.0f));
                return;
            case 10:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), org.telegram.messenger.i0.L(6.0f) + view.getMeasuredHeight(), org.telegram.messenger.i0.N(6.0f));
                return;
            case 11:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 12:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 13:
                outline.setOval(0, 0, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f));
                return;
            case 14:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.i0.L(12.0f));
                return;
            case 15:
                outline.setRoundRect(0, org.telegram.messenger.i0.L(50.0f), view.getWidth(), org.telegram.messenger.i0.L(24.0f) + view.getHeight(), org.telegram.messenger.i0.L(24.0f));
                return;
            case 16:
                outline.setRoundRect(0, 0, org.telegram.messenger.i0.L(24.0f) + view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(24.0f));
                return;
            case 17:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.i0.L(10.0f));
                return;
            case 18:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * org.telegram.messenger.i0.L(4.0f));
                return;
            case 19:
                outline.setOval(0, 0, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f));
                return;
            case 20:
                outline.setOval(0, 0, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f));
                return;
            case 21:
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(2131296591);
                if (imageReceiver != null) {
                    int[] E = imageReceiver.E();
                    int i11 = 0;
                    for (int i12 = 0; i12 < 4; i12++) {
                        i11 = Math.max(i11, E[i12]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i11);
                    return;
                }
                int i13 = org.telegram.messenger.i0.f16030u;
                outline.setOval(0, 0, i13, i13);
                return;
            case 22:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 23:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                return;
            case 24:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.i0.L(10.0f));
                return;
            case 25:
                outline.setRoundRect(0, 0, view.getWidth(), org.telegram.messenger.i0.L(29.0f) + view.getHeight(), org.telegram.messenger.i0.L(29.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(18.0f));
                return;
        }
    }
}
