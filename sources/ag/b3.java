package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;

public final class b3 extends View {

    public final c3 f311a;

    public b3(c3 c3Var, Context context) {
        super(context);
        this.f311a = c3Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        float f10;
        float f11;
        super.draw(canvas);
        c3 c3Var = this.f311a;
        w1 w1Var = c3Var.v;
        ImageReceiver imageReceiver2 = c3Var.f321c;
        ImageReceiver imageReceiver3 = c3Var.d;
        if (c3Var.f326s) {
            imageReceiver2.setImage(ImageLocation.getForDocument(c3Var.f325r), null, DocumentObject.getSvgThumb(c3Var.f325r, g6.f22999a7, 0.5f), "webp", null, 1);
            if (MessageObject.isPremiumSticker(c3Var.f325r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(c3Var.f325r), c3Var.f325r), "140_140", (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
            } else {
                imageReceiver = imageReceiver3;
            }
        } else {
            imageReceiver = imageReceiver3;
        }
        if (c3Var.f322e) {
            if (c3Var.h == 0.0f) {
                c3Var.h = 1.0f;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, false);
                }
            }
            if (imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().start();
            }
            if (imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().y() && w1Var.f343j3) {
                AndroidUtilities.cancelRunOnUIThread(w1Var.a3);
                AndroidUtilities.runOnUIThread(w1Var.a3, 0L);
            }
        } else if (imageReceiver.getLottieAnimation() != null) {
            imageReceiver.getLottieAnimation().stop();
        }
        if (c3Var.f323f) {
            if (imageReceiver2.getLottieAnimation() != null) {
                imageReceiver2.getLottieAnimation().start();
            }
        } else if (imageReceiver2.getLottieAnimation() != null) {
            imageReceiver2.getLottieAnimation().stop();
        }
        boolean z10 = c3Var.f323f;
        if (z10) {
            float f12 = c3Var.f324n;
            if (f12 != 1.0f) {
                c3Var.f324n = f12 + 0.10666667f;
                invalidate();
            } else if (!z10) {
                f10 = c3Var.f324n;
                if (f10 != 0.0f) {
                    c3Var.f324n = f10 - 0.10666667f;
                    invalidate();
                }
            }
        } else if (!z10) {
            f10 = c3Var.f324n;
            if (f10 != 0.0f) {
                c3Var.f324n = f10 - 0.10666667f;
                invalidate();
            }
        }
        c3Var.f324n = Utilities.clamp(c3Var.f324n, 1.0f, 0.0f);
        boolean z11 = c3Var.f322e;
        if (z11) {
            float f13 = c3Var.h;
            if (f13 != 1.0f) {
                c3Var.h = f13 + 0.10666667f;
                invalidate();
            } else if (!z11) {
                f11 = c3Var.h;
                if (f11 != 0.0f) {
                    c3Var.h = f11 - 0.10666667f;
                    invalidate();
                }
            }
        } else if (!z11) {
            f11 = c3Var.h;
            if (f11 != 0.0f) {
                c3Var.h = f11 - 0.10666667f;
                invalidate();
            }
        }
        c3Var.h = Utilities.clamp(c3Var.h, 1.0f, 0.0f);
        float f14 = w1Var.f340g3 * 0.45f;
        float f15 = 1.499267f * f14;
        float measuredWidth = getMeasuredWidth() - f15;
        float measuredHeight = (getMeasuredHeight() - f15) / 2.0f;
        float f16 = f15 - f14;
        imageReceiver2.setImageCoords((f16 - (0.02f * f15)) + measuredWidth, (f16 / 2.0f) + measuredHeight, f14, f14);
        imageReceiver2.setAlpha((c3Var.f324n * 0.7f) + 0.3f);
        imageReceiver2.draw(canvas);
        if (c3Var.h != 0.0f) {
            imageReceiver.setImageCoords(measuredWidth, measuredHeight, f15, f15);
            imageReceiver.setAlpha(c3Var.h);
            imageReceiver.draw(canvas);
        }
    }
}
